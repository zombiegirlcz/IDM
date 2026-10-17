package aok;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanValueOfferReminderScreenContract$InputData f8015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.l f8016b;

    public n(PlanValueOfferReminderScreenContract$InputData inputData, dnk.l iconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f8015a = inputData;
        this.f8016b = iconMapper;
    }

    public static LargeActionButtonDelegate.Model a(ValueOfferReminderResponse$Content.Button button, String str, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, new TextClause(button.getF81183b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, button, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            aok.g r1 = (aok.g) r1
            java.lang.String r2 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData r1 = r0.f8015a
            com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content r1 = r1.f103644a
            java.lang.String r2 = r1.f81177a
            r3 = 0
            if (r2 == 0) goto L27
            dnk.l r4 = r0.f8016b
            java.lang.Integer r2 = r4.b(r2)
            if (r2 == 0) goto L27
            int r2 = r2.intValue()
            com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage
            r5 = 6
            r4.<init>(r2, r3, r3, r5)
            goto L28
        L27:
            r4 = r3
        L28:
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r6 = r1.f81178b
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r7 = r1.f81179c
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content$Info r2 = r1.d
            if (r2 == 0) goto L84
            com.revolut.core.ui_kit.delegates.CounterTextDelegate$Model$a r7 = com.revolut.core.ui_kit.delegates.CounterTextDelegate.Model.INSTANCE
            com.revolut.core.ui_kit.models.TextClause r8 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r9 = r2.f81184a
            r14 = 0
            r15 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r10 = r2.f81185b
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r12 = 0
            r13 = 2032(0x7f0, float:2.847E-42)
            r10 = r9
            r9 = r8
            java.lang.String r8 = "value_offer_reminder_counter_id"
            com.revolut.core.ui_kit.delegates.CounterTextDelegate$Model r14 = com.revolut.core.ui_kit.delegates.CounterTextDelegate.Model.Companion.c(r7, r8, r9, r10, r11, r12, r13)
            r20 = 0
            r21 = 63
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            yp0.b.l(r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.List r2 = zhm.u.c(r14)
            if (r2 == 0) goto L84
            goto L86
        L84:
            zhm.f0 r2 = zhm.f0.f322471a
        L86:
            com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content$Button r7 = r1.e
            java.lang.String r8 = "value_offer_reminder_primary_button"
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r9 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r7 = a(r7, r8, r9)
            com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content$Button r1 = r1.f
            if (r1 == 0) goto L9c
            java.lang.String r3 = "value_offer_reminder_secondary_button"
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r8 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58726b
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r3 = a(r1, r3, r8)
        L9c:
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model[] r1 = new com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model[]{r7, r3}
            java.lang.String r3 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.util.List r1 = kotlin.collections.d.L(r1)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r1 = zhm.d0.E0(r1, r2)
            aok.k r2 = new aok.k
            r2.<init>(r4, r5, r6, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aok.n.c(cli.j):cli.o");
    }
}
