package b4j;

import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public Field$Country A;
    public Field$Currency B;
    public Field$ExpansionDefinition C;
    public Field$RouteSelector D;
    public /* synthetic */ Object E;
    public final /* synthetic */ i F;
    public int G;
    public BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency u;
    public i4j.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f12398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i4j.h f12399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public xi0.b f12400y;
    public ExpansionFieldDefinition z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.F = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
