package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa f55645b;

    public ya(Clause clause, wa style) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f55644a = clause;
        this.f55645b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj2;
        return Intrinsics.f(this.f55644a, yaVar.f55644a) && this.f55645b == yaVar.f55645b;
    }

    public final int hashCode() {
        return this.f55645b.hashCode() + (this.f55644a.hashCode() * 31);
    }
}
