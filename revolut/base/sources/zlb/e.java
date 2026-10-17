package zlb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f323215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323216c;
    public final TextLocalisedClause d;

    public e(List items, CompositeClause compositeClause, boolean z, int i) {
        compositeClause = (i & 2) != 0 ? null : compositeClause;
        z = (i & 4) != 0 ? false : z;
        TextLocalisedClause title = v04.b.Q(new TextLocalisedClause(R$string.savings_option_selection_title, null, null, 14), R$string.savings_onboarding_product_selection);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f323214a = items;
        this.f323215b = compositeClause;
        this.f323216c = z;
        this.d = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f323214a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f323214a, eVar.f323214a) && Intrinsics.f(this.f323215b, eVar.f323215b) && this.f323216c == eVar.f323216c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f323214a.hashCode() * 31;
        Clause clause = this.f323215b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f323216c);
    }
}
