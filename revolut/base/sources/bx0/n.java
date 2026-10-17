package bx0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesPageDelegate$ViewHolder$1;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends d {
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f19428j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f19429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f19430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BottomSwipeView f19431n;
    public final CollapsingActionButton o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CollapsingActionButton f19432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TwinHorizontalButton f19433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayoutCompat f19434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z4l.j f19435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Sequence f19436t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MetadataStoriesPageDelegate metadataStoriesPageDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.metadataStories_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.metadataStories_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f19428j = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.metadataStories_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.k = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.metadataStories_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f19429l = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.metadataStories_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f19430m = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.metadataStories_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.metadataStories_bottomSwipeView);
        BottomSwipeView bottomSwipeView = (BottomSwipeView) viewFindViewById7;
        bottomSwipeView.j0();
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "apply(...)");
        this.f19431n = bottomSwipeView;
        View viewFindViewById8 = itemView.findViewById(R$id.metadataStories_primaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.o = (CollapsingActionButton) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.metadataStories_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f19432p = (CollapsingActionButton) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.metadataStories_twinHorizontalButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f19433q = (TwinHorizontalButton) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.metadataStories_buttonContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f19434r = (LinearLayoutCompat) viewFindViewById11;
        z4l.j jVar = new z4l.j(7, zhm.u.c(metadataStoriesPageDelegate.i), false);
        this.f19435s = jVar;
        this.f19436t = nkm.t.d();
        yp0.y.h(recyclerView, jVar, new MetadataStoriesPageDelegate$ViewHolder$1(itemView.getContext(), 1, false));
        recyclerView.setItemAnimator(null);
    }

    @Override // bx0.d
    public final void F(int i, int i2) {
        koi.j jVar = this.e;
        MetadataStoriesModel metadataStoriesModel = jVar instanceof MetadataStoriesModel ? (MetadataStoriesModel) jVar : null;
        if (metadataStoriesModel == null) {
            return;
        }
        if (metadataStoriesModel.f == null) {
            throw new NoWhenBranchMatchedException();
        }
        BottomSwipeView bottomSwipeView = this.f19431n;
        bottomSwipeView.l0(i2);
        or0.u.x(this.f19428j, 0, 0, 0, bottomSwipeView.getLayoutParams().height - bottomSwipeView.getCornerRadius());
        or0.u.x(this.f19434r, 0, 0, 0, 0);
    }

    public final BottomSwipeView H() {
        return this.f19431n;
    }

    public final LinearLayoutCompat I() {
        return this.f19434r;
    }

    public final TextView J() {
        return this.f19430m;
    }

    public final ImageView K() {
        return this.k;
    }

    public final CollapsingActionButton M() {
        return this.o;
    }

    public final ConstraintLayout N() {
        return this.i;
    }

    public final CollapsingActionButton O() {
        return this.f19432p;
    }

    public final TextView P() {
        return this.f19429l;
    }

    public final TwinHorizontalButton R() {
        return this.f19433q;
    }

    public final void S(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19435s.c(items);
    }
}
