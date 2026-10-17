package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ny;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q9 implements koi.j, o31.c, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54625c;
    public final boolean d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54627h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54628j;

    public q9(String listId, ArrayList cards, int i, int i2, int i3, int i5) {
        boolean z = (i5 & 8) == 0;
        int i6 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f54623a = listId;
        this.f54624b = cards;
        this.f54625c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.f54626g = i6;
        this.f54627h = i6;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new NewRevolutCardsCarouselDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51809a() {
        return this.f54623a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj2;
        return this.f54623a.equals(q9Var.f54623a) && this.f54624b.equals(q9Var.f54624b) && this.f54625c == q9Var.f54625c && this.d == q9Var.d && this.e == q9Var.e && this.f == q9Var.f && this.f54626g == q9Var.f54626g && this.f54627h == q9Var.f54627h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51816m() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54627h) + j6.a.b(this.f54626g, j6.a.b(this.f, j6.a.b(this.e, j6.a.c(j6.a.b(this.f54625c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f54624b, this.f54623a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f54628j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51814j() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51817n() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51818p() {
        return this.f54627h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51815l() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54628j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f54626g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof q9 ? (q9) oldItem : null) == null) {
            return null;
        }
        q9 q9Var = (q9) oldItem;
        return new ny(q9Var.f54625c != this.f54625c, q9Var.f54624b.size() != this.f54624b.size(), q9Var.d != this.d);
    }
}
