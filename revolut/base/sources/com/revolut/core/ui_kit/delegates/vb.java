package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vb implements ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms0.h4 f54863a;

    public vb() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vb) && this.f54863a == ((vb) obj2).f54863a;
    }

    public final int hashCode() {
        return this.f54863a.hashCode();
    }

    public vb(int i) {
        ms0.h4 style = ms0.h4.SEMIACCENT;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54863a = style;
    }
}
