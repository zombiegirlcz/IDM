package bx0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends d {
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f19449j;
    public final CollapsingActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CollapsingActionButton f19450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TwinHorizontalButton f19451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f19452n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f19453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Sequence f19454q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.simpleStories_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.simpleStories_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f19449j = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.simpleStories_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) viewFindViewById3;
        this.k = collapsingActionButton;
        View viewFindViewById4 = itemView.findViewById(R$id.simpleStories_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        CollapsingActionButton collapsingActionButton2 = (CollapsingActionButton) viewFindViewById4;
        this.f19450l = collapsingActionButton2;
        View viewFindViewById5 = itemView.findViewById(R$id.simpleStories_twinHorizontalButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f19451m = (TwinHorizontalButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.simpleStories_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f19452n = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.simpleStories_topSpacing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = viewFindViewById7;
        this.f19453p = itemView;
        CollapsingActionButton[] elements = {collapsingActionButton, collapsingActionButton2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f19454q = kotlin.collections.d.E(elements);
    }

    @Override // bx0.d
    public final void F(int i, int i2) {
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setPadding(itemView.getPaddingLeft(), itemView.getPaddingTop(), itemView.getPaddingRight(), i2);
        or0.u.w(i, this.o);
    }

    public final CollapsingActionButton H() {
        return this.k;
    }

    public final TextView I() {
        return this.f19452n;
    }

    public final CollapsingActionButton J() {
        return this.f19450l;
    }

    public final TextView K() {
        return this.f19449j;
    }

    public final TextView M() {
        return this.i;
    }

    public final TwinHorizontalButton N() {
        return this.f19451m;
    }
}
