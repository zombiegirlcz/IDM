package ufm;

import android.content.Context;
import android.content.SharedPreferences;
import com.revolut.data.model.Data;
import efm.f0;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import no.f2;
import ulm.p0;
import v6l.b0;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements f0, nfm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f279885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f279886c;

    public /* synthetic */ g(Object obj2, f0 f0Var, int i) {
        this.f279884a = i;
        this.f279886c = obj2;
        this.f279885b = f0Var;
    }

    public static void a(g gVar) {
        ui0.d dVarA;
        b0 onStarted = new b0(14);
        b0 onCompleted = new b0(15);
        v25.g onFailed = new v25.g(25);
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        v70.b bVar = (v70.b) gVar.f279885b;
        Intrinsics.checkNotNullParameter("CoreAndroidApi", "name");
        SharedPreferences sharedPreferences = bVar.f286524b;
        String string = sharedPreferences.getString("FEATURE$CoreAndroidApi", null);
        if (string != null) {
            ui0.d.Companion.getClass();
            dVarA = ui0.c.a(string);
        } else {
            ui0.c cVar = ui0.d.Companion;
            if (sharedPreferences.getString("PREF_BASELINE_VERSION", null) == null) {
                sharedPreferences.edit().putString("PREF_BASELINE_VERSION", bVar.f286523a.b()).commit();
            }
            String string2 = sharedPreferences.getString("PREF_BASELINE_VERSION", null);
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cVar.getClass();
            dVarA = ui0.c.a(string2);
        }
        ArrayList arrayList = (ArrayList) gVar.f279886c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ui0.d) ((Pair) obj2).f186385a).compareTo(dVarA) > 0) {
                arrayList2.add(obj2);
            }
        }
        y.J(y.x(y.I(y.x(d0.Q(d0.P0(arrayList2, new v70.d())), new bsi.b(onFailed, onStarted, 11)), new qza.q(18)), new bsi.b(gVar, onCompleted, 12)));
    }

    public efm.r c(long j2) {
        efm.r rVarFlatMap = rd0.e.c(((cw9.d) this.f279886c).d(), kotlin.coroutines.g.f186406a).flatMap(new wsg.k(new wvg.d0(this, 12), 27));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return nim.a.w(ue0.e.E(rVarFlatMap, new Data(zhm.f0.f322471a, null, false, 6, null)), new nxc.a(j2, 19));
    }

    @Override // nfm.j
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public efm.r d(List pairs, tzg.j jVar) {
        tzg.b bVar;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.isEmpty()) {
            return zi0.c.j(zhm.f0.f322471a);
        }
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        u0a.a aVar = (u0a.a) this.f279885b;
        switch (jVar == null ? -1 : x8h.f0.f303338a[jVar.ordinal()]) {
            case -1:
                bVar = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                bVar = tzg.b.ONE_DAY;
                break;
            case 2:
                bVar = tzg.b.ONE_WEEK;
                break;
            case 3:
                bVar = tzg.b.ONE_MONTH;
                break;
            case 4:
                bVar = tzg.b.THREE_MONTHS;
                break;
            case 5:
                bVar = tzg.b.SIX_MONTHS;
                break;
            case 6:
                bVar = tzg.b.ONE_YEAR;
                break;
            case 7:
                bVar = tzg.b.FIVE_YEARS;
                break;
            case 8:
                bVar = tzg.b.ALL;
                break;
        }
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        sfm.b bVar2 = new sfm.b(new c(new tif.e(aVar, 10, pairs, bVar), 2), new x0i.i(new x8h.d(aVar, 4), 26), 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        efm.r rVarW = nim.a.w(bVar2, new x8h.h(8));
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return nim.a.w(kli.a.h(rVarW, nim.a.w(nim.a.w(((ppk.f) this.f279886c).e(pairs, n9l.b.SEC_3), new x8h.d(this, 11)), new x8h.h(9))), new x5f.m(6, this, pairs));
    }

    @Override // nfm.j
    public boolean isEmpty() {
        return ((vfm.a) ((AtomicReference) this.f279886c).get()) == ((vfm.a) ((AtomicReference) this.f279885b).get());
    }

    @Override // nfm.j
    public boolean offer(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        vfm.a aVar = new vfm.a();
        aVar.f288668a = obj2;
        ((vfm.a) ((AtomicReference) this.f279885b).getAndSet(aVar)).lazySet(aVar);
        return true;
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        switch (this.f279884a) {
            case 0:
                try {
                    ((f) this.f279886c).f279883c.accept(th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    th10 = new CompositeException(th10, th11);
                }
                ((f0) this.f279885b).onError(th10);
                break;
            case 1:
                ((f0) this.f279885b).onError(th10);
                break;
            default:
                ((f0) this.f279885b).onError(th10);
                break;
        }
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        switch (this.f279884a) {
            case 0:
                ((f0) this.f279885b).onSubscribe(cVar);
                break;
            case 1:
                lfm.d.c((h) this.f279886c, cVar);
                break;
            default:
                ((f0) this.f279885b).onSubscribe(cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f279884a) {
            case 0:
                ((f0) this.f279885b).onSuccess(obj2);
                break;
            case 1:
                ((f0) this.f279885b).onSuccess(obj2);
                break;
            default:
                try {
                    Object objApply = ((kfm.o) this.f279886c).apply(obj2);
                    mfm.f.b(objApply, "The mapper function returned a null value.");
                    ((f0) this.f279885b).onSuccess(objApply);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    onError(th10);
                    return;
                }
                break;
        }
    }

    @Override // nfm.j
    public Object poll() {
        vfm.a aVar;
        AtomicReference atomicReference = (AtomicReference) this.f279886c;
        vfm.a aVar2 = (vfm.a) atomicReference.get();
        vfm.a aVar3 = (vfm.a) aVar2.get();
        if (aVar3 != null) {
            Object obj2 = aVar3.f288668a;
            aVar3.f288668a = null;
            atomicReference.lazySet(aVar3);
            return obj2;
        }
        if (aVar2 == ((vfm.a) ((AtomicReference) this.f279885b).get())) {
            return null;
        }
        do {
            aVar = (vfm.a) aVar2.get();
        } while (aVar == null);
        Object obj3 = aVar.f288668a;
        aVar.f288668a = null;
        atomicReference.lazySet(aVar);
        return obj3;
    }

    public g(v70.b repository) {
        this.f279884a = 4;
        Intrinsics.checkNotNullParameter("CoreAndroidApi", "featureName");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f279885b = repository;
        this.f279886c = new ArrayList();
    }

    public g(Context context) {
        this.f279884a = 10;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f279885b = context;
        this.f279886c = yhm.j.b(new p0(this, 12));
    }

    public g(vv9.c moneyRequestInteractor, cw9.d paymentsProductFeatureChecker) {
        this.f279884a = 7;
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f279885b = moneyRequestInteractor;
        this.f279886c = paymentsProductFeatureChecker;
    }

    public g(u0a.a eodRatesInteractor, ppk.f ratesInteractor) {
        this.f279884a = 8;
        Intrinsics.checkNotNullParameter(eodRatesInteractor, "eodRatesInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f279885b = eodRatesInteractor;
        this.f279886c = ratesInteractor;
    }

    public g(f2 load) {
        this.f279884a = 6;
        Intrinsics.checkNotNullParameter(load, "load");
        this.f279885b = load;
        this.f279886c = new ConcurrentHashMap();
    }

    public g() {
        this.f279884a = 5;
        AtomicReference atomicReference = new AtomicReference();
        this.f279885b = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f279886c = atomicReference2;
        vfm.a aVar = new vfm.a();
        atomicReference2.lazySet(aVar);
    }

    public g(qf.b bVar, ah.a aVar, af.f fVar, ch.b bVar2, dfm.c cVar, qf.b bVar3, af.f fVar2, ah.a aVar2, ch.b bVar4, dfm.c cVar2, ecm.q qVar) {
        this.f279884a = 3;
        this.f279885b = fVar2;
        this.f279886c = qVar;
    }

    public g(f0 f0Var, kfm.o oVar) {
        this.f279884a = 2;
        this.f279885b = f0Var;
        this.f279886c = oVar;
    }

    public g(xd.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f279884a = 9;
        this.f279885b = executor;
        this.f279886c = scheduledExecutorService;
    }
}
