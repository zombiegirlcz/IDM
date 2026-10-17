package bti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f18613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f18614c;

    public k(String token, dj0.d originalPrice, f pointsOption) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOption, "pointsOption");
        this.f18612a = token;
        this.f18613b = originalPrice;
        this.f18614c = pointsOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f18612a, kVar.f18612a) && Intrinsics.f(this.f18613b, kVar.f18613b) && Intrinsics.f(this.f18614c, kVar.f18614c);
    }

    public final int hashCode() {
        return this.f18614c.hashCode() + v7.c(this.f18612a.hashCode() * 31, 31, this.f18613b);
    }
}
