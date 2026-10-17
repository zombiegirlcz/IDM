package kl;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class q implements igm.g, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185224b;

    public /* synthetic */ q(c2 c2Var, int i) {
        this.f185223a = i;
        this.f185224b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185223a) {
            case 0:
                ml.q0 p0 = (ml.q0) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f185224b.b(p0);
                return;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f185224b.c().onNext(ml.a.f206513a);
                return;
            default:
                nl.x p03 = (nl.x) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                c2 c2Var = this.f185224b;
                PublishSubject publishSubject = c2Var.D;
                if (Intrinsics.f(p03, nl.w.f216959a)) {
                    c2Var.c().onNext(ml.a.f206513a);
                    return;
                } else if (Intrinsics.f(p03, nl.w.f216960b)) {
                    publishSubject.onNext(ml.h.f206528c);
                    return;
                } else {
                    if (!Intrinsics.f(p03, nl.w.f216961c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    publishSubject.onNext(ml.h.f206527b);
                    return;
                }
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        int i = this.f185223a;
        c2 c2Var = this.f185224b;
        int i2 = 2;
        switch (i) {
            case 2:
                sl.o motionTask = (sl.o) obj2;
                Intrinsics.checkNotNullParameter(motionTask, "task");
                nl.g0 g0Var = c2Var.f185152p;
                Observable uiEventObservable = c2Var.C.hide();
                Intrinsics.checkNotNullExpressionValue(uiEventObservable, "hide(...)");
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(motionTask, "motionTask");
                Intrinsics.checkNotNullParameter(uiEventObservable, "uiEventObservable");
                ogm.e eVar = new ogm.e(new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(g0Var, motionTask, 6), i2);
                Observable observableCast = uiEventObservable.filter(nl.b.u).cast(ml.e0.class);
                Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                Observable map = observableCast.map(new kgm.c(nl.d0.f));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Observable observableCast2 = map.filter(nl.b.v).cast(MotionHostFragment.AvcHostResult.Completed.class);
                Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                Observable map2 = eVar.d(observableCast2).map(new kgm.c(nl.e0.f));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                Observable observableSwitchMap = map2.switchMap(new kgm.i(g0Var, motionTask, 12));
                Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
                return observableSwitchMap;
            default:
                ml.e currentTask = (ml.e) obj2;
                sl.j jVar = c2Var.k;
                Intrinsics.h(currentTask);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(currentTask, "currentTask");
                ml.e[] elements = {ml.c.f206517a, ml.d.f206519a, ml.a.f206513a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (!kotlin.collections.d.y0(elements).contains(currentTask)) {
                    Observable observableEmpty = Observable.empty();
                    Intrinsics.h(observableEmpty);
                    return observableEmpty;
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                SchedulersProvider schedulersProvider = jVar.d;
                Observable map3 = Observable.interval(2000L, timeUnit, schedulersProvider.getTimer()).concatMapSingle(new ogm.i(jVar, 26)).map(new om4.d0(jVar, 17));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                Observable observableDistinctUntilChanged = RxExtensionsKt.retryWithExponentialBackOff(map3, 2, 5, schedulersProvider.getTimer(), sl.h.f).doOnError(sl.i.f264037a).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                return observableDistinctUntilChanged;
        }
    }
}
