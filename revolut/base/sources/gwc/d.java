package gwc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147308a;

    public d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f147308a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f147308a, ((d) obj2).f147308a);
    }

    public final int hashCode() {
        return this.f147308a.hashCode();
    }
}
