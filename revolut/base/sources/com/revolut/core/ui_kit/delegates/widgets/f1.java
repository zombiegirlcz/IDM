package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55353a;

    public f1(Clause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f55353a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f1) && this.f55353a.equals(((f1) obj2).f55353a);
    }

    public final int hashCode() {
        return this.f55353a.hashCode() * 31;
    }
}
