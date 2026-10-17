package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f59541a;

    public n(Clause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f59541a = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f59541a, ((n) obj2).f59541a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f59541a.hashCode() * 961);
    }
}
