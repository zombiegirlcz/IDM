package b4j;

import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public u2j.d A;
    public i4j.g B;
    public wi0.b C;
    public i4j.h D;
    public xi0.b E;
    public Field$Country F;
    public Field$Currency G;
    public Field$RouteSelector H;
    public /* synthetic */ Object I;
    public final /* synthetic */ k J;
    public int K;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f12405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f12406y;
    public BeneficiaryRouteType.MobileWallet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.J = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.I = obj2;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, null, null, null, null, null, null, null, this);
    }
}
