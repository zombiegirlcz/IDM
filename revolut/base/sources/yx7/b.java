package yx7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f317584b;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f317583a == bVar.f317583a && this.f317584b == bVar.f317584b;
    }

    public final int hashCode() {
        return this.f317584b.hashCode() + (Integer.hashCode(this.f317583a) * 31);
    }

    public /* synthetic */ b(int i) {
        this(0, a.MONTH);
    }

    public b(int i, a timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f317583a = i;
        this.f317584b = timeUnit;
    }
}
