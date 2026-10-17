package ad0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yc0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0.e f3227a;

    public t(yc0.e iconMapper, yc0.p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f3227a = iconMapper;
    }

    public final Image a(SelectionItem.Option.Image image) {
        if (image instanceof SelectionItem.Option.Image.Asset) {
            return new UrlImage(((SelectionItem.Option.Image.Asset) image).f63617a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        if (!(image instanceof SelectionItem.Option.Image.Icon)) {
            throw new NoWhenBranchMatchedException();
        }
        return yc0.e.a(this.f3227a, ((SelectionItem.Option.Image.Icon) image).f63618a, d.a.f312415a, null, 4);
    }
}
