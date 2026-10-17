package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class s5 {

    @NotNull
    public static final o5 Companion = new o5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5 f147516b;

    public /* synthetic */ s5(int i, String str, r5 r5Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(n5.f147479a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147515a = str;
        this.f147516b = r5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Intrinsics.f(this.f147515a, s5Var.f147515a) && Intrinsics.f(this.f147516b, s5Var.f147516b);
    }

    public final int hashCode() {
        int iHashCode = this.f147515a.hashCode() * 31;
        r5 r5Var = this.f147516b;
        return iHashCode + (r5Var == null ? 0 : r5Var.hashCode());
    }

    public s5(String title, r5 r5Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f147515a = title;
        this.f147516b = r5Var;
    }
}
