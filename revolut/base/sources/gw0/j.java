package gw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f147240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t position) {
        super(position, false);
        Intrinsics.checkNotNullParameter(position, "position");
        this.f147240b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f147240b == ((j) obj2).f147240b;
    }

    public final int hashCode() {
        return this.f147240b.hashCode();
    }

    @Override // cam.f
    public final boolean q() {
        return ((t) this.f22677a).a();
    }
}
