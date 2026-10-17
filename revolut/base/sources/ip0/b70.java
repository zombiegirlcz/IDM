package ip0;

import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b70 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f163546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f163547c;
    public final Image d;
    public final aw0.i9 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f163548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163549h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163550j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f163551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f163552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f163553n;
    public final int o;

    public b70(String listId, TextClause title, CompositeClause compositeClause, UrlImage urlImage, aw0.i9 i9Var, List list, int i) {
        compositeClause = (i & 4) != 0 ? null : compositeClause;
        urlImage = (i & 8) != 0 ? null : urlImage;
        i9Var = (i & 16) != 0 ? null : i9Var;
        list = (i & 32) != 0 ? null : list;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f163545a = listId;
        this.f163546b = title;
        this.f163547c = compositeClause;
        this.d = urlImage;
        this.e = i9Var;
        this.f = list;
        this.f163548g = c.d.f249513a;
        this.f163549h = null;
        this.i = null;
        this.f163550j = null;
        this.k = null;
        this.f163551l = i2;
        this.f163552m = i2;
        this.f163553n = i2;
        this.o = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PropertyCardDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55158j() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55154b() {
        return this.f163545a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj2;
        return this.f163545a.equals(b70Var.f163545a) && this.f163546b.equals(b70Var.f163546b) && Intrinsics.f(this.f163547c, b70Var.f163547c) && Intrinsics.f(this.d, b70Var.d) && Intrinsics.f(this.e, b70Var.e) && Intrinsics.f(this.f, b70Var.f) && Intrinsics.f(this.f163548g, b70Var.f163548g) && Intrinsics.f(this.f163549h, b70Var.f163549h) && Intrinsics.f(this.i, b70Var.i) && Intrinsics.f(this.f163550j, b70Var.f163550j) && Intrinsics.f(this.k, b70Var.k) && this.f163551l == b70Var.f163551l && this.f163552m == b70Var.f163552m && this.f163553n == b70Var.f163553n && this.o == b70Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51854j() {
        return this.f163551l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163551l = i;
    }

    public final int hashCode() {
        int iB = v7.b(this.f163545a.hashCode() * 31, 31, this.f163546b);
        Clause clause = this.f163547c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        aw0.i9 i9Var = this.e;
        int iHashCode3 = (iHashCode2 + (i9Var == null ? 0 : i9Var.hashCode())) * 31;
        List list = this.f;
        int i = h30.l.i(this.f163548g, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 961, 31);
        p31.c cVar = this.f163549h;
        int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163550j;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f163553n, j6.a.b(this.f163552m, j6.a.b(this.f163551l, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f163549h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163548g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163550j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f163552m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51856m() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163552m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.f163548g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.f163550j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163549h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51855l() {
        return this.f163553n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof b70 ? (b70) oldItem : null) == null) {
            return null;
        }
        b70 b70Var = (b70) oldItem;
        boolean z = true;
        boolean z3 = !b70Var.f163546b.equals(this.f163546b);
        boolean z4 = !Intrinsics.f(b70Var.f163547c, this.f163547c);
        boolean z6 = !Intrinsics.f(b70Var.d, this.d);
        boolean z11 = !Intrinsics.f(b70Var.e, this.e);
        boolean z12 = !Intrinsics.f(b70Var.f, this.f);
        if (Intrinsics.f(b70Var.f163549h, this.f163549h) && Intrinsics.f(b70Var.i, this.i) && Intrinsics.f(b70Var.f163550j, this.f163550j) && Intrinsics.f(b70Var.k, this.k)) {
            z = false;
        }
        return new c70(z3, z4, z6, z11, z12, z);
    }
}
