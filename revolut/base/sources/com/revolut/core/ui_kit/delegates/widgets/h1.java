package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55367a;

    public h1(List segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f55367a = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f55367a, ((h1) obj2).f55367a);
    }

    public final int hashCode() {
        return this.f55367a.hashCode();
    }
}
