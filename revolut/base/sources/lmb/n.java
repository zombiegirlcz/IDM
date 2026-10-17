package lmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a f196929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SavingsAccountCreationContract$ModalStep f196930c;

    public /* synthetic */ n(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar, SavingsAccountCreationContract$ModalStep savingsAccountCreationContract$ModalStep, int i) {
        this.f196928a = i;
        this.f196929b = aVar;
        this.f196930c = savingsAccountCreationContract$ModalStep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f196928a) {
            case 0:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar = this.f196929b;
                aVar.l2(new lb0.b0(aVar, ((SavingsAccountCreationContract$ModalStep.ChallengePrompt) this.f196930c).f83306b, (Continuation) null, 22), new yi5.b(26));
                break;
            default:
                this.f196929b.K2(((SavingsAccountCreationContract$ModalStep.PostCreationWorkflow) this.f196930c).f83309b);
                break;
        }
        return Unit.f186387a;
    }
}
