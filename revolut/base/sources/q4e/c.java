package q4e;

import jel.e2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f242134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f242135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f242136c;

    public c(b rating, int i, e2 performanceBasis) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(performanceBasis, "performanceBasis");
        this.f242134a = rating;
        this.f242135b = i;
        this.f242136c = performanceBasis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f242134a == cVar.f242134a && this.f242135b == cVar.f242135b && this.f242136c == cVar.f242136c;
    }

    public final int hashCode() {
        return this.f242136c.hashCode() + j6.a.b(this.f242135b, this.f242134a.hashCode() * 31, 31);
    }
}
