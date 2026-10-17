package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.a f308253c;
    public final m d;

    public a(p.a eventType, m source) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f308253c = eventType;
        this.d = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f308253c, aVar.f308253c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.f308265a.hashCode() + (this.f308253c.hashCode() * 31);
    }

    @Override // hx7.i
    public final p l() {
        return this.f308253c;
    }

    @Override // hx7.i
    public final o q() {
        return this.d;
    }
}
