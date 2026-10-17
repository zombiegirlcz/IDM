package e75;

import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p35.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f123075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable f123076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable loanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f123075w = oVar;
        this.f123076x = loanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f123075w, this.f123076x, continuation, 0);
            default:
                return new n(this.f123075w, this.f123076x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    o oVar = this.f123075w;
                    l35.b bVar = oVar.f123077p;
                    String str = oVar.o.f70460a;
                    LoanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable loanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable = this.f123076x;
                    pfm.a aVarQ = ((y45.f) bVar).q(str, loanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable.f70453a, p0.DISABLED, loanPaymentSettingsHubControllerContract$AutoPayToggleParcel$Disable.f70454b);
                    this.v = 1;
                    if (nim.a.a(aVarQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = this.f123075w;
                    n nVar = new n(oVar2, this.f123076x, null, 0);
                    this.v = 1;
                    if (oVar2.p2(this, nVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
