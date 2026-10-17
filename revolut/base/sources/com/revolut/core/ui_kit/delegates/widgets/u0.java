package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55519c;
    public final t0 d;
    public final s0 e;
    public final EsimWidgetClickData f;

    public u0(String listId, Clause title, Clause clause, t0 t0Var, s0 s0Var, EsimWidgetClickData esimWidgetClickData) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55517a = listId;
        this.f55518b = title;
        this.f55519c = clause;
        this.d = t0Var;
        this.e = s0Var;
        this.f = esimWidgetClickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f55517a, u0Var.f55517a) && this.f55518b.equals(u0Var.f55518b) && this.f55519c.equals(u0Var.f55519c) && this.d.equals(u0Var.d) && this.e.equals(u0Var.e) && this.f.equals(u0Var.f);
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + j6.a.c(p.a.b(p.a.b(this.f55517a.hashCode() * 31, 31, this.f55518b), 31, this.f55519c), 31, false)) * 31)) * 31)) * 31;
    }
}
