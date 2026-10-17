package odf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f224459a;

    public c(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f224459a = inputData;
    }

    public final f b() {
        return this.f224459a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224459a, ((c) obj2).f224459a);
    }

    public final int hashCode() {
        return this.f224459a.hashCode();
    }
}
