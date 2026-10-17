package f61;

import a26.s;
import akg.n;
import aw0.bb;
import aw0.cb;
import aw0.o9;
import bka.b0;
import bka.b1;
import bka.c1;
import bka.d1;
import bka.e1;
import bka.g0;
import bka.l0;
import bka.x0;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitInputScreen;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import efm.r;
import fg8.y;
import fkd.j0;
import foc.h;
import g0d.m;
import gcm.r2;
import gkd.b;
import hk9.q;
import ht.i;
import ip0.vj0;
import is2.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import k50.a4;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.z;
import lkd.k;
import n61.j;
import nq.w;
import qdf.d;
import qta.f;
import rd0.e;
import vkm.j2;
import vpk.g;
import vpk.p;
import wli.x;
import xf6.v1;
import yhm.m;
import zhm.d0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zp0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c, k, o, d, r2, b, cy8.a, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f132372b;

    public a(s function) {
        this.f132371a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public static w C(BiometricVerificationDocumentPage biometricVerificationDocumentPage) {
        nq.b bVar = biometricVerificationDocumentPage.f50380b;
        nq.c cVar = biometricVerificationDocumentPage.f50381c;
        int i = i.f155111a[bVar.ordinal()];
        if (i == 1) {
            int i2 = i.f155112b[cVar.ordinal()];
            if (i2 == 1) {
                return w.DOCUMENT_FRONT_TILT_VIDEO;
            }
            if (i2 == 2) {
                return w.DOCUMENT_FRONT_VIDEO;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = i.f155112b[cVar.ordinal()];
        if (i3 == 1) {
            return w.DOCUMENT_BACK_TILT_VIDEO;
        }
        if (i3 == 2) {
            return w.DOCUMENT_BACK_VIDEO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean D(f5j.a aVar, AccountFieldType... accountFieldTypeArr) {
        Map map = aVar.u;
        if (map != null) {
            for (AccountFieldType accountFieldType : accountFieldTypeArr) {
                if (map.containsKey(accountFieldType.name())) {
                }
            }
            return true;
        }
        return false;
    }

    public static r H(a aVar, Pair currencyPair, f duration, int i) {
        Long l2 = (i & 4) != 0 ? null : 15L;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((p) aVar.f132372b).c(currencyPair, duration, l2, loadingStrategy);
    }

    public static String I(f5j.a aVar, AccountFieldType accountFieldType) {
        String str;
        Map map = aVar.u;
        String strB = (map == null || (str = (String) map.get(accountFieldType.name())) == null) ? null : j.b(accountFieldType, str);
        return strB == null ? "" : strB;
    }

    public static String u(f5j.a aVar, AccountFieldType... accountFieldTypeArr) throws IOException {
        Collection collectionValues;
        Map map = aVar.u;
        if (map == null) {
            return "";
        }
        if (accountFieldTypeArr.length == 0) {
            collectionValues = map.values();
        } else {
            ArrayList arrayList = new ArrayList();
            for (AccountFieldType accountFieldType : accountFieldTypeArr) {
                String str = (String) map.get(accountFieldType.name());
                String strB = str != null ? j.b(accountFieldType, str) : null;
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            collectionValues = arrayList;
        }
        m70.a.a(t0.f186434a);
        String strK0 = d0.k0(collectionValues, " · ", null, null, 0, null, 62);
        return strK0 == null ? "" : strK0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.TextClause v(f5j.a r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f61.a.v(f5j.a):com.revolut.core.ui_kit.models.TextClause");
    }

    public static w y(BiometricVerificationDocumentPage biometricVerificationDocumentPage) {
        int i = i.f155112b[biometricVerificationDocumentPage.f50381c.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Document tilt picture is not supported");
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = i.f155111a[biometricVerificationDocumentPage.f50380b.ordinal()];
        if (i2 == 1) {
            return w.DOCUMENT_FRONT;
        }
        if (i2 == 2) {
            return w.DOCUMENT_BACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static w z(BiometricVerificationDocumentPage biometricVerificationDocumentPage) {
        int i = i.f155111a[biometricVerificationDocumentPage.f50380b.ordinal()];
        if (i == 1) {
            return w.DOCUMENT_FRONT;
        }
        if (i == 2) {
            return w.DOCUMENT_BACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable A(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof j9k.b
            if (r0 == 0) goto L13
            r0 = r7
            j9k.b r0 = (j9k.b) r0
            int r1 = r0.f172355y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172355y = r1
            goto L18
        L13:
            j9k.b r0 = new j9k.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f172353w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172355y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Set r6 = r0.v
            java.util.Set r6 = (java.util.Set) r6
            java.util.Set r0 = r0.u
            java.util.Set r0 = (java.util.Set) r0
            yhm.o.b(r7)
            goto L7b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.util.Set r6 = r0.u
            java.util.Set r6 = (java.util.Set) r6
            yhm.o.b(r7)
            goto L53
        L42:
            yhm.o.b(r7)
            r7 = r6
            java.util.Set r7 = (java.util.Set) r7
            r0.u = r7
            r0.f172355y = r4
            java.lang.Object r7 = r5.x(r0)
            if (r7 != r1) goto L53
            goto L7a
        L53:
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = zhm.a1.k(r7, r6)
            java.lang.Object r7 = r5.f132372b
            fk3.a r7 = (fk3.a) r7
            ik3.c r7 = (ik3.c) r7
            efm.r r7 = r7.o()
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            r0.u = r4
            r2 = r6
            java.util.Set r2 = (java.util.Set) r2
            r0.v = r2
            r0.f172355y = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L7b
        L7a:
            return r1
        L7b:
            java.util.Set r7 = (java.util.Set) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.LinkedHashSet r6 = zhm.a1.l(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f61.a.A(java.util.Set, gim.c):java.io.Serializable");
    }

    public Clause B(f5j.a beneficiary, boolean z, Custom custom) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String str = beneficiary.A;
        Map mapG = beneficiary.u;
        f5j.r rVar = beneficiary.f132335l;
        if (z && str != null && str.length() != 0) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        AccountFieldType accountFieldType = AccountFieldType.CARD_LAST_FOUR;
        if (D(beneficiary, accountFieldType)) {
            return new TextClause(I(beneficiary, accountFieldType), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (mapG != null && mapG.containsKey("CLABE")) {
            return new TextLocalisedClause(R$string.bank_transfer_beneficiary_field_format, v.k(new TextLocalisedClause(R$string.transfer_new_form_CLABE, null, null, 14), new TextClause(I(beneficiary, AccountFieldType.CLABE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), custom, 8);
        }
        AccountFieldType accountFieldType2 = AccountFieldType.ALIAS_VALUE;
        if (rVar == f5j.r.PAYID_ALIAS && D(beneficiary, accountFieldType2)) {
            return new TextClause(I(beneficiary, accountFieldType2), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (rVar == f5j.r.IBAN) {
            return t(beneficiary, v.k(AccountFieldType.IBAN, AccountFieldType.BIC), custom);
        }
        if (d0.T(v.k(f5j.r.UK, f5j.r.US, f5j.r.SWIFT, f5j.r.LOCAL), rVar)) {
            return t(beneficiary, v.k(AccountFieldType.ACCOUNT_NUMBER, AccountFieldType.SORT_CODE, AccountFieldType.BIC), custom);
        }
        if (f5j.c.c(beneficiary)) {
            return new TextClause(u(beneficiary, AccountFieldType.ACCOUNT_NUMBER, AccountFieldType.BRAZIL_BRANCH_NUMBER), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (rVar == f5j.r.CO_ACH) {
            return t(beneficiary, v.k(AccountFieldType.ACCOUNT_NUMBER, AccountFieldType.COLOMBIA_BANK_CODE), custom);
        }
        if (mapG == null) {
            mapG = r0.g();
        }
        ArrayList arrayList = new ArrayList(mapG.size());
        for (Map.Entry entry : mapG.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            arrayList.add(new TextLocalisedClause(R$string.bank_transfer_beneficiary_field_format, v.k(((z2j.c) this.f132372b).a(str2), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 8));
        }
        return new CompositeClause(arrayList, new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }

    public r E(Pair currencyPair, f duration, Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        p pVar = (p) this.f132372b;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return e.c(qe0.o.a(pVar.k, new g(currencyPair, duration, vpk.f.MID_CANDLE, l2, null, z, 80), l2 != null ? l2.longValue() : 10L, null, false, null, 20), kotlin.coroutines.g.f186406a);
    }

    public r F(Pair currencyPair, f duration, boolean z, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p pVar = (p) this.f132372b;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = new g(currencyPair, duration, vpk.f.MID_CANDLE, null, null, z, 64);
        return e.c(pVar.f291254l.b(gVar, pVar.b() ? pVar.f291251g.d(loadingStrategy, p.f(gVar), true) : loadingStrategy), kotlin.coroutines.g.f186406a);
    }

    public n G(iuk.a screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return nim.a.v(((z0h.d) this.f132372b).w0(), new t(this, screen));
    }

    @Override // lkd.k
    public Object Y(SlotContext slotContext, lkd.j jVar, lkd.d dVar, Continuation continuation) {
        lkd.a aVar = dVar instanceof lkd.a ? (lkd.a) dVar : null;
        String str = aVar != null ? aVar.f196355a : null;
        return (str == null || str.length() == 0) ? Boolean.FALSE : ((x) this.f132372b).L1(str, lg0.a.OPEN_BROWSER, Boolean.FALSE, continuation);
    }

    @Override // gkd.b
    public String a() {
        return ((j0) ((fkd.r0) this.f132372b).f135792b.d.get(0)).f135772b;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f132371a) {
            case 3:
                return ((fa9.c) this.f132372b).invoke(obj2);
            case 7:
                return ((m) this.f132372b).invoke(obj2);
            case 9:
                return ((s) this.f132372b).invoke(obj2);
            case 20:
                return ((i2i.d0) this.f132372b).invoke(obj2);
            case 21:
                return ((i2i.d0) this.f132372b).invoke(obj2);
            default:
                return ((j2i.c) this.f132372b).invoke(obj2);
        }
    }

    @Override // foc.h
    public hw0.x c(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return ioc.b.b(chart);
    }

    @Override // gkd.b
    public String d() {
        return ((j0) ((fkd.r0) this.f132372b).f135792b.d.get(1)).f135772b;
    }

    @Override // gcm.r2
    public void e() {
        ((AtomicLong) this.f132372b).getAndAdd(1L);
    }

    @Override // foc.h
    public Clause f(hoc.d dVar, hoc.h hVar) {
        hoc.b chart = (hoc.b) dVar;
        hoc.f fVar = (hoc.f) hVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (fVar == null) {
            fVar = (hoc.f) d0.m0(chart.a());
        }
        return ioc.b.c(fVar);
    }

    @Override // foc.h
    public vj0 g(hoc.d dVar, eoc.e chartSettingsState, hoc.h hVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartSettingsState, "chartSettingsState");
        return null;
    }

    @Override // gkd.b
    public String h() throws Throwable {
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("content deeplink is not supported by SlotDefaultTodoTileDeeplinkExtractor");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA == null) {
                return null;
            }
            hx7.e.n(thA);
            return null;
        }
    }

    @Override // cy8.a
    public Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (((r10.v) this.f132372b).m(url2) != null) {
            return url2;
        }
        return null;
    }

    @Override // foc.h
    public cb j(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (hx7.a.n(chart)) {
            cb.Companion.getClass();
            return bb.d();
        }
        cb.Companion.getClass();
        return bb.b();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Object value;
        dj0.d dVar;
        Object counter;
        int i = this.f132371a;
        Object obj2 = this.f132372b;
        switch (i) {
            case 1:
                MandateLimitInputScreen mandateLimitInputScreen = (MandateLimitInputScreen) obj2;
                xi0.b bVar = mandateLimitInputScreen.R;
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                if (z) {
                    u80.p pVar = u80.p.f278066a;
                    String str = bVar.f306286a;
                    qd0.b bVarN = ((v1) mandateLimitInputScreen.N.getValue()).f305119b.d.n();
                    vc.s.j(bVarN);
                    long jA = u80.p.a(formattedValue, str, bVarN, null);
                    fh6.k kVar = (fh6.k) mandateLimitInputScreen.O.getValue();
                    dj0.d amount = new dj0.d(jA, bVar);
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    kVar.H2(kVar.f135163p, new y(amount, kVar.o.f72458a.S0(amount), 7));
                    return;
                }
                return;
            case 12:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                q qVar = (q) ((PurchaseCalculatorController) obj2).R2();
                qVar.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "newAmount");
                j2 j2Var = qVar.f152891x;
                do {
                    value = j2Var.getValue();
                    dVar = (dj0.d) value;
                } while (!j2Var.h(value, dj0.d.c(dVar, qVar.f152888s.b(formattedValue, dVar.f115083b.f306286a), null, 2)));
                return;
            case 25:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar2 = (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) ((InputAmountScreen) obj2).e3();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                bVar2.H2(bVar2.f68613t, new je2.d(bVar2, formattedValue, 20));
                return;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar = (com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) ((TransactionsLimitsChangeScreen) obj2).R2();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(extractedValue, "text");
                cli.y yVar = aVar.v;
                OutboundTransactionLimit outboundTransactionLimit = ((jwc.f) ((j2) yVar.f22677a).getValue()).f178956b;
                LimitValue limitValue = outboundTransactionLimit.f85476b;
                if (limitValue instanceof LimitValue.Amount) {
                    w80.b bVar3 = aVar.f85766q;
                    dj0.d dVar2 = ((LimitValue.Amount) limitValue).f85473c;
                    counter = new LimitValue.Amount(new dj0.d(bVar3.b(extractedValue, dVar2.f115083b.f306286a), dVar2.f115083b));
                } else {
                    if (!(limitValue instanceof LimitValue.Counter)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long jLongValue = 0;
                    if (extractedValue.length() != 0) {
                        Regex regex = jli.g.f175847a;
                        Intrinsics.checkNotNullParameter(extractedValue, "<this>");
                        Long lN = z.n(extractedValue);
                        if (lN != null) {
                            jLongValue = lN.longValue();
                        }
                    }
                    counter = new LimitValue.Counter(jLongValue);
                }
                aVar.H2(yVar, new jp3.b(outboundTransactionLimit, counter, 22));
                return;
        }
    }

    @Override // foc.h
    public Clause l(hoc.d dVar, pdh.c selectedTimeSpan, hoc.h hVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
        return ((ioc.b) this.f132372b).a(chart, selectedTimeSpan, (hoc.f) hVar);
    }

    @Override // cy8.a
    public /* bridge */ /* synthetic */ av1.c m() {
        return tx8.f.f275349c;
    }

    @Override // qdf.d
    public ihm.f n() {
        return ((EtfDetailsOverviewController) this.f132372b).O.f51654g;
    }

    @Override // qdf.d
    public ihm.f o() {
        return ((EtfDetailsOverviewController) this.f132372b).O.d;
    }

    @Override // foc.h
    public List p(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        int i = ioc.c.f163218a[chart.f154269c.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("SIMULATED_PORTFOLIO_PERFORMANCE is not supported in HistoricalPerformanceChartUiMapper");
        }
        if (i == 2) {
            return v.k(pdh.c.ONE_DAY, pdh.c.ONE_WEEK, pdh.c.ONE_MONTH, pdh.c.SIX_MONTHS, pdh.c.ONE_YEAR, pdh.c.ALL);
        }
        if (i == 3) {
            return u.c(pdh.c.FIVE_YEARS);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // foc.h
    public hw0.z q(hoc.d dVar) {
        hoc.b chart = (hoc.b) dVar;
        Intrinsics.checkNotNullParameter(chart, "chart");
        return ioc.b.d(chart);
    }

    public void s(ArrayList arrayList, bka.a aVar) {
        if (aVar instanceof l0) {
            g0 g0Var = ((l0) aVar).f16325a;
            arrayList.add(new m79.f(g0Var.f16312a, g0Var.f16313b, null));
            return;
        }
        if (aVar instanceof bka.r) {
            bka.p pVar = ((bka.r) aVar).f16333a;
            arrayList.add(new m79.f(pVar.f16329a, pVar.f16330b, null));
            return;
        }
        if (aVar instanceof bka.k) {
            bka.g gVar = ((bka.k) aVar).f16321a;
            if (gVar.f16311a.isEmpty()) {
                return;
            }
            List<bka.j> list = gVar.f16311a;
            ArrayList arrayList2 = new ArrayList();
            for (bka.j jVar : list) {
                String str = jVar.f16320c;
                if (str == null || kotlin.text.d0.W(str)) {
                    str = null;
                }
                String str2 = jVar.f16319b;
                if (kotlin.text.d0.W(str2)) {
                    str2 = null;
                }
                m79.d dVar = (str == null && str2 == null) ? null : new m79.d(str2, str);
                if (dVar != null) {
                    arrayList2.add(dVar);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(new m79.c(arrayList2));
            return;
        }
        if (aVar instanceof bka.t0) {
            arrayList.add(new m79.f(((bka.t0) aVar).f16339a.f16337a, null, null));
            return;
        }
        if (aVar instanceof c1) {
            b1 b1Var = ((c1) aVar).f16304a;
            x0 x0Var = b1Var.d;
            arrayList.add(new m79.f(b1Var.f16299a, b1Var.f16300b, x0Var != null ? new m79.b(x0Var.f16346a, x0Var.f16347b) : null));
        } else if (aVar instanceof b0) {
            arrayList.add(new m79.e(((vka.a) ((fka.a) this.f132372b)).a((b0) aVar, new a4(26))));
        } else if (aVar instanceof bka.s) {
            bka.s sVar = (bka.s) aVar;
            arrayList.add(new m79.f(sVar.f16334a, sVar.f16335b, null));
        } else if (aVar instanceof d1) {
            d1 d1Var = (d1) aVar;
            arrayList.add(new m79.f(d1Var.f16305a, d1Var.f16306b, null));
        } else if (!Intrinsics.f(aVar, e1.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public CompositeClause t(f5j.a aVar, List list, Style style) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            AccountFieldType accountFieldType = (AccountFieldType) it8.next();
            Map map = aVar.u;
            String strB = (map == null || (str = (String) map.get(accountFieldType.name())) == null) ? null : j.b(accountFieldType, str);
            TextLocalisedClause textLocalisedClause = strB != null ? new TextLocalisedClause(R$string.bank_transfer_beneficiary_field_format, v.k(((z2j.c) this.f132372b).a(accountFieldType.name()), new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 8) : null;
            if (textLocalisedClause != null) {
                arrayList.add(textLocalisedClause);
            }
        }
        return new CompositeClause(arrayList, new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), style, null, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r12 == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(dj0.d r8, java.lang.String r9, java.lang.Boolean r10, ve6.a r11, gim.c r12) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f132372b
            ig6.b r0 = (ig6.b) r0
            boolean r1 = r12 instanceof ig6.a
            if (r1 == 0) goto L17
            r1 = r12
            ig6.a r1 = (ig6.a) r1
            int r2 = r1.f161081w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f161081w = r2
            goto L1c
        L17:
            ig6.a r1 = new ig6.a
            r1.<init>(r7, r12)
        L1c:
            java.lang.Object r12 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f161081w
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            yhm.o.b(r12)
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r12)
            goto L5c
        L3b:
            yhm.o.b(r12)
            lg6.a r12 = new lg6.a
            r12.<init>(r8, r9, r10, r11)
            r1.f161081w = r5
            zh6.c r8 = r0.f161082a
            r8.getClass()
            zah.f r9 = new zah.f
            r10 = 11
            r9.<init>(r8, r12, r6, r10)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r8, r9, r1)
            if (r12 != r2) goto L5c
            goto L7a
        L5c:
            jg6.a r12 = (jg6.a) r12
            java.lang.String r8 = r12.f173931a
            java.lang.String r8 = r12.f173932b
            r1.f161081w = r4
            zh6.c r9 = r0.f161082a
            r9.getClass()
            zah.f r10 = new zah.f
            r11 = 10
            r10.<init>(r9, r8, r6, r11)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r8, r10, r1)
            if (r12 != r2) goto L7b
        L7a:
            return r2
        L7b:
            java.lang.String r12 = (java.lang.String) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f61.a.w(dj0.d, java.lang.String, java.lang.Boolean, ve6.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j9k.a
            if (r0 == 0) goto L13
            r0 = r6
            j9k.a r0 = (j9k.a) r0
            int r1 = r0.f172351w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172351w = r1
            goto L18
        L13:
            j9k.a r0 = new j9k.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172351w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f132372b
            fk3.a r6 = (fk3.a) r6
            ik3.c r6 = (ik3.c) r6
            fk3.b r6 = r6.f161878a
            ik3.g r6 = (ik3.g) r6
            e7l.g$b r2 = e7l.g.b.f123407a
            r4 = 0
            efm.r r6 = r6.a(r2, r4)
            ijj.p r2 = new ijj.p
            r4 = 19
            r2.<init>(r4)
            efm.r r6 = nim.a.w(r6, r2)
            r2 = 3
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r4, r2)
            r0.f172351w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f61.a.x(gim.c):java.lang.Object");
    }

    public a(fa9.c function) {
        this.f132371a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public a(g0d.m function) {
        this.f132371a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public a(i2i.d0 function) {
        this.f132371a = 20;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public a(i2i.d0 function, byte b4) {
        this.f132371a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public a(j2i.c function) {
        this.f132371a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132372b = function;
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f132371a = i;
        this.f132372b = obj2;
    }

    public a(fkd.r0 tile) {
        this.f132371a = 8;
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f132372b = tile;
    }

    public a(i76.c dialogMapper) {
        this.f132371a = 15;
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f132372b = dialogMapper;
    }

    public a(r10.v redirectMatcher) {
        this.f132371a = 10;
        Intrinsics.checkNotNullParameter(redirectMatcher, "redirectMatcher");
        this.f132372b = redirectMatcher;
    }

    public a(fk3.a configurationInteractor) {
        this.f132371a = 23;
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f132372b = configurationInteractor;
    }

    public a(pn2.d repository) {
        this.f132371a = 26;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f132372b = repository;
    }

    public a(hq9.i inputData) {
        this.f132371a = 18;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f132372b = inputData;
    }

    public a(vz1.g apmPaymentsAuthorisationsRepository) {
        this.f132371a = 5;
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f132372b = apmPaymentsAuthorisationsRepository;
    }

    public a(z0h.d disclaimersDataProvider) {
        this.f132371a = 19;
        Intrinsics.checkNotNullParameter(disclaimersDataProvider, "disclaimersDataProvider");
        this.f132372b = disclaimersDataProvider;
    }

    public a(phm.a chatUpdateProvider) {
        this.f132371a = 28;
        Intrinsics.checkNotNullParameter(chatUpdateProvider, "chatUpdateProvider");
        this.f132372b = chatUpdateProvider;
    }

    public a(vrf.h sectionFactory, h8i.f transferSectionInputFactory) {
        this.f132371a = 11;
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(transferSectionInputFactory, "transferSectionInputFactory");
        this.f132372b = sectionFactory;
    }

    public a(x deeplinkHandler) {
        this.f132371a = 2;
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f132372b = deeplinkHandler;
    }

    public a(ig6.b netBankingInteractor) {
        this.f132371a = 16;
        Intrinsics.checkNotNullParameter(netBankingInteractor, "netBankingInteractor");
        this.f132372b = netBankingInteractor;
    }

    public a(p ratesPlotRepository) {
        this.f132371a = 0;
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        this.f132372b = ratesPlotRepository;
    }

    public a(tr.b mediaMetadataMapper) {
        this.f132371a = 13;
        Intrinsics.checkNotNullParameter(mediaMetadataMapper, "mediaMetadataMapper");
        this.f132372b = mediaMetadataMapper;
    }

    public a(ioc.b commonPerformanceChartMapper) {
        this.f132371a = 17;
        Intrinsics.checkNotNullParameter(commonPerformanceChartMapper, "commonPerformanceChartMapper");
        this.f132372b = commonPerformanceChartMapper;
    }

    public a(z2j.c beneficiaryAccountFieldTypeHelper) {
        this.f132371a = 22;
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldTypeHelper, "beneficiaryAccountFieldTypeHelper");
        this.f132372b = beneficiaryAccountFieldTypeHelper;
    }

    public a(fka.a coreArticleUiMapper) {
        this.f132371a = 29;
        Intrinsics.checkNotNullParameter(coreArticleUiMapper, "coreArticleUiMapper");
        this.f132372b = coreArticleUiMapper;
    }

    public a() {
        this.f132371a = 6;
        this.f132372b = new AtomicLong();
    }
}
