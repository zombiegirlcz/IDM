package xg0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f305458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f305459b;

    public b(Set modules, c status) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f305458a = modules;
        this.f305459b = status;
    }

    @Override // xg0.g
    public final Set a() {
        return this.f305458a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f305458a, bVar.f305458a) && this.f305459b == bVar.f305459b;
    }

    public final int hashCode() {
        return this.f305459b.hashCode() + (this.f305458a.hashCode() * 31);
    }
}
