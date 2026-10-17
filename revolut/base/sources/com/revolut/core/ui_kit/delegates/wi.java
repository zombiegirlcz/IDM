package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ao0;
import ip0.yn0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class wi extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54934h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f54935j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f54936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UiKitMediaView f54937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f54938n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new au0.z3(itemView, 14));
        View viewFindViewById = itemView.findViewById(R$id.extraSmallVoucherTile_voucherTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54933g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.extraSmallVoucherTile_voucherSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54934h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.extraSmallVoucherTile_subtitleIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.extraSmallVoucherTile_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54935j = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.extraSmallVoucherTile_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.extraSmallVoucherTile_grayMask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54936l = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.extraSmallVoucherTile_mediaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54937m = (UiKitMediaView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.extraSmallVoucherTile_foregroundRipple);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54938n = viewFindViewById8;
    }

    public static void F(VoucherExtraSmallTileDelegate.Model data, wi holder) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f54938n.setVisibility((!data.f53599h || data.f53598g == ao0.LOCKED) ? 8 : 0);
    }

    public static void N(VoucherExtraSmallTileDelegate.Model data, wi holder) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f54936l.setVisibility(data.f53598g == ao0.LOCKED ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    public final void H(yn0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == null) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        UiKitMediaView uiKitMediaView = this.f54937m;
        uiKitMediaView.setImageScaleType(scaleType);
        xv0.m.e0(this, content.f167340a, uiKitMediaView.i(), null, 14);
    }

    public final void I(Image image) {
        this.f54935j.setVisibility(image != null ? 0 : 8);
        this.k.setVisibility(image != null ? 0 : 8);
        View view = this.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), image, this.f54935j, null, null, 12);
    }

    public final void J(TextClause textClause, Image image) {
        View view = this.itemView;
        ty0.c.b(h30.l.x(view, "itemView", view), textClause, this.f54934h, null, null, 12);
        TextView textView = this.f54934h;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int length = text.length();
        ImageView imageView = this.i;
        if (length == 0) {
            textView.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (image == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        View view2 = this.itemView;
        yy0.f.e(h30.l.z(view2, "itemView", view2), image, this.i, null, null, 12);
    }

    public final void K(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        View view = this.itemView;
        ty0.c.b(h30.l.x(view, "itemView", view), title, this.f54933g, null, null, 12);
    }

    public final void M(qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        int i = positionInBox instanceof c.d ? R$attr.uikit_colorBackground : R$attr.uikit_colorWidgetBackground;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k.setBackgroundTintList(ColorStateList.valueOf(kli.a.s(i, context)));
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
