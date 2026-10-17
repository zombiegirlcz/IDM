package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u7 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.v1 f54806a;

    public u7(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f54806a = colorScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u7) && this.f54806a == ((u7) obj2).f54806a;
    }

    public final int hashCode() {
        return this.f54806a.hashCode();
    }
}
