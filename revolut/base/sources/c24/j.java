package c24;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lc24/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPartnerId", "partnerId", "Lc24/j$b;", "b", "Lc24/j$b;", "getCustomDetails", "()Lc24/j$b;", "customDetails", "Companion", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("partner")
    private final String partnerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("custom")
    private final b customDetails;

    /* JADX INFO: renamed from: c24.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lc24/j$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSolicitorName", "solicitorName", "b", "getEmail", "email", "c", "getContactName", "contactName", "d", "getPhoneNumber", "phoneNumber", "Lno3/b;", "e", "Lno3/b;", "getAddress", "()Lno3/b;", "address", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("solicitorName")
        @NotNull
        private final String solicitorName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("email")
        @NotNull
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("contactName")
        private final String contactName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("phoneNumber")
        private final String phoneNumber;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("address")
        @NotNull
        private final no3.b address;

        public b(String solicitorName, String email, String str, String str2, no3.b address) {
            Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(address, "address");
            this.solicitorName = solicitorName;
            this.email = email;
            this.contactName = str;
            this.phoneNumber = str2;
            this.address = address;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.solicitorName, bVar.solicitorName) && Intrinsics.f(this.email, bVar.email) && Intrinsics.f(this.contactName, bVar.contactName) && Intrinsics.f(this.phoneNumber, bVar.phoneNumber) && Intrinsics.f(this.address, bVar.address);
        }

        public final int hashCode() {
            int iC = p.a.c(this.solicitorName.hashCode() * 31, 31, this.email);
            String str = this.contactName;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phoneNumber;
            return this.address.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }
    }

    public j(String str, b bVar) {
        this.partnerId = str;
        this.customDetails = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.partnerId, jVar.partnerId) && Intrinsics.f(this.customDetails, jVar.customDetails);
    }

    public final int hashCode() {
        String str = this.partnerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.customDetails;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
