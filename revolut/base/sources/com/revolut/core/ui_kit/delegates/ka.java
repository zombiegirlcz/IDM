package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ka implements qv0.i, qv0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pair f54378c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54380h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54381j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f54382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.c f54383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54384n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f54385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f54386q;

    public ka(String listId, String str, Pair code, Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, int i) {
        listId = (i & 1) != 0 ? "" : listId;
        clause = (i & 8) != 0 ? null : clause;
        clause2 = (i & 32) != 0 ? null : clause2;
        textLocalisedClause = (i & 64) != 0 ? null : textLocalisedClause;
        z = (i & 128) != 0 ? false : z;
        z3 = (i & 256) != 0 ? true : z3;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f54376a = listId;
        this.f54377b = str;
        this.f54378c = code;
        this.d = clause;
        this.e = clause2;
        this.f = textLocalisedClause;
        this.f54379g = z;
        this.f54380h = z3;
        this.i = i2;
        this.f54381j = i2;
        this.k = i2;
        this.f54382l = i2;
        this.f54383m = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PhoneEditorDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52973a() {
        return this.f54376a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj2;
        return Intrinsics.f(this.f54376a, kaVar.f54376a) && Intrinsics.f(this.f54377b, kaVar.f54377b) && this.f54378c.equals(kaVar.f54378c) && Intrinsics.f(this.d, kaVar.d) && Intrinsics.f(this.e, kaVar.e) && Intrinsics.f(this.f, kaVar.f) && this.f54379g == kaVar.f54379g && this.f54380h == kaVar.f54380h && this.i == kaVar.i && this.f54381j == kaVar.f54381j && this.k == kaVar.k && this.f54382l == kaVar.f54382l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iHashCode = this.f54376a.hashCode() * 31;
        String str = this.f54377b;
        int iHashCode2 = (this.f54378c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 961;
        Clause clause2 = this.e;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f;
        return Integer.hashCode(this.f54382l) + j6.a.b(this.k, j6.a.b(this.f54381j, j6.a.b(this.i, j6.a.c(j6.a.c((iHashCode4 + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.f54379g), 31, this.f54380h), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f54384n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54383m = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.o;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54385p = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.f54381j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.f54382l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54381j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f54383m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f54386q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f54385p;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54384n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54386q = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!Intrinsics.f(oldItem, this)) {
            ka kaVar = oldItem instanceof ka ? (ka) oldItem : null;
            if (kaVar != null) {
                String str = kaVar.f54377b;
                String str2 = this.f54377b;
                if (Intrinsics.f(str, str2)) {
                    str2 = null;
                }
                Pair pair = kaVar.f54378c;
                Pair pair2 = this.f54378c;
                if (pair.equals(pair2)) {
                    pair2 = null;
                }
                Clause clause = kaVar.d;
                Clause clause2 = this.d;
                if (Intrinsics.f(clause, clause2)) {
                    clause2 = null;
                }
                Clause clause3 = kaVar.e;
                Clause clause4 = this.e;
                Clause clause5 = !Intrinsics.f(clause3, clause4) ? clause4 : null;
                Clause clause6 = kaVar.f;
                Clause clause7 = this.f;
                Clause clause8 = !Intrinsics.f(clause6, clause7) ? clause7 : null;
                boolean z = kaVar.f54379g;
                boolean z3 = this.f54379g;
                Boolean boolValueOf = z != z3 ? Boolean.valueOf(z3) : null;
                boolean z4 = kaVar.f54380h;
                boolean z6 = this.f54380h;
                return new PhoneEditorDelegate.a(str2, pair2, clause2, null, clause5, clause8, boolValueOf, z4 != z6 ? Boolean.valueOf(z6) : null);
            }
        }
        return null;
    }
}
