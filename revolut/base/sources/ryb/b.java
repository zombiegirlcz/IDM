package ryb;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.rev_points.api.R$plurals;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l71.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements jub.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f258288a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f258288a = featureToggleInteractor;
    }

    public static CompositeClause b(List list) {
        m70.a.t(t0.f186434a);
        return new CompositeClause(list, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CompositeClause d(int i, Clause clause, boolean z) {
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.rev_points_disclaimer_validity_plain, Integer.valueOf(i), (List) null, (Style) null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_disclaimer_bought_points, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_disclaimer_recurring_billing, null, null, 14);
        if (!z) {
            textLocalisedClause2 = null;
        }
        Clause[] elements = {textLocalisedQuantityClause, textLocalisedClause, clause, textLocalisedClause2, new TextLocalisedClause(R$string.rev_points_disclaimer_learn_more, null, new Click(28, (Integer) null, (Object) RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a, "rev_points_disclaimer_learn_more", false), 10)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return b(d.L(elements));
    }

    public final Clause a(l71.d dVar) {
        if (dVar != null && f.e(dVar)) {
            if (((jte.d) this.f258288a).c(RevPointsApi$Toggles.RevPointsBuyingIsraelDisclaimer.f83462c)) {
                return new TextLocalisedQuantityClause(R$plurals.rev_points_disclaimer_refundable, (Number) 14, (List) null, (Style) null, 28);
            }
        }
        if (dVar == null || !f.b(dVar)) {
            return null;
        }
        return new TextLocalisedClause(R$string.rev_points_disclaimer_gmf, null, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause c(l71.d r13) {
        /*
            r12 = this;
            int r0 = r12.e(r13)
            r1 = 14
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L12
            boolean r4 = l71.f.e(r13)
            if (r4 != r3) goto L12
        L10:
            r13 = r2
            goto L45
        L12:
            if (r13 == 0) goto L22
            boolean r4 = l71.f.b(r13)
            if (r4 != r3) goto L22
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.rev_points.api.R$string.rev_points_disclaimer_gmf
            r13.<init>(r4, r2, r2, r1)
            goto L45
        L22:
            if (r13 == 0) goto L10
            boolean r13 = l71.f.c(r13)
            if (r13 != r3) goto L10
            com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer r13 = com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer.f84109c
            gte.a r4 = r12.f258288a
            jte.d r4 = (jte.d) r4
            boolean r13 = r4.c(r13)
            if (r13 == 0) goto L10
            com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A r13 = com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A.f84110c
            boolean r13 = r4.c(r13)
            if (r13 == 0) goto L10
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.rev_points.api.R$string.rev_points_disclaimer_fair_value
            r13.<init>(r4, r2, r2, r1)
        L45:
            int r5 = com.revolut.feature.rev_points.api.R$plurals.rev_points_disclaimer_validity_card_spend
            com.revolut.core.ui_kit.models.TextLocalisedQuantityClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedQuantityClause
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 28
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.rev_points.api.R$string.rev_points_disclaimer_bought_points
            r0.<init>(r5, r2, r2, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.rev_points.api.R$string.rev_points_disclaimer_learn_more
            com.revolut.core.ui_kit.models.Click r6 = new com.revolut.core.ui_kit.models.Click
            r7 = 28
            com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore r9 = com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a
            java.lang.String r10 = "rev_points_disclaimer_learn_more"
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = 10
            r1.<init>(r5, r2, r6, r7)
            r2 = 4
            com.revolut.core.ui_kit.models.Clause[] r2 = new com.revolut.core.ui_kit.models.Clause[r2]
            r5 = 0
            r2[r5] = r4
            r2[r3] = r0
            r0 = 2
            r2[r0] = r13
            r13 = 3
            r2[r13] = r1
            java.lang.String r13 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r13)
            java.util.List r13 = kotlin.collections.d.L(r2)
            com.revolut.core.ui_kit.models.CompositeClause r13 = b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ryb.b.c(l71.d):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public final int e(l71.d dVar) {
        if (dVar == null || !f.e(dVar)) {
            return 3;
        }
        return ((jte.d) this.f258288a).c(RevPointsApi$Toggles.RevPointsBuyingIsraelDisclaimer.f83462c) ? 5 : 3;
    }
}
