package kl;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h0 implements igm.o, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185183b;

    public /* synthetic */ h0(c2 c2Var, int i) {
        this.f185182a = i;
        this.f185183b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185182a) {
            case 1:
                tl.g it8 = (tl.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c2 c2Var = this.f185183b;
                c2Var.f185157w.trackFlowCancellation();
                c2Var.D.onNext(new ml.k(ml.j.USER_EXIT_FLOW));
                break;
            default:
                ml.o0 it9 = (ml.o0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                hx7.e.f(this.f185183b.f185151m);
                break;
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f185182a) {
            case 0:
                sl.k task = (sl.k) obj2;
                Intrinsics.checkNotNullParameter(task, "task");
                ol.l lVar = this.f185183b.f185153q;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(task, "task");
                ol.f fVar = lVar.d;
                String strA = fVar.getType().a();
                lVar.e.track(new BiometricTokenEvents.BiometricTokenRetrieval(strA));
                Observable observableOnErrorResumeNext = fVar.b(lVar.f226275c).flatMap(new ol.i(lVar, strA, task)).onErrorResumeNext(new ol.j(lVar, strA));
                Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
                return observableOnErrorResumeNext;
            default:
                sl.x workflowTask = (sl.x) obj2;
                Intrinsics.checkNotNullParameter(workflowTask, "task");
                c2 c2Var = this.f185183b;
                nl.c0 c0Var = c2Var.o;
                PublishSubject uiEvents = c2Var.C;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(workflowTask, "workflowTask");
                Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
                if (!(workflowTask instanceof sl.q) && !(workflowTask instanceof sl.p)) {
                    throw new IllegalArgumentException(nl.c0.class.getSimpleName().concat(" only supports face interactive tasks").toString());
                }
                Observable observablePublish = uiEvents.publish(new jid.z(workflowTask, c0Var, 16));
                Intrinsics.checkNotNullExpressionValue(observablePublish, "publish(...)");
                return observablePublish;
        }
    }
}
