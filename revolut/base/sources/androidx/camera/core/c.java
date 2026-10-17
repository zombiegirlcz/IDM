package androidx.camera.core;

import androidx.camera.core.CameraExecutor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6834b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f6833a = i;
        this.f6834b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6833a) {
            case 0:
                CameraExecutor.AnonymousClass1.lambda$newThread$0((Runnable) this.f6834b);
                break;
            default:
                ((ImageAnalysisNonBlockingAnalyzer) this.f6834b).analyzeCachedImage();
                break;
        }
    }
}
