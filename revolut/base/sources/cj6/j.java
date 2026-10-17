package cj6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.q;
import efm.d0;
import he4.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import rfm.f0;
import te0.w;
import vkm.j2;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f24616w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f24616w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f24616w, continuation, 0);
            default:
                return new j(this.f24616w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objT;
        switch (this.u) {
            case 0:
                n nVar = this.f24616w;
                OpenBankingFundsConfirmationScreenContract$InputData openBankingFundsConfirmationScreenContract$InputData = nVar.o;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                oe6.m mVar = nVar.f24618p;
                String str = openBankingFundsConfirmationScreenContract$InputData.e;
                String str2 = openBankingFundsConfirmationScreenContract$InputData.d;
                String str3 = openBankingFundsConfirmationScreenContract$InputData.f72527b;
                String strL = str3 != null ? m70.a.l(str3) : null;
                String str4 = openBankingFundsConfirmationScreenContract$InputData.f72526a;
                String strL2 = str4 != null ? m70.a.l(str4) : null;
                ri6.d dVar = ((d) ((j2) nVar.f24621s.f22677a).getValue()).f24609a;
                List listL = v.l(dVar != null ? dVar.f254562a.f163145a : null);
                String strL3 = null;
                String str5 = strL2;
                String str6 = openBankingFundsConfirmationScreenContract$InputData.f72528c;
                String str7 = openBankingFundsConfirmationScreenContract$InputData.f;
                if (str7 != null) {
                    strL3 = m70.a.l(str7);
                }
                x61.h model = new x61.h(str, str2, strL, str5, str6, listL, strL3);
                mg6.c cVar = (mg6.c) mVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                pfm.a aVarR = cVar.f205161b.r(new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"));
                hf6.i iVar = (hf6.i) cVar.f205160a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                d0<if6.j> d0VarAuthorizeFunds = iVar.f151760a.authorizeFunds(uj3.b.B(model), new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"));
                hae.k kVar = new hae.k(new r(14), 14);
                d0VarAuthorizeFunds.getClass();
                ufm.i iVar2 = new ufm.i(d0VarAuthorizeFunds, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                f0 f0VarF = aVarR.f(w.i0(iVar2));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                this.v = 1;
                Object objB = nim.a.b(f0VarF, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                n nVar2 = this.f24616w;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar = new j(nVar2, continuation, 0);
                    this.v = 1;
                    objT = q.t(nVar2, jVar, this);
                    if (objT == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objT = obj2;
                }
                String str8 = (String) objT;
                Intrinsics.h(str8);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.oba_authorize_accounts_success_title, null, null, 14);
                int i3 = R$string.oba_authorize_accounts_success_subtitle;
                ei6.d dVar2 = ((d) ((j2) nVar2.f24621s.f22677a).getValue()).f24610b;
                String str9 = dVar2 != null ? dVar2.f126446a : null;
                if (str9 == null) {
                    str9 = "";
                }
                yji.l.a1(nVar2, nVar2.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i3, u.c(str9), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R.string.common_action_continue, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, null, new cbh.g(nVar2, str8, continuation, 24), 3);
                return Unit.f186387a;
        }
    }
}
