package gx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.c f147615a;

    public g(k71.c descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f147615a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f147615a, ((g) obj2).f147615a);
    }

    public final int hashCode() {
        return this.f147615a.f181775b.hashCode();
    }
}
