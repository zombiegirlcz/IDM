package c10;

import com.revolut.camerakit.vision_framework.generated.DocImageQuality;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.p0;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocImageQuality f20307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f20308b;

    public b(DocImageQuality docImageQualityNative) {
        elm.g dispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(docImageQualityNative, "docImageQualityNative");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20307a = docImageQualityNative;
        this.f20308b = dispatcher;
    }
}
