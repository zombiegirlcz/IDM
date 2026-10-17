package bx0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CircleProgressBarWithText;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends d {
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f19405j;
    public final CollapsingActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CollapsingActionButton f19406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TwinHorizontalButton f19407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CircleProgressBarWithText f19408n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f19409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f19410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Sequence f19411r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.circleProgressStories_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.circleProgressStories_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f19405j = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.circleProgressStories_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) viewFindViewById3;
        this.k = collapsingActionButton;
        View viewFindViewById4 = itemView.findViewById(R$id.circleProgressStories_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        CollapsingActionButton collapsingActionButton2 = (CollapsingActionButton) viewFindViewById4;
        this.f19406l = collapsingActionButton2;
        View viewFindViewById5 = itemView.findViewById(R$id.circleProgressStories_twinHorizontalButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f19407m = (TwinHorizontalButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.circleProgressStories_progressWithText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f19408n = (CircleProgressBarWithText) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.circleProgressStories_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.circleProgressStories_topSpacing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f19409p = viewFindViewById8;
        this.f19410q = itemView;
        CollapsingActionButton[] elements = {collapsingActionButton, collapsingActionButton2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f19411r = kotlin.collections.d.E(elements);
    }

    @Override // bx0.d
    public final void F(int i, int i2) {
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setPadding(itemView.getPaddingLeft(), itemView.getPaddingTop(), itemView.getPaddingRight(), i2);
        or0.u.w(i, this.f19409p);
    }

    public final CollapsingActionButton H() {
        return this.k;
    }

    public final TextView I() {
        return this.o;
    }

    public final CircleProgressBarWithText J() {
        return this.f19408n;
    }

    public final CollapsingActionButton K() {
        return this.f19406l;
    }

    public final TextView M() {
        return this.f19405j;
    }

    public final TextView N() {
        return this.i;
    }

    public final TwinHorizontalButton O() {
        return this.f19407m;
    }
}
