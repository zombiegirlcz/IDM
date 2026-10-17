package gk2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.atm.impl.R$string;
import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mha.n;
import mha.o;
import mha.p;
import mha.s;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextClause f144312c;
    public static final TextClause d;
    public static final TextClause e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egk.e f144313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f144314b;

    static {
        m70.a.c(t0.f186434a);
        f144312c = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        d = new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        e = new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public f(egk.e pricingPlanUiInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanUiInteractor, "pricingPlanUiInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f144313a = pricingPlanUiInteractor;
        this.f144314b = featureToggleInteractor;
    }

    public static CellDetailsActionDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, s sVar) {
        TextClause textClause;
        Clause clauseW;
        if (e0.y(sVar)) {
            clauseW = new TextLocalisedClause(R$string.atm_details_fee_unlimited, null, null, 14);
        } else {
            Clause clauseB = b(sVar.f205468j);
            p pVar = sVar.f205467h;
            if (pVar == null) {
                textClause = f144312c;
            } else if (pVar instanceof n) {
                textClause = d;
            } else {
                if (!(pVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = e;
            }
            clauseW = yoj.b.w(yoj.b.w(clauseB, textClause), b(pVar));
        }
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, !e0.y(sVar) ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, clauseW, null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static Clause b(p pVar) {
        if (pVar == null) {
            return f144312c;
        }
        if (pVar instanceof n) {
            return new MoneyClause(((n) pVar).f205461a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 8);
        }
        if (pVar instanceof o) {
            return new TextClause(String.valueOf(((o) pVar).f205462a), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CellDetailsActionDelegate.Model c(String str, TextLocalisedClause textLocalisedClause, WalletLimit.CounterLimit counterLimit) {
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new CompositeClause(v.k(new MoneyClause(counterLimit.f94846c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(counterLimit.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), d, null, null, 12), null, false, false, null, null, counterLimit, 0, 0, 0, 0, 4192228);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model d(java.lang.String r26, com.revolut.core.ui_kit.models.TextLocalisedClause r27, com.revolut.feature.atm.api.model.AtmWithdrawalCommission r28) {
        /*
            r0 = r28
            java.lang.Float r1 = r0.f63140a
            dj0.d r3 = r0.f63141b
            r0 = 12
            r8 = 0
            if (r1 == 0) goto L41
            if (r3 == 0) goto L41
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.atm.impl.R$string.atm_details_fee_commission_value
            com.revolut.core.ui_kit.models.PercentageClause r11 = new com.revolut.core.ui_kit.models.PercentageClause
            float r1 = r1.floatValue()
            double r12 = (double) r1
            r15 = 0
            r16 = 6
            r14 = 0
            r11.<init>(r12, r14, r15, r16)
            com.revolut.core.ui_kit.models.MoneyClause r2 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r4 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r16 = 0
            r17 = 15
            r13 = 0
            r15 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r6 = 0
            r7 = 12
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r2}
            java.util.List r1 = zhm.v.k(r1)
            r9.<init>(r10, r1, r8, r0)
        L3f:
            r14 = r9
            goto L76
        L41:
            if (r3 == 0) goto L64
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.atm.impl.R$string.atm_details_fee_min_amount
            com.revolut.core.ui_kit.models.MoneyClause r2 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r4 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r14 = 0
            r15 = 15
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r6 = 0
            r7 = 12
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r2 = zhm.u.c(r2)
            r9.<init>(r1, r2, r8, r0)
            goto L3f
        L64:
            if (r1 == 0) goto L75
            com.revolut.core.ui_kit.models.PercentageClause r10 = new com.revolut.core.ui_kit.models.PercentageClause
            float r0 = r1.floatValue()
            double r11 = (double) r0
            r14 = 0
            r15 = 6
            r13 = 0
            r10.<init>(r11, r13, r14, r15)
            r14 = r10
            goto L76
        L75:
            r14 = r8
        L76:
            if (r14 == 0) goto La2
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r11 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            aw0.t0 r13 = new aw0.t0
            r4 = 0
            r5 = 30
            r2 = 0
            r3 = 0
            r1 = r27
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r24 = 0
            r25 = 32760(0x7ff8, float:4.5907E-41)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r12 = r26
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r11
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gk2.f.d(java.lang.String, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.feature.atm.api.model.AtmWithdrawalCommission):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }
}
