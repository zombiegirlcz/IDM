package gxk;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f147765a;

    public f(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f147765a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f147765a, ((f) obj2).f147765a);
    }

    public final int hashCode() {
        return this.f147765a.hashCode();
    }
}
