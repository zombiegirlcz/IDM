package nl;

import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class z implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f216968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl.p f216969b;

    public z(c0 c0Var, sl.p pVar) {
        this.f216968a = c0Var;
        this.f216969b = pVar;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        SelfieCaptureScreen.SelfieCaptureResult.Completed result = (SelfieCaptureScreen.SelfieCaptureResult.Completed) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        UploadedArtifact uploadedArtifact = result.getUploadedArtifact();
        c0 c0Var = this.f216968a;
        sl.f fVar = c0Var.e;
        String id10 = uploadedArtifact.getId();
        sl.p pVar = this.f216969b;
        Completable completableA = fVar.a(pVar, id10);
        b0 b0Var = new b0(pVar);
        completableA.getClass();
        ogm.a aVar = new ogm.a(completableA, b0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        mgm.b bVarD = new ogm.e(new v(c0Var, 0), 2).d(Observable.just(w.f216959a));
        Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
        return aVar.d(bVarD);
    }
}
