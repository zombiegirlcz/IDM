package ip0;

import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dg implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f163889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f163890c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163892h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163893j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f163894l;

    public dg(String listId, TextLocalisedClause error, TextLocalisedClause retry) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(retry, "retry");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(retry, "retry");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163888a = listId;
        this.f163889b = error;
        this.f163890c = retry;
        this.d = positionInBox;
        this.e = null;
        this.f = null;
        this.f163891g = null;
        this.f163892h = null;
        this.i = i;
        this.f163893j = i;
        this.k = i;
        this.f163894l = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ErrorDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55144b() {
        return this.f163888a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj2;
        return this.f163888a.equals(dgVar.f163888a) && this.f163889b.equals(dgVar.f163889b) && this.f163890c.equals(dgVar.f163890c) && Intrinsics.f(this.d, dgVar.d) && Intrinsics.f(this.e, dgVar.e) && Intrinsics.f(this.f, dgVar.f) && Intrinsics.f(this.f163891g, dgVar.f163891g) && Intrinsics.f(this.f163892h, dgVar.f163892h) && this.i == dgVar.i && this.f163893j == dgVar.f163893j && this.k == dgVar.k && this.f163894l == dgVar.f163894l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, t61.a.a(t61.a.a(this.f163888a.hashCode() * 31, 31, this.f163889b), 31, this.f163890c), 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163891g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163892h;
        return Integer.hashCode(this.f163894l) + j6.a.b(this.k, j6.a.b(this.f163893j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163891g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f163893j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f163894l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163893j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.f163892h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f163891g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163892h = cVar;
    }
}
