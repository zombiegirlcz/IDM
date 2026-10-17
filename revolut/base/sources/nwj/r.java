package nwj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u001c\u0010;\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001c\u0010D\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\u0004¨\u0006H"}, d2 = {"Lnwj/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPassword", "password", "b", "getEmail", "email", "Lno3/b;", "c", "Lno3/b;", "getAddress", "()Lno3/b;", "address", "d", "getAddressRef", "addressRef", "e", "getBirthDate", "birthDate", "Lnwj/d;", "f", "Lnwj/d;", "getIdentityDetails", "()Lnwj/d;", "identityDetails", "", "g", "Ljava/lang/Boolean;", "getContactsAccessAllowed", "()Ljava/lang/Boolean;", "contactsAccessAllowed", "", "h", "Ljava/util/Set;", "getContacts", "()Ljava/util/Set;", "contacts", "", "i", "Ljava/util/List;", "getSkippedSteps", "()Ljava/util/List;", "skippedSteps", "j", "getUsername", "username", "k", "getPoliticallyExposedPersonDeclaration", "politicallyExposedPersonDeclaration", "Lnwj/e;", "l", "Lnwj/e;", "getMonthlyIncome", "()Lnwj/e;", "monthlyIncome", "m", "getDeviceFingerprint", "deviceFingerprint", "Lnwj/f;", "n", "Lnwj/f;", "getNameContainer", "()Lnwj/f;", "nameContainer", "o", "getWorkflowStepId", "workflowStepId", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("password")
    private final String password;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final no3.b address;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("addressRef")
    private final String addressRef;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("birthDate")
    private final String birthDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("identityDetails")
    private final d identityDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactsAccessAllowed")
    private final Boolean contactsAccessAllowed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("contacts")
    private final Set<String> contacts;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("skippedSteps")
    private final List<String> skippedSteps;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("username")
    private final String username;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("politicallyExposedPersonDeclaration")
    private final Boolean politicallyExposedPersonDeclaration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyIncome")
    private final e monthlyIncome;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("deviceFingerprint")
    private final String deviceFingerprint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("nameContainer")
    private final f nameContainer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("stepId")
    private final String workflowStepId;

    public r() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.password, rVar.password) && Intrinsics.f(this.email, rVar.email) && Intrinsics.f(this.address, rVar.address) && Intrinsics.f(this.addressRef, rVar.addressRef) && Intrinsics.f(this.birthDate, rVar.birthDate) && Intrinsics.f(this.identityDetails, rVar.identityDetails) && Intrinsics.f(this.contactsAccessAllowed, rVar.contactsAccessAllowed) && Intrinsics.f(this.contacts, rVar.contacts) && Intrinsics.f(this.skippedSteps, rVar.skippedSteps) && Intrinsics.f(this.username, rVar.username) && Intrinsics.f(this.politicallyExposedPersonDeclaration, rVar.politicallyExposedPersonDeclaration) && Intrinsics.f(this.monthlyIncome, rVar.monthlyIncome) && Intrinsics.f(this.deviceFingerprint, rVar.deviceFingerprint) && Intrinsics.f(this.nameContainer, rVar.nameContainer) && Intrinsics.f(this.workflowStepId, rVar.workflowStepId);
    }

    public final int hashCode() {
        String str = this.password;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        no3.b bVar = this.address;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.addressRef;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar = this.identityDetails;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool = this.contactsAccessAllowed;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Set<String> set = this.contacts;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        List<String> list = this.skippedSteps;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.username;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.politicallyExposedPersonDeclaration;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        e eVar = this.monthlyIncome;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str6 = this.deviceFingerprint;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        f fVar = this.nameContainer;
        int iHashCode14 = (iHashCode13 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str7 = this.workflowStepId;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    public r(String str, String str2, no3.b bVar, String str3, String str4, d dVar, Boolean bool, Set set, ArrayList arrayList, String str5, Boolean bool2, e eVar, String str6, f fVar, String str7) {
        this.password = str;
        this.email = str2;
        this.address = bVar;
        this.addressRef = str3;
        this.birthDate = str4;
        this.identityDetails = dVar;
        this.contactsAccessAllowed = bool;
        this.contacts = set;
        this.skippedSteps = arrayList;
        this.username = str5;
        this.politicallyExposedPersonDeclaration = bool2;
        this.monthlyIncome = eVar;
        this.deviceFingerprint = str6;
        this.nameContainer = fVar;
        this.workflowStepId = str7;
    }
}
