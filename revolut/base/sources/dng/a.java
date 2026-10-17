package dng;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0017\u0010\"R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b\u001c\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b(\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b\n\u0010,¨\u00063"}, d2 = {"Ldng/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "", "b", "J", "c", "()J", "createdDate", "", "", "Ljava/util/List;", "()Ljava/util/List;", "birthDate", "d", "f", "firstName", "e", "j", "middleName", "i", "lastName", "g", "k", "phone", "email", "", "Z", "()Z", "emailVerified", "getState", "state", "m", "referralCode", "l", "n", "username", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasProfilePicture", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "queuePosition", "o", "canActivate", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("birthDate")
    private final List<Integer> birthDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("middleName")
    private final String middleName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("phone")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("emailVerified")
    private final boolean emailVerified;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("referralCode")
    private final String referralCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("username")
    private final String username;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasProfilePicture")
    private final Boolean hasProfilePicture;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("queuePosition")
    private final Integer queuePosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("canActivate")
    private final Boolean canActivate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCanActivate() {
        return this.canActivate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && this.createdDate == aVar.createdDate && Intrinsics.f(this.birthDate, aVar.birthDate) && Intrinsics.f(this.firstName, aVar.firstName) && Intrinsics.f(this.middleName, aVar.middleName) && Intrinsics.f(this.lastName, aVar.lastName) && Intrinsics.f(this.phone, aVar.phone) && Intrinsics.f(this.email, aVar.email) && this.emailVerified == aVar.emailVerified && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.referralCode, aVar.referralCode) && Intrinsics.f(this.username, aVar.username) && Intrinsics.f(this.hasProfilePicture, aVar.hasProfilePicture) && Intrinsics.f(this.queuePosition, aVar.queuePosition) && Intrinsics.f(this.canActivate, aVar.canActivate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getHasProfilePicture() {
        return this.hasProfilePicture;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.id.hashCode() * 31, 31, this.createdDate);
        List<Integer> list = this.birthDate;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.firstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.middleName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iC2 = p.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.phone);
        String str4 = this.email;
        int iC3 = p.a.c(j6.a.c((iC2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.emailVerified), 31, this.state);
        String str5 = this.referralCode;
        int iHashCode4 = (iC3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.username;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.hasProfilePicture;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.queuePosition;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.canActivate;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getQueuePosition() {
        return this.queuePosition;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
