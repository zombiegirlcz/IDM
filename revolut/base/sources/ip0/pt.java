package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.BadgeStatusView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pt extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f165862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f165863h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f165864j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f165865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BadgeStatusView f165866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f165867n;
    public Image o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R$id.linearProgressWithAmount_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AppCompatImageView imageView = (AppCompatImageView) viewFindViewById;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.f = new xv0.n(new ie7.a(imageView, 10));
        this.f165862g = imageView;
        View viewFindViewById2 = view.findViewById(R$id.linearProgressWithAmount_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165863h = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.linearProgressWithAmount_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.linearProgressWithAmount_progressBarContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f165864j = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.linearProgressWithAmount_bottomText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById5;
        this.k = appCompatTextView;
        View viewFindViewById6 = view.findViewById(R$id.linearProgressWithAmount_topAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById6;
        this.f165865l = appCompatTextView2;
        View viewFindViewById7 = view.findViewById(R$id.linearProgressWithAmount_badgeStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165866m = (BadgeStatusView) viewFindViewById7;
        ix0.c0 c0Var = ix0.c0.f169220a;
        appCompatTextView.setMovementMethod(c0Var);
        appCompatTextView2.setMovementMethod(c0Var);
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
