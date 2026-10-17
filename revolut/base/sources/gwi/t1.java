package gwi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f147522c;
    public final boolean d;

    public /* synthetic */ t1(int i, String str, jo3.a aVar, jo3.a aVar2, boolean z) {
        if (15 != (i & 15)) {
            qlm.j1.f(r1.f147504a.getDescriptor(), i, 15);
            throw null;
        }
        this.f147520a = str;
        this.f147521b = aVar;
        this.f147522c = aVar2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f147520a, t1Var.f147520a) && Intrinsics.f(this.f147521b, t1Var.f147521b) && Intrinsics.f(this.f147522c, t1Var.f147522c) && this.d == t1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.j(this.f147522c, v7.j(this.f147521b, this.f147520a.hashCode() * 31, 31), 31);
    }

    public t1(String points, jo3.a discount, jo3.a finalPrice, boolean z) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f147520a = points;
        this.f147521b = discount;
        this.f147522c = finalPrice;
        this.d = z;
    }
}
