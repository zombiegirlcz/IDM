package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ii extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0.q f54307b;

    public ii(jm0 data, hw0.q limitType) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f54306a = data;
        this.f54307b = limitType;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54306a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj2;
        return Intrinsics.f(this.f54306a, iiVar.f54306a) && this.f54307b == iiVar.f54307b;
    }

    public final int hashCode() {
        return this.f54307b.hashCode() + (this.f54306a.hashCode() * 31);
    }
}
