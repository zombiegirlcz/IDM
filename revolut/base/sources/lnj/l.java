package lnj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import dfj.r4;
import jck.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l7j.t;
import nii.c0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c f197282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f197282w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f197282w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f197282w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((r4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0Var;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = this.f197282w;
                cVar.H2(cVar.u, new t(data, cVar));
                return Unit.f186387a;
            default:
                r4 r4Var = (r4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar2 = this.f197282w;
                p pVar = cVar2.f101457q;
                r4.b bVar = r4.b.f114092a;
                boolean zF = Intrinsics.f(r4Var, bVar);
                if (Intrinsics.f(r4Var, bVar)) {
                    pVar.getClass();
                    y0Var = new y0("ID_LOADING_DIALOG", new c0(new TextLocalisedClause(R$string.esim_refund_status_processing_title, null, null, 14), null, null, false, null, false, false, null, 1918), false, 4);
                } else if (Intrinsics.f(r4Var, r4.c.f114093a)) {
                    pVar.getClass();
                    y0Var = new y0("ID_PENDING_DIALOG", new g0(new TextLocalisedClause(R$string.esim_refund_status_pending_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_status_pending_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4);
                } else if (Intrinsics.f(r4Var, r4.d.f114094a)) {
                    pVar.getClass();
                    y0Var = new y0("ID_GENERAL_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.esim_refund_status_failure_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_status_failure_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                } else if (Intrinsics.f(r4Var, r4.e.f114095a)) {
                    pVar.getClass();
                    y0Var = new y0("ID_TOKEN_EXPIRATION_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.esim_refund_status_token_expired_title, null, null, 14), new TextLocalisedClause(R$string.esim_refund_status_token_expired_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_installation_dialog_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                } else {
                    if (!Intrinsics.f(r4Var, r4.a.f114091a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar.getClass();
                    y0Var = new y0("ID_SUCCESS_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.esim_refund_status_succeed_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4);
                }
                yji.l.a1(cVar2, cVar2.X1(y0Var), null, null, new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.b(y0Var, cVar2, null), 3);
                cVar2.H2(cVar2.u, new y(zF, 27));
                return Unit.f186387a;
        }
    }
}
