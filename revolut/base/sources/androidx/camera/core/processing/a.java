package androidx.camera.core.processing;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6873c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f6871a = i;
        this.f6872b = obj2;
        this.f6873c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6871a) {
            case 0:
                ((DefaultSurfaceProcessor) this.f6872b).lambda$snapshot$6((DefaultSurfaceProcessor.PendingSnapshot) this.f6873c);
                break;
            default:
                ((SurfaceOutputImpl) this.f6872b).lambda$requestClose$1((AtomicReference) this.f6873c);
                break;
        }
    }
}
