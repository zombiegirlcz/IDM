package v4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public BeneficiaryInfoState u;
    public Field$BackendDefinition.InputDefinition v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f286109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f286110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f286111y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f286110x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f286109w = obj2;
        this.f286111y |= Integer.MIN_VALUE;
        return this.f286110x.a(null, this);
    }
}
