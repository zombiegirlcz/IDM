package com.google.crypto.tink.shaded.protobuf;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefundBreakdown;
import com.revolut.feature_travel_hotels_models.booking.details.PointsMonetaryValue;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.flow.ReusableFlowStep;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import grl.r2;
import io.reactivex.exceptions.CompositeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import tof.a3;
import tof.o3;
import yhm.m;

/* JADX INFO: loaded from: classes17.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49416a;

    public /* synthetic */ t1(int i) {
        this.f49416a = i;
    }

    public static final Data A(Collection dataIterable) {
        Intrinsics.checkNotNullParameter(dataIterable, "dataIterable");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = dataIterable.iterator();
        while (it8.hasNext()) {
            Object content = ((Data) it8.next()).getContent();
            if (content != null) {
                arrayList.add(content);
            }
        }
        if (arrayList.size() != dataIterable.size()) {
            arrayList = null;
        }
        Collection collection = dataIterable;
        return new Data(arrayList, m(collection), n(collection));
    }

    public static final Data B(List dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = dataList.iterator();
        while (it8.hasNext()) {
            List list = (List) ((Data) it8.next()).getContent();
            if (list != null) {
                arrayList.add(list);
            }
        }
        if (arrayList.size() != dataList.size()) {
            arrayList = null;
        }
        List list2 = dataList;
        return new Data(arrayList != null ? zhm.w.u(arrayList) : null, m(list2), n(list2));
    }

    public static final dj0.d C(dj0.d dVar, n9l.a exchangeRate) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        return pyd.c.K(dVar, exchangeRate.f213663c, exchangeRate.f213662b);
    }

    public static final double D(dj0.d dVar) {
        return Math.abs(dVar.f115082a) / cp5.d.k(dVar.f115083b);
    }

    public static final Flow E(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        skm.p0 p0Var = skm.p0.f264001a;
        return vkm.q.C(flow, elm.f.f127540b);
    }

    public static final Flow F(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        skm.p0 p0Var = skm.p0.f264001a;
        return vkm.q.C(flow, zkm.o.f323119a.e);
    }

    public static final String G(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter("pay.revolut.com", "oldPaymentBaseUrl");
        Intrinsics.checkNotNullParameter("revolut.me", "newPaymentBaseUrl");
        Regex regex = new Regex("^(http|https)://(pay.revolut.com|revolut.me)/profile");
        Regex regex2 = new Regex("^(http|https)://revolut.me(?=/.+)(?!/.+/.+)");
        Regex regex3 = new Regex("^(http|https)://pay.revolut.com(?=/.+)(?!/.+/.+)");
        Regex regex4 = new Regex("^(http|https)://revolut.me/p");
        Regex regex5 = new Regex("^(http|https)://revolut.me/g/([A-za-z0-9]+)");
        return new Regex("^(http|https)://revolut.me/splitbill/([a-zA-Z0-9]+)").h(new Regex("^(http|https)://revolut.me/([a-zA-Z0-9]+)/pocket/([a-zA-Z0-9]+)").h(regex5.h(regex4.replace(regex3.replace(regex2.replace(regex.replace(url2, "revolut://app/payment-profiles"), "revolut://app/payment-profiles"), "revolut://app/accept-payment-link"), "revolut://app/accept-payment-link"), s06.r.f), s06.s.f), s06.t.f);
    }

    public static final void H(CancellableContinuation cancellableContinuation, Object obj2) {
        Intrinsics.checkNotNullParameter(cancellableContinuation, "<this>");
        if (cancellableContinuation.d()) {
            m.Companion aVar = yhm.m.INSTANCE;
            cancellableContinuation.resumeWith(obj2);
        }
    }

    public static final void I(skm.l lVar, Throwable exception) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (lVar.d()) {
            m.Companion aVar = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(exception));
        }
    }

    public static final v0f.p J(Flow flow, long j2) {
        if (j2 > 0) {
            return new v0f.p(new p8k.g(j2, null, flow));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    public static final ArrayList K(ResultInternal resultInternal, nq.w originalScanType) {
        List list;
        List list2;
        List list3;
        Intrinsics.checkNotNullParameter(resultInternal, "<this>");
        Intrinsics.checkNotNullParameter(originalScanType, "originalScanType");
        iw.a aVar = resultInternal.f50736a;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = (aVar == null || (list3 = (List) aVar.f168885a.f186386b) == null) ? null : Y(list3, "z", originalScanType);
        iw.a aVar2 = resultInternal.f50737b;
        ArrayList arrayListY3 = (aVar2 == null || (list2 = (List) aVar2.f168885a.f186386b) == null) ? null : Y(list2, "tc", originalScanType);
        iw.a aVar3 = resultInternal.f50738c;
        if (aVar3 != null && (list = (List) aVar3.f168885a.f186386b) != null) {
            arrayListY = Y(list, "e", originalScanType);
        }
        List[] elements = {arrayListY2, arrayListY3, arrayListY};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.w.u(kotlin.collections.d.L(elements));
    }

    public static final nq.n L(gv.k kVar, nq.v metadata) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new nq.n(metadata, kVar.f147016a);
    }

    public static final nq.r M(gv.l lVar, nq.l0 metadata) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new nq.r(metadata, lVar.f147019a);
    }

    public static final CreditApplicationCommonContext N(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration) {
        Intrinsics.checkNotNullParameter(creditApplicationPluginFlowContract$Configuration, "<this>");
        r2 r2Var = creditApplicationPluginFlowContract$Configuration.f66893c;
        gt3.f fVar = creditApplicationPluginFlowContract$Configuration.e;
        ks3.b bVar = creditApplicationPluginFlowContract$Configuration.f66894g;
        ks3.c cVar = creditApplicationPluginFlowContract$Configuration.f66895h;
        String str = creditApplicationPluginFlowContract$Configuration.f66892b;
        boolean z = creditApplicationPluginFlowContract$Configuration.i;
        return zr3.b.a(creditApplicationPluginFlowContract$Configuration.f, r2Var, str, creditApplicationPluginFlowContract$Configuration.d, fVar, bVar, cVar, creditApplicationPluginFlowContract$Configuration.f66899n, z);
    }

    public static final CreditApplicationCommonContext O(PluginFlowContract$Input pluginFlowContract$Input) {
        Intrinsics.checkNotNullParameter(pluginFlowContract$Input, "<this>");
        return N(pluginFlowContract$Input.getF68415b());
    }

    public static final ArrayList P(CryptoCommodityPositions cryptoCommodityPositions, String baseCurrency) {
        Intrinsics.checkNotNullParameter(cryptoCommodityPositions, "<this>");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        ArrayList<CryptoCommodityPosition> arrayList = cryptoCommodityPositions.f71383b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (CryptoCommodityPosition cryptoCommodityPosition : arrayList) {
            arrayList2.add(new cu5.a(cryptoCommodityPositions.f71382a.a(), cryptoCommodityPosition.f71379a.f306286a, baseCurrency, hx7.a.A(cryptoCommodityPosition.f71380b), cryptoCommodityPosition.f71381c, cp5.c.M(cryptoCommodityPosition.d)));
        }
        return arrayList2;
    }

    public static final CryptoCommodityPositions Q(gu5.a aVar, it5.e type) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<gu5.b> listA = aVar.getPositions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        for (gu5.b bVar : listA) {
            xi0.a aVar2 = xi0.b.Companion;
            String strB = bVar.getCurrency();
            aVar2.getClass();
            arrayList.add(new CryptoCommodityPosition(xi0.a.a(strB), mo3.a.o(bVar.getInvestment()), new DateTime(bVar.getLastTransactionDate()), cj9.c.Q(bVar.getAveragePrice())));
        }
        return new CryptoCommodityPositions(type, arrayList);
    }

    public static final CryptoCommodityPositions R(List list, it5.e type) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<cu5.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (cu5.a aVar : list2) {
            xi0.a aVar2 = xi0.b.Companion;
            String str = aVar.f108812b;
            aVar2.getClass();
            arrayList.add(new CryptoCommodityPosition(xi0.a.a(str), hx7.a.v(aVar.d), aVar.e, cp5.c.I(aVar.f)));
        }
        return new CryptoCommodityPositions(type, arrayList);
    }

    public static final u91.u S(k91.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String strB = pVar.getCreatedDate();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate localDate = LocalDate.parse(strB, dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(pVar.getEstimatedCompletionDate(), dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        LocalDate localDate3 = LocalDate.parse(pVar.getEstimatedClosureDate(), dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
        return new u91.u(localDate, localDate2, localDate3, pVar.getCanAddPayments());
    }

    public static final yld.c T(kmd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = nmd.a.f217274b[aVar.ordinal()];
        if (i == 1) {
            return yld.c.BAR_CHART;
        }
        if (i == 2) {
            return yld.c.LINE_CHART;
        }
        if (i == 3) {
            return yld.c.PIE_CHART;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final nq.l U(gv.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        vw.m mVar = lVar.i;
        if (mVar != null) {
            return new nq.l(mVar, null, null);
        }
        return null;
    }

    public static final f8l.e V(k4l.r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int i = wul.i.f300237b[r0Var.ordinal()];
        if (i == 1) {
            return f8l.e.MARKET;
        }
        if (i == 2) {
            return f8l.e.LIMIT;
        }
        if (i == 3) {
            return f8l.e.STOP;
        }
        if (i == 4) {
            return f8l.e.RECURRING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final k4l.r0 W(f8l.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = wul.i.f300236a[eVar.ordinal()];
        if (i == 1) {
            return k4l.r0.MARKET;
        }
        if (i == 2) {
            return k4l.r0.LIMIT;
        }
        if (i == 3) {
            return k4l.r0.STOP;
        }
        if (i == 4) {
            return k4l.r0.RECURRING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String X(g3b.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(aVar.f140246a, "_", aVar.f140247b);
    }

    public static final ArrayList Y(List list, String str, nq.w wVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(new nq.p(p.a.o(str, i2), wVar, (byte[]) obj2, null, null));
            i = i2;
        }
        return arrayList;
    }

    public static final nq.s Z(gv.k kVar, boolean z) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        xv.u uVar = kVar.f147018c;
        if (uVar != null) {
            if (!z) {
                uVar = null;
            }
            if (uVar != null) {
                return new nq.s(uVar, null, null);
            }
        }
        return null;
    }

    public static final long a(dj0.d dVar) {
        return (dVar.k() || dVar.f(dj0.d.e)) ? 1L : -1L;
    }

    public static final dj0.d a0(a3 a3Var, xi0.b desiredCurrency) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(desiredCurrency, "desiredCurrency");
        boolean z = k71.k.S0(a3Var) || k71.k.G0(a3Var) || k71.k.J0(a3Var);
        dj0.d dVar2 = a3Var.f272599l;
        dj0.d dVar3 = a3Var.k;
        dj0.d dVarB = z ? dVar3 : k71.k.b(a3Var);
        if (!Intrinsics.f(dVarB.f115083b, desiredCurrency)) {
            o3 o3Var = a3Var.J;
            dj0.d dVarL = null;
            if (o3Var != null && (dVar = o3Var.f272965a) != null && Intrinsics.f(dVar.f115083b, desiredCurrency)) {
                dVarL = dVar;
            }
            if (dVarL != null && !dVar3.k()) {
                double D = D(dVarL) / D(dVar3);
                int iSignum = Long.signum(dVarL.f115082a);
                int iSignum2 = Long.signum(dVar3.f115082a);
                if (iSignum != 0 && iSignum != iSignum2) {
                    dVarL = dVarL.l();
                }
                return (dVar2.k() || k71.k.S0(a3Var) || k71.k.G0(a3Var) || k71.k.J0(a3Var)) ? dVarL : pyd.c.H(dVarL, pyd.c.K(dVar2, D, desiredCurrency));
            }
        }
        return dVarB;
    }

    public static final boolean b(Map map, Iterable features) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(features, "features");
        ArrayList arrayList = new ArrayList(zhm.w.t(features, 10));
        Iterator it8 = features.iterator();
        while (it8.hasNext()) {
            ybl.p pVar = (ybl.p) it8.next();
            arrayList.add(new Pair(pVar, Boolean.valueOf(Intrinsics.f(map.get(pVar), Boolean.TRUE))));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            if (((Boolean) ((Pair) it9.next()).f186386b).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static int b0(byte[] bArr, int i, long j2, int i2) {
        if (i2 == 0) {
            t1 t1Var = v1.f49419a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return v1.c(i, s1.g(bArr, j2));
        }
        if (i2 == 2) {
            return v1.d(i, s1.g(bArr, j2), s1.g(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    public static final boolean c(lbf.k feature, lbf.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return mVar.d.contains(feature);
    }

    public static final Data c0(Data data, Data data2) {
        return (org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "<this>", "fallbackSource") != null || data2.getContent() == null) ? data : Data.copy$default(data, data2.getContent(), null, false, 6, null);
    }

    public static final Flow d(Flow flow, long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? flow : new v0f.p(new ahe.y0(flow, (Continuation) null, new nxc.a(j2, 16)));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final Data d0(Data data, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return (data.getContent() != null || obj2 == null) ? data : Data.copy$default(data, obj2, null, false, 6, null);
    }

    public static final v0f.p e(Flow flow, Function1 function1) {
        return new v0f.p(new ahe.y0(flow, (Continuation) null, function1));
    }

    public static final vkm.v1 e0(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new vkm.v1(new oji.c(0, null, flow));
    }

    public static final Flow f(Flow flow, long j2) {
        return d(flow, skm.k0.e(j2));
    }

    public static final m71.a f0(List list, Object obj2, dj0.d itemMoney, xi0.b baseCurrency) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(itemMoney, "itemMoney");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, itemMoney.f115083b) && Intrinsics.f(aVar.f213662b, baseCurrency)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        return new m71.a(aVar2 != null ? new dj0.d(pyd.c.J(itemMoney, aVar2.f213663c, aVar2.f213662b), baseCurrency) : null, obj2);
    }

    public static final cbh.f g(Flow flow, long j2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return h(flow, j2, new oh3.a(21));
    }

    public static final cbh.f h(Flow flow, long j2, Function1 emitImmediatelyWhen) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(emitImmediatelyWhen, "emitImmediatelyWhen");
        return new cbh.f(e(new vkm.t0(flow, 2), new e4k.m0(emitImmediatelyWhen, j2, 10)), 3);
    }

    public static final KClass k(mm0.k kVar, mm0.o oVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (!(kVar instanceof mm0.l)) {
            if (kVar instanceof mm0.j) {
                return ((mm0.j) kVar).f207110a;
            }
            if (!(kVar instanceof mm0.h) || oVar == null) {
                return null;
            }
            return kotlin.jvm.internal.o0.f186429a.b(oVar.getClass());
        }
        List list = ((mm0.l) kVar).f207113a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof mm0.j) {
                arrayList.add(obj2);
            }
        }
        mm0.j jVar = (mm0.j) zhm.d0.d0(arrayList);
        if (jVar != null) {
            return jVar.f207110a;
        }
        return null;
    }

    public static final ControllerKey l(ReusableFlowStep reusableFlowStep, ControllerKey flowKey) {
        Intrinsics.checkNotNullParameter(reusableFlowStep, "<this>");
        Intrinsics.checkNotNullParameter(flowKey, "flowKey");
        return new ControllerKey(com.google.android.gms.internal.mlkit_vision_face.a.o(flowKey.f98378a, "_", reusableFlowStep.getKey()));
    }

    public static final CompositeException m(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            Throwable error = ((Data) it8.next()).getError();
            if (error != null) {
                arrayList.add(error);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Throwable[] thArr = (Throwable[]) arrayList.toArray(new Throwable[0]);
        return new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
    }

    public static final boolean n(Iterable iterable) {
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(Boolean.valueOf(((Data) it8.next()).getLoading()));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            if (((Boolean) it9.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final RevPoints o(CancellationRefund cancellationRefund) {
        RevPoints revPoints;
        RevPoints revPoints2;
        PointsMonetaryValue pointsMonetaryValue;
        RevPoints revPoints3;
        Intrinsics.checkNotNullParameter(cancellationRefund, "<this>");
        CancellationRefundBreakdown cancellationRefundBreakdown = cancellationRefund.f97877b;
        PointsMonetaryValue pointsMonetaryValue2 = cancellationRefundBreakdown.e;
        if (pointsMonetaryValue2 == null || (revPoints = pointsMonetaryValue2.f97885a) == null || (revPoints2 = cancellationRefundBreakdown.f97882h) == null || (pointsMonetaryValue = cancellationRefundBreakdown.f97881g) == null || (revPoints3 = pointsMonetaryValue.f97885a) == null) {
            return null;
        }
        return revPoints.j(revPoints2).j(revPoints3);
    }

    public static final boolean p(k71.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.f181792a.f115082a == 0;
    }

    public static final boolean q(prf.g gVar) {
        if (gVar != null) {
            wi0.b bVar = gVar.f239011a;
            wi0.a aVar = wi0.b.Companion;
            aVar.getClass();
            wi0.b bVar2 = wi0.b.f297770q3;
            if (Intrinsics.f(bVar, bVar2)) {
                wi0.b bVar3 = gVar.f239012b;
                aVar.getClass();
                if (!Intrinsics.f(bVar3, bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static final ArrayList s(List list) {
        koi.j bVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iw0.k kVar = (iw0.k) list.get(i);
            if (kVar instanceof iw0.j) {
                iw0.j jVar = (iw0.j) kVar;
                bVar = new qw0.d(jVar.f168895a, jVar.f168896b, a0.d.n("line_", i));
            } else {
                if (!(kVar instanceof iw0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new qw0.b(((iw0.l) kVar).f168897a, a0.d.n("header_", i));
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public static final Data t(Data data, Data data2) {
        Object objM = org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "a", "b");
        Object content = data2.getContent();
        return new Data((objM == null || content == null) ? null : new Pair(objM, content), m(kotlin.collections.d.v0(new Data[]{data, data2})), n(kotlin.collections.d.v0(new Data[]{data, data2})));
    }

    public static final Data u(Data a7, Data b4, Data c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        return new Data((content == null || content2 == null || content3 == null) ? null : new yhm.r(content, content2, content3), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2})));
    }

    public static final Data v(Data a7, Data b4, Data c2, Data d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        Object content4 = d.getContent();
        return new Data((content == null || content2 == null || content3 == null || content4 == null) ? null : new vf0.h(content, content2, content3, content4), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d})));
    }

    public static final Data w(Data a7, Data b4, Data c2, Data d, Data e) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        Object content4 = d.getContent();
        Object content5 = e.getContent();
        return new Data((content == null || content2 == null || content3 == null || content4 == null || content5 == null) ? null : new vf0.k(content, content2, content3, content4, content5), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e})));
    }

    public static final Data x(Data a7, Data b4, Data c2, Data d, Data e, Data f) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        Object content4 = d.getContent();
        Object content5 = e.getContent();
        Object content6 = f.getContent();
        return new Data((content == null || content2 == null || content3 == null || content4 == null || content5 == null || content6 == null) ? null : new vf0.y(content, content2, content3, content4, content5, content6), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f})));
    }

    public static final Data y(Data a7, Data b4, Data c2, Data d, Data e, Data f, Data g3) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        Object content4 = d.getContent();
        Object content5 = e.getContent();
        Object content6 = f.getContent();
        Object content7 = g3.getContent();
        return new Data((content == null || content2 == null || content3 == null || content4 == null || content5 == null || content6 == null || content7 == null) ? null : new vf0.x(content, content2, content3, content4, content5, content6, content7), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f, g3})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f, g3})));
    }

    public static final Data z(Data a7, Data b4, Data c2, Data d, Data e, Data f, Data g3, Data h2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Object content = a7.getContent();
        Object content2 = b4.getContent();
        Object content3 = c2.getContent();
        Object content4 = d.getContent();
        Object content5 = e.getContent();
        Object content6 = f.getContent();
        Object content7 = g3.getContent();
        Object content8 = h2.getContent();
        return new Data((content == null || content2 == null || content3 == null || content4 == null || content5 == null || content6 == null || content7 == null || content8 == null) ? null : new vf0.g(content, content2, content3, content4, content5, content6, content7, content8), m(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f, g3, h2})), n(kotlin.collections.d.v0(new Data[]{a7, b4, c2, d, e, f, g3, h2})));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t1.i(byte[], int, int):java.lang.String");
    }

    public final int j(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        char cCharAt;
        long j2;
        char c2;
        long j3;
        long j5;
        char c3;
        int i6;
        char cCharAt2;
        switch (this.f49416a) {
            case 0:
                int length = str.length();
                int i21 = i2 + i;
                int i22 = 0;
                while (i22 < length && (i5 = i22 + i) < i21 && (cCharAt = str.charAt(i22)) < 128) {
                    bArr[i5] = (byte) cCharAt;
                    i22++;
                }
                if (i22 == length) {
                    return i + length;
                }
                int i32 = i + i22;
                while (i22 < length) {
                    char cCharAt3 = str.charAt(i22);
                    if (cCharAt3 < 128 && i32 < i21) {
                        bArr[i32] = (byte) cCharAt3;
                        i32++;
                    } else if (cCharAt3 < 2048 && i32 <= i21 - 2) {
                        int i33 = i32 + 1;
                        bArr[i32] = (byte) ((cCharAt3 >>> 6) | 960);
                        i32 += 2;
                        bArr[i33] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i32 > i21 - 3) {
                            if (i32 > i21 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i22 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new u1(i22, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i32);
                            }
                            int i43 = i22 + 1;
                            if (i43 != str.length()) {
                                char cCharAt4 = str.charAt(i43);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i32] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i32 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i59 = i32 + 3;
                                    bArr[i32 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i32 += 4;
                                    bArr[i59] = (byte) ((codePoint & 63) | 128);
                                    i22 = i43;
                                } else {
                                    i22 = i43;
                                }
                            }
                            throw new u1(i22 - 1, length);
                        }
                        bArr[i32] = (byte) ((cCharAt3 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                        int i66 = i32 + 2;
                        bArr[i32 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i32 += 3;
                        bArr[i66] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i22++;
                }
                return i32;
            default:
                long j16 = i;
                long j22 = ((long) i2) + j16;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i74 = 0;
                while (true) {
                    j2 = 1;
                    c2 = 128;
                    if (i74 < length2 && (cCharAt2 = str.charAt(i74)) < 128) {
                        s1.k(bArr, j16, (byte) cCharAt2);
                        i74++;
                        j16 = 1 + j16;
                    }
                }
                if (i74 == length2) {
                    return (int) j16;
                }
                while (i74 < length2) {
                    char cCharAt5 = str.charAt(i74);
                    if (cCharAt5 < c2 && j16 < j22) {
                        s1.k(bArr, j16, (byte) cCharAt5);
                        c3 = c2;
                        j3 = j2;
                        j5 = j16 + j2;
                    } else if (cCharAt5 >= 2048 || j16 > j22 - 2) {
                        j3 = j2;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j16 > j22 - 3) {
                            long j42 = j16;
                            if (j42 > j22 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i74 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                    throw new u1(i74, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j42);
                            }
                            int i92 = i74 + 1;
                            if (i92 != length2) {
                                char cCharAt6 = str.charAt(i92);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    s1.k(bArr, j42, (byte) ((codePoint2 >>> 18) | 240));
                                    c3 = 128;
                                    s1.k(bArr, j42 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    s1.k(bArr, j42 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    s1.k(bArr, j42 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j5 = j42 + 4;
                                    i74 = i92;
                                } else {
                                    i74 = i92;
                                }
                            }
                            throw new u1(i74 - 1, length2);
                        }
                        s1.k(bArr, j16, (byte) ((cCharAt5 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH));
                        long j46 = j16;
                        s1.k(bArr, j16 + j3, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j5 = j46 + 3;
                        s1.k(bArr, j46 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c3 = 128;
                    } else {
                        j3 = j2;
                        s1.k(bArr, j16, (byte) ((cCharAt5 >>> 6) | 960));
                        s1.k(bArr, j16 + j3, (byte) ((cCharAt5 & '?') | c2));
                        j5 = j16 + 2;
                        c3 = c2;
                    }
                    i74++;
                    c2 = c3;
                    j16 = j5;
                    j2 = j3;
                }
                return (int) j16;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fc, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t1.r(byte[], int, int):boolean");
    }
}
