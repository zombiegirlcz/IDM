package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272696a;

    public d8(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f272696a = categoryId;
    }

    public final String a() {
        return this.f272696a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d8) && Intrinsics.f(this.f272696a, ((d8) obj2).f272696a);
    }

    public final int hashCode() {
        return this.f272696a.hashCode();
    }
}
