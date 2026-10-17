package androidx.core.app;

import android.app.SharedElementCallback;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements SharedElementCallback.OnSharedElementsReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f7345a;

    public /* synthetic */ a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f7345a = onSharedElementsReadyListener;
    }

    public final void a() {
        ActivityCompat.Api23Impl.onSharedElementsReady(this.f7345a);
    }
}
