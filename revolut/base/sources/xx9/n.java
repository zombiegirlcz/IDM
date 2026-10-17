package xx9;

import au0.n4;
import e4k.m0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.v;
import te0.w;
import ux9.t;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.g f309446b;

    public /* synthetic */ n(fc.g gVar, int i) {
        this.f309445a = i;
        this.f309446b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f309445a;
        int i2 = 25;
        int i3 = 3;
        Object[] objArr = 0;
        int i5 = 2;
        fc.g gVar = this.f309446b;
        int i6 = 1;
        char c2 = 1;
        char c3 = 1;
        char c5 = 1;
        char c6 = 1;
        char c7 = 1;
        char c16 = 1;
        char c26 = 1;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return Boolean.valueOf((((y80.a) gVar.d).c("android.permission.READ_CONTACTS") == ((Boolean) rVar.f314203c).booleanValue() && ((((Number) rVar.f314201a).longValue() > 0L ? 1 : (((Number) rVar.f314201a).longValue() == 0L ? 0 : -1)) > 0 && (((Number) rVar.f314202b).longValue() > 0L ? 1 : (((Number) rVar.f314202b).longValue() == 0L ? 0 : -1)) > 0) == true) ? false : true);
            case 1:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                pfm.f fVarP = ((a31.a) gVar.f).p(recents);
                tx9.f fVar = (tx9.f) gVar.f133579a;
                Iterator it8 = recents.iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                final long timestamp = ((t) it8.next()).getTimestamp();
                while (it8.hasNext()) {
                    long timestamp2 = ((t) it8.next()).getTimestamp();
                    if (timestamp < timestamp2) {
                        timestamp = timestamp2;
                    }
                }
                final tx9.e eVar = fVar.f275378a;
                pfm.n nVar = new pfm.n(new Callable() { // from class: tx9.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        e eVar2 = eVar;
                        ue0.c cVar = eVar2.f275375a;
                        long j2 = timestamp;
                        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.valueOf(j2));
                        ((v) eVar2.d.getValue()).set(Long.valueOf(j2));
                        return Unit.f186387a;
                    }
                }, c2 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return fVarP.e(w.g0(nVar));
            case 2:
                Long initialLoadTimestamp = (Long) obj2;
                Intrinsics.checkNotNullParameter(initialLoadTimestamp, "initialLoadTimestamp");
                efm.r map = m70.a.g(((u0a.a) gVar.f133582g).e(false), null, null, 3).map(new d(12, new f(gVar, c3 == true ? 1 : 0))).map(new d(13, new f(i5)));
                return initialLoadTimestamp.longValue() > 0 ? map : map.filter(new d(14, new f(i3)));
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                pfm.n nVar2 = new pfm.n(new tx9.a(((tx9.f) gVar.f133579a).f275378a, objArr == true ? 1 : 0), c5 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                return w.g0(nVar2).l(new ty7.b(gVar, i2));
            case 4:
                if (jh.d.h(((asi.d) gVar.e).a())) {
                    ((ThreadPoolExecutor) gVar.i).submit(new n4((boolean) (c6 == true ? 1 : 0), (Object) gVar, 10));
                }
                return Unit.f186387a;
            case 5:
                tx9.f fVar2 = (tx9.f) gVar.f133579a;
                Boolean fullUpdateRequired = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(fullUpdateRequired, "fullUpdateRequired");
                if (!fullUpdateRequired.booleanValue()) {
                    ufm.c cVar = new ufm.c(new tx9.a(fVar2.f275378a, i3), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    efm.b bVarFlatMapCompletable = new sfm.b(w.i0(cVar), new d(20, new n(gVar, 6)), i5).flatMapCompletable(new d(21, new n(gVar, 7)));
                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                    return bVarFlatMapCompletable;
                }
                r rVar2 = (r) gVar.f133580b;
                sfm.b bVar = new sfm.b(rVar2.f309450b.f(false), new d(22, new xw9.c(rVar2, i3)), i5);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                efm.b bVarFlatMapCompletable2 = bVar.flatMapCompletable(new d(9, new n(gVar, c26 == true ? 1 : 0)));
                pfm.n nVar3 = new pfm.n(new c86.d(fVar2.f275378a, ((y80.a) gVar.d).c("android.permission.READ_CONTACTS"), 5), c16 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(nVar3, "fromCallable(...)");
                pfm.r rVarG0 = w.g0(nVar3);
                pfm.n nVar4 = new pfm.n(new tx9.a(fVar2.f275378a, i5), c7 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(nVar4, "fromCallable(...)");
                pfm.a aVarE = bVarFlatMapCompletable2.e(efm.b.p(rVarG0, w.g0(nVar4)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 6:
                Long lastTimestamp = (Long) obj2;
                Intrinsics.checkNotNullParameter(lastTimestamp, "lastTimestamp");
                s sVar = (s) gVar.f133581c;
                sfm.b bVar2 = new sfm.b(sVar.f309455b.f(false), new d(i2, new m0(sVar, lastTimestamp.longValue(), 17)), i5);
                Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
                return bVar2;
            default:
                List recents2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recents2, "recents");
                pfm.f fVarP2 = ((a31.a) gVar.f).p(recents2);
                tx9.f fVar3 = (tx9.f) gVar.f133579a;
                Iterator it10 = recents2.iterator();
                if (!it10.hasNext()) {
                    throw new NoSuchElementException();
                }
                final long timestamp3 = ((t) it10.next()).getTimestamp();
                while (it10.hasNext()) {
                    long timestamp4 = ((t) it10.next()).getTimestamp();
                    if (timestamp3 < timestamp4) {
                        timestamp3 = timestamp4;
                    }
                }
                final tx9.e eVar2 = fVar3.f275378a;
                pfm.n nVar5 = new pfm.n(new Callable() { // from class: tx9.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        e eVar22 = eVar2;
                        ue0.c cVar2 = eVar22.f275375a;
                        long j2 = timestamp3;
                        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar2, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.valueOf(j2));
                        ((v) eVar22.d.getValue()).set(Long.valueOf(j2));
                        return Unit.f186387a;
                    }
                }, i6);
                Intrinsics.checkNotNullExpressionValue(nVar5, "fromCallable(...)");
                return fVarP2.e(w.g0(nVar5));
        }
    }
}
