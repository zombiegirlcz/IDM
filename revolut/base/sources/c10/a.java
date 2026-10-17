package c10;

import com.revolut.camerakit.vision_framework.generated.DocClassifier;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.p0;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocClassifier f20305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f20306b;

    public a(DocClassifier docClassifierNative) {
        elm.g dispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(docClassifierNative, "docClassifierNative");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20305a = docClassifierNative;
        this.f20306b = dispatcher;
    }
}
