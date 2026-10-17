package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lnwj/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFirstName", "firstName", "b", "getMiddleName", "middleName", "c", "getLastName", "lastName", "d", "getFirstSurname", "firstSurname", "e", "getSecondSurname", "secondSurname", "f", "getNativeFirstName", "nativeFirstName", "g", "getNativeLastName", "nativeLastName", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("middleName")
    private final String middleName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("firstSurname")
    private final String firstSurname;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("secondSurname")
    private final String secondSurname;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nativeFirstName")
    private final String nativeFirstName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nativeLastName")
    private final String nativeLastName;

    public f() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.firstName, fVar.firstName) && Intrinsics.f(this.middleName, fVar.middleName) && Intrinsics.f(this.lastName, fVar.lastName) && Intrinsics.f(this.firstSurname, fVar.firstSurname) && Intrinsics.f(this.secondSurname, fVar.secondSurname) && Intrinsics.f(this.nativeFirstName, fVar.nativeFirstName) && Intrinsics.f(this.nativeLastName, fVar.nativeLastName);
    }

    public final int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstSurname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondSurname;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nativeFirstName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nativeLastName;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.firstSurname = str4;
        this.secondSurname = str5;
        this.nativeFirstName = str6;
        this.nativeLastName = str7;
    }
}
