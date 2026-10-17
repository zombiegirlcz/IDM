package ai9;

import grl.r2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f5216c;

    public b(a action, h slot, r2 entryPointType) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        this.f5214a = action;
        this.f5215b = slot;
        this.f5216c = entryPointType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f5214a == bVar.f5214a && Intrinsics.f(this.f5215b, bVar.f5215b) && this.f5216c == bVar.f5216c;
    }

    public final int hashCode() {
        return this.f5216c.hashCode() + ((this.f5215b.hashCode() + (this.f5214a.hashCode() * 31)) * 31);
    }
}
