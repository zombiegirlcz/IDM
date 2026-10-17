package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g7 extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CutoutImageView f54201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeView f54202h;
    public final CircleBadgeView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fp0.p f54203j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aw0.gb f54204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dp f54205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ix0.l0 f54206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new au0.z3(itemView, 5));
        View viewFindViewById = itemView.findViewById(R$id.icon_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f54201g = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.icon_badgeTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54202h = (CircleBadgeView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.icon_badgeBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (CircleBadgeView) viewFindViewById3;
        fp0.m mVar = fp0.p.Companion;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gp0.h hVar = new gp0.h(new hp0.c(null, dr0.l.h(context, 14.0f, new Color.Solid(R$attr.uikit_colorForeground), 0, null), 1), new gp0.f(gp0.c.FOREGROUND, cutoutImageView), new fp0.g(new Color.Solid(R$attr.uikit_colorForeground)));
        mVar.getClass();
        this.f54203j = fp0.m.a(itemView, hVar);
        View viewFindViewById4 = itemView.findViewById(R$id.icon_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (TextView) viewFindViewById4;
        this.f54204l = new aw0.gb(cutoutImageView);
        this.f54205m = new dp();
        this.f54206n = new ix0.l0((ViewGroup) itemView, zhm.u.c(cutoutImageView));
    }

    public final void F(d7 style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.f(style, c7.f53745a)) {
            i = R$attr.uikit_colorWhite;
        } else {
            if (!Intrinsics.f(style, b7.f53715a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorForeground;
        }
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.k.setTextColor(kli.a.t(kli.a.x(i, context2), context));
    }

    public final void H(e7 style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        int i2 = f7.f54146a[style.ordinal()];
        if (i2 == 1) {
            i = -1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = -2;
        }
        if (this.itemView.getLayoutParams().width != i) {
            this.itemView.getLayoutParams().width = i;
        }
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
