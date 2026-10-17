package w6h;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends w5h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f295436c;
    public final w5h.b d;

    public b(j screen, w5h.b controllerModel) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        this.f295436c = screen;
        this.d = controllerModel;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, rd0.e.b(((BannerDelegate) this.f295436c.f322839a).f51699c), new a(2, 4, w5h.b.class, this.d, "onBannerClicked", "onBannerClicked(Lcom/revolut/core/ui_kit/delegates/BannerDelegate$Model;)V"), 3);
    }
}
