package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f54620c;
    public final int d;

    public q4(float f, TextLocalisedClause label, TextLocalisedClause legendLabel, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(legendLabel, "legendLabel");
        this.f54618a = f;
        this.f54619b = label;
        this.f54620c = legendLabel;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Float.compare(this.f54618a, q4Var.f54618a) == 0 && this.f54619b.equals(q4Var.f54619b) && this.f54620c.equals(q4Var.f54620c) && this.d == q4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + t61.a.a(t61.a.a(Float.hashCode(this.f54618a) * 31, 31, this.f54619b), 31, this.f54620c);
    }
}
