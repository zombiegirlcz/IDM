package ghk;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f143954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f143955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143956c;

    public g(TextClause text, LargeActionButton.ButtonStyle.DefaultFilledButton style, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f143954a = text;
        this.f143955b = style;
        this.f143956c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f143954a.equals(gVar.f143954a) && Intrinsics.f(this.f143955b, gVar.f143955b) && Intrinsics.f(this.f143956c, gVar.f143956c);
    }

    public final int hashCode() {
        int iD = r6.b.d(this.f143955b, this.f143954a.hashCode() * 31, 31);
        String str = this.f143956c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
