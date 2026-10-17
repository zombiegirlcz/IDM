package boc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alc.d f17387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17388b;

    public j(alc.d action, String portfolioId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f17387a = action;
        this.f17388b = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f17387a == jVar.f17387a && Intrinsics.f(this.f17388b, jVar.f17388b);
    }

    public final int hashCode() {
        return this.f17388b.hashCode() + (this.f17387a.hashCode() * 31);
    }
}
