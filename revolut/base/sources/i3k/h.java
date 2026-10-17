package i3k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContext;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import h3k.c;
import h3k.o;
import h3k.r;
import ip0.s7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import z1k.q;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158238a;

    public /* synthetic */ h(int i) {
        this.f158238a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dj0.d] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? r142;
        Iterator it8;
        List list;
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation;
        Object eVar;
        int i = 10;
        String str = null;
        switch (this.f158238a) {
            case 0:
                List listParams = (List) obj2;
                Intrinsics.checkNotNullParameter(listParams, "listParams");
                return (l) d0.m0(listParams);
            case 1:
                List properties = (List) obj2;
                Intrinsics.checkNotNullParameter(properties, "properties");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = properties.iterator();
                while (it9.hasNext()) {
                    h3k.d dVar = (h3k.d) it9.next();
                    Map map = d.f158233a;
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    RemittanceRouteId remittanceRouteIdA = d.a(dVar.getId(), dVar.getTransferVendor(), str);
                    if (remittanceRouteIdA == null) {
                        it8 = it9;
                        eVar = str;
                    } else {
                        r transferLimits = dVar.getTransferLimits();
                        Intrinsics.checkNotNullParameter(transferLimits, "<this>");
                        dj0.d dVarO = mo3.a.o(transferLimits.getLower());
                        jo3.a upper = transferLimits.getUpper();
                        q qVar = new q(dVarO, upper != null ? mo3.a.o(upper) : str);
                        boolean decimalsAllowed = dVar.getDecimalsAllowed();
                        Long multiple = dVar.getMultiple();
                        List options = dVar.getOptions();
                        if (options != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it10 = options.iterator();
                            while (it10.hasNext()) {
                                z1k.g gVar = (z1k.g) u1.v((String) it10.next(), d.f158233a);
                                if (gVar != null) {
                                    arrayList2.add(gVar);
                                }
                            }
                            r142 = arrayList2;
                        } else {
                            r142 = str;
                        }
                        List referenceOptions = dVar.getReferenceOptions();
                        if (referenceOptions != null) {
                            List<o> list2 = referenceOptions;
                            ArrayList arrayList3 = new ArrayList(w.t(list2, i));
                            for (o oVar : list2) {
                                String label = oVar.getLabel();
                                String type = oVar.getType();
                                List fields = oVar.getFields();
                                Iterator it11 = it9;
                                ArrayList arrayList4 = new ArrayList(w.t(fields, i));
                                Iterator it12 = fields.iterator();
                                while (it12.hasNext()) {
                                    o.a aVar = (o.a) it12.next();
                                    String type2 = aVar.getType();
                                    String label2 = aVar.getLabel();
                                    String regex = aVar.getRegex();
                                    String inputMask = aVar.getInputMask();
                                    String inputType = aVar.getInputType();
                                    Iterator it13 = it12;
                                    z1k.d dVar2 = (!Intrinsics.f(inputType, "TEXT") && Intrinsics.f(inputType, "NUMERIC")) ? z1k.d.NUMERIC : z1k.d.TEXT;
                                    z1k.d dVar3 = dVar2;
                                    String description = aVar.getDescription();
                                    boolean optional = aVar.getOptional();
                                    boolean zK = pd.b.k(aVar.getEditable());
                                    String defaultValue = aVar.getDefaultValue();
                                    if (defaultValue == null) {
                                        defaultValue = "";
                                    }
                                    String str2 = defaultValue;
                                    List hidden = aVar.getHidden();
                                    if (hidden == null) {
                                        hidden = f0.f322471a;
                                    }
                                    boolean zContains = hidden.contains("AMOUNT");
                                    List hidden2 = aVar.getHidden();
                                    if (hidden2 == null) {
                                        hidden2 = f0.f322471a;
                                    }
                                    arrayList4.add(new RemittanceReferenceField(type2, label2, regex, inputMask, dVar3, description, optional, zK, str2, zContains, hidden2.contains("REVIEW")));
                                    it12 = it13;
                                }
                                arrayList3.add(new RemittanceReferenceOption(label, type, arrayList4));
                                it9 = it11;
                                i = 10;
                            }
                            it8 = it9;
                            list = arrayList3;
                        } else {
                            it8 = it9;
                            list = f0.f322471a;
                        }
                        List list3 = list;
                        h3k.c accountSwitchingInformation = dVar.getAccountSwitchingInformation();
                        if (accountSwitchingInformation != null) {
                            String title = accountSwitchingInformation.getTitle();
                            String description2 = accountSwitchingInformation.getDescription();
                            String bankName = accountSwitchingInformation.getBankName();
                            String bankLogo = accountSwitchingInformation.getBankLogo();
                            String redirectToBeneficiaryId = accountSwitchingInformation.getRedirectToBeneficiaryId();
                            List<c.a> accountDetails = accountSwitchingInformation.getAccountDetails();
                            i = 10;
                            ArrayList arrayList5 = new ArrayList(w.t(accountDetails, 10));
                            for (c.a aVar2 : accountDetails) {
                                arrayList5.add(new RemittanceAccountSwitchingInformation.AccountDetails(aVar2.getLabel(), aVar2.getValue()));
                            }
                            remittanceAccountSwitchingInformation = new RemittanceAccountSwitchingInformation(title, description2, bankName, bankLogo, redirectToBeneficiaryId, arrayList5);
                        } else {
                            i = 10;
                            remittanceAccountSwitchingInformation = null;
                        }
                        eVar = new z1k.e(remittanceRouteIdA, qVar, decimalsAllowed, multiple, r142, list3, remittanceAccountSwitchingInformation);
                    }
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                    it9 = it8;
                    str = null;
                }
                return arrayList;
            case 2:
                h3k.k response = (h3k.k) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List providersPricing = response.getProvidersPricing();
                Map map2 = d.f158233a;
                Intrinsics.checkNotNullParameter(providersPricing, "<this>");
                List<h3k.j> list4 = providersPricing;
                ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
                for (h3k.j jVar : list4) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    String name = jVar.getName();
                    String logo = jVar.getLogo();
                    Double totalFxRate = jVar.getTotalFxRate();
                    dj0.d dVarO2 = mo3.a.o(jVar.getFixedFee());
                    dj0.d dVarO3 = mo3.a.o(jVar.getSenderAmount());
                    dj0.d dVarO4 = mo3.a.o(jVar.getRecipientAmount());
                    h3k.i plan = jVar.getPlan();
                    arrayList6.add(new z1k.l(name, logo, totalFxRate, dVarO2, dVarO3, dVarO4, plan != null ? plan.getName() : null));
                }
                return arrayList6;
            case 3:
                File file = (File) obj2;
                Intrinsics.h(file);
                return new i42.a(file);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayListP.add(new s7(a0.d.n("ID_ROW_LOADING_", i2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new i4b.k((y49.b) pair.f186386b, (MarginQuote) pair.f186385a);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new i4b.l((a4b.g) pair2.f186386b, (MarginQuote) pair2.f186385a);
            case 8:
                i4b.n updateState = (i4b.n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return i4b.n.a(updateState, null, null, null, null, null, zi0.c.P(Optional.empty(), false, null, 3), 2047);
            case 9:
                LargeActionButtonDelegate.Model it14 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f52613a, "CFD_EXPIRY_ORDER_DIALOG_GOT_IT_ID"));
            case 10:
                LargeActionButtonDelegate.Model it15 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f52613a, "CFD_FEE_BREAKDOWN_DESCRIPTION_DIALOG_GOT_IT_ID"));
            case 11:
                lk0.g it16 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(!it16.f196174a.isEmpty());
            case 12:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 13:
                return h30.l.q("it", (od0.i) obj2);
            case 14:
                od0.i it17 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (FlightSearchContext) it17.c();
            case 15:
                long jLongValue = ((Long) obj2).longValue();
                return new CompositeClause(v.k(new TimeClause(jLongValue, new TimeClause.Format.DayAndMonth(0), null, null, 12), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(jLongValue, TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 10);
            case 16:
                return new TimeClause(((Long) obj2).longValue(), new TimeClause.Format.DayAndMonth(0), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            case 17:
                return new TimeClause(((Long) obj2).longValue(), TimeClause.Format.DateLong.f57962b, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 19:
                g6 it18 = (g6) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f54200b.f52342a, "CHART_TABS_ID"));
            case 20:
                g6 it19 = (g6) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f54199a;
            case 21:
                ai it20 = (ai) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(Intrinsics.f(it20.f53688b.f53517a, "CHART_TABS_ID"));
            case 22:
                ai it21 = (ai) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f53687a;
            case 23:
                e3h.c update = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e3h.c.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, 4177919);
            case 24:
                e3h.c it22 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f122273b;
            case 25:
                e3h.c it23 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                nel.n nVar = it23.d;
                if (nVar != null) {
                    return nVar.f214597c;
                }
                return null;
            case 26:
                e3h.c it24 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                nel.n nVar2 = it24.d;
                if (nVar2 != null) {
                    return nVar2.f214597c;
                }
                return null;
            case 27:
                e3h.c it25 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return it25.f122273b;
            case 28:
                e3h.c it26 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.f122272a;
            default:
                e3h.c it27 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return it27.f122274c;
        }
    }
}
