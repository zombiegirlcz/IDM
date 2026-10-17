package vp8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.d f291142a;

    public h(dp8.d frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f291142a = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f291142a == ((h) obj2).f291142a;
    }

    public final int hashCode() {
        return this.f291142a.hashCode();
    }
}
