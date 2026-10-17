package jmb;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f176519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f176520b;

    public h(dcd.b interestRateFormatter, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f176519a = interestRateFormatter;
        this.f176520b = dateProvider;
    }

    public static CellDetailsDelegate.Model a(SavingsProduct savingsProduct) {
        int i;
        ncd.g gVar = savingsProduct.f86619c;
        xi0.b bVar = savingsProduct.f86618b;
        int i2 = g.f176517a[gVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R$string.savings_details_currency;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.savings_details_fund_currency;
        }
        return new CellDetailsDelegate.Model("CURRENCY_ITEM_LIST_ID", new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 28), new CurrencyClause(bVar, null, null, 6), null, null, null, null, 0, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, false, null, null, 31736);
    }

    public static t0 d(h hVar, Clause clause) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182);
        hVar.getClass();
        return new t0(clause, (Image) resourceImage, 0, false, 28);
    }

    public final CellDetailsDelegate.Model b(SavingsProductData savingsProductData) {
        int i;
        ProductGroup.InterestPayoutConfig interestPayoutConfig = savingsProductData.f86684b.o;
        if (interestPayoutConfig == null) {
            return null;
        }
        String str = interestPayoutConfig.f86560c;
        qkb.a aVar = str != null ? new qkb.a(str) : null;
        t0 t0VarD = d(this, new TextClause(interestPayoutConfig.f86558a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        int i2 = g.f176518b[savingsProductData.f86683a.f86620g.f86673a.f86676c.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            i = R$string.savings_schedules_frequency_daily;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.savings_schedules_frequency_monthly;
        }
        return new CellDetailsDelegate.Model("INTEREST_PAID_ITEM_ID", t0VarD, new TextLocalisedClause(i, null, null, 14), null, aVar, null, null, 0, null, false, aVar != null, null, null, 28600);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model c(fmb.l0 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            ncd.a r2 = r1.f136275a
            com.revolut.feature.shared.savings.models.product.SavingsProductData r2 = r2.f214169a
            com.revolut.feature.shared.savings.models.product.SavingsProduct r3 = r2.f86683a
            com.revolut.feature.shared.savings.models.product.SavingsProduct$InterestRate r3 = r3.f86621h
            java.util.ArrayList r4 = r3.f86644a
            int r5 = r4.size()
            r6 = 0
            r7 = 1
            if (r5 <= r7) goto Lae
            java.lang.Object r5 = r4.get(r7)
            com.revolut.feature.shared.savings.models.product.SavingsProduct$InterestRate$RateTier r5 = (com.revolut.feature.shared.savings.models.product.SavingsProduct.InterestRate.RateTier) r5
            dcd.b r7 = r0.f176519a
            com.revolut.core.ui_kit.models.CompositeClause r8 = r7.o(r5, r3)
            com.revolut.core.ui_kit.models.CompositeClause r13 = r7.p(r5, r3)
            fmb.k0 r3 = fmb.l0.Companion
            r3.getClass()
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            ncd.a r3 = r1.f136275a
            com.revolut.feature.shared.savings.models.product.SavingsProductData r3 = r3.f214169a
            boolean r3 = ocd.c.j(r3)
            if (r3 == 0) goto L4c
            fmb.m r3 = fmb.n0.Companion
            r3.getClass()
            java.util.List r3 = fmb.m.f136281b
            wi0.b r1 = r1.f136277c
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L4c
            int r1 = com.revolut.feature.retail.savings.api.R$string.savings_review_details_item_tiered_title_AU
            goto L4e
        L4c:
            int r1 = com.revolut.feature.retail.savings.api.R$string.savings_details_interest_over
        L4e:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            com.revolut.core.ui_kit.models.MoneyClause r14 = new com.revolut.core.ui_kit.models.MoneyClause
            dj0.d r15 = new dj0.d
            long r9 = r5.f86652a
            com.revolut.feature.shared.savings.models.product.SavingsProduct r2 = r2.f86683a
            xi0.b r2 = r2.f86618b
            r15.<init>(r9, r2)
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r16 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r20 = 0
            r21 = 15
            r17 = 0
            r18 = 0
            r19 = 0
            r16.<init>(r17, r18, r19, r20, r21)
            r19 = 12
            r14.<init>(r15, r16, r17, r18, r19)
            java.util.List r2 = zhm.u.c(r14)
            r5 = 12
            r3.<init>(r1, r2, r6, r5)
            aw0.t0 r11 = d(r0, r3)
            int r1 = r4.size()
            r2 = 2
            if (r1 <= r2) goto L92
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.retail.savings.api.R$string.savings_details_hys_tiered_limits_more_than_two_subtitle
            java.util.List r3 = zhm.u.c(r8)
            r1.<init>(r2, r3, r6, r5)
            r12 = r1
            goto L93
        L92:
            r12 = r8
        L93:
            aw0.u0 r16 = aw0.u0.SMALL
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r9 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            r22 = 0
            r23 = 28336(0x6eb0, float:3.9707E-41)
            java.lang.String r10 = "TIERED_LIMITS_ITEM_LIST_ID"
            jmb.d r14 = jmb.d.f176514a
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r9
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jmb.h.c(fmb.l0):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }
}
