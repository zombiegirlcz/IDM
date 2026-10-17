package com.revolut.feature.retail.cfd.impl.screens.order.v2;

import ael.k;
import au6.a3;
import b0a.j;
import b4b.b0;
import b4b.p;
import b4b.q;
import b4b.t;
import b4b.z;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdInputValue;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Flow;
import l4b.m;
import l80.e;
import oki.h;
import prk.o;
import qv0.i;
import s2b.b;
import vdf.d;
import vkm.j2;
import vkm.q0;
import vrl.s;
import y3b.c;
import y3b.f;
import yji.l;
import z3b.g;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements q {
    public final e A;
    public final j60.a B;
    public final g C;
    public final b D;
    public final n60.a E;
    public final m F;
    public final l4b.a G;
    public final f H;
    public final c I;
    public final y J;
    public final com.revolut.kompot.navigable.vc.modal.a K;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t2b.c f82249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f82250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t2b.f f82251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.d f82252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y1b.a f82253t;
    public final s u;
    public final a4b.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ybl.b f82254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o7.b f82255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g5b.a f82256y;
    public final a4b.f z;

    public a(n stateMapper, b4b.s saveStateDelegate, p inputData, t2b.c cfdFlowDataMediator, d assetFormatter, t2b.f fetchMarginQuotes, ybl.d portfolioInteractor, y1b.a cfdInteractor, s orderLimitsByPortfolio, a4b.a availableOrdersProcessor, ybl.b instrumentTickerInteractor, o7.b openPositionsDelegate, g5b.a exitStrategiesExtension, a4b.f exitStrategiesProvider, e dateProvider, j60.a bottomExpandableDialogControllerExtension, g orderSelectionMapper, b tutorialSettingsProvider, n60.a keyboardControllerExtension, m feeBreakdownDialogMapper, l4b.a feeBreakdownDescriptionDialogMapper, f expiryDateChooserMapper, c calendarDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdFlowDataMediator, "cfdFlowDataMediator");
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(fetchMarginQuotes, "fetchMarginQuotes");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolio, "orderLimitsByPortfolio");
        Intrinsics.checkNotNullParameter(availableOrdersProcessor, "availableOrdersProcessor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(openPositionsDelegate, "openPositionsDelegate");
        Intrinsics.checkNotNullParameter(exitStrategiesExtension, "exitStrategiesExtension");
        Intrinsics.checkNotNullParameter(exitStrategiesProvider, "exitStrategiesProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(orderSelectionMapper, "orderSelectionMapper");
        Intrinsics.checkNotNullParameter(tutorialSettingsProvider, "tutorialSettingsProvider");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(feeBreakdownDialogMapper, "feeBreakdownDialogMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownDescriptionDialogMapper, "feeBreakdownDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(expiryDateChooserMapper, "expiryDateChooserMapper");
        Intrinsics.checkNotNullParameter(calendarDialogMapper, "calendarDialogMapper");
        this.o = inputData;
        this.f82249p = cfdFlowDataMediator;
        this.f82250q = assetFormatter;
        this.f82251r = fetchMarginQuotes;
        this.f82252s = portfolioInteractor;
        this.f82253t = cfdInteractor;
        this.u = orderLimitsByPortfolio;
        this.v = availableOrdersProcessor;
        this.f82254w = instrumentTickerInteractor;
        this.f82255x = openPositionsDelegate;
        this.f82256y = exitStrategiesExtension;
        this.z = exitStrategiesProvider;
        this.A = dateProvider;
        this.B = bottomExpandableDialogControllerExtension;
        this.C = orderSelectionMapper;
        this.D = tutorialSettingsProvider;
        this.E = keyboardControllerExtension;
        this.F = feeBreakdownDialogMapper;
        this.G = feeBreakdownDescriptionDialogMapper;
        this.H = expiryDateChooserMapper;
        this.I = calendarDialogMapper;
        Object value = cfdFlowDataMediator.f267528a.getValue();
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CfdOrderData cfdOrderData = (CfdOrderData) value;
        Object value2 = cfdFlowDataMediator.f267528a.getValue();
        if (value2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.J = mra.d.b(this, new b4b.n(cfdOrderData, new CfdInputValue(((CfdOrderData) value2).f82171c, null, 6), inputData.f, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), h0.f322473a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), new t(false, false, false, false)), stateMapper, saveStateDelegate, false, 8);
        this.K = hx7.e.a(this, new av8.n(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.feature.retail.cfd.impl.screens.order.v2.a, oki.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [oki.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.cfd.impl.screens.order.v2.a r5, java.math.BigDecimal r6, boolean r7, gim.c r8) {
        /*
            cli.y r0 = r5.J
            boolean r1 = r8 instanceof b4b.e0
            if (r1 == 0) goto L15
            r1 = r8
            b4b.e0 r1 = (b4b.e0) r1
            int r2 = r1.f12219w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f12219w = r2
            goto L1a
        L15:
            b4b.e0 r1 = new b4b.e0
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f12219w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r6 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            b4b.w r8 = new b4b.w     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r8.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> L29
            r5.H2(r0, r8)     // Catch: java.lang.Throwable -> L29
            r1.f12219w = r4     // Catch: java.lang.Throwable -> L29
            r6 = 100
            java.lang.Object r6 = skm.k0.b(r6, r1)     // Catch: java.lang.Throwable -> L29
            if (r6 != r2) goto L4a
            return r2
        L4a:
            b0a.j r6 = new b0a.j
            r7 = 15
            r6.<init>(r7)
            r5.H2(r0, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L57:
            b0a.j r7 = new b0a.j
            r8 = 15
            r7.<init>(r8)
            r5.H2(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.cfd.impl.screens.order.v2.a.I2(com.revolut.feature.retail.cfd.impl.screens.order.v2.a, java.math.BigDecimal, boolean, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        g5b.e eVar;
        TradingOrderExitStrategies exitStrategies;
        t2b.c cVar = this.f82249p;
        cVar.getClass();
        l.a1(this, new qij.s(cVar, 16), null, null, new b0(this, null, 3), 3);
        y yVar = this.J;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (((b4b.n) j2Var.getValue()).f12227a.f82170b != e2b.a.MARKET && ((b4b.n) j2Var2.getValue()).f12227a.f == null) {
            cVar.a(new z(new ExpiryDate(l3b.a.NINETY_DAYS, ((l80.f) this.A).k().plusDays(90L)), 0));
        }
        if (!this.f226127l || (eVar = (g5b.e) ((b4b.n) j2Var2.getValue()).f12233l.getContent()) == null || (exitStrategies = eVar.d) == null) {
            return;
        }
        a4b.f fVar = this.z;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        j2 j2Var3 = fVar.f1239a;
        j2Var3.getClass();
        j2Var3.g(null, exitStrategies);
    }

    public final void J2(LocalDate date) {
        y3b.d dVar = (y3b.d) this.I;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(date, "date");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_date_dialog_title, null, null, 14), null, null, 30);
        l80.f fVar = (l80.f) dVar.f310688a;
        LocalDate localDate = fVar.k().toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        List listC = u.c(new g5("CALENDAR_DATE_PICKER_ID", localDate, date, false, null, fVar.k().toLocalDate(), fVar.k().toLocalDate().plusDays(90L), null, u.c(DatePickerDelegate.a.C0402a.f52177a), null, 0, 0, 1047352));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CALENDAR_SET_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_set, null, null, 14), false, null, null, date, null, 744);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        this.B.x(new rp0.y(d0.F0(model, listC), tVar, rp0.l.WINDOW, 0, null, null, 1000));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.K;
    }

    public final void K2(ExpiryDate expiryDate) {
        rp0.y yVar;
        List listA;
        List listA2;
        y3b.h hVar = (y3b.h) this.H;
        hVar.getClass();
        int i = 3;
        if (expiryDate != null) {
            l3b.a aVar = expiryDate.f82206a;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_date_dialog_title, null, null, 14), null, null, 30);
            s0 s0Var = new s0(3);
            Set<l3b.a> set = hVar.d;
            ArrayList arrayList = new ArrayList(w.t(set, 10));
            for (l3b.a aVar2 : set) {
                boolean z = aVar2 == aVar;
                e eVar = hVar.f310693c;
                y3b.a aVar3 = hVar.f310692b;
                int i2 = y3b.g.f310690a[aVar2.ordinal()];
                if (i2 == 1) {
                    int i3 = R$drawable.uikit_icn_24_calendar;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_days, null, null, 14);
                    ZonedDateTime zonedDateTimePlusDays = ((l80.f) eVar).k().plusDays(90L);
                    listA2 = ((y3b.b) aVar3).a("CALENDAR_N_DAYS_ID", i3, textLocalisedClause, new TimeClause(zonedDateTimePlusDays.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, zonedDateTimePlusDays.getZone(), 4), z, aVar2);
                } else if (i2 == 2) {
                    int i5 = R$drawable.uikit_icn_24_calendar_check;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_today, null, null, 14);
                    ZonedDateTime zonedDateTimeK = ((l80.f) eVar).k();
                    listA2 = ((y3b.b) aVar3).a("CALENDAR_TODAY_ID", i5, textLocalisedClause2, new TimeClause(zonedDateTimeK.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, zonedDateTimeK.getZone(), 4), z, aVar2);
                } else if (i2 == i) {
                    int i6 = R$drawable.uikit_icn_24_calendar;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_months, null, null, 14);
                    ZonedDateTime zonedDateTimePlusMonths = ((l80.f) eVar).k().plusMonths(3L);
                    listA2 = ((y3b.b) aVar3).a("CALENDAR_N_MONTHS_ID", i6, textLocalisedClause3, new TimeClause(zonedDateTimePlusMonths.toInstant().toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, zonedDateTimePlusMonths.getZone(), 4), z, aVar2);
                } else if (i2 == 4) {
                    listA2 = ((y3b.b) aVar3).a("CALENDAR_CUSTOM_ID", R$drawable.uikit_icn_24_calendar_date, new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_custom, u.c("3"), null, 12), new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_custom_description, null, null, 14), z, aVar2);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listA2 = ((y3b.b) aVar3).a("CALENDAR_NEVER_ID", R$drawable.uikit_icn_24_unlimited, new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_never, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfd_expiry_dialog_never_description, null, null, 14), z, aVar2);
                }
                arrayList.add(listA2);
                i = 3;
            }
            ArrayList arrayListU = w.u(arrayList);
            yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
            s0Var.b(arrayListU.toArray(new i[0]));
            if (aVar == l3b.a.CUSTOM) {
                z3b.a aVar4 = hVar.f310691a;
                y3b.e eVar2 = new y3b.e(expiryDate);
                z3b.c cVar = (z3b.c) aVar4;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
                listA = cVar.a(expiryDate, eVar2);
            } else {
                listA = f0.f322471a;
            }
            List list = listA;
            yp0.b.k(list, 0, 0, 0, 0, 31);
            s0Var.b(list.toArray(new i[0]));
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CALENDAR_SCHEDULE_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_schedule, null, null, 14), false, null, null, expiryDate, null, 744);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            s0Var.a(model);
            ArrayList arrayList2 = s0Var.f186433a;
            yVar = new rp0.y(v.m(arrayList2.toArray(new i[arrayList2.size()])), tVar, rp0.l.WINDOW, null, null, null, 1016);
        } else {
            yVar = null;
        }
        j60.a aVar5 = this.B;
        if (yVar != null) {
            aVar5.x(yVar);
        } else {
            j60.a.v(aVar5, false, null, 3);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        p pVar = this.o;
        String str = pVar.f12238c;
        nel.n nVar = pVar.f12237b;
        Continuation continuation = null;
        l.b1(this, vkm.q.q(this.f82255x.f(str, nVar.f214596b)), null, new b0(this, continuation, 7), 3);
        t2b.c cVar = this.f82249p;
        cVar.getClass();
        int i = 16;
        l.b1(this, o.w("CfdOrderFormControllerModel", "collectMarginQuote", vkm.q.Q(vkm.q.s(new qij.s(cVar, i), new j(i), vkm.q.f290100b), new a3(continuation, this, 9))), null, new b0(this, continuation, 6), 3);
        final int i2 = 0;
        Flow flowQ = vkm.q.q(nim.a.v(rd0.e.n(new q0(((ael.y) this.f82252s).e(pVar.f12238c, w4l.h.f294642c), new b0(this, continuation, 0), 1), y0.b(new Pair("CfdOrderFormControllerModel", "collectMargin#portfolio"))), new Function1(this) { // from class: b4b.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.order.v2.a f12259b;

            {
                this.f12259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i2) {
                    case 0:
                        wel.e portfolio = (wel.e) obj2;
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        Iterator it8 = portfolio.e.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((kel.g) next).getCurrency(), this.f12259b.o.f12237b.i.f306286a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return new Pair((kel.g) next, Boolean.valueOf(i2b.a.m(portfolio)));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        kel.g gVar = (kel.g) pair.f186385a;
                        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar = this.f12259b;
                        p pVar2 = aVar.o;
                        dj0.d dVar = new dj0.d(0L, pVar2.f12237b.i);
                        return (gVar == null || !zBooleanValue) ? zi0.c.i(dVar) : nim.a.v(new q0(com.revolut.data.database.models.openbanking.d.x("CfdOrderFormControllerModel", "collectMargin#performance", y1b.a.a(aVar.f82253t, pVar2.f12238c, null, 6)), new b0(aVar, null, 1), 1), new as9.a(dVar, gVar, 22));
                }
            }
        }));
        final int i3 = 1;
        l.b1(this, boh.f.e(flowQ, new Function1(this) { // from class: b4b.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.order.v2.a f12259b;

            {
                this.f12259b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i3) {
                    case 0:
                        wel.e portfolio = (wel.e) obj2;
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        Iterator it8 = portfolio.e.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((kel.g) next).getCurrency(), this.f12259b.o.f12237b.i.f306286a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return new Pair((kel.g) next, Boolean.valueOf(i2b.a.m(portfolio)));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        kel.g gVar = (kel.g) pair.f186385a;
                        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar = this.f12259b;
                        p pVar2 = aVar.o;
                        dj0.d dVar = new dj0.d(0L, pVar2.f12237b.i);
                        return (gVar == null || !zBooleanValue) ? zi0.c.i(dVar) : nim.a.v(new q0(com.revolut.data.database.models.openbanking.d.x("CfdOrderFormControllerModel", "collectMargin#performance", y1b.a.a(aVar.f82253t, pVar2.f12238c, null, 6)), new b0(aVar, null, 1), 1), new as9.a(dVar, gVar, 22));
                }
            }
        }), null, new b0(this, continuation, 2), 3);
        String str2 = pVar.f12238c;
        String str3 = nVar.f214596b;
        bfl.g gVar = pVar.f12236a;
        s sVar = this.u;
        w4l.i iVar = w4l.i.f294643c;
        l.b1(this, com.revolut.data.database.models.openbanking.d.y("CfdOrderFormControllerModel", "collectOrderLimits", rd0.e.b(sVar.a(str2, str3, gVar, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : iVar))), null, new b0(this, continuation, 8), 3);
        l.b1(this, nim.a.v(com.revolut.data.database.models.openbanking.d.y("CfdOrderFormControllerModel", "collectInstrumentTicker", rd0.e.b(((k) this.f82254w).n(u.c(nVar.f214596b), iVar))), new j(17)), null, new b0(this, continuation, 5), 3);
        l.b1(this, this.f82256y.Z2(r2b.b.f251091a), null, new b0(this, continuation, 4), 3);
        b bVar = this.D;
        te0.t tVar = (te0.t) bVar.f259286c.getValue();
        te0.s sVar2 = te0.s.f270018a;
        l.b1(this, yh5.b.g(rd0.e.b(tVar.c(sVar2)), rd0.e.b(((te0.t) bVar.f259285b.getValue()).c(sVar2)), rd0.e.b(((te0.t) bVar.e.getValue()).c(sVar2)), rd0.e.b(((te0.t) bVar.d.getValue()).c(sVar2))), null, new b0(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.J;
    }
}
