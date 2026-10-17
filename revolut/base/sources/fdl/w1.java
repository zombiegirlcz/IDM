package fdl;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f134387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f134388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f134389c;
    public final Instant d;
    public final jed.g e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f134390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f134391h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f134392j;
    public final h1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h1 f134393l;

    public /* synthetic */ w1(int i, t1 t1Var, n1 n1Var, List list, Instant instant, jed.g gVar, boolean z, String str, String str2, Instant instant2, Instant instant3, h1 h1Var, h1 h1Var2) {
        if (63 != (i & 63)) {
            qlm.j1.f(u1.f134369a.getDescriptor(), i, 63);
            throw null;
        }
        this.f134387a = t1Var;
        this.f134388b = n1Var;
        this.f134389c = list;
        this.d = instant;
        this.e = gVar;
        this.f = z;
        if ((i & 64) == 0) {
            this.f134390g = null;
        } else {
            this.f134390g = str;
        }
        if ((i & 128) == 0) {
            this.f134391h = null;
        } else {
            this.f134391h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = instant2;
        }
        if ((i & 512) == 0) {
            this.f134392j = null;
        } else {
            this.f134392j = instant3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = h1Var;
        }
        if ((i & 2048) == 0) {
            this.f134393l = null;
        } else {
            this.f134393l = h1Var2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f134387a, w1Var.f134387a) && Intrinsics.f(this.f134388b, w1Var.f134388b) && Intrinsics.f(this.f134389c, w1Var.f134389c) && Intrinsics.f(this.d, w1Var.d) && Intrinsics.f(this.e, w1Var.e) && this.f == w1Var.f && Intrinsics.f(this.f134390g, w1Var.f134390g) && Intrinsics.f(this.f134391h, w1Var.f134391h) && Intrinsics.f(this.i, w1Var.i) && Intrinsics.f(this.f134392j, w1Var.f134392j) && Intrinsics.f(this.k, w1Var.k) && Intrinsics.f(this.f134393l, w1Var.f134393l);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.e.hashCode() + r6.b.c(p.a.d((this.f134388b.hashCode() + (this.f134387a.hashCode() * 31)) * 31, 31, this.f134389c), 31, this.d)) * 31, 31, this.f);
        String str = this.f134390g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f134391h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.i;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f134392j;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        h1 h1Var = this.k;
        int iHashCode5 = (iHashCode4 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        h1 h1Var2 = this.f134393l;
        return iHashCode5 + (h1Var2 != null ? h1Var2.hashCode() : 0);
    }
}
