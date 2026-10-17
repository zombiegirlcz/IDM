package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55483b;

    public q3(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f55482a = items;
        this.f55483b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f55482a, q3Var.f55482a) && Intrinsics.f(this.f55483b, q3Var.f55483b);
    }

    public final int hashCode() {
        int iHashCode = this.f55482a.hashCode() * 31;
        String str = this.f55483b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
