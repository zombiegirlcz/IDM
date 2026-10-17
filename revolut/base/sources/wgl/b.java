package wgl;

import kotlin.jvm.internal.Intrinsics;
import zel.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f297339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.c f297340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zel.a f297341c;

    public b(f fVar, zel.c type, zel.a period) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f297339a = fVar;
        this.f297340b = type;
        this.f297341c = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f297339a == bVar.f297339a && this.f297340b == bVar.f297340b && this.f297341c == bVar.f297341c;
    }

    public final int hashCode() {
        f fVar = this.f297339a;
        return this.f297341c.hashCode() + ((this.f297340b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31);
    }
}
