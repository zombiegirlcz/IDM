package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class j3 {

    @NotNull
    public static final i3 Companion = new i3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f147432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f147433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f147434c;

    public /* synthetic */ j3(int i, k1 k1Var, d3 d3Var, g3 g3Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(h3.f147409a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147432a = k1Var;
        this.f147433b = d3Var;
        this.f147434c = g3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f147432a, j3Var.f147432a) && Intrinsics.f(this.f147433b, j3Var.f147433b) && Intrinsics.f(this.f147434c, j3Var.f147434c);
    }

    public final int hashCode() {
        return this.f147434c.f147401a.hashCode() + ((this.f147433b.hashCode() + (this.f147432a.hashCode() * 31)) * 31);
    }

    public j3(k1 plans, d3 priceQuotePerPassengers, g3 config) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(priceQuotePerPassengers, "priceQuotePerPassengers");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f147432a = plans;
        this.f147433b = priceQuotePerPassengers;
        this.f147434c = config;
    }
}
