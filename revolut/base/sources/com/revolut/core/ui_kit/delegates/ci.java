package com.revolut.core.ui_kit.delegates;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.sk0;
import ip0.tk0;
import ip0.vk0;
import ip0.wk0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ci implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54004c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f54005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54006h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54007j;
    public p31.c k;

    public ci(sk0 selected, TextLocalisedClause dayLabel, TextLocalisedClause nightLabel, TextLocalisedClause systemLabel, boolean z, wk0 state, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2) {
        ThemeSwitcherRoundedDelegate.Item item;
        ThemeSwitcherRoundedDelegate.Item item2;
        Intrinsics.checkNotNullParameter("ID_THEME_MODE_SWITCHER", "listId");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
        Intrinsics.checkNotNullParameter(nightLabel, "nightLabel");
        Intrinsics.checkNotNullParameter(systemLabel, "systemLabel");
        Intrinsics.checkNotNullParameter(state, "state");
        sk0 sk0Var = sk0.DAY;
        boolean z3 = selected == sk0Var;
        vk0 vk0Var = vk0.f166837a;
        ThemeSwitcherRoundedDelegate.Item item3 = new ThemeSwitcherRoundedDelegate.Item("theme_switcher_rounded_day", dayLabel, sk0Var, z3, state.equals(vk0Var), analyticsContext);
        sk0 sk0Var2 = sk0.NIGHT;
        ThemeSwitcherRoundedDelegate.Item item4 = new ThemeSwitcherRoundedDelegate.Item("theme_switcher_rounded_night", nightLabel, sk0Var2, selected == sk0Var2, state.equals(vk0Var), analyticsContext2);
        if (z) {
            sk0 sk0Var3 = sk0.SYSTEM;
            item = item4;
            item2 = new ThemeSwitcherRoundedDelegate.Item("theme_switcher_rounded_system", systemLabel, sk0Var3, selected == sk0Var3, state.equals(vk0Var), null);
        } else {
            item = item4;
            item2 = null;
        }
        ThemeSwitcherRoundedDelegate.Item[] elements = {item3, item, item2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        this.f54002a = "ID_THEME_MODE_SWITCHER";
        this.f54003b = listL;
        int i = R$attr.uikit_dp16;
        this.f54004c = i;
        this.d = i;
        int i2 = R$attr.uikit_dp0;
        this.e = i2;
        this.f = i2;
        this.f54005g = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ThemeSwitcherRoundedDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return this.f54002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj2;
        return Intrinsics.f(this.f54002a, ciVar.f54002a) && Intrinsics.f(this.f54003b, ciVar.f54003b);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51584r() {
        return this.f54004c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54004c = i;
    }

    public final int hashCode() {
        return p.a.d(this.f54002a.hashCode() * 31, 31, this.f54003b);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.f54006h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54005g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54007j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51585s() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51580m() {
        return this.f54005g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.f54007j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54006h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51586t() {
        return this.e;
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
        if ((oldItem instanceof ci ? (ci) oldItem : null) != null) {
            return new tk0(!Intrinsics.f(((ci) oldItem).f54003b, this.f54003b), or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
