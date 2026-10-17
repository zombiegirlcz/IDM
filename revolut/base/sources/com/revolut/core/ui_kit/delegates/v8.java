package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v8 extends ListingTileDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f54859a;

    public v8(TagViewData content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f54859a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v8) && Intrinsics.f(this.f54859a, ((v8) obj2).f54859a);
    }

    public final int hashCode() {
        return this.f54859a.hashCode();
    }
}
