package xy;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import vkm.t0;
import xv4.o;
import yji.d;
import yy.c;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f309554c;
    public final k d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.revolut.kompot.navigable.a controller, c cameraKitCameraScreenAnalyticsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(cameraKitCameraScreenAnalyticsControllerModelExtension, "cameraKitCameraScreenAnalyticsControllerModelExtension");
        this.f309554c = cameraKitCameraScreenAnalyticsControllerModelExtension;
        this.d = controller instanceof k ? (k) controller : null;
    }

    @Override // yji.d
    public final void M() {
        d.H(this, new t0(((sx.b) this.f309554c.f317737n).f266235b, 1), new o(this, (Continuation) null, 7), 3);
    }
}
