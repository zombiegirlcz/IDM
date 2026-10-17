package gvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147143a;

    public r(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f147143a = deviceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f147143a, ((r) obj2).f147143a);
    }

    public final int hashCode() {
        return this.f147143a.hashCode();
    }
}
