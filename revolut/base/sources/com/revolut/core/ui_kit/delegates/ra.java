package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ra extends PlainTextWarningDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54661a;

    public ra(TextLocalisedClause caption) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        this.f54661a = caption;
    }

    @Override // com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate.a
    public final ActionsView.Item a() {
        return new ActionsView.Item("ACTION_BUTTON_ID", mx0.d.SEMIACCENT, false, null, null, this.f54661a, null, null, null, null, false, null, null, null, null, 32668);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ra) && this.f54661a.equals(((ra) obj2).f54661a);
    }

    public final int hashCode() {
        return this.f54661a.hashCode();
    }
}
