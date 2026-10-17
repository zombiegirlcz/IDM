package fo1;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPocketData;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import fjd.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 extends oki.h implements l {

    @NotNull
    public static final z Companion = new z();
    public final k0 A;
    public final cli.y B;
    public final AmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2j.a f136742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final opf.b f136743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f136744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xn1.b f136745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w80.b f136746t;
    public final oo1.b u;
    public final q12.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zjh.i f136747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ko1.b f136748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vo9.a f136749y;
    public final do1.a z;

    public e0(cli.n stateMapper, AmountScreenContract$InputData inputData, l2j.a currencyChooserFlowFactory, opf.b paymentsPocketInteractor, wsg.n walletInteractor, xn1.b bPayBillRepository, w80.b amountFormatter, oo1.b referenceNumberValidator, q12.a apmErrorProvider, zjh.i scheduleScreenProvider, ko1.b scheduledDataExtension, vo9.a paymentPocketMapper, do1.a bPayInteractor, k0 creditCardFeatureInteractor) {
        dj0.d dVar;
        TransferScheduleData transferScheduleData;
        jli.c cVarK;
        String str;
        Long l2;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bPayBillRepository, "bPayBillRepository");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(referenceNumberValidator, "referenceNumberValidator");
        Intrinsics.checkNotNullParameter(apmErrorProvider, "apmErrorProvider");
        Intrinsics.checkNotNullParameter(scheduleScreenProvider, "scheduleScreenProvider");
        Intrinsics.checkNotNullParameter(scheduledDataExtension, "scheduledDataExtension");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        Intrinsics.checkNotNullParameter(bPayInteractor, "bPayInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.o = inputData;
        this.f136742p = currencyChooserFlowFactory;
        this.f136743q = paymentsPocketInteractor;
        this.f136744r = walletInteractor;
        this.f136745s = bPayBillRepository;
        this.f136746t = amountFormatter;
        this.u = referenceNumberValidator;
        this.v = apmErrorProvider;
        this.f136747w = scheduleScreenProvider;
        this.f136748x = scheduledDataExtension;
        this.f136749y = paymentPocketMapper;
        this.z = bPayInteractor;
        this.A = creditCardFeatureInteractor;
        BPayBillerData bPayBillerData = inputData.f61218a;
        qua.p pVar = inputData.f61220c;
        if (pVar == null || (l2 = pVar.f249323j) == null) {
            xi0.b.Companion.getClass();
            dVar = new dj0.d(0L, xi0.b.f306276m);
        } else {
            long jLongValue = l2.longValue();
            xi0.a aVar = xi0.b.Companion;
            String str2 = pVar.i;
            aVar.getClass();
            dVar = new dj0.d(jLongValue, xi0.a.a(str2));
        }
        if (pVar == null) {
            transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
        } else {
            ibd.e eVar = pVar.f249314a;
            LocalDate localDate = eVar.e;
            long jB = localDate != null ? jli.b.b(localDate) : 0L;
            Period period = eVar.f160151b;
            transferScheduleData = new TransferScheduleData(jB, (period == null || (cVarK = jli.e.k(period)) == null) ? jli.c.PERIOD_SELECTION_NONE : cVarK, 4);
        }
        boolean z = inputData.f61219b && ((str = inputData.f61218a.d) == null || str.length() == 0) && pVar == null;
        ScreenConfiguration screenConfiguration = inputData.d;
        xi0.b.Companion.getClass();
        this.B = mra.d.b(this, new g(new Data(null, null, true, 3, null), bPayBillerData, null, dVar, transferScheduleData, z, screenConfiguration, null, new dj0.d(Long.MAX_VALUE, xi0.b.f306276m)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new b0(this, null, 0), new yi5.b(26));
    }

    public final void I2(t event) {
        io3.d dVar;
        String str;
        xi0.b bVar;
        ApmQuoteRate apmQuoteRate;
        ApmQuoteRate apmQuoteRate2;
        xi0.b bVar2;
        ApmQuoteRate apmQuoteRate3;
        io3.d dVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zEquals = event.equals(o.f136765a);
        Continuation continuation = null;
        cli.y yVar = this.B;
        if (zEquals) {
            BPayPocketData bPayPocketData = (BPayPocketData) ((g) ((j2) yVar.f22677a).getValue()).f136750a.getContent();
            l2(new c0(this, bPayPocketData != null ? bPayPocketData.f61215a : null, null), new yi5.b(26));
            return;
        }
        if (event.equals(q.f136768a)) {
            B2();
            return;
        }
        if (event.equals(n.f136764a)) {
            if (((g) ((j2) yVar.f22677a).getValue()).f136753g.f61206b) {
                J2();
                return;
            } else {
                l2(new dp4.p(this, continuation, 29), new yi5.b(26));
                return;
            }
        }
        if (event.equals(s.f136770a)) {
            J2();
            return;
        }
        if (event.equals(r.f136769a)) {
            xi0.a aVar = xi0.b.Companion;
            BPayPocketData bPayPocketData2 = (BPayPocketData) ((g) ((j2) yVar.f22677a).getValue()).f136750a.getContent();
            if (bPayPocketData2 == null || (dVar2 = bPayPocketData2.f61215a) == null || (str = dVar2.f163147c) == null) {
                aVar.getClass();
                str = xi0.b.f306276m.f306286a;
            }
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(str);
            ApmQuote apmQuote = ((g) ((j2) yVar.f22677a).getValue()).f136754h;
            xi0.b bVar3 = xi0.b.f306276m;
            if (bVarA.equals(bVar3)) {
                return;
            }
            if (apmQuote == null || (apmQuoteRate3 = apmQuote.f62209a) == null || (bVar = apmQuoteRate3.f62229b) == null) {
                bVar = bVar3;
            }
            if (apmQuote != null && (apmQuoteRate2 = apmQuote.f62209a) != null && (bVar2 = apmQuoteRate2.f62230c) != null) {
                bVar3 = bVar2;
            }
            C2(new i(apmQuote, new n9l.a((apmQuote == null || (apmQuoteRate = apmQuote.f62209a) == null) ? 0.0d : apmQuoteRate.f62228a, bVar, bVar3)));
            return;
        }
        if (event instanceof m) {
            H2(yVar, new fg8.y(this, ((m) event).f136763a, 22));
            BPayPocketData bPayPocketData3 = (BPayPocketData) ((g) ((j2) yVar.f22677a).getValue()).f136750a.getContent();
            if (bPayPocketData3 == null || (dVar = bPayPocketData3.f61215a) == null) {
                return;
            }
            l2(new g0(this, dVar, continuation, 9), new yi5.b(26));
            return;
        }
        if (!(event instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = (p) event;
        String str2 = pVar.f136766a;
        String str3 = pVar.f136767b;
        if (Intrinsics.f(str2, "LIST_ID_REFERENCE_NUMBER")) {
            final yqi.d dVarValidate = this.u.validate(str3);
            if (dVarValidate.f316033b.isEmpty()) {
                final int i = 0;
                H2(yVar, new Function1() { // from class: fo1.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                g update = (g) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return g.a(update, null, BPayBillerData.a(update.f136751b, (String) dVarValidate.f316032a, null, 55), null, null, null, null, null, 505);
                            default:
                                g update2 = (g) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                BPayBillerData bPayBillerData = update2.f136751b;
                                yqi.d dVar3 = dVarValidate;
                                return g.a(update2, null, BPayBillerData.a(bPayBillerData, (String) dVar3.f316032a, null, 55), ((yqi.b) zhm.d0.b0(dVar3.f316033b)).a(), null, null, null, null, 505);
                        }
                    }
                });
            } else {
                final int i2 = 1;
                H2(yVar, new Function1() { // from class: fo1.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                g update = (g) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return g.a(update, null, BPayBillerData.a(update.f136751b, (String) dVarValidate.f316032a, null, 55), null, null, null, null, null, 505);
                            default:
                                g update2 = (g) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                BPayBillerData bPayBillerData = update2.f136751b;
                                yqi.d dVar3 = dVarValidate;
                                return g.a(update2, null, BPayBillerData.a(bPayBillerData, (String) dVar3.f316032a, null, 55), ((yqi.b) zhm.d0.b0(dVar3.f316033b)).a(), null, null, null, null, 505);
                        }
                    }
                });
            }
        }
    }

    public final void J2() {
        g gVar = (g) ((j2) this.B.f22677a).getValue();
        yji.l.g2(this, this.f136747w.h(gVar.f136753g, gVar.e, gVar.f136751b.e), null, new x(this, 0), 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
