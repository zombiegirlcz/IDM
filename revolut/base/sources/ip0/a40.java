package ip0;

import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class a40 implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f163384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f163385c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f163386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qv0.c f163387h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163388j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f163389l;

    public a40(String listId, List steps, Integer num, int i, int i2, int i3) {
        num = (i3 & 4) != 0 ? null : num;
        i = (i3 & 8) != 0 ? R$attr.uikit_dp8 : i;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(steps, "steps");
        int i5 = R$attr.uikit_dp0;
        this.f163383a = listId;
        this.f163384b = steps;
        this.f163385c = num;
        this.d = i;
        this.e = i2;
        this.f = i5;
        this.f163386g = i5;
        this.f163387h = c.d.f249513a;
        this.i = null;
        this.f163388j = null;
        this.k = null;
        this.f163389l = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressStepHorizontalV2Delegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58316a() {
        return this.f163383a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a40)) {
            return false;
        }
        a40 a40Var = (a40) obj2;
        return Intrinsics.f(this.f163383a, a40Var.f163383a) && Intrinsics.f(this.f163384b, a40Var.f163384b) && Intrinsics.f(this.f163385c, a40Var.f163385c) && this.d == a40Var.d && this.e == a40Var.e && this.f == a40Var.f && this.f163386g == a40Var.f163386g && Intrinsics.f(this.f163387h, a40Var.f163387h) && Intrinsics.f(this.i, a40Var.i) && Intrinsics.f(this.f163388j, a40Var.f163388j) && Intrinsics.f(this.k, a40Var.k) && Intrinsics.f(this.f163389l, a40Var.f163389l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f163383a.hashCode() * 31, 31, this.f163384b);
        Integer num = this.f163385c;
        int i = h30.l.i(this.f163387h, j6.a.b(this.f163386g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (iD + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.i;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163388j;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163389l;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52250l() {
        return this.f163389l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163387h = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52251m() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163388j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52247g() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f163386g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52253p() {
        return this.f163387h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52252n() {
        return this.f163388j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163389l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52248h() {
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
        if (!(oldItem instanceof a40)) {
            return null;
        }
        a40 a40Var = (a40) oldItem;
        return new b40(!Intrinsics.f(this.f163384b, a40Var.f163384b), !Intrinsics.f(this.f163385c, a40Var.f163385c), !Intrinsics.f(this.f163387h, a40Var.f163387h));
    }
}
