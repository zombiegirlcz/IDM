package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.b f308254c;
    public final l d;

    public b(p.b eventType, j jVar) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f308254c = eventType;
        this.d = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f308254c.equals(bVar.f308254c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f308254c.hashCode() * 961;
        l lVar = this.d;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    @Override // hx7.i
    public final p l() {
        return this.f308254c;
    }

    @Override // hx7.i
    public final o q() {
        return null;
    }
}
