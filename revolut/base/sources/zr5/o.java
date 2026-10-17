package zr5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f324601a;

    public o(y50.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f324601a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f324601a, ((o) obj2).f324601a);
    }

    public final int hashCode() {
        return this.f324601a.hashCode();
    }
}
