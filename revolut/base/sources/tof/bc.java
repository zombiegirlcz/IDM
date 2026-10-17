package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bc extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttf.b f272655a;

    public bc(ttf.b catalogue) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        this.f272655a = catalogue;
    }

    public final ttf.b a() {
        return this.f272655a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bc) && this.f272655a == ((bc) obj2).f272655a;
    }

    public final int hashCode() {
        return this.f272655a.hashCode();
    }
}
