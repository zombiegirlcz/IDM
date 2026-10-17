package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import ip0.vh0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionDelegate.SwipeAction f54883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vh0 f54885c;

    public vh(SwipeToActionDelegate.SwipeAction action, Object obj2, vh0 actionEvent) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.f54883a = action;
        this.f54884b = obj2;
        this.f54885c = actionEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj2;
        return Intrinsics.f(this.f54883a, vhVar.f54883a) && Intrinsics.f(this.f54884b, vhVar.f54884b) && this.f54885c == vhVar.f54885c;
    }

    public final int hashCode() {
        int iHashCode = this.f54883a.hashCode() * 31;
        Object obj2 = this.f54884b;
        return this.f54885c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
