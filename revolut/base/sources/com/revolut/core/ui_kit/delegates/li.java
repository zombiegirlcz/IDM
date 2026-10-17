package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class li extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54446a;

    public li(jm0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54446a = data;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54446a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof li) && Intrinsics.f(this.f54446a, ((li) obj2).f54446a);
    }

    public final int hashCode() {
        return this.f54446a.hashCode();
    }
}
