package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SummaryCardDelegate.Model f54638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh f54639b;

    public qh(SummaryCardDelegate.Model model, rh position) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f54638a = model;
        this.f54639b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj2;
        return Intrinsics.f(this.f54638a, qhVar.f54638a) && this.f54639b == qhVar.f54639b;
    }

    public final int hashCode() {
        return this.f54639b.hashCode() + (this.f54638a.hashCode() * 31);
    }
}
