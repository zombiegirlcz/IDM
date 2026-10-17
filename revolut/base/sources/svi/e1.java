package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f265901a;

    public e1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f265901a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f265901a, ((e1) obj2).f265901a);
    }

    public final int hashCode() {
        return this.f265901a.hashCode();
    }
}
