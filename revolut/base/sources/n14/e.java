package n14;

import android.net.Uri;
import cli.z;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmount;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentConfiguration;
import com.revolut.feature.transfer.models.withholding_tax.WithholdingTaxTreatmentOption;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategoryWithImage;
import com.revolut.retail.wealth.resources.R$string;
import hx7.l;
import hx7.q;
import i9h.u;
import i9h.v;
import io.reactivex.exceptions.CompositeException;
import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import lr6.j0;
import lr6.l0;
import lyd.t;
import nif.a2;
import nif.q1;
import nif.r1;
import nif.s1;
import retrofit2.HttpException;
import retrofit2.Response;
import tof.a3;
import wli.y;
import xhf.f0;
import xhf.g0;
import xhf.g2;
import xhf.k0;
import xhf.m0;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.r0;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes22.dex */
public abstract class e {
    public static final List A(List list, List cachedCategoryUpdates) {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(cachedCategoryUpdates, "cachedCategoryUpdates");
        if (list.isEmpty()) {
            return list;
        }
        Map mapD = d(cachedCategoryUpdates);
        List<a3> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (a3 a3Var : list2) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = t(a3Var, mapD);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            a3 a3Var2 = (a3) objA;
            if (a3Var2 != null) {
                a3Var = a3Var2;
            }
            arrayList.add(a3Var);
        }
        return arrayList;
    }

    public static final boolean B(String phone1, String phone2) {
        Intrinsics.checkNotNullParameter(phone1, "phone1");
        Intrinsics.checkNotNullParameter(phone2, "phone2");
        return Intrinsics.f(w(phone1), w(phone2));
    }

    public static final TextLocalisedClause C(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        int i = i9h.e.f159851a[uVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_traded, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_bought, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_sold, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause D(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i = i9h.e.f159852b[vVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_day, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_week, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_month, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_year, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PagoPABill E(qq1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strE = dVar.getProvider();
        String strB = dVar.getBillId();
        dj0.d dVarO = mo3.a.o(dVar.getAmount());
        String strC = dVar.getDescription();
        String strF = dVar.getRecipientName();
        String strC2 = dVar.getExtraFields().getNoticeNumber();
        String strB2 = dVar.getExtraFields().getFiscalCode();
        String strD = dVar.getExtraFields().getOfficeName();
        LocalDate localDate = LocalDate.parse(dVar.getExtraFields().getApplicationDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new PagoPABill(strE, strB, dVarO, strC, strF, strC2, strB2, strD, localDate);
    }

    public static final ApmPaymentAuthorisationAmount F(k02.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        boolean variable = aVar.getVariable();
        jo3.a minimum = aVar.getMinimum();
        dj0.d dVarO = minimum != null ? mo3.a.o(minimum) : null;
        jo3.a maximum = aVar.getMaximum();
        return new ApmPaymentAuthorisationAmount(dVarO, maximum != null ? mo3.a.o(maximum) : null, variable);
    }

    public static final WithholdingTaxTreatmentConfiguration G(rrf.a aVar) {
        qrf.b bVar;
        qrf.b bVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.getDefault();
        qrf.b[] bVarArrValues = qrf.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (bVar != null) {
            List<rrf.b> values = aVar.getValues();
            ArrayList arrayList = new ArrayList();
            for (rrf.b bVar3 : values) {
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                String type = bVar3.getType();
                qrf.b[] bVarArrValues2 = qrf.b.values();
                int length2 = bVarArrValues2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        bVar2 = null;
                        break;
                    }
                    bVar2 = bVarArrValues2[i2];
                    if (a0.z(bVar2.name(), type, true)) {
                        break;
                    }
                    i2++;
                }
                WithholdingTaxTreatmentOption withholdingTaxTreatmentOption = bVar2 == null ? null : new WithholdingTaxTreatmentOption(bVar2, bVar3.getTitle(), bVar3.getDescription(), bVar3.getDisabled());
                if (withholdingTaxTreatmentOption != null) {
                    arrayList.add(withholdingTaxTreatmentOption);
                }
            }
            if (!arrayList.isEmpty()) {
                return new WithholdingTaxTreatmentConfiguration(bVar, arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r12v3, types: [dej.t3[]] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.esim.api.model.EsimTerms H(kfj.b5 r23) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.e.H(kfj.b5):com.revolut.retail.feature.esim.api.model.EsimTerms");
    }

    public static final myf.i I(qzf.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        List<qzf.n> recommendedCategories = oVar.getRecommendedCategories();
        ArrayList arrayList = new ArrayList(w.t(recommendedCategories, 10));
        for (qzf.n nVar : recommendedCategories) {
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            arrayList.add(new TravelExperienceCategoryWithImage(nVar.getId(), nVar.getLabel(), nVar.getImage()));
        }
        return new myf.i(arrayList, ezf.a.a(oVar.getDestination()));
    }

    public static final i4d.a J(z3d.c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f319248a.f86866a;
        dj0.d dVar = cVar.f319249b;
        return new i4d.a(i, str, dVar.f115083b.f306286a, dVar.f115082a);
    }

    public static final nif.a K(xhf.a aVar) {
        nif.b bVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strC = aVar.getType();
        String strA = aVar.getPocketId();
        xhf.b bVarB = aVar.getRelatedEntity();
        if (bVarB != null) {
            Intrinsics.checkNotNullParameter(bVarB, "<this>");
            bVar = new nif.b(bVarB.getId(), bVarB.getType());
        } else {
            bVar = null;
        }
        return new nif.a(strC, strA, bVar);
    }

    public static final nif.h L(xhf.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new nif.h(dVar.getId(), dVar.getPhone(), dVar.getEmail(), dVar.getType(), dVar.getAlias(), dVar.getContactName());
    }

    public static final nif.i M(xhf.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new nif.i(eVar.getProvider());
    }

    public static final q1 N(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new q1(k0Var.getId(), k0Var.getState(), new r1(k0Var.getSender().getFirstName(), k0Var.getSender().getLastName()));
    }

    public static final s1 O(m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        String strB = m0Var.getPlanId();
        if (strB == null) {
            return null;
        }
        return new s1(strB, m0Var.getPlanTier(), m0Var.getBillingCycleId());
    }

    public static final a2 P(xhf.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new a2(kVar.getFirstName(), kVar.getLastName(), kVar.getState(), kVar.getCard().getLastFour(), kVar.getCard().getScheme(), kVar.getCard().getLogoUrl());
    }

    public static final lg0.e Q(zli.b bVar, String template) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        zli.d dVarS = l.s(bVar, template);
        if (dVarS == null) {
            return null;
        }
        String str = bVar.f323278a;
        LinkedHashMap linkedHashMap = dVarS.f323283a;
        LinkedHashMap params = bVar.d;
        Intrinsics.checkNotNullParameter(params, "params");
        return new lg0.e(str, linkedHashMap, params, bVar.f323280c);
    }

    public static final String R(f8l.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = d8l.h.f112298a[eVar.ordinal()];
        if (i == 1) {
            return "MARKET";
        }
        if (i == 2) {
            return "LIMIT";
        }
        if (i == 3) {
            return "STOP";
        }
        if (i == 4) {
            return "RECURRING";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static cli.v a(cli.w wVar, z model) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new cli.v(wVar, model, null);
    }

    public static final boolean b(AbstractList abstractList, Object obj2) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        if (obj2 != null) {
            return abstractList.add(obj2);
        }
        return false;
    }

    public static final String c(String str) {
        if (str == null || d0.W(str)) {
            return "";
        }
        return "@" + ((Object) str);
    }

    public static final Map d(List cachedCategoryUpdates) {
        Intrinsics.checkNotNullParameter(cachedCategoryUpdates, "cachedCategoryUpdates");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = cachedCategoryUpdates.iterator();
        while (it8.hasNext()) {
            pe0.e eVar = (pe0.e) it8.next();
            List list = eVar.f235282g;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new Pair((String) it9.next(), eVar));
            }
            zhm.a0.x(arrayList2, arrayList);
        }
        return r0.t(arrayList);
    }

    public static void e(Object obj2, Class cls) {
        if (obj2 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void f(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void g(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final String h(String str, wli.u uVar) {
        int i = y.f298523a[uVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = a0.E(str, '+', p.SPACE_CHAR);
        }
        String strDecode = Uri.decode(str);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    public static final ArrayList i(List list) {
        zm3.f fVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zm3.a aVar = (zm3.a) it8.next();
            if (aVar instanceof zm3.f) {
                fVar = (zm3.f) aVar;
            } else if (aVar instanceof zm3.i) {
                fVar = ((zm3.i) aVar).e;
            } else {
                if (!(aVar instanceof zm3.e) && !(aVar instanceof zm3.j) && !(aVar instanceof zm3.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static final Map j() {
        return r0.k(new Pair("VISA", e93.b.VISA), new Pair("MASTERCARD", e93.b.MC), new Pair("MAESTRO", e93.b.MAESTRO));
    }

    public static final ContactImage k(zm3.a aVar, StylableContactImage$Style stylableContactImage$Style, boolean z) {
        StylableContactImage$Style stylableContactImage$Style2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!(aVar instanceof zm3.l)) {
            if (aVar instanceof zm3.g) {
                return new ContactImage((String) null, (String) null, (String) null, q.D(aVar), (String) null, q.v(aVar), (String) null, z, stylableContactImage$Style, (ImageTransformations) null, (TextLocalisedClause) null, 3287);
            }
            if (aVar instanceof zm3.p) {
                return new ContactImage((String) null, (String) null, (String) null, q.D(aVar), (String) null, (String) null, (String) null, z, stylableContactImage$Style, (ImageTransformations) null, (TextLocalisedClause) null, 3319);
            }
            throw new NoWhenBranchMatchedException();
        }
        String strV = q.v(aVar);
        String code = ((zm3.l) aVar).getCode();
        if (stylableContactImage$Style == null) {
            stylableContactImage$Style2 = q.M(aVar) ? new StylableContactImage$Style(R$attr.uikit_colorRevolutU18Violet, R$attr.uikit_colorBlack) : null;
        } else {
            stylableContactImage$Style2 = stylableContactImage$Style;
        }
        return new ContactImage((String) null, (String) null, code, (String) null, (String) null, strV, (String) null, z, stylableContactImage$Style2, (ImageTransformations) null, (TextLocalisedClause) null, 3291);
    }

    public static /* synthetic */ ContactImage l(zm3.a aVar, StylableContactImage$Style stylableContactImage$Style, int i) {
        if ((i & 1) != 0) {
            stylableContactImage$Style = null;
        }
        return k(aVar, stylableContactImage$Style, false);
    }

    public static final Integer m(Throwable th10) {
        Object next;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (th10 instanceof ServerErrorException) {
            return Integer.valueOf(((ServerErrorException) th10).e);
        }
        if (th10 instanceof HttpException) {
            Response<?> response = ((HttpException) th10).response();
            if (response != null) {
                return Integer.valueOf(response.code());
            }
            return null;
        }
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Throwable th11 = (Throwable) next;
                Intrinsics.h(th11);
                if (m(th11) != null) {
                    break;
                }
            }
            Throwable th12 = (Throwable) next;
            if (th12 != null) {
                return m(th12);
            }
        }
        return null;
    }

    public static final Map n() {
        return r0.k(new Pair("FAILED", j0.FAILED), new Pair("ACTIVE", j0.ACTIVE), new Pair("REVERTED", j0.REVERTED), new Pair("DECLINED", j0.DECLINED), new Pair("COMPLETED", j0.COMPLETED), new Pair("PENDING", j0.PENDING), new Pair("REJECTED", j0.REJECTED), new Pair("CANCELLED", j0.CANCELLED));
    }

    public static final Map o() {
        return r0.k(new Pair("EXCHANGE", l0.EXCHANGE), new Pair("MERCHANT_CB", l0.CHARGEBACK), new Pair("MERCHANT_CB_RVSL", l0.CHARGEBACK_REVERSAL), new Pair("MERCHANT_REFUND", l0.REFUND), new Pair("MERCHANT_CRED_RVSL", l0.REFUND_REVERSAL), new Pair("MERCHANT_FEE", l0.FEE), new Pair("MERCHANT_FEE_RVSL", l0.FEE_REVERSAL), new Pair("MERCHANT_PAYMENT", l0.PAYMENT), new Pair("MERCHANT_RESERVE", l0.RESERVE), new Pair("REV_PAYMENT", l0.REV_PAYMENT), new Pair("REV_PAYMENT_REFUND", l0.REV_PAYMENT_REFUND), new Pair("TRANSFER", l0.TRANSFER));
    }

    public static final int p(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        int i = h0e.h.f148383a[tVar.ordinal()];
        if (i == 1) {
            return com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_title_currencies;
        }
        if (i == 2) {
            return com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_title_accounts;
        }
        if (i == 3) {
            return com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_title_assets;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean r(xhf.h hVar, String currentUserId) {
        List listB;
        g0 g0Var;
        String strA;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        f0 f0VarP0 = hVar.getJoint();
        if (f0VarP0 == null || (listB = f0VarP0.getPeers()) == null || (g0Var = (g0) zhm.d0.d0(listB)) == null || (strA = g0Var.getId()) == null) {
            return false;
        }
        String strA2 = f0VarP0.getAccountId();
        g2 g2VarX0 = hVar.getRecipient();
        boolean zF = Intrinsics.f(g2VarX0 != null ? g2VarX0.getId() : null, strA2);
        g2 g2VarF1 = hVar.getSender();
        boolean zF2 = Intrinsics.f(g2VarF1 != null ? g2VarF1.getId() : null, strA2);
        g2 g2VarF12 = hVar.getSender();
        boolean zF3 = Intrinsics.f(g2VarF12 != null ? g2VarF12.getId() : null, currentUserId);
        g2 g2VarX02 = hVar.getRecipient();
        boolean zF4 = Intrinsics.f(g2VarX02 != null ? g2VarX02.getId() : null, currentUserId);
        g2 g2VarF13 = hVar.getSender();
        boolean zF5 = Intrinsics.f(g2VarF13 != null ? g2VarF13.getId() : null, strA);
        g2 g2VarX03 = hVar.getRecipient();
        return zF || zF2 || zF3 || zF5 || zF4 || Intrinsics.f(g2VarX03 != null ? g2VarX03.getId() : null, strA);
    }

    public static final boolean s(rub.i iVar, rub.i iVar2) {
        if (iVar2 == null || pd.b.j(iVar2.i)) {
            return false;
        }
        return Intrinsics.b(iVar != null ? Double.valueOf(iVar.f257517a) : null, iVar2.f257517a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tof.a3 t(tof.a3 r14, java.util.Map r15) {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n14.e.t(tof.a3, java.util.Map):tof.a3");
    }

    public static final dj0.d u(List list) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        try {
            m.Companion companion = m.INSTANCE;
            dj0.d.Companion.getClass();
            dj0.d dVar = dj0.d.e;
            int i = 0;
            dj0.d dVar2 = dVar;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dj0.d dVarO = i == 0 ? (dj0.d) obj2 : pyd.c.O(dVar2, (dj0.d) obj2);
                i = i2;
                dVar2 = dVarO;
            }
            dj0.d.Companion.getClass();
            boolean zF = Intrinsics.f(dVar2, dj0.d.e);
            objA = dVar2;
            if (zF) {
                objA = null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        return (dj0.d) (objA instanceof n ? null : objA);
    }

    public static final String v(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = d0.F0(str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String w(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = new Regex("[\\s-]");
        m70.a.c(t0.f186434a);
        return regex.replace(str, "");
    }

    public static final Flow x(ffk.t tVar, Function1 observe) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(observe, "observe");
        akg.n nVarV = nim.a.v(rd0.e.b(tVar.v(w4l.h.f294642c)), new vf0.p(29));
        vga.g selectKey = new vga.g(0);
        Intrinsics.checkNotNullParameter(nVarV, "<this>");
        Intrinsics.checkNotNullParameter(selectKey, "selectKey");
        Intrinsics.checkNotNullParameter(observe, "observe");
        return vkm.q.q(vkm.q.Q(vkm.q.r(new ack.f(selectKey, 14), nVarV), new a32.b((Continuation) null, observe, selectKey, 4)));
    }

    public static final List y(Uri uri2, wli.u mode) {
        String strH;
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (uri2.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri2.getEncodedQuery();
        if (encodedQuery == null) {
            return zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < encodedQuery.length()) {
            int iS = d0.S(encodedQuery, '&', i, 4);
            if (iS == -1) {
                iS = encodedQuery.length();
            }
            if (i < iS) {
                int iS2 = d0.S(encodedQuery, '=', i, 4);
                if (iS2 == -1 || iS2 > iS) {
                    iS2 = iS;
                }
                String strSubstring = encodedQuery.substring(i, iS2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strH2 = h(strSubstring, mode);
                if (iS2 == iS) {
                    strH = "";
                } else {
                    String strSubstring2 = encodedQuery.substring(iS2 + 1, iS);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    strH = h(strSubstring2, mode);
                }
                arrayList.add(new Pair(strH2, strH));
            }
            i = iS + 1;
        }
        return arrayList;
    }

    public abstract boolean q();
}
