package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import ip0.lg0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0 f55710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmartTileExchangeDelegate.Model f55711c;

    public zg(String text, lg0 fieldPosition, SmartTileExchangeDelegate.Model model) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55709a = text;
        this.f55710b = fieldPosition;
        this.f55711c = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj2;
        return Intrinsics.f(this.f55709a, zgVar.f55709a) && this.f55710b == zgVar.f55710b && Intrinsics.f(this.f55711c, zgVar.f55711c);
    }

    public final int hashCode() {
        return this.f55711c.hashCode() + ((this.f55710b.hashCode() + (this.f55709a.hashCode() * 31)) * 31);
    }
}
