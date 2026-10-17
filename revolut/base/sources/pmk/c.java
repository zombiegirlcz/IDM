package pmk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jgk.u f237610a;

    public c(zjk.c chargeClauseMapper, jgk.u planSubscriptionStateProvider) {
        Intrinsics.checkNotNullParameter(chargeClauseMapper, "chargeClauseMapper");
        Intrinsics.checkNotNullParameter(planSubscriptionStateProvider, "planSubscriptionStateProvider");
        this.f237610a = planSubscriptionStateProvider;
    }

    public static CompositeClause b(int i, List list, Object obj2, int i2) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, list, new Click(12, Integer.valueOf(i2), obj2, "ID_MINIMUM_BALANCE_ACTION", false), 8);
        int i3 = R$drawable.uikit_icn_24_chevron_right;
        Integer numValueOf = Integer.valueOf(i2);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(zhm.v.k(textLocalisedClause, new ImageClause(i3, numValueOf, fValueOf, fValueOf, 16)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.TextLocalisedClause a(com.revolut.feature.pricingplans.models.PricingPlanSubscription r8, hha.i0 r9) {
        /*
            r7 = this;
            java.lang.Long r0 = r9.f152313c
            if (r0 == 0) goto L1a
            long r0 = r0.longValue()
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            jgk.u r0 = r7.f237610a
            cjk.g r0 = (cjk.g) r0
            hha.o r0 = r0.b(r8, r2)
            if (r0 != 0) goto L18
            goto L1a
        L18:
            r1 = r0
            goto L1f
        L1a:
            hha.o r0 = hha.s.c(r8)
            goto L18
        L1f:
            if (r1 != 0) goto L23
            r8 = 0
            return r8
        L23:
            hha.o r0 = r9.e
            if (r0 != 0) goto L32
            hha.n r0 = hha.o.Companion
            dj0.d r2 = r9.d
            r0.getClass()
            hha.o r0 = hha.n.a(r2)
        L32:
            r3 = r0
            org.joda.time.Period r2 = r8.d
            java.lang.Long r4 = r9.f152313c
            hha.h0 r6 = r9.f152315h
            zjk.a$b r5 = zjk.a.b.f322874a
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = zjk.c.c(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pmk.c.a(com.revolut.feature.pricingplans.models.PricingPlanSubscription, hha.i0):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }
}
