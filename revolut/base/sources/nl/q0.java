package nl;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.workflow.internal.ui.LivenessConfirmationScreen;
import io.reactivex.rxjava3.core.Observable;
import kl.t1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f216939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl.f f216940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f216941c;
    public final OnfidoRemoteConfig d;

    public q0(Navigator navigator, sl.f submitTaskCompletionUseCase, x0 permissionsFlowHelper, OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(permissionsFlowHelper, "permissionsFlowHelper");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.f216939a = navigator;
        this.f216940b = submitTaskCompletionUseCase;
        this.f216941c = permissionsFlowHelper;
        this.d = onfidoRemoteConfig;
    }

    public static final Observable a(final q0 q0Var, sl.q qVar, Observable observable, final Pair pair) {
        q0Var.getClass();
        final boolean z = qVar.d;
        ogm.e eVar = new ogm.e(new igm.a() { // from class: nl.i0
            @Override // igm.a
            public final void run() {
                q0 this$0 = this.f216918a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Pair faceUploadVideo = pair;
                Intrinsics.checkNotNullParameter(faceUploadVideo, "$faceUploadVideo");
                this$0.f216939a.navigateTo(new LivenessConfirmationScreen((String) faceUploadVideo.f186385a, (LivenessPerformedChallenges) faceUploadVideo.f186386b, z));
            }
        }, 2);
        Observable observableCast = observable.filter(b.D).cast(ml.w.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        mgm.b bVarD = eVar.d(observableCast.map(new t1(n0.f)));
        Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
        Observable observableSwitchMap = bVarD.switchMap(new j0(q0Var, qVar));
        Observable observableCast2 = observable.filter(b.f216889y).cast(ml.r.class);
        Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
        Observable map = observableCast2.filter(b.z).map(b.A);
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableMergeWith = observableSwitchMap.mergeWith(map);
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "mergeWith(...)");
        return observableMergeWith;
    }
}
