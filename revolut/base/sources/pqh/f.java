package pqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f238780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.i f238781b;

    public f(zel.g selectedMetric, zel.i sortOrder) {
        Intrinsics.checkNotNullParameter(selectedMetric, "selectedMetric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f238780a = selectedMetric;
        this.f238781b = sortOrder;
    }

    public static f a(f fVar, zel.g selectedMetric, zel.i sortOrder, int i) {
        if ((i & 1) != 0) {
            selectedMetric = fVar.f238780a;
        }
        if ((i & 2) != 0) {
            sortOrder = fVar.f238781b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMetric, "selectedMetric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        return new f(selectedMetric, sortOrder);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f238780a == fVar.f238780a && this.f238781b == fVar.f238781b;
    }

    public final int hashCode() {
        return this.f238781b.hashCode() + (this.f238780a.hashCode() * 31);
    }
}
