package ixe;

import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutOrderFeeBreakdown;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f169561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f169562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f169563c;

    public m(i billingClauseFactory, yik.h pricingPlanStringMapper, k feeToBreakdownMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(billingClauseFactory, "billingClauseFactory");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(feeToBreakdownMapper, "feeToBreakdownMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f169561a = pricingPlanStringMapper;
        this.f169562b = featureToggleInteractor;
        this.f169563c = w.y0(new iv0.p(this, 4));
    }

    public static Clause a(String str, LocalDate localDate, boolean z, boolean z3, jxe.l lVar) {
        TextLocalisedClause textLocalisedClause = Intrinsics.f(str, "PRIORITY") ? new TextLocalisedClause(R$string.checkout_card_express_delivery, null, null, 14) : Intrinsics.f(str, "LIGHTNING") ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_method_lightning, null, null, 14) : new TextLocalisedClause(R$string.checkout_card_delivery_item_v2, null, null, 14);
        if (localDate == null || (!(z || z3) || (lVar instanceof jxe.k))) {
            return textLocalisedClause;
        }
        LocalDate localDateNow = LocalDate.now();
        return new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(R$string.checkout_card_delivery_date, u.c((localDate.equals(localDateNow) || localDate.equals(localDateNow.plusDays(1L))) ? new CompositeClause(v.k(new TimeClause(ebm.a.P(localDate), TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12), new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public static CellDetailsDelegate.Model b(String str, Clause clause, Clause clause2, Clause clause3, boolean z, CheckoutOrderFeeBreakdown checkoutOrderFeeBreakdown) {
        return new CellDetailsDelegate.Model(str, new t0(clause, (Image) null, 0, false, 30), clause2, clause3, z ? checkoutOrderFeeBreakdown : null, null, null, 0, z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, z, false, null, null, 25520);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.TextLocalisedClause c(yhm.r r19, l71.d r20) {
        /*
            r0 = r19
            boolean r1 = l71.f.g(r20)
            if (r1 == 0) goto Lb
            int r1 = com.revolut.feature.topup_screen.impl.R$string.checkout_card_design_provision
            goto Ld
        Lb:
            int r1 = com.revolut.feature.topup_screen.impl.R$string.checkout_card_design
        Ld:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.Object r2 = r0.f314201a
            b93.b r2 = (b93.b) r2
            java.lang.Object r3 = r0.f314202b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f314203c
            h93.l0 r0 = (h93.l0) r0
            h93.l0 r4 = h93.l0.MEXICO_MCY
            r5 = 14
            r6 = 0
            r10 = 0
            if (r0 != r4) goto L3b
            com.revolut.core.ui_kit.models.CompositeClause r7 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.card_label_mexico_mcy
            r0.<init>(r2, r6, r6, r5)
            java.util.List r8 = zhm.u.c(r0)
            r11 = 0
            r12 = 10
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            goto L7b
        L3b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r3 == 0) goto L5c
            boolean r0 = kotlin.text.d0.W(r3)
            if (r0 != 0) goto L4a
            r12 = r3
            goto L4b
        L4a:
            r12 = r6
        L4b:
            if (r12 == 0) goto L5c
            com.revolut.core.ui_kit.models.TextClause r11 = new com.revolut.core.ui_kit.models.TextClause
            r17 = 0
            r18 = 126(0x7e, float:1.77E-43)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L6d
        L5c:
            java.lang.Integer r0 = v04.b.n(r2)
            if (r0 == 0) goto L6c
            int r0 = r0.intValue()
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r11.<init>(r0, r6, r6, r5)
            goto L6d
        L6c:
            r11 = r6
        L6d:
            if (r11 == 0) goto L72
            r8.add(r11)
        L72:
            com.revolut.core.ui_kit.models.CompositeClause r7 = new com.revolut.core.ui_kit.models.CompositeClause
            r11 = 0
            r12 = 10
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12)
        L7b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            java.util.List r2 = zhm.u.c(r7)
            r3 = 12
            r0.<init>(r1, r2, r6, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ixe.m.c(yhm.r, l71.d):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    public static Clause d(dj0.d dVar) {
        return dVar.k() ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_word_free, null, null, 14) : sx4.f.b(3, null, null, dVar);
    }
}
