package kqa;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f188359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f188360b;

    public b(d lower, d upper) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        this.f188359a = lower;
        this.f188360b = upper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f188359a, bVar.f188359a) && Intrinsics.f(this.f188360b, bVar.f188360b);
    }

    public final int hashCode() {
        return this.f188360b.hashCode() + (this.f188359a.hashCode() * 31);
    }
}
