package wgl;

import kotlin.jvm.internal.Intrinsics;
import zel.f;
import zel.k;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f297342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f297343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zel.a f297344c;

    public c(f instrumentGroup, k type, zel.a period) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f297342a = instrumentGroup;
        this.f297343b = type;
        this.f297344c = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f297342a == cVar.f297342a && this.f297343b == cVar.f297343b && this.f297344c == cVar.f297344c;
    }

    public final int hashCode() {
        return this.f297344c.hashCode() + ((this.f297343b.hashCode() + (this.f297342a.hashCode() * 31)) * 31);
    }
}
