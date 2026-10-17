package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.x8;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tx0.o1;
import tx0.o4;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends koi.b implements o4, xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WallpaperView f59515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f59516h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f59517j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x8 f59518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StoryNavBarContentView.RegularStoryPageDelegate f59519m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(StoryNavBarContentView.RegularStoryPageDelegate regularStoryPageDelegate, View itemView) {
        super(itemView);
        View viewFindViewById = itemView.findViewById(R$id.navBarRegularStoryPage_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        WallpaperView background = (WallpaperView) viewFindViewById;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f59519m = regularStoryPageDelegate;
        this.f = new xv0.n(new th9.t(background, 28));
        this.f59515g = background;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarRegularStoryPage_titleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f59516h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.navBarRegularStoryPage_subtitleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.navBarRegularStoryPage_subtitleChevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f59517j = imageView;
        View viewFindViewById5 = itemView.findViewById(R$id.navBarRegularStoryPage_subtitleClickableArea);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = viewFindViewById5;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setBackground(new RoundedBackgroundDrawable(context, 0, 6));
        background.f57381b.h().subscribe(new o1(new twg.a(this, StoryNavBarContentView.this, 7), 18));
    }

    @Override // tx0.o4
    public final void E(float f, int i) {
        this.f59515g.d(f, i);
    }

    public final void F(x8 palette) {
        Intrinsics.checkNotNullParameter(palette, "palette");
        this.f59518l = palette;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(palette.f10609a.a(), context);
        this.f59516h.setTextColor(iS);
        this.i.setTextColor(iS);
        ImageView imageView = this.f59517j;
        Drawable background = imageView.getBackground();
        Intrinsics.i(background, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable");
        ((RoundedBackgroundDrawable) background).e(palette.f10610b);
        rd0.e.q(imageView, Integer.valueOf(iS));
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

    @Override // tx0.o4
    public final void j() {
        int i = StoryNavBarContentView.this.f59483p;
        TextView textView = this.i;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.bottomMargin = i;
        TextView textView2 = this.f59516h;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams2).goneBottomMargin = i;
        textView.requestLayout();
        if (textView.getVisibility() == 0) {
            return;
        }
        textView2.requestLayout();
    }

    @Override // tx0.o4
    public final x8 l() {
        return this.f59518l;
    }

    @Override // tx0.o4
    public final void n() {
        this.f59515g.setOffset(StoryNavBarContentView.this.f59480l);
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
