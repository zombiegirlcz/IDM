package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.UIKitRecyclerView;
import ip0.ix;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ma extends koi.b {
    public final RowDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zf f54463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f54464h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatImageButton f54465j;
    public final fp0.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f54466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WallpaperAssetSwitcher f54467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UIKitRecyclerView f54468n;
    public final z4l.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public aw0.x8 f54469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RowDelegate.Model f54470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ip0.md f54471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f = rowDelegate;
        View viewFindViewById = itemView.findViewById(R$id.photoBannerLarge_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54464h = (UIKitTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.photoBannerLarge_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.photoBannerLarge_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) viewFindViewById3;
        this.f54465j = appCompatImageButton;
        fp0.p.Companion.getClass();
        this.k = fp0.m.a(appCompatImageButton, gp0.b.f145198a);
        this.f54466l = fp0.m.a(itemView, new gp0.h(new gp0.f(gp0.c.FOREGROUND, 2), fp0.b.f137017a));
        View viewFindViewById4 = itemView.findViewById(R$id.photoBannerLarge_backgroundContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = new WallpaperAssetSwitcher(context, null, 2);
        this.f54467m = wallpaperAssetSwitcher;
        this.o = new z4l.j(7, zhm.u.c(new ProgressStepVerticalV2Delegate()), false);
        ((FrameLayout) viewFindViewById4).addView(wallpaperAssetSwitcher, new FrameLayout.LayoutParams(-1, -1));
        wallpaperAssetSwitcher.setVideoScaleType(oz0.b.CENTER_CROP);
        wallpaperAssetSwitcher.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 11));
        wallpaperAssetSwitcher.h().subscribe(new ix(21, new i4g.g(1, this, ma.class, "applyContextualPalette", "applyContextualPalette(Lcom/revolut/core/ui_kit/models/PicturePalette;)V", 0, 24)));
        View viewFindViewById5 = this.itemView.findViewById(R$id.photoBannerLarge_rowContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById5;
        zf zfVarA = RowDelegate.A(frameLayout);
        Intrinsics.checkNotNullParameter(zfVarA, "<set-?>");
        this.f54463g = zfVarA;
        frameLayout.addView(I().itemView);
        I().itemView.getLayoutParams().height = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 52.0f);
        rowDelegate.f53218h.subscribe(new ix(22, new ip0.ad(this, 29)));
    }

    public final void F() {
        aw0.x8 x8Var = this.f54469p;
        if (x8Var == null) {
            return;
        }
        aw0.v1 v1Var = x8Var.f10609a;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gs0.c cVar = new gs0.c(context, v1Var);
        int iS = kli.a.s(v1Var.a(), cVar);
        this.f54464h.setTextColor(iS);
        this.i.setTextColor(io0.a.b(0.7f, iS));
        rd0.e.q(this.f54465j, Integer.valueOf(iS));
        RowDelegate.Model model = this.f54470q;
        if (model == null) {
            return;
        }
        I().i.setTextColor(iS);
        rd0.e.q(I().f55695g, Integer.valueOf(iS));
        ImageView imageView = (ImageView) I().M.b(R$layout.internal_delegate_row_image);
        if (imageView != null) {
            rd0.e.q(imageView, Integer.valueOf(kli.a.s(R$attr.uikit_colorGrey20, cVar)));
        }
        View itemView = I().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this.f, model, itemView, true, new dr0.i(new Color.SolidInt(kli.a.s(R$attr.uikit_colorWidgetBackground, cVar))), 16);
    }

    public final void H(aw0.v1 v1Var) {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorGroupedBackground, new gs0.c(context, v1Var));
        this.f54467m.setForeground(new LayerDrawable(new GradientDrawable[]{new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{io0.a.b(0.7f, iS), 0, 0}), new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iS, io0.a.b(this.f54468n != null ? 0.6f : 0.2f, iS), 0})}));
    }

    public final zf I() {
        zf zfVar = this.f54463g;
        if (zfVar != null) {
            return zfVar;
        }
        Intrinsics.r("rowDelegateViewHolder");
        throw null;
    }
}
