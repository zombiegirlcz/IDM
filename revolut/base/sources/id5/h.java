package id5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f160426a;

    public h(y50.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f160426a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f160426a, ((h) obj2).f160426a);
    }

    public final int hashCode() {
        return this.f160426a.hashCode();
    }
}
