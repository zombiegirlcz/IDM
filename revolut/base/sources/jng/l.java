package jng;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0005\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001c\u00105\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b\u000f\u00104R\u001c\u0010:\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0012\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b'\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\b!\u00104R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\bB\u0010\u0004R\"\u0010I\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b7\u0010HR\u001c\u0010M\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010K\u001a\u0004\b@\u0010LR\u001c\u0010Q\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bF\u0010PR\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004¨\u0006T"}, d2 = {"Ljng/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "id", "b", "m", "individualId", "c", "h", "firstName", "d", "o", "middleName", "e", "n", "lastName", "f", "x", "username", "g", "email", "", "Z", "()Z", "emailVerified", "i", "p", "phone", "j", "birthDate", "Lso3/c;", "Lso3/c;", "()Lso3/c;", "address", "l", "s", "referralCode", "u", "state", "w", "terminationReason", "", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "queuePosition", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canActivate", "", "q", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdDate", "Ljng/k;", "Ljng/k;", "()Ljng/k;", "identityDetails", "annualIncomeRange", "t", "hasProfilePicture", "getAppMode", "appMode", "", "Ljng/b;", "v", "Ljava/util/List;", "()Ljava/util/List;", "profiles", "Ljng/d;", "Ljng/d;", "()Ljng/d;", "salariedUser", "Ljng/f;", "Ljng/f;", "()Ljng/f;", "student", "y", "graduationId", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("individualId")
    private final String individualId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("middleName")
    private final String middleName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("username")
    private final String username;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("emailVerified")
    private final boolean emailVerified;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("phone")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("birthDate")
    private final String birthDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("address")
    private final so3.c address;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("referralCode")
    private final String referralCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminationReason")
    private final String terminationReason;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("queuePosition")
    private final Integer queuePosition;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("canActivate")
    private final Boolean canActivate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("identityDetails")
    private final k identityDetails;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualIncomeRange")
    private final String annualIncomeRange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasProfilePicture")
    private final Boolean hasProfilePicture;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("appMode")
    private final String appMode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("profiles")
    private final List<b> profiles;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("salariedUser")
    private final d salariedUser;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("student")
    private final f student;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("graduationId")
    private final String graduationId;

    public l(String id10, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String phone, String str7, so3.c cVar, String str8, String state, String str9, Integer num, Boolean bool, Long l2, k kVar, String str10, Boolean bool2, String str11, ArrayList arrayList, d dVar, f fVar, String str12) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.individualId = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.username = str5;
        this.email = str6;
        this.emailVerified = z;
        this.phone = phone;
        this.birthDate = str7;
        this.address = cVar;
        this.referralCode = str8;
        this.state = state;
        this.terminationReason = str9;
        this.queuePosition = num;
        this.canActivate = bool;
        this.createdDate = l2;
        this.identityDetails = kVar;
        this.annualIncomeRange = str10;
        this.hasProfilePicture = bool2;
        this.appMode = str11;
        this.profiles = arrayList;
        this.salariedUser = dVar;
        this.student = fVar;
        this.graduationId = str12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final so3.c getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAnnualIncomeRange() {
        return this.annualIncomeRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCanActivate() {
        return this.canActivate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.individualId, lVar.individualId) && Intrinsics.f(this.firstName, lVar.firstName) && Intrinsics.f(this.middleName, lVar.middleName) && Intrinsics.f(this.lastName, lVar.lastName) && Intrinsics.f(this.username, lVar.username) && Intrinsics.f(this.email, lVar.email) && this.emailVerified == lVar.emailVerified && Intrinsics.f(this.phone, lVar.phone) && Intrinsics.f(this.birthDate, lVar.birthDate) && Intrinsics.f(this.address, lVar.address) && Intrinsics.f(this.referralCode, lVar.referralCode) && Intrinsics.f(this.state, lVar.state) && Intrinsics.f(this.terminationReason, lVar.terminationReason) && Intrinsics.f(this.queuePosition, lVar.queuePosition) && Intrinsics.f(this.canActivate, lVar.canActivate) && Intrinsics.f(this.createdDate, lVar.createdDate) && Intrinsics.f(this.identityDetails, lVar.identityDetails) && Intrinsics.f(this.annualIncomeRange, lVar.annualIncomeRange) && Intrinsics.f(this.hasProfilePicture, lVar.hasProfilePicture) && Intrinsics.f(this.appMode, lVar.appMode) && Intrinsics.f(this.profiles, lVar.profiles) && Intrinsics.f(this.salariedUser, lVar.salariedUser) && Intrinsics.f(this.student, lVar.student) && Intrinsics.f(this.graduationId, lVar.graduationId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.individualId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.username;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iC = p.a.c(j6.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.emailVerified), 31, this.phone);
        String str7 = this.birthDate;
        int iHashCode7 = (iC + (str7 == null ? 0 : str7.hashCode())) * 31;
        so3.c cVar = this.address;
        int iHashCode8 = (iHashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str8 = this.referralCode;
        int iC2 = p.a.c((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.state);
        String str9 = this.terminationReason;
        int iHashCode9 = (iC2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.queuePosition;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canActivate;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.createdDate;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        k kVar = this.identityDetails;
        int iHashCode13 = (iHashCode12 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str10 = this.annualIncomeRange;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.hasProfilePicture;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.appMode;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<b> list = this.profiles;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.salariedUser;
        int iHashCode18 = (iHashCode17 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.student;
        int iHashCode19 = (iHashCode18 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str12 = this.graduationId;
        return iHashCode19 + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getGraduationId() {
        return this.graduationId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getHasProfilePicture() {
        return this.hasProfilePicture;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final k getIdentityDetails() {
        return this.identityDetails;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getIndividualId() {
        return this.individualId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getProfiles() {
        return this.profiles;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getQueuePosition() {
        return this.queuePosition;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final d getSalariedUser() {
        return this.salariedUser;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final f getStudent() {
        return this.student;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTerminationReason() {
        return this.terminationReason;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
