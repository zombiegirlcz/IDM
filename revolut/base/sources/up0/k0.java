package up0;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f281729b;

    public /* synthetic */ k0(l0 l0Var, int i) {
        this.f281728a = i;
        this.f281729b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SurfaceTexture surfaceTexture;
        int i = this.f281728a;
        l0 l0Var = this.f281729b;
        switch (i) {
            case 0:
                i0 readyThread = (i0) obj2;
                int i2 = l0.u;
                Intrinsics.checkNotNullParameter(readyThread, "readyThread");
                if (l0Var.f281736h == readyThread) {
                    l0Var.i = true;
                    readyThread.b(l0Var.k, l0Var.f281738l);
                    p0 transition = l0Var.f;
                    if (transition != null) {
                        l0Var.f = null;
                        b configuration = l0Var.e;
                        if (configuration != null) {
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            Intrinsics.checkNotNullParameter(transition, "transition");
                            i0.a(readyThread, 10, 0, 0, new g0(configuration, transition), 6);
                        }
                    }
                    RectF rectF = l0Var.f281737j;
                    if (rectF != null) {
                        RectF bounds = new RectF(rectF);
                        Intrinsics.checkNotNullParameter(bounds, "bounds");
                        i0.a(readyThread, 6, 0, 0, bounds, 6);
                    }
                    l0Var.b();
                }
                break;
            default:
                i0 lostThread = (i0) obj2;
                int i3 = l0.u;
                Intrinsics.checkNotNullParameter(lostThread, "lostThread");
                if (l0Var.f281736h == lostThread && (surfaceTexture = l0Var.getSurfaceTexture()) != null) {
                    l0Var.i = false;
                    l0Var.a();
                    l0Var.e();
                    l0Var.f281736h = null;
                    if (l0Var.isAvailable() && l0Var.getWidth() > 0 && l0Var.getHeight() > 0) {
                        l0Var.d(surfaceTexture, l0Var.getWidth(), l0Var.getHeight());
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
