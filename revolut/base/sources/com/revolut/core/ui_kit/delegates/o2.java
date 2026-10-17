package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o2 extends CellDetailsListDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54527a;

    public o2(TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this.f54527a = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o2) && this.f54527a.equals(((o2) obj2).f54527a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f54527a.hashCode() * 31);
    }
}
