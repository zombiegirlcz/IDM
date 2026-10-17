package com.revolut.core.ui_kit.models.lightprompt;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f58104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain f58105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58106c;

    public a(TextLocalisedClause text) {
        LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain style = LargeActionButton.ButtonStyle.e;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f58104a = text;
        this.f58105b = style;
        this.f58106c = "PRODUCT_ARTICLE_CTA_BUTTON_LOADING_TAG";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f58104a, aVar.f58104a) && Intrinsics.f(this.f58105b, aVar.f58105b) && Intrinsics.f(this.f58106c, aVar.f58106c);
    }

    public final int hashCode() {
        int iHashCode = (this.f58105b.hashCode() + (this.f58104a.hashCode() * 31)) * 31;
        String str = this.f58106c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
