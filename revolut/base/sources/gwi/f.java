package gwi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f147385l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147388c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f147389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147390h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f147391j;
    public final x k;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f147385l = new Lazy[]{null, null, null, null, null, null, yhm.j.c(kVar, new gvi.b(8)), null, null, yhm.j.c(kVar, new gvi.b(9)), null};
    }

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, List list2, x xVar) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(d.f147368a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f147386a = str;
        this.f147387b = str2;
        this.f147388c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f147389g = list;
        this.f147390h = str7;
        this.i = str8;
        this.f147391j = list2;
        this.k = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f147386a, fVar.f147386a) && Intrinsics.f(this.f147387b, fVar.f147387b) && Intrinsics.f(this.f147388c, fVar.f147388c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f147389g, fVar.f147389g) && Intrinsics.f(this.f147390h, fVar.f147390h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f147391j, fVar.f147391j) && Intrinsics.f(this.k, fVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f147386a.hashCode() * 31, 31, this.f147387b), 31, this.f147388c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iD = p.a.d(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f147389g);
        String str3 = this.f147390h;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iD2 = p.a.d((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f147391j);
        x xVar = this.k;
        return iD2 + (xVar != null ? xVar.hashCode() : 0);
    }
}
