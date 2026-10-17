package t61;

import com.revolut.domain.models.externalcards.AutoTopUpType;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.externalcards.CrossProfileStatus;
import com.revolut.feature.address.models.Address;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements Serializable {
    public final CrossProfileStatus A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268139c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f268140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f268141h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f268142j;
    public final Address k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f268143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f268144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f268145n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f268146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AutoTopUpType f268147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f268148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f268149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f268150t;
    public final long u;
    public final long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f268151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CardholderVerificationStatus f268152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f268153y;
    public final f z;

    @NotNull
    public static final e Companion = new e();
    public static final g B = new g(null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, null, 0, 0, 0, 0, false, null, null, 125829119);

    public g(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, j jVar, Address address, String str6, String str7, boolean z3, boolean z4, int i3, AutoTopUpType autoTopUpType, String str8, long j2, long j3, long j5, long j16, boolean z6, CardholderVerificationStatus cardholderVerificationStatus, Boolean bool, int i5) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? false : z, false, (i5 & 512) != 0 ? null : jVar, (i5 & 1024) != 0 ? o51.a.f222306a : address, (i5 & 2048) != 0 ? null : str6, (i5 & 4096) != 0 ? "" : str7, (i5 & 8192) != 0 ? false : z3, (i5 & 16384) != 0 ? false : z4, (32768 & i5) != 0 ? 0 : i3, (65536 & i5) != 0 ? AutoTopUpType.UNKNOWN : autoTopUpType, (131072 & i5) != 0 ? null : str8, (262144 & i5) != 0 ? 0L : j2, (524288 & i5) != 0 ? 0L : j3, (1048576 & i5) != 0 ? -1L : j5, (2097152 & i5) == 0 ? j16 : 0L, (4194304 & i5) != 0 ? false : z6, cardholderVerificationStatus, (i5 & 16777216) != 0 ? null : bool, null, null);
    }

    public static g a(g gVar, j jVar) {
        String id10 = gVar.f268137a;
        String ownerId = gVar.f268138b;
        String str = gVar.f268139c;
        String lastFour = gVar.d;
        String brand = gVar.e;
        int i = gVar.f;
        int i2 = gVar.f268140g;
        boolean z = gVar.f268141h;
        boolean z3 = gVar.i;
        Address address = gVar.k;
        String str2 = gVar.f268143l;
        String currency = gVar.f268144m;
        boolean z4 = gVar.f268145n;
        boolean z6 = gVar.o;
        int i3 = gVar.f268146p;
        AutoTopUpType autoTopUpType = gVar.f268147q;
        String str3 = gVar.f268148r;
        long j2 = gVar.f268149s;
        long j3 = gVar.f268150t;
        long j5 = gVar.u;
        long j16 = gVar.v;
        boolean z11 = gVar.f268151w;
        CardholderVerificationStatus cardholderVerificationStatus = gVar.f268152x;
        Boolean bool = gVar.f268153y;
        f fVar = gVar.z;
        CrossProfileStatus crossProfileStatus = gVar.A;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoTopUpType, "autoTopUpType");
        return new g(id10, ownerId, str, lastFour, brand, i, i2, z, z3, jVar, address, str2, currency, z4, z6, i3, autoTopUpType, str3, j2, j3, j5, j16, z11, cardholderVerificationStatus, bool, fVar, crossProfileStatus);
    }

    public final j b() {
        return this.f268142j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f268137a, gVar.f268137a) && Intrinsics.f(this.f268138b, gVar.f268138b) && Intrinsics.f(this.f268139c, gVar.f268139c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f268140g == gVar.f268140g && this.f268141h == gVar.f268141h && this.i == gVar.i && Intrinsics.f(this.f268142j, gVar.f268142j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f268143l, gVar.f268143l) && Intrinsics.f(this.f268144m, gVar.f268144m) && this.f268145n == gVar.f268145n && this.o == gVar.o && this.f268146p == gVar.f268146p && this.f268147q == gVar.f268147q && Intrinsics.f(this.f268148r, gVar.f268148r) && this.f268149s == gVar.f268149s && this.f268150t == gVar.f268150t && this.u == gVar.u && this.v == gVar.v && this.f268151w == gVar.f268151w && this.f268152x == gVar.f268152x && Intrinsics.f(this.f268153y, gVar.f268153y) && Intrinsics.f(this.z, gVar.z) && this.A == gVar.A;
    }

    public final String getId() {
        return this.f268137a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f268137a.hashCode() * 31, 31, this.f268138b);
        String str = this.f268139c;
        int iC2 = j6.a.c(j6.a.c(j6.a.b(this.f268140g, j6.a.b(this.f, p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31), 31, this.f268141h), 31, this.i);
        j jVar = this.f268142j;
        int iHashCode = (this.k.hashCode() + ((iC2 + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        String str2 = this.f268143l;
        int iHashCode2 = (this.f268147q.hashCode() + j6.a.b(this.f268146p, j6.a.c(j6.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f268144m), 31, this.f268145n), 31, this.o), 31)) * 31;
        String str3 = this.f268148r;
        int iC3 = j6.a.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f268149s), 31, this.f268150t), 31, this.u), 31, this.v), 31, this.f268151w);
        CardholderVerificationStatus cardholderVerificationStatus = this.f268152x;
        int iHashCode3 = (iC3 + (cardholderVerificationStatus == null ? 0 : cardholderVerificationStatus.hashCode())) * 31;
        Boolean bool = this.f268153y;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        f fVar = this.z;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        CrossProfileStatus crossProfileStatus = this.A;
        return iHashCode5 + (crossProfileStatus != null ? crossProfileStatus.hashCode() : 0);
    }

    public final String toString() {
        String strI;
        String string;
        StringBuilder sb6 = new StringBuilder("ExternalCard(");
        a10.b.z(sb6, "id=", this.f268137a, ", ");
        a10.b.z(sb6, "ownerId=", this.f268138b, ", ");
        sb6.append("cardToken=" + this.f268139c + ", ");
        sb6.append("lastFour=****, ");
        sb6.append("brand=" + this.e + ", ");
        sb6.append("expiryMonth=**, expiryYear=**, ");
        sb6.append("expired=" + this.f268141h + ", ");
        sb6.append("blocked=" + this.i + ", ");
        j jVar = this.f268142j;
        String strI2 = "null";
        if (jVar == null) {
            string = "null";
        } else {
            StringBuilder sb9 = new StringBuilder("Issuer(");
            a10.b.z(sb9, "bin=", jVar.f268158a, ", ");
            a10.b.z(sb9, "name=", jVar.f268159b, ", ");
            a10.b.z(sb9, "logoUrl=", jVar.f268160c, ", ");
            a10.b.z(sb9, "colour=", jVar.d, ", ");
            a10.b.z(sb9, "bgColour=", jVar.e, ", ");
            a10.b.z(sb9, "cardType=", jVar.f, ", ");
            sb9.append("cardBrand=" + jVar.f268161g + ", ");
            a10.b.z(sb9, "currency=", jVar.f268162h, ", ");
            a10.b.z(sb9, "country=", jVar.i, ", ");
            sb9.append("supported=" + jVar.f268163j + ", ");
            sb9.append("fee=" + jVar.k + ", ");
            sb9.append("errorCode=" + jVar.f268164l + ", ");
            sb9.append("postcodeRequired=" + jVar.f268165m + ", ");
            a10.b.z(sb9, "cardSubtype=", jVar.f268166n, ", ");
            a10.b.z(sb9, "feeDisclosure=", jVar.o, ", ");
            a10.b.z(sb9, "binId=", jVar.f268167p, ", ");
            i iVar = jVar.f268168q;
            if (iVar == null) {
                strI = "null";
            } else {
                strI = v0.a.i(v0.a.m("Outage(title=", iVar.f268154a, ", message=", iVar.f268155b, ", summary="), iVar.f268156c, ")");
            }
            sb9.append("outage=" + strI);
            sb9.append(")");
            string = sb9.toString();
        }
        a10.b.z(sb6, "issuer=", string, ", ");
        StringBuilder sb10 = new StringBuilder("Address(");
        Address address = this.k;
        sb10.append("streetLine1=" + address.getStreetLine1() + ", ");
        sb10.append("streetLine2=" + address.getStreetLine2() + ", ");
        sb10.append("region=" + address.getRegion() + ", ");
        sb10.append("city=" + address.getCity() + ", ");
        sb10.append("postcode=" + address.getPostcode() + ", ");
        sb10.append("country=" + address.getCountry() + ", ");
        sb10.append("fullAddress=" + address.getFullAddress() + ", ");
        sb10.append("streetType=" + address.getStreetType() + ", ");
        sb10.append("street=" + address.getStreet() + ", ");
        sb10.append("houseNumber=" + address.getHouseNumber() + ", ");
        sb10.append("flat=" + address.getFlat() + ", ");
        sb10.append("neighborhood=" + address.getNeighborhood() + ", ");
        sb10.append("houseName=" + address.getHouseName() + ", ");
        sb10.append("type=" + address.getType() + ", ");
        sb10.append("landmark=" + address.getLandmark());
        sb10.append(")");
        a10.b.z(sb6, "address=", sb10.toString(), ", ");
        a10.b.z(sb6, "postcode=", this.f268143l, ", ");
        a10.b.z(sb6, "currency=", this.f268144m, ", ");
        sb6.append("requireCvvCheck=" + this.f268145n + ", ");
        sb6.append("confirmed=" + this.o + ", ");
        sb6.append("confirmationAttempts=" + this.f268146p + ", ");
        sb6.append("autoTopUpType=" + this.f268147q + ", ");
        a10.b.z(sb6, "label=", this.f268148r, ", ");
        sb6.append("updateDate=" + this.f268149s + ", ");
        sb6.append("lastUsedDate=" + this.f268150t + ", ");
        sb6.append("topUpLimit=" + this.u + ", ");
        sb6.append("currentTopUp=" + this.v + ", ");
        sb6.append("creditRepayment=" + this.f268151w + ", ");
        sb6.append("cardholderVerificationStatus=" + this.f268152x + ", ");
        sb6.append("shouldAskForCvv=" + this.f268153y + ", ");
        f fVar = this.z;
        if (fVar != null) {
            strI2 = v0.a.i(v0.a.m("Restrictions(statusTitle=", fVar.f268134a, ", summary=", fVar.f268135b, ", message="), fVar.f268136c, ")");
        }
        sb6.append("restrictions=" + strI2);
        sb6.append(")");
        return sb6.toString();
    }

    public g(String id10, String ownerId, String str, String lastFour, String brand, int i, int i2, boolean z, boolean z3, j jVar, Address address, String str2, String currency, boolean z4, boolean z6, int i3, AutoTopUpType autoTopUpType, String str3, long j2, long j3, long j5, long j16, boolean z11, CardholderVerificationStatus cardholderVerificationStatus, Boolean bool, f fVar, CrossProfileStatus crossProfileStatus) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoTopUpType, "autoTopUpType");
        this.f268137a = id10;
        this.f268138b = ownerId;
        this.f268139c = str;
        this.d = lastFour;
        this.e = brand;
        this.f = i;
        this.f268140g = i2;
        this.f268141h = z;
        this.i = z3;
        this.f268142j = jVar;
        this.k = address;
        this.f268143l = str2;
        this.f268144m = currency;
        this.f268145n = z4;
        this.o = z6;
        this.f268146p = i3;
        this.f268147q = autoTopUpType;
        this.f268148r = str3;
        this.f268149s = j2;
        this.f268150t = j3;
        this.u = j5;
        this.v = j16;
        this.f268151w = z11;
        this.f268152x = cardholderVerificationStatus;
        this.f268153y = bool;
        this.z = fVar;
        this.A = crossProfileStatus;
    }
}
