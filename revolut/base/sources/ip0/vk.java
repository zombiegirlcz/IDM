package ip0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vk extends koi.b {

    @NotNull
    public static final sk Companion = new sk();
    public final TiltGlowCardContainerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShapeableImageView f166834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f166835h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TagView f166836j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.card_tiltGlowContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TiltGlowCardContainerView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.card_imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166834g = (ShapeableImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.card_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166835h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.card_amountSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.card_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166836j = (TagView) viewFindViewById5;
    }

    public final tk F(Drawable drawable) {
        int i;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = ix0.s0.d(drawable, context, aw0.s8.DEFAULT).f;
        aw0.v1 v1VarF = ix0.s0.f(i2);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i3 = uk.f166690a[v1VarF.ordinal()];
        if (i3 == 1) {
            i = R$attr.internal_colorForegroundTintOnDarkBackground;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_colorForegroundTintOnLightBackground;
        }
        return new tk(kli.a.s(i, context2), i2);
    }
}
