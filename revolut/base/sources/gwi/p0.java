package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147489c;
    public final String d;
    public final int e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f147490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f147491h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f147492j;

    public /* synthetic */ p0(int i, String str, String str2, int i2, String str3, int i3, Long l2, m3 m3Var, o oVar, String str4, String str5) {
        if (495 != (i & 495)) {
            qlm.j1.f(n0.f147473a.getDescriptor(), i, 495);
            throw null;
        }
        this.f147487a = str;
        this.f147488b = str2;
        this.f147489c = i2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        this.f = l2;
        this.f147490g = m3Var;
        this.f147491h = oVar;
        this.i = str4;
        if ((i & 512) == 0) {
            this.f147492j = null;
        } else {
            this.f147492j = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f147487a, p0Var.f147487a) && Intrinsics.f(this.f147488b, p0Var.f147488b) && this.f147489c == p0Var.f147489c && Intrinsics.f(this.d, p0Var.d) && this.e == p0Var.e && Intrinsics.f(this.f, p0Var.f) && Intrinsics.f(this.f147490g, p0Var.f147490g) && Intrinsics.f(this.f147491h, p0Var.f147491h) && Intrinsics.f(this.i, p0Var.i) && Intrinsics.f(this.f147492j, p0Var.f147492j);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, p.a.c(j6.a.b(this.f147489c, p.a.c(this.f147487a.hashCode() * 31, 31, this.f147488b), 31), 31, this.d), 31);
        Long l2 = this.f;
        int iHashCode = (iB + (l2 == null ? 0 : l2.hashCode())) * 31;
        m3 m3Var = this.f147490g;
        int iHashCode2 = (iHashCode + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        o oVar = this.f147491h;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.i;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147492j;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
