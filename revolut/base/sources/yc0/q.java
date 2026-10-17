package yc0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.backend_flow.domain.models.ImageContentType;
import com.revolut.feature.backend_flow.domain.models.ImageItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yc0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f312431a;

    public q(e iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f312431a = iconMapper;
    }

    public final Image a(ImageItem item, Integer num) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof ImageItem.Icon) {
            return e.a(this.f312431a, ((ImageItem.Icon) item).f63491a, d.b.f312416a, null, 4);
        }
        if (!(item instanceof ImageItem.Url)) {
            throw new NoWhenBranchMatchedException();
        }
        ImageItem.Url url2 = (ImageItem.Url) item;
        ImageContentType imageContentType = url2.f63493b;
        if (Intrinsics.f(imageContentType, ImageContentType.Lottie.f63488b)) {
            return new LottieImage(new SourceUrl(url2.f63492a, null), (List) null, 126);
        }
        if (Intrinsics.f(imageContentType, ImageContentType.Static.f63489b)) {
            return new UrlImage(url2.f63492a, null, null, null, 0L, null, null, null, null, null, false, null, num, null, false, false, 491518);
        }
        if (imageContentType instanceof ImageContentType.Unknown) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
