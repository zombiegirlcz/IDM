package q09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u09.k f241216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u09.q f241217b;

    public y(u09.k courseMode, u09.q lesson) {
        Intrinsics.checkNotNullParameter(courseMode, "courseMode");
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        this.f241216a = courseMode;
        this.f241217b = lesson;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f241216a == yVar.f241216a && Intrinsics.f(this.f241217b, yVar.f241217b);
    }

    public final int hashCode() {
        return this.f241217b.hashCode() + (this.f241216a.hashCode() * 31);
    }
}
