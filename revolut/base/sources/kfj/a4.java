package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0013\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u000e\u0010$¨\u0006&"}, d2 = {"Lkfj/a4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "g", "state", "c", "phoneNumber", "", "d", "Z", "f", "()Z", "primary", "e", "i", "temporary", "label", "", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "suspensionDate", "j", "terminationDate", "Lkfj/f4;", "Lkfj/f4;", "()Lkfj/f4;", "porting", "Lkfj/d4;", "Lkfj/d4;", "()Lkfj/d4;", "portOutEligibility", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumber")
    @NotNull
    private final String phoneNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("primary")
    private final boolean primary;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("temporary")
    private final boolean temporary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("suspensionDate")
    private final Long suspensionDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminationDate")
    private final Long terminationDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("porting")
    private final f4 porting;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("portOutEligibility")
    private final d4 portOutEligibility;

    public a4(String id10, String state, String phoneNumber, boolean z, boolean z3, String str, Long l2, Long l3, f4 f4Var, d4 d4Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.id = id10;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.primary = z;
        this.temporary = z3;
        this.label = str;
        this.suspensionDate = l2;
        this.terminationDate = l3;
        this.porting = f4Var;
        this.portOutEligibility = d4Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d4 getPortOutEligibility() {
        return this.portOutEligibility;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f4 getPorting() {
        return this.porting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.id, a4Var.id) && Intrinsics.f(this.state, a4Var.state) && Intrinsics.f(this.phoneNumber, a4Var.phoneNumber) && this.primary == a4Var.primary && this.temporary == a4Var.temporary && Intrinsics.f(this.label, a4Var.label) && Intrinsics.f(this.suspensionDate, a4Var.suspensionDate) && Intrinsics.f(this.terminationDate, a4Var.terminationDate) && Intrinsics.f(this.porting, a4Var.porting) && Intrinsics.f(this.portOutEligibility, a4Var.portOutEligibility);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getSuspensionDate() {
        return this.suspensionDate;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.phoneNumber), 31, this.primary), 31, this.temporary);
        String str = this.label;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.suspensionDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.terminationDate;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        f4 f4Var = this.porting;
        int iHashCode4 = (iHashCode3 + (f4Var == null ? 0 : f4Var.hashCode())) * 31;
        d4 d4Var = this.portOutEligibility;
        return iHashCode4 + (d4Var != null ? d4Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getTemporary() {
        return this.temporary;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getTerminationDate() {
        return this.terminationDate;
    }
}
