package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f95777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f95778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f95779c;
    public final NavBarWithContainerBackground d;

    public a(TextClause title, TextClause toolbarSubtitle, TextClause textClause, NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f95777a = title;
        this.f95778b = toolbarSubtitle;
        this.f95779c = textClause;
        this.d = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f95777a.equals(aVar.f95777a) && this.f95778b.equals(aVar.f95778b) && this.f95779c.equals(aVar.f95779c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b(v7.b(this.f95777a.hashCode() * 31, 31, this.f95778b), 31, this.f95779c);
    }
}
