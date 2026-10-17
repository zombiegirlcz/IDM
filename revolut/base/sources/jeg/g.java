package jeg;

import a26.s;
import aw0.o9;
import bgk.b;
import c84.t;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.AddressSearchListResult;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebResourceException;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$OutputData;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.EsimPlanSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.a;
import efm.d0;
import hx7.q;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jfb.g0;
import jfb.p0;
import jfb.y0;
import jhk.m;
import jid.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import rv3.b;
import vkm.j2;
import vkm.z1;
import wfk.a;
import yg9.o;
import yji.l;
import zg3.r;
import zh9.i0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f173392b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f173391a = i;
        this.f173392b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g0 g0Var;
        int i = this.f173391a;
        int i2 = 1;
        int i3 = 2;
        Continuation continuation = null;
        Object obj3 = this.f173392b;
        switch (i) {
            case 0:
                xag.c updateFilters = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                return xag.c.b(updateFilters, null, null, ((d) ((j2) ((j) obj3).f173397p.f22677a).getValue()).f173389a, 3);
            case 1:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update, null, null, null, 0, new p0((ReverywhereWebResourceException) obj3), 31);
            case 2:
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                s sVar = ((com.revolut.feature.retail.reverywhere.impl.web_app.d) obj3).f82943y;
                if (sVar != null) {
                    sVar.invoke(Boolean.valueOf(result instanceof r7a.h));
                }
                return Unit.f186387a;
            case 3:
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a((com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2, null, (g0) obj3, null, 0, null, 123);
            case 4:
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a((com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2, (cjl.c) obj3, null, null, 0, null, ISO781611.SMT_TAG);
            case 5:
                RevolutPayOrderSummaryContract$OutputData outputData = (RevolutPayOrderSummaryContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                z1 z1Var = ((y0) obj3).f173850q;
                if (outputData instanceof RevolutPayOrderSummaryContract$OutputData.Completed) {
                    g0Var = g0.SUCCESS;
                } else if (outputData instanceof RevolutPayOrderSummaryContract$OutputData.Cancelled) {
                    g0Var = g0.CANCELLED;
                } else {
                    if (!(outputData instanceof RevolutPayOrderSummaryContract$OutputData.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g0Var = g0.FAILURE;
                }
                z1Var.k(g0Var);
                return Unit.f186387a;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) obj3;
                rv3.b output = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof b.C1428b) {
                    int i5 = jli.h.f175850a;
                } else if (output instanceof b.a) {
                    t.J2(cVar, false, null, null, 7);
                } else {
                    if (!(output instanceof rv3.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = jg4.e.f173915a[((rv3.c) output).f257692a.ordinal()];
                    if (i6 == 1 || i6 == 2) {
                        int i21 = jli.h.f175850a;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar.P2();
                    }
                }
                return Unit.f186387a;
            case 7:
                g gVar = (g) obj3;
                dm1.d outputData2 = (dm1.d) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof dm1.c) {
                    gVar.invoke(((dm1.c) outputData2).f115817a);
                } else if (!(outputData2 instanceof dm1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 8:
                Biller biller = (Biller) obj2;
                Intrinsics.checkNotNullParameter(biller, "biller");
                ((t8e.c) obj3).invoke(new jg9.e(biller));
                return Unit.f186387a;
            case 9:
                og9.f outputData3 = (og9.f) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                sg9.b value = outputData3.f225060a;
                Intrinsics.checkNotNullParameter(value, "value");
                ((o) obj3).f313591b.N2(value.f262634b.f61366a, value.f262633a);
                Unit unit = Unit.f186387a;
                return Unit.f186387a;
            case 10:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b) obj3;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.a result2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, a.C0620a.f101317a)) {
                    bVar.C2(new a.C0614a(false));
                } else {
                    if (!(result2 instanceof elj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    elj.i iVar = (elj.i) result2;
                    bVar.C2(new jgj.c(iVar.f127501a, iVar.f127502b));
                }
                return Unit.f186387a;
            case 11:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                r rVar = ((jh3.b) obj3).f174140a;
                String str = rVar.f322070a;
                ListSubheaderDelegate.Model modelA = hh3.b.a(new TextClause(rVar.f322070a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.q("TRANSACTIONS_LOADING_TITLE_LIST_ID_", str));
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    int iNextInt = it9.nextInt();
                    arrayList.add(nb0.b(pb0.Companion, "TRANSACTIONS_LOADING_ITEM_LIST_ID_" + str + iNextInt, true, 0, false, 28));
                }
                return yp0.b.g(arrayList, modelA, null, 0, 0, 126);
            case 12:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((jh6.g) obj3).z2();
                return Boolean.TRUE;
            case 13:
                return jh9.f.a((jh9.f) obj2, null, (jh9.g) obj3, null, 11);
            case 14:
                ProductContext productContext = (ProductContext) obj3;
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list = accounts;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(new ohe.a(productContext, (ProductAccount) it11.next(), false));
                }
                return arrayList2;
            case 15:
                m mVar = (m) obj3;
                bgk.b output2 = (bgk.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, b.C0097b.f15210a) || Intrinsics.f(output2, b.c.f15211a)) {
                    mVar.invoke();
                } else if (!Intrinsics.f(output2, b.a.f15209a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 16:
                m mVar2 = (m) obj3;
                a.AbstractC1639a abstractC1639a = (a.AbstractC1639a) obj2;
                if (Intrinsics.f(abstractC1639a, a.AbstractC1639a.b.f297155a)) {
                    mVar2.invoke();
                } else if (!Intrinsics.f(abstractC1639a, a.AbstractC1639a.C1640a.f297154a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar2 = (com.revolut.feature.address.common.impl.flow.screen.find.b) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                bVar2.H2(bVar2.u, new jhi.a(4));
                return Boolean.TRUE;
            case 18:
                AddressSearchListResult addressSearchListResult = (AddressSearchListResult) obj3;
                return ji1.e.a((ji1.e) obj2, null, new ji1.g(zi0.c.P(addressSearchListResult, false, null, 3), addressSearchListResult.getSessionId()), null, 5);
            case 19:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a) obj3;
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                l.a1(aVar, aVar.X1(aVar.f72497r.c(e)), null, null, new ji6.e(aVar, continuation, i2), 3);
                return Boolean.TRUE;
            case 20:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new hc7.a((jid.d) obj3, pagedData, 8), i3);
            case 21:
                mid.l lVar = (mid.l) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list2 = (List) data.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                return new lk0.e(list2, lVar, data.getLoading(), null, data.getError(), 8);
            case 22:
                v vVar = (v) obj3;
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                return optional.d() ? d0.m(optional.c()) : ((z39.b) vVar.f174457b).f319221b.e().t(5000L, TimeUnit.MILLISECONDS);
            case 23:
                int iIntValue = ((Integer) obj2).intValue();
                KProperty[] kPropertyArr = EsimPlanSelectionScreen.f101016d0;
                ((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) ((EsimPlanSelectionScreen) obj3).e3()).O2(iIntValue);
                return Unit.f186387a;
            case 24:
                dil.a params = (dil.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (tel.d) q.p(((jil.a) obj3).f174609b, params);
            case 25:
                jj3.e eVar = (jj3.e) obj3;
                jj3.c params2 = (jj3.c) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (hj3.a) eVar.f174633b.get(eVar.a(params2));
            case 26:
                i0 it12 = (i0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ((ti9.g) ((jj9.m) obj3).f174796p).getClass();
                return zi0.c.i(LayeredImage.INSTANCE.i(wh9.a.f297445a, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal));
            case 27:
                return jk4.g.a((jk4.g) obj2, null, null, ((g1j.b) obj3).f139686a.f170617a, 15);
            case 28:
                jk7.g updateState = (jk7.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return jk7.g.a(updateState, ((jk7.k) obj3).f175122t.a());
            default:
                kih.c update2 = (kih.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return kih.c.a(update2, zi0.c.P(((jkh.l) obj3).o.f95898a, false, null, 3), null, false, 6);
        }
    }

    public /* synthetic */ g(jh3.d dVar, jh3.b bVar) {
        this.f173391a = 11;
        this.f173392b = bVar;
    }
}
