package ruk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twk.e f257597a;

    public f(twk.e mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f257597a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f257597a == ((f) obj2).f257597a;
    }

    public final int hashCode() {
        return this.f257597a.hashCode();
    }
}
