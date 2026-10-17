package ds4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import ql4.n0;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f117208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f117209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117210c;
    public final boolean d;

    public f(n0 ineligibility, dj0.d overdueAmount, String facilityId, boolean z) {
        Intrinsics.checkNotNullParameter(ineligibility, "ineligibility");
        Intrinsics.checkNotNullParameter(overdueAmount, "overdueAmount");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f117208a = ineligibility;
        this.f117209b = overdueAmount;
        this.f117210c = facilityId;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f117208a, fVar.f117208a) && Intrinsics.f(this.f117209b, fVar.f117209b) && Intrinsics.f(this.f117210c, fVar.f117210c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(v7.c(this.f117208a.hashCode() * 31, 31, this.f117209b), 31, this.f117210c);
    }
}
