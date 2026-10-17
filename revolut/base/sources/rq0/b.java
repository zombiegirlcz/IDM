package rq0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import et0.n;
import ix0.l0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f256433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeView f256434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintLayout itemView, CutoutShapeableImageView backgroundView, n contentView, CircleBadgeView closeButton) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "root");
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f256433g = contentView;
        this.f256434h = closeButton;
        l0 l0Var = new l0(itemView, u.c(backgroundView));
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 20.0f);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorWidgetBackground, context2);
        backgroundView.setBackground(new ColorDrawable(0));
        backgroundView.setShapeAppearanceModel(backgroundView.getShapeAppearanceModel().toBuilder().setAllCornerSizes(fL).build());
        backgroundView.setImageDrawable(new ColorDrawable(iS));
        backgroundView.setClipToOutline(true);
        WhiteCircleBadge whiteCircleBadge = new WhiteCircleBadge(dw0.a.Error);
        closeButton.setBadgeSize(os0.a.MEDIUM);
        closeButton.setBadge(whiteCircleBadge, l0Var);
        Context context3 = closeButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float fL2 = kli.a.l(context3, 8.0f);
        Context context4 = closeButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        closeButton.setTranslationX(jh.d.k(context4) ? -fL2 : fL2);
        closeButton.setTranslationY(-fL2);
        pd.b.h(itemView, true);
        pd.b.h(closeButton, true);
        pd.b.p(closeButton, new TextLocalisedClause(R$string.chat_attachment_media_item_close_accessibility_label, null, null, 14));
    }
}
