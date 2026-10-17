package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f54892a;

    public w0(Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f54892a = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f54892a, ((w0) obj2).f54892a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54892a.f51464b);
    }
}
