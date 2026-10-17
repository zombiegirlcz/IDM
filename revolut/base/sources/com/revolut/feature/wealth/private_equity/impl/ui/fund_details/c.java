package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.b;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends b.AbstractC0588b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f95785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f95786c;
    public final Clause d;
    public final InstrumentImage e;

    public c(CompositeClause compositeClause, TextClause title, Clause toolbarSubtitle, CompositeClause compositeClause2, InstrumentImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f95784a = compositeClause;
        this.f95785b = title;
        this.f95786c = toolbarSubtitle;
        this.d = compositeClause2;
        this.e = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f95784a, cVar.f95784a) && this.f95785b.equals(cVar.f95785b) && this.f95786c.equals(cVar.f95786c) && Intrinsics.f(this.d, cVar.d) && this.e.equals(cVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f95784a;
        int iB = p.a.b(v7.b((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f95785b), 31, this.f95786c);
        Clause clause2 = this.d;
        return this.e.hashCode() + ((iB + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
