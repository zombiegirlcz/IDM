package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w9 extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166959h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f166960j;
    public final CircleBadgeView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TagView f166961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f166962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f166963n;
    public final SecondaryBackgroundConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ix0.l0 f166964p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new au0.z3(itemView, 1));
        View viewFindViewById = itemView.findViewById(R$id.challengeMediumDelegate_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f166958g = imageView;
        View viewFindViewById2 = itemView.findViewById(R$id.challengeMediumDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166959h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.challengeMediumDelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.challengeMediumDelegate_points);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f166960j = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.challengeMediumDelegate_badgeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (CircleBadgeView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.challengeMediumDelegate_badgeTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f166961l = (TagView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.challengeMediumDelegate_linearProgressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166962m = (ProgressBar) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.challengeMediumDelegate_bottomSection);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f166963n = viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.challengeMediumDelegate_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.o = (SecondaryBackgroundConstraintLayout) viewFindViewById9;
        this.f166964p = new ix0.l0((ViewGroup) itemView, zhm.f0.f322471a);
        rd0.e.r(imageView, new yp0.p(R$attr.uikit_colorForeground));
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    @Override // xv0.m
    public final void setItemRenderState(xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        xv0.n nVar = this.f;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        nVar.f309159b = iVar;
    }
}
