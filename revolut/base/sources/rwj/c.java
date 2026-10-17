package rwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b!\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b)\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b\u001e\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00103\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b2\u00100R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b\u0016\u00106R\u001c\u00109\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b8\u00100R\u001c\u0010<\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u00100R\u001c\u0010>\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b:\u00100R\u001c\u0010A\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\bB\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\b-\u00100R\u001c\u0010J\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b$\u0010IR\u001c\u0010K\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\bG\u00100R\u001c\u0010N\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010.\u001a\u0004\bM\u00100R\u001c\u0010O\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bD\u00100R\u001c\u0010P\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010.\u001a\u0004\b=\u00100R\u001c\u0010Q\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b?\u00100R\u001c\u0010R\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\bL\u00100¨\u0006S"}, d2 = {"Lrwj/c;", "", "", "toString", "()Ljava/lang/String;", "Lso3/c;", "a", "Lso3/c;", "b", "()Lso3/c;", "address", "Ljava/lang/String;", "c", "addressRef", "h", "firstName", "d", "k", "lastName", "e", "l", "middleName", "f", "birthDate", "g", "email", "r", "purposeOfAccount", "i", "alias", "j", "n", "nativeFirstName", "o", "nativeLastName", "firstSurname", "m", "s", "secondSurname", "p", "occupation", "F", "ssn", "itin", "", "q", "Ljava/lang/Boolean;", "t", "()Ljava/lang/Boolean;", "skipActivationReady", "E", "skipUsIdCode", "Lrwj/a;", "Lrwj/a;", "()Lrwj/a;", "contacts", "A", "skipDocumentKyc", "u", "x", "skipCitizenship", "v", "skipAddressVerificationKyc", "w", "C", "skipMarketingConsent", "G", "username", "y", "politicallyExposedPersonDeclaration", "Lrwj/b;", "z", "Lrwj/b;", "()Lrwj/b;", "monthlyIncomeAmount", "skipDocumentId", "B", "D", "skipProfileDetails", "skipContactsSync", "skipAiCallsConsent", "skipAnalyticsEventTrackingConsent", "skipJuniorGraduationAccountLinked", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("skipDocumentId")
    private final Boolean skipDocumentId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("skipProfileDetails")
    private final Boolean skipProfileDetails;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("skipContactsSync")
    private final Boolean skipContactsSync;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("skipAiCallsConsent")
    private final Boolean skipAiCallsConsent;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("skipAnalyticsEventTrackingConsent")
    private final Boolean skipAnalyticsEventTrackingConsent;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("skipJuniorGraduationAccountLinked")
    private final Boolean skipJuniorGraduationAccountLinked;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final so3.c address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressRef")
    private final String addressRef;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("middleName")
    private final String middleName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("birthDate")
    private final String birthDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("purposeOfAccount")
    private final String purposeOfAccount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("alias")
    private final String alias;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("nativeFirstName")
    private final String nativeFirstName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("nativeLastName")
    private final String nativeLastName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstSurname")
    private final String firstSurname;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondSurname")
    private final String secondSurname;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupation")
    private final String occupation;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("ssn")
    private final String ssn;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("itin")
    private final String itin;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("skipActivationReady")
    private final Boolean skipActivationReady;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("skipUsIdCode")
    private final Boolean skipUsIdCode;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("contacts")
    private final a contacts;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("skipDocumentKyc")
    private final Boolean skipDocumentKyc;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("skipCitizenship")
    private final Boolean skipCitizenship;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("skipAddressVerificationKyc")
    private final Boolean skipAddressVerificationKyc;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("skipMarketingConsent")
    private final Boolean skipMarketingConsent;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("username")
    private final String username;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("politicallyExposedPersonDeclaration")
    private final Boolean politicallyExposedPersonDeclaration;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("monthlyIncomeAmount")
    private final b monthlyIncomeAmount;

    public c() {
        this(0);
    }

    public static c a(c cVar, so3.c cVar2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, a aVar, String str16, Boolean bool, b bVar, int i) {
        Boolean bool2 = Boolean.TRUE;
        so3.c cVar3 = (i & 1) != 0 ? cVar.address : cVar2;
        String str17 = (i & 2) != 0 ? cVar.addressRef : str;
        String str18 = (i & 4) != 0 ? cVar.firstName : str2;
        String str19 = (i & 8) != 0 ? cVar.lastName : str3;
        String str20 = (i & 16) != 0 ? cVar.middleName : str4;
        String str21 = (i & 32) != 0 ? cVar.birthDate : str5;
        String str22 = (i & 64) != 0 ? cVar.email : str6;
        String str23 = (i & 128) != 0 ? cVar.purposeOfAccount : str7;
        String str24 = (i & 256) != 0 ? cVar.alias : str8;
        String str25 = (i & 512) != 0 ? cVar.nativeFirstName : str9;
        String str26 = (i & 1024) != 0 ? cVar.nativeLastName : str10;
        String str27 = (i & 2048) != 0 ? cVar.firstSurname : str11;
        String str28 = (i & 4096) != 0 ? cVar.secondSurname : str12;
        String str29 = (i & 8192) != 0 ? cVar.occupation : str13;
        String str30 = (i & 16384) != 0 ? cVar.ssn : str14;
        String str31 = (32768 & i) != 0 ? cVar.itin : str15;
        Boolean bool3 = (65536 & i) != 0 ? cVar.skipActivationReady : bool2;
        Boolean bool4 = (131072 & i) != 0 ? cVar.skipUsIdCode : bool2;
        a aVar2 = (262144 & i) != 0 ? cVar.contacts : aVar;
        Boolean bool5 = (524288 & i) != 0 ? cVar.skipDocumentKyc : bool2;
        Boolean bool6 = (1048576 & i) != 0 ? cVar.skipCitizenship : bool2;
        Boolean bool7 = (2097152 & i) != 0 ? cVar.skipAddressVerificationKyc : bool2;
        Boolean bool8 = (4194304 & i) != 0 ? cVar.skipMarketingConsent : bool2;
        String str32 = (8388608 & i) != 0 ? cVar.username : str16;
        Boolean bool9 = (16777216 & i) != 0 ? cVar.politicallyExposedPersonDeclaration : bool;
        b bVar2 = (33554432 & i) != 0 ? cVar.monthlyIncomeAmount : bVar;
        Boolean bool10 = (67108864 & i) != 0 ? cVar.skipDocumentId : bool2;
        Boolean bool11 = (134217728 & i) != 0 ? cVar.skipProfileDetails : bool2;
        Boolean bool12 = (268435456 & i) != 0 ? cVar.skipContactsSync : bool2;
        Boolean bool13 = (536870912 & i) != 0 ? cVar.skipAiCallsConsent : bool2;
        Boolean bool14 = (1073741824 & i) != 0 ? cVar.skipAnalyticsEventTrackingConsent : bool2;
        if ((i & Integer.MIN_VALUE) != 0) {
            bool2 = cVar.skipJuniorGraduationAccountLinked;
        }
        return new c(cVar3, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, bool3, bool4, aVar2, bool5, bool6, bool7, bool8, str32, bool9, bVar2, bool10, bool11, bool12, bool13, bool14, bool2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getSkipDocumentKyc() {
        return this.skipDocumentKyc;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Boolean getSkipJuniorGraduationAccountLinked() {
        return this.skipJuniorGraduationAccountLinked;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getSkipMarketingConsent() {
        return this.skipMarketingConsent;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getSkipProfileDetails() {
        return this.skipProfileDetails;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Boolean getSkipUsIdCode() {
        return this.skipUsIdCode;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getSsn() {
        return this.ssn;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final so3.c getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddressRef() {
        return this.addressRef;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.addressRef, cVar.addressRef) && Intrinsics.f(this.firstName, cVar.firstName) && Intrinsics.f(this.lastName, cVar.lastName) && Intrinsics.f(this.middleName, cVar.middleName) && Intrinsics.f(this.birthDate, cVar.birthDate) && Intrinsics.f(this.email, cVar.email) && Intrinsics.f(this.purposeOfAccount, cVar.purposeOfAccount) && Intrinsics.f(this.alias, cVar.alias) && Intrinsics.f(this.nativeFirstName, cVar.nativeFirstName) && Intrinsics.f(this.nativeLastName, cVar.nativeLastName) && Intrinsics.f(this.firstSurname, cVar.firstSurname) && Intrinsics.f(this.secondSurname, cVar.secondSurname) && Intrinsics.f(this.occupation, cVar.occupation) && Intrinsics.f(this.ssn, cVar.ssn) && Intrinsics.f(this.itin, cVar.itin) && Intrinsics.f(this.skipActivationReady, cVar.skipActivationReady) && Intrinsics.f(this.skipUsIdCode, cVar.skipUsIdCode) && Intrinsics.f(this.contacts, cVar.contacts) && Intrinsics.f(this.skipDocumentKyc, cVar.skipDocumentKyc) && Intrinsics.f(this.skipCitizenship, cVar.skipCitizenship) && Intrinsics.f(this.skipAddressVerificationKyc, cVar.skipAddressVerificationKyc) && Intrinsics.f(this.skipMarketingConsent, cVar.skipMarketingConsent) && Intrinsics.f(this.username, cVar.username) && Intrinsics.f(this.politicallyExposedPersonDeclaration, cVar.politicallyExposedPersonDeclaration) && Intrinsics.f(this.monthlyIncomeAmount, cVar.monthlyIncomeAmount) && Intrinsics.f(this.skipDocumentId, cVar.skipDocumentId) && Intrinsics.f(this.skipProfileDetails, cVar.skipProfileDetails) && Intrinsics.f(this.skipContactsSync, cVar.skipContactsSync) && Intrinsics.f(this.skipAiCallsConsent, cVar.skipAiCallsConsent) && Intrinsics.f(this.skipAnalyticsEventTrackingConsent, cVar.skipAnalyticsEventTrackingConsent) && Intrinsics.f(this.skipJuniorGraduationAccountLinked, cVar.skipJuniorGraduationAccountLinked);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getContacts() {
        return this.contacts;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final int hashCode() {
        so3.c cVar = this.address;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.addressRef;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.middleName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.purposeOfAccount;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.alias;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.nativeFirstName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.nativeLastName;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.firstSurname;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.secondSurname;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.occupation;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ssn;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.itin;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.skipActivationReady;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipUsIdCode;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        a aVar = this.contacts;
        int iHashCode19 = (iHashCode18 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool3 = this.skipDocumentKyc;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.skipCitizenship;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.skipAddressVerificationKyc;
        int iHashCode22 = (iHashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.skipMarketingConsent;
        int iHashCode23 = (iHashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str16 = this.username;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool7 = this.politicallyExposedPersonDeclaration;
        int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        b bVar = this.monthlyIncomeAmount;
        int iHashCode26 = (iHashCode25 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool8 = this.skipDocumentId;
        int iHashCode27 = (iHashCode26 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.skipProfileDetails;
        int iHashCode28 = (iHashCode27 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.skipContactsSync;
        int iHashCode29 = (iHashCode28 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.skipAiCallsConsent;
        int iHashCode30 = (iHashCode29 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.skipAnalyticsEventTrackingConsent;
        int iHashCode31 = (iHashCode30 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.skipJuniorGraduationAccountLinked;
        return iHashCode31 + (bool13 != null ? bool13.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFirstSurname() {
        return this.firstSurname;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getItin() {
        return this.itin;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final b getMonthlyIncomeAmount() {
        return this.monthlyIncomeAmount;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNativeFirstName() {
        return this.nativeFirstName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNativeLastName() {
        return this.nativeLastName;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getOccupation() {
        return this.occupation;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getPoliticallyExposedPersonDeclaration() {
        return this.politicallyExposedPersonDeclaration;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPurposeOfAccount() {
        return this.purposeOfAccount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getSecondSurname() {
        return this.secondSurname;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getSkipActivationReady() {
        return this.skipActivationReady;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getSkipAddressVerificationKyc() {
        return this.skipAddressVerificationKyc;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getSkipAiCallsConsent() {
        return this.skipAiCallsConsent;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Boolean getSkipAnalyticsEventTrackingConsent() {
        return this.skipAnalyticsEventTrackingConsent;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getSkipCitizenship() {
        return this.skipCitizenship;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getSkipContactsSync() {
        return this.skipContactsSync;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getSkipDocumentId() {
        return this.skipDocumentId;
    }

    public /* synthetic */ c(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public c(so3.c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, a aVar, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str16, Boolean bool7, b bVar, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13) {
        this.address = cVar;
        this.addressRef = str;
        this.firstName = str2;
        this.lastName = str3;
        this.middleName = str4;
        this.birthDate = str5;
        this.email = str6;
        this.purposeOfAccount = str7;
        this.alias = str8;
        this.nativeFirstName = str9;
        this.nativeLastName = str10;
        this.firstSurname = str11;
        this.secondSurname = str12;
        this.occupation = str13;
        this.ssn = str14;
        this.itin = str15;
        this.skipActivationReady = bool;
        this.skipUsIdCode = bool2;
        this.contacts = aVar;
        this.skipDocumentKyc = bool3;
        this.skipCitizenship = bool4;
        this.skipAddressVerificationKyc = bool5;
        this.skipMarketingConsent = bool6;
        this.username = str16;
        this.politicallyExposedPersonDeclaration = bool7;
        this.monthlyIncomeAmount = bVar;
        this.skipDocumentId = bool8;
        this.skipProfileDetails = bool9;
        this.skipContactsSync = bool10;
        this.skipAiCallsConsent = bool11;
        this.skipAnalyticsEventTrackingConsent = bool12;
        this.skipJuniorGraduationAccountLinked = bool13;
    }
}
