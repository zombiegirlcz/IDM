package ip0;

import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qs implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps f166043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us f166044c;
    public final List d;
    public final TextClause e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f166045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final os f166046h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f166047j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f166048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f166049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qv0.c f166050n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f166051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f166052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p31.c f166053r;

    public qs(String listId, ps background, us state, List list, TextClause titleClause, Clause clause, UrlImage urlImage, os osVar, Object obj2, int i) {
        state = (i & 4) != 0 ? ss.f166386a : state;
        list = (i & 8) != 0 ? null : list;
        urlImage = (i & 64) != 0 ? null : urlImage;
        osVar = (i & 128) != 0 ? null : osVar;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        int i2 = R$attr.uikit_dp0;
        this.f166042a = listId;
        this.f166043b = background;
        this.f166044c = state;
        this.d = list;
        this.e = titleClause;
        this.f = clause;
        this.f166045g = urlImage;
        this.f166046h = osVar;
        this.i = obj2;
        this.f166047j = i2;
        this.k = i2;
        this.f166048l = i2;
        this.f166049m = i2;
        this.f166050n = c.d.f249513a;
        this.o = null;
        this.f166051p = null;
        this.f166052q = null;
        this.f166053r = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LargeVoucherTileDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53564b() {
        return this.i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53563a() {
        return this.f166042a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj2;
        return Intrinsics.f(this.f166042a, qsVar.f166042a) && this.f166043b.equals(qsVar.f166043b) && Intrinsics.f(this.f166044c, qsVar.f166044c) && Intrinsics.f(this.d, qsVar.d) && this.e.equals(qsVar.e) && Intrinsics.f(this.f, qsVar.f) && Intrinsics.f(this.f166045g, qsVar.f166045g) && Intrinsics.f(this.f166046h, qsVar.f166046h) && Intrinsics.f(this.i, qsVar.i) && this.f166047j == qsVar.f166047j && this.k == qsVar.k && this.f166048l == qsVar.f166048l && this.f166049m == qsVar.f166049m && Intrinsics.f(this.f166050n, qsVar.f166050n) && Intrinsics.f(this.o, qsVar.o) && Intrinsics.f(this.f166051p, qsVar.f166051p) && Intrinsics.f(this.f166052q, qsVar.f166052q) && Intrinsics.f(this.f166053r, qsVar.f166053r);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53567h() {
        return this.f166047j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166047j = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f166044c.hashCode() + a10.b.c(this.f166043b.f165861a, this.f166042a.hashCode() * 31, 31)) * 31;
        List list = this.d;
        int iB = v7.b((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        Object obj2 = this.f;
        int iHashCode2 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Image image = this.f166045g;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        os osVar = this.f166046h;
        int iHashCode4 = (iHashCode3 + (osVar == null ? 0 : osVar.hashCode())) * 29791;
        Object obj3 = this.i;
        int i = h30.l.i(this.f166050n, j6.a.b(this.f166049m, j6.a.b(this.f166048l, j6.a.b(this.k, j6.a.b(this.f166047j, (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.o;
        int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166051p;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166052q;
        int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166053r;
        return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53569l() {
        return this.o;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166050n = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53570m() {
        return this.f166051p;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166052q = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getI() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getK() {
        return this.f166049m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53566g() {
        return this.f166050n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f166053r;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53571n() {
        return this.f166052q;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53568j() {
        return this.f166048l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166051p = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166053r = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qs ? (qs) oldItem : null) == null) {
            return null;
        }
        qs qsVar = (qs) oldItem;
        return new rs(!qsVar.f166043b.equals(this.f166043b), !Intrinsics.f(qsVar.f166044c, this.f166044c), !Intrinsics.f(qsVar.d, this.d), !qsVar.e.equals(this.e), !Intrinsics.f(qsVar.f, this.f), !Intrinsics.f(qsVar.f166045g, this.f166045g), !Intrinsics.f(qsVar.f166046h, this.f166046h), !true, !Intrinsics.f(qsVar.f166050n, this.f166050n), !true);
    }
}
