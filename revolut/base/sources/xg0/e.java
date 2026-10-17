package xg0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f305460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f305461b;

    public e(Set modules, u status) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f305460a = modules;
        this.f305461b = status;
    }

    @Override // xg0.g
    public final Set a() {
        return this.f305460a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f305460a, eVar.f305460a) && Intrinsics.f(this.f305461b, eVar.f305461b);
    }

    public final int hashCode() {
        return this.f305461b.hashCode() + (this.f305460a.hashCode() * 31);
    }
}
