package kr;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class w2 {

    @NotNull
    public static final v2 Companion = new v2();
    public static final Lazy[] i = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new h2(2)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188601c;
    public final f3 d;
    public final long e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f188602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f188603h;

    public /* synthetic */ w2(int i2, int i3, int i5, int i6, f3 f3Var, long j2, List list, String str, Integer num) {
        if (63 != (i2 & 63)) {
            qlm.j1.f(u2.f188589a.getDescriptor(), i2, 63);
            throw null;
        }
        this.f188599a = i3;
        this.f188600b = i5;
        this.f188601c = i6;
        this.d = f3Var;
        this.e = j2;
        this.f = list;
        if ((i2 & 64) == 0) {
            this.f188602g = null;
        } else {
            this.f188602g = str;
        }
        if ((i2 & 128) == 0) {
            this.f188603h = null;
        } else {
            this.f188603h = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return this.f188599a == w2Var.f188599a && this.f188600b == w2Var.f188600b && this.f188601c == w2Var.f188601c && Intrinsics.f(this.d, w2Var.d) && this.e == w2Var.e && Intrinsics.f(this.f, w2Var.f) && Intrinsics.f(this.f188602g, w2Var.f188602g) && Intrinsics.f(this.f188603h, w2Var.f188603h);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c((this.d.hashCode() + j6.a.b(this.f188601c, j6.a.b(this.f188600b, Integer.hashCode(this.f188599a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
        String str = this.f188602g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188603h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public w2(int i2, int i3, int i5, f3 cropRect, long j2, ArrayList planes, String str, Integer num) {
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(planes, "planes");
        this.f188599a = i2;
        this.f188600b = i3;
        this.f188601c = i5;
        this.d = cropRect;
        this.e = j2;
        this.f = planes;
        this.f188602g = str;
        this.f188603h = num;
    }
}
