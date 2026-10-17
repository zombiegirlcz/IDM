package z8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lz8l/f;", "Lz8l/g;", "b", "c", "a", "Lz8l/f$a;", "Lz8l/f$b;", "Lz8l/f$c;", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004¨\u0006-"}, d2 = {"Lz8l/f$a;", "Lz8l/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "N0", "username", "c", "getCode", "code", "d", "getCountry", "country", "e", "getPhone", "phone", "f", "getEmail", "email", "g", "getFirstName", "firstName", "h", "getLastName", "lastName", "i", "getLegalName", "legalName", "j", "getName", "name", "k", "getAppMode", "appMode", "l", "d3", "pdaRecipientCountry", "m", "d7", "customerType", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("username")
        private final String username;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("country")
        private final String country;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("phone")
        private final String phone;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("email")
        private final String email;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("firstName")
        private final String firstName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastName")
        private final String lastName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("legalName")
        private final String legalName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("appMode")
        private final String appMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("pdaRecipientCountry")
        private final String pdaRecipientCountry;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("customerType")
        private final String customerType;

        @Override // z8l.f
        /* JADX INFO: renamed from: N0, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d3, reason: from getter */
        public final String getPdaRecipientCountry() {
            return this.pdaRecipientCountry;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d7, reason: from getter */
        public final String getCustomerType() {
            return this.customerType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.username, aVar.username) && Intrinsics.f(this.code, aVar.code) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.phone, aVar.phone) && Intrinsics.f(this.email, aVar.email) && Intrinsics.f(this.firstName, aVar.firstName) && Intrinsics.f(this.lastName, aVar.lastName) && Intrinsics.f(this.legalName, aVar.legalName) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.appMode, aVar.appMode) && Intrinsics.f(this.pdaRecipientCountry, aVar.pdaRecipientCountry) && Intrinsics.f(this.customerType, aVar.customerType);
        }

        @Override // z8l.f
        public final String getCode() {
            return this.code;
        }

        @Override // z8l.f
        public final String getCountry() {
            return this.country;
        }

        @Override // z8l.f
        public final String getEmail() {
            return this.email;
        }

        @Override // z8l.f
        public final String getFirstName() {
            return this.firstName;
        }

        @Override // z8l.g
        public final String getId() {
            return this.id;
        }

        @Override // z8l.f
        public final String getLastName() {
            return this.lastName;
        }

        @Override // z8l.f
        public final String getLegalName() {
            return this.legalName;
        }

        @Override // z8l.f
        public final String getName() {
            return this.name;
        }

        @Override // z8l.f
        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.username;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.country;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.phone;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.email;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.firstName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.lastName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.legalName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.name;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.appMode;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.pdaRecipientCountry;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.customerType;
            return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004¨\u0006-"}, d2 = {"Lz8l/f$b;", "Lz8l/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "N0", "username", "c", "getCode", "code", "d", "getCountry", "country", "e", "getPhone", "phone", "f", "getEmail", "email", "g", "getFirstName", "firstName", "h", "getLastName", "lastName", "i", "getLegalName", "legalName", "j", "getName", "name", "k", "getAppMode", "appMode", "l", "d3", "pdaRecipientCountry", "m", "d7", "customerType", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("username")
        private final String username;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("country")
        private final String country;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("phone")
        private final String phone;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("email")
        private final String email;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("firstName")
        private final String firstName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastName")
        private final String lastName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("legalName")
        private final String legalName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("appMode")
        private final String appMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("pdaRecipientCountry")
        private final String pdaRecipientCountry;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("customerType")
        private final String customerType;

        @Override // z8l.f
        /* JADX INFO: renamed from: N0, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d3, reason: from getter */
        public final String getPdaRecipientCountry() {
            return this.pdaRecipientCountry;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d7, reason: from getter */
        public final String getCustomerType() {
            return this.customerType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.username, bVar.username) && Intrinsics.f(this.code, bVar.code) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.phone, bVar.phone) && Intrinsics.f(this.email, bVar.email) && Intrinsics.f(this.firstName, bVar.firstName) && Intrinsics.f(this.lastName, bVar.lastName) && Intrinsics.f(this.legalName, bVar.legalName) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.appMode, bVar.appMode) && Intrinsics.f(this.pdaRecipientCountry, bVar.pdaRecipientCountry) && Intrinsics.f(this.customerType, bVar.customerType);
        }

        @Override // z8l.f
        public final String getCode() {
            return this.code;
        }

        @Override // z8l.f
        public final String getCountry() {
            return this.country;
        }

        @Override // z8l.f
        public final String getEmail() {
            return this.email;
        }

        @Override // z8l.f
        public final String getFirstName() {
            return this.firstName;
        }

        @Override // z8l.g
        public final String getId() {
            return this.id;
        }

        @Override // z8l.f
        public final String getLastName() {
            return this.lastName;
        }

        @Override // z8l.f
        public final String getLegalName() {
            return this.legalName;
        }

        @Override // z8l.f
        public final String getName() {
            return this.name;
        }

        @Override // z8l.f
        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.username;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.country;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.phone;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.email;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.firstName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.lastName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.legalName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.name;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.appMode;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.pdaRecipientCountry;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.customerType;
            return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004¨\u0006-"}, d2 = {"Lz8l/f$c;", "Lz8l/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "N0", "username", "c", "getCode", "code", "d", "getCountry", "country", "e", "getPhone", "phone", "f", "getEmail", "email", "g", "getFirstName", "firstName", "h", "getLastName", "lastName", "i", "getLegalName", "legalName", "j", "getName", "name", "k", "getAppMode", "appMode", "l", "d3", "pdaRecipientCountry", "m", "d7", "customerType", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("username")
        private final String username;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("country")
        private final String country;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("phone")
        private final String phone;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("email")
        private final String email;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("firstName")
        private final String firstName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastName")
        private final String lastName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("legalName")
        private final String legalName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("appMode")
        private final String appMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("pdaRecipientCountry")
        private final String pdaRecipientCountry;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("customerType")
        private final String customerType;

        @Override // z8l.f
        /* JADX INFO: renamed from: N0, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d3, reason: from getter */
        public final String getPdaRecipientCountry() {
            return this.pdaRecipientCountry;
        }

        @Override // z8l.f
        /* JADX INFO: renamed from: d7, reason: from getter */
        public final String getCustomerType() {
            return this.customerType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.username, cVar.username) && Intrinsics.f(this.code, cVar.code) && Intrinsics.f(this.country, cVar.country) && Intrinsics.f(this.phone, cVar.phone) && Intrinsics.f(this.email, cVar.email) && Intrinsics.f(this.firstName, cVar.firstName) && Intrinsics.f(this.lastName, cVar.lastName) && Intrinsics.f(this.legalName, cVar.legalName) && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.appMode, cVar.appMode) && Intrinsics.f(this.pdaRecipientCountry, cVar.pdaRecipientCountry) && Intrinsics.f(this.customerType, cVar.customerType);
        }

        @Override // z8l.f
        public final String getCode() {
            return this.code;
        }

        @Override // z8l.f
        public final String getCountry() {
            return this.country;
        }

        @Override // z8l.f
        public final String getEmail() {
            return this.email;
        }

        @Override // z8l.f
        public final String getFirstName() {
            return this.firstName;
        }

        @Override // z8l.g
        public final String getId() {
            return this.id;
        }

        @Override // z8l.f
        public final String getLastName() {
            return this.lastName;
        }

        @Override // z8l.f
        public final String getLegalName() {
            return this.legalName;
        }

        @Override // z8l.f
        public final String getName() {
            return this.name;
        }

        @Override // z8l.f
        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.username;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.country;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.phone;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.email;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.firstName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.lastName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.legalName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.name;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.appMode;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.pdaRecipientCountry;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.customerType;
            return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: N0 */
    String getUsername();

    /* JADX INFO: renamed from: d3 */
    String getPdaRecipientCountry();

    /* JADX INFO: renamed from: d7 */
    String getCustomerType();

    String getCode();

    String getCountry();

    String getEmail();

    String getFirstName();

    String getLastName();

    String getLegalName();

    String getName();

    String getPhone();
}
