package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f265949a;

    public m1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f265949a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m1) && Intrinsics.f(this.f265949a, ((m1) obj2).f265949a);
    }

    public final int hashCode() {
        return this.f265949a.hashCode();
    }
}
