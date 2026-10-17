package nq;

import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f218310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218312c;
    public final List d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f218313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f218314h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f218315j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ResultInternal f218316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f218317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f218318n;
    public final Integer o;

    public l0(w scanType, String str, String str2, List list, long j2, String videoSignature, Integer num, int i, String str3, boolean z, String experiment, ResultInternal resultInternal, long j3, String str4, Integer num2) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(videoSignature, "videoSignature");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        this.f218310a = scanType;
        this.f218311b = str;
        this.f218312c = str2;
        this.d = list;
        this.e = j2;
        this.f = videoSignature;
        this.f218313g = num;
        this.f218314h = i;
        this.i = str3;
        this.f218315j = z;
        this.k = experiment;
        this.f218316l = resultInternal;
        this.f218317m = j3;
        this.f218318n = str4;
        this.o = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f218310a == l0Var.f218310a && Intrinsics.f(this.f218311b, l0Var.f218311b) && Intrinsics.f(this.f218312c, l0Var.f218312c) && Intrinsics.f(this.d, l0Var.d) && this.e == l0Var.e && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f218313g, l0Var.f218313g) && this.f218314h == l0Var.f218314h && Intrinsics.f(this.i, l0Var.i) && this.f218315j == l0Var.f218315j && Intrinsics.f(this.k, l0Var.k) && Intrinsics.f(this.f218316l, l0Var.f218316l) && this.f218317m == l0Var.f218317m && Intrinsics.f(this.f218318n, l0Var.f218318n) && Intrinsics.f(this.o, l0Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.f218310a.hashCode() * 31;
        String str = this.f218311b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218312c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iC = p.a.c(a0.d.c((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f);
        Integer num = this.f218313g;
        int iB = j6.a.b(this.f218314h, (iC + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str3 = this.i;
        int iC2 = p.a.c(j6.a.c((iB + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f218315j), 31, this.k);
        ResultInternal resultInternal = this.f218316l;
        int iC3 = a0.d.c((iC2 + (resultInternal == null ? 0 : resultInternal.hashCode())) * 31, 31, this.f218317m);
        String str4 = this.f218318n;
        int iHashCode4 = (iC3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.o;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }
}
