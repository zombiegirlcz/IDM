package hbm;

import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import ix0.h1;
import java.util.ArrayList;
import jv0.t;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import vp0.k;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f150762b;

    public /* synthetic */ e(View view, int i) {
        this.f150761a = i;
        this.f150762b = view;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        switch (this.f150761a) {
            case 0:
                Intrinsics.checkNotNullParameter(surface, "surface");
                ((c2m.b) this.f150762b).invoke(surface);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(surface, "surfaceTexture");
                kv0.c cVar = ((UiKitPlayerView) this.f150762b).f57719x;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(surface, "surfaceTexture");
                cVar.f189910b = surface;
                cVar.e = i;
                cVar.f = i2;
                cVar.f();
                break;
            default:
                Intrinsics.checkNotNullParameter(surface, "surface");
                k effectView = (k) this.f150762b;
                ArrayList arrayList = effectView.d;
                vp0.e eVar = effectView.f291037c;
                if (eVar != null) {
                    eVar.c();
                }
                effectView.f291037c = null;
                vp0.d dVar = vp0.e.Companion;
                js0.b onThreadKilledCallback = new js0.b(new vch.a(effectView, 15));
                dVar.getClass();
                Intrinsics.checkNotNullParameter(effectView, "effectView");
                Intrinsics.checkNotNullParameter(surface, "surfaceTexture");
                Intrinsics.checkNotNullParameter(onThreadKilledCallback, "onThreadKilledCallback");
                vp0.e eVar2 = new vp0.e(effectView, surface, onThreadKilledCallback, i, i2);
                eVar2.start();
                effectView.f291037c = eVar2;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        vp0.a aVar = (vp0.a) arrayList.get(i3);
                        eVar2.f(aVar.f290998a, aVar.f290999b, aVar.f291000c, aVar.d);
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(effectView.f291036b);
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        int i = this.f150761a;
        Object obj2 = this.f150762b;
        Intrinsics.checkNotNullParameter(surface, "surface");
        switch (i) {
            case 0:
                return true;
            case 1:
                UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) obj2;
                if (uiKitPlayerView.getSurfaceDestructionStrategy() == t.KEEP) {
                    uiKitPlayerView.d = surface;
                    return false;
                }
                kv0.c cVar = uiKitPlayerView.f57719x;
                cVar.f189910b = null;
                cVar.b();
                return true;
            default:
                k kVar = (k) obj2;
                vp0.e eVar = kVar.f291037c;
                if (eVar != null) {
                    eVar.c();
                }
                kVar.f291037c = null;
                Lazy lazy = h1.f169241a;
                h1.c(kVar.f291035a);
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        switch (this.f150761a) {
            case 0:
                Intrinsics.checkNotNullParameter(surface, "surface");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(surface, "surface");
                kv0.c cVar = ((UiKitPlayerView) this.f150762b).f57719x;
                cVar.e = i;
                cVar.f = i2;
                kv0.a aVar = cVar.d;
                if (aVar != null) {
                    aVar.c(i, i2);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(surface, "surface");
                vp0.e eVar = ((k) this.f150762b).f291037c;
                if (eVar != null) {
                    eVar.e(i, i2);
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        switch (this.f150761a) {
        }
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    public e(c2m.b onSurfaceTextureAvailable) {
        this.f150761a = 0;
        Intrinsics.checkNotNullParameter(onSurfaceTextureAvailable, "onSurfaceTextureAvailable");
        this.f150762b = onSurfaceTextureAvailable;
    }
}
