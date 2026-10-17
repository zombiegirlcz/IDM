package s3j;

import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public e A;
    public s4j.b B;
    public Field$RouteSelector C;
    public Field$ExpansionDefinition D;
    public /* synthetic */ Object E;
    public final /* synthetic */ d F;
    public int G;
    public BeneficiaryInfoState u;
    public u2j.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f259699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wi0.b f259700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ExpansionFieldDefinition f259701y;
    public BeneficiaryRouteDetails z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.F = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, this);
    }
}
