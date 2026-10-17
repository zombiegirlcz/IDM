package bih;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4l.b f15495b;

    public f(String widgetKey, n4l.b showUpTo) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(showUpTo, "showUpTo");
        this.f15494a = widgetKey;
        this.f15495b = showUpTo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f15494a, fVar.f15494a) && Intrinsics.f(this.f15495b, fVar.f15495b);
    }

    public final int hashCode() {
        return this.f15495b.hashCode() + (this.f15494a.hashCode() * 31);
    }
}
