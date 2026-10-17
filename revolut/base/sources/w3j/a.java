package w3j;

import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import u2j.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public final /* synthetic */ b A;
    public int B;
    public BeneficiaryInfoState u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ExpansionFieldDefinition f294409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f294410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Field$RouteSelector f294411y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, null, this);
    }
}
