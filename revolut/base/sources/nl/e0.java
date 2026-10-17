package nl;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.h0 {
    public static final e0 f = new e0(MotionHostFragment.AvcHostResult.Completed.class, "uploadedArtifact", "getUploadedArtifact()Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", 0);

    @Override // kotlin.jvm.internal.h0, wim.p
    public final Object get(Object obj2) {
        return ((MotionHostFragment.AvcHostResult.Completed) obj2).getUploadedArtifact();
    }
}
