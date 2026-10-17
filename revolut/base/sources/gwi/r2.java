package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147506b;

    public /* synthetic */ r2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p2.f147493a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147505a = str;
        this.f147506b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f147505a, r2Var.f147505a) && Intrinsics.f(this.f147506b, r2Var.f147506b);
    }

    public final int hashCode() {
        return this.f147506b.hashCode() + (this.f147505a.hashCode() * 31);
    }
}
