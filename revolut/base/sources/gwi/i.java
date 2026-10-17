package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147418c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147420h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f147421j;

    public /* synthetic */ i(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, x xVar) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(g.f147397a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f147416a = str;
        this.f147417b = str2;
        this.f147418c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f147419g = str7;
        this.f147420h = str8;
        this.i = str9;
        this.f147421j = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f147416a, iVar.f147416a) && Intrinsics.f(this.f147417b, iVar.f147417b) && Intrinsics.f(this.f147418c, iVar.f147418c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f147419g, iVar.f147419g) && Intrinsics.f(this.f147420h, iVar.f147420h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f147421j, iVar.f147421j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f147416a.hashCode() * 31, 31, this.f147417b);
        String str = this.f147418c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.f147419g;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147420h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        x xVar = this.f147421j;
        return iHashCode3 + (xVar != null ? xVar.hashCode() : 0);
    }
}
