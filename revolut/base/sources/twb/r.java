package twb;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f274995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f274997c;
    public final TextLocalisedClause d;
    public final AnalyticsContext e;
    public final AnalyticsContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f274998g;

    public r(q navBar, boolean z, boolean z3, TextLocalisedClause ctaButtonTextClause, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(ctaButtonTextClause, "ctaButtonTextClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274995a = navBar;
        this.f274996b = z;
        this.f274997c = z3;
        this.d = ctaButtonTextClause;
        this.e = analyticsContext;
        this.f = analyticsContext2;
        this.f274998g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f274998g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f274995a, rVar.f274995a) && this.f274996b == rVar.f274996b && this.f274997c == rVar.f274997c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f274998g, rVar.f274998g);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(j6.a.c(this.f274995a.hashCode() * 31, 31, this.f274996b), 31, this.f274997c), 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        int iA2 = (iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        AnalyticsContext analyticsContext2 = this.f;
        return this.f274998g.hashCode() + ((iA2 + (analyticsContext2 != null ? AnalyticsContext.a(analyticsContext2.f50296a) : 0)) * 31);
    }

    public /* synthetic */ r(q qVar, List list) {
        this(qVar, false, false, new TextLocalisedClause(R$string.gift_cards_details_cta_opt_in, null, null, 14), null, null, list);
    }
}
