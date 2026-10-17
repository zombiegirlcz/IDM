package jfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f173811a;

    public h(k code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f173811a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f173811a == ((h) obj2).f173811a;
    }

    public final int hashCode() {
        return this.f173811a.hashCode();
    }
}
