package gyi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147889b;

    public i(List ids, List models) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(models, "models");
        this.f147888a = ids;
        this.f147889b = models;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f147888a, iVar.f147888a) && Intrinsics.f(this.f147889b, iVar.f147889b);
    }

    public final int hashCode() {
        return this.f147889b.hashCode() + (this.f147888a.hashCode() * 31);
    }
}
