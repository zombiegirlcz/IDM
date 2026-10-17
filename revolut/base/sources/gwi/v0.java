package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f147536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147537c;

    public /* synthetic */ v0(long j2, long j3, int i, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(t0.f147519a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147535a = str;
        this.f147536b = j2;
        this.f147537c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f147535a, v0Var.f147535a) && this.f147536b == v0Var.f147536b && this.f147537c == v0Var.f147537c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147537c) + a0.d.c(this.f147535a.hashCode() * 31, 31, this.f147536b);
    }
}
