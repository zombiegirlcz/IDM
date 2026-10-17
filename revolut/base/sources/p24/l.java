package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, n14.b.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/address/AddressResponseDto;)Lcom/revolut/feature/credit/application/plugins/api/models/address/AddressResponse;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        vz3.e p0 = (vz3.e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = n14.b.f211238a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new cu3.d(p0.getApplicationId(), p0.getExpiryInMinutes(), p0.getActive(), p0.getProductType(), p0.getPluginName());
    }
}
