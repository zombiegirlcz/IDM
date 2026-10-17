package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf f54441b;

    public lf(Clause primary, kf primaryWidthMode, int i) {
        primaryWidthMode = (i & 2) != 0 ? kf.SMALL : primaryWidthMode;
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(primaryWidthMode, "primaryWidthMode");
        this.f54440a = primary;
        this.f54441b = primaryWidthMode;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final Clause a() {
        return this.f54440a;
    }

    public final kf b() {
        return this.f54441b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj2;
        return Intrinsics.f(this.f54440a, lfVar.f54440a) && this.f54441b == lfVar.f54441b;
    }

    public final int hashCode() {
        return (this.f54441b.hashCode() + (this.f54440a.hashCode() * 31)) * 31;
    }
}
