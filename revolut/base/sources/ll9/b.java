package ll9;

import eyd.v;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn2.c f196671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl9.d f196672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f196673c;
    public final a d;
    public final kl9.c e;

    public b(fn2.c payWithPhotoInteractor, kl9.d scanFlowProgressProducer, v scanResultHandlers, a payWithPhotoDialogsFactory, kl9.c scanFlowFileFactory) {
        Intrinsics.checkNotNullParameter(payWithPhotoInteractor, "payWithPhotoInteractor");
        Intrinsics.checkNotNullParameter(scanFlowProgressProducer, "scanFlowProgressProducer");
        Intrinsics.checkNotNullParameter(scanResultHandlers, "scanResultHandlers");
        Intrinsics.checkNotNullParameter(payWithPhotoDialogsFactory, "payWithPhotoDialogsFactory");
        Intrinsics.checkNotNullParameter(scanFlowFileFactory, "scanFlowFileFactory");
        this.f196671a = payWithPhotoInteractor;
        this.f196672b = scanFlowProgressProducer;
        this.f196673c = scanResultHandlers;
        this.d = payWithPhotoDialogsFactory;
        this.e = scanFlowFileFactory;
    }

    public final f a(e60.a mediaPickerControllerExtension) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Object obj2 = this.f196673c.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        a aVar = this.d;
        kl9.c cVar = this.e;
        return new f(mediaPickerControllerExtension, this.f196671a, this.f196672b, (Set) obj2, aVar, cVar);
    }
}
