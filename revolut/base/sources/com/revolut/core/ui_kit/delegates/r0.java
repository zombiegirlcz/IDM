package com.revolut.core.ui_kit.delegates;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54654a;

    public r0(List colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f54654a = colors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f54654a, ((r0) obj2).f54654a);
    }

    public final int hashCode() {
        return this.f54654a.hashCode();
    }
}
