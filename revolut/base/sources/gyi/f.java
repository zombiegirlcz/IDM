package gyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svi.m f147884a;

    public f(svi.m gifted) {
        Intrinsics.checkNotNullParameter(gifted, "gifted");
        this.f147884a = gifted;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f147884a, ((f) obj2).f147884a);
    }

    public final int hashCode() {
        return this.f147884a.hashCode();
    }
}
