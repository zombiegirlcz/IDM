package gvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147144a;

    public s(String esimProfileId) {
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        this.f147144a = esimProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f147144a, ((s) obj2).f147144a);
    }

    public final int hashCode() {
        return this.f147144a.hashCode();
    }
}
