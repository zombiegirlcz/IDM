package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147358c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f147359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f147360h;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, double d, double d5) {
        if (255 != (i & 255)) {
            qlm.j1.f(a.f147332a.getDescriptor(), i, 255);
            throw null;
        }
        this.f147356a = str;
        this.f147357b = str2;
        this.f147358c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f147359g = d;
        this.f147360h = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f147356a, cVar.f147356a) && Intrinsics.f(this.f147357b, cVar.f147357b) && Intrinsics.f(this.f147358c, cVar.f147358c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Double.compare(this.f147359g, cVar.f147359g) == 0 && Double.compare(this.f147360h, cVar.f147360h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f147360h) + m72.b.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f147356a.hashCode() * 31, 31, this.f147357b), 31, this.f147358c), 31, this.d), 31, this.e), 31, this.f), this.f147359g, 31);
    }
}
