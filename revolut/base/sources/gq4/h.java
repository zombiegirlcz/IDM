package gq4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f145548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f145549b;

    public h(io3.d mainPocket, dj0.d repaymentAmount) {
        Intrinsics.checkNotNullParameter(mainPocket, "mainPocket");
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        this.f145548a = mainPocket;
        this.f145549b = repaymentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145548a, hVar.f145548a) && Intrinsics.f(this.f145549b, hVar.f145549b);
    }

    public final int hashCode() {
        return this.f145549b.hashCode() + (this.f145548a.hashCode() * 31);
    }
}
