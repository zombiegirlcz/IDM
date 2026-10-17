package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.NavBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends NavBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageWithAnimatedBackgroundView.Model f59529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f59530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f59531c;
    public final CircleBadgeModel d;

    public h(ImageWithAnimatedBackgroundView.Model icon, TextLocalisedClause textLocalisedClause, Boolean bool, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f59529a = icon;
        this.f59530b = textLocalisedClause;
        this.f59531c = bool;
        this.d = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f59529a.equals(hVar.f59529a) && this.f59530b.equals(hVar.f59530b) && Intrinsics.f(this.f59531c, hVar.f59531c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f59529a.hashCode() * 31, 31, this.f59530b);
        Boolean bool = this.f59531c;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.d;
        return iHashCode + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }
}
