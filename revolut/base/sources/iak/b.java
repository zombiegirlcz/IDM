package iak;

import ang.f;
import com.google.firebase.messaging.t;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import te0.w;
import tm.g;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lak.d f160044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kak.a f160045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f160046c;
    public final g d;

    public b(lak.d state, kak.a interactor, f userInteractor, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f160044a = state;
        this.f160045b = interactor;
        this.f160046c = userInteractor;
        this.d = actionDelegateFactory.e(new hq1.f(this, 26));
    }

    public final r a() {
        a aVar = (a) this.f160044a;
        return aVar.f160042b.getValue(aVar, a.e[0]).c(s.f270018a);
    }

    public final pfm.t b(SetUpPdaActivityContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        a aVar = (a) this.f160044a;
        return w.z0(aVar.f160042b.getValue(aVar, a.e[0]), step);
    }
}
