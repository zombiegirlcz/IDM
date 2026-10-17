package cr9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcr9/y$a;", "Lcr9/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "memberId", "b", "e", "inviterId", "c", "code", "d", "i", "username", "h", "phone", "f", "email", "firstName", "lastName", "countryCode", "", "j", "Ljava/lang/Boolean;", "get_isRevolut", "()Ljava/lang/Boolean;", "_isRevolut", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("memberId")
        @NotNull
        private final String memberId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("inviterId")
        @NotNull
        private final String inviterId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("username")
        private final String username;

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
        @lg.b("country")
        private final String countryCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("isRevolutUser")
        private final Boolean _isRevolut;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInviterId() {
            return this.inviterId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.memberId, aVar.memberId) && Intrinsics.f(this.inviterId, aVar.inviterId) && Intrinsics.f(this.code, aVar.code) && Intrinsics.f(this.username, aVar.username) && Intrinsics.f(this.phone, aVar.phone) && Intrinsics.f(this.email, aVar.email) && Intrinsics.f(this.firstName, aVar.firstName) && Intrinsics.f(this.lastName, aVar.lastName) && Intrinsics.f(this.countryCode, aVar.countryCode) && Intrinsics.f(this._isRevolut, aVar._isRevolut);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            int iC = p.a.c(this.memberId.hashCode() * 31, 31, this.inviterId);
            String str = this.code;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.username;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.email;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstName;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.lastName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.countryCode;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this._isRevolut;
            return iHashCode7 + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public final boolean j() {
            Boolean bool = this._isRevolut;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcr9/y$b;", "Lcr9/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "memberId", "b", "e", "inviterId", "c", "code", "d", "i", "username", "h", "phone", "f", "email", "firstName", "lastName", "countryCode", "", "j", "Ljava/lang/Boolean;", "get_isRevolut", "()Ljava/lang/Boolean;", "_isRevolut", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("memberId")
        @NotNull
        private final String memberId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("inviterId")
        @NotNull
        private final String inviterId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        private final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("username")
        private final String username;

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
        @lg.b("country")
        private final String countryCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("isRevolutUser")
        private final Boolean _isRevolut;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInviterId() {
            return this.inviterId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.memberId, bVar.memberId) && Intrinsics.f(this.inviterId, bVar.inviterId) && Intrinsics.f(this.code, bVar.code) && Intrinsics.f(this.username, bVar.username) && Intrinsics.f(this.phone, bVar.phone) && Intrinsics.f(this.email, bVar.email) && Intrinsics.f(this.firstName, bVar.firstName) && Intrinsics.f(this.lastName, bVar.lastName) && Intrinsics.f(this.countryCode, bVar.countryCode) && Intrinsics.f(this._isRevolut, bVar._isRevolut);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            int iC = p.a.c(this.memberId.hashCode() * 31, 31, this.inviterId);
            String str = this.code;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.username;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.email;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstName;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.lastName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.countryCode;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this._isRevolut;
            return iHashCode7 + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public final boolean j() {
            Boolean bool = this._isRevolut;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcr9/y$c;", "Lcr9/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "memberId", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("memberId")
        @NotNull
        private final String memberId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.memberId, ((c) obj2).memberId);
        }

        public final int hashCode() {
            return this.memberId.hashCode();
        }
    }

    private y() {
    }
}
