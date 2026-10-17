package gwi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f147560c;

    public /* synthetic */ x2(int i, String str, jo3.a aVar, jo3.a aVar2) {
        if (7 != (i & 7)) {
            qlm.j1.f(v2.f147538a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147558a = str;
        this.f147559b = aVar;
        this.f147560c = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f147558a, x2Var.f147558a) && Intrinsics.f(this.f147559b, x2Var.f147559b) && Intrinsics.f(this.f147560c, x2Var.f147560c);
    }

    public final int hashCode() {
        return this.f147560c.hashCode() + v7.j(this.f147559b, this.f147558a.hashCode() * 31, 31);
    }

    public x2(jo3.a discount, jo3.a finalPrice, String points) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f147558a = points;
        this.f147559b = discount;
        this.f147560c = finalPrice;
    }
}
