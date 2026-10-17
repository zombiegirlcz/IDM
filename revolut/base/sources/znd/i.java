package znd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f323761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323762c;
    public final ipd.f d;

    public i(List items, g gVar, boolean z, ipd.f background) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f323760a = items;
        this.f323761b = gVar;
        this.f323762c = z;
        this.d = background;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        i iVar = oldState instanceof i ? (i) oldState : null;
        if (iVar != null) {
            return new h(!Intrinsics.f(this.f323761b, iVar.f323761b), !this.d.equals(iVar.d), this.f323762c != iVar.f323762c);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f323760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323760a, iVar.f323760a) && Intrinsics.f(this.f323761b, iVar.f323761b) && this.f323762c == iVar.f323762c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f323760a.hashCode() * 31;
        g gVar = this.f323761b;
        return this.d.hashCode() + j6.a.c((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f323762c);
    }
}
