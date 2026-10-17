package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LockableImageView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w9 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54909h;
    public final LockableImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LockableImageView f54910j;
    public final OverlappedIconsView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f54911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f54912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f54913n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f54914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fp0.p f54915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fp0.p f54916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fp0.p f54917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f54918t;
    public final int u;
    public final rr0.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.newsdelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.newsdelegate_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54908g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.newsdelegate_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54909h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.newsdelegate_image);
        LockableImageView lockableImageView = (LockableImageView) viewFindViewById4;
        lockableImageView.setShapeAppearanceModel(lockableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(0, com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 12.0f)).build());
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "apply(...)");
        this.i = lockableImageView;
        View viewFindViewById5 = view.findViewById(R$id.newsdelegate_highlightedimage);
        LockableImageView lockableImageView2 = (LockableImageView) viewFindViewById5;
        ShapeAppearanceModel.Builder builder = lockableImageView2.getShapeAppearanceModel().toBuilder();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShapeAppearanceModel.Builder topLeftCorner = builder.setTopLeftCorner(0, kli.a.l(context, 8.0f));
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        lockableImageView2.setShapeAppearanceModel(topLeftCorner.setTopRightCorner(0, kli.a.l(context2, 8.0f)).setBottomLeftCorner(0, BitmapDescriptorFactory.HUE_RED).setBottomRightCorner(0, BitmapDescriptorFactory.HUE_RED).build());
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "apply(...)");
        this.f54910j = lockableImageView2;
        View viewFindViewById6 = view.findViewById(R$id.newsdelegate_footerimages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (OverlappedIconsView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.newsdelegate_clickableRoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById7;
        this.f54911l = constraintLayout;
        View viewFindViewById8 = view.findViewById(R$id.newsdelegate_contentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54912m = (ConstraintLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.newsdelegate_firststrap);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById9;
        this.f54913n = textView;
        View viewFindViewById10 = view.findViewById(R$id.newsdelegate_secondstrap);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById10;
        this.o = textView2;
        View viewFindViewById11 = view.findViewById(R$id.newsdelegate_strapseparator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54914p = (TextView) viewFindViewById11;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        this.f54915q = fp0.m.a(constraintLayout, gVar);
        gp0.b bVar = gp0.b.f145198a;
        this.f54916r = fp0.m.a(textView, bVar);
        this.f54917s = fp0.m.a(textView2, bVar);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f54918t = kli.a.s(R$attr.uikit_colorForeground, context3);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.u = kli.a.s(R$attr.uikit_colorGreyTone50, context4);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.v = vc.s.d(this, new nq0.e(itemView), new fu0.l(this), 8);
    }
}
