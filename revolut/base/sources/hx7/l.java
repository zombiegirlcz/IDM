package hx7;

import aw0.o9;
import com.google.common.primitives.UnsignedBytes;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.common.models.R$string;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.revolut.feature_fourthline_impl.R;
import dej.a4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import tof.a3;
import tof.t4;
import tof.u4;
import tof.v4;
import v20.g0;
import xzg.o0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final String A(qua.p pVar, f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        String strV = v(pVar, uiKitResources, currenciesLocalization);
        return strV == null ? uiKitResources.b(new TextClause(f(pVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)).toString() : strV;
    }

    public static final io3.b B(que.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        try {
            String upperCase = aVar.getType().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return new io3.b(io3.a.valueOf(upperCase), aVar.getValue());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public static final mel.m C(jrk.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        mel.q qVarValueOf = mel.q.valueOf(rVar.f178073a);
        jrk.p pVar = rVar.f178074b;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        long j2 = pVar.f178070a;
        long j3 = pVar.f178071b;
        List<jrk.o> list = pVar.f178072c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (jrk.o oVar : list) {
            arrayList.add(new mel.j(oVar.f178067a, oVar.f178068b, oVar.f178069c));
        }
        return new mel.m(qVarValueOf, new mel.k(j2, j3, arrayList), i.S(rVar.f178075c));
    }

    public static final zm3.j D(ql3.d dVar) {
        zm3.k kVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strF = dVar.getLegalName();
        String str = strF == null ? "" : strF;
        String strD = dVar.getFirstName();
        String str2 = strD == null ? "" : strD;
        String strE = dVar.getLastName();
        String str3 = strE == null ? "" : strE;
        String strJ = dVar.getUserName();
        String strB = dVar.getCode();
        String strC = dVar.getCountry();
        do3.b.Companion.getClass();
        do3.b bVar = do3.b.FULL;
        zm3.h hVarI = pw5.a.I(dVar.getPricePlan());
        String strA = dVar.getBirthday();
        LocalDate localDate = strA != null ? LocalDate.parse(strA) : null;
        String strG = dVar.getName();
        ql3.b bVarI = dVar.getType();
        int i = bVarI == null ? -1 : ql3.e.f247080a[bVarI.ordinal()];
        if (i == -1) {
            kVar = zm3.k.INDIVIDUAL;
        } else if (i == 1) {
            kVar = zm3.k.BUSINESS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = dVar.getIsJunior() ? zm3.k.JUNIOR : zm3.k.INDIVIDUAL;
        }
        return new zm3.j(str, str2, str3, strG, kVar, strB, strJ, strC, bVar, hVarI, localDate, 0L, 0);
    }

    public static final zw7.k E(gx7.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new zw7.k(fVar.getName(), fVar.getValue());
    }

    public static final zw7.k F(ix7.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new zw7.k(fVar.getName(), fVar.getValue());
    }

    public static final que.a G(io3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new que.a(bVar.f163142a.name(), bVar.f163143b);
    }

    public static int H(nr7.b bVar) {
        int i = R$drawable.uikit_icn_24_insurance;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (sr7.f.f265134a[bVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_bar_chart;
            case 2:
                return R$drawable.uikit_icn_24_calendar;
            case 3:
                return R$drawable.uikit_icn_24_calendar_recurring;
            case 4:
                return R$drawable.uikit_icn_24_camera;
            case 5:
                return R$drawable.uikit_icn_24_candle;
            case 6:
                return R$drawable.uikit_icn_24_coins;
            case 7:
                return R$drawable.uikit_icn_24_credit_overdraft;
            case 8:
                return R$drawable.uikit_icn_24_delivery_car;
            case 9:
                return R$drawable.uikit_icn_24_document;
            case 10:
                return R$drawable.uikit_icn_24_documents_pair;
            case 11:
                return R$drawable.uikit_icn_24_driving_licence;
            case 12:
                return R$drawable.uikit_icn_24_flag;
            case 13:
                return R$drawable.uikit_icn_24_insurance;
            case 14:
                return R$drawable.uikit_icn_24_lightbulb;
            case 15:
                return R$drawable.uikit_icn_24_limit;
            case 16:
                return R$drawable.uikit_icn_24_location_pin;
            case 17:
                return R$drawable.uikit_icn_24_medical_cross;
            case 18:
                return R$drawable.uikit_icn_24_people;
            case 19:
                return R$drawable.uikit_icn_24_pencil;
            case 20:
                return R$drawable.uikit_icn_24_present;
            case 21:
                return R$drawable.uikit_icn_24_profile;
            case 22:
                return R$drawable.uikit_icn_24_question;
            case 23:
                return R$drawable.uikit_icn_24_scan_card;
            case 24:
                return R$drawable.uikit_icn_24_shield;
            case 25:
                return R$drawable.uikit_icn_24_social_like;
            case 26:
                return R$drawable.uikit_icn_24_suitcase;
            case 27:
                return R$drawable.uikit_icn_24_time;
            case 28:
                return R$drawable.uikit_icn_24_travel;
            case 29:
                return R$drawable.uikit_icn_24_wealth;
            case 30:
                return i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static b36.c I(DeFiAssetRiskContent deFiAssetRiskContent, Custom custom, int i) {
        int i2;
        int i3;
        if ((i & 2) != 0) {
            custom = null;
        }
        Intrinsics.checkNotNullParameter(deFiAssetRiskContent, "<this>");
        switch (d36.a.f110920a[deFiAssetRiskContent.f71688a.ordinal()]) {
            case 1:
                i2 = R$string.crypto_defi_risk_malicious_title;
                i3 = R$string.crypto_defi_risk_malicious_subtitle;
                break;
            case 2:
                i2 = R$string.crypto_defi_risk_smart_contract_flaws_title;
                i3 = R$string.crypto_defi_risk_smart_contract_flaws_subtitle;
                break;
            case 3:
                i2 = R$string.crypto_defi_risk_market_title;
                i3 = R$string.crypto_defi_risk_market_subtitle;
                break;
            case 4:
                i2 = R$string.crypto_defi_risk_economic_title;
                i3 = R$string.crypto_defi_risk_economic_subtitle;
                break;
            case 5:
                i2 = R$string.crypto_defi_risk_behaviour_title;
                i3 = R$string.crypto_defi_risk_behaviour_subtitle;
                break;
            case 6:
                i2 = R$string.crypto_defi_risk_unknown_title;
                i3 = R$string.crypto_defi_risk_unknown_subtitle;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new b36.c(new TextLocalisedClause(i2, null, null, 10), new TextLocalisedClause(i3, null, custom, 10));
    }

    public static final NavBarWithContainerBackground a(tx0.r rVar) {
        if (rVar instanceof tx0.g) {
            return ((tx0.g) rVar).d;
        }
        if ((rVar instanceof tx0.l) || (rVar instanceof tx0.m)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(u10.f fVar) {
        switch (g0.f285411a[fVar.f.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.support.impl.transfer_tracker.domain.model.Section c(pde.i r16) {
        /*
            java.lang.String r0 = r16.getTitle()
            java.util.List r1 = r16.getSteps()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r1.next()
            pde.j r3 = (pde.j) r3
            com.revolut.feature.support.impl.transfer_tracker.domain.model.Step r4 = new com.revolut.feature.support.impl.transfer_tracker.domain.model.Step
            java.lang.String r5 = r3.getTitle()
            java.lang.String r6 = r3.getContent()
            pde.b r7 = r3.getAction()
            r8 = 0
            r10 = 1
            if (r7 == 0) goto L71
            java.lang.String r11 = r7.getType()
            tde.a[] r12 = tde.a.values()
            int r13 = r12.length
            r14 = 0
        L41:
            if (r14 >= r13) goto L53
            r15 = r12[r14]
            java.lang.String r9 = r15.name()
            boolean r9 = kotlin.text.a0.z(r9, r11, r10)
            if (r9 == 0) goto L50
            goto L54
        L50:
            int r14 = r14 + 1
            goto L41
        L53:
            r15 = r8
        L54:
            if (r15 == 0) goto L71
            com.revolut.feature.support.impl.transfer_tracker.domain.model.Action r9 = new com.revolut.feature.support.impl.transfer_tracker.domain.model.Action
            pde.a r7 = r7.getContent()
            if (r7 == 0) goto L6c
            com.revolut.feature.support.impl.transfer_tracker.domain.model.ActionContent r11 = new com.revolut.feature.support.impl.transfer_tracker.domain.model.ActionContent
            java.lang.String r12 = r7.getTitle()
            java.lang.String r7 = r7.getContent()
            r11.<init>(r12, r7)
            goto L6d
        L6c:
            r11 = r8
        L6d:
            r9.<init>(r15, r11)
            goto L72
        L71:
            r9 = r8
        L72:
            java.lang.String r3 = r3.getIcon()
            tde.q[] r7 = tde.q.values()
            int r11 = r7.length
            r12 = 0
        L7c:
            if (r12 >= r11) goto L8e
            r13 = r7[r12]
            java.lang.String r14 = r13.name()
            boolean r14 = kotlin.text.a0.z(r14, r3, r10)
            if (r14 == 0) goto L8b
            goto L8f
        L8b:
            int r12 = r12 + 1
            goto L7c
        L8e:
            r13 = r8
        L8f:
            if (r13 != 0) goto La9
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r10 = "Icon name ("
            java.lang.String r11 = ") is not a valid icon name"
            java.lang.String r3 = p.a.p(r10, r3, r11)
            r7.<init>(r3)
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            rd0.d.a(r10, r8, r8, r7, r3)
            tde.q r13 = tde.q.Number
        La9:
            r4.<init>(r5, r6, r9, r13)
            r2.add(r4)
            goto L19
        Lb1:
            com.revolut.feature.support.impl.transfer_tracker.domain.model.Section r1 = new com.revolut.feature.support.impl.transfer_tracker.domain.model.Section
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.l.c(pde.i):com.revolut.feature.support.impl.transfer_tracker.domain.model.Section");
    }

    public static final String d(cm1.c cVar) {
        return "BILLERS_DATA-BillerTypeRequest(paymentMethod=" + cVar.f25108a + ", category=" + cVar.f25109b + ")";
    }

    public static byte[] e(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static final String f(qua.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        f5j.a aVar = pVar.f249329r;
        if (aVar != null) {
            return n61.j.c(aVar);
        }
        vua.a aVar2 = pVar.f249330s;
        if (aVar2 != null) {
            return a0.d.v(new Object[]{aVar2.f292280b, aVar2.f292281c}, 2, "%s %s", "format(...)");
        }
        fva.m mVar = pVar.u;
        if (mVar != null) {
            return mVar.f138404a;
        }
        String str = pVar.k;
        return str == null ? "" : str;
    }

    public static String g(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            int i = b4 & UnsignedBytes.MAX_VALUE;
            sb6.append("0123456789abcdef".charAt(i / 16));
            sb6.append("0123456789abcdef".charAt(i % 16));
        }
        return sb6.toString();
    }

    public static final String h(t61.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(d0.b0(String.valueOf(gVar.f), 2, '0'), "/", d0.b0(String.valueOf(gVar.f268140g % 100), 2, '0'));
    }

    public static final yoj.a i(yoj.f fVar, yoj.c name) {
        Object next;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it8 = fVar.f315686a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((yoj.a) next).f315682a == name) {
                break;
            }
        }
        return (yoj.a) next;
    }

    public static final Map j() {
        return r0.k(new Pair("VISA", e93.b.VISA), new Pair("MASTERCARD", e93.b.MC), new Pair("MAESTRO", e93.b.MAESTRO), new Pair("MULTIBANCO", e93.b.MULTIBANCO));
    }

    public static final Map k() {
        return r0.k(new Pair("PROMPT_VIEWED", wc8.a.PROMPT_VIEWED), new Pair("CONSENT_GIVEN", wc8.a.CONSENT_GIVEN), new Pair("CONSENT_NOT_GIVEN", wc8.a.CONSENT_NOT_GIVEN));
    }

    public static final boolean l(a4 a4Var) {
        Intrinsics.checkNotNullParameter(a4Var, "<this>");
        return a4Var.f113490h != null || a4Var.f113488c == dej.l.LOW_SPEED;
    }

    public static final long m(a3 a3Var) {
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        v4 v4Var = a3Var.u;
        if (v4Var instanceof t4) {
            return 0L;
        }
        if (v4Var instanceof u4) {
            return ((u4) v4Var).f273101a.f115082a;
        }
        if (v4Var == null) {
            return Math.abs(k71.k.b(a3Var).f115082a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int n(aef.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (aef.b.f3574a[aVar.ordinal()]) {
            case 1:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_created;
            case 2:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_in_review;
            case 3:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_rejected;
            case 4:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_ineligible;
            case 5:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_refunded;
            case 6:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_raised_to_card_scheme;
            case 7:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_canceled;
            case 8:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_lost;
            case 9:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_won;
            case 10:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_provisional_refund_reverted;
            case 11:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_merchant_refund;
            case 12:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_provisional_refund;
            case 13:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_reviewing_evidence;
            case 14:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_widget_title_sent_back_to_card_scheme;
            case 15:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_pending;
            case 16:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_information_provided;
            case 17:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_information_provided;
            case 18:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_pending_user;
            case 19:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_pending_user;
            case 20:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_pending_user;
            case 21:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_sent_back_to_card_scheme;
            case 22:
                return com.revolut.feature.transaction.chargeback.status.api.R$string.transaction_chargeback_status_state_sent_back_to_card_scheme_arbitration;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean o(b93.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b93.a aVar = b93.b.Companion;
        aVar.getClass();
        b93.b bVar2 = b93.b.E0;
        aVar.getClass();
        b93.b bVar3 = b93.b.F0;
        aVar.getClass();
        b93.b bVar4 = b93.b.G0;
        aVar.getClass();
        b93.b bVar5 = b93.b.I0;
        aVar.getClass();
        b93.b bVar6 = b93.b.H0;
        aVar.getClass();
        b93.b bVar7 = b93.b.J0;
        aVar.getClass();
        b93.b bVar8 = b93.b.C0;
        aVar.getClass();
        b93.b bVar9 = b93.b.D0;
        aVar.getClass();
        b93.b bVar10 = b93.b.V0;
        aVar.getClass();
        b93.b bVar11 = b93.b.W0;
        aVar.getClass();
        b93.b bVar12 = b93.b.X0;
        aVar.getClass();
        b93.b bVar13 = b93.b.Y0;
        aVar.getClass();
        b93.b bVar14 = b93.b.Z0;
        aVar.getClass();
        b93.b bVar15 = b93.b.a1;
        aVar.getClass();
        b93.b bVar16 = b93.b.f13540b1;
        aVar.getClass();
        b93.b bVar17 = b93.b.f13544c1;
        aVar.getClass();
        b93.b bVar18 = b93.b.K0;
        aVar.getClass();
        b93.b bVar19 = b93.b.L0;
        aVar.getClass();
        b93.b bVar20 = b93.b.M0;
        aVar.getClass();
        b93.b bVar21 = b93.b.N0;
        aVar.getClass();
        b93.b bVar22 = b93.b.O0;
        aVar.getClass();
        b93.b bVar23 = b93.b.P0;
        aVar.getClass();
        b93.b bVar24 = b93.b.Q0;
        aVar.getClass();
        b93.b bVar25 = b93.b.R0;
        aVar.getClass();
        b93.b bVar26 = b93.b.S0;
        aVar.getClass();
        b93.b bVar27 = b93.b.T0;
        aVar.getClass();
        return v.k(bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, b93.b.U0).contains(bVar);
    }

    public static final boolean p(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((WealthAccount) it8.next()) instanceof WealthAccount.Securities) {
                if (z && list2.isEmpty()) {
                    return true;
                }
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (((WealthAccount) it9.next()).getF95255c() != o0.AVAILABLE) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean q(yoj.f fVar, yoj.c name) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        yoj.a aVarI = i(fVar, name);
        if (aVarI != null) {
            return yoj.b.k(aVarI);
        }
        return false;
    }

    public static final boolean r(b93.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b93.a aVar = b93.b.Companion;
        aVar.getClass();
        b93.b bVar2 = b93.b.j0;
        aVar.getClass();
        b93.b bVar3 = b93.b.f13568k0;
        aVar.getClass();
        b93.b bVar4 = b93.b.f13605w0;
        aVar.getClass();
        b93.b bVar5 = b93.b.y0;
        aVar.getClass();
        b93.b bVar6 = b93.b.A0;
        aVar.getClass();
        b93.b bVar7 = b93.b.f13608x0;
        aVar.getClass();
        b93.b bVar8 = b93.b.z0;
        aVar.getClass();
        b93.b bVar9 = b93.b.B0;
        aVar.getClass();
        b93.b bVar10 = b93.b.l0;
        aVar.getClass();
        b93.b bVar11 = b93.b.p0;
        aVar.getClass();
        b93.b bVar12 = b93.b.m0;
        aVar.getClass();
        b93.b bVar13 = b93.b.f13581o0;
        aVar.getClass();
        b93.b bVar14 = b93.b.f13577n0;
        aVar.getClass();
        b93.b bVar15 = b93.b.f13593r0;
        aVar.getClass();
        b93.b bVar16 = b93.b.q0;
        aVar.getClass();
        b93.b bVar17 = b93.b.f13598t0;
        aVar.getClass();
        b93.b bVar18 = b93.b.f13595s0;
        aVar.getClass();
        b93.b bVar19 = b93.b.u0;
        aVar.getClass();
        b93.b[] elements = {bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, b93.b.f13601v0};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(bVar);
    }

    public static final zli.d s(zli.b bVar, String template) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        List listM0 = d0.m0(d0.G0(d0.A0('?', template), '/'), new char[]{'/'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM0) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == bVar.f323280c.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Object obj3 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String str = (String) obj3;
                String str2 = (String) bVar.f323280c.get(i);
                if (a0.H(str, "{", false) && a0.y(str, "}", false)) {
                    linkedHashMap.put(d0.i0(str, "{", "}"), str2);
                } else if (!str.equals(str2)) {
                }
                i = i2;
            }
            return new zli.d(linkedHashMap);
        }
        return null;
    }

    public static final dj0.d t(dj0.d dVar, dj0.d money) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(money, "money");
        dj0.d dVarH = pyd.c.H(dVar, money);
        dj0.d.Companion.getClass();
        return dVarH.i(dj0.d.e) ? new dj0.d(0L, dVar.f115083b) : dVarH;
    }

    public static final xi0.b u(BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
        wd6.a aVar = buyFundingCurrencyPrefill != null ? buyFundingCurrencyPrefill.f72125b : null;
        int i = aVar == null ? -1 : wd6.b.f296465a[aVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return buyFundingCurrencyPrefill.f72124a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String v(qua.p r17, f01.a r18, t70.b r19) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.l.v(qua.p, f01.a, t70.b):java.lang.String");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final aef.a w(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1970805584:
                if (str.equals("TO_BE_RAISED")) {
                    return aef.a.IN_REVIEW;
                }
                return null;
            case -1924016466:
                if (str.equals("MERCHANT_REFUNDED")) {
                    return aef.a.MERCHANT_REFUND;
                }
                return null;
            case -1905211228:
                if (!str.equals("DISPUTE")) {
                    return null;
                }
                return aef.a.RAISED_TO_CARD_SCHEME;
            case -1784915565:
                if (str.equals("PENDING_USER")) {
                    return aef.a.INFORMATION_REQUIRED;
                }
                return null;
            case -1682950360:
                if (!str.equals("PRE_ARBITRATION_FRAUD")) {
                    return null;
                }
                return aef.a.REVIEWING_EVIDENCE;
            case -1634611398:
                if (!str.equals("INTERNAL_MISTAKE_REFUNDED")) {
                    return null;
                }
                return aef.a.REFUNDED;
            case -1363221124:
                if (!str.equals("DISPUTE_RESPONSE")) {
                    return null;
                }
                return aef.a.REVIEWING_EVIDENCE;
            case -1338575770:
                if (!str.equals("REPRESENTMENT")) {
                    return null;
                }
                return aef.a.REVIEWING_EVIDENCE;
            case -1280016901:
                if (!str.equals("ARBITRATION_CHARGEBACK")) {
                    return null;
                }
                return aef.a.SENT_BACK_TO_CARD_SCHEME;
            case -1199933881:
                if (!str.equals("GOODWILL_REFUNDED")) {
                    return null;
                }
                return aef.a.REFUNDED;
            case -1087116447:
                if (str.equals("PENDING_USER_CONFIRMATION")) {
                    return aef.a.PENDING_USER_CONFIRMATION;
                }
                return null;
            case -886010954:
                if (str.equals("INFORMATION_PROVIDED")) {
                    return aef.a.INFORMATION_PROVIDED;
                }
                return null;
            case -777642017:
                if (str.equals("ARBITRATION")) {
                    return aef.a.ARBITRATION;
                }
                return null;
            case -323574563:
                if (!str.equals("PRE_ARBITRATION_RESPONSE")) {
                    return null;
                }
                return aef.a.SENT_BACK_TO_CARD_SCHEME;
            case -132052198:
                if (str.equals("LOST_REFUND_REVERSAL")) {
                    return aef.a.PROVISIONAL_REFUND_REVERTED;
                }
                return null;
            case -128801656:
                if (!str.equals("PRE_ARBITRATION_DISPUTE")) {
                    return null;
                }
                return aef.a.SENT_BACK_TO_CARD_SCHEME;
            case 86134:
                if (str.equals("WON")) {
                    return aef.a.SUCCESSFUL;
                }
                return null;
            case 2342692:
                if (str.equals("LOST")) {
                    return aef.a.UNSUCCESSFUL;
                }
                return null;
            case 64204828:
                if (!str.equals("CLAIM")) {
                    return null;
                }
                return aef.a.RAISED_TO_CARD_SCHEME;
            case 174130302:
                if (str.equals("REJECTED")) {
                    return aef.a.INVALID;
                }
                return null;
            case 175259132:
                if (str.equals("INELIGIBLE")) {
                    return aef.a.INELIGIBLE;
                }
                return null;
            case 210937079:
                if (str.equals("PROVISIONAL_REFUND")) {
                    return aef.a.PROVISIONAL_REFUND;
                }
                return null;
            case 281171260:
                if (str.equals("INFORMATION_PROVIDED_SECOND_STAGE")) {
                    return aef.a.INFORMATION_PROVIDED_SECOND_STAGE;
                }
                return null;
            case 659453081:
                if (str.equals("CANCELED")) {
                    return aef.a.CANCELLED;
                }
                return null;
            case 829251574:
                if (str.equals("PENDING_TRANSACTION")) {
                    return aef.a.PENDING_TRANSACTION;
                }
                return null;
            case 1663219327:
                if (str.equals("PENDING_USER_SECOND_STAGE")) {
                    return aef.a.PENDING_USER_SECOND_STAGE;
                }
                return null;
            case 1669269539:
                if (str.equals("PRE_ARBITRATION")) {
                    return aef.a.PRE_ARBITRATION;
                }
                return null;
            case 1746537160:
                if (!str.equals("CREATED")) {
                    return null;
                }
                return aef.a.SUBMITTED;
            case 1765463828:
                if (!str.equals("RETRIEVAL")) {
                    return null;
                }
                return aef.a.SUBMITTED;
            case 1862795356:
                if (!str.equals("REG_E_TIMEFRAME_REFUND")) {
                    return null;
                }
                return aef.a.REFUNDED;
            case 1903597979:
                if (!str.equals("CHARGEBACK")) {
                    return null;
                }
                return aef.a.RAISED_TO_CARD_SCHEME;
            default:
                return null;
        }
    }

    public static final yoj.a x(yoj.c cVar, yoj.d state) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return new yoj.a(cVar, state, f0.f322471a, r0.g());
    }

    public static final String z(qua.p pVar, f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        String strV = v(pVar, uiKitResources, currenciesLocalization);
        return strV != null ? strV : uiKitResources.b(new TextLocalisedClause(R.string.common_to_pattern, u.c(f(pVar)), null, 12)).toString();
    }
}
