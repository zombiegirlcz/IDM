package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n1 extends BigTileDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms0.k f54490a;

    public n1(ms0.k badgeContent) {
        Intrinsics.checkNotNullParameter(badgeContent, "badgeContent");
        this.f54490a = badgeContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && Intrinsics.f(this.f54490a, ((n1) obj2).f54490a);
    }

    public final int hashCode() {
        return this.f54490a.hashCode();
    }
}
