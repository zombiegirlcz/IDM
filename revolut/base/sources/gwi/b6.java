package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class b6 {

    @NotNull
    public static final u5 Companion = new u5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5 f147354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f147355b;

    public /* synthetic */ b6(int i, x5 x5Var, a6 a6Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(t5.f147526a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147354a = x5Var;
        this.f147355b = a6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return Intrinsics.f(this.f147354a, b6Var.f147354a) && Intrinsics.f(this.f147355b, b6Var.f147355b);
    }

    public final int hashCode() {
        return this.f147355b.hashCode() + (this.f147354a.hashCode() * 31);
    }

    public b6(x5 homePage, a6 howToAccessPage) {
        Intrinsics.checkNotNullParameter(homePage, "homePage");
        Intrinsics.checkNotNullParameter(howToAccessPage, "howToAccessPage");
        this.f147354a = homePage;
        this.f147355b = howToAccessPage;
    }
}
