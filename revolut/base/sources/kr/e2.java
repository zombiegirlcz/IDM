package kr;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f188484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f188485c;
    public final String d;
    public final Integer e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f188486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188487h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f188488j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f188489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f188490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f188491n;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        o = new Lazy[]{null, yhm.j.c(kVar, new kl7.w0(26)), null, null, null, null, null, null, null, null, yhm.j.c(kVar, new kl7.w0(27)), null, null, null};
    }

    public /* synthetic */ e2(int i, String str, List list, long j2, String str2, Integer num, int i2, String str3, boolean z, String str4, String str5, Map map, long j3, String str6, Integer num2) {
        if (1918 != (i & 1918)) {
            qlm.j1.f(c2.f188470a.getDescriptor(), i, 1918);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f188483a = null;
        } else {
            this.f188483a = str;
        }
        this.f188484b = list;
        this.f188485c = j2;
        this.d = str2;
        this.e = num;
        this.f = i2;
        this.f188486g = str3;
        if ((i & 128) == 0) {
            this.f188487h = false;
        } else {
            this.f188487h = z;
        }
        this.i = str4;
        this.f188488j = str5;
        this.k = map;
        this.f188489l = (i & 2048) == 0 ? 0L : j3;
        if ((i & 4096) == 0) {
            this.f188490m = null;
        } else {
            this.f188490m = str6;
        }
        if ((i & 8192) == 0) {
            this.f188491n = null;
        } else {
            this.f188491n = num2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f188483a, e2Var.f188483a) && Intrinsics.f(this.f188484b, e2Var.f188484b) && this.f188485c == e2Var.f188485c && Intrinsics.f(this.d, e2Var.d) && Intrinsics.f(this.e, e2Var.e) && this.f == e2Var.f && Intrinsics.f(this.f188486g, e2Var.f188486g) && this.f188487h == e2Var.f188487h && Intrinsics.f(this.i, e2Var.i) && Intrinsics.f(this.f188488j, e2Var.f188488j) && Intrinsics.f(this.k, e2Var.k) && this.f188489l == e2Var.f188489l && Intrinsics.f(this.f188490m, e2Var.f188490m) && Intrinsics.f(this.f188491n, e2Var.f188491n);
    }

    public final int hashCode() {
        String str = this.f188483a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f188484b;
        int iC = p.a.c(a0.d.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f188485c), 31, this.d);
        Integer num = this.e;
        int iB = j6.a.b(this.f, (iC + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str2 = this.f188486g;
        int iC2 = j6.a.c((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f188487h);
        String str3 = this.i;
        int iC3 = p.a.c((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f188488j);
        Map map = this.k;
        int iC4 = a0.d.c((iC3 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f188489l);
        String str4 = this.f188490m;
        int iHashCode2 = (iC4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f188491n;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public e2(String str, List list, long j2, String videoSignature, Integer num, int i, String str2, boolean z, String str3, String experiment, Map map, long j3, String str4, Integer num2) {
        Intrinsics.checkNotNullParameter(videoSignature, "videoSignature");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        this.f188483a = str;
        this.f188484b = list;
        this.f188485c = j2;
        this.d = videoSignature;
        this.e = num;
        this.f = i;
        this.f188486g = str2;
        this.f188487h = z;
        this.i = str3;
        this.f188488j = experiment;
        this.k = map;
        this.f188489l = j3;
        this.f188490m = str4;
        this.f188491n = num2;
    }
}
