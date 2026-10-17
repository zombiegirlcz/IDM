package mfl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbl.j f205023a;

    public e(wbl.j report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.f205023a = report;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f205023a, ((e) obj2).f205023a);
    }

    public final int hashCode() {
        return this.f205023a.hashCode();
    }
}
