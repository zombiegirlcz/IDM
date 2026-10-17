package gw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f147241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t position, boolean z) {
        super(position, false);
        Intrinsics.checkNotNullParameter(position, "position");
        this.f147241b = position;
        this.f147242c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f147241b == kVar.f147241b && this.f147242c == kVar.f147242c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147242c) + (this.f147241b.hashCode() * 31);
    }

    @Override // cam.f
    public final boolean q() {
        return false;
    }
}
