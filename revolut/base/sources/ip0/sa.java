package ip0;

import com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sa implements koi.j, qv0.n, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause f166327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166328c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166330h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166331j;

    public sa(String listId, TimeClause title, int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? R$attr.uikit_dp8 : i;
        i2 = (i3 & 8) != 0 ? R$attr.uikit_dp8 : i2;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f166326a = listId;
        this.f166327b = title;
        this.f166328c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166329g = i;
        this.f166330h = i2;
        this.i = i5;
        this.f166331j = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatTimestampBubbleDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52926a() {
        return this.f166326a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj2;
        return Intrinsics.f(this.f166326a, saVar.f166326a) && this.f166327b.equals(saVar.f166327b) && Intrinsics.f(this.f166328c, saVar.f166328c) && Intrinsics.f(this.d, saVar.d) && Intrinsics.f(this.e, saVar.e) && Intrinsics.f(this.f, saVar.f) && this.f166329g == saVar.f166329g && this.f166330h == saVar.f166330h && this.i == saVar.i && this.f166331j == saVar.f166331j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52937r() {
        return this.f166329g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166329g = i;
    }

    public final int hashCode() {
        int iD = h30.l.d(this.f166327b, this.f166326a.hashCode() * 31, 31);
        p31.c cVar = this.f166328c;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f166331j) + j6.a.b(this.i, j6.a.b(this.f166330h, j6.a.b(this.f166329g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52934n() {
        return this.f166328c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52938s() {
        return this.f166330h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f166331j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166330h = i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52936q() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52935p() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166328c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52939t() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof sa) {
            return new ta(!((sa) oldItem).f166327b.equals(this.f166327b));
        }
        return null;
    }
}
