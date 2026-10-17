package k50;

import aw0.l8;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f181146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.i f181147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181148c;
    public final j1 d;
    public final AnimatedBackgroundType e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f181149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NewBadgeContent f181150h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ap0.a f181151j;
    public final d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f181152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l8 f181153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l8 f181154n;
    public final l8 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l8 f181155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f181156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f181157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gw0.s f181158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c1 f181159t;

    public k1(UUID uuid, n50.i headerData, List items, j1 j1Var, AnimatedBackgroundType animatedBackgroundType, int i, int i2, NewBadgeContent.WithClause withClause, zhm.f0 suggestions, ap0.a aVar, d0 d0Var, boolean z, l8 l8Var, l8 l8Var2, l8 l8Var3, l8 l8Var4, boolean z3, boolean z4, gw0.s sVar, c1 c1Var) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f181146a = uuid;
        this.f181147b = headerData;
        this.f181148c = items;
        this.d = j1Var;
        this.e = animatedBackgroundType;
        this.f = i;
        this.f181149g = i2;
        this.f181150h = withClause;
        this.i = suggestions;
        this.f181151j = aVar;
        this.k = d0Var;
        this.f181152l = z;
        this.f181153m = l8Var;
        this.f181154n = l8Var2;
        this.o = l8Var3;
        this.f181155p = l8Var4;
        this.f181156q = z3;
        this.f181157r = z4;
        this.f181158s = sVar;
        this.f181159t = c1Var;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        k1 k1Var = (k1) oldState;
        boolean z3 = !this.f181147b.equals(k1Var.f181147b);
        boolean z4 = !Intrinsics.f(this.f181148c, k1Var.f181148c);
        boolean z6 = !Intrinsics.f(this.d, k1Var.d);
        boolean z11 = false;
        if (this.f181149g != k1Var.f181149g) {
            z = false;
            z11 = true;
        } else {
            z = false;
        }
        return new q0(z3, z4, z11, z6, !Intrinsics.f(this.i, k1Var.i), !Intrinsics.f(this.f181151j, k1Var.f181151j), this.f181157r != k1Var.f181157r ? true : z, !Intrinsics.f(this.f181158s, k1Var.f181158s));
    }

    @Override // cli.p
    public final List c() {
        return this.f181148c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f181146a, k1Var.f181146a) && Intrinsics.f(this.f181147b, k1Var.f181147b) && Intrinsics.f(this.f181148c, k1Var.f181148c) && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e) && this.f == k1Var.f && this.f181149g == k1Var.f181149g && Intrinsics.f(this.f181150h, k1Var.f181150h) && Intrinsics.f(this.i, k1Var.i) && Intrinsics.f(this.f181151j, k1Var.f181151j) && Intrinsics.f(this.k, k1Var.k) && this.f181152l == k1Var.f181152l && Intrinsics.f(this.f181153m, k1Var.f181153m) && Intrinsics.f(this.f181154n, k1Var.f181154n) && Intrinsics.f(this.o, k1Var.o) && Intrinsics.f(this.f181155p, k1Var.f181155p) && this.f181156q == k1Var.f181156q && this.f181157r == k1Var.f181157r && Intrinsics.f(this.f181158s, k1Var.f181158s) && Intrinsics.f(this.f181159t, k1Var.f181159t);
    }

    public final int hashCode() {
        UUID uuid = this.f181146a;
        int iD = p.a.d((this.f181147b.hashCode() + ((uuid == null ? 0 : uuid.hashCode()) * 31)) * 31, 31, this.f181148c);
        j1 j1Var = this.d;
        int iHashCode = (iD + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.e;
        int iB = j6.a.b(this.f181149g, j6.a.b(this.f, (iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31, 31), 31);
        NewBadgeContent newBadgeContent = this.f181150h;
        int iD2 = p.a.d((iB + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31, 31, this.i);
        ap0.a aVar = this.f181151j;
        int iHashCode2 = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d0 d0Var = this.k;
        int iC = j6.a.c((iHashCode2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f181152l);
        l8 l8Var = this.f181153m;
        int iHashCode3 = (iC + (l8Var == null ? 0 : l8Var.hashCode())) * 31;
        l8 l8Var2 = this.f181154n;
        int iHashCode4 = (iHashCode3 + (l8Var2 == null ? 0 : l8Var2.hashCode())) * 31;
        l8 l8Var3 = this.o;
        int iHashCode5 = (iHashCode4 + (l8Var3 == null ? 0 : l8Var3.hashCode())) * 31;
        l8 l8Var4 = this.f181155p;
        int iC2 = j6.a.c(j6.a.c((iHashCode5 + (l8Var4 == null ? 0 : l8Var4.hashCode())) * 31, 31, this.f181156q), 31, this.f181157r);
        gw0.s sVar = this.f181158s;
        int iHashCode6 = (iC2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        c1 c1Var = this.f181159t;
        return iHashCode6 + (c1Var != null ? c1Var.hashCode() : 0);
    }
}
