package xu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fotoapparat.view.CameraView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f308839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraView f308840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.c f308841c;
    public final q d;
    public final ifm.b e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f308842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f308843h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f308844j;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, CameraView cameraView, cv.c settings, Function1 function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraView, "cameraView");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f308839a = context;
        this.f308840b = cameraView;
        this.f308841c = settings;
        this.d = (q) function1;
        this.e = new ifm.b();
        this.f308843h = v0.a.d("create(...)");
        this.i = w.y0(new xge.h(this, 11));
        this.f308844j = new Handler(Looper.getMainLooper());
    }

    public static void a(d dVar) {
        if (dVar.f) {
            return;
        }
        dVar.f308844j.postDelayed(new x.b(dVar, 7), 20L);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        this.e.d();
        if (this.f) {
            this.f308844j.removeCallbacksAndMessages(null);
            ((iam.e) this.i.getValue()).b();
            this.f = false;
            this.f308842g = false;
        }
    }
}
