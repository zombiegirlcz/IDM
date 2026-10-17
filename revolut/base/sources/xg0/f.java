package xg0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f305462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f305463b;

    public f(Set modules, d status) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f305462a = modules;
        this.f305463b = status;
    }

    @Override // xg0.g
    public final Set a() {
        return this.f305462a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f305462a, fVar.f305462a) && this.f305463b == fVar.f305463b;
    }

    public final int hashCode() {
        return this.f305463b.hashCode() + (this.f305462a.hashCode() * 31);
    }
}
