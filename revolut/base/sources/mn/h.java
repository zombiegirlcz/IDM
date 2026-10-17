package mn;

import kotlin.jvm.internal.Intrinsics;
import no.t1;
import no.v2;
import no.y1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements xji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final voi.g f207324a;

    public h(voi.g screenEventController) {
        Intrinsics.checkNotNullParameter(screenEventController, "screenEventController");
        this.f207324a = screenEventController;
    }

    @Override // xji.a
    public final void q(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        ((y1) ((t1) this.f207324a.get())).b(controller);
    }

    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        ((y1) ((t1) this.f207324a.get())).a(controller, v2.TRACK_ATTACHMENT_ONCE);
    }
}
