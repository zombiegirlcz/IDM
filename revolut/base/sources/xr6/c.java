package xr6;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.c f308255c;
    public final n d;
    public final l e;

    public c(p.c eventType, n source, l lVar) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f308255c = eventType;
        this.d = source;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308255c, cVar.f308255c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iF = y.f(this.d.f308266a, this.f308255c.hashCode() * 31, 31);
        l lVar = this.e;
        return iF + (lVar == null ? 0 : lVar.hashCode());
    }

    @Override // hx7.i
    public final p l() {
        return this.f308255c;
    }

    @Override // hx7.i
    public final o q() {
        return this.d;
    }
}
