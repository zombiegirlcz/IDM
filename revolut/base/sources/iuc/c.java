package iuc;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kuc.d f168547a;

    public c(kuc.d gamblingBlockState) {
        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
        this.f168547a = gamblingBlockState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f168547a, ((c) obj2).f168547a);
    }

    public final int hashCode() {
        return this.f168547a.hashCode();
    }
}
