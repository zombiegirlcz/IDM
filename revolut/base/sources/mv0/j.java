package mv0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.r;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements kv0.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f209080b = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f209081a;

    public j(SurfaceTexture onScreenSurfaceTexture, ExoPlayer player) {
        Intrinsics.checkNotNullParameter(onScreenSurfaceTexture, "onScreenSurfaceTexture");
        Intrinsics.checkNotNullParameter(player, "player");
        this.f209081a = new i(onScreenSurfaceTexture, player);
    }

    @Override // kv0.a
    public final void b(int i, int i2) {
        Handler handler = this.f209081a.f209079h;
        Intrinsics.checkNotNullParameter(handler, "<this>");
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }

    @Override // kv0.a
    public final void c(int i, int i2) {
        Handler handler = this.f209081a.f209079h;
        Intrinsics.checkNotNullParameter(handler, "<this>");
        handler.sendMessage(handler.obtainMessage(3, i, i2));
    }

    @Override // kv0.a
    public final r dispose() {
        i iVar = this.f209081a;
        iVar.f209079h.removeCallbacksAndMessages(null);
        iVar.f209076b.setVideoSurface(null);
        Surface surface = iVar.f;
        if (surface != null) {
            surface.release();
        }
        r obj2 = e0.b();
        Handler handler = iVar.f209079h;
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        handler.sendMessage(handler.obtainMessage(4, obj2));
        return obj2;
    }

    @Override // kv0.a
    public final float k(float f) {
        return f * 2.0f;
    }
}
