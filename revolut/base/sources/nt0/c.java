package nt0;

import aw0.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f218943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut0.a f218944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f218945c;

    public c(d0 ratio, ut0.a strategy, int i) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f218943a = ratio;
        this.f218944b = strategy;
        this.f218945c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218943a, cVar.f218943a) && this.f218944b == cVar.f218944b && this.f218945c == cVar.f218945c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218945c) + ((this.f218944b.hashCode() + (this.f218943a.hashCode() * 31)) * 31);
    }
}
