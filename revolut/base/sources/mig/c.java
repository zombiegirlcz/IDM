package mig;

import hfg.n;
import hfg.o;
import kotlin.jvm.internal.Intrinsics;
import mig.b;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends b.AbstractC1167b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f205841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f205842b;

    public c(n airport, o city) {
        Intrinsics.checkNotNullParameter(airport, "airport");
        Intrinsics.checkNotNullParameter(city, "city");
        this.f205841a = airport;
        this.f205842b = city;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205841a, cVar.f205841a) && Intrinsics.f(this.f205842b, cVar.f205842b);
    }

    public final int hashCode() {
        return this.f205842b.hashCode() + (this.f205841a.f151868a.hashCode() * 31);
    }
}
