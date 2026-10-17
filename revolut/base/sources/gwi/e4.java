package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class e4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147380b;

    public /* synthetic */ e4(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(c4.f147366a.getDescriptor(), i, 1);
            throw null;
        }
        this.f147379a = str;
        if ((i & 2) == 0) {
            this.f147380b = null;
        } else {
            this.f147380b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.f147379a, e4Var.f147379a) && Intrinsics.f(this.f147380b, e4Var.f147380b);
    }

    public final int hashCode() {
        int iHashCode = this.f147379a.hashCode() * 31;
        String str = this.f147380b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public e4(String icon, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f147379a = icon;
        this.f147380b = str;
    }
}
