package yld;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f314694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f314695b;

    public f(LocalDate start, LocalDate end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f314694a = start;
        this.f314695b = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f314694a, fVar.f314694a) && Intrinsics.f(this.f314695b, fVar.f314695b);
    }

    public final int hashCode() {
        return this.f314695b.hashCode() + (this.f314694a.hashCode() * 31);
    }
}
