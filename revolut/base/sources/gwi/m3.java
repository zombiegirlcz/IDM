package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class m3 {

    @NotNull
    public static final l3 Companion = new l3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f147469c;
    public final String d;
    public final boolean e;

    public /* synthetic */ m3(int i, int i2, int i3, long j2, String str, boolean z) {
        if (31 != (i & 31)) {
            qlm.j1.f(k3.f147439a.getDescriptor(), i, 31);
            throw null;
        }
        this.f147467a = i2;
        this.f147468b = i3;
        this.f147469c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return this.f147467a == m3Var.f147467a && this.f147468b == m3Var.f147468b && this.f147469c == m3Var.f147469c && Intrinsics.f(this.d, m3Var.d) && this.e == m3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(a0.d.c(j6.a.b(this.f147468b, Integer.hashCode(this.f147467a) * 31, 31), 31, this.f147469c), 31, this.d);
    }
}
