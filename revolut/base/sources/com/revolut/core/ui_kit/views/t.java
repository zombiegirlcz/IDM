package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends Tabs.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f59744a;

    public t(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f59744a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f59744a, ((t) obj2).f59744a);
    }

    public final int hashCode() {
        return this.f59744a.hashCode();
    }
}
