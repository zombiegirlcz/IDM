package vi1;

import com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId;
import java.util.List;
import kotlin.Pair;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f289502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f289503c;

    public h() {
        AddressConfiguration$FieldId.Country country = AddressConfiguration$FieldId.Country.f61047a;
        AddressConfiguration$FieldId.StreetName streetName = AddressConfiguration$FieldId.StreetName.f61054a;
        AddressConfiguration$FieldId.HouseNumber houseNumber = AddressConfiguration$FieldId.HouseNumber.f61050a;
        AddressConfiguration$FieldId.FlatNumber flatNumber = AddressConfiguration$FieldId.FlatNumber.f61048a;
        AddressConfiguration$FieldId.Postcode postcode = AddressConfiguration$FieldId.Postcode.f61052a;
        AddressConfiguration$FieldId.Neighbourhood neighbourhood = AddressConfiguration$FieldId.Neighbourhood.f61051a;
        AddressConfiguration$FieldId.City city = AddressConfiguration$FieldId.City.f61046a;
        AddressConfiguration$FieldId.Region region = AddressConfiguration$FieldId.Region.f61053a;
        AddressConfiguration$FieldId.AddressType addressType = AddressConfiguration$FieldId.AddressType.f61045a;
        this.f289501a = v.k(country, streetName, houseNumber, flatNumber, postcode, neighbourhood, city, region, addressType);
        AddressConfiguration$FieldId.AddressLine1 addressLine1 = AddressConfiguration$FieldId.AddressLine1.f61043a;
        AddressConfiguration$FieldId.AddressLine2 addressLine2 = AddressConfiguration$FieldId.AddressLine2.f61044a;
        this.f289502b = v.k(country, addressLine1, addressLine2, postcode, neighbourhood, city, region, addressType);
        wi0.b.Companion.getClass();
        this.f289503c = r0.k(new Pair(wi0.b.O, v.k(country, AddressConfiguration$FieldId.StreetType.f61055a, addressLine1, addressLine2, streetName, houseNumber, flatNumber, neighbourhood, city, region)), new Pair(wi0.b.X0, v.k(country, postcode, region, city, neighbourhood, addressLine1, addressLine2, streetName, houseNumber, AddressConfiguration$FieldId.HouseName.f61049a, flatNumber, addressType)), new Pair(wi0.b.J2, v.k(country, postcode, addressLine1, addressLine2, city, addressType)), new Pair(wi0.b.n3, v.k(country, postcode, addressLine1, addressLine2, city, region, addressType)), new Pair(wi0.b.M0, v.k(country, addressLine1, addressLine2, streetName, houseNumber, flatNumber, postcode, city, addressType)), new Pair(wi0.b.f297756l, v.k(country, addressLine1, addressLine2, flatNumber, houseNumber, streetName, postcode, city, region, addressType)), new Pair(wi0.b.f297734c, v.k(country, addressLine1, addressLine2, flatNumber, houseNumber, streetName, postcode, city, region, neighbourhood, addressType)));
    }
}
