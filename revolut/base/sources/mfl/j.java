package mfl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbl.j f205029a;

    public j(wbl.j report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.f205029a = report;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f205029a, ((j) obj2).f205029a);
    }

    public final int hashCode() {
        return this.f205029a.hashCode();
    }
}
