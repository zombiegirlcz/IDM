package rq0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import ix0.l0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CutoutShapeableImageView f256442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f256443h;
    public final CircleBadgeView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConstraintLayout itemView, CutoutShapeableImageView backgroundView, ImageView iconView, CircleBadgeView closeButton) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "root");
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f256442g = backgroundView;
        this.f256443h = iconView;
        this.i = closeButton;
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        l0 l0Var = new l0((ViewGroup) view, u.c(backgroundView));
        backgroundView.setBackground(new ColorDrawable(0));
        backgroundView.setClipToOutline(true);
        closeButton.setBadge(new WhiteCircleBadge(dw0.a.Error), l0Var);
        pd.b.h(itemView, true);
        pd.b.h(closeButton, true);
        pd.b.p(closeButton, new TextLocalisedClause(R$string.chat_attachment_media_item_close_accessibility_label, null, null, 14));
    }

    public final void F(gw0.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        yy0.f.e(or0.u.k(this.f256442g).Q(), state.f147235a, this.f256442g, null, null, 12);
    }
}
