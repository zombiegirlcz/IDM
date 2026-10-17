package kx7;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.q implements Function1 {
    public static final t f = new t();

    public t() {
        super(1, hx7.b.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/AddressNotSupportedDto;)Lcom/revolut/feature/insurance_pet/api/model/AddressNotSupported;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ix7.c p0 = (ix7.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        Address addressA = oo3.a.a(p0.getNewAddress());
        dj0.d dVarO = mo3.a.o(p0.getRefund());
        LocalDate localDate = LocalDate.parse(p0.getCancellationDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new zw7.c(addressA, dVarO, localDate);
    }
}
