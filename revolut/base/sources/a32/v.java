package a32;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f1040w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0 a0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1040w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f1040w, continuation, 0);
            case 1:
                return new v(this.f1040w, continuation, 1);
            default:
                return new v(this.f1040w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        int i = this.u;
        a0 a0Var = this.f1040w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    f fVar = a0Var.f1008p;
                    this.v = 1;
                    objA = fVar.a(this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                a0Var.H2(a0Var.f1012t, new a0.c((z22.a) objA, 12));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z22.a aVarK2 = a0Var.K2();
                    this.v = 1;
                    if (a0.I2(a0Var, aVarK2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                a0 a0Var2 = this.f1040w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    f12.a aVar4 = a0Var2.f1009q;
                    ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = a0Var2.o.f62317c;
                    this.v = 1;
                    Object objD = ((sh2.f) aVar4).f263398l.d(ApmPaymentAuthorisationPaymentMethod.WERO, apmPaymentAuthorisationPendingAction, this);
                    if (objD != aVar3) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(a0Var2, a0Var2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.apm_payment_confirmation_status_title_rejected, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new x(a0Var2, null), 3);
        }
    }
}
