package j6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f171786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f171788c;

    public o(dj0.d targetProductTopUpLimit, dj0.d bestIASProductLimit, String bestIASProductName) {
        Intrinsics.checkNotNullParameter(targetProductTopUpLimit, "targetProductTopUpLimit");
        Intrinsics.checkNotNullParameter(bestIASProductName, "bestIASProductName");
        Intrinsics.checkNotNullParameter(bestIASProductLimit, "bestIASProductLimit");
        this.f171786a = targetProductTopUpLimit;
        this.f171787b = bestIASProductName;
        this.f171788c = bestIASProductLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f171786a, oVar.f171786a) && Intrinsics.f(this.f171787b, oVar.f171787b) && Intrinsics.f(this.f171788c, oVar.f171788c);
    }

    public final int hashCode() {
        return this.f171788c.hashCode() + p.a.c(this.f171786a.hashCode() * 31, 31, this.f171787b);
    }
}
