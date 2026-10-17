package kl;

import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class x0 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f185249a;

    public x0(c2 c2Var) {
        this.f185249a = c2Var;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        LivenessCaptureScreen.LivenessCaptureResult.Error it8 = (LivenessCaptureScreen.LivenessCaptureResult.Error) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return c2.a(this.f185249a, it8.getException());
    }
}
