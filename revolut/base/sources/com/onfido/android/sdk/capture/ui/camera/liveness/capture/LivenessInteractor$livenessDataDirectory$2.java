package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import android.os.Environment;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LivenessInteractor$livenessDataDirectory$2 extends u implements Function0<File> {
    public static final LivenessInteractor$livenessDataDirectory$2 INSTANCE = new LivenessInteractor$livenessDataDirectory$2();

    public LivenessInteractor$livenessDataDirectory$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return Environment.getDataDirectory();
    }
}
