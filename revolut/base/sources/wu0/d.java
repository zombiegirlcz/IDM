package wu0;

import android.os.Handler;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f300049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f300050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gu0.a f300051c;
    public b d;
    public b e;
    public c f;

    public d(SwipeToActionLayout layout, Handler mainHandler) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        this.f300049a = layout;
        this.f300050b = mainHandler;
    }

    public final void a() {
        gu0.a aVar = this.f300051c;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f300051c = null;
        b bVar = this.d;
        Handler handler = this.f300050b;
        if (bVar != null) {
            handler.removeCallbacks(bVar);
        }
        this.d = null;
        b bVar2 = this.e;
        if (bVar2 != null) {
            handler.removeCallbacks(bVar2);
        }
        this.e = null;
        c listener = this.f;
        if (listener != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f300049a.f57614b.remove(listener);
        }
        this.f = null;
    }
}
