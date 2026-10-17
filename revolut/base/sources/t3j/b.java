package t3j;

import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import i4j.h;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public ExpansionFieldDefinition A;
    public d B;
    public Field$Country C;
    public Field$Currency D;
    public Field$RouteSelector E;
    public /* synthetic */ Object F;
    public final /* synthetic */ c G;
    public int H;
    public BeneficiaryInfoState u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f267808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f267809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public xi0.b f267810y;
    public u2j.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.G = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.F = obj2;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, null, this);
    }
}
