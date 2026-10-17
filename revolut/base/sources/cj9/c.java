package cj9;

import android.graphics.drawable.Drawable;
import android.widget.EditText;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import chj.p;
import cjl.s;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductElement;
import com.revolut.feature.statements.api.models.ProductSelection;
import cxk.h;
import dkk.a0;
import efm.c0;
import efm.r;
import fgm.l;
import hl7.g0;
import io.reactivex.rxjava3.core.Observable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import jo0.g;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import lbm.j;
import nel.p0;
import qr0.i;
import r10.w;
import r4k.x;
import tb4.t;
import tfm.g3;
import tfm.h3;
import tfm.i3;
import tfm.j3;
import vkm.q;
import vkm.y;
import yhm.m;
import yhm.n;
import yjl.u;
import zh9.i0;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final r A(r rVar, w wVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (wVar != null) {
            r rVarDoOnSubscribe = rVar.doOnSubscribe(new a0(new dsi.a(wVar, 0), 13));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
            r rVarZ = te0.w.z(rVarDoOnSubscribe, new dsi.a(wVar, 1));
            if (rVarZ != null) {
                return rVarZ;
            }
        }
        return rVar;
    }

    public static final Flow B(Flow flow, w wVar) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        if (wVar == null) {
            return flow;
        }
        Continuation continuation = null;
        return z92.f.s(new dsi.b(wVar, continuation, 1), new y(new dsi.b(wVar, continuation, 0), flow));
    }

    public static sd.d C(r rVar) {
        return new sd.d(rVar, 2);
    }

    public static g3 D(r rVar, int i) {
        return new g3(rVar, i);
    }

    public static h3 E(r rVar, int i, long j2, TimeUnit timeUnit, c0 c0Var) {
        return new h3(rVar, i, j2, timeUnit, c0Var);
    }

    public static j3 F(r rVar, long j2, TimeUnit timeUnit, c0 c0Var) {
        return new j3(rVar, j2, timeUnit, c0Var);
    }

    public static t G(o oVar, c0 c0Var) {
        return new t(oVar, c0Var, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final String H(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return (((Boolean) g.N.getValue()).booleanValue() && kotlin.text.a0.H(url2, "https://assets.revolut.com/mobile/lotties/", false)) ? j6.a.q("https://assets.revolut.com/mobile/lottie_animations_icons/", d0.e0(url2, "https://assets.revolut.com/mobile/lotties/")) : url2;
    }

    public static final void I(gzl.c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Drawable[] compoundDrawables = cVar.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        cVar.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], i != 0 ? ResourcesCompat.getDrawable(cVar.getResources(), i, cVar.getContext().getTheme()) : null, compoundDrawables[3]);
    }

    public static final void J(EditText editText, String value) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(editText.getText().toString(), value)) {
            return;
        }
        try {
            editText.setTextKeepState(value);
        } catch (IndexOutOfBoundsException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            editText.setText(value);
        }
    }

    public static i K(kfm.b bVar) {
        return new i(bVar, 17);
    }

    public static os2.g L(kfm.g gVar) {
        return new os2.g(gVar, 28);
    }

    public static void M(Observable observable, l lVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ngm.f fVar = new ngm.f(linkedBlockingQueue);
        lVar.onSubscribe(fVar);
        observable.subscribe(fVar);
        while (!fVar.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    fVar.dispose();
                    lVar.onError(e);
                    return;
                }
            }
            if (fVar.isDisposed() || objPoll == ngm.f.f215239b || ygm.l.b(lVar, objPoll)) {
                return;
            }
        }
    }

    public static void N(Observable observable, igm.g gVar, igm.g gVar2, igm.a aVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        M(observable, new ngm.i(gVar, gVar2, aVar));
    }

    public static final vkm.f O(Flow flow, long j2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return q.m(new p(j2, (Continuation) null, flow));
    }

    public static final dj0.d P(pz8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        long j2 = eVar.f240912a;
        xi0.a aVar = xi0.b.Companion;
        String str = eVar.f240913b;
        aVar.getClass();
        return new dj0.d(j2, xi0.a.a(str));
    }

    public static final ej0.b Q(ko3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        BigDecimal bigDecimal = new BigDecimal(aVar.getValue(), MathContext.DECIMAL128);
        xi0.a aVar2 = xi0.b.Companion;
        String currency = aVar.getCurrency();
        aVar2.getClass();
        return new ej0.b(bigDecimal, xi0.a.a(currency));
    }

    public static final ArrayList R(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<gge.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (gge.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String str = aVar.f143676a;
            String str2 = aVar.f143677b;
            arrayList.add(new nie.a(aVar.f, aVar.f143678c, aVar.d, aVar.e, str, str2));
        }
        return arrayList;
    }

    public static final kl7.a S(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        String str = g0Var.f153110a;
        String str2 = g0Var.f153111b;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        LocalDate localDate = LocalDate.parse(str2);
        Intrinsics.checkNotNullExpressionValue(localDate, "toDate(...)");
        return new kl7.a(g0Var.f153112c, str, localDate, g0Var.d, g0Var.e);
    }

    public static final p0 T(cxk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = bxk.a.f19714a[bVar.ordinal()];
        if (i == 1) {
            return p0.PRE_MARKET;
        }
        if (i == 2) {
            return p0.OPEN;
        }
        if (i == 3) {
            return p0.AFTER_HOURS;
        }
        if (i == 4) {
            return p0.NONE;
        }
        if (i == 5) {
            return p0.UNDEFINED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final o4l.b U(h hVar) throws Throwable {
        Object objA;
        p0 p0VarT;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String str = hVar.f110005a;
        List<cxk.e> list = hVar.f110006b;
        ArrayList arrayList = new ArrayList();
        for (cxk.e eVar : list) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            try {
                m.Companion companion = m.INSTANCE;
                p0VarT = T(eVar.f110000a);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            if (p0VarT == null) {
                throw new IllegalArgumentException("Trading session schedule with unknown type");
            }
            objA = new o4l.a(p0VarT, eVar.f110001b, eVar.f110002c);
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            o4l.a aVar = (o4l.a) objA;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return new o4l.b(str, arrayList);
    }

    public static final ArrayList V(List list) {
        rdh.b bVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            q7h.c cVar = (q7h.c) it8.next();
            String str = cVar.f242859a;
            rdh.b[] bVarArrValues = rdh.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (kotlin.text.a0.z(bVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            rdh.a aVar = bVar != null ? new rdh.a(bVar, cVar.f242860b) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static final ko3.a W(ej0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String plainString = bVar.f126703a.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new ko3.a(plainString, bVar.f126704b.f306286a);
    }

    public static final ArrayList X(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<nie.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (nie.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String str = aVar.f215681a;
            String str2 = aVar.f215682b;
            arrayList.add(new gge.a(aVar.f, aVar.f215683c, aVar.d, aVar.e, str, str2));
        }
        return arrayList;
    }

    public static final zh9.a Y(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        zh9.h hVar = i0Var.f322286b.f;
        if (hVar == null) {
            return null;
        }
        return new zh9.a(cp5.c.o(hVar), i0Var.f322287c, hVar.f322272j);
    }

    public static final ProductSelection Z(CustomisationParameters customisationParameters) {
        Intrinsics.checkNotNullParameter(customisationParameters, "<this>");
        List<Product> products = customisationParameters.getProducts();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : products) {
            if (((Product) obj2).getElements().isEmpty()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((Product) it8.next()).getType());
        }
        Set setI1 = zhm.d0.i1(arrayList2);
        List<Product> products2 = customisationParameters.getProducts();
        ArrayList<Product> arrayList3 = new ArrayList();
        for (Object obj3 : products2) {
            if (!((Product) obj3).getElements().isEmpty()) {
                arrayList3.add(obj3);
            }
        }
        int iB = q0.b(zhm.w.t(arrayList3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Product product : arrayList3) {
            String type = product.getType();
            List<ProductElement> elements = product.getElements();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(elements, 10));
            Iterator<T> it9 = elements.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((ProductElement) it9.next()).getId());
            }
            linkedHashMap.put(type, zhm.d0.i1(arrayList4));
        }
        return new ProductSelection(setI1, linkedHashMap);
    }

    public static final nkm.l a(Sequence sequence, String str) {
        return nkm.y.I(sequence, new x(new LinkedHashSet(), str, 12));
    }

    public static p56.a a0(o oVar) {
        return new p56.a(oVar, 24);
    }

    public static final boolean b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<c93.m> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (c93.m mVar : list2) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            if (mVar.f22294b != c93.o.VAT) {
                return false;
            }
        }
        return true;
    }

    public static final void c(j jVar, final kj0.d circuitBreakerStateTransitionTracker) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(circuitBreakerStateTransitionTracker, "circuitBreakerStateTransitionTracker");
        nhm.b bVar = ((nhm.l) jVar.d).f215602a;
        bVar.getClass();
        final String str = (String) bVar.b(0, "kind".hashCode(), "kind").F5("Unknown");
        jVar.e.c(kbm.g.class.getName(), new mbm.a() { // from class: kj0.e
            @Override // mbm.a
            public final void a(Object obj2) {
                kbm.g gVar = (kbm.g) obj2;
                String str2 = gVar.f182634a;
                Intrinsics.checkNotNullExpressionValue(str2, "getCircuitBreakerName(...)");
                jbm.b bVar2 = gVar.d;
                jbm.a aVarB = bVar2.b();
                Intrinsics.checkNotNullExpressionValue(aVarB, "getFromState(...)");
                String strQ = cj9.c.q(aVarB);
                jbm.a aVarC = bVar2.c();
                Intrinsics.checkNotNullExpressionValue(aVarC, "getToState(...)");
                String strQ2 = cj9.c.q(aVarC);
                String str3 = str;
                Intrinsics.h(str3);
                c event = new c(str2, strQ, strQ2, str3);
                d dVar = circuitBreakerStateTransitionTracker;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                dVar.f184262a.k(event);
            }
        });
    }

    public static final j23.b d(ArrayList flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        Flow[] flowArr = (Flow[]) flows.toArray(new Flow[0]);
        Flow[] flows2 = (Flow[]) Arrays.copyOf(flowArr, flowArr.length);
        Intrinsics.checkNotNullParameter(flows2, "flows");
        return new j23.b((Flow[]) Arrays.copyOf(flows2, flows2.length), 11);
    }

    public static onh.b e(o oVar) {
        return new onh.b(oVar, 25);
    }

    public static k7i.i f(o oVar, kfm.c cVar) {
        return new k7i.i(cVar, oVar, 28);
    }

    public static final ui0.b g(ui0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ui0.b("com.revolut.business", null);
    }

    public static final hha.a h(hha.d dVar) {
        Object obj2;
        Object next;
        hha.f fVar;
        Integer num;
        hha.f fVar2;
        Integer num2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Iterator it8 = dVar.f152291h.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.g) next).f152306a, jli.e.f175845h)) {
                break;
            }
        }
        hha.g gVar = (hha.g) next;
        Iterator it9 = dVar.f152291h.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((hha.g) next2).f152306a, jli.e.f175842b)) {
                obj2 = next2;
                break;
            }
        }
        hha.g gVar2 = (hha.g) obj2;
        int i = i(gVar);
        int i2 = i(gVar2);
        int iIntValue = 0;
        int iIntValue2 = (gVar == null || (fVar2 = gVar.e) == null || (num2 = fVar2.f152302a) == null) ? 0 : num2.intValue();
        if (gVar2 != null && (fVar = gVar2.e) != null && (num = fVar.f152302a) != null) {
            iIntValue = num.intValue();
        }
        return new hha.a(i, iIntValue2, i2, iIntValue);
    }

    public static final int i(hha.g gVar) {
        hha.f fVar;
        dj0.d dVar;
        if (gVar == null || (fVar = gVar.e) == null || (dVar = fVar.f152304c) == null) {
            return 0;
        }
        return (int) (100.0d - ((dVar.f115082a * 100.0d) / gVar.f152308c.f115082a));
    }

    public static final ui0.b j(ui0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ui0.b("com.revolut.revolut", "104911585");
    }

    public static final ui0.b k(ui0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ui0.b("com.revolut.revolutx", null);
    }

    public static final w60.d l(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = u.f314555a[sVar.ordinal()];
        if (i == 1) {
            return w60.d.f295360a;
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean m(wk5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return oo5.a.f227015a.contains(aVar);
    }

    public static final boolean n(io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.f163149h == io3.i.EXTERNAL;
    }

    public static final boolean o(io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.e == io3.l.CREDIT && !n(dVar);
    }

    public static t1j.b p(o oVar) {
        return new t1j.b(oVar, 2);
    }

    public static final String q(jbm.a aVar) {
        switch (kj0.f.f184265a[aVar.ordinal()]) {
            case 1:
                return "disabled";
            case 2:
                return "metrics_only";
            case 3:
                return "closed";
            case 4:
                return "open";
            case 5:
                return "forced_open";
            case 6:
                return "half_open";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final myh.c r(myh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof myh.b) {
            return new myh.b(((myh.b) cVar).f210508a.l());
        }
        if (!(cVar instanceof myh.a)) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.b bVar = ((myh.a) cVar).f210507a;
        BigInteger amount = bVar.f115079a.negate();
        Intrinsics.checkNotNullExpressionValue(amount, "negate(...)");
        xi0.b currency = bVar.f115080b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new myh.a(new dj0.b(amount, currency));
    }

    public static final String s(String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        String replacement = d0.A0(CoreConstants.COLON_CHAR, missingDelimiterValue).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(replacement, "toLowerCase(...)");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iS = d0.S(missingDelimiterValue, CoreConstants.COLON_CHAR, 0, 6);
        return iS == -1 ? missingDelimiterValue : d0.j0(missingDelimiterValue, 0, iS, replacement).toString();
    }

    public static i3 t(efm.y yVar) {
        return new i3(yVar);
    }

    public static om4.d0 u(efm.y yVar) {
        return new om4.d0(yVar, 22);
    }

    public static pak.h v(efm.y yVar) {
        return new pak.h(yVar, 27);
    }

    public static final k7.f w(LottieColorOverride lottieColorOverride) {
        Intrinsics.checkNotNullParameter(lottieColorOverride, "<this>");
        String[] strArr = (String[]) x(lottieColorOverride).toArray(new String[0]);
        return new k7.f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final List x(LottieColorOverride lottieColorOverride) {
        List listV0;
        Intrinsics.checkNotNullParameter(lottieColorOverride, "<this>");
        List list = lottieColorOverride.f59952a;
        if (list.isEmpty()) {
            listV0 = f0.f322471a;
        } else {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!Intrinsics.f((String) listIterator.previous(), "**")) {
                    listV0 = zhm.d0.V0(list, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listV0 = f0.f322471a;
        }
        List list2 = listV0;
        if (list2.isEmpty()) {
            list2 = lottieColorOverride.f59952a;
        }
        return list2;
    }

    public static final y y(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return rd0.e.e(nim.a.A(flow, new os9.f(21)), h0.f322473a, new otd.a(3, 0, null));
    }

    public static final w z(w wVar, String addition) {
        Intrinsics.checkNotNullParameter(addition, "addition");
        if (wVar == null) {
            return null;
        }
        return new w((List) zhm.d0.F0(addition, (List) wVar.f250865a), (Set) wVar.f250866b);
    }
}
