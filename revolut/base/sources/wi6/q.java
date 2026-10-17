package wi6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f297825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f297826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f297827c;
    public final Set d;

    public q(Set pockets, Set credits, Set vaults, Set juniorPockets) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(credits, "credits");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(juniorPockets, "juniorPockets");
        this.f297825a = pockets;
        this.f297826b = credits;
        this.f297827c = vaults;
        this.d = juniorPockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f297825a, qVar.f297825a) && Intrinsics.f(this.f297826b, qVar.f297826b) && Intrinsics.f(this.f297827c, qVar.f297827c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.f(p.a.f(this.f297825a.hashCode() * 31, 31, this.f297826b), 31, this.f297827c);
    }
}
