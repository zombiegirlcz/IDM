package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55461a;

    public p(List colorsAttrs) {
        Intrinsics.checkNotNullParameter(colorsAttrs, "colorsAttrs");
        this.f55461a = colorsAttrs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f55461a, ((p) obj2).f55461a);
    }

    public final int hashCode() {
        return this.f55461a.hashCode();
    }
}
