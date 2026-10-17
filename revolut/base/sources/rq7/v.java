package rq7;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rnd.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements jki.p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f256508a;

    public v(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f256508a = dateProvider;
    }

    public static com.revolut.core.ui_kit.delegates.m b(int i, int i2) {
        LayeredImage layeredImageI = LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);
        ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
        int i3 = R$attr.uikit_colorAccent;
        int i5 = R$attr.uikit_colorGroupedBackground;
        companion.getClass();
        return new com.revolut.core.ui_kit.delegates.m(layeredImageI, (LayeredImage) null, ProgressStyle.Companion.b(i2, i3, i5), 2);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f256482a, new rpi.e(this, 6), new d0(this), new rbe.c(this, domainState, 10));
    }
}
