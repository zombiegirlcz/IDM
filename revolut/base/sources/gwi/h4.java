package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class h4 {

    @NotNull
    public static final g4 Companion = new g4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f147411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147412c;
    public final e4 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k4 f147414h;

    public /* synthetic */ h4(int i, String str, long j2, String str2, e4 e4Var, String str3, String str4, String str5, k4 k4Var) {
        if (23 != (i & 23)) {
            qlm.j1.f(f4.f147396a.getDescriptor(), i, 23);
            throw null;
        }
        this.f147410a = str;
        this.f147411b = j2;
        this.f147412c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = e4Var;
        }
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f147413g = null;
        } else {
            this.f147413g = str5;
        }
        if ((i & 128) == 0) {
            this.f147414h = null;
        } else {
            this.f147414h = k4Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.f147410a, h4Var.f147410a) && this.f147411b == h4Var.f147411b && Intrinsics.f(this.f147412c, h4Var.f147412c) && Intrinsics.f(this.d, h4Var.d) && Intrinsics.f(this.e, h4Var.e) && Intrinsics.f(this.f, h4Var.f) && Intrinsics.f(this.f147413g, h4Var.f147413g) && Intrinsics.f(this.f147414h, h4Var.f147414h);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f147410a.hashCode() * 31, 31, this.f147411b), 31, this.f147412c);
        e4 e4Var = this.d;
        int iC2 = p.a.c((iC + (e4Var == null ? 0 : e4Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147413g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k4 k4Var = this.f147414h;
        return iHashCode2 + (k4Var != null ? k4Var.hashCode() : 0);
    }

    public h4(String id10, long j2, String mainIcon, e4 e4Var, String title, String str, String str2, k4 k4Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(mainIcon, "mainIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f147410a = id10;
        this.f147411b = j2;
        this.f147412c = mainIcon;
        this.d = e4Var;
        this.e = title;
        this.f = str;
        this.f147413g = str2;
        this.f147414h = k4Var;
    }
}
