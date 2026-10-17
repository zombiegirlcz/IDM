package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ug extends SmallStockCardDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i0 f54835a;

    public ug(aw0.i0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54835a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ug) && Intrinsics.f(this.f54835a, ((ug) obj2).f54835a);
    }

    public final int hashCode() {
        return this.f54835a.hashCode();
    }
}
