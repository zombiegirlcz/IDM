package s5i;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements h {

    @NotNull
    public static final i Companion = new i();
    public static final TextClause e = new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f260092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5i.c f260093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f260094c;
    public final gte.a d;

    public k(b amountDisplayer, k5i.c exchangeCurrencyRateMapper, n8b.a countryInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(amountDisplayer, "amountDisplayer");
        Intrinsics.checkNotNullParameter(exchangeCurrencyRateMapper, "exchangeCurrencyRateMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f260092a = amountDisplayer;
        this.f260093b = exchangeCurrencyRateMapper;
        this.f260094c = countryInteractor;
        this.d = featureToggleInteractor;
    }

    public static TextLocalisedClause b(f8l.e eVar) {
        int i = j.f260091b[eVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.market_data_transaction_breakdown_rate, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.market_data_exchange_breakdown_limit_price, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.market_data_exchange_breakdown_stop_price, null, null, 14);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Recurring order type is not supported");
    }

    public final qv0.i a(OrderQuote orderQuote, Function1 cellTitle) {
        k kVar;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Clause clause = (Clause) cellTitle.invoke(orderQuote);
        f8l.e eVar = orderQuote.k;
        Amount amount = orderQuote.f104754c;
        Amount amount2 = orderQuote.e;
        int i = j.f260091b[eVar.ordinal()];
        if (i == 1) {
            int i2 = j.f260090a[orderQuote.f104752a.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = this;
                amount = amount2;
            }
            kVar = this;
        } else {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported");
            }
            int i3 = j.f260090a[orderQuote.f104753b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = this;
                amount = amount2;
            }
            kVar = this;
        }
        return new CellDetailsDelegate.Model("breakdown.amount", clause, kVar.i(amount), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final qv0.i c(OrderQuote orderQuote, Function1 function1) {
        CompositeClause compositeClause;
        CompositeClause compositeClauseM;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rates_transaction_vet_prompt_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_rates, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        OrderRate orderRate = orderQuote.f104757j;
        Amount amount = orderQuote.f104754c;
        Amount amount2 = orderQuote.e;
        BigDecimal bigDecimal = orderRate.f104794c;
        if (bigDecimal != null) {
            int i = j.f260090a[orderQuote.f104753b.ordinal()];
            TextClause textClause = e;
            if (i == 1) {
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                Clause clauseI = i(Amount.a(amount, ONE));
                xi0.a aVar = xi0.b.Companion;
                String str = amount2.f104718b.f104720b;
                aVar.getClass();
                Clause[] elements = {clauseI, textClause, new RateClause(bigDecimal, xi0.a.a(str), new RateClause.Format.Default(null, true), null)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal ONE2 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                Clause clauseI2 = i(Amount.a(amount2, ONE2));
                xi0.a aVar2 = xi0.b.Companion;
                String str2 = amount.f104718b.f104720b;
                aVar2.getClass();
                Clause[] elements2 = {clauseI2, textClause, new RateClause(bigDecimal, xi0.a.a(str2), new RateClause.Format.Default(null, true), null)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements2));
            }
            compositeClause = compositeClauseM;
        } else {
            compositeClause = null;
        }
        return new CellDetailsActionDelegate.Model("breakdown.effectiveRate", textLocalisedClause, 0, resourceImage, compositeClause, null, false, false, null, null, function1 != null ? function1.invoke(orderQuote) : null, 0, 0, 0, 0, 4192228);
    }

    public final qv0.i d(OrderQuote orderQuote, dj0.d dVar, Function1 cellTitle) {
        Object objA;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Clause clause = (Clause) cellTitle.invoke(orderQuote);
        f8l.e eVar = orderQuote.k;
        Amount amount = orderQuote.e;
        Amount amount2 = orderQuote.f104754c;
        int i = j.f260091b[eVar.ordinal()];
        if (i == 1) {
            int i2 = j.f260090a[orderQuote.f104752a.ordinal()];
            if (i2 == 1) {
                Amount amount3 = orderQuote.f;
                if (amount3 != null) {
                    amount = amount3;
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                amount = orderQuote.d;
                if (amount == null) {
                    amount = amount2;
                }
            }
        } else {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported");
            }
            int i3 = j.f260090a[orderQuote.f104753b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                amount = amount2;
            }
        }
        dj0.d dVarL = a.a.L(amount);
        try {
            m.Companion companion = m.INSTANCE;
            objA = pyd.c.O(dVarL, dVar);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        dj0.d dVar2 = (dj0.d) objA;
        return new CellDetailsDelegate.Model("breakdown.estimatedTotal", clause, new MoneyClause(dVar2 == null ? dVarL : dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        qv0.i model;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Clause textLocalisedClause = (Clause) cellTitle.invoke(orderQuote);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.market_data_transaction_breakdown_fees, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        Charges charges = orderQuote.f104755g;
        if (charges.f104731a.f104723b.isEmpty()) {
            model = new CellDetailsDelegate.Model("breakdown.fee", clause, new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        } else {
            ChargeBreakdown chargeBreakdown = charges.f104731a;
            ChargeBreakdown chargeBreakdown2 = charges.f104731a;
            model = chargeBreakdown.f104722a.f104717a.compareTo(BigDecimal.ZERO) == 0 ? new CellDetailsDelegate.Model("breakdown.fee", clause, g(chargeBreakdown2, bVar), 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("breakdown.fee", clause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), g(chargeBreakdown2, bVar), null, false, false, null, null, parcel.invoke(orderQuote), 0, 0, 0, 0, 4192228);
        }
        return model;
    }

    public final qv0.i f(OrderQuote orderQuote, Function1 cellTitle) {
        Amount amount;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        if (((jte.d) this.d).c(PaymentsToggles$PaymentsChargesMigration.f79158c) && !e1.z(orderQuote)) {
            return null;
        }
        Clause clause = (Clause) cellTitle.invoke(orderQuote);
        int i = j.f260090a[orderQuote.f104752a.ordinal()];
        if (i == 1) {
            amount = orderQuote.e;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = orderQuote.f104754c;
        }
        return new CellDetailsDelegate.Model("breakdown.exchanged", clause, i(amount), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause g(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r4, xi0.b r5) {
        /*
            r3 = this;
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r4.f104724c
            if (r0 == 0) goto L1a
            r1 = 0
            if (r5 == 0) goto La
            java.lang.String r5 = r5.f306286a
            goto Lb
        La:
            r5 = r1
        Lb:
            com.revolut.shared.feature.market_data.models.domain.models.Asset r2 = r0.f104718b
            java.lang.String r2 = r2.f104720b
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r5 == 0) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r4.f104722a
        L1c:
            com.revolut.core.ui_kit.models.Clause r4 = r3.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s5i.k.g(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, xi0.b):com.revolut.core.ui_kit.models.Clause");
    }

    public final qv0.i h(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        if (orderQuote.f104755g.f104732b.f104723b.isEmpty()) {
            return null;
        }
        Clause textLocalisedClause = (Clause) cellTitle.invoke(orderQuote);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.market_data_transaction_breakdown_taxes, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        Amount amount = orderQuote.f104755g.f104732b.f104722a;
        return new CellDetailsActionDelegate.Model("breakdown.taxes", clause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, o9.SENSITIVE, 8), null, false, false, null, null, parcel.invoke(orderQuote), 0, 0, 0, 0, 4192228);
    }

    public final Clause i(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f260092a.a(amount);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        if (((jte.d) this.d).c(PaymentsToggles$PaymentsChargesMigration.f79158c) && !e1.z(orderQuote)) {
            return null;
        }
        f8l.e eVar = orderQuote.k;
        int i = j.f260091b[eVar.ordinal()];
        k5i.c cVar = this.f260093b;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported");
            }
            Clause clauseB = (Clause) cellTitle.invoke(orderQuote);
            if (clauseB == null) {
                clauseB = b(eVar);
            }
            return new CellDetailsDelegate.Model("breakdown.price", clauseB, cVar.a(orderQuote, false), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        Clause clauseB2 = (Clause) cellTitle.invoke(orderQuote);
        if (clauseB2 == null) {
            clauseB2 = b(eVar);
        }
        return new CellDetailsActionDelegate.Model("breakdown.price", clauseB2, z ? R$drawable.uikit_icn_16_info_outline : 0, null, cVar.a(orderQuote, false), false, !((o8b.c) this.f260094c).g(), u0.LARGE, parcel.invoke(orderQuote), 0, 0, 32032);
    }
}
