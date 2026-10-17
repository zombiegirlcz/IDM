package c9e;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9e.b f22367b;

    public d(String subscriptionId, f9e.b mode) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f22366a = subscriptionId;
        this.f22367b = mode;
    }

    public final f9e.b b() {
        return this.f22367b;
    }

    public final String c() {
        return this.f22366a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f22366a, dVar.f22366a) && this.f22367b == dVar.f22367b;
    }

    public final int hashCode() {
        return this.f22367b.hashCode() + j6.a.c(this.f22366a.hashCode() * 31, 31, false);
    }
}
