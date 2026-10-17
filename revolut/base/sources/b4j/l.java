package b4j;

import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Currency;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$RouteSelector;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public i4j.g A;
    public wi0.b B;
    public i4j.h C;
    public xi0.b D;
    public Field$Country E;
    public Field$Currency F;
    public Field$RouteSelector G;
    public /* synthetic */ Object H;
    public final /* synthetic */ m I;
    public int J;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f12410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f12411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BeneficiaryRouteType.PaymentVendorType f12412y;
    public u2j.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.I = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.H = obj2;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, null, null, null, null, this);
    }
}
