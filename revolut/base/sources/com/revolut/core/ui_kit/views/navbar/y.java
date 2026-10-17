package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.view.View;
import aw0.v1;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.s0;
import kotlin.jvm.internal.Intrinsics;
import tx0.o4;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends koi.b implements o4 {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f59555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f59556h;
    public final x8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ StoryNavBarContentView.LoadingStoryPageDelegate f59557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(StoryNavBarContentView.LoadingStoryPageDelegate loadingStoryPageDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f59557j = loadingStoryPageDelegate;
        View viewFindViewById = itemView.findViewById(R$id.navBarRegularLoadingStoryPage_titleShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.navBarRegularLoadingStoryPage_subtitleShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f59555g = viewFindViewById2;
        this.f59556h = (ShimmerFrameLayout) itemView;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = 0;
        int i2 = 6;
        viewFindViewById.setBackground(new RoundedBackgroundDrawable(context, i, i2));
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        viewFindViewById2.setBackground(new RoundedBackgroundDrawable(context2, i, i2));
        StoryNavBarContentView storyNavBarContentView = StoryNavBarContentView.this;
        Context context3 = storyNavBarContentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBackground, context3);
        v1 v1Var = v1.DARK;
        Context context4 = storyNavBarContentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iS2 = kli.a.s(R$attr.uikit_colorWhite_20, context4);
        Context context5 = storyNavBarContentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Intrinsics.checkNotNullParameter(context5, "context");
        this.i = new x8(v1Var, iS2, iS, null, s0.a(context5, jh.d.g(context5), kli.a.q(context5), iS), iS);
    }

    @Override // tx0.o4
    public final void E(float f, int i) {
    }

    @Override // tx0.o4
    public final void j() {
        or0.u.z(this.f59555g, 0, 0, 0, StoryNavBarContentView.this.o, false, 23);
    }

    @Override // tx0.o4
    public final x8 l() {
        return this.i;
    }

    @Override // tx0.o4
    public final void n() {
    }
}
