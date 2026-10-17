package vdl;

import androidx.collection.LruCache;
import com.revolut.shared.feature.wealth.domain.impl.data.network.InstrumentTickerService;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements xbl.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentTickerService f288063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcl.a0 f288064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcl.d0 f288065c;
    public final w4l.f d;
    public final qe0.s e;
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ne0.d f288066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f288067h;
    public final qe0.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LruCache f288068j;
    public final w4l.f k;

    public y(InstrumentTickerService instrumentTickerService, dcl.a0 instrumentTickersDao, dcl.d0 instrumentsDao, w4l.f instrumentsDod, qe0.s instrumentForceReloadStrategy, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(instrumentTickerService, "instrumentTickerService");
        Intrinsics.checkNotNullParameter(instrumentTickersDao, "instrumentTickersDao");
        Intrinsics.checkNotNullParameter(instrumentsDao, "instrumentsDao");
        Intrinsics.checkNotNullParameter(instrumentsDod, "instrumentsDod");
        Intrinsics.checkNotNullParameter(instrumentForceReloadStrategy, "instrumentForceReloadStrategy");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f288063a = instrumentTickerService;
        this.f288064b = instrumentTickersDao;
        this.f288065c = instrumentsDao;
        this.d = instrumentsDod;
        this.e = instrumentForceReloadStrategy;
        this.f = appCoroutineScope;
        this.f288066g = new ne0.d();
        Continuation continuation = null;
        final int i = 0;
        x4l.c cVar = new x4l.c(new th6.p(this, continuation, 17), new Function1(this) { // from class: vdl.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f288043b;

            {
                this.f288043b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Set refs = (Set) obj2;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = refs.iterator();
                        while (true) {
                            ArrayList arrayList2 = null;
                            if (!it8.hasNext()) {
                                Map mapT = zhm.r0.t(arrayList);
                                if (mapT.keySet().containsAll(refs)) {
                                    Collection collectionValues = mapT.values();
                                    arrayList2 = new ArrayList();
                                    Iterator it9 = collectionValues.iterator();
                                    while (it9.hasNext()) {
                                        InstrumentTicker instrumentTicker = (InstrumentTicker) ((od0.i) it9.next()).f224257a;
                                        if (instrumentTicker != null) {
                                            arrayList2.add(instrumentTicker);
                                        }
                                    }
                                }
                                return arrayList2;
                            }
                            String str = (String) it8.next();
                            od0.i iVar = (od0.i) this.f288043b.f288066g.get(str);
                            Pair pair = iVar != null ? new Pair(str, iVar) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        break;
                    default:
                        x params = (x) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (nel.n) this.f288043b.f288068j.get(params);
                }
            }
        }, new Function2(this) { // from class: vdl.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f288048b;

            {
                this.f288048b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ne0.d dVar = this.f288048b.f288066g;
                        Set refs = (Set) obj2;
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        List<InstrumentTicker> list = rates;
                        for (InstrumentTicker instrumentTicker : list) {
                            String str = instrumentTicker.f105112b;
                            od0.i.Companion.getClass();
                            dVar.f(str, od0.h.a(instrumentTicker));
                        }
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((InstrumentTicker) it8.next()).f105112b);
                        }
                        for (String str2 : zhm.a1.k(refs, zhm.d0.i1(arrayList))) {
                            od0.i.Companion.getClass();
                            dVar.f(str2, od0.i.f224256b);
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x params = (x) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0 d0VarFirstOrError = m70.a.g(this.f288048b.a(), null, new v78.d(25), 1).firstOrError();
                        s sVar = new s(3, new a(params, 5));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        x params2 = (x) obj2;
                        nel.n instrument = (nel.n) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        this.f288048b.f288068j.put(params2, instrument);
                        return Unit.f186387a;
                }
            }
        }, new v44.e(this, continuation, 23), new ska.c(this, continuation, 25));
        this.f288067h = cVar;
        this.i = new qe0.o(cVar, appCoroutineScope);
        this.f288068j = new LruCache(50);
        final int i2 = 1;
        Function2 function2 = new Function2(this) { // from class: vdl.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f288048b;

            {
                this.f288048b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ne0.d dVar = this.f288048b.f288066g;
                        Set refs = (Set) obj2;
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        List<InstrumentTicker> list = rates;
                        for (InstrumentTicker instrumentTicker : list) {
                            String str = instrumentTicker.f105112b;
                            od0.i.Companion.getClass();
                            dVar.f(str, od0.h.a(instrumentTicker));
                        }
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((InstrumentTicker) it8.next()).f105112b);
                        }
                        for (String str2 : zhm.a1.k(refs, zhm.d0.i1(arrayList))) {
                            od0.i.Companion.getClass();
                            dVar.f(str2, od0.i.f224256b);
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x params = (x) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0 d0VarFirstOrError = m70.a.g(this.f288048b.a(), null, new v78.d(25), 1).firstOrError();
                        s sVar = new s(3, new a(params, 5));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        x params2 = (x) obj2;
                        nel.n instrument = (nel.n) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        this.f288048b.f288068j.put(params2, instrument);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: vdl.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f288043b;

            {
                this.f288043b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Set refs = (Set) obj2;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = refs.iterator();
                        while (true) {
                            ArrayList arrayList2 = null;
                            if (!it8.hasNext()) {
                                Map mapT = zhm.r0.t(arrayList);
                                if (mapT.keySet().containsAll(refs)) {
                                    Collection collectionValues = mapT.values();
                                    arrayList2 = new ArrayList();
                                    Iterator it9 = collectionValues.iterator();
                                    while (it9.hasNext()) {
                                        InstrumentTicker instrumentTicker = (InstrumentTicker) ((od0.i) it9.next()).f224257a;
                                        if (instrumentTicker != null) {
                                            arrayList2.add(instrumentTicker);
                                        }
                                    }
                                }
                                return arrayList2;
                            }
                            String str = (String) it8.next();
                            od0.i iVar = (od0.i) this.f288043b.f288066g.get(str);
                            Pair pair = iVar != null ? new Pair(str, iVar) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        break;
                    default:
                        x params = (x) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (nel.n) this.f288043b.f288068j.get(params);
                }
            }
        };
        final int i3 = 2;
        this.k = new w4l.f(function2, function1, new Function2(this) { // from class: vdl.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f288048b;

            {
                this.f288048b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        ne0.d dVar = this.f288048b.f288066g;
                        Set refs = (Set) obj2;
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter(refs, "refs");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        List<InstrumentTicker> list = rates;
                        for (InstrumentTicker instrumentTicker : list) {
                            String str = instrumentTicker.f105112b;
                            od0.i.Companion.getClass();
                            dVar.f(str, od0.h.a(instrumentTicker));
                        }
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((InstrumentTicker) it8.next()).f105112b);
                        }
                        for (String str2 : zhm.a1.k(refs, zhm.d0.i1(arrayList))) {
                            od0.i.Companion.getClass();
                            dVar.f(str2, od0.i.f224256b);
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        x params = (x) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0 d0VarFirstOrError = m70.a.g(this.f288048b.a(), null, new v78.d(25), 1).firstOrError();
                        s sVar = new s(3, new a(params, 5));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        x params2 = (x) obj2;
                        nel.n instrument = (nel.n) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        this.f288048b.f288068j.put(params2, instrument);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final efm.r a() {
        return this.d.e(Unit.f186387a, this.e.c("INSTRUMENTS_LAST_UPDATE_KEY", w4l.i.f294643c));
    }

    public final efm.r b(List refs, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(this.f288067h.b(zhm.c0.O(refs), loadingStrategy), kotlin.coroutines.g.f186406a);
    }

    public final efm.r c(List refs, w4l.k loadingStrategy, long j2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(qe0.o.a(this.i, zhm.c0.O(refs), j2, loadingStrategy, !Intrinsics.f(loadingStrategy, w4l.i.f294643c), null, 16), kotlin.coroutines.g.f186406a);
    }
}
