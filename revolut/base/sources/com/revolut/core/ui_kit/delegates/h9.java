package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class h9 extends MultiTargetFanChartDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f54237a;

    public h9(float f) {
        this.f54237a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h9) && Float.compare(this.f54237a, ((h9) obj2).f54237a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54237a);
    }
}
