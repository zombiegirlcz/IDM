package ghk;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f143964a;

    public k(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f143964a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f143964a.equals(((k) obj2).f143964a);
    }

    public final int hashCode() {
        return this.f143964a.hashCode();
    }
}
