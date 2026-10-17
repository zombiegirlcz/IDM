package du8;

import com.google.firebase.messaging.t;
import cu8.g1;
import cu8.j1;
import cu8.k1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt8.d f117954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f117955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80.a f117956c;
    public final g1 d;
    public final gte.a e;
    public final tm.g f;

    public k(mt8.d kycInteractor, j1 state, x80.a packageNameProvider, g1 presentationModel, gte.a featureToggleInteractor, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f117954a = kycInteractor;
        this.f117955b = state;
        this.f117956c = packageNameProvider;
        this.d = presentationModel;
        this.e = featureToggleInteractor;
        this.f = actionDelegateFactory.f(new j(this, 2));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        k1 action = (k1) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }
}
