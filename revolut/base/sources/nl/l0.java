package nl;

import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l0 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f216926a = new l0();

    @Override // igm.o
    public final Object apply(Object obj2) {
        LivenessCaptureScreen.LivenessCaptureResult.Completed it8 = (LivenessCaptureScreen.LivenessCaptureResult.Completed) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new Pair(it8.getVideoPath(), it8.getPerformedChallenges());
    }
}
