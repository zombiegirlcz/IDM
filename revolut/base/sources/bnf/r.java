package bnf;

import aw0.k7;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import jr6.v;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.h3;
import tof.i5;
import tof.j5;
import tof.o3;
import tof.p0;
import tof.y6;
import tof.z6;
import yhm.m;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements thf.m {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f17163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cnf.f f17164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cnf.m f17165c;
    public final f01.a d;
    public final n8b.b e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vfg.p f17166g;

    public r(t70.g localization, l6e.a billAccountTransactionDataProvider, cnf.f noticeDetailsTextMapper, cnf.m transferLinkExpirationNoticeMapper, f01.a uiKitResources, n8b.b countryUtils, v freelancerTransactionMapper, zpg.h vaultsTransactionDataMapper, vfg.p roboRetailTransactionResourcesProvider) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(billAccountTransactionDataProvider, "billAccountTransactionDataProvider");
        Intrinsics.checkNotNullParameter(noticeDetailsTextMapper, "noticeDetailsTextMapper");
        Intrinsics.checkNotNullParameter(transferLinkExpirationNoticeMapper, "transferLinkExpirationNoticeMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(freelancerTransactionMapper, "freelancerTransactionMapper");
        Intrinsics.checkNotNullParameter(vaultsTransactionDataMapper, "vaultsTransactionDataMapper");
        Intrinsics.checkNotNullParameter(roboRetailTransactionResourcesProvider, "roboRetailTransactionResourcesProvider");
        this.f17163a = localization;
        this.f17164b = noticeDetailsTextMapper;
        this.f17165c = transferLinkExpirationNoticeMapper;
        this.d = uiKitResources;
        this.e = countryUtils;
        this.f = freelancerTransactionMapper;
        this.f17166g = roboRetailTransactionResourcesProvider;
    }

    public static MoneyClause b(a3 a3Var, dj0.d dVar, ScaleMode.CryptoHoldingFormat cryptoHoldingFormat) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k71.k.m0(a3Var) ? k7.NEVER : k7.ALWAYS, cryptoHoldingFormat, false, false, 12), new Custom(null, k71.k.m0(a3Var), null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r1, "debtor_name_mismatch") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(tof.a3 r5) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.j(tof.a3):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair t(tof.a3 r5) {
        /*
            tof.z6 r0 = r5.H
            r1 = 0
            if (r0 == 0) goto Lc
            tof.w5 r0 = r0.k
            if (r0 == 0) goto Lc
            io3.l r0 = r0.f273144b
            goto Ld
        Lc:
            r0 = r1
        Ld:
            io3.l r2 = io3.l.MERCHANT
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L24
            tof.z6 r0 = r5.G
            if (r0 == 0) goto L1e
            tof.w5 r0 = r0.k
            if (r0 == 0) goto L1e
            io3.l r0 = r0.f273144b
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != r2) goto L22
            goto L24
        L22:
            r0 = r4
            goto L25
        L24:
            r0 = r3
        L25:
            tof.z0 r2 = r5.C0
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r3 = r4
        L2b:
            r2 = 14
            if (r0 == 0) goto L37
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transactions.impl.R$string.transactionUI_on_hold_destination_pro
            r0.<init>(r3, r1, r1, r2)
            goto L56
        L37:
            if (r3 == 0) goto L41
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transactions.impl.R$string.transactionUI_on_hold_destination_joint
            r0.<init>(r3, r1, r1, r2)
            goto L56
        L41:
            boolean r0 = k71.k.P0(r5)
            if (r0 == 0) goto L4f
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transactions.impl.R$string.transactionUI_on_hold_destination_junior
            r0.<init>(r3, r1, r1, r2)
            goto L56
        L4f:
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transactions.impl.R$string.transactionUI_on_hold_destination_personal
            r0.<init>(r3, r1, r1, r2)
        L56:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.transactions.impl.R$string.transactionUI_on_hold_destination_on_hold
            r3.<init>(r4, r1, r1, r2)
            boolean r2 = k71.k.W(r5)
            if (r2 != 0) goto L7e
            boolean r2 = k71.k.V(r5)
            if (r2 == 0) goto L6a
            goto L7e
        L6a:
            boolean r2 = k71.k.b0(r5)
            if (r2 != 0) goto L78
            boolean r5 = k71.k.c0(r5)
            if (r5 == 0) goto L77
            goto L78
        L77:
            return r1
        L78:
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r0)
            return r5
        L7e:
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.t(tof.a3):kotlin.Pair");
    }

    public final String c(a3 a3Var) {
        o3 o3Var = a3Var.J;
        if (o3Var == null) {
            throw new IllegalStateException("counterParty cannot be null in exchange transaction");
        }
        xi0.b bVar = o3Var.f272965a.f115083b;
        xi0.b bVar2 = a3Var.k.f115083b;
        Set set = k71.k.f181789a;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Pair pair = a3Var.z == p0.SELL ? new Pair(bVar2, bVar) : new Pair(bVar, bVar2);
        xi0.b bVar3 = (xi0.b) pair.f186385a;
        xi0.b bVar4 = (xi0.b) pair.f186386b;
        int i = R$string.transaction_description_internal_exchange_arrow;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        Style style = null;
        int i2 = 4;
        return o(i, zhm.v.k(new CurrencyClause(bVar3, ticker, style, i2), new CurrencyClause(bVar4, ticker, style, i2)));
    }

    public final MoneyClause d(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        y6 y6Var = transaction.e;
        y6 y6Var2 = y6.DEFI_SWAP;
        ScaleMode.CryptoHoldingFormat cryptoHoldingFormat = ScaleMode.CryptoHoldingFormat.f51439a;
        if (y6Var == y6Var2) {
            dj0.d dVarT = pyd.c.t(transaction);
            if (dVarT != null) {
                return b(transaction, dVarT, cryptoHoldingFormat);
            }
            throw new IllegalStateException("DeFi transaction metadata is required");
        }
        dj0.d dVarH = transaction.k;
        dj0.d dVar = transaction.f272599l;
        if (Intrinsics.f(dVarH.f115083b, dVar.f115083b) && dVar.f115082a != 0) {
            dVarH = pyd.c.H(dVarH, dVar);
        }
        if (!cp5.d.z(dVarH.f115083b)) {
            cryptoHoldingFormat = null;
        }
        return b(transaction, dVarH, cryptoHoldingFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.MoneyClause e(tof.a3 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            tof.y6 r0 = r10.e
            tof.y6 r1 = tof.y6.DEFI_SWAP
            com.revolut.core.model.money.ScaleMode$CryptoHoldingFormat r2 = com.revolut.core.model.money.ScaleMode.CryptoHoldingFormat.f51439a
            java.lang.String r3 = "<this>"
            r4 = 0
            if (r0 != r1) goto L33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            tof.l0 r0 = r10.Q1
            if (r0 == 0) goto L2a
            tof.h0 r0 = r0.f272899h
            if (r0 == 0) goto L2a
            java.math.BigDecimal r1 = r0.f272777a
            xi0.b r3 = new xi0.b
            java.lang.String r0 = r0.f272778b
            r5 = 6
            r3.<init>(r5, r0, r4)
            dj0.d r0 = u80.q.a(r1, r3)
            goto L2b
        L2a:
            r0 = r4
        L2b:
            if (r0 != 0) goto L2e
            goto L98
        L2e:
            com.revolut.core.ui_kit.models.MoneyClause r10 = b(r10, r0, r2)
            return r10
        L33:
            boolean r0 = k71.k.t(r10)
            if (r0 != 0) goto L59
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            boolean r0 = k71.k.u(r10)
            if (r0 != 0) goto L59
            boolean r0 = k71.k.v(r10)
            if (r0 != 0) goto L59
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            tof.y6 r0 = r10.e
            tof.y6 r1 = tof.y6.REVX_TRANSFER
            if (r0 != r1) goto L58
            boolean r0 = k71.k.q(r10)
            if (r0 == 0) goto L98
            goto L59
        L58:
            return r4
        L59:
            com.revolut.domain.models.transactions.SavingsDirection r0 = com.revolut.domain.models.transactions.SavingsDirection.TOPUP
            com.revolut.domain.models.transactions.SavingsTransactionLeg r1 = com.revolut.domain.models.transactions.SavingsTransactionLeg.SAVINGS
            boolean r0 = k71.k.y1(r10, r0, r1)
            if (r0 != 0) goto L98
            tof.o3 r0 = r10.J
            if (r0 == 0) goto L90
            dj0.d r0 = r0.f272965a
            dj0.d r1 = r10.f272599l
            xi0.b r3 = r0.f115083b
            xi0.b r5 = r1.f115083b
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r5)
            if (r3 == 0) goto L81
            long r5 = r1.f115082a
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L81
            dj0.d r0 = pyd.c.H(r0, r1)
        L81:
            xi0.b r1 = r0.f115083b
            boolean r1 = cp5.d.z(r1)
            if (r1 == 0) goto L8a
            goto L8b
        L8a:
            r2 = r4
        L8b:
            com.revolut.core.ui_kit.models.MoneyClause r10 = b(r10, r0, r2)
            return r10
        L90:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "counterParty cannot be null in exchange transaction"
            r10.<init>(r0)
            throw r10
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.e(tof.a3):com.revolut.core.ui_kit.models.MoneyClause");
    }

    public final String f(a3 transaction) {
        String country;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        j5 j5Var = transaction.A.f272779a;
        String str = j5Var.f272851g;
        String str2 = j5Var.k;
        String str3 = j5Var.i;
        String str4 = j5Var.d;
        boolean z = transaction.e == y6.ATM;
        if ((str2 == null || str2.length() == 0) && str3 != null && str3.length() != 0) {
            if (str4 == null || !z) {
                str4 = null;
            }
            String[] elements = {str4, str3};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return d0.k0(kotlin.collections.d.L(elements), null, null, null, 0, null, 63);
        }
        String iso3CountryCode = j5Var.f272852h;
        if (!(iso3CountryCode == null ? false : Pattern.compile("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$").matcher(iso3CountryCode).matches())) {
            iso3CountryCode = null;
        } else if (iso3CountryCode != null && iso3CountryCode.length() != 0) {
            int length = iso3CountryCode.length();
            n8b.b bVar = this.e;
            if (length == 3) {
                Intrinsics.checkNotNullParameter(iso3CountryCode, "iso3CountryCode");
                Locale locale = (Locale) ((Map) ((o8b.g) bVar).f222990b.getValue()).get(iso3CountryCode);
                if (locale != null && (country = locale.getCountry()) != null) {
                    iso3CountryCode = country;
                }
            }
            int length2 = iso3CountryCode.length();
            if (2 <= length2 && length2 < 4) {
                String strSubstring = iso3CountryCode.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strA = ((o8b.g) bVar).a(strSubstring);
                if (strA.length() != 0) {
                    iso3CountryCode = strA;
                }
            }
        }
        if (!(str != null ? Pattern.compile("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$").matcher(str).matches() : false)) {
            str = null;
        }
        if (str4 == null || !z) {
            str4 = null;
        }
        String[] elements2 = {str4, str, str2, iso3CountryCode};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return d0.k0(kotlin.collections.d.L(elements2), null, null, null, 0, null, 63);
    }

    public final String g(a3 transaction) {
        j5 j5Var;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        h3 h3Var = transaction.A;
        if (h3Var != null && (j5Var = h3Var.f272779a) != null && (str = j5Var.d) != null) {
            if (kotlin.text.d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = transaction.f272609r;
        if (str2 != null) {
            String str3 = kotlin.text.d0.W(str2) ? null : str2;
            if (str3 != null) {
                return str3;
            }
        }
        int i = q.f17160a[transaction.e.ordinal()];
        int i2 = R.string.transaction_refund;
        switch (i) {
            case 1:
                i2 = R.string.transaction_atm_withdrawal;
                break;
            case 2:
                i2 = R.string.transaction_card_payment;
                break;
            case 3:
                i2 = R.string.transaction_top_up;
                break;
            case 4:
                i2 = R.string.transaction_top_up_return;
                break;
            case 5:
                i2 = R.string.transaction_top_up_chargeback;
                break;
            case 6:
                i2 = R.string.top_up_transfer_form_transfer;
                break;
            case 7:
                i2 = R.string.transaction_exchange;
                break;
            case 8:
                i2 = R.string.transaction_reward;
                break;
            case 9:
                i2 = R.string.transaction_fee;
                break;
            case 10:
            case 11:
                break;
            default:
                i2 = R.string.transaction_unknown;
                break;
        }
        return this.f17163a.getString(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause h(org.joda.time.DateTime r22, tof.a3 r23, tof.t3 r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.h(org.joda.time.DateTime, tof.a3, tof.t3, boolean):com.revolut.core.ui_kit.models.Clause");
    }

    public final String i(a3 a3Var) {
        String strS = s(a3Var);
        z6 z6Var = a3Var.G;
        if (strS != null && strS.length() != 0) {
            return strS;
        }
        String strC = z6Var != null ? z6Var.c() : null;
        if (strC != null && strC.length() != 0) {
            return strC;
        }
        if (z6Var != null) {
            return z6Var.f273199g;
        }
        return null;
    }

    public final CharSequence k(a3 transaction, k71.q extraData) {
        Object objA;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        boolean zH = k71.k.h(transaction);
        String str = transaction.Y;
        y6 y6Var = transaction.e;
        String str2 = null;
        if ((!zH || y6Var != y6.TRANSFER || !k71.k.f1(transaction)) && (!k71.k.h(transaction) || (y6Var != y6.ATM && y6Var != y6.CARD_PAYMENT))) {
            str = null;
        }
        String str3 = transaction.f272611s;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 != null) {
            String strE = this.f17163a.e("transaction.list.reason.".concat(str3));
            if (strE != null && !kotlin.text.d0.W(strE)) {
                str2 = strE;
            }
        }
        int i = q.f17160a[y6Var.ordinal()];
        if (i == 1 || i == 2 ? str2 != null : str == null) {
            str = str2;
        }
        if (str != null) {
            return str;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = n(transaction, extraData);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (yhm.m.a(objA) != null) {
            objA = "";
        }
        return (CharSequence) objA;
    }

    public final String l(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return a0.o(this.f17163a.getString(j(transaction)));
    }

    public final thf.a m(a3 transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int iJ = j(transaction);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iJ, null, null, 14);
        Intrinsics.checkNotNullParameter(textLocalisedClause, "<this>");
        return new thf.a(new CapitalizedClause(textLocalisedClause), (z && iJ == 2132006742) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence n(tof.a3 r12, k71.q r13) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.n(tof.a3, k71.q):java.lang.CharSequence");
    }

    public final String o(int i, List list) {
        return this.d.b(new TextLocalisedClause(i, list, null, 12)).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[PHI: r3 r5
      0x007d: PHI (r3v54 dj0.d) = (r3v3 dj0.d), (r3v3 dj0.d), (r3v3 dj0.d), (r3v3 dj0.d), (r3v55 dj0.d) binds: [B:215:0x040e, B:216:0x0410, B:212:0x03fe, B:199:0x03c0, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r5v15 tof.y6) = (r5v1 tof.y6), (r5v1 tof.y6), (r5v1 tof.y6), (r5v6 tof.y6), (r5v16 tof.y6) binds: [B:215:0x040e, B:216:0x0410, B:212:0x03fe, B:199:0x03c0, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x070a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p(tof.a3 r31, java.util.Map r32, java.util.Map r33, java.util.Map r34, r61.c r35, java.lang.String r36, java.util.Map r37, java.util.Map r38) {
        /*
            Method dump skipped, instruction units count: 1803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.r.p(tof.a3, java.util.Map, java.util.Map, java.util.Map, r61.c, java.lang.String, java.util.Map, java.util.Map):java.lang.String");
    }

    public final String q(DateTime expirationDate) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f17165c.getClass();
        return this.d.b(cnf.m.a(expirationDate)).toString();
    }

    public final CapitalizedClause r(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int iJ = j(transaction);
        Integer numValueOf = Integer.valueOf(iJ);
        if (iJ == 2132006742) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(numValueOf.intValue(), null, null, 14);
        Intrinsics.checkNotNullParameter(textLocalisedClause, "<this>");
        return new CapitalizedClause(textLocalisedClause);
    }

    public final String s(a3 a3Var) {
        i5 i5Var = a3Var.Z;
        if (i5Var == null) {
            return null;
        }
        String str = i5Var.f272801a;
        List list = i5Var.f272802b;
        t70.g gVar = this.f17163a;
        if (list != null) {
            List list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                String[] strArr = (String[]) list2.toArray(new String[0]);
                String string = gVar.g(str, Arrays.copyOf(strArr, strArr.length)).toString();
                if (string != null) {
                    return string;
                }
            }
        }
        return gVar.l(str, new Object[0]);
    }

    public final String u(a3 a3Var) {
        List listK;
        int i = R$string.transaction_description_arrow_custom_custom;
        Pair pairT = t(a3Var);
        if (pairT != null) {
            Intrinsics.checkNotNullParameter(pairT, "<this>");
            listK = zhm.v.k(pairT.f186385a, pairT.f186386b);
        } else {
            listK = null;
        }
        if (listK == null) {
            listK = f0.f322471a;
        }
        return o(i, listK);
    }
}
