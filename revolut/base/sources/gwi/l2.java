package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class l2 {

    @NotNull
    public static final k2 Companion = new k2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f147451c;

    public /* synthetic */ l2(int i, int i2, String str, z1 z1Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(j2.f147431a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147449a = i2;
        this.f147450b = str;
        this.f147451c = z1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return this.f147449a == l2Var.f147449a && Intrinsics.f(this.f147450b, l2Var.f147450b) && Intrinsics.f(this.f147451c, l2Var.f147451c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f147449a) * 31;
        String str = this.f147450b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z1 z1Var = this.f147451c;
        return iHashCode2 + (z1Var != null ? z1Var.hashCode() : 0);
    }

    public l2(int i, String str, z1 z1Var) {
        this.f147449a = i;
        this.f147450b = str;
        this.f147451c = z1Var;
    }
}
