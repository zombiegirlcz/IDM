package bmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f16798a;

    public o() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f16798a, ((o) obj2).f16798a);
    }

    public final int hashCode() {
        return this.f16798a.hashCode();
    }

    public o(int i) {
        TextLocalisedClause title = v04.b.Q(new TextLocalisedClause(R$string.savings_option_selection_title, null, null, 14), R$string.savings_onboarding_product_selection);
        Intrinsics.checkNotNullParameter(title, "title");
        this.f16798a = title;
    }
}
