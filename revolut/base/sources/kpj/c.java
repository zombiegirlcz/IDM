package kpj;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import d3c.m0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import ngm.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, n.class, "toFiscalProfileDetails", "toFiscalProfileDetails(Lcom/revolut/feature/core/model/domain/user/User;)Lcom/revolut/feature/revolut_shop/api/domain/model/FiscalProfileDetails;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wi0.b bVarA;
        String country;
        do3.n p0 = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        Address address = p0.k;
        if (address == null || (country = address.getCountry()) == null) {
            bVarA = null;
        } else {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(country);
        }
        Address address2 = p0.k;
        wi0.b.Companion.getClass();
        return new FiscalProfileDetails(address2, Intrinsics.f(bVarA, wi0.b.f297756l) ? m0.ABN : (Intrinsics.f(bVarA, wi0.b.J2) || Intrinsics.f(bVarA, wi0.b.l2)) ? m0.GST : m0.VAT, bVarA);
    }
}
