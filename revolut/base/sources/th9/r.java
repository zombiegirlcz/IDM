package th9;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.bills.core.api.model.BillField;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentReviewContract$InputData f271345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.d f271346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yof.k f271347c;
    public final q12.g d;

    public r(PaymentReviewContract$InputData inputData, yof.d transferAmountMapper, yof.k transferReviewMapper, q12.g quoteMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f271345a = inputData;
        this.f271346b = transferAmountMapper;
        this.f271347c = transferReviewMapper;
        this.d = quoteMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        RowDelegate.Model model;
        long j2;
        Clause clauseJ;
        ApmQuote apmQuote;
        ApmQuoteCharges apmQuoteCharges;
        Clause clause;
        ApmQuote apmQuote2;
        ApmQuote apmQuote3;
        ApmQuoteCharges apmQuoteCharges2;
        CounterTextDelegate.Model model2;
        List listA;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = domainState.f271329c;
        PaymentData paymentData = domainState.f271327a;
        if (bVar == null) {
            listA = ((ppf.d) this.f271347c).e();
        } else {
            ServiceProvider serviceProvider = domainState.d;
            if (serviceProvider == null) {
                model = null;
            } else {
                String str = serviceProvider.f61449c;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, serviceProvider.f61448b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62);
                TextClause textClause = new TextClause(serviceProvider.f61448b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = serviceProvider.d.f61446a;
                String str3 = str2.length() > 0 ? str2 : null;
                model = new RowDelegate.Model("ID_SERVICE_PROVIDER", image40, textClause, null, 0, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            }
            ArrayList<BillField> arrayList = domainState.f271328b.f78792c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (BillField billField : arrayList) {
                String str4 = billField.f61253a;
                arrayList2.add(new CellDetailsDelegate.Model(j6.a.q("ID_FIELD_", str4), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(billField.f61254b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            PaymentReviewContract$InputData paymentReviewContract$InputData = this.f271345a;
            xo1.g gVar = paymentReviewContract$InputData.f78796a;
            int[] iArr = q.f271344a;
            List listA2 = iArr[gVar.ordinal()] == 1 ? f0.f322471a : this.d.a(bVar.f271330a, paymentData.getF72729b(), paymentData.d());
            aim.e eVarB = zhm.u.b();
            int i = iArr[paymentReviewContract$InputData.f78796a.ordinal()];
            if (i == 1 || i == 2) {
                dj0.d f72729b = paymentData.getF72729b();
                CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                MoneyClause moneyClauseB = sx4.f.b(3, null, null, f72729b);
                b bVar2 = domainState.f271329c;
                long j3 = paymentData.f78794b;
                yof.d dVar = this.f271346b;
                if (j3 == 0) {
                    clause = ((ppf.c) dVar).d().f19188a;
                    j2 = 0;
                } else {
                    boolean zD = paymentData.d();
                    boolean z = ((bVar2 == null || (apmQuote3 = bVar2.f271330a) == null || (apmQuoteCharges2 = apmQuote3.d) == null) ? null : apmQuoteCharges2.f62222a) != null;
                    if (zD) {
                        if (bVar2 == null || (apmQuote2 = bVar2.f271330a) == null) {
                            j2 = 0;
                        } else {
                            dj0.d dVar2 = apmQuote2.f62211c;
                            j2 = 0;
                            if (dVar2.f115082a != 0) {
                                ApmQuoteCharges apmQuoteCharges3 = apmQuote2.d;
                                dj0.d dVar3 = apmQuoteCharges3 != null ? apmQuoteCharges3.f62222a : null;
                                clauseJ = ((ppf.c) dVar).b(pyd.c.O(dVar2, dVar3), (dVar3 != null ? dVar3.f115082a : 0L) > 0);
                            }
                        }
                        clauseJ = null;
                    } else {
                        j2 = 0;
                        clauseJ = z ? ((ppf.c) dVar).j((bVar2 == null || (apmQuote = bVar2.f271330a) == null || (apmQuoteCharges = apmQuote.d) == null) ? null : apmQuoteCharges.f62222a, paymentData.f78793a.f92241b) : ((ppf.c) dVar).d().f19188a;
                    }
                    clause = clauseJ;
                }
                CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(companion, "ID_TRANSFER_HEADER", null, moneyClauseB, clause, null, null, 0, 0, 4082);
                yp0.b.r(modelA, 0, 0, 0, 0, 15);
                model2 = modelA;
            } else {
                model2 = null;
                j2 = 0;
            }
            n14.e.b(eVarB, model2);
            n14.e.b(eVarB, model);
            TransferScheduleData transferScheduleData = domainState.e;
            aim.e eVarB2 = zhm.u.b();
            long j5 = transferScheduleData.f104285a;
            jli.c cVar = transferScheduleData.f104286b;
            if (j5 != j2) {
                eVarB2.add(new CellDetailsDelegate.Model("LIST_ID_ESTIMATED_DELIVERY_TIME", new t0((Clause) new TextLocalisedClause(R$string.transfer_review_payment_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(ebm.a.P(oc.c.I(transferScheduleData.f104285a)), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            if (cVar != jli.c.PERIOD_SELECTION_NONE) {
                eVarB2.add(new CellDetailsDelegate.Model("LIST_ID_ESTIMATED_FREQUENCY", new t0((Clause) new TextLocalisedClause(R$string.transfer_review_frequency, null, null, 14), (Image) null, 0, false, 30), epf.b.e(cVar), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            aim.e eVarA = zhm.u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA);
            eVarB.addAll(arrayList2);
            eVarB.addAll(listA2);
            listA = zhm.u.a(eVarB);
        }
        return new h(listA);
    }
}
