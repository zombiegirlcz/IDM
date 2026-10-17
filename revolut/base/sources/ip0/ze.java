package ip0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ze extends koi.b implements tw0.d {
    public final RecyclerView.ViewHolder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SecondaryBackgroundConstraintLayout f167450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f167451h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f167452j;
    public final ImageView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(View view, RecyclerView.ViewHolder innerViewHolder) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(innerViewHolder, "innerViewHolder");
        this.f = innerViewHolder;
        View viewFindViewById = view.findViewById(R$id.delegateDraggable_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f167450g = (SecondaryBackgroundConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.delegateDraggable_innerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167451h = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.delegateDraggable_clickableForeground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.delegateDraggable_startIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f167452j = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.delegateDraggable_endIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById5;
        this.k = imageView;
        zi0.c.g(imageView, new ResourceImage(R$drawable.uikit_icn_24_drag, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // tw0.d
    public final void a() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GradientDrawable gradientDrawableH = dr0.l.h(context, 10.0f, new Color.Opaque(R$attr.uikit_colorAccent, 0.05f), 0, null);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 4.0f);
        Intrinsics.checkNotNullParameter(gradientDrawableH, "<this>");
        this.f167450g.setSecondaryBackground(c6d.b.S(gradientDrawableH, iK, iK, iK, iK));
    }

    @Override // tw0.d
    public final void t() {
        this.f167450g.setSecondaryBackground((Drawable) null);
    }
}
