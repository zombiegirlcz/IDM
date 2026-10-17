package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends hx7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.e f308257c;

    public e(p.e eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f308257c = eventType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f308257c.equals(((e) obj2).f308257c);
    }

    public final int hashCode() {
        return this.f308257c.hashCode() * 31;
    }

    @Override // hx7.i
    public final p l() {
        return this.f308257c;
    }

    @Override // hx7.i
    public final o q() {
        return null;
    }
}
