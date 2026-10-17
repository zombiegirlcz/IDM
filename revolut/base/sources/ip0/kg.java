package ip0;

import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kg implements qv0.i, tw0.y {

    @NotNull
    public static final jg Companion = new jg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165008c;
    public final boolean d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165010h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f165011j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f165012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f165013m;

    /* JADX WARN: Illegal instructions before constructor call */
    public kg(String listId, int i) {
        boolean z = (i & 2) == 0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this(listId, true, true, z, 0, 8160);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new EsimLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55187b() {
        return this.f165006a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj2;
        return Intrinsics.f(this.f165006a, kgVar.f165006a) && this.f165007b == kgVar.f165007b && this.f165008c == kgVar.f165008c && this.d == kgVar.d && Intrinsics.f(this.e, kgVar.e) && Intrinsics.f(this.f, kgVar.f) && Intrinsics.f(this.f165009g, kgVar.f165009g) && Intrinsics.f(this.f165010h, kgVar.f165010h) && Intrinsics.f(this.i, kgVar.i) && this.f165011j == kgVar.f165011j && this.k == kgVar.k && this.f165012l == kgVar.f165012l && this.f165013m == kgVar.f165013m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53410n() {
        return this.f165011j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165011j = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, j6.a.c(j6.a.c(j6.a.c(this.f165006a.hashCode() * 31, 31, this.f165007b), 31, this.f165008c), 31, this.d), 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165009g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165010h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f165013m) + j6.a.b(this.f165012l, j6.a.b(this.k, j6.a.b(this.f165011j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53407j() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f165009g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165010h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53412q() {
        return this.f165013m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getI() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53409m() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53408l() {
        return this.f165010h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53411p() {
        return this.f165012l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165009g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    public kg(String str, boolean z, boolean z3, boolean z4, int i, int i2) {
        int i3 = R$attr.uikit_dp0;
        i = (i2 & 1024) != 0 ? i3 : i;
        this.f165006a = str;
        this.f165007b = z;
        this.f165008c = z3;
        this.d = z4;
        this.e = c.d.f249513a;
        this.f = null;
        this.f165009g = null;
        this.f165010h = null;
        this.i = null;
        this.f165011j = i3;
        this.k = i;
        this.f165012l = i3;
        this.f165013m = i3;
    }
}
