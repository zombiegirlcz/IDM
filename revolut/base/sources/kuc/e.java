package kuc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f189770a;

    public e(d gamblingBlockState) {
        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
        this.f189770a = gamblingBlockState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f189770a, ((e) obj2).f189770a);
    }

    public final int hashCode() {
        return this.f189770a.hashCode();
    }
}
