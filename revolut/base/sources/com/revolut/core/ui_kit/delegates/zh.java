package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import ip0.oj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj0 f55712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabsDelegate.Model f55713b;

    public zh(oj0 action, TabsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55712a = action;
        this.f55713b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) obj2;
        return this.f55712a == zhVar.f55712a && Intrinsics.f(this.f55713b, zhVar.f55713b);
    }

    public final int hashCode() {
        return this.f55713b.hashCode() + (this.f55712a.hashCode() * 31);
    }
}
