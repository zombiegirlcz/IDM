package nof;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218024c;
    public final i7 d;

    public c(int i, dj0.d spentAmount, String merchantName, i7 filter) {
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f218022a = i;
        this.f218023b = spentAmount;
        this.f218024c = merchantName;
        this.d = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f218022a == cVar.f218022a && Intrinsics.f(this.f218023b, cVar.f218023b) && Intrinsics.f(this.f218024c, cVar.f218024c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(v7.c(Integer.hashCode(this.f218022a) * 31, 31, this.f218023b), 31, this.f218024c);
    }
}
