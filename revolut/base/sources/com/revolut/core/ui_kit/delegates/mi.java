package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mi extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54486c;

    public mi(jm0 data, int i, float f) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54484a = data;
        this.f54485b = i;
        this.f54486c = f;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54484a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj2;
        return Intrinsics.f(this.f54484a, miVar.f54484a) && this.f54485b == miVar.f54485b && Float.compare(this.f54486c, miVar.f54486c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54486c) + j6.a.b(this.f54485b, this.f54484a.hashCode() * 31, 31);
    }
}
