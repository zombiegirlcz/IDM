package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ActionStatusView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.SocialProofView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 extends koi.b implements xv0.m, ur0.e {
    public final ConstraintLayout A;
    public final ArrayList B;
    public final ArrayList C;
    public AppCompatImageView D;
    public final ro0.u E;
    public final ArrayList F;
    public final fp0.p G;
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166431h;
    public fp0.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fp0.p f166432j;
    public final SocialProofView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f166433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActionsView f166434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ActionStatusView f166435n;
    public final LinearLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f166436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UiKitPlayerView f166437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f166438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HorizontalStepsProgressView f166439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f166440t;
    public final SmallActionButton u;
    public final ActionStatusView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f166441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f166442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f166443y;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t4(View itemView) {
        super(itemView);
        View viewFindViewById = itemView.findViewById(R$id.bigTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView title = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.bigTile_cardBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView background = (ImageView) viewFindViewById2;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f = new xv0.n(new ie7.a(background, 5));
        this.f166430g = title;
        this.f166431h = background;
        View viewFindViewById3 = itemView.findViewById(R$id.bigTile_socialProof);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.k = (SocialProofView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.bigTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.f166433l = textView;
        View viewFindViewById5 = itemView.findViewById(R$id.bigTile_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166434m = (ActionsView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.bigTile_actionStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f166435n = (ActionStatusView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.bigTile_badgeStatusContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.o = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.bigTile_badgeStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f166436p = zhm.v.n(viewFindViewById8);
        View viewFindViewById9 = itemView.findViewById(R$id.bigTile_playerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f166437q = (UiKitPlayerView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.bigTile_gradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f166438r = viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.bigTile_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f166439s = (HorizontalStepsProgressView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.bigTile_footerGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f166440t = (ConstraintLayout) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.bigTile_footerAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.u = (SmallActionButton) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.bigTile_footerLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.v = (ActionStatusView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.bigTile_footerText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f166441w = (TextView) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.bigTile_footerForeground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.f166442x = viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.bigTile_endBottomImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.f166443y = (ImageView) viewFindViewById17;
        View viewFindViewById18 = itemView.findViewById(R$id.bigTile_dimmedOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        this.z = viewFindViewById18;
        this.A = (ConstraintLayout) itemView;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.E = new ro0.u(0);
        this.F = new ArrayList();
        fp0.p.Companion.getClass();
        this.G = fp0.m.a(textView, gp0.b.f145198a);
    }

    public final jr0.g F() {
        jr0.f fVar = jr0.g.Companion;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fVar.getClass();
        return jr0.f.a(itemView);
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
