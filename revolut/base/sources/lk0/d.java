package lk0;

import efm.c0;
import efm.r;
import efm.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import ljl.n1;
import ufm.i;
import ufm.n;

/* JADX INFO: loaded from: classes19.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f196167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f196168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f196169c;
    public final f d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f196170g;

    public d(Function2 observePage, Function0 getPagedData, Function1 storePagedData, f initialParams, Function1 downPageParams, Function1 upPageParams, c0 singleThreadScheduler) {
        Intrinsics.checkNotNullParameter(observePage, "observePage");
        Intrinsics.checkNotNullParameter(getPagedData, "getPagedData");
        Intrinsics.checkNotNullParameter(storePagedData, "storePagedData");
        Intrinsics.checkNotNullParameter(initialParams, "initialParams");
        Intrinsics.checkNotNullParameter(downPageParams, "downPageParams");
        Intrinsics.checkNotNullParameter(upPageParams, "upPageParams");
        Intrinsics.checkNotNullParameter(singleThreadScheduler, "singleThreadScheduler");
        this.f196167a = observePage;
        this.f196168b = getPagedData;
        this.f196169c = storePagedData;
        this.d = initialParams;
        this.e = downPageParams;
        this.f = upPageParams;
        this.f196170g = singleThreadScheduler;
    }

    public final n a() {
        n nVarS = new ufm.c(new h4d.d(this, 17), 0).s(this.f196170g);
        Intrinsics.checkNotNullExpressionValue(nVarS, "subscribeOn(...)");
        return nVarS;
    }

    public final efm.b b(r events) {
        Intrinsics.checkNotNullParameter(events, "events");
        r rVarObserveOn = events.observeOn(this.f196170g);
        i iVar = new i(a(), new v(11, new n1(2)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        int i = 6;
        r rVarFlatMap = rVarObserveOn.startWith((w) iVar.x()).flatMap(new v(i, new a(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        sfm.b bVar = new sfm.b(a(), new v(13, new a(this, i)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.b bVarIgnoreElements = r.merge(bVar.doOnNext(new v(10, new n1(1))), rVarFlatMap).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final r c(f fVar, boolean z) {
        r rVarTakeUntil = ((r) this.f196167a.invoke(fVar, Boolean.valueOf(z))).observeOn(this.f196170g).switchMapSingle(new v(4, new a(this, 3))).switchMap(new v(5, new a(this, 4))).takeUntil(new v(7, new b(fVar, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        return rVarTakeUntil;
    }
}
