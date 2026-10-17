package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class i2 {

    @NotNull
    public static final h2 Companion = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f147424b;

    public /* synthetic */ i2(int i, int i2, c2 c2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(g2.f147400a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147423a = i2;
        this.f147424b = c2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return this.f147423a == i2Var.f147423a && Intrinsics.f(this.f147424b, i2Var.f147424b);
    }

    public final int hashCode() {
        return this.f147424b.hashCode() + (Integer.hashCode(this.f147423a) * 31);
    }

    public i2(int i, c2 priceBreakdown) {
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        this.f147423a = i;
        this.f147424b = priceBreakdown;
    }
}
