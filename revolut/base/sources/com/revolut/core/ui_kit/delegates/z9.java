package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z9 extends NotificationCentreItemDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f55685b;

    public z9(TextLocalisedClause primary, TextClause secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.f55684a = primary;
        this.f55685b = secondary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj2;
        return this.f55684a.equals(z9Var.f55684a) && this.f55685b.equals(z9Var.f55685b);
    }

    public final int hashCode() {
        return this.f55685b.hashCode() + (this.f55684a.hashCode() * 31);
    }
}
