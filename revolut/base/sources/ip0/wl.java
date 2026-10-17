package ip0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.RadialGaugeView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.TimerView;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wl extends koi.b {
    public final ConstraintHeaderLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f167043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f167044h;
    public final FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatImageView f167045j;
    public CircleProgressBar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TimerView f167046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SmallActionButton f167047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RadialGaugeView f167048n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.headerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintHeaderLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.headerExtraContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167043g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.header_extraClickableArea);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167044h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.imageContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (FrameLayout) viewFindViewById4;
    }

    public static void H(wl wlVar, int i) {
        boolean z = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) == 0;
        boolean z6 = (i & 8) == 0;
        FrameLayout frameLayout = wlVar.i;
        AppCompatImageView appCompatImageView = wlVar.f167045j;
        if (appCompatImageView != null || z) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(wlVar.itemView.getContext());
                wlVar.f167045j = appCompatImageView;
                int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(wlVar.itemView, "getContext(...)", 40.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
                layoutParams.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams);
                frameLayout.addView(appCompatImageView);
            }
            appCompatImageView.setVisibility(z ? 0 : 8);
        }
        RadialGaugeView radialGaugeView = wlVar.f167048n;
        if (radialGaugeView != null || z3) {
            if (radialGaugeView == null) {
                Context context = wlVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                radialGaugeView = new RadialGaugeView(context, null, 6, 0);
                wlVar.f167048n = radialGaugeView;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(com.google.android.gms.internal.mlkit_vision_face.a.a(wlVar.itemView, "getContext(...)", 64.0f), -2);
                layoutParams2.gravity = 49;
                radialGaugeView.setLayoutParams(layoutParams2);
                frameLayout.addView(radialGaugeView);
            }
            radialGaugeView.setVisibility(z3 ? 0 : 8);
        }
        TimerView timerView = wlVar.f167046l;
        if (timerView != null || z4) {
            if (timerView == null) {
                Context context2 = wlVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                timerView = new TimerView(context2, null, 6, 0);
                wlVar.f167046l = timerView;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 17;
                timerView.setLayoutParams(layoutParams3);
                frameLayout.addView(timerView);
            }
            timerView.setVisibility(z4 ? 0 : 8);
        }
        SmallActionButton smallActionButton = wlVar.f167047m;
        if (smallActionButton != null || z6) {
            if (smallActionButton == null) {
                Context context3 = wlVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                smallActionButton = new SmallActionButton(context3, null, 6, 0);
                wlVar.f167047m = smallActionButton;
                int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(wlVar.itemView, "getContext(...)", 40.0f);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iA2, iA2);
                layoutParams4.gravity = 17;
                smallActionButton.setLayoutParams(layoutParams4);
                smallActionButton.i(ms0.h4.SEMIACCENT);
                frameLayout.addView(smallActionButton);
            }
            smallActionButton.setVisibility(z6 ? 0 : 8);
        }
    }

    public final void F(TagViewData tagViewData) {
        View view = this.f167044h;
        if (view.getVisibility() == 0) {
            int i = tagViewData == null ? R$id.headerLayout_animatedViewContainer : R$id.internal_headerLayout_titleTagView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            if (((ConstraintLayout.LayoutParams) layoutParams).startToEnd != i) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                layoutParams3.startToEnd = i;
                view.setLayoutParams(layoutParams3);
            }
        }
    }
}
