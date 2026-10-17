package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p4 extends CounterTextDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f54575c;

    public p4(int i, int i2, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f54573a = i;
        this.f54574b = i2;
        this.f54575c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return this.f54573a == p4Var.f54573a && this.f54574b == p4Var.f54574b && this.f54575c.equals(p4Var.f54575c);
    }

    public final int hashCode() {
        return this.f54575c.hashCode() + j6.a.b(this.f54574b, Integer.hashCode(this.f54573a) * 31, 31);
    }
}
