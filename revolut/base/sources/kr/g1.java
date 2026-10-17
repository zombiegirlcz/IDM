package kr;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f188500j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188503c;
    public final String d;
    public final Map e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f188504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f188505h;
    public final v1 i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f188500j = new Lazy[]{yhm.j.c(kVar, new kl7.w0(23)), null, null, null, yhm.j.c(kVar, new kl7.w0(24)), null, null, null, null};
    }

    public /* synthetic */ g1(int i, List list, float f, int i2, String str, Map map, Boolean bool, String str2, Integer num, v1 v1Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(e1.f188482a.getDescriptor(), i, 31);
            throw null;
        }
        this.f188501a = list;
        this.f188502b = f;
        this.f188503c = i2;
        this.d = str;
        this.e = map;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.f188504g = null;
        } else {
            this.f188504g = str2;
        }
        if ((i & 128) == 0) {
            this.f188505h = null;
        } else {
            this.f188505h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = v1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f188501a, g1Var.f188501a) && Float.compare(this.f188502b, g1Var.f188502b) == 0 && this.f188503c == g1Var.f188503c && Intrinsics.f(this.d, g1Var.d) && Intrinsics.f(this.e, g1Var.e) && Intrinsics.f(this.f, g1Var.f) && Intrinsics.f(this.f188504g, g1Var.f188504g) && Intrinsics.f(this.f188505h, g1Var.f188505h) && Intrinsics.f(this.i, g1Var.i);
    }

    public final int hashCode() {
        List list = this.f188501a;
        int iC = p.a.c(j6.a.b(this.f188503c, m72.b.b(this.f188502b, (list == null ? 0 : list.hashCode()) * 31, 31), 31), 31, this.d);
        Map map = this.e;
        int iHashCode = (iC + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f188504g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188505h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        v1 v1Var = this.i;
        return iHashCode4 + (v1Var != null ? v1Var.hashCode() : 0);
    }

    public g1(List list, float f, int i, String experiment, Map map, Boolean bool, String str, Integer num, v1 v1Var) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        this.f188501a = list;
        this.f188502b = f;
        this.f188503c = i;
        this.d = experiment;
        this.e = map;
        this.f = bool;
        this.f188504g = str;
        this.f188505h = num;
        this.i = v1Var;
    }
}
