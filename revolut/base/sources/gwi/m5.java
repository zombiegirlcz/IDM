package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class m5 {

    @NotNull
    public static final l5 Companion = new l5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147472c;
    public final k5 d;

    public /* synthetic */ m5(int i, String str, String str2, String str3, k5 k5Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(h5.f147415a.getDescriptor(), i, 15);
            throw null;
        }
        this.f147470a = str;
        this.f147471b = str2;
        this.f147472c = str3;
        this.d = k5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f147470a, m5Var.f147470a) && Intrinsics.f(this.f147471b, m5Var.f147471b) && Intrinsics.f(this.f147472c, m5Var.f147472c) && Intrinsics.f(this.d, m5Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f147470a.hashCode() * 31, 31, this.f147471b), 31, this.f147472c);
        k5 k5Var = this.d;
        return iC + (k5Var == null ? 0 : k5Var.hashCode());
    }

    public m5(String icon, String title, String subtitle, k5 k5Var) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f147470a = icon;
        this.f147471b = title;
        this.f147472c = subtitle;
        this.d = k5Var;
    }
}
