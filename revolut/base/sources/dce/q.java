package dce;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hce.a f112889b;

    public q(List items, hce.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f112888a = items;
        this.f112889b = aVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof q) {
            return new i0(!Intrinsics.f(((q) oldState).f112889b, this.f112889b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f112888a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f112888a, qVar.f112888a) && Intrinsics.f(this.f112889b, qVar.f112889b);
    }

    public final int hashCode() {
        int iHashCode = this.f112888a.hashCode() * 31;
        hce.a aVar = this.f112889b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
