package ip0;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ej implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0.f7 f164108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f164109c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164111h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164112j;
    public p31.c k;

    public ej(String listId, mx0.f7 content) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        int i = R$attr.uikit_dp0;
        this.f164107a = listId;
        this.f164108b = content;
        this.f164109c = c.d.f249513a;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f164110g = i;
        this.f164111h = null;
        this.i = null;
        this.f164112j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FooterTextDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f164107a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj2;
        return Intrinsics.f(this.f164107a, ejVar.f164107a) && Intrinsics.f(this.f164108b, ejVar.f164108b) && Intrinsics.f(this.f164109c, ejVar.f164109c) && this.d == ejVar.d && this.e == ejVar.e && this.f == ejVar.f && this.f164110g == ejVar.f164110g && Intrinsics.f(this.f164111h, ejVar.f164111h) && Intrinsics.f(this.i, ejVar.i) && Intrinsics.f(this.f164112j, ejVar.f164112j) && Intrinsics.f(this.k, ejVar.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53129l() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f164110g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, h30.l.i(this.f164109c, (this.f164108b.hashCode() + (this.f164107a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f164111h;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164112j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f164111h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164109c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164112j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53130m() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f164110g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53132p() {
        return this.f164109c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f164112j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164111h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53131n() {
        return this.f;
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
        if ((oldItem instanceof ej ? (ej) oldItem : null) != null) {
            return new fj(!this.f164108b.equals(r4.f164108b), !Intrinsics.f(this.f164109c, r4.f164109c));
        }
        return null;
    }
}
