package xu;

import android.content.Context;
import io.fotoapparat.view.CameraView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, CameraView cameraView, cv.c defaultSettings, Function1 function1) {
        super(context, cameraView, defaultSettings, function1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraView, "cameraView");
        Intrinsics.checkNotNullParameter(defaultSettings, "defaultSettings");
    }
}
