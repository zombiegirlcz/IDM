package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import ip0.i60;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vc extends PromotionalMediumTileDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i60 f54864a;

    public vc(i60 buttonData) {
        Intrinsics.checkNotNullParameter(buttonData, "buttonData");
        this.f54864a = buttonData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vc) && Intrinsics.f(this.f54864a, ((vc) obj2).f54864a);
    }

    public final int hashCode() {
        return this.f54864a.hashCode();
    }
}
