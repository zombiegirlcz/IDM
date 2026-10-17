package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f55538c;
    public final Object d;

    public v4(String id10, int i, TextLocalisedClause label, jtd.u uVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f55536a = id10;
        this.f55537b = i;
        this.f55538c = label;
        this.d = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return this.f55536a.equals(v4Var.f55536a) && this.f55537b == v4Var.f55537b && this.f55538c.equals(v4Var.f55538c) && Intrinsics.f(this.d, v4Var.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.b(this.f55537b, this.f55536a.hashCode() * 31, 31), 31, this.f55538c);
        Object obj2 = this.d;
        return iA + (obj2 == null ? 0 : obj2.hashCode());
    }
}
