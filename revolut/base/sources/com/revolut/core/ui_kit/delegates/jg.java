package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f54336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54337c;
    public final Clause d;

    public jg(String id10, double d, int i, PercentageClause percentageClause) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f54335a = id10;
        this.f54336b = d;
        this.f54337c = i;
        this.d = percentageClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj2;
        return Intrinsics.f(this.f54335a, jgVar.f54335a) && Double.compare(this.f54336b, jgVar.f54336b) == 0 && this.f54337c == jgVar.f54337c && Intrinsics.f(this.d, jgVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f54337c, m72.b.c(this.f54335a.hashCode() * 31, this.f54336b, 31), 31);
        Clause clause = this.d;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
