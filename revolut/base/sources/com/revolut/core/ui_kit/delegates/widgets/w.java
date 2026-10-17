package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55539a;

    public w(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f55539a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f55539a, ((w) obj2).f55539a);
    }

    public final int hashCode() {
        return this.f55539a.hashCode();
    }
}
