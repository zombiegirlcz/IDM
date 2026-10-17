package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 extends BigTileDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54569a;

    public p1(TagViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54569a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p1) && Intrinsics.f(this.f54569a, ((p1) obj2).f54569a);
    }

    public final int hashCode() {
        return this.f54569a.hashCode();
    }
}
