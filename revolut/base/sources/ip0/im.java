package ip0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class im extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f164713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f164714h;
    public final ConstraintLayout i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(HeroBannerLoadingDelegate heroBannerLoadingDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerFrameLayout) itemView.findViewById(R$id.heroBannerLoading_shimmeringView);
        this.f164713g = itemView.findViewById(R$id.heroBannerLoading_badge);
        this.f164714h = itemView.findViewById(R$id.heroBannerLoading_title);
        this.i = (ConstraintLayout) itemView.findViewById(R$id.heroBannerLoading_constraintLayout);
        or0.b.j(heroBannerLoadingDelegate, new c.e((qv0.h) null, 3), itemView);
    }
}
