package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f147436c = {null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147438b;

    public /* synthetic */ k1(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(i1.f147422a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147437a = aVar;
        this.f147438b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f147437a, k1Var.f147437a) && Intrinsics.f(this.f147438b, k1Var.f147438b);
    }

    public final int hashCode() {
        int iHashCode = this.f147437a.hashCode() * 31;
        List list = this.f147438b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public k1(jo3.a passPrice, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.f147437a = passPrice;
        this.f147438b = arrayList;
    }
}
