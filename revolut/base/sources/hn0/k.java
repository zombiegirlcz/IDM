package hn0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rm0.r;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f154023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f154024b;

    public k(c alias, r cipherVersion) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(cipherVersion, "cipherVersion");
        this.f154023a = alias;
        this.f154024b = cipherVersion;
    }

    public final c a() {
        return this.f154023a;
    }

    public final r b() {
        return this.f154024b;
    }

    public final String c() {
        int i = j.f154022a[this.f154024b.ordinal()];
        c cVar = this.f154023a;
        if (i == 1) {
            return cVar.getName();
        }
        if (i == 2) {
            return j6.a.q("2:", cVar.getName());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f154023a, kVar.f154023a) && this.f154024b == kVar.f154024b;
    }

    public final int hashCode() {
        return this.f154024b.hashCode() + (this.f154023a.hashCode() * 31);
    }
}
