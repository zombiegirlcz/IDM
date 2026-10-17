package oy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f230883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f230884b;

    public e(d sources, a aVar) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.f230883a = sources;
        this.f230884b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f230883a, eVar.f230883a) && Intrinsics.f(this.f230884b, eVar.f230884b);
    }

    public final int hashCode() {
        int iHashCode = this.f230883a.hashCode() * 31;
        a aVar = this.f230884b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
