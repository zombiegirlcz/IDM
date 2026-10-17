package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m6 extends FullScreenStateDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6 f54460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6 f54461b;

    public m6(l6 primaryButton, l6 secondaryButton) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f54460a = primaryButton;
        this.f54461b = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj2;
        return Intrinsics.f(this.f54460a, m6Var.f54460a) && Intrinsics.f(this.f54461b, m6Var.f54461b);
    }

    public final int hashCode() {
        return this.f54461b.hashCode() + (this.f54460a.hashCode() * 31);
    }
}
