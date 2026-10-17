package bx0;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends d {
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f19458j;
    public final CollapsingActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CollapsingActionButton f19459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TwinHorizontalButton f19460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f19461n;
    public final StickerView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f19462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f19463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BottomSwipeView f19464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Sequence f19465s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.stickerStories_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.stickerStories_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f19458j = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.stickerStories_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        CollapsingActionButton collapsingActionButton = (CollapsingActionButton) viewFindViewById3;
        this.k = collapsingActionButton;
        View viewFindViewById4 = itemView.findViewById(R$id.stickerStories_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        CollapsingActionButton collapsingActionButton2 = (CollapsingActionButton) viewFindViewById4;
        this.f19459l = collapsingActionButton2;
        View viewFindViewById5 = itemView.findViewById(R$id.stickerStories_twinHorizontalButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f19460m = (TwinHorizontalButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.stickerStories_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f19461n = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.storiesCard_stickerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = (StickerView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.storiesCard_rootConstraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f19462p = (ConstraintLayout) viewFindViewById8;
        this.f19463q = itemView;
        View viewFindViewById9 = itemView.findViewById(R$id.storiesCard_bottomSwipeView);
        BottomSwipeView bottomSwipeView = (BottomSwipeView) viewFindViewById9;
        bottomSwipeView.j0();
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "apply(...)");
        this.f19464r = bottomSwipeView;
        CollapsingActionButton[] elements = {collapsingActionButton, collapsingActionButton2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f19465s = kotlin.collections.d.E(elements);
    }

    @Override // bx0.d
    public final void F(int i, int i2) {
        koi.j jVar = this.e;
        StickerStoriesModel stickerStoriesModel = jVar instanceof StickerStoriesModel ? (StickerStoriesModel) jVar : null;
        if ((stickerStoriesModel != null ? stickerStoriesModel.u : null) == null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setPadding(itemView.getPaddingLeft(), i, itemView.getPaddingRight(), i2);
        } else {
            View itemView2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            itemView2.setPadding(itemView2.getPaddingLeft(), i, itemView2.getPaddingRight(), 0);
            this.f19464r.l0(i2);
        }
    }

    public final BottomSwipeView H() {
        return this.f19464r;
    }

    public final CollapsingActionButton I() {
        return this.k;
    }

    public final TextView J() {
        return this.f19461n;
    }

    public final ConstraintLayout K() {
        return this.f19462p;
    }

    public final CollapsingActionButton M() {
        return this.f19459l;
    }

    public final StickerView N() {
        return this.o;
    }

    public final TextView O() {
        return this.f19458j;
    }

    public final TextView P() {
        return this.i;
    }

    public final TwinHorizontalButton R() {
        return this.f19460m;
    }
}
