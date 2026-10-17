package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.views.Tabs;
import kotlin.jvm.internal.Intrinsics;
import mx0.ec;
import mx0.fc;
import mx0.gc;
import mx0.hc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q {

    @NotNull
    public static final ec Companion = new ec();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f59615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tabs.c f59616c;
    public final boolean d;
    public final boolean e;
    public final hc f;

    public q(String id10, v textColor, Tabs.c tabDetails, boolean z, boolean z3, hc state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(tabDetails, "tabDetails");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59614a = id10;
        this.f59615b = textColor;
        this.f59616c = tabDetails;
        this.d = z;
        this.e = z3;
        this.f = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f59614a, qVar.f59614a) && Intrinsics.f(this.f59615b, qVar.f59615b) && Intrinsics.f(this.f59616c, qVar.f59616c) && this.d == qVar.d && this.e == qVar.e && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(j6.a.c((this.f59616c.hashCode() + j6.a.b(this.f59615b.f59748a, this.f59614a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }

    public /* synthetic */ q(String str, Tabs.c cVar, int i) {
        this(str, new v(R$color.internal_color_tab_text_selectable), cVar, (i & 8) != 0, false, gc.f209724a);
    }

    public q(String id10, t tabDetails, boolean z, int i) {
        v textColor = new v(R$color.internal_color_tab_text_selectable);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(tabDetails, "tabDetails");
        this(id10, textColor, tabDetails, false, false, z ? gc.f209724a : fc.f209705a);
    }
}
