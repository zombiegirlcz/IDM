package bfd;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mgd.f f14961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f14962b;

    public d(mgd.f selected, xi0.b currency) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f14961a = selected;
        this.f14962b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f14961a == dVar.f14961a && Intrinsics.f(this.f14962b, dVar.f14962b);
    }

    public final int hashCode() {
        return this.f14962b.hashCode() + (this.f14961a.hashCode() * 31);
    }
}
