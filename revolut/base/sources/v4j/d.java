package v4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState;
import n61.p;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public int A;
    public BeneficiaryCreationFlowContract$CreationProcessState u;
    public n61.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f286103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BeneficiaryInfoState f286104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f286105y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f286105y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
