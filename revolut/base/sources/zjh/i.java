package zjh;

import android.content.Context;
import au6.m3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import et6.r1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements zk0.c, kfm.o, atk.f, bhj.c, zp0.c, vh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f322838b;

    public i(a2i.j function) {
        this.f322837a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322838b = function;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zjh.i r4, com.revolut.feature.terms.api.model.TermsScope r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof efb.k
            if (r0 == 0) goto L13
            r0 = r6
            efb.k r0 = (efb.k) r0
            int r1 = r0.f125316w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125316w = r1
            goto L18
        L13:
            efb.k r0 = new efb.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125316w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            java.lang.Object r4 = r4.f322838b
            pre.c r4 = (pre.c) r4
            java.util.List r5 = zhm.u.c(r5)
            efm.r r4 = pre.c.d(r4, r5)
            r5 = 3
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r6, r5)
            efm.d0 r4 = r4.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f125316w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.i.a(zjh.i, com.revolut.feature.terms.api.model.TermsScope, gim.c):java.lang.Object");
    }

    public static hs3.h o(ot3.p pVar) {
        if (pVar instanceof ot3.o) {
            return new hs3.h(((ot3.o) pVar).getPostRequestPath());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f322837a) {
            case 4:
                return ((a2i.j) this.f322838b).invoke(obj2);
            default:
                return ((b9i.h) this.f322838b).invoke(obj2);
        }
    }

    @Override // vh.d
    public yh.b b(String str, vh.a aVar, int i, int i2, aim.f fVar) {
        if (aVar == vh.a.UPC_A) {
            return ((ci.g) this.f322838b).b("0".concat(String.valueOf(str)), vh.a.EAN_13, i, i2, fVar);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    @Override // bhj.c
    public bhj.a c(bhj.d state, String str, l71.d dVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = bhj.g.f15307a[state.ordinal()];
        if (i == 1) {
            return new bhj.a(6, new TextLocalisedClause(R$string.esim_checkout_success_benefit_not_ready_title, null, null, 14), (TextLocalisedClause) null);
        }
        if (i == 2) {
            return new bhj.a(6, new TextLocalisedClause(R$string.esim_checkout_success_benefit_ready_title, null, null, 14), (TextLocalisedClause) null);
        }
        if (i == 3) {
            return (!((efj.d) ((cej.b) this.f322838b)).a() || str == null) ? new bhj.a(6, new TextLocalisedClause(R$string.esim_checkout_success_benefit_connected_title, null, null, 14), (TextLocalisedClause) null) : new bhj.a(6, new TextLocalisedClause(R$string.esim_checkout_success_benefit_connected_voice_and_data_title, zhm.u.c(str), null, 12), (TextLocalisedClause) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // atk.f
    public TextDelegate d() {
        return (TextDelegate) this.f322838b;
    }

    public StatementPeriodSelection e() {
        j2 j2Var = (j2) this.f322838b;
        Object value = j2Var.getValue();
        if (value == null) {
            throw new IllegalStateException("Statement period is not initialised");
        }
        xxd.b bVar = (xxd.b) value;
        StatementPeriodSelection statementPeriodSelection = bVar.f309510c;
        xxd.b bVarA = xxd.b.a(bVar, statementPeriodSelection, null, 5);
        j2Var.getClass();
        j2Var.g(null, bVarA);
        return statementPeriodSelection;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof dck.a
            if (r0 == 0) goto L13
            r0 = r6
            dck.a r0 = (dck.a) r0
            int r1 = r0.f112999w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112999w = r1
            goto L18
        L13:
            dck.a r0 = new dck.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112999w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f322838b
            y21.c r6 = (y21.c) r6
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            com.revolut.data.network.models.security.SecuritySettings r2 = com.revolut.data.network.models.security.SecuritySettings.BIRTHDAY_SHARING
            efm.r r6 = r6.b(r2, r4)
            vkm.d r6 = rd0.e.b(r6)
            d7j.o0 r2 = new d7j.o0
            r4 = 28
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f112999w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            od0.i r6 = (od0.i) r6
            r0 = 0
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r6.c()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r3) goto L6e
            goto L6f
        L6e:
            r3 = r0
        L6f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.i.f(gim.c):java.lang.Object");
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write((byte[]) this.f322838b);
    }

    public ScheduleTransferScreen h(ScreenConfiguration screenConfiguration, TransferScheduleData scheduleData, boolean z) {
        List listA;
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        zof.f fVar = (zof.f) this.f322838b;
        if (screenConfiguration.f61208g) {
            listA = jli.c.a();
        } else {
            EnumEntries enumEntriesA = jli.c.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : enumEntriesA) {
                if (((jli.c) obj2) != jli.c.PERIOD_SELECTION_NONE) {
                    arrayList.add(obj2);
                }
            }
            listA = arrayList;
        }
        boolean z3 = screenConfiguration.f61206b;
        return ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, scheduleData, z3 ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, listA, !z3, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, screenConfiguration.f, false, screenConfiguration.e && !z, 3017));
    }

    public xxd.b i(StatementPeriodSelection initialSelection, StatementPeriod availablePeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        if (availablePeriod.getStart().compareTo((ChronoLocalDate) availablePeriod.getEnd()) > 0) {
            throw new IllegalArgumentException("Available statement period must have an ordered date range");
        }
        StatementPeriodSelection statementPeriodSelectionC = d0e.c.c(initialSelection, availablePeriod);
        xxd.b bVar = new xxd.b(availablePeriod, statementPeriodSelectionC, statementPeriodSelectionC);
        j2 j2Var = (j2) this.f322838b;
        j2Var.getClass();
        j2Var.g(null, bVar);
        return bVar;
    }

    public akg.n j(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        m3 m3Var = (m3) this.f322838b;
        m3Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(m3Var.d.b(Unit.f186387a, loadingStrategy), new r1(15));
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String amountString, boolean z) {
        switch (this.f322837a) {
            case 14:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amountString, "formattedValue");
                bu4.m mVar = (bu4.m) ((CreditCardBoletoPaymentAmountScreen) this.f322838b).N.getValue();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                mVar.H2(mVar.f18685r, new bd2.b(amountString, 13));
                break;
            case 24:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amountString, "formattedValue");
                ((TPSLAmountController) this.f322838b).P.onNext(amountString);
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amountString, "formattedValue");
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) ((AmountInputController) this.f322838b).k3();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amount");
                cli.y yVar = aVar.z;
                e85.f fVar = (e85.f) ((e85.g) ((j2) yVar.f22677a).getValue()).f123582b.getContent();
                if (fVar != null) {
                    xi0.b bVar = fVar.f123579a.f70144a.f70123x;
                    aVar.H2(yVar, new ar3.a(6, new dj0.d(aVar.f70552p.b(amountString, bVar.f306286a), bVar)));
                    break;
                }
                break;
        }
    }

    public vkm.d l(String id10, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        y9d.e eVar = (y9d.e) this.f322838b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.i.b(id10, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set m() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f322838b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r0.getSystemService(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r1 = r1.getNetworkCountryIso()
            r2 = 0
            if (r1 == 0) goto L22
            boolean r3 = kotlin.text.d0.W(r1)
            if (r3 != 0) goto L1f
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 != 0) goto L46
        L22:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 == 0) goto L45
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getCountry()
            r1 = r0
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 == 0) goto L51
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r2 = wi0.a.a(r1)
        L51:
            r3 = r2
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r4 = wi0.b.p0
            wi0.b r5 = wi0.b.f297760n0
            wi0.b r6 = wi0.b.f297770q3
            wi0.b r7 = wi0.b.N
            wi0.b r8 = wi0.b.O0
            wi0.b[] r0 = new wi0.b[]{r3, r4, r5, r6, r7, r8}
            java.util.Set r0 = zhm.z0.i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.i.m():java.util.Set");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof et6.t3
            if (r0 == 0) goto L13
            r0 = r8
            et6.t3 r0 = (et6.t3) r0
            int r1 = r0.f129336x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129336x = r1
            goto L18
        L13:
            et6.t3 r0 = new et6.t3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129336x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            od0.h r0 = r0.u
            yhm.o.b(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            od0.h r8 = od0.i.Companion
            r0.u = r8
            r0.f129336x = r4
            java.lang.Object r2 = r7.f322838b
            au6.m3 r2 = (au6.m3) r2
            r2.getClass()
            ald.l r4 = new ald.l
            r5 = 23
            r4.<init>(r2, r3, r5)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r2, r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r6 = r0
            r0 = r8
            r8 = r6
        L57:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r8.next()
            r2 = r1
            es6.d r2 = (es6.d) r2
            es6.c r2 = r2.f128868c
            es6.c r4 = es6.c.ACTIVE
            if (r2 != r4) goto L5d
            r3 = r1
        L71:
            r0.getClass()
            od0.i r8 = od0.h.a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.i.n(gim.c):java.lang.Object");
    }

    public void p(StatementPeriodSelection selection) {
        Object value;
        xxd.b bVar;
        Intrinsics.checkNotNullParameter(selection, "selection");
        j2 j2Var = (j2) this.f322838b;
        do {
            value = j2Var.getValue();
            bVar = (xxd.b) value;
            if (bVar == null) {
                throw new IllegalStateException("Statement period is not initialised");
            }
        } while (!j2Var.h(value, xxd.b.a(bVar, null, d0e.c.c(selection, bVar.f309508a), 3)));
    }

    public void q(float f, float f4) {
        this.f322838b = new b9.b0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f4);
    }

    public i(b9i.h function) {
        this.f322837a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322838b = function;
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f322837a = i;
        this.f322838b = obj2;
    }

    public i(tx8.b0 sdkVendorAnalyticsTracker) {
        this.f322837a = 17;
        Intrinsics.checkNotNullParameter(sdkVendorAnalyticsTracker, "sdkVendorAnalyticsTracker");
        this.f322838b = sdkVendorAnalyticsTracker;
    }

    public i(ael.z performanceCalculator) {
        this.f322837a = 12;
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f322838b = performanceCalculator;
    }

    public i(Context context) {
        this.f322837a = 28;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f322838b = context;
    }

    public i(tif.b loadingStateWrapper) {
        this.f322837a = 21;
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        this.f322838b = loadingStateWrapper;
    }

    public i(cej.b mobilePlansFeatureAvailabilityInteractor) {
        this.f322837a = 11;
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f322838b = mobilePlansFeatureAvailabilityInteractor;
    }

    public i(f01.c uiKitResources) {
        this.f322837a = 3;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f322838b = uiKitResources;
    }

    public i(ybl.b instrumentTickerInteractor) {
        this.f322837a = 9;
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f322838b = instrumentTickerInteractor;
    }

    public i(b16.f androidMinimumVersionRestrictionCheck) {
        this.f322837a = 8;
        Intrinsics.checkNotNullParameter(androidMinimumVersionRestrictionCheck, "androidMinimumVersionRestrictionCheck");
        this.f322838b = androidMinimumVersionRestrictionCheck;
    }

    public i(j6l.b revolutCardRepository) {
        this.f322837a = 1;
        Intrinsics.checkNotNullParameter(revolutCardRepository, "revolutCardRepository");
        this.f322838b = revolutCardRepository;
    }

    public i(zof.f transferFeatureScreensProvider) {
        this.f322837a = 27;
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        this.f322838b = transferFeatureScreensProvider;
    }

    public i(pre.c termsInteractor) {
        this.f322837a = 26;
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f322838b = termsInteractor;
    }

    public i(txf.j travelDocumentRepository) {
        this.f322837a = 7;
        Intrinsics.checkNotNullParameter(travelDocumentRepository, "travelDocumentRepository");
        this.f322838b = travelDocumentRepository;
    }

    public i(cr3.b bannerMetadataIconDtoMapper, dr3.g creditPromptContentDtoMapper) {
        this.f322837a = 16;
        Intrinsics.checkNotNullParameter(bannerMetadataIconDtoMapper, "bannerMetadataIconDtoMapper");
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        this.f322838b = creditPromptContentDtoMapper;
    }

    public i(d0e.c periodNormaliser) {
        this.f322837a = 18;
        Intrinsics.checkNotNullParameter(periodNormaliser, "periodNormaliser");
        this.f322838b = vkm.q.c(null);
    }

    public i(y9d.e repository) {
        this.f322837a = 19;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322838b = repository;
    }

    public i(y21.c optOutRepository) {
        this.f322837a = 20;
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f322838b = optOutRepository;
    }

    public i(m3 repository) {
        this.f322837a = 29;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322838b = repository;
    }

    public i(wsg.n walletInteractor) {
        this.f322837a = 23;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f322838b = walletInteractor;
    }

    public i(int i) {
        this.f322837a = i;
        switch (i) {
            case 15:
                this.f322838b = new ci.g(0);
                break;
            default:
                this.f322838b = null;
                break;
        }
    }

    public i(CashBalanceController cashBalanceController) {
        this.f322837a = 0;
        this.f322838b = cashBalanceController.M;
    }

    public i(CfdDetailsController cfdDetailsController) {
        this.f322837a = 6;
        this.f322838b = cfdDetailsController.c0;
    }
}
