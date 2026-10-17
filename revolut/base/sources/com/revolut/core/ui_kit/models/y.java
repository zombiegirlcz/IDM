package com.revolut.core.ui_kit.models;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f58163a;

    public y(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f58163a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f58163a, ((y) obj2).f58163a);
    }

    public final int hashCode() {
        return this.f58163a.hashCode();
    }
}
