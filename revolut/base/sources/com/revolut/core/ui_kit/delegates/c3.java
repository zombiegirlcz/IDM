package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 extends ChallengeMediumDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f53741a;

    public c3(TagViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f53741a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c3) && Intrinsics.f(this.f53741a, ((c3) obj2).f53741a);
    }

    public final int hashCode() {
        return this.f53741a.hashCode();
    }
}
