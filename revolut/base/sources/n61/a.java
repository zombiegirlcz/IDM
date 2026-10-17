package n61;

import com.revolut.domain.models.beneficiary.BankBeneficiaryParams$IdentityType;
import com.revolut.domain.models.beneficiary.BeneficiaryVerification;
import com.revolut.feature.address.models.Address;
import java.util.Map;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BankBeneficiaryParams$IdentityType f212663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f212664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f212665c;
    public Map d;
    public String e;
    public Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BeneficiaryVerification f212666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f212667h;
    public String i;

    public final b a() {
        BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType = this.f212663a;
        String str = this.f212664b;
        String str2 = this.f212665c;
        Map map = this.d;
        String str3 = this.e;
        Address address = this.f;
        Address addressCopy = null;
        if (address != null) {
            String streetLine1 = address.getStreetLine1();
            String streetLine2 = address.getStreetLine2();
            String region = address.getRegion();
            String str4 = (region == null || d0.W(region)) ? null : region;
            String city = address.getCity();
            addressCopy = address.copy((32704 & 1) != 0 ? address.streetLine1 : streetLine1, (32704 & 2) != 0 ? address.streetLine2 : streetLine2, (32704 & 4) != 0 ? address.region : str4, (32704 & 8) != 0 ? address.city : (city == null || d0.W(city)) ? null : city, (32704 & 16) != 0 ? address.postcode : address.getPostcode(), (32704 & 32) != 0 ? address.country : address.getCountry(), (32704 & 64) != 0 ? address.fullAddress : null, (32704 & 128) != 0 ? address.streetType : null, (32704 & 256) != 0 ? address.street : null, (32704 & 512) != 0 ? address.houseNumber : null, (32704 & 1024) != 0 ? address.flat : null, (32704 & 2048) != 0 ? address.neighborhood : null, (32704 & 4096) != 0 ? address.houseName : null, (32704 & 8192) != 0 ? address.type : null, (32704 & 16384) != 0 ? address.landmark : null);
        }
        return new b(bankBeneficiaryParams$IdentityType, null, null, null, str, str2, map, str3, addressCopy, null, this.f212666g, this.f212667h, this.i);
    }
}
