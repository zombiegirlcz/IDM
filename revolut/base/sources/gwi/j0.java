package gwi;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147430c;

    public /* synthetic */ j0(int i, int i2, int i3, long j2) {
        if (7 != (i & 7)) {
            qlm.j1.f(h0.f147406a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147428a = i2;
        this.f147429b = i3;
        this.f147430c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f147428a == j0Var.f147428a && this.f147429b == j0Var.f147429b && this.f147430c == j0Var.f147430c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147430c) + j6.a.b(this.f147429b, Integer.hashCode(this.f147428a) * 31, 31);
    }

    public j0(int i, int i2, long j2) {
        this.f147428a = i;
        this.f147429b = i2;
        this.f147430c = j2;
    }
}
