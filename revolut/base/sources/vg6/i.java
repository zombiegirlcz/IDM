package vg6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import nii.j0;
import nii.u1;
import nii.y0;
import vc2.s;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objQ;
        k kVar = this.v;
        LinkResultFlowContract$InputData linkResultFlowContract$InputData = kVar.o;
        yki.a aVar = kVar.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            c0 c0Var = new c0(new TextLocalisedClause(R$string.external_institutions_linking_in_progress_title, null, null, 14), null, null, false, null, false, false, null, 1918);
            up4.h hVar = new up4.h(3);
            s sVar = new s(kVar, continuation, 10);
            this.u = 1;
            objQ = n14.k.Q(kVar, c0Var, null, hVar, sVar, this, 2);
            if (objQ == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objQ = obj2;
        }
        nii.e eVar = (nii.e) objQ;
        if (eVar instanceof nii.c) {
            Throwable th10 = ((nii.c) eVar).f216123a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            oki.h.D2(aVar);
            return Unit.f186387a;
        }
        if (!(eVar instanceof nii.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = (Pair) ((nii.d) eVar).f216133a;
        String str = (String) pair.f186385a;
        String str2 = (String) pair.f186386b;
        if (str2 == null) {
            kVar.J2();
            return Unit.f186387a;
        }
        NaviCommand naviCommand = linkResultFlowContract$InputData.e;
        if (naviCommand != null || (linkResultFlowContract$InputData.d instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.OpenBanking)) {
            if (naviCommand != null) {
                yji.l.a1(kVar, kVar.X1(new y0(null, linkResultFlowContract$InputData.f72423c ? new j0((Clause) new TextLocalisedClause(R$string.external_institutions_renew_success_title, u.c(str), null, 12), (Clause) new TextLocalisedClause(R$string.external_institutions_renew_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092) : new j0((Clause) new TextLocalisedClause(R$string.external_institutions_linking_success_title, u.c(str), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new uwe.f(new vd1.a(kVar, str2, 6), continuation, 28), 3);
            } else {
                kVar.l2(new v06.i(kVar, str2, continuation, 29), new yi5.b(26));
            }
            return Unit.f186387a;
        }
        oki.h.D2(aVar);
        q qVar = kVar.f288771r;
        ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase = linkResultFlowContract$InputData.d;
        qVar.getClass();
        return kVar.C1(q.a(useCase));
    }
}
