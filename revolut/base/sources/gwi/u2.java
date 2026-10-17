package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147530b;

    public /* synthetic */ u2(int i, jo3.a aVar, jo3.a aVar2) {
        if (3 != (i & 3)) {
            qlm.j1.f(s2.f147513a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147529a = aVar;
        this.f147530b = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.f147529a, u2Var.f147529a) && Intrinsics.f(this.f147530b, u2Var.f147530b);
    }

    public final int hashCode() {
        int iHashCode = this.f147529a.hashCode() * 31;
        jo3.a aVar = this.f147530b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public u2(jo3.a originalPrice, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f147529a = originalPrice;
        this.f147530b = aVar;
    }
}
