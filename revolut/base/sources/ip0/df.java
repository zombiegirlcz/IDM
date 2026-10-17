package ip0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundLinearLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class df extends koi.b implements tw0.d {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f163885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163886h;
    public final SecondaryBackgroundLinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayerDrawable f163887j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.draggableRow_imageStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.draggableRow_imageDrag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163885g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.draggableRow_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163886h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.draggableRow_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (SecondaryBackgroundLinearLayout) viewFindViewById4;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GradientDrawable gradientDrawableH = dr0.l.h(context, qv0.h.LARGE.a(), new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral_50), 0, null);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 4.0f);
        Intrinsics.checkNotNullParameter(gradientDrawableH, "<this>");
        this.f163887j = c6d.b.S(gradientDrawableH, iK, iK, iK, iK);
    }

    @Override // tw0.d
    public final void a() {
        this.i.setSecondaryBackground(this.f163887j);
    }

    @Override // tw0.d
    public final void t() {
        this.i.setSecondaryBackground(null);
    }
}
