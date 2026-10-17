package wk2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f298210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298211c;
    public final boolean d;
    public final boolean e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f298212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f298213h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final co3.a f298214j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ah0.b f298215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f298216m;

    public n(boolean z, co3.a aVar, boolean z3, boolean z4, boolean z6, Integer num, int i, int i2, int i3, co3.a aVar2, boolean z11, ah0.b bVar, List markers) {
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f298209a = z;
        this.f298210b = aVar;
        this.f298211c = z3;
        this.d = z4;
        this.e = z6;
        this.f = num;
        this.f298212g = i;
        this.f298213h = i2;
        this.i = i3;
        this.f298214j = aVar2;
        this.k = z11;
        this.f298215l = bVar;
        this.f298216m = markers;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof n)) {
            return null;
        }
        n nVar = (n) oldState;
        return new l(nVar.f298209a != this.f298209a, nVar.f298212g != this.f298212g, nVar.f298213h != this.f298213h, nVar.i != this.i, nVar.f298211c != this.f298211c, nVar.d != this.d, nVar.e != this.e, !Intrinsics.f(nVar.f, this.f), !Intrinsics.f(nVar.f298216m, this.f298216m));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f298209a == nVar.f298209a && Intrinsics.f(this.f298210b, nVar.f298210b) && this.f298211c == nVar.f298211c && this.d == nVar.d && this.e == nVar.e && Intrinsics.f(this.f, nVar.f) && this.f298212g == nVar.f298212g && this.f298213h == nVar.f298213h && this.i == nVar.i && Intrinsics.f(this.f298214j, nVar.f298214j) && this.k == nVar.k && Intrinsics.f(this.f298215l, nVar.f298215l) && Intrinsics.f(this.f298216m, nVar.f298216m);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f298209a) * 31;
        co3.a aVar = this.f298210b;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f298211c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iB = j6.a.b(this.i, j6.a.b(this.f298213h, j6.a.b(this.f298212g, (iC + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        co3.a aVar2 = this.f298214j;
        int iC2 = j6.a.c((iB + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.k);
        ah0.b bVar = this.f298215l;
        return this.f298216m.hashCode() + ((iC2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
