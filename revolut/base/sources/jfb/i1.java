package jfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f173816a;

    public i1(j1 code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f173816a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && this.f173816a == ((i1) obj2).f173816a;
    }

    public final int hashCode() {
        return this.f173816a.hashCode();
    }
}
