package c10;

import com.revolut.camerakit.vision_framework.generated.FaceValidatorWrapper;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.p0;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaceValidatorWrapper f20312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f20313b;

    public e(FaceValidatorWrapper faceValidatorNative) {
        elm.g dispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(faceValidatorNative, "faceValidatorNative");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20312a = faceValidatorNative;
        this.f20313b = dispatcher;
    }
}
