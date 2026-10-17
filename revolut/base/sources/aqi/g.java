package aqi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.c f8467b;

    public g(int i, y80.c result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f8466a = i;
        this.f8467b = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f8466a == gVar.f8466a && Intrinsics.f(this.f8467b, gVar.f8467b);
    }

    public final int hashCode() {
        return this.f8467b.hashCode() + (Integer.hashCode(this.f8466a) * 31);
    }
}
