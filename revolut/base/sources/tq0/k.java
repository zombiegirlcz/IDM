package tq0;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements koi.j, qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f273469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f273470c;
    public final Integer d;
    public qv0.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f273471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f273472h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f273473j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f273474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f273475m;

    public k(int i, int i2, Integer num, String listId, List cells) {
        num = (i2 & 8) != 0 ? null : num;
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp4;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cells, "cells");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f273468a = listId;
        this.f273469b = cells;
        this.f273470c = i;
        this.d = num;
        this.e = positionInBox;
        this.f = i3;
        this.f273471g = i3;
        this.f273472h = i5;
        this.i = i5;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f273468a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f273468a, kVar.f273468a) && Intrinsics.f(this.f273469b, kVar.f273469b) && this.f273470c == kVar.f273470c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && this.f273471g == kVar.f273471g && this.f273472h == kVar.f273472h && this.i == kVar.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getA() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f273470c, p.a.d(this.f273468a.hashCode() * 31, 31, this.f273469b), 31);
        Integer num = this.d;
        return Integer.hashCode(this.i) + j6.a.b(this.f273472h, j6.a.b(this.f273471g, j6.a.b(this.f, h30.l.i(this.e, (iB + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53314q() {
        return this.f273475m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53312n() {
        return this.f273473j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getB() {
        return this.f273471g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getD() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f273471g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53310l() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53313p() {
        return this.f273474l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.k;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f273475m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getC() {
        return this.f273472h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f273473j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f273474l = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof k ? (k) oldItem : null) == null) {
            return null;
        }
        return new l(!Intrinsics.f(r6.f273469b, this.f273469b), this.f273470c != ((k) oldItem).f273470c, !Intrinsics.f(r6.e, this.e));
    }
}
