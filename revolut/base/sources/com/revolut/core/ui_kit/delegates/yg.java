package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import ip0.lg0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f55651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmartTileExchangeDelegate.Model f55652b;

    public yg(lg0 fieldPosition, SmartTileExchangeDelegate.Model model) {
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55651a = fieldPosition;
        this.f55652b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj2;
        return this.f55651a == ygVar.f55651a && Intrinsics.f(this.f55652b, ygVar.f55652b);
    }

    public final int hashCode() {
        return this.f55652b.hashCode() + (this.f55651a.hashCode() * 31);
    }
}
