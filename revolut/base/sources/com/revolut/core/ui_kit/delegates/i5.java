package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i5 extends DetailGridItemDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54277a;

    public i5(TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this.f54277a = tagViewData;
    }

    @Override // com.revolut.core.ui_kit.delegates.DetailGridItemDelegate.a
    public final TagViewData a() {
        return this.f54277a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i5) && Intrinsics.f(this.f54277a, ((i5) obj2).f54277a);
    }

    public final int hashCode() {
        return this.f54277a.hashCode();
    }
}
