package bx0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f19413j;
    public final CollapsingActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CollapsingActionButton f19414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TwinHorizontalButton f19415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f19416n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f19417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f19418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Sequence f19419r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.imageStories_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.imageStories_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f19413j = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.imageStories_backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(R$id.imageStories_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) viewFindViewById4;
        this.k = collapsingActionButton;
        View viewFindViewById5 = itemView.findViewById(R$id.imageStories_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CollapsingActionButton collapsingActionButton2 = (CollapsingActionButton) viewFindViewById5;
        this.f19414l = collapsingActionButton2;
        View viewFindViewById6 = itemView.findViewById(R$id.imageStories_twinHorizontalButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f19415m = (TwinHorizontalButton) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.imageStories_imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f19416n = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.imageStories_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.o = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.imageStories_topSpacing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f19417p = viewFindViewById9;
        this.f19418q = itemView;
        CollapsingActionButton[] elements = {collapsingActionButton, collapsingActionButton2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f19419r = kotlin.collections.d.E(elements);
    }

    @Override // bx0.d
    public final void F(int i, int i2) {
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setPadding(itemView.getPaddingLeft(), itemView.getPaddingTop(), itemView.getPaddingRight(), i2);
        or0.u.w(i, this.f19417p);
    }
}
