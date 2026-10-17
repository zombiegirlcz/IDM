package jng;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b\u001d\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006+"}, d2 = {"Ljng/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "service", "", "c", "J", "()J", "createdDate", "Lso3/c;", "d", "Lso3/c;", "()Lso3/c;", "address", "i", "state", "Ljng/k;", "f", "Ljng/k;", "()Ljng/k;", "identityDetails", "g", "k", "terminationReason", "annualIncomeRange", "Ljng/d;", "Ljng/d;", "()Ljng/d;", "salariedUser", "Ljng/f;", "j", "Ljng/f;", "()Ljng/f;", "student", "graduationId", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("service")
    @NotNull
    private final String service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("address")
    private final so3.c address;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("identityDetails")
    private final k identityDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminationReason")
    private final String terminationReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualIncomeRange")
    private final String annualIncomeRange;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("salariedUser")
    private final d salariedUser;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("student")
    private final f student;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("graduationId")
    private final String graduationId;

    public c(String id10, String service, long j2, so3.c cVar, String state, k kVar, String str, String str2, d dVar, f fVar, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.service = service;
        this.createdDate = j2;
        this.address = cVar;
        this.state = state;
        this.identityDetails = kVar;
        this.terminationReason = str;
        this.annualIncomeRange = str2;
        this.salariedUser = dVar;
        this.student = fVar;
        this.graduationId = str3;
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
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGraduationId() {
        return this.graduationId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.service, cVar.service) && this.createdDate == cVar.createdDate && Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.identityDetails, cVar.identityDetails) && Intrinsics.f(this.terminationReason, cVar.terminationReason) && Intrinsics.f(this.annualIncomeRange, cVar.annualIncomeRange) && Intrinsics.f(this.salariedUser, cVar.salariedUser) && Intrinsics.f(this.student, cVar.student) && Intrinsics.f(this.graduationId, cVar.graduationId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getIdentityDetails() {
        return this.identityDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getSalariedUser() {
        return this.salariedUser;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getService() {
        return this.service;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.service), 31, this.createdDate);
        so3.c cVar = this.address;
        int iC2 = p.a.c((iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.state);
        k kVar = this.identityDetails;
        int iHashCode = (iC2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.terminationReason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.annualIncomeRange;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.salariedUser;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.student;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str3 = this.graduationId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f getStudent() {
        return this.student;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTerminationReason() {
        return this.terminationReason;
    }
}
