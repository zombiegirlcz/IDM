package svi;

import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f265900c;

    public e0(dj0.d originalPrice, String token, ArrayList pointsOptions) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f265898a = token;
        this.f265899b = originalPrice;
        this.f265900c = pointsOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f265898a, e0Var.f265898a) && this.f265899b.equals(e0Var.f265899b) && this.f265900c.equals(e0Var.f265900c);
    }

    public final int hashCode() {
        return this.f265900c.hashCode() + v7.c(this.f265898a.hashCode() * 31, 31, this.f265899b);
    }
}
