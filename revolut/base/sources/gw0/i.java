package gw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f147239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t position) {
        super(position, false);
        Intrinsics.checkNotNullParameter(position, "position");
        this.f147239b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f147239b == ((i) obj2).f147239b;
    }

    public final int hashCode() {
        return this.f147239b.hashCode();
    }

    @Override // cam.f
    public final boolean q() {
        return ((t) this.f22677a).a();
    }
}
