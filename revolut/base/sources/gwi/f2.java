package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f147395c;

    public /* synthetic */ f2(int i, String str, String str2, jo3.a aVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(d2.f147370a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147393a = str;
        this.f147394b = str2;
        this.f147395c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f147393a, f2Var.f147393a) && Intrinsics.f(this.f147394b, f2Var.f147394b) && Intrinsics.f(this.f147395c, f2Var.f147395c);
    }

    public final int hashCode() {
        return this.f147395c.hashCode() + p.a.c(this.f147393a.hashCode() * 31, 31, this.f147394b);
    }

    public f2(String planId, String passType, jo3.a passPrice) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.f147393a = planId;
        this.f147394b = passType;
        this.f147395c = passPrice;
    }
}
