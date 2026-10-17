package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabsDelegate.Model f53688b;

    public ai(String selectedId, TabsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f53687a = selectedId;
        this.f53688b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj2;
        return Intrinsics.f(this.f53687a, aiVar.f53687a) && Intrinsics.f(this.f53688b, aiVar.f53688b);
    }

    public final int hashCode() {
        return this.f53688b.hashCode() + (this.f53687a.hashCode() * 31);
    }
}
