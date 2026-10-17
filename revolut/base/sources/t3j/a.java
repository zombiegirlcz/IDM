package t3j;

import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import i4j.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public d A;
    public Field$Country B;
    public Field$Currency C;
    public Field$RouteSelector D;
    public /* synthetic */ Object E;
    public final /* synthetic */ c F;
    public int G;
    public BeneficiaryInfoState u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f267805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f267806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u2j.d f267807y;
    public ExpansionFieldDefinition z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.F = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, this);
    }
}
