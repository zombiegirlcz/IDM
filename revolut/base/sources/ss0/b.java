package ss0;

import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f265253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayerDrawable f265254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevolutShimmerDrawable f265255c;

    public b(ImageView image, LayerDrawable shadowOverlay, RevolutShimmerDrawable shimmerDrawable) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(shadowOverlay, "shadowOverlay");
        Intrinsics.checkNotNullParameter(shimmerDrawable, "shimmerDrawable");
        this.f265253a = image;
        this.f265254b = shadowOverlay;
        this.f265255c = shimmerDrawable;
    }
}
