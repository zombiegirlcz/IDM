package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.d f308256c;
    public final m d;

    public d(p.d eventType, m source) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f308256c = eventType;
        this.d = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f308256c, dVar.f308256c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.f308265a.hashCode() + (this.f308256c.hashCode() * 31);
    }

    @Override // hx7.i
    public final p l() {
        return this.f308256c;
    }

    @Override // hx7.i
    public final o q() {
        return this.d;
    }
}
