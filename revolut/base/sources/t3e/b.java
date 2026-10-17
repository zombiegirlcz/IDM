package t3e;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.feature.store.api.R$string;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public static final class a {

        @NotNull
        public static final C1498a Companion = new C1498a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f267736h = new a(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f267737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Instant f267738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f267739c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f267740g;

        /* JADX INFO: renamed from: t3e.b$a$a, reason: collision with other inner class name */
        public static final class C1498a {
            private C1498a() {
            }
        }

        public a() {
            this(0);
        }

        public static a a(a aVar, String str, Instant instant, boolean z, boolean z3, boolean z4, boolean z6, c cVar, int i) {
            if ((i & 1) != 0) {
                str = aVar.f267737a;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                instant = aVar.f267738b;
            }
            Instant instant2 = instant;
            if ((i & 4) != 0) {
                z = aVar.f267739c;
            }
            boolean z11 = z;
            if ((i & 8) != 0) {
                z3 = aVar.d;
            }
            boolean z12 = z3;
            if ((i & 16) != 0) {
                z4 = aVar.e;
            }
            boolean z29 = z4;
            if ((i & 32) != 0) {
                z6 = aVar.f;
            }
            boolean z31 = z6;
            if ((i & 64) != 0) {
                cVar = aVar.f267740g;
            }
            aVar.getClass();
            return new a(str2, instant2, z11, z12, z29, z31, cVar);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f267737a, aVar.f267737a) && Intrinsics.f(this.f267738b, aVar.f267738b) && this.f267739c == aVar.f267739c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Intrinsics.f(this.f267740g, aVar.f267740g);
        }

        public final int hashCode() {
            String str = this.f267737a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Instant instant = this.f267738b;
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f267739c), 31, this.d), 31, this.e), 31, this.f);
            c cVar = this.f267740g;
            return iC + (cVar != null ? cVar.hashCode() : 0);
        }

        public /* synthetic */ a(int i) {
            this(null, null, false, false, false, false, null);
        }

        public a(String str, Instant instant, boolean z, boolean z3, boolean z4, boolean z6, c cVar) {
            this.f267737a = str;
            this.f267738b = instant;
            this.f267739c = z;
            this.d = z3;
            this.e = z4;
            this.f = z6;
            this.f267740g = cVar;
        }
    }

    public static Clause a(a config) {
        TextClause textClause;
        CompositeClause compositeClauseB;
        CompositeClause compositeClauseB2;
        CompositeClause compositeClauseB3;
        CompositeClause compositeClauseB4;
        Intrinsics.checkNotNullParameter(config, "config");
        c cVar = config.f267740g;
        if (cVar != null) {
            if (d.f267746c[cVar.f267742b.ordinal()] == 1) {
                return new CompositeClause(v.k(new TextLocalisedClause(R$string.store_mega_offer_details_earn_shops_terms_msi_link, u.c(cVar.f267741a), new Click(28, (Integer) null, (Object) cVar.f267743c, "CLICK_ID_STORE_TERMS_SINGLE", false), 8), new TextLocalisedClause(R$string.store_mega_offer_details_earn_footer_msi_disclaimer, null, null, 14)), new TextClause(a0.C(m70.a.o(t0.f186434a), 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            return null;
        }
        String strConcat = config.f267737a;
        if (strConcat != null) {
            if (!a0.y(strConcat, ".", false)) {
                strConcat = strConcat.concat(".");
            }
            textClause = new TextClause(strConcat, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        Instant instant = config.f267738b;
        CompositeClause compositeClauseB5 = b(textClause, instant != null ? new TextLocalisedClause(R$string.store_mega_offer_details_earn_footer_valid_until, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Pretty(q0.DATETIME_WITH_SECONDS), null, null, 12)), null, 12) : null);
        if (!config.d) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.store_terms_and_conditions_disclaimer_generic, u.c(new TextLocalisedClause(R$string.store_mega_offer_details_earn_shops_terms_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_STORE_TERMS", false), 10)), null, 12);
            return (compositeClauseB5 == null || (compositeClauseB = b(compositeClauseB5, textLocalisedClause)) == null) ? textLocalisedClause : compositeClauseB;
        }
        if (config.e) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.store_terms_and_conditions_disclaimer_points, v.k(new TextLocalisedClause(R$string.store_mega_offer_details_earn_shops_terms_points_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_STORE_TERMS", false), 10), new TextLocalisedClause(R$string.store_mega_offer_details_earn_rev_points_terms_points_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVPOINTS_TERMS", false), 10)), null, 12);
            return (compositeClauseB5 == null || (compositeClauseB4 = b(compositeClauseB5, textLocalisedClause2)) == null) ? textLocalisedClause2 : compositeClauseB4;
        }
        if (config.f267739c) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.store_mega_offer_details_earn_rev_points_terms_paid_plan_footer, v.k(new TextLocalisedClause(R$string.store_mega_offer_details_earn_shops_terms_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_STORE_TERMS", false), 10), new TextLocalisedClause(R$string.store_mega_offer_details_earn_rev_points_terms_points_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVPOINTS_TERMS", false), 10), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.lifestyle_rev_points_optin_terms_paid_plan_terms, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_PAID_PLAN_TERMS", false), 10)), null, 12);
            return (compositeClauseB5 == null || (compositeClauseB3 = b(compositeClauseB5, textLocalisedClause3)) == null) ? textLocalisedClause3 : compositeClauseB3;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.store_mega_offer_details_earn_rev_points_terms_footer, v.k(new TextLocalisedClause(R$string.store_mega_offer_details_earn_shops_terms_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_STORE_TERMS", false), 10), new TextLocalisedClause(R$string.store_mega_offer_details_earn_rev_points_terms_points_link, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVPOINTS_TERMS", false), 10)), null, 12);
        return (compositeClauseB5 == null || (compositeClauseB2 = b(compositeClauseB5, textLocalisedClause4)) == null) ? textLocalisedClause4 : compositeClauseB2;
    }

    public static CompositeClause b(Clause clause, TextLocalisedClause textLocalisedClause) {
        if (clause == null && textLocalisedClause == null) {
            return null;
        }
        Clause[] elements = {clause, textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
