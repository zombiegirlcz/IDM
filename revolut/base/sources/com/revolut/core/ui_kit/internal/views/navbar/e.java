package com.revolut.core.ui_kit.internal.views.navbar;

import com.revolut.core.ui_kit.internal.views.navbar.VersatileTitleView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends VersatileTitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageClause f57408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f57409c;

    public e(Clause firstText, ImageClause icon, Clause secondText) {
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        this.f57407a = firstText;
        this.f57408b = icon;
        this.f57409c = secondText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f57407a, eVar.f57407a) && Intrinsics.f(this.f57408b, eVar.f57408b) && Intrinsics.f(this.f57409c, eVar.f57409c);
    }

    public final int hashCode() {
        return this.f57409c.hashCode() + ((this.f57408b.hashCode() + (this.f57407a.hashCode() * 31)) * 31);
    }
}
