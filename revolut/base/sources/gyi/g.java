package gyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f147887b;

    public g(String id10, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f147886a = id10;
        this.f147887b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f147886a, gVar.f147886a) && Intrinsics.f(this.f147887b, gVar.f147887b);
    }

    public final int hashCode() {
        int iHashCode = this.f147886a.hashCode() * 31;
        Object obj2 = this.f147887b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
