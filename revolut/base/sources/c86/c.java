package c86;

import androidx.sqlite.SQLiteConnection;
import aw0.o9;
import ccf.q;
import cgd.k;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao_Impl;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyReferenceItem;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import cw6.h;
import d27.u;
import h93.f0;
import h93.n;
import h93.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import od0.i;
import org.jmrtd.lds.LDSFile;
import zhm.a1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22122b;

    public /* synthetic */ c(String str, int i) {
        this.f22121a = i;
        this.f22122b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean boolValueOf;
        boolean z;
        int i = this.f22121a;
        Object obj3 = null;
        String fieldValue = this.f22122b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "DeviceLockProtectionActivityDelegate", a0.d.s("[", fieldValue, "] Failed with error: ", ((Throwable) obj2).getMessage()), null, null, 16);
                return Unit.f186387a;
            case 1:
                List cashHoldings = (List) obj2;
                Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
                Iterator it8 = cashHoldings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((kel.b) next).f183150c, fieldValue)) {
                            obj3 = next;
                        }
                    }
                }
                return (kel.b) obj3;
            case 2:
                i optionalTradingAccount = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
                if (optionalTradingAccount.f224257a != null) {
                    return (TradingAccount) optionalTradingAccount.c();
                }
                throw new IllegalStateException(p.a.p("Trading account for portfolio with id: ", fieldValue, " is missing"));
            case 3:
                q updateState = (q) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return q.a(updateState, null, null, null, null, this.f22122b, null, LDSFile.EF_DG15_TAG);
            case 4:
                k updateState2 = (k) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                if (fieldValue == null) {
                    fieldValue = "";
                }
                return k.a(updateState2, null, null, fieldValue, false, 11);
            case 5:
                chg.e update = (chg.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return chg.e.a(update, null, fieldValue, 1);
            case 6:
                ci1.e update2 = (ci1.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
                return new ci1.e(fieldValue);
            case 7:
                cig.e update3 = (cig.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return cig.e.a(update3, null, null, fieldValue, 3);
            case 8:
                cld.a update4 = (cld.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return cld.a.a(update4, fieldValue, 2);
            case 9:
                cni.g update5 = (cni.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Set set = update5.f25437b;
                return cni.g.a(update5, null, set.contains(fieldValue) ? a1.j(set, fieldValue) : a1.m(set, fieldValue), 1);
            case 10:
                List counterparties = (List) obj2;
                Intrinsics.checkNotNullParameter(counterparties, "counterparties");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : counterparties) {
                    PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj4;
                    String str = paymentCounterpartyInfo.d;
                    if (!pd.b.j(str != null ? Boolean.valueOf(d0.J(str, fieldValue, true)) : null)) {
                        String str2 = paymentCounterpartyInfo.e;
                        if (!pd.b.j(str2 != null ? Boolean.valueOf(d0.J(str2, fieldValue, true)) : null)) {
                            List list = paymentCounterpartyInfo.f79063g;
                            if (list != null) {
                                List list2 = list;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    z = false;
                                    boolValueOf = Boolean.valueOf(z);
                                } else {
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        if (d0.J(((PaymentCounterpartyReferenceItem) it9.next()).f79067c, fieldValue, true)) {
                                            z = true;
                                            boolValueOf = Boolean.valueOf(z);
                                        }
                                    }
                                    z = false;
                                    boolValueOf = Boolean.valueOf(z);
                                }
                            } else {
                                boolValueOf = null;
                            }
                            if (pd.b.j(boolValueOf)) {
                            }
                        }
                    }
                    arrayList.add(obj4);
                }
                return arrayList;
            case 11:
                return RecurringPaymentDao_Impl.lambda$deleteById$3(fieldValue, (SQLiteConnection) obj2);
            case 12:
                return TransactionCustomCategoryDao_Impl.lambda$getById$6(fieldValue, (SQLiteConnection) obj2);
            case 13:
                return TransactionCustomCategoryDao_Impl.lambda$getAll$5(fieldValue, (SQLiteConnection) obj2);
            case 14:
                return TransactionCustomCategoryDao_Impl.lambda$delete$8(fieldValue, (SQLiteConnection) obj2);
            case 15:
                return TransactionCustomCategoryDao_Impl.lambda$getIfExistById$7(fieldValue, (SQLiteConnection) obj2);
            case 16:
                return TransactionCustomCategoryDao_Impl.lambda$observeAll$4(fieldValue, (SQLiteConnection) obj2);
            case 17:
                cpb.e update6 = (cpb.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                Data savingsAccount = update6.f107915b;
                Intrinsics.checkNotNullParameter(fieldValue, "name");
                Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                return new cpb.e(savingsAccount, fieldValue);
            case 18:
                h update7 = (h) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                FreelancerInvoiceNumberData freelancerInvoiceNumberData = update7.f109547b;
                if (freelancerInvoiceNumberData == null) {
                    h.Companion.getClass();
                    freelancerInvoiceNumberData = h.f109545c;
                }
                return h.a(update7, FreelancerInvoiceNumberData.a(freelancerInvoiceNumberData, null, fieldValue, false, 5));
            case 19:
                h update8 = (h) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                FreelancerInvoiceNumberData freelancerInvoiceNumberData2 = update8.f109547b;
                if (freelancerInvoiceNumberData2 == null) {
                    h.Companion.getClass();
                    freelancerInvoiceNumberData2 = h.f109545c;
                }
                return h.a(update8, FreelancerInvoiceNumberData.a(freelancerInvoiceNumberData2, fieldValue, null, false, 6));
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<o> list3 = (List) pair.f186385a;
                e7l.f fVar = (e7l.f) pair.f186386b;
                for (o oVar : list3) {
                    if (Intrinsics.f(oVar.f150157a, fieldValue)) {
                        n nVar = oVar.f150158b;
                        dj0.d dVar = fVar.f123392s0;
                        if (dVar == null) {
                            dj0.d.Companion.getClass();
                            dVar = dj0.d.e;
                        }
                        return new cx2.a(nVar, dVar);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : cards) {
                    if (Intrinsics.f(((f0) obj5).f150110a, fieldValue)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 22:
                u update9 = (u) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                d27.n nVar2 = update9.f110773b;
                xi0.b.Companion.getClass();
                return u.a(update9, null, d27.n.a(nVar2, zi0.c.P(xi0.a.a(fieldValue), false, null, 3), 0L, 2), null, null, null, false, null, null, null, null, null, 2045);
            case 23:
                d3g.k updateState3 = (d3g.k) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return d3g.k.a(updateState3, null, null, null, TravelExperiencesBookingContactDetails.a(updateState3.f111123g, this.f22122b, null, null, null, 14), null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 24:
                d3g.k updateState4 = (d3g.k) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return d3g.k.a(updateState4, null, null, null, TravelExperiencesBookingContactDetails.a(updateState4.f111123g, null, this.f22122b, null, null, 13), null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 25:
                d3g.k updateState5 = (d3g.k) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return d3g.k.a(updateState5, null, null, null, TravelExperiencesBookingContactDetails.a(updateState5.f111123g, null, null, this.f22122b, null, 11), null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 26:
                d3g.k updateState6 = (d3g.k) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return d3g.k.a(updateState6, null, null, null, TravelExperiencesBookingContactDetails.a(updateState6.f111123g, null, null, null, this.f22122b, 7), null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 27:
                h3g.a it10 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(fieldValue, it10.f149114a.b()));
            case 28:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                return h3g.a.a(updateAnswer, TravelExperiencesBookingQuestionAnswer.a(updateAnswer.f149114a, fieldValue, null, 29), null, false, null, 14);
            default:
                h3g.a updateAnswer2 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer2, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = updateAnswer2.f149114a;
                String str3 = this.f22122b;
                return h3g.a.a(updateAnswer2, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, str3, null, 29), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
        }
    }
}
