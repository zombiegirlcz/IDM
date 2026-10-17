package pmb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.savings.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f237523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f237525c;
    public final Clause d;

    public b() {
        this(15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f237523a, bVar.f237523a) && this.f237524b == bVar.f237524b && Intrinsics.f(this.f237525c, bVar.f237525c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iD = r6.b.d(this.f237525c, j6.a.c(this.f237523a.hashCode() * 31, 31, this.f237524b), 31);
        Clause clause = this.d;
        return iD + (clause == null ? 0 : clause.hashCode());
    }

    public b(TextLocalisedClause text, boolean z, LargeActionButton.ButtonStyle.DefaultFilledButton style, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f237523a = text;
        this.f237524b = z;
        this.f237525c = style;
        this.d = compositeClause;
    }

    public /* synthetic */ b(int i) {
        this(new TextLocalisedClause(R$string.savings_onboarding_product_upsell_continue, null, null, 14), (i & 2) != 0, LargeActionButton.ButtonStyle.f58725a, null);
    }
}
