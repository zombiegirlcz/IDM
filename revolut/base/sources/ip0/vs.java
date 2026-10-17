package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vs extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UiKitMediaView f166882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166883h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f166884j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f166885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FlexboxLayout f166886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f166887n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f166888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OverlappedIconsView f166889q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new au0.z3(itemView, 6));
        View viewFindViewById = itemView.findViewById(R$id.largeVoucherTile_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f166882g = (UiKitMediaView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.largeVoucherTile_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166883h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.largeVoucherTile_logoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.largeVoucherTile_logoBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f166884j = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.largeVoucherTile_actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (SmallActionButton) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.largeVoucherTile_grayMask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f166885l = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.largeVoucherTile_tagsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166886m = (FlexboxLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.largeVoucherTile_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f166887n = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.largeVoucherTile_subtitleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.o = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.largeVoucherTile_foregroundRipple);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f166888p = viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.largeVoucherTile_images);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f166889q = (OverlappedIconsView) viewFindViewById11;
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
