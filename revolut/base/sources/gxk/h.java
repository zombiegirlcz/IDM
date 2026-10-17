package gxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f147766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f147767b;

    public h(a mainAssetSchedule, a aVar) {
        Intrinsics.checkNotNullParameter(mainAssetSchedule, "mainAssetSchedule");
        this.f147766a = mainAssetSchedule;
        this.f147767b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f147766a, hVar.f147766a) && Intrinsics.f(this.f147767b, hVar.f147767b);
    }

    public final int hashCode() {
        int iHashCode = this.f147766a.hashCode() * 31;
        a aVar = this.f147767b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
