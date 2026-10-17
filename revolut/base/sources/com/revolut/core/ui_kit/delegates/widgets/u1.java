package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f55520a;

    public u1(TagViewData tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f55520a = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u1) && Intrinsics.f(this.f55520a, ((u1) obj2).f55520a);
    }

    public final int hashCode() {
        return this.f55520a.hashCode();
    }
}
