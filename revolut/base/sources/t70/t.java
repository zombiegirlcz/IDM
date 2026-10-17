package t70;

import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t extends fd0.d {
    public t() {
        this(0);
    }

    @Override // fd0.d
    public final int g(Object obj2, Object obj3) {
        s key = (s) obj2;
        String value = (String) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length();
    }

    public t(int i) {
        super(LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS);
    }
}
