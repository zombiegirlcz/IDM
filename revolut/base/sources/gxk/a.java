package gxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f147760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147761b;

    public a(g asset, d tradingSchedule) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(tradingSchedule, "tradingSchedule");
        this.f147760a = asset;
        this.f147761b = tradingSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f147760a, aVar.f147760a) && Intrinsics.f(this.f147761b, aVar.f147761b);
    }

    public final int hashCode() {
        return this.f147761b.hashCode() + (this.f147760a.hashCode() * 31);
    }
}
