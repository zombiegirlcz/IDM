package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PassCardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.a00;
import ip0.yz;
import ip0.zz;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class fa implements qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f54151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a00 f54152c;
    public final zz d;
    public final List e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54154h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54155j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f54157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f54158n;

    public fa(String listId, CdnImage logo, a00 a00Var, yz yzVar, aim.e details) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(details, "details");
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        this.f54150a = listId;
        this.f54151b = logo;
        this.f54152c = a00Var;
        this.d = yzVar;
        this.e = details;
        this.f = c.d.f249513a;
        this.f54153g = null;
        this.f54154h = null;
        this.i = null;
        this.f54155j = null;
        this.k = i;
        this.f54156l = i;
        this.f54157m = i2;
        this.f54158n = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PassCardDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53894a() {
        return this.f54150a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj2;
        return Intrinsics.f(this.f54150a, faVar.f54150a) && this.f54151b.equals(faVar.f54151b) && Intrinsics.f(this.f54152c, faVar.f54152c) && Intrinsics.f(this.d, faVar.d) && Intrinsics.f(this.e, faVar.e) && Intrinsics.f(this.f, faVar.f) && Intrinsics.f(this.f54153g, faVar.f54153g) && Intrinsics.f(this.f54154h, faVar.f54154h) && Intrinsics.f(this.i, faVar.i) && Intrinsics.f(this.f54155j, faVar.f54155j) && this.k == faVar.k && this.f54156l == faVar.f54156l && this.f54157m == faVar.f54157m && this.f54158n == faVar.f54158n;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.k;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.k = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f54151b.hashCode() + (this.f54150a.hashCode() * 31)) * 31;
        a00 a00Var = this.f54152c;
        int iHashCode2 = (iHashCode + (a00Var == null ? 0 : a00Var.hashCode())) * 31;
        zz zzVar = this.d;
        int i = h30.l.i(this.f, p.a.d((iHashCode2 + (zzVar == null ? 0 : zzVar.hashCode())) * 31, 31, this.e), 31);
        p31.c cVar = this.f54153g;
        int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54154h;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54155j;
        return Integer.hashCode(this.f54158n) + j6.a.b(this.f54157m, j6.a.b(this.f54156l, j6.a.b(this.k, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f54153g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51852g() {
        return this.f54154h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53897g() {
        return this.f54156l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f54158n;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54156l = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getE() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f54155j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51853h() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54153g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53898h() {
        return this.f54157m;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54154h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54155j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof fa ? (fa) oldItem : null) == null) {
            return null;
        }
        fa faVar = (fa) oldItem;
        return new PassCardDelegate.b(!faVar.f54151b.equals(this.f54151b), !Intrinsics.f(faVar.f54152c, this.f54152c), !Intrinsics.f(faVar.d, this.d), !Intrinsics.f(faVar.e, this.e), or0.b.l(this, (qv0.i) oldItem));
    }
}
