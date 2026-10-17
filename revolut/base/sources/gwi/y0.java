package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147567b;

    public /* synthetic */ y0(int i, String str, jo3.a aVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(w0.f147549a.getDescriptor(), i, 1);
            throw null;
        }
        this.f147566a = aVar;
        if ((i & 2) == 0) {
            this.f147567b = null;
        } else {
            this.f147567b = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f147566a, y0Var.f147566a) && Intrinsics.f(this.f147567b, y0Var.f147567b);
    }

    public final int hashCode() {
        int iHashCode = this.f147566a.hashCode() * 31;
        String str = this.f147567b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
