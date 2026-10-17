package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBar;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends NavBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f59532a;

    public i(TextLocalisedClause textLocalisedClause) {
        this.f59532a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f59532a.equals(((i) obj2).f59532a);
    }

    public final int hashCode() {
        return this.f59532a.hashCode();
    }
}
