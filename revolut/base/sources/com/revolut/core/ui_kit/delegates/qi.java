package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qi implements si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54640a;

    public qi(TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this.f54640a = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof qi) && Intrinsics.f(this.f54640a, ((qi) obj2).f54640a);
    }

    public final int hashCode() {
        return this.f54640a.hashCode();
    }
}
