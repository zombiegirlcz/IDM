package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h5 extends DetailGridItemDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54232a;

    public h5(TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this.f54232a = tagViewData;
    }

    @Override // com.revolut.core.ui_kit.delegates.DetailGridItemDelegate.a
    public final TagViewData a() {
        return this.f54232a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h5) && Intrinsics.f(this.f54232a, ((h5) obj2).f54232a);
    }

    public final int hashCode() {
        return this.f54232a.hashCode();
    }
}
