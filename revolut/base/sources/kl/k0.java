package kl;

import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k0 implements igm.g, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185190b;

    public /* synthetic */ k0(c2 c2Var, int i) {
        this.f185189a = i;
        this.f185190b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185189a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                this.f185190b.c().onNext(ml.a.f206513a);
                break;
            case 1:
            default:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                c2 c2Var = this.f185190b;
                c2Var.getClass();
                Timber.INSTANCE.e(p0, "Failed to listen for orchestrationState", new Object[0]);
                c2Var.D.onNext(new ml.i(c2Var.f185158x.map(p0)));
                break;
            case 2:
                sl.x it8 = (sl.x) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                BehaviorSubject behaviorSubject = this.f185190b.E;
                ml.p pVar = (ml.p) behaviorSubject.e();
                if (pVar == null) {
                    pVar = new ml.p(false, false, false);
                }
                behaviorSubject.onNext(new ml.p(pVar.f206540a, pVar.f206541b, it8 instanceof sl.m));
                break;
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        sl.s poaTask = (sl.s) obj2;
        Intrinsics.checkNotNullParameter(poaTask, "task");
        c2 c2Var = this.f185190b;
        nl.e1 e1Var = c2Var.u;
        Observable uiEventObservable = c2Var.C.hide();
        Intrinsics.checkNotNullExpressionValue(uiEventObservable, "hide(...)");
        e1Var.getClass();
        Intrinsics.checkNotNullParameter(poaTask, "poaTask");
        Intrinsics.checkNotNullParameter(uiEventObservable, "uiEventObservable");
        ogm.e eVar = new ogm.e(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(e1Var, 16), 2);
        Observable observableCast = uiEventObservable.filter(nl.p0.f).cast(ml.l0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        mgm.b bVarD = eVar.d(observableCast.map(nl.b1.f216892a));
        Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
        Observable observableSwitchMap = bVarD.switchMap(new nl.d1(e1Var, poaTask));
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
