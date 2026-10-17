package aw;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.b f10137a;

    public a0(xv.b recording) {
        Intrinsics.checkNotNullParameter(recording, "recording");
        this.f10137a = recording;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f10137a, ((a0) obj2).f10137a);
    }

    public final int hashCode() {
        return this.f10137a.hashCode();
    }
}
