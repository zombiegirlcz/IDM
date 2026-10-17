package kl;

import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j0 implements igm.o, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185188b;

    public /* synthetic */ j0(c2 c2Var, int i) {
        this.f185187a = i;
        this.f185188b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185187a) {
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f185188b.c().onNext(ml.a.f206513a);
                break;
            default:
                ml.e task = (ml.e) obj2;
                Intrinsics.checkNotNullParameter(task, "task");
                this.f185188b.c().onNext(task);
                break;
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        sl.l task = (sl.l) obj2;
        Intrinsics.checkNotNullParameter(task, "task");
        ol.p pVar = this.f185188b.f185154r;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(task, "task");
        ol.f fVar = pVar.f226281c;
        String strA = fVar.getType().a();
        OnfidoAnalytics onfidoAnalytics = pVar.d;
        onfidoAnalytics.track(new BiometricTokenEvents.BiometricTokenStorage(strA));
        String str = pVar.f226280b;
        if (str.length() == 0) {
            onfidoAnalytics.track(new BiometricTokenEvents.BiometricTokenStorageError(strA, "Customer user hash must be provided"));
            Observable observableError = Observable.error(new OnfidoException("Customer user hash must be provided"));
            Intrinsics.h(observableError);
            return observableError;
        }
        String str2 = task.f264046c;
        if (str2 == null || str2.length() == 0) {
            onfidoAnalytics.track(new BiometricTokenEvents.BiometricTokenStorageError(strA, "Encrypted biometric token must be provided"));
            Observable observableError2 = Observable.error(new OnfidoException("Encrypted biometric token must be provided"));
            Intrinsics.h(observableError2);
            return observableError2;
        }
        ogm.e eVarA = fVar.a(str, task.f264046c);
        com.onfido.android.sdk.capture.internal.analytics.inhouse.a aVar = new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(pVar, strA, 9);
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        ogm.m mVar = new ogm.m(new ogm.m(eVarA, bVar, bVar, aVar, bVar2), bVar, new ol.n(pVar, strA), bVar2, bVar2);
        Completable completableB = pVar.f226279a.b(task, "{}");
        ol.o oVar = new ol.o(task);
        completableB.getClass();
        ogm.a aVar2 = new ogm.a(completableB, oVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorComplete(...)");
        return new ogm.a(mVar, aVar2, 0).d(Observable.just(Unit.f186387a));
    }
}
