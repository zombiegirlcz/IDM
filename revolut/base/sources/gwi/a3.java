package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f147337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f147338c;

    public /* synthetic */ a3(int i, jo3.a aVar, u2 u2Var, x2 x2Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(y2.f147568a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147336a = aVar;
        this.f147337b = u2Var;
        this.f147338c = x2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f147336a, a3Var.f147336a) && Intrinsics.f(this.f147337b, a3Var.f147337b) && Intrinsics.f(this.f147338c, a3Var.f147338c);
    }

    public final int hashCode() {
        int iHashCode = (this.f147337b.hashCode() + (this.f147336a.hashCode() * 31)) * 31;
        x2 x2Var = this.f147338c;
        return iHashCode + (x2Var == null ? 0 : x2Var.hashCode());
    }

    public a3(jo3.a totalPrice, u2 planDiscount, x2 x2Var) {
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(planDiscount, "planDiscount");
        this.f147336a = totalPrice;
        this.f147337b = planDiscount;
        this.f147338c = x2Var;
    }
}
