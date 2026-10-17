package kx7;

import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public static final s f = new s();

    public s() {
        super(1, hx7.a.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/AddressChangeDto;)Lcom/revolut/feature/insurance_pet/api/model/AddressChange;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ix7.a p0 = (ix7.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        Address addressA = oo3.a.a(p0.getNewAddress());
        List pets = p0.getPets();
        Intrinsics.checkNotNullParameter(pets, "<this>");
        List<ix7.b> list = pets;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ix7.b bVar : list) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String petId = bVar.getPetId();
            LocalDate localDate = LocalDate.parse(bVar.getNewPriceStartDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            arrayList.add(new zw7.b(petId, localDate, mo3.a.o(bVar.getNewPrice()), mo3.a.o(bVar.getPreviousPrice())));
        }
        return new zw7.a(addressA, arrayList);
    }
}
