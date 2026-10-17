package nl;

import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j0 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f216921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl.q f216922b;

    public j0(q0 q0Var, sl.q qVar) {
        this.f216921a = q0Var;
        this.f216922b = qVar;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        LivenessConfirmationFragment.LivenessConfirmationResult result = (LivenessConfirmationFragment.LivenessConfirmationResult) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        q0 q0Var = this.f216921a;
        q0Var.getClass();
        if (Intrinsics.f(result, LivenessConfirmationFragment.LivenessConfirmationResult.Exit.INSTANCE)) {
            Observable observableConcat = Observable.concat(Observable.just(w.f216960b), Observable.fromAction(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(q0Var.f216939a, 15)));
            Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
            return observableConcat;
        }
        if (result instanceof LivenessConfirmationFragment.LivenessConfirmationResult.OnError.OnInvalidCertificate ? true : Intrinsics.f(result, LivenessConfirmationFragment.LivenessConfirmationResult.OnError.OnTokenExpired.INSTANCE)) {
            Observable observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        if (!(result instanceof LivenessConfirmationFragment.LivenessConfirmationResult.VideoUploadedSuccessfully)) {
            throw new NoWhenBranchMatchedException();
        }
        UploadedArtifact uploadResult = ((LivenessConfirmationFragment.LivenessConfirmationResult.VideoUploadedSuccessfully) result).getUploadResult();
        sl.f fVar = q0Var.f216940b;
        String id10 = uploadResult.getId();
        sl.q qVar = this.f216922b;
        Completable completableA = fVar.a(qVar, id10);
        o0 o0Var = new o0(qVar);
        completableA.getClass();
        ogm.a aVar = new ogm.a(completableA, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        int i = 2;
        mgm.b bVarD = new ogm.e(new h0(q0Var, i), i).d(Observable.just(w.f216959a));
        Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
        mgm.b bVarD2 = aVar.d(bVarD);
        Intrinsics.checkNotNullExpressionValue(bVarD2, "andThen(...)");
        return bVarD2;
    }
}
