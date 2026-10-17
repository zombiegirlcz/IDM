package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lbvh/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRelationship", "relationship", "b", "getFirstName", "firstName", "c", "getFirstSurname", "firstSurname", "d", "getSecondSurname", "secondSurname", "e", "getDocumentType", "documentType", "f", "getDocumentNumber", "documentNumber", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("relationship")
    private final String relationship;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstSurname")
    @NotNull
    private final String firstSurname;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondSurname")
    private final String secondSurname;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documentType")
    private final String documentType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    public t(String str, String firstName, String firstSurname, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
        this.relationship = str;
        this.firstName = firstName;
        this.firstSurname = firstSurname;
        this.secondSurname = str2;
        this.documentType = str3;
        this.documentNumber = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.relationship, tVar.relationship) && Intrinsics.f(this.firstName, tVar.firstName) && Intrinsics.f(this.firstSurname, tVar.firstSurname) && Intrinsics.f(this.secondSurname, tVar.secondSurname) && Intrinsics.f(this.documentType, tVar.documentType) && Intrinsics.f(this.documentNumber, tVar.documentNumber);
    }

    public final int hashCode() {
        String str = this.relationship;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.firstName), 31, this.firstSurname);
        String str2 = this.secondSurname;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentType;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentNumber;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
