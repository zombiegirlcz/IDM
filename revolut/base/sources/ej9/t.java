package ej9;

import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentMethod;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOptions;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelIntroContent;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelSummaryContent;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.statements.api.models.StatementUrlState;
import dj9.g0;
import dx4.a1;
import dx4.y0;
import ej9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.f1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126832a;

    public /* synthetic */ t(int i) {
        this.f126832a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        zh9.u uVar;
        zh9.w wVar;
        zh9.v vVar;
        f1 f1Var;
        PayLaterPaymentOption payLaterPaymentOption;
        PayLaterPaymentMethod payLaterPaymentMethod;
        zh9.w wVar2;
        zh9.w wVar3;
        g0.c cVar;
        RightToCancelSummaryContent.Explainer explainer;
        switch (this.f126832a) {
            case 0:
                zh9.x domain = (zh9.x) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                Intrinsics.checkNotNullParameter(domain, "<this>");
                String str = domain.f322361a.f306286a;
                ArrayList<zh9.u> arrayList = domain.f322362b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (zh9.u uVar2 : arrayList) {
                    Intrinsics.checkNotNullParameter(uVar2, "<this>");
                    String strName = uVar2.f322349a.name();
                    zh9.v vVar2 = uVar2.f322350b;
                    dj9.g gVar = null;
                    if (vVar2 != null) {
                        Intrinsics.checkNotNullParameter(vVar2, "<this>");
                        int i = vVar2.f322353a;
                        f1 f1Var2 = vVar2.f322354b;
                        gVar = new dj9.g(f1Var2 != null ? f1Var2.name() : null, i, vVar2.f322355c, vVar2.d);
                    }
                    arrayList2.add(new dj9.f(strName, gVar));
                }
                return new dj9.h(str, arrayList2);
            case 1:
                dj9.h dto = (dj9.h) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(dto, "<this>");
                xi0.a aVar = xi0.b.Companion;
                String currency = dto.getCurrency();
                aVar.getClass();
                xi0.b bVarA = xi0.a.a(currency);
                List<dj9.f> options = dto.getOptions();
                ArrayList arrayList3 = new ArrayList();
                for (dj9.f fVar : options) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    String instalmentType = fVar.getInstalmentType();
                    zh9.w[] wVarArrValues = zh9.w.values();
                    int length = wVarArrValues.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        uVar = null;
                        f1Var = null;
                        f1Var = null;
                        vVar = null;
                        if (i3 < length) {
                            wVar = wVarArrValues[i3];
                            if (!kotlin.text.a0.z(wVar.name(), instalmentType, true)) {
                                i3++;
                            }
                        } else {
                            wVar = null;
                        }
                    }
                    if (wVar != null) {
                        dj9.g termDetails = fVar.getTermDetails();
                        if (termDetails != null) {
                            Intrinsics.checkNotNullParameter(termDetails, "<this>");
                            int maxPurchaseAmount = termDetails.getMaxPurchaseAmount();
                            String schedulerType = termDetails.getSchedulerType();
                            if (schedulerType != null) {
                                f1[] f1VarArrValues = f1.values();
                                int length2 = f1VarArrValues.length;
                                while (true) {
                                    if (i2 < length2) {
                                        f1 f1Var3 = f1VarArrValues[i2];
                                        if (kotlin.text.a0.z(f1Var3.name(), schedulerType, true)) {
                                            f1Var = f1Var3;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            vVar = new zh9.v(maxPurchaseAmount, f1Var, termDetails.getPeriodMultiplier(), termDetails.getHasUpfrontPayment());
                        }
                        uVar = new zh9.u(wVar, vVar);
                    }
                    if (uVar != null) {
                        arrayList3.add(uVar);
                    }
                }
                return new zh9.x(arrayList3, bVarA);
            case 2:
                PayLaterPaymentOptions domain2 = (PayLaterPaymentOptions) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                Intrinsics.checkNotNullParameter(domain2, "<this>");
                ArrayList<PayLaterPaymentOption> arrayList4 = domain2.f78819a;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                for (PayLaterPaymentOption payLaterPaymentOption2 : arrayList4) {
                    Intrinsics.checkNotNullParameter(payLaterPaymentOption2, "<this>");
                    String strName2 = payLaterPaymentOption2.f78816a.name();
                    String strName3 = payLaterPaymentOption2.f78817b.name();
                    List list = payLaterPaymentOption2.f78818c;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(((zh9.w) it8.next()).name());
                    }
                    arrayList5.add(new dj9.i(strName2, strName3, arrayList6));
                }
                return new dj9.j(arrayList5);
            case 3:
                dj9.a dto2 = (dj9.a) obj3;
                Intrinsics.checkNotNullParameter((d.a) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return dto2;
            case 4:
                dj9.j dto3 = (dj9.j) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto3, "dto");
                Intrinsics.checkNotNullParameter(dto3, "<this>");
                List<dj9.i> paymentMethods = dto3.getPaymentMethods();
                ArrayList arrayList7 = new ArrayList();
                for (dj9.i iVar : paymentMethods) {
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    String paymentMethod = iVar.getPaymentMethod();
                    PayLaterPaymentMethod[] payLaterPaymentMethodArrValues = PayLaterPaymentMethod.values();
                    int length3 = payLaterPaymentMethodArrValues.length;
                    int i5 = 0;
                    while (true) {
                        payLaterPaymentOption = null;
                        if (i5 < length3) {
                            payLaterPaymentMethod = payLaterPaymentMethodArrValues[i5];
                            if (!kotlin.text.a0.z(payLaterPaymentMethod.name(), paymentMethod, true)) {
                                i5++;
                            }
                        } else {
                            payLaterPaymentMethod = null;
                        }
                    }
                    if (payLaterPaymentMethod != null) {
                        String preferredInstalmentType = iVar.getPreferredInstalmentType();
                        zh9.w[] wVarArrValues2 = zh9.w.values();
                        int length4 = wVarArrValues2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length4) {
                                wVar2 = wVarArrValues2[i6];
                                if (!kotlin.text.a0.z(wVar2.name(), preferredInstalmentType, true)) {
                                    i6++;
                                }
                            } else {
                                wVar2 = null;
                            }
                        }
                        if (wVar2 != null) {
                            List<String> availableInstalmentTypes = iVar.getAvailableInstalmentTypes();
                            ArrayList arrayList8 = new ArrayList();
                            for (String str2 : availableInstalmentTypes) {
                                zh9.w[] wVarArrValues3 = zh9.w.values();
                                int length5 = wVarArrValues3.length;
                                int i21 = 0;
                                while (true) {
                                    if (i21 < length5) {
                                        wVar3 = wVarArrValues3[i21];
                                        if (!kotlin.text.a0.z(wVar3.name(), str2, true)) {
                                            i21++;
                                        }
                                    } else {
                                        wVar3 = null;
                                    }
                                }
                                if (wVar3 != null) {
                                    arrayList8.add(wVar3);
                                }
                            }
                            payLaterPaymentOption = new PayLaterPaymentOption(payLaterPaymentMethod, wVar2, arrayList8);
                        }
                    }
                    if (payLaterPaymentOption != null) {
                        arrayList7.add(payLaterPaymentOption);
                    }
                }
                return new PayLaterPaymentOptions(arrayList7);
            case 5:
                ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.TRUE;
            case 6:
                RightToCancelIntroContent domain3 = (RightToCancelIntroContent) obj3;
                Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                Intrinsics.checkNotNullParameter(domain3, "<this>");
                return new dj9.f0(domain3.f78852a.b(), domain3.f78853b, domain3.f78854c, domain3.d, domain3.e);
            case 7:
                dj9.f0 dto4 = (dj9.f0) obj3;
                Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto4, "dto");
                Intrinsics.checkNotNullParameter(dto4, "<this>");
                y0 y0Var = a1.Companion;
                String icon = dto4.getIcon();
                y0Var.getClass();
                a1 a1VarA = y0.a(icon);
                if (a1VarA != null) {
                    return new RightToCancelIntroContent(a1VarA, dto4.getTitle(), dto4.getDescription(), dto4.getPrimaryButtonText(), dto4.getSecondaryButtonText());
                }
                throw new IllegalStateException(h30.l.r("Unsupported right-to-cancel icon ", dto4.getIcon()));
            case 8:
                RightToCancelSummaryContent domain4 = (RightToCancelSummaryContent) obj3;
                Intrinsics.checkNotNullParameter((i) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain4, "domain");
                Intrinsics.checkNotNullParameter(domain4, "<this>");
                String str3 = domain4.f78855a;
                String str4 = domain4.f78856b;
                ArrayList arrayList9 = domain4.f78857c;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                Iterator it9 = arrayList9.iterator();
                while (true) {
                    g0.d dVar = null;
                    if (!it9.hasNext()) {
                        RightToCancelSummaryContent.Explainer explainer2 = domain4.d;
                        if (explainer2 != null) {
                            String str5 = explainer2.f78862a;
                            ArrayList<RightToCancelSummaryContent.Explainer.Item> arrayList11 = explainer2.f78863b;
                            ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                            for (RightToCancelSummaryContent.Explainer.Item item : arrayList11) {
                                arrayList12.add(new g0.c.a(item.f78864a.b(), item.f78865b, item.f78866c));
                            }
                            cVar = new g0.c(str5, arrayList12);
                        } else {
                            cVar = null;
                        }
                        String str6 = domain4.e;
                        return new g0(str3, str4, arrayList10, cVar, str6 != null ? new g0.a(str6) : null, domain4.f, domain4.f78858g);
                    }
                    RightToCancelSummaryContent.DetailRow detailRow = (RightToCancelSummaryContent.DetailRow) it9.next();
                    String str7 = detailRow.f78859a;
                    String str8 = detailRow.f78860b;
                    RightToCancelSummaryContent.Info info = detailRow.f78861c;
                    if (info != null) {
                        dVar = new g0.d(info.f78867a, info.f78868b, info.f78869c);
                    }
                    arrayList10.add(new g0.b(str7, str8, dVar, detailRow.d));
                }
                break;
            case 9:
                g0 dto5 = (g0) obj3;
                Intrinsics.checkNotNullParameter((i) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto5, "dto");
                Intrinsics.checkNotNullParameter(dto5, "<this>");
                String title = dto5.getTitle();
                String description = dto5.getDescription();
                List details = dto5.getDetails();
                ArrayList arrayList13 = new ArrayList(zhm.w.t(details, 10));
                Iterator it10 = details.iterator();
                while (true) {
                    RightToCancelSummaryContent.Info info2 = null;
                    if (!it10.hasNext()) {
                        g0.c explainer3 = dto5.getExplainer();
                        if (explainer3 != null) {
                            String title2 = explainer3.getTitle();
                            List<g0.c.a> items = explainer3.getItems();
                            ArrayList arrayList14 = new ArrayList(zhm.w.t(items, 10));
                            for (g0.c.a aVar2 : items) {
                                y0 y0Var2 = a1.Companion;
                                String icon2 = aVar2.getIcon();
                                y0Var2.getClass();
                                a1 a1VarA2 = y0.a(icon2);
                                if (a1VarA2 == null) {
                                    throw new IllegalStateException(h30.l.r("Unsupported right-to-cancel icon ", aVar2.getIcon()));
                                }
                                arrayList14.add(new RightToCancelSummaryContent.Explainer.Item(a1VarA2, aVar2.getTitle(), aVar2.getDescription()));
                            }
                            explainer = new RightToCancelSummaryContent.Explainer(title2, arrayList14);
                        } else {
                            explainer = null;
                        }
                        g0.a acknowledgement = dto5.getAcknowledgement();
                        return new RightToCancelSummaryContent(title, description, arrayList13, explainer, acknowledgement != null ? acknowledgement.getText() : null, dto5.getPrimaryButtonText(), dto5.getSecondaryButtonText());
                    }
                    g0.b bVar = (g0.b) it10.next();
                    String label = bVar.getLabel();
                    String value = bVar.getValue();
                    g0.d info3 = bVar.getInfo();
                    if (info3 != null) {
                        info2 = new RightToCancelSummaryContent.Info(info3.getTitle(), info3.getDescription(), info3.getButtonText());
                    }
                    arrayList13.add(new RightToCancelSummaryContent.DetailRow(label, value, info2, bVar.getHighlight()));
                }
                break;
            case 10:
                Throwable error = (Throwable) obj2;
                InsuranceDocumentsAvailability insuranceDocumentsAvailability = (InsuranceDocumentsAvailability) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (insuranceDocumentsAvailability == null) {
                    return error;
                }
                return null;
            case 11:
                Throwable error2 = (Throwable) obj2;
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (paymentCounterpartyInfo == null) {
                    return error2;
                }
                return null;
            case 12:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 13:
                Throwable error4 = (Throwable) obj2;
                n38.a aVar3 = (n38.a) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (aVar3 == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                CardOwner cardOwner = (CardOwner) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cardOwner == null) {
                    return error6;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 17:
                Throwable error7 = (Throwable) obj2;
                uib.a aVar4 = (uib.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar4 == null) {
                    return error7;
                }
                return null;
            case 18:
                Throwable error8 = (Throwable) obj2;
                String str9 = (String) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (str9 == null) {
                    return error8;
                }
                return null;
            case 19:
                Throwable error9 = (Throwable) obj2;
                psg.a aVar5 = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (aVar5 == null) {
                    return error9;
                }
                return null;
            case 20:
                Throwable error10 = (Throwable) obj2;
                StatementUrlState statementUrlState = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (statementUrlState == null) {
                    return error10;
                }
                return null;
            case 21:
                Throwable error11 = (Throwable) obj2;
                StatementUrlState statementUrlState2 = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (statementUrlState2 == null) {
                    return error11;
                }
                return null;
            case 22:
                Throwable error12 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list3 == null) {
                    return error12;
                }
                return null;
            case 23:
                Throwable error13 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (list4 == null) {
                    return error13;
                }
                return null;
            case 24:
                Throwable error14 = (Throwable) obj2;
                pcd.s sVar = (pcd.s) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (sVar == null) {
                    return error14;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }
}
