package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z3 implements koi.j, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ip0.ab f55668c;
    public final CodeEditorDelegate.a d;
    public final boolean e;
    public final ip0.bb f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f55670h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55671j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f55672l;

    public z3(String listId, String code, ip0.ab mode, CodeEditorDelegate.a inputVariant, boolean z, ip0.bb gravity, boolean z3, boolean z4, int i, int i2, int i3, int i5, int i6) {
        mode = (i6 & 4) != 0 ? ip0.ab.DIGITS_6 : mode;
        inputVariant = (i6 & 8) != 0 ? CodeEditorDelegate.a.b.f52102a : inputVariant;
        z = (i6 & 16) != 0 ? true : z;
        gravity = (i6 & 32) != 0 ? ip0.bb.CENTER_HORIZONTAL : gravity;
        z3 = (i6 & 64) != 0 ? true : z3;
        z4 = (i6 & 128) != 0 ? false : z4;
        i = (i6 & 256) != 0 ? R$attr.uikit_dp0 : i;
        i2 = (i6 & 512) != 0 ? R$attr.uikit_dp0 : i2;
        i3 = (i6 & 1024) != 0 ? R$attr.uikit_dp0 : i3;
        i5 = (i6 & 2048) != 0 ? R$attr.uikit_dp0 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(inputVariant, "inputVariant");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.f55666a = listId;
        this.f55667b = code;
        this.f55668c = mode;
        this.d = inputVariant;
        this.e = z;
        this.f = gravity;
        this.f55669g = z3;
        this.f55670h = z4;
        this.i = i;
        this.f55671j = i2;
        this.k = i3;
        this.f55672l = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CodeEditorDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59204a() {
        return this.f55666a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f55666a, z3Var.f55666a) && Intrinsics.f(this.f55667b, z3Var.f55667b) && this.f55668c == z3Var.f55668c && Intrinsics.f(this.d, z3Var.d) && this.e == z3Var.e && this.f == z3Var.f && this.f55669g == z3Var.f55669g && this.f55670h == z3Var.f55670h && this.i == z3Var.i && this.f55671j == z3Var.f55671j && this.k == z3Var.k && this.f55672l == z3Var.f55672l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52361m() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55672l) + j6.a.b(this.k, j6.a.b(this.f55671j, j6.a.b(this.i, j6.a.c(j6.a.c((this.f.hashCode() + j6.a.c((this.d.hashCode() + ((this.f55668c.hashCode() + p.a.c(this.f55666a.hashCode() * 31, 31, this.f55667b)) * 31)) * 31, 31, this.e)) * 31, 31, this.f55669g), 31, this.f55670h), 31), 31), 31);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52362n() {
        return this.f55671j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52363p() {
        return this.f55672l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f55671j = i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.k;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!Intrinsics.f(oldItem, this)) {
            z3 z3Var = oldItem instanceof z3 ? (z3) oldItem : null;
            if (z3Var != null) {
                String str = z3Var.f55667b;
                String str2 = this.f55667b;
                String str3 = !Intrinsics.f(str, str2) ? str2 : null;
                ip0.ab abVar = z3Var.f55668c;
                ip0.ab abVar2 = this.f55668c;
                ip0.ab abVar3 = abVar != abVar2 ? abVar2 : null;
                CodeEditorDelegate.a aVar = z3Var.d;
                CodeEditorDelegate.a aVar2 = this.d;
                CodeEditorDelegate.a aVar3 = !Intrinsics.f(aVar, aVar2) ? aVar2 : null;
                boolean z = z3Var.e;
                boolean z3 = this.e;
                return new a4(str3, abVar3, aVar3, z != z3 ? Boolean.valueOf(z3) : null, this.f55670h != ((z3) oldItem).f55670h);
            }
        }
        return null;
    }
}
