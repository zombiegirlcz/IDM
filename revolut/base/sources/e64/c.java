package e64;

import kotlin.jvm.internal.Intrinsics;
import mx4.a1;
import mx4.c1;
import mx4.x;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f122890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f122891b;

    public c(x contentListItemMapper, a1 sliderAmountMapper, c1 sliderItemContentItemMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        Intrinsics.checkNotNullParameter(sliderAmountMapper, "sliderAmountMapper");
        Intrinsics.checkNotNullParameter(sliderItemContentItemMapper, "sliderItemContentItemMapper");
        this.f122890a = contentListItemMapper;
        this.f122891b = sliderItemContentItemMapper;
    }
}
