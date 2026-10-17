package kl;

import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class t0 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185238a;

    public t0(c2 c2Var) {
        this.f185238a = c2Var;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        DocumentCaptureScreen.DocumentCaptureResult.Error it8 = (DocumentCaptureScreen.DocumentCaptureResult.Error) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return c2.a(this.f185238a, it8.getException());
    }
}
