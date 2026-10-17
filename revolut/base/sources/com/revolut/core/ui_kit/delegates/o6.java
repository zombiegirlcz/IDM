package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o6 extends FullScreenStateDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f54532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f54533b;

    public o6(n6 primaryButton, n6 secondaryButton) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f54532a = primaryButton;
        this.f54533b = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj2;
        return Intrinsics.f(this.f54532a, o6Var.f54532a) && Intrinsics.f(this.f54533b, o6Var.f54533b);
    }

    public final int hashCode() {
        return this.f54533b.hashCode() + (this.f54532a.hashCode() * 31);
    }
}
