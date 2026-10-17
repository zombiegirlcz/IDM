package g93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f141455a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f141455a, ((b) obj2).f141455a);
    }

    public final int hashCode() {
        a aVar = this.f141455a;
        if (aVar == null) {
            return 0;
        }
        return aVar.f141454a.hashCode();
    }

    public b(a aVar) {
        this.f141455a = aVar;
    }
}
