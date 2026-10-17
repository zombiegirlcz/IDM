package dmb;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f115888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f115889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115890c;
    public final j d;
    public final Clause e;

    public l(CompositeClause compositeClause, List items, j buttonState, CompositeClause compositeClause2, int i) {
        TextLocalisedClause title = v04.b.Q(new TextLocalisedClause(R$string.vaults_pick_your_rate_title, null, null, 14), com.revolut.feature.retail.savings.api.R$string.savings_onboarding_product_upsell);
        compositeClause = (i & 2) != 0 ? null : compositeClause;
        compositeClause2 = (i & 16) != 0 ? null : compositeClause2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f115888a = title;
        this.f115889b = compositeClause;
        this.f115890c = items;
        this.d = buttonState;
        this.e = compositeClause2;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof l)) {
            return null;
        }
        l lVar = (l) oldState;
        return new k(!Intrinsics.f(this.d, lVar.d), !Intrinsics.f(this.f115889b, lVar.f115889b), !Intrinsics.f(this.e, lVar.e), !Intrinsics.f(this.f115888a, lVar.f115888a));
    }

    @Override // cli.p
    public final List c() {
        return this.f115890c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f115888a, lVar.f115888a) && Intrinsics.f(this.f115889b, lVar.f115889b) && Intrinsics.f(this.f115890c, lVar.f115890c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f115888a.hashCode() * 31;
        Clause clause = this.f115889b;
        int iHashCode2 = (this.d.hashCode() + p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f115890c)) * 31;
        Clause clause2 = this.e;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
