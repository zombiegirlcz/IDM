package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0004\n\u000e\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u001e"}, d2 = {"Ljkl/n4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "c", "displayTitle", "displaySubtitle", "Ljkl/n4$d;", "d", "Ljkl/n4$d;", "g", "()Ljkl/n4$d;", "profileType", "Ljkl/n4$b;", "Ljkl/n4$b;", "()Ljkl/n4$b;", "email", "f", "phone", "Ljkl/n4$a;", "Ljkl/n4$a;", "()Ljkl/n4$a;", "address", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayTitle")
    @NotNull
    private final String displayTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("displaySubtitle")
    @NotNull
    private final String displaySubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("profileType")
    @NotNull
    private final d profileType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("email")
    private final b email;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("phone")
    private final b phone;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final a address;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Ljkl/n4$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "streetAddress", "b", "c", "postalCode", "country", "d", "locality", "region", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("streetAddress")
        @NotNull
        private final String streetAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("postalCode")
        @NotNull
        private final String postalCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        @NotNull
        private final String country;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("locality")
        private final String locality;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("region")
        private final String region;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStreetAddress() {
            return this.streetAddress;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.streetAddress, aVar.streetAddress) && Intrinsics.f(this.postalCode, aVar.postalCode) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.locality, aVar.locality) && Intrinsics.f(this.region, aVar.region);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.streetAddress.hashCode() * 31, 31, this.postalCode), 31, this.country);
            String str = this.locality;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.region;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Ljkl/n4$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "verified", "unmaskedValue", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("verified")
        private final Boolean verified;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("unmaskedValue")
        @NotNull
        private final String unmaskedValue;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUnmaskedValue() {
            return this.unmaskedValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getVerified() {
            return this.verified;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.verified, bVar.verified) && Intrinsics.f(this.unmaskedValue, bVar.unmaskedValue);
        }

        public final int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            Boolean bool = this.verified;
            return this.unmaskedValue.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ljkl/n4$d;", "", "PERSONAL", "BUSINESS", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;

        @lg.b("BUSINESS")
        public static final d BUSINESS;

        @lg.b("PERSONAL")
        public static final d PERSONAL;

        @he0.b
        public static final d UNKNOWN;

        static {
            d dVar = new d("PERSONAL", 0);
            PERSONAL = dVar;
            d dVar2 = new d("BUSINESS", 1);
            BUSINESS = dVar2;
            d dVar3 = new d("UNKNOWN", 2);
            UNKNOWN = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            $VALUES = dVarArr;
            $ENTRIES = vc.s.n(dVarArr);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplaySubtitle() {
        return this.displaySubtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.id, n4Var.id) && Intrinsics.f(this.displayTitle, n4Var.displayTitle) && Intrinsics.f(this.displaySubtitle, n4Var.displaySubtitle) && this.profileType == n4Var.profileType && Intrinsics.f(this.email, n4Var.email) && Intrinsics.f(this.phone, n4Var.phone) && Intrinsics.f(this.address, n4Var.address);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getProfileType() {
        return this.profileType;
    }

    public final int hashCode() {
        int iHashCode = (this.profileType.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.displayTitle), 31, this.displaySubtitle)) * 31;
        b bVar = this.email;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.phone;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        a aVar = this.address;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
