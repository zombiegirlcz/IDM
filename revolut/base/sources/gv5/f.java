package gv5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f147064b;

    public f(String anchorItemId, Object obj2) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        this.f147063a = anchorItemId;
        this.f147064b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f147063a, fVar.f147063a) && Intrinsics.f(this.f147064b, fVar.f147064b);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f147063a.hashCode() * 31, 31, false);
        Object obj2 = this.f147064b;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
