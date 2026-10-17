package sy;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f266556a;

    public r(p navBar) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f266556a = navBar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f266556a, ((r) obj2).f266556a);
    }

    @Override // sy.u
    public final p f() {
        return this.f266556a;
    }

    public final int hashCode() {
        return this.f266556a.hashCode();
    }
}
