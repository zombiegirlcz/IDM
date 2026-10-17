package xv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309126a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f309126a, ((f) obj2).f309126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f309126a.hashCode();
    }

    public final String toString() {
        return p.a.p("FaceDetector(modelVersion=", this.f309126a, ")");
    }
}
