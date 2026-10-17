package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r4 extends CounterTextDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54657a;

    public r4(List segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f54657a = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r4) && Intrinsics.f(this.f54657a, ((r4) obj2).f54657a);
    }

    public final int hashCode() {
        return this.f54657a.hashCode();
    }
}
