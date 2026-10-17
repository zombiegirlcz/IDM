package wnf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import ehe.n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import snf.a0;
import snf.b0;
import snf.d0;
import snf.e0;
import snf.f0;
import snf.j;
import snf.l;
import snf.p;
import snf.r;
import snf.t;
import snf.u;
import snf.w;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static Clause a(snf.b accountInfo) {
        CompositeClause compositeClause;
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Clause textClause;
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        f0 f0Var = accountInfo.f264572b;
        u uVar = accountInfo.f264571a;
        boolean z = f0Var instanceof e0;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z) {
            if (uVar instanceof snf.f) {
                xi0.b bVar = ((snf.f) uVar).f264579a;
                textLocalisedClause = new TextLocalisedClause(((e0) f0Var).f264578a ? R$string.transaction_details_state_graduated_junior : cp5.d.z(bVar) ? R$string.transaction_details_state_crypto : cp5.d.y(bVar) ? R$string.transaction_details_state_commodity : R$string.transaction_details_state_personal_account, n.x(bVar, ticker, null, 4), d(accountInfo), 8);
            } else if (uVar instanceof l) {
                textLocalisedClause = ((e0) f0Var).f264578a ? new TextLocalisedClause(R$string.transaction_details_state_graduated_junior, zhm.u.c(new TextClause(((l) uVar).f264591a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), d(accountInfo), 8) : new TextClause(((l) uVar).f264591a, (Style) d(accountInfo), (Integer) null, false, (o9) null, (List) null, 124);
            } else if (uVar instanceof t) {
                textLocalisedClause = ((e0) f0Var).f264578a ? new TextLocalisedClause(R$string.transaction_details_state_graduated_junior, zhm.u.c(new TextClause(((t) uVar).f264602a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), d(accountInfo), 8) : new TextClause(((t) uVar).f264602a, (Style) d(accountInfo), (Integer) null, false, (o9) null, (List) null, 124);
            } else {
                if (uVar instanceof snf.n) {
                    textClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.transaction_details_state_freelancer_account, null, null, 14), new CurrencyClause(((snf.n) uVar).f264598a, ticker, null, 4)), new DotDividerClause((Integer) null), d(accountInfo), null, 8);
                } else if (uVar instanceof p) {
                    textClause = new TextClause(((p) uVar).f264599a, (Style) d(accountInfo), (Integer) null, false, (o9) null, (List) null, 124);
                } else if (uVar instanceof j) {
                    textLocalisedClause = c((j) uVar, d(accountInfo));
                } else if (uVar instanceof snf.d) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_product_title, null, d(accountInfo), 10);
                } else if (uVar instanceof r) {
                    textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_state_revx_fiat, zhm.u.c(new CurrencyClause(((r) uVar).f264601a, ticker, null, 4)), d(accountInfo), 8);
                } else {
                    if (!(uVar instanceof snf.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_state_wallet, zhm.u.c(new TextClause(cp5.d.J(((snf.h) uVar).f264583a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), d(accountInfo), 8);
                }
                textLocalisedClause = textClause;
            }
        } else if (f0Var instanceof b0) {
            if (uVar instanceof snf.f) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_state_joint_account, zhm.u.c(new CurrencyClause(((snf.f) uVar).f264579a, ticker, null, 4)), d(accountInfo), 8);
            } else if (uVar instanceof l) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_state_joint_account, zhm.u.c(new TextClause(((l) uVar).f264591a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), d(accountInfo), 8);
            } else if (uVar instanceof t) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_state_joint_account, zhm.u.c(new TextClause(((t) uVar).f264602a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), d(accountInfo), 8);
            } else if (uVar instanceof j) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.transaction_details_state_joint_account, zhm.u.c(c((j) uVar, d(accountInfo))), null, 12);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Cannot render ", e(accountInfo)));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                textLocalisedClause = null;
            }
            textLocalisedClause = textLocalisedClause2;
        } else {
            if (!(f0Var instanceof d0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (uVar instanceof snf.f) {
                compositeClause = new CompositeClause(v.k(new TextClause(((d0) f0Var).f264576a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(((snf.f) uVar).f264579a, ticker, null, 4)), new DotDividerClause((Integer) null), d(accountInfo), null, 8);
            } else if (uVar instanceof l) {
                compositeClause = new CompositeClause(v.k(new TextClause(((d0) f0Var).f264576a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((l) uVar).f264591a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), d(accountInfo), null, 8);
            } else if (uVar instanceof t) {
                compositeClause = new CompositeClause(v.k(new TextClause(((d0) f0Var).f264576a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((t) uVar).f264602a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), d(accountInfo), null, 8);
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Cannot render ", e(accountInfo)));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                textLocalisedClause = null;
            }
            textLocalisedClause = compositeClause;
        }
        if (textLocalisedClause == null) {
            return null;
        }
        a0 a0Var = accountInfo.d;
        return (a0Var == null || a0Var.f264570b) ? textLocalisedClause : new CompositeClause(v.k(textLocalisedClause, new TextClause(a0Var.f264569a.f297794a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public static Integer b(snf.b accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        f0 f0Var = accountInfo.f264572b;
        u uVar = accountInfo.f264571a;
        if ((f0Var instanceof e0) && ((e0) f0Var).f264578a) {
            return null;
        }
        if (uVar instanceof l) {
            return Integer.valueOf(R$drawable.uikit_icn_24_wallet);
        }
        if (uVar instanceof t) {
            return Integer.valueOf(R$drawable.uikit_icn_24_vault);
        }
        if (!(uVar instanceof p) && !(uVar instanceof snf.n)) {
            if (uVar instanceof j) {
                return Integer.valueOf(R$drawable.uikit_icn_24_invest);
            }
            if (uVar instanceof snf.d) {
                return Integer.valueOf(R$drawable.uikit_icn_24_credit_card);
            }
            if (uVar instanceof r) {
                return Integer.valueOf(R$drawable.uikit_icn_24_bitcoin);
            }
            if (uVar instanceof snf.h) {
                return Integer.valueOf(R$drawable.uikit_icn_24_crypto_brick);
            }
            if (f0Var instanceof b0) {
                return Integer.valueOf(R$drawable.uikit_icn_24_joint);
            }
            if (f0Var instanceof d0) {
                return Integer.valueOf(R$drawable.uikit_icn_24_children);
            }
            boolean z = uVar instanceof snf.f;
            return (z && cp5.d.z(((snf.f) uVar).f264579a)) ? Integer.valueOf(R$drawable.uikit_icn_24_bitcoin) : (z && cp5.d.y(((snf.f) uVar).f264579a)) ? Integer.valueOf(R$drawable.uikit_icn_24_commodities) : Integer.valueOf(R$drawable.uikit_icn_24_revolut);
        }
        return Integer.valueOf(R$drawable.uikit_icn_24_services);
    }

    public static TextLocalisedClause c(j jVar, Custom custom) {
        xi0.b bVar = jVar.f264589a;
        return bVar != null ? new TextLocalisedClause(R$string.transaction_details_state_investments, zhm.u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), custom, 8) : new TextLocalisedClause(R$string.transaction_details_state_investments_no_currency, null, custom, 10);
    }

    public static Custom d(snf.b bVar) {
        if (bVar.e == w.HIDDEN) {
            return new Custom(null, false, true, 246);
        }
        return null;
    }

    public static String e(snf.b bVar) {
        Class<?> cls = bVar.f264572b.getClass();
        p0 p0Var = o0.f186429a;
        String strM = p0Var.b(cls).m();
        String strM2 = p0Var.b(bVar.f264571a.getClass()).m();
        a0 a0Var = bVar.d;
        Boolean boolValueOf = a0Var != null ? Boolean.valueOf(a0Var.f264570b) : null;
        StringBuilder sbM = v0.a.m("wallet=", strM, ", accountType=", strM2, ", countryProfileSelected=");
        sbM.append(boolValueOf);
        return sbM.toString();
    }
}
