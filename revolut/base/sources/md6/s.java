package md6;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.action.Action;
import androidx.glance.appwidget.action.StartActivityIntentActionKt;
import com.revolut.chat.domain.model.rate.ExperienceTagItem;
import com.revolut.chat.domain.model.rate.RateChatExperienceData;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.transport.models.transit.TransitTicketDescription;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtpResend;
import dej.f0;
import dfl.x;
import ft3.b1;
import ft3.r0;
import ft3.s0;
import ft3.t0;
import ft3.v0;
import ft3.w0;
import ft3.x0;
import ft3.y0;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kfj.p2;
import kfj.q2;
import kfj.r1;
import kfj.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mif.e0;
import org.joda.time.DateTime;
import pvg.g0;
import pvg.i0;
import uvg.b0;
import uvg.c0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s implements ld6.g {
    public static final y0 A(it3.k kVar) {
        switch (kVar == null ? -1 : b1.f137801a[kVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return x0.f137890a;
            case 2:
                return v0.f137882a;
            case 3:
                return w0.f137887a;
            case 4:
                return t0.f137874a;
            case 5:
                return s0.f137872a;
            case 6:
                return r0.f137867a;
            case 7:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "ProductMetadataType", "INVITATION cannot be mapped: invitationId missing", null, h0Var);
                return null;
        }
    }

    public static final Action B(k01.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return StartActivityIntentActionKt.actionStartActivity$default(cVar.f179898a, null, 2, null);
    }

    public static final String C(k20.c cVar) {
        String strK0;
        StringBuilder sb6 = new StringBuilder("RatingDto(");
        sb6.append("experience=" + cVar.getExperience() + ", ");
        sb6.append("title=" + cVar.getTitle() + ", ");
        sb6.append("icon=" + cVar.getIcon() + ", ");
        sb6.append("asset=" + cVar.getAsset() + ", ");
        sb6.append("assetSymbol=" + cVar.getAssetSymbol() + ", ");
        sb6.append("assetSymbolHighlighted=" + cVar.getAssetSymbolHighlighted() + ", ");
        sb6.append("feedbackRequirement=" + cVar.getFeedbackRequirement() + ", ");
        sb6.append("tagsHeader=" + cVar.getTagsHeader() + ", ");
        List tags = cVar.getTags();
        if (tags == null || (strK0 = d0.k0(tags, null, "[", "]", 0, new y07.m(11), 25)) == null) {
            strK0 = "null";
        }
        sb6.append("tags=" + strK0 + ")");
        return sb6.toString();
    }

    public static final dj0.d D(MoneyDetails moneyDetails) {
        Intrinsics.checkNotNullParameter(moneyDetails, "<this>");
        Long l2 = moneyDetails.f99904b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f99903a);
    }

    public static final ViewController E(BaseBottomSheetController baseBottomSheetController, Function2 tillFinish, boolean z, Function1 onQuit, Function1 onResult) {
        Intrinsics.checkNotNullParameter(baseBottomSheetController, "<this>");
        Intrinsics.checkNotNullParameter(tillFinish, "tillFinish");
        Intrinsics.checkNotNullParameter(onQuit, "onQuit");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!z) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            baseBottomSheetController.l2(new ky4.f(tillFinish, atomicBoolean, onQuit));
            ky4.g block = new ky4.g(atomicBoolean, onResult, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            baseBottomSheetController.H = block;
            return baseBottomSheetController;
        }
        AtomicReference atomicReference = new AtomicReference(null);
        baseBottomSheetController.l2(new bib.b(tillFinish, atomicReference, onResult, onQuit));
        k65.d block2 = new k65.d(1, atomicReference, AtomicReference.class, "store", "set(Ljava/lang/Object;)V", 0, 28);
        Intrinsics.checkNotNullParameter(block2, "block");
        baseBottomSheetController.H = block2;
        return baseBottomSheetController;
    }

    public static ViewController F(BaseBottomSheetController baseBottomSheetController, Function2 function2, Function1 function1, Function1 function12, int i) {
        if ((i & 4) != 0) {
            function1 = new a27.d(1, 8, null);
        }
        E(baseBottomSheetController, function2, false, function1, function12);
        return baseBottomSheetController;
    }

    public static final void G(ViewController viewController, Function2 tillHide, Function1 onQuit, Function1 onResult) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(tillHide, "tillHide");
        Intrinsics.checkNotNullParameter(onQuit, "onQuit");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        viewController.l2(new dok.c(tillHide, atomicBoolean, onQuit, 1));
        ky4.g block = new ky4.g(atomicBoolean, onResult, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        viewController.H = block;
    }

    public static wki.c a(wki.a aVar, wki.b model, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = R$id.container;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new wki.c(i, aVar, model);
    }

    public static ali.b b(ali.h hostPagerModel, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(hostPagerModel, "<this>");
        Intrinsics.checkNotNullParameter(hostPagerModel, "hostPagerModel");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        return new ali.b(controllersFactory);
    }

    public static final boolean c(gxi.e eVar, dj0.d checkoutPrice) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        PaymentMethod.Pocket pocket = eVar.f147748a;
        dj0.d dVar = pocket.i;
        if (Intrinsics.f(pocket.i.f115083b, checkoutPrice.f115083b)) {
            return dVar.e(checkoutPrice);
        }
        xi0.b bVar = dVar.f115083b;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CheckoutRevPayExtensions", a0.d.s("Can not perform balance sufficiency check. Pocket currency ", bVar.f306286a, " does not match payment currency ", checkoutPrice.f115083b.f306286a), null, h0Var);
        return false;
    }

    public static final String d(String... names) {
        Intrinsics.checkNotNullParameter(names, "names");
        ArrayList arrayList = new ArrayList(names.length);
        for (String str : names) {
            arrayList.add(kotlin.text.d0.F0(str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!kotlin.text.d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return d0.k0(arrayList2, " ", null, null, 0, null, 62);
    }

    public static String e(String str) {
        String[] strArrSplit = str != null ? str.split("\\.") : null;
        if (strArrSplit == null || strArrSplit.length != 3) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(strArrSplit[1], 0);
        return bArrDecode != null ? new String(bArrDecode) : "";
    }

    public static final String f(jq9.t tVar) {
        f5j.a aVar;
        Map map;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        jq9.v vVar = tVar instanceof jq9.v ? (jq9.v) tVar : null;
        if (vVar == null || (aVar = vVar.f177523a) == null || (map = aVar.u) == null) {
            return null;
        }
        return (String) map.get("TRANSFER_VENDOR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view instanceof qp0.a) {
            return ((qp0.a) view).getDynamicContext();
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public static final String h(bi9.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.f15447a.f322365a.f322326a;
    }

    public static boolean i(Uri uri2) {
        return uri2 != null && "content".equals(uri2.getScheme()) && "media".equals(uri2.getAuthority());
    }

    public static final boolean j(io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        io3.k kVar = dVar.f;
        if (kVar != io3.k.ACTIVE) {
            return (kVar == io3.k.INACTIVE && !io3.h.e(dVar).k()) || kVar == io3.k.DELISTED;
        }
        return true;
    }

    public static final lq0.p k(ax0.h out, ax0.g into, boolean z) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(into, "into");
        ConstraintLayout hostView = into.f10834a.getHostView();
        ActionFooterView actionFooterView = into.f10834a.getActionFooterView();
        aim.e eVarB = zhm.u.b();
        View view = out.f10838b;
        e0.d(eVarB, view);
        UIKitTextView uIKitTextView = out.f10839c;
        e0.d(eVarB, uIKitTextView);
        e0.d(eVarB, out.d);
        aim.e eVarA = zhm.u.a(eVarB);
        aim.e eVarB2 = zhm.u.b();
        View view2 = into.f10835b;
        e0.d(eVarB2, view2);
        e0.d(eVarB2, into.f10836c);
        aim.e eVarA2 = zhm.u.a(eVarB2);
        aim.e eVarB3 = zhm.u.b();
        eVarB3.addAll(eVarA);
        eVarB3.addAll(eVarA2);
        eVarB3.add(actionFooterView);
        ProgressPagingIndicatorView progressPagingIndicatorView = out.f;
        eVarB3.add(progressPagingIndicatorView);
        aim.e eVarA3 = zhm.u.a(eVarB3);
        if (z) {
            if (view.getVisibility() != 0) {
                view = uIKitTextView;
            }
            view2 = view;
            view = view2;
        } else if (view.getVisibility() != 0) {
            view = uIKitTextView;
        }
        lq0.d dVar = z ? lq0.d.BOTTOM_TO_TOP : lq0.d.TOP_TO_BOTTOM;
        lq0.q qVar = new lq0.q();
        lq0.t tVar = new lq0.t(view2, view);
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            tVar.a((View) bVar.next());
        }
        ListIterator listIterator2 = eVarA2.listIterator(0);
        while (true) {
            aim.b bVar2 = (aim.b) listIterator2;
            if (!bVar2.hasNext()) {
                break;
            }
            tVar.a((View) bVar2.next());
        }
        qVar.m(tVar);
        lq0.e eVar = new lq0.e(hostView, dVar);
        eVar.a(actionFooterView);
        qVar.m(eVar);
        lq0.f fVar = new lq0.f();
        ListIterator listIterator3 = eVarA3.listIterator(0);
        while (true) {
            aim.b bVar3 = (aim.b) listIterator3;
            if (!bVar3.hasNext()) {
                break;
            }
            fVar.a((View) bVar3.next());
        }
        qVar.m(fVar);
        if (z) {
            ListIterator listIterator4 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar4 = (aim.b) listIterator4;
                if (!bVar4.hasNext()) {
                    break;
                }
                ((View) bVar4.next()).setVisibility(0);
            }
            ListIterator listIterator5 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar5 = (aim.b) listIterator5;
                if (!bVar5.hasNext()) {
                    break;
                }
                ((View) bVar5.next()).setVisibility(8);
            }
            actionFooterView.setVisibility(8);
            progressPagingIndicatorView.setVisibility(0);
        } else {
            ListIterator listIterator6 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar6 = (aim.b) listIterator6;
                if (!bVar6.hasNext()) {
                    break;
                }
                ((View) bVar6.next()).setVisibility(8);
            }
            ListIterator listIterator7 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar7 = (aim.b) listIterator7;
                if (!bVar7.hasNext()) {
                    break;
                }
                ((View) bVar7.next()).setVisibility(0);
            }
            actionFooterView.setVisibility(0);
            progressPagingIndicatorView.setVisibility(8);
        }
        lq0.p.Companion.getClass();
        lq0.p pVarA = lq0.o.a(hostView, qVar);
        if (z) {
            ListIterator listIterator8 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar8 = (aim.b) listIterator8;
                if (!bVar8.hasNext()) {
                    break;
                }
                ((View) bVar8.next()).setVisibility(8);
            }
            ListIterator listIterator9 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar9 = (aim.b) listIterator9;
                if (!bVar9.hasNext()) {
                    actionFooterView.setVisibility(0);
                    progressPagingIndicatorView.setVisibility(8);
                    return pVarA;
                }
                ((View) bVar9.next()).setVisibility(0);
            }
        } else {
            ListIterator listIterator10 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar10 = (aim.b) listIterator10;
                if (!bVar10.hasNext()) {
                    break;
                }
                ((View) bVar10.next()).setVisibility(0);
            }
            ListIterator listIterator11 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar11 = (aim.b) listIterator11;
                if (!bVar11.hasNext()) {
                    actionFooterView.setVisibility(8);
                    progressPagingIndicatorView.setVisibility(0);
                    return pVarA;
                }
                ((View) bVar11.next()).setVisibility(8);
            }
        }
    }

    public static final String l(String str, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((PaymentVendor) next).f64079a, str, true)) {
                break;
            }
        }
        PaymentVendor paymentVendor = (PaymentVendor) next;
        String str2 = paymentVendor != null ? paymentVendor.f64080b : null;
        if (str2 != null) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.f(upperCase, str2)) {
                String lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return jli.g.b(lowerCase);
            }
        }
        if (str2 != null) {
            return str2;
        }
        if (str != null) {
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (lowerCase2 != null) {
                return jli.g.b(lowerCase2);
            }
        }
        return null;
    }

    public static final String m(qel.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = veh.l.f288340a[bVar.ordinal()];
        if (i == 1) {
            return "CALL";
        }
        if (i == 2) {
            return "PUT";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair n(TotalValueChartFacade totalValueChartFacade, iwg.a analyticsProductType, eel.c timeSpan, xi0.b currency, String portfolioId, String chartDetailsType) {
        String str;
        jo3.b bVarA;
        Intrinsics.checkNotNullParameter(totalValueChartFacade, "<this>");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        String str2 = currency.f306286a;
        DateTime dateTime = totalValueChartFacade.f94985a;
        DateTime dateTime2 = totalValueChartFacade.f94986b;
        dj0.d dVar = totalValueChartFacade.d;
        jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
        dj0.d dVar2 = totalValueChartFacade.e;
        if (dVar2 != null) {
            str = chartDetailsType;
            bVarA = hx7.a.A(dVar2);
        } else {
            str = chartDetailsType;
            bVarA = null;
        }
        i0 i0Var = new i0(analyticsProductType, timeSpan, str2, portfolioId, dateTime, dateTime2, bVarA2, bVarA, str);
        List<TotalValueChartPointFacade> list = totalValueChartFacade.f94987c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TotalValueChartPointFacade totalValueChartPointFacade : list) {
            String str3 = currency.f306286a;
            DateTime dateTime3 = totalValueChartPointFacade.f94988a;
            jo3.b bVarA3 = hx7.a.A(totalValueChartPointFacade.f94989b);
            dj0.d dVar3 = totalValueChartPointFacade.f94990c;
            arrayList.add(new g0(analyticsProductType, timeSpan, str3, portfolioId, dateTime3, bVarA3, dVar3 != null ? hx7.a.A(dVar3) : null, chartDetailsType));
        }
        return new Pair(i0Var, arrayList);
    }

    public static final n3f.p o(dfl.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (!(qVar instanceof dfl.a)) {
            if (qVar instanceof x) {
                return new n3f.p("QUANTITY", null, ((x) qVar).f114516a.toString(), null);
            }
            throw new NoWhenBranchMatchedException();
        }
        dfl.a aVar = (dfl.a) qVar;
        long j2 = aVar.f114177a;
        return new n3f.p("AMOUNT", Long.valueOf(j2), null, aVar.f114178b.f306286a);
    }

    public static final ExperienceTagItem p(k20.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ExperienceTagItem(aVar.getTag(), aVar.getLabel());
    }

    public static final TransitTicketDescription q(cvf.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new TransitTicketDescription(nVar.getDescription(), nVar.getShortDescription(), nVar.getExtraDescription());
    }

    public static final TotalValueChartFacade r(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        pvg.h0 h0Var = (pvg.h0) d0.d0(list);
        if (h0Var == null) {
            return null;
        }
        DateTime dateTime = h0Var.e;
        DateTime dateTime2 = h0Var.f;
        List<pvg.h0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (pvg.h0 h0Var2 : list2) {
            DateTime dateTime3 = h0Var2.i;
            dj0.d dVarV = hx7.a.v(h0Var2.f240153j);
            jo3.b bVar = h0Var2.k;
            arrayList.add(new TotalValueChartPointFacade(dVarV, bVar != null ? hx7.a.v(bVar) : null, dateTime3));
        }
        jo3.b bVar2 = h0Var.f240151g;
        dj0.d dVarV2 = bVar2 != null ? hx7.a.v(bVar2) : null;
        jo3.b bVar3 = h0Var.f240152h;
        return new TotalValueChartFacade(dVarV2, bVar3 != null ? hx7.a.v(bVar3) : null, arrayList, dateTime, dateTime2);
    }

    public static final TotalValueChartFacade s(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        DateTime start = b0Var.getStart();
        DateTime end2 = b0Var.getEnd();
        List points = b0Var.getPoints();
        ArrayList arrayList = new ArrayList(w.t(points, 10));
        Iterator it8 = points.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            c0 c0Var = (c0) it8.next();
            DateTime timestamp = c0Var.getTimestamp();
            dj0.d dVarO = mo3.a.o(c0Var.getAmount());
            jo3.a cumulativeNetTopUp = c0Var.getCumulativeNetTopUp();
            if (cumulativeNetTopUp != null) {
                dVarO = mo3.a.o(cumulativeNetTopUp);
            }
            arrayList.add(new TotalValueChartPointFacade(dVarO, dVarO, timestamp));
        }
        jo3.a netTopUp = b0Var.getNetTopUp();
        dj0.d dVarO2 = netTopUp != null ? mo3.a.o(netTopUp) : null;
        jo3.a totalReturn = b0Var.getTotalReturn();
        return new TotalValueChartFacade(dVarO2, totalReturn != null ? mo3.a.o(totalReturn) : null, arrayList, start, end2);
    }

    public static final dfl.q t(n3f.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String type = pVar.getType();
        if (!Intrinsics.f(type, "AMOUNT")) {
            if (!Intrinsics.f(type, "QUANTITY")) {
                throw new IllegalStateException();
            }
            String quantity = pVar.getQuantity();
            if (quantity != null) {
                return new x(new BigDecimal(quantity));
            }
            throw new IllegalStateException("Null quantity for QUANTITY InvestValue");
        }
        Long amount = pVar.getAmount();
        if (amount == null) {
            throw new IllegalStateException("Null amount for AMOUNT Invest Value");
        }
        long jLongValue = amount.longValue();
        xi0.a aVar = xi0.b.Companion;
        String currency = pVar.getCurrency();
        if (currency == null) {
            throw new IllegalStateException("Null currency for AMOUNT InvestValue");
        }
        aVar.getClass();
        return new dfl.a(jLongValue, xi0.a.a(currency));
    }

    public static final dfl.q u(w3f.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (!(rVar instanceof w3f.a)) {
            if (rVar instanceof w3f.w) {
                return new x(new BigDecimal(((w3f.w) rVar).getQuantity()));
            }
            throw new NoWhenBranchMatchedException();
        }
        w3f.a aVar = (w3f.a) rVar;
        long amount = aVar.getAmount();
        xi0.a aVar2 = xi0.b.Companion;
        String currency = aVar.getCurrency();
        aVar2.getClass();
        return new dfl.a(amount, xi0.a.a(currency));
    }

    public static final ArrayList v(List list) {
        do3.c cVar;
        Iterator it8;
        hha.w0 w0Var;
        hha.w0 w0Var2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            tq8.c cVar2 = (tq8.c) it9.next();
            String str = cVar2.f273536a;
            String str2 = cVar2.f273537b;
            boolean z = cVar2.f273538c;
            String str3 = cVar2.d;
            String str4 = cVar2.e;
            String str5 = cVar2.f;
            String str6 = cVar2.f273539g;
            String str7 = cVar2.f273540h;
            do3.c[] cVarArrValues = do3.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i];
                if (a0.z(cVar.name(), str7, true)) {
                    break;
                }
                i++;
            }
            if (cVar == null) {
                cVar = do3.c.PERSONAL;
            }
            do3.c cVar3 = cVar;
            String str8 = cVar2.i;
            if (str8 != null) {
                hha.w0[] w0VarArrValues = hha.w0.values();
                int length2 = w0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        it8 = it9;
                        w0Var2 = null;
                        break;
                    }
                    w0Var2 = w0VarArrValues[i2];
                    it8 = it9;
                    if (a0.z(w0Var2.name(), str8, true)) {
                        break;
                    }
                    i2++;
                    it9 = it8;
                }
                w0Var = w0Var2;
            } else {
                it8 = it9;
                w0Var = null;
            }
            arrayList.add(new sq8.d(str, str2, str3, str4, str5, str6, z, cVar3, w0Var));
            it9 = it8;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    public static final pfj.i w(r2 r2Var) {
        pfj.j jVar;
        int i;
        pfj.g gVar;
        ?? arrayList;
        dej.v0 v0Var;
        pfj.h hVar;
        pfj.j jVar2;
        Intrinsics.checkNotNullParameter(r2Var, "<this>");
        p2 authorization = r2Var.getAuthorization();
        Intrinsics.checkNotNullParameter(authorization, "<this>");
        String authorizationId = authorization.getAuthorizationId();
        String state = authorization.getState();
        EsimPhoneNumberPortingOtpResend esimPhoneNumberPortingOtpResend = null;
        List list = null;
        if (state != null) {
            pfj.j[] jVarArrValues = pfj.j.values();
            int length = jVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jVar2 = null;
                    break;
                }
                jVar2 = jVarArrValues[i2];
                if (a0.z(jVar2.name(), state, true)) {
                    break;
                }
                i2++;
            }
            jVar = jVar2;
        } else {
            jVar = null;
        }
        Long expirationDate = authorization.getExpirationDate();
        Instant instantOfEpochMilli = expirationDate != null ? Instant.ofEpochMilli(expirationDate.longValue()) : null;
        Long nextResendAvailableAt = authorization.getNextResendAvailableAt();
        Instant instantOfEpochMilli2 = nextResendAvailableAt != null ? Instant.ofEpochMilli(nextResendAvailableAt.longValue()) : null;
        int failedAttempts = authorization.getFailedAttempts();
        q2 failure = authorization.getFailure();
        if (failure != null) {
            Intrinsics.checkNotNullParameter(failure, "<this>");
            String reason = failure.getReason();
            pfj.h[] hVarArrValues = pfj.h.values();
            int length2 = hVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i = 0;
                    hVar = null;
                    break;
                }
                pfj.h hVar2 = hVarArrValues[i3];
                i = 0;
                if (a0.z(hVar2.name(), reason, true)) {
                    hVar = hVar2;
                    break;
                }
                i3++;
            }
            gVar = new pfj.g(hVar, failure.getTitle(), failure.getDescription());
        } else {
            i = 0;
            gVar = null;
        }
        pfj.d dVar = new pfj.d(authorizationId, jVar, instantOfEpochMilli, instantOfEpochMilli2, failedAttempts, gVar);
        r1 resend = r2Var.getResend();
        if (resend != null) {
            Intrinsics.checkNotNullParameter(resend, "<this>");
            kfj.e0 waitingText = resend.getWaitingText();
            String text = waitingText.getText();
            List<kfj.r> descriptors = waitingText.getDescriptors();
            ArrayList arrayList2 = new ArrayList();
            for (kfj.r rVar : descriptors) {
                String text2 = rVar.getText();
                if (rVar.getAction() != null) {
                    f0[] f0VarArrValues = f0.values();
                    if (f0VarArrValues.length > 0) {
                        f0 f0Var = f0VarArrValues[i];
                        throw null;
                    }
                }
                String url2 = rVar.getUrl();
                EsimHyperText.Descriptor descriptor = url2 != null ? new EsimHyperText.Descriptor(text2, new EsimDescriptorValue.Link(url2)) : null;
                if (descriptor != null) {
                    arrayList2.add(descriptor);
                }
            }
            List<String> parameters = waitingText.getParameters();
            if (parameters != null) {
                arrayList = new ArrayList();
                for (String str : parameters) {
                    dej.v0[] v0VarArrValues = dej.v0.values();
                    int length3 = v0VarArrValues.length;
                    int i5 = i;
                    while (true) {
                        if (i5 >= length3) {
                            v0Var = null;
                            break;
                        }
                        v0Var = v0VarArrValues[i5];
                        if (a0.z(v0Var.name(), str, true)) {
                            break;
                        }
                        i5++;
                    }
                    if (v0Var != null) {
                        arrayList.add(v0Var);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = zhm.f0.f322471a;
            }
            EsimHyperText esimHyperText = new EsimHyperText(text, arrayList2, arrayList);
            kfj.e0 readyText = resend.getReadyText();
            String text3 = readyText.getText();
            List<kfj.r> descriptors2 = readyText.getDescriptors();
            ArrayList arrayList3 = new ArrayList();
            for (kfj.r rVar2 : descriptors2) {
                String text4 = rVar2.getText();
                if (rVar2.getAction() != null) {
                    f0[] f0VarArrValues2 = f0.values();
                    if (f0VarArrValues2.length > 0) {
                        f0 f0Var2 = f0VarArrValues2[i];
                        throw null;
                    }
                }
                String url3 = rVar2.getUrl();
                EsimHyperText.Descriptor descriptor2 = url3 != null ? new EsimHyperText.Descriptor(text4, new EsimDescriptorValue.Link(url3)) : null;
                if (descriptor2 != null) {
                    arrayList3.add(descriptor2);
                }
            }
            List<String> parameters2 = readyText.getParameters();
            if (parameters2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (String str2 : parameters2) {
                    dej.g0[] g0VarArrValues = dej.g0.values();
                    if (g0VarArrValues.length > 0) {
                        dej.g0 g0Var = g0VarArrValues[i];
                        throw null;
                    }
                }
                list = arrayList4;
            }
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            esimPhoneNumberPortingOtpResend = new EsimPhoneNumberPortingOtpResend(esimHyperText, new EsimHyperText(text3, arrayList3, list));
        }
        return new pfj.i(dVar, esimPhoneNumberPortingOtpResend);
    }

    public static final ue6.a x(hg6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strB = bVar.getLimitName();
        jo3.a aVarD = bVar.getMinAmount();
        dj0.d dVarO = aVarD != null ? mo3.a.o(aVarD) : null;
        jo3.a aVarC = bVar.getMaxAmount();
        dj0.d dVarO2 = aVarC != null ? mo3.a.o(aVarC) : null;
        jo3.a aVarA = bVar.getCurrentAmount();
        return new ue6.a(strB, dVarO, dVarO2, aVarA != null ? mo3.a.o(aVarA) : null);
    }

    public static final yw4.g y(on4.b bVar) {
        yw4.f fVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String feature = bVar.getFeature();
        yw4.f[] fVarArrValues = yw4.f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (a0.z(fVar.name(), feature, true)) {
                break;
            }
            i++;
        }
        if (fVar != null) {
            return new yw4.g(fVar);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unsupported feature: ", bVar.getFeature()));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }

    public static final k20.b z(RateChatExperienceData rateChatExperienceData) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(rateChatExperienceData, "<this>");
        String str = rateChatExperienceData.f51106a;
        String str2 = rateChatExperienceData.f51107b;
        List list = rateChatExperienceData.f51108c;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((ExperienceTagItem) it8.next()).f51104a);
            }
        } else {
            arrayList = null;
        }
        z30.n nVar = rateChatExperienceData.d;
        return new k20.b(str, str2, nVar != null ? nVar.b() : null, arrayList);
    }
}
