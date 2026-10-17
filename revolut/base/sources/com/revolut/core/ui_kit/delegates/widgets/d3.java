package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f55328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f55329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f55330c;

    public /* synthetic */ d3(e3 e3Var, e3 e3Var2, int i) {
        this(e3Var, (i & 2) != 0 ? null : e3Var2, (e3) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f55328a, d3Var.f55328a) && Intrinsics.f(this.f55329b, d3Var.f55329b) && Intrinsics.f(this.f55330c, d3Var.f55330c);
    }

    public final int hashCode() {
        int iHashCode = this.f55328a.hashCode() * 31;
        e3 e3Var = this.f55329b;
        int iHashCode2 = (iHashCode + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        e3 e3Var2 = this.f55330c;
        return iHashCode2 + (e3Var2 != null ? e3Var2.hashCode() : 0);
    }

    public d3(e3 mainAction, e3 e3Var, e3 e3Var2) {
        Intrinsics.checkNotNullParameter(mainAction, "mainAction");
        this.f55328a = mainAction;
        this.f55329b = e3Var;
        this.f55330c = e3Var2;
    }
}
