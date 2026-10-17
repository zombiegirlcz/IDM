package q1i;

import bw0.l;
import bw0.m;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1i.h;
import m1i.n0;
import m1i.o0;
import u80.g;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f241446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f241447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f241448c;

    public b(w80.b amountFormatter, l4i.a amountConverter, gte.a featureToggleInteractor, o moneyPrefixFormatter, AccountId accountId) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f241446a = amountFormatter;
        this.f241447b = featureToggleInteractor;
        this.f241448c = accountId;
    }

    public static AssetClause a(Amount amount) {
        if (amount != null) {
            return new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, null, 24);
        }
        return null;
    }

    public static m d(dj0.d dVar, ExchangeOrderDraft exchangeOrderDraft) {
        int i;
        r1i.b bVar = exchangeOrderDraft.o;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = a.d[bVar.ordinal()];
        if (i2 == 1) {
            i = R$string.rates_exchange_input_fee_after;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.rates_exchange_input_fee_including;
        }
        return new m(new TextLocalisedClause(i, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), l.INFO, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, new n0(exchangeOrderDraft, o0.FEE_INFO));
    }

    public static int e(String currentInput, String counterInput) {
        Intrinsics.checkNotNullParameter(currentInput, "currentInput");
        Intrinsics.checkNotNullParameter(counterInput, "counterInput");
        int length = currentInput.length();
        if (counterInput.length() < 13 && length < 13) {
            return 13;
        }
        return length;
    }

    public static long g(ExchangeOrderDraft exchangeOrderDraft, r1i.h hVar) {
        int i = a.f241443a[exchangeOrderDraft.f96881c.ordinal()];
        if (i == 1) {
            int i2 = a.e[hVar.ordinal()];
            if (i2 == 1) {
                return 1L;
            }
            if (i2 == 2) {
                return -1L;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = a.e[hVar.ordinal()];
        if (i3 == 1) {
            return -1L;
        }
        if (i3 == 2) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.AmountEditDelegate.Model b(com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft r40, r1i.h r41, boolean r42, boolean r43, boolean r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1i.b.b(com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft, r1i.h, boolean, boolean, boolean, int):com.revolut.core.ui_kit.delegates.AmountEditDelegate$Model");
    }

    public final String c(ExchangeOrderDraft draft, r1i.h inputPosition) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        MoneyDetails moneyDetailsG = r1i.d.g(draft, inputPosition);
        Long l2 = moneyDetailsG.f96898b;
        return this.f241446a.d(l2 != null ? l2.longValue() : 0L, moneyDetailsG.f96897a.f306286a);
    }

    public final String f(ExchangeOrderDraft draft, r1i.h inputPosition) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        xi0.b bVar = r1i.d.g(draft, inputPosition).f96897a;
        return cp5.d.A(bVar) ? o.b(new g(new dj0.d(g(draft, inputPosition), bVar), u80.e.SIGNED, u80.b.SYMBOL, 8)).toString() : g(draft, inputPosition) > 0 ? "+" : "-";
    }
}
