package u3j;

import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import u2j.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public Field$Currency A;
    public Field$RouteSelector B;
    public /* synthetic */ Object C;
    public final /* synthetic */ b D;
    public int E;
    public BeneficiaryInfoState u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f276935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f276936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ExpansionFieldDefinition f276937y;
    public c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.D = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, this);
    }
}
