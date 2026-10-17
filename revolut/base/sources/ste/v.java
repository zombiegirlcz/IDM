package ste;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f265576a;

    public v(r inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265576a = inputData;
    }

    public final r b() {
        return this.f265576a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f265576a, ((v) obj2).f265576a);
    }

    public final int hashCode() {
        return this.f265576a.hashCode();
    }
}
