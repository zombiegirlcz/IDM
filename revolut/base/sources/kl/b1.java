package kl;

import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b1 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185145a;

    public b1(c2 c2Var) {
        this.f185145a = c2Var;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        SelfieCaptureScreen.SelfieCaptureResult.Error it8 = (SelfieCaptureScreen.SelfieCaptureResult.Error) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return c2.a(this.f185145a, it8.getException());
    }
}
