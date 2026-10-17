package gx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx2.a f147636a;

    public p(cx2.a aVar) {
        this.f147636a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f147636a, ((p) obj2).f147636a);
    }

    public final int hashCode() {
        cx2.a aVar = this.f147636a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
