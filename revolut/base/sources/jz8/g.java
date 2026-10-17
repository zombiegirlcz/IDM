package jz8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179617b;

    public g(String categoryId, String courseId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        this.f179616a = categoryId;
        this.f179617b = courseId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f179616a, gVar.f179616a) && Intrinsics.f(this.f179617b, gVar.f179617b);
    }

    public final int hashCode() {
        return this.f179617b.hashCode() + (this.f179616a.hashCode() * 31);
    }
}
