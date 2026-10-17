package aue;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f9812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f9813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f9814c;

    public j(dj0.d totalLimit, dj0.d usedLimit, dj0.d remainingLimit) {
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        this.f9812a = totalLimit;
        this.f9813b = usedLimit;
        this.f9814c = remainingLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f9812a, jVar.f9812a) && Intrinsics.f(this.f9813b, jVar.f9813b) && Intrinsics.f(this.f9814c, jVar.f9814c);
    }

    public final int hashCode() {
        return this.f9814c.hashCode() + v7.c(this.f9812a.hashCode() * 31, 31, this.f9813b);
    }
}
