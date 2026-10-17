package au0;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 extends koi.b {
    public final CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircleBadgeView f9168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ix0.l0 f9169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.navBarMenuItem_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarMenuItem_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f9168g = (CircleBadgeView) viewFindViewById2;
        this.f9169h = new ix0.l0((ViewGroup) itemView, zhm.u.c(cutoutImageView));
    }

    public final CircleBadgeView F() {
        return this.f9168g;
    }

    public final ix0.l0 H() {
        return this.f9169h;
    }

    public final CutoutImageView I() {
        return this.f;
    }
}
