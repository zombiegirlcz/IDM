package gw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz1.e f147271a;

    public h(zz1.e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f147271a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f147271a == ((h) obj2).f147271a;
    }

    public final int hashCode() {
        return this.f147271a.hashCode();
    }
}
