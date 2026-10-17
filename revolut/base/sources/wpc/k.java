package wpc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f299224a;

    public k(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f299224a = inputData;
    }

    public final f b() {
        return this.f299224a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f299224a, ((k) obj2).f299224a);
    }

    public final int hashCode() {
        return this.f299224a.hashCode();
    }
}
