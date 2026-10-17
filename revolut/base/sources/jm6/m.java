package jm6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import j54.v0;
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
import yhm.o;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.link_external.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f176487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f176488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f176487w = z;
        this.f176488x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f176487w, this.f176488x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objQ;
        com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar;
        m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        int i2 = 1;
        com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            c0 c0Var = new c0(new TextLocalisedClause(R$string.external_institutions_linking_in_progress_title, null, null, 14), null, null, false, null, false, false, null, 1918);
            up4.h hVar = new up4.h(3);
            v0 v0Var = new v0(bVar2, this.f176488x, null);
            this.u = 1;
            objQ = n14.k.Q(bVar2, c0Var, null, hVar, v0Var, this, 2);
            bVar = bVar2;
            mVar = this;
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            bVar = bVar2;
            mVar = this;
            objQ = obj2;
        }
        nii.e eVar = (nii.e) objQ;
        if (eVar instanceof nii.c) {
            Throwable th10 = ((nii.c) eVar).f216123a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            bVar.M2();
        } else {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair = (Pair) ((nii.d) eVar).f216133a;
            String str = (String) pair.f186385a;
            if (((String) pair.f186386b) == null) {
                bVar.M2();
            } else {
                yji.l.a1(bVar, bVar.X1(new y0(null, mVar.f176487w ? new j0((Clause) new TextLocalisedClause(R$string.external_institutions_renew_success_title, u.c(str), null, 12), (Clause) new TextLocalisedClause(R$string.external_institutions_renew_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092) : new j0((Clause) new TextLocalisedClause(R$string.external_institutions_linking_success_title, u.c(str), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new jkc.g(new jj2.a(bVar, 5), continuation, i2), 3);
            }
        }
        return Unit.f186387a;
    }
}
