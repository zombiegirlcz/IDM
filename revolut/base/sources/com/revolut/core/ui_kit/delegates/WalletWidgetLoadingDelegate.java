package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.WalletWidgetFooterBackgroundDrawable;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.qn0;
import ip0.to0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WalletWidgetLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/to0;", "Lft0/m;", "<init>", "()V", "Companion", "ip0/uo0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletWidgetLoadingDelegate extends BaseBoxRecyclerViewDelegate<to0, ft0.m> {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public WalletWidgetLoadingDelegate() {
        super(R$id.internal_wallet_widget_loading_delegate_type, true, new qn0(6));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        float fV = kli.a.v(R$attr.uikit_box_corner_radius, context);
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 16.0f);
        int iK3 = kli.a.k(context, 64.0f);
        int iK4 = kli.a.k(context, 16.0f);
        int iK5 = kli.a.k(context, 14.0f);
        int iX = kli.a.x(R$attr.uikit_shimmerBackgroundRect, context);
        int iX2 = kli.a.x(R$attr.uikit_shimmerBackgroundCircle, context);
        if (iX == 0) {
            throw new IllegalArgumentException("uikit_shimmerBackgroundRect is missing");
        }
        if (iX2 == 0) {
            throw new IllegalArgumentException("uikit_shimmerBackgroundCircle is missing");
        }
        Drawable drawable = context.getDrawable(iX);
        if (drawable == null) {
            throw new IllegalStateException("uikit_shimmerBackgroundRect drawable cannot be loaded");
        }
        Drawable drawable2 = context.getDrawable(iX2);
        if (drawable2 == null) {
            throw new IllegalStateException("uikit_shimmerBackgroundCircle drawable cannot be loaded");
        }
        ShimmerFrameLayout itemView = new ShimmerFrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, kli.a.k(context, 150.0f));
        marginLayoutParams.setMarginStart(kli.a.k(context, 16.0f));
        marginLayoutParams.setMarginEnd(kli.a.k(context, 16.0f));
        marginLayoutParams.topMargin = kli.a.k(context, 8.0f);
        marginLayoutParams.bottomMargin = kli.a.k(context, 8.0f);
        itemView.setLayoutParams(marginLayoutParams);
        itemView.setClipToOutline(true);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        int iGenerateViewId3 = View.generateViewId();
        int iGenerateViewId4 = View.generateViewId();
        int iGenerateViewId5 = View.generateViewId();
        View view = new View(context);
        view.setId(iGenerateViewId);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fV);
        gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorGreyTone8, context));
        view.setBackground(gradientDrawable);
        view.setForeground(nv0.b.a(fV, kli.a.l(context, 1.0f)));
        View view2 = new View(context);
        view2.setId(iGenerateViewId2);
        view2.setBackground(drawable);
        View view3 = new View(context);
        view3.setId(iGenerateViewId3);
        view3.setBackground(drawable);
        View view4 = new View(context);
        view4.setId(iGenerateViewId4);
        view4.setBackground(drawable2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(iGenerateViewId5);
        frameLayout.setBackground(new WalletWidgetFooterBackgroundDrawable(kli.a.s(R$attr.uikit_colorPopoverBackground, context), fV, kli.a.l(context, 18.0f), kli.a.l(context, 10.0f), kli.a.l(context, 6.0f)));
        View view5 = new View(context);
        view5.setBackground(drawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kli.a.k(context, 120.0f), iK5);
        layoutParams.gravity = 17;
        view5.setLayoutParams(layoutParams);
        frameLayout.addView(view5);
        constraintLayout.addView(view);
        constraintLayout.addView(view2);
        constraintLayout.addView(view3);
        constraintLayout.addView(view4);
        constraintLayout.addView(frameLayout);
        int iK6 = kli.a.k(context, 32.0f);
        int i = iK2 + iK4;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.constrainWidth(iGenerateViewId, 0);
        constraintSet.constrainHeight(iGenerateViewId, kli.a.k(context, 134.0f));
        constraintSet.connect(iGenerateViewId, 6, 0, 6, iK);
        constraintSet.connect(iGenerateViewId, 7, 0, 7, iK);
        constraintSet.connect(iGenerateViewId, 3, 0, 3, iK2);
        constraintSet.constrainWidth(iGenerateViewId2, 0);
        constraintSet.constrainPercentWidth(iGenerateViewId2, 0.52f);
        constraintSet.constrainHeight(iGenerateViewId2, iK5);
        int i2 = iK + iK4;
        constraintSet.connect(iGenerateViewId2, 6, 0, 6, i2);
        constraintSet.connect(iGenerateViewId2, 7, 0, 7, 0);
        constraintSet.setHorizontalBias(iGenerateViewId2, BitmapDescriptorFactory.HUE_RED);
        constraintSet.connect(iGenerateViewId2, 3, 0, 3, i);
        constraintSet.constrainWidth(iGenerateViewId3, 0);
        constraintSet.constrainPercentWidth(iGenerateViewId3, 0.26f);
        constraintSet.constrainHeight(iGenerateViewId3, iK5);
        constraintSet.connect(iGenerateViewId3, 6, 0, 6, i2);
        constraintSet.connect(iGenerateViewId3, 7, 0, 7, 0);
        constraintSet.setHorizontalBias(iGenerateViewId3, BitmapDescriptorFactory.HUE_RED);
        constraintSet.connect(iGenerateViewId3, 3, iGenerateViewId2, 4, kli.a.k(context, 8.0f));
        constraintSet.constrainWidth(iGenerateViewId4, iK6);
        constraintSet.constrainHeight(iGenerateViewId4, iK6);
        constraintSet.connect(iGenerateViewId4, 7, 0, 7, i2);
        constraintSet.connect(iGenerateViewId4, 3, 0, 3, i);
        constraintSet.constrainWidth(iGenerateViewId5, 0);
        constraintSet.constrainHeight(iGenerateViewId5, iK3);
        constraintSet.connect(iGenerateViewId5, 6, 0, 6, 0);
        constraintSet.connect(iGenerateViewId5, 7, 0, 7, 0);
        constraintSet.connect(iGenerateViewId5, 4, 0, 4, 0);
        constraintSet.applyTo(constraintLayout);
        itemView.addView(constraintLayout);
        ifk.b.r(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new ft0.m(itemView);
    }
}
