package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends ActionWidgetDelegate.Model.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54566b;

    public p(Clause primaryClause, Clause secondaryClause) {
        Intrinsics.checkNotNullParameter(primaryClause, "primaryClause");
        Intrinsics.checkNotNullParameter(secondaryClause, "secondaryClause");
        this.f54565a = primaryClause;
        this.f54566b = secondaryClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f54565a.equals(pVar.f54565a) && this.f54566b.equals(pVar.f54566b);
    }

    public final int hashCode() {
        return this.f54566b.hashCode() + (this.f54565a.hashCode() * 31);
    }
}
