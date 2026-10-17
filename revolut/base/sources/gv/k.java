package gv;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import xv.u;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f147016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f147018c;

    public k(ByteBuffer bytes, int i, u uVar) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f147016a = bytes;
        this.f147017b = i;
        this.f147018c = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f147016a, kVar.f147016a) && this.f147017b == kVar.f147017b && Intrinsics.f(this.f147018c, kVar.f147018c);
    }

    public final int hashCode() {
        int iB = j6.a.b(0, j6.a.b(this.f147017b, this.f147016a.hashCode() * 31, 31), 961);
        u uVar = this.f147018c;
        return iB + (uVar != null ? uVar.hashCode() : 0);
    }
}
