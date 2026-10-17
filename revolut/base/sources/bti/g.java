package bti;

import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f18600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18601c;

    public g(dj0.d originalPrice, String token, ArrayList pointsOptions) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f18599a = token;
        this.f18600b = originalPrice;
        this.f18601c = pointsOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f18599a, gVar.f18599a) && this.f18600b.equals(gVar.f18600b) && this.f18601c.equals(gVar.f18601c);
    }

    public final int hashCode() {
        return this.f18601c.hashCode() + v7.c(this.f18599a.hashCode() * 31, 31, this.f18600b);
    }
}
