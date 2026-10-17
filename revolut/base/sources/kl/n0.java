package kl;

import com.onfido.android.sdk.capture.utils.CountryCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class n0 implements igm.g, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185201b;

    public /* synthetic */ n0(c2 c2Var, int i) {
        this.f185200a = i;
        this.f185201b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f185200a) {
            case 0:
                nl.t p0 = (nl.t) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                c2 c2Var = this.f185201b;
                PublishSubject publishSubject = c2Var.D;
                if (Intrinsics.f(p0, nl.q.f216938a)) {
                    c2Var.c().onNext(ml.a.f206513a);
                    return;
                }
                if (!(p0 instanceof nl.s)) {
                    if (!(p0 instanceof nl.r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    publishSubject.onNext(new ml.k(ml.j.EXIT_NFC_REQUIRED_FLOW));
                    return;
                } else {
                    nl.s sVar = (nl.s) p0;
                    CountryCode countryCode = sVar.f216948c;
                    publishSubject.onNext(new ml.n(sVar.d, sVar.f216946a, sVar.e, countryCode, sVar.f216947b));
                    return;
                }
            default:
                nl.t0 p03 = (nl.t0) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                boolean zF = Intrinsics.f(p03, nl.s0.f216950b);
                c2 c2Var2 = this.f185201b;
                if (zF) {
                    c2Var2.c().onNext(ml.a.f206513a);
                    return;
                } else {
                    if (Intrinsics.f(p03, nl.s0.f216949a)) {
                        c2Var2.D.onNext(new ml.k(ml.j.USER_EXIT_FLOW));
                        return;
                    }
                    return;
                }
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        sl.v retryTask = (sl.v) obj2;
        Intrinsics.checkNotNullParameter(retryTask, "task");
        c2 c2Var = this.f185201b;
        nl.g1 g1Var = c2Var.f185156t;
        Observable uiEvents = c2Var.C.hide();
        Intrinsics.checkNotNullExpressionValue(uiEvents, "hide(...)");
        g1Var.getClass();
        Intrinsics.checkNotNullParameter(retryTask, "retryTask");
        Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
        ogm.e eVar = new ogm.e(new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(retryTask, g1Var, 8), 2);
        Intrinsics.checkNotNullExpressionValue(eVar, "fromAction(...)");
        Observable observableCast = uiEvents.filter(nl.p0.f216936g).cast(ml.m0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observableFlatMap = eVar.d(observableCast).flatMap(new kge.d(g1Var, retryTask, 14));
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }
}
