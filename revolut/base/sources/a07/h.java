package a07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147a;

    public h(String taxProfileId) {
        Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
        this.f147a = taxProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f147a, ((h) obj2).f147a);
    }

    public final int hashCode() {
        return this.f147a.hashCode();
    }
}
