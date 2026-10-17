package c10;

import com.revolut.camerakit.vision_framework.generated.DocCorners;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.p0;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocCorners f20314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f20315b;

    public f(DocCorners fourCornerNative) {
        elm.g dispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(fourCornerNative, "fourCornerNative");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20314a = fourCornerNative;
        this.f20315b = dispatcher;
    }
}
