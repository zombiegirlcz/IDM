package mx4;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import dx4.j2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f210182a;

    public j0(k bannerImageDimensionsProvider) {
        Intrinsics.checkNotNullParameter(bannerImageDimensionsProvider, "bannerImageDimensionsProvider");
        this.f210182a = bannerImageDimensionsProvider;
    }

    public final List a(j2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        float f = (r2.widthPixels / this.f210182a.f210184a.getResources().getDisplayMetrics().density) - 32;
        BigTileDelegate.Model model = new BigTileDelegate.Model("id_image_item", null, null, null, new UrlImage(item.f120640a, null, null, null, 0L, null, null, null, null, null, false, null, Integer.valueOf((int) (((double) f) / 2.90678d)), Integer.valueOf((int) f), false, false, 425982), null, null, null, null, false, false, null, null, null, null, null, 67108584);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
