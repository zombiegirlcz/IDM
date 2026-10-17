package itk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f168414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hdh.e f168415b;

    public b(bfl.g tradeSide, hdh.e instrumentActions) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrumentActions, "instrumentActions");
        this.f168414a = tradeSide;
        this.f168415b = instrumentActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f168414a == bVar.f168414a && Intrinsics.f(this.f168415b, bVar.f168415b);
    }

    public final int hashCode() {
        return this.f168415b.f151437a.hashCode() + (this.f168414a.hashCode() * 31);
    }
}
