package ad4;

import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$State;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av3.f f3269b;

    public /* synthetic */ f(av3.f fVar, int i) {
        this.f3268a = i;
        this.f3269b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3268a) {
            case 0:
                CreditLinkedAccountsV2FlowContract$State creditLinkedAccountsV2FlowContract$State = (CreditLinkedAccountsV2FlowContract$State) obj2;
                boolean z = creditLinkedAccountsV2FlowContract$State.f67828b;
                creditLinkedAccountsV2FlowContract$State.getClass();
                return new CreditLinkedAccountsV2FlowContract$State(this.f3269b, z);
            default:
                CreditLinkedAccountsV3FlowContract$State creditLinkedAccountsV3FlowContract$State = (CreditLinkedAccountsV3FlowContract$State) obj2;
                boolean z3 = creditLinkedAccountsV3FlowContract$State.f67857b;
                creditLinkedAccountsV3FlowContract$State.getClass();
                return new CreditLinkedAccountsV3FlowContract$State(this.f3269b, z3);
        }
    }
}
