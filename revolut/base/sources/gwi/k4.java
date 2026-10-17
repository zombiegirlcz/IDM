package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class k4 {

    @NotNull
    public static final j4 Companion = new j4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147442c;

    public /* synthetic */ k4(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qlm.j1.f(i4.f147425a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147440a = str;
        this.f147441b = str2;
        if ((i & 4) == 0) {
            this.f147442c = null;
        } else {
            this.f147442c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f147440a, k4Var.f147440a) && Intrinsics.f(this.f147441b, k4Var.f147441b) && Intrinsics.f(this.f147442c, k4Var.f147442c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f147440a.hashCode() * 31, 31, this.f147441b);
        String str = this.f147442c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public k4(String type, String value, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f147440a = type;
        this.f147441b = value;
        this.f147442c = str;
    }
}
