package z63;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.revolut.feature.address.models.Address;
import h93.f0;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f319654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f319655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f319656c;
    public final lh0.a d;
    public final lh0.b e;

    public b(byte[] opc2, f0 revolutCard, do3.n user, li0.a pushTokenizerRequestBuilderFactory, li0.d userAddressBuilderFactory) {
        Intrinsics.checkNotNullParameter(opc2, "opc");
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pushTokenizerRequestBuilderFactory, "pushTokenizerRequestBuilderFactory");
        Intrinsics.checkNotNullParameter(userAddressBuilderFactory, "userAddressBuilderFactory");
        this.f319654a = opc2;
        this.f319655b = revolutCard;
        this.f319656c = user;
        this.d = pushTokenizerRequestBuilderFactory;
        this.e = userAddressBuilderFactory;
    }

    public final c0 a() {
        int i;
        String str;
        String postalCode;
        String area;
        String locality;
        String countryCode;
        String address;
        String address2;
        ((li0.a) this.d).getClass();
        PushTokenizeRequest.Builder internal = new PushTokenizeRequest.Builder();
        Intrinsics.checkNotNullParameter(internal, "internal");
        byte[] opc2 = this.f319654a;
        Intrinsics.checkNotNullParameter(opc2, "opc");
        internal.setOpaquePaymentCard(opc2);
        f0 f0Var = this.f319655b;
        b93.j jVar = f0Var.f150114h;
        b93.j jVar2 = f0Var.f150114h;
        String str2 = jVar.f13640b;
        m5l.b bVar = m5l.b.VISA;
        int i2 = 3;
        if (Intrinsics.f(str2, bVar.e())) {
            i = 4;
        } else {
            if (!Intrinsics.f(str2, m5l.b.MASTERCARD.e()) && !Intrinsics.f(str2, m5l.b.MAESTRO.e())) {
                throw new IllegalArgumentException("Unsupported card brand");
            }
            i = 3;
        }
        internal.setNetwork(i);
        String str3 = jVar2.f13640b;
        if (Intrinsics.f(str3, bVar.e())) {
            i2 = 4;
        } else if (!Intrinsics.f(str3, m5l.b.MASTERCARD.e()) && !Intrinsics.f(str3, m5l.b.MAESTRO.e())) {
            throw new IllegalArgumentException("Unsupported card brand");
        }
        internal.setTokenServiceProvider(i2);
        String str4 = jVar2.f13640b;
        if (Intrinsics.f(str4, bVar.e())) {
            str = "Visa";
        } else if (Intrinsics.f(str4, m5l.b.MASTERCARD.e())) {
            str = "Mastercard";
        } else {
            if (!Intrinsics.f(str4, m5l.b.MAESTRO.e())) {
                throw new IllegalArgumentException("Unsupported card brand");
            }
            str = "Maestro";
        }
        String displayName = "Revolut ".concat(str);
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        internal.setDisplayName(displayName);
        String lastFour = f0Var.f150115j;
        if (lastFour != null) {
            Intrinsics.checkNotNullParameter(lastFour, "lastFour");
            internal.setLastDigits(lastFour);
        }
        ((li0.d) this.e).getClass();
        UserAddress.Builder internal2 = UserAddress.newBuilder();
        Intrinsics.checkNotNullExpressionValue(internal2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(internal2, "internal");
        do3.n nVar = this.f319656c;
        Address address3 = nVar.k;
        Address address4 = nVar.k;
        if (address3 != null && (address2 = address3.getStreetLine1()) != null) {
            Intrinsics.checkNotNullParameter(address2, "address");
            internal2.setAddress1(address2);
        }
        if (address4 != null && (address = address4.getStreetLine2()) != null) {
            Intrinsics.checkNotNullParameter(address, "address");
            internal2.setAddress2(address);
        }
        if (address4 != null && (countryCode = nz8.d.g(address4).f297794a) != null) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            internal2.setCountryCode(countryCode);
        }
        if (address4 != null && (locality = address4.getCity()) != null) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            internal2.setLocality(locality);
        }
        if (address4 != null && (area = address4.getRegion()) != null) {
            Intrinsics.checkNotNullParameter(area, "area");
            internal2.setAdministrativeArea(area);
        }
        String name = w.I(nVar);
        Intrinsics.checkNotNullParameter(name, "name");
        internal2.setName(name);
        String phoneNumber = nVar.i;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        internal2.setPhoneNumber(phoneNumber);
        if (address4 != null && (postalCode = address4.getPostcode()) != null) {
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            internal2.setPostalCode(postalCode);
        }
        UserAddress internal3 = internal2.build();
        Intrinsics.checkNotNullExpressionValue(internal3, "build(...)");
        Intrinsics.checkNotNullParameter(internal3, "<this>");
        Intrinsics.checkNotNullParameter(internal3, "internal");
        p96.a address5 = new p96.a(25);
        Intrinsics.checkNotNullParameter(address5, "address");
        Intrinsics.checkNotNullParameter(address5, "<this>");
        internal.setUserAddress(internal3);
        PushTokenizeRequest pushTokenizeRequestBuild = internal.build();
        Intrinsics.checkNotNullExpressionValue(pushTokenizeRequestBuild, "build(...)");
        Intrinsics.checkNotNullParameter(pushTokenizeRequestBuild, "<this>");
        return new c0(pushTokenizeRequestBuild);
    }
}
