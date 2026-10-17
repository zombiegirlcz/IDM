package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import ip0.jm0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ki extends TrendViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f54395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0.q f54396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54397c;

    public ki(jm0 data, hw0.q limitType, float f) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f54395a = data;
        this.f54396b = limitType;
        this.f54397c = f;
    }

    @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
    public final jm0 a() {
        return this.f54395a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj2;
        return Intrinsics.f(this.f54395a, kiVar.f54395a) && this.f54396b == kiVar.f54396b && Float.compare(this.f54397c, kiVar.f54397c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54397c) + ((this.f54396b.hashCode() + (this.f54395a.hashCode() * 31)) * 31);
    }
}
