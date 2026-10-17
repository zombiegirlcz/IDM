package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.internal.drawables.StaticBorderGradientDrawable;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.do0;
import ip0.e70;
import ip0.fo0;
import ip0.go0;
import ip0.ho0;
import ip0.jo0;
import ip0.ko0;
import ip0.mo0;
import ip0.no0;
import ip0.oo0;
import ip0.w10;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class dj extends koi.b implements xv0.m {
    public final Lazy A;
    public final float[] B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy G;
    public final fp0.p H;
    public final fp0.p I;
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f54056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54057h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f54058j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f54059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f54060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TagView f54061n;
    public final TagView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f54062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UiKitMediaView f54063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f54064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f54065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ProgressBar f54066t;
    public boolean u;
    public no0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fo0 f54067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f54068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public StaticBorderGradientDrawable f54069y;
    public Float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        int i = 15;
        this.f = new xv0.n(new au0.z3(itemView, i));
        View viewFindViewById = itemView.findViewById(R$id.smallVoucherTile_voucherTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54056g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.smallVoucherTile_voucherSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54057h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.smallVoucherTile_subtitleIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.smallVoucherTile_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54058j = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.smallVoucherTile_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.voucherSmallTile_topRightIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f54059l = imageView;
        View viewFindViewById7 = itemView.findViewById(R$id.voucherSmallTile_overlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54060m = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.smallVoucherTile_voucherTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54061n = (TagView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.smallVoucherTile_voucherExtraTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.o = (TagView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.voucherSmallTile_lockedOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f54062p = viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.smallVoucherTile_mediaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54063q = (UiKitMediaView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.smallVoucherTile_bottomLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f54064r = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.smallVoucherTile_blurOverlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f54065s = viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.smallVoucherTile_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f54066t = (ProgressBar) viewFindViewById14;
        this.v = mo0.f165410a;
        this.A = yhm.j.b(new e70(i));
        this.B = new float[]{BitmapDescriptorFactory.HUE_RED, 0.3f, 0.65f, 1.0f};
        int i2 = 16;
        this.C = yhm.j.b(new au0.z3(itemView, i2));
        this.D = yhm.j.b(new e70(i2));
        this.E = yhm.j.b(new ie7.a(this, 23));
        this.F = yhm.j.b(new e70(17));
        this.G = yhm.j.b(new ip0.md(this, itemView, 9));
        fp0.m mVar = fp0.p.Companion;
        gp0.h hVar = new gp0.h(new gp0.f(gp0.c.FOREGROUND, 2), fp0.j.f137025a);
        mVar.getClass();
        this.H = fp0.m.a(itemView, hVar);
        this.I = fp0.m.a(imageView, gp0.b.f145198a);
        ViewCompat.setAccessibilityDelegate(itemView, new cj(this));
    }

    public final void F(fo0 fo0Var) {
        aw0.d0 d0VarA;
        if (Intrinsics.f(fo0Var, this.f54067w)) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        constraintSet.clone(constraintLayout);
        boolean z = fo0Var instanceof do0;
        View view2 = this.f54065s;
        TextView textView = this.f54056g;
        UiKitMediaView uiKitMediaView = this.f54063q;
        if (z) {
            constraintSet.connect(uiKitMediaView.getId(), 4, 0, 4);
            constraintSet.connect(view2.getId(), 3, 0, 3);
            constraintSet.clear(textView.getId(), 3);
        } else {
            constraintSet.connect(uiKitMediaView.getId(), 4, textView.getId(), 3);
            constraintSet.connect(view2.getId(), 3, uiKitMediaView.getId(), 4);
            constraintSet.connect(textView.getId(), 3, uiKitMediaView.getId(), 4);
        }
        constraintSet.setDimensionRatio(uiKitMediaView.getId(), (fo0Var == null || (d0VarA = fo0Var.a()) == null) ? null : a0.d.i(d0VarA.f10274a, ":", d0VarA.f10275b));
        constraintSet.applyTo(constraintLayout);
        this.u = z;
        this.f54067w = fo0Var;
        V();
        uiKitMediaView.setForeground(this.v.b(this.u));
    }

    public final void H(no0 no0Var) {
        this.v = no0Var;
        boolean zA = no0Var.a();
        ProgressBar progressBar = this.f54066t;
        TextView textView = this.f54064r;
        TextView textView2 = this.f54057h;
        TextView textView3 = this.f54056g;
        if (zA) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView3.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView2.setTextColor(io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorWhite, context2)));
            Context context3 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context3));
            Context context4 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorWhite, context4)));
            Context context5 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(io0.a.d(0.5f, kli.a.s(R$attr.uikit_colorWhite, context5))));
        } else {
            Context context6 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            textView3.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context6));
            Context context7 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            textView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context7));
            Context context8 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context8));
            Context context9 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorForeground, context9)));
            Context context10 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(io0.a.d(0.5f, kli.a.s(R$attr.uikit_colorGreyTone20, context10))));
        }
        this.f54065s.setVisibility(no0Var.a() ? 0 : 8);
        this.f54063q.setForeground(this.v.b(this.u));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void I(VoucherSmallTileDelegate.a aVar) {
        Object obj2;
        Integer numValueOf;
        ?? r06;
        Integer num;
        if (aVar == null) {
            num = null;
            r06 = 0;
        } else {
            if (aVar instanceof yi) {
                obj2 = (Clause) ((yi) aVar).f55656c.getValue();
                numValueOf = Integer.valueOf(R$attr.internal_textAppearanceEmphasis2);
            } else {
                if (!(aVar instanceof xi)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = ((xi) aVar).f55608a;
                numValueOf = Integer.valueOf(R$attr.internal_textAppearanceBody2);
            }
            Integer num2 = numValueOf;
            r06 = obj2;
            num = num2;
        }
        TextView textView = this.f54064r;
        if (num != null) {
            jb3.l.e(textView, num.intValue());
        }
        kli.a.b(textView, r06, ty0.f.f275450a);
    }

    public final void J(ho0 ho0Var) {
        int i = ho0Var != null ? 0 : 8;
        TagView tagView = this.o;
        tagView.setVisibility(i);
        if (ho0Var != null) {
            tagView.setContent(ho0Var.e);
            pd.b.p(tagView, ho0Var.d);
        }
    }

    public final void K(jo0 jo0Var) {
        int i = jo0Var != null ? 0 : 8;
        ProgressBar progressBar = this.f54066t;
        progressBar.setVisibility(i);
        if (jo0Var != null) {
            progressBar.setMax(100);
            progressBar.setProgress(jo0Var.f164898a);
        }
    }

    public final void M(boolean z) {
        int iA = z ? com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 103.0f) : 0;
        TagView tagView = this.f54061n;
        ViewGroup.LayoutParams layoutParams = tagView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2.matchConstraintMaxWidth != iA) {
            layoutParams2.matchConstraintMaxWidth = iA;
            tagView.requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    public final void N(VoucherSmallTileDelegate.c content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(content instanceof zi)) {
            throw new NoWhenBranchMatchedException();
        }
        zi ziVar = (zi) content;
        ?? r06 = ziVar.f55714a;
        int i = oo0.f165702a[ziVar.f55715b.ordinal()];
        UiKitMediaView uiKitMediaView = this.f54063q;
        if (i == 1) {
            H(mo0.f165410a);
            uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            xv0.m.e0(this, r06, uiKitMediaView.i(), null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            H(ko0.f165058a);
            uiKitMediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            xv0.m.e0(this, r06, uiKitMediaView.i(), new w10(this, 22), 12);
        }
    }

    public final void O(Image image) {
        this.f54058j.setVisibility(image != null ? 0 : 8);
        View view = this.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), image, this.f54058j, null, null, 12);
    }

    public final void P(VoucherSmallTileDelegate.Model data) {
        Intrinsics.checkNotNullParameter(data, "data");
        View view = this.itemView;
        ty0.c cVarX = h30.l.x(view, "itemView", view);
        Clause clause = data.f;
        Object[] tags = {"VoucherSmallTileDelegate"};
        Intrinsics.checkNotNullParameter(tags, "tags");
        List tags2 = kotlin.collections.d.v0(tags);
        Intrinsics.checkNotNullParameter(tags2, "tags");
        ty0.c.b(cVarX, clause, this.f54057h, null, new ty0.e(tags2), 4);
        TextView textView = this.f54057h;
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
        if (data.f53612g == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        View view2 = this.itemView;
        yy0.f.e(h30.l.z(view2, "itemView", view2), data.f53612g, this.i, null, null, 12);
    }

    public final void R(VoucherSmallTileDelegate.e lines) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        boolean z = lines instanceof ej;
        TextView textView = this.f54057h;
        if (z) {
            textView.setLines(((ej) lines).f54134a);
        } else {
            if (!(lines instanceof fj)) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setMinLines(0);
            textView.setMaxLines(1);
        }
    }

    public final void S(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        View view = this.itemView;
        ty0.c.b(h30.l.x(view, "itemView", view), title, this.f54056g, null, null, 12);
    }

    public final void U(VoucherSmallTileDelegate.f lines) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        boolean z = lines instanceof gj;
        TextView textView = this.f54056g;
        if (z) {
            textView.setLines(((gj) lines).f54225a);
        } else {
            if (!(lines instanceof hj)) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setMinLines(0);
            textView.setMaxLines(((hj) lines).f54264a);
        }
    }

    public final void V() {
        Integer num = this.f54068x;
        if (num != null) {
            int iIntValue = num.intValue();
            boolean z = this.u;
            Lazy lazy = this.D;
            if (z) {
                ((GradientDrawable) lazy.getValue()).setColors(new int[]{iIntValue, iIntValue, 0, 0}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.25f, 0.5f, 1.0f});
            } else {
                ((GradientDrawable) lazy.getValue()).setColors(new int[]{iIntValue, iIntValue});
            }
            this.f54065s.setBackground((LayerDrawable) this.E.getValue());
        }
    }

    public final void W(VoucherSmallTileDelegate.Model data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean z = data.f53613h != null;
        VoucherSmallTileDelegate.c cVar = data.f53610b;
        if (!(cVar instanceof zi)) {
            throw new NoWhenBranchMatchedException();
        }
        pv0.a.a(this.k, this.f54063q, context, z, ((zi) cVar).f55715b == go0.NO_BLUR);
    }

    public final void Y(qv0.c positionInBox) {
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        int i = positionInBox instanceof c.d ? R$attr.uikit_colorBackground : R$attr.uikit_colorWidgetBackground;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k.setBackgroundTintList(ColorStateList.valueOf(kli.a.s(i, context)));
    }

    public final void Z(VoucherSmallTileDelegate.Model data) {
        qv0.h hVarA;
        Intrinsics.checkNotNullParameter(data, "data");
        this.f54062p.setVisibility(data.f53616m instanceof VoucherSmallTileDelegate.d.c ? 0 : 8);
        VoucherSmallTileDelegate.d dVar = data.f53616m;
        Drawable drawable = null;
        drawable = null;
        if (Intrinsics.f(dVar, VoucherSmallTileDelegate.d.C0430d.f53628a)) {
            Object obj2 = data.B;
            qv0.a aVar = obj2 instanceof qv0.a ? (qv0.a) obj2 : null;
            float fA = (aVar == null || (hVarA = aVar.a()) == null) ? BitmapDescriptorFactory.HUE_RED : hVarA.a();
            StaticBorderGradientDrawable staticBorderGradientDrawable = this.f54069y;
            if (staticBorderGradientDrawable == null || !Intrinsics.d(this.z, fA)) {
                staticBorderGradientDrawable = new StaticBorderGradientDrawable(new dr0.r(com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", fA), com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 2.0f)), (int[]) this.A.getValue(), this.B, GradientDrawable.Orientation.BL_TR);
                this.f54069y = staticBorderGradientDrawable;
                this.z = Float.valueOf(fA);
            }
            drawable = staticBorderGradientDrawable;
        } else if (dVar instanceof VoucherSmallTileDelegate.d.b) {
            drawable = (ColorDrawable) this.C.getValue();
        } else if (!(dVar instanceof VoucherSmallTileDelegate.d.c) && !(dVar instanceof VoucherSmallTileDelegate.d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        View view = this.f54060m;
        view.setBackground(drawable);
        view.setVisibility(drawable != null ? 0 : 8);
    }

    public final void a0(VoucherSmallTileDelegate.Model data) {
        ResourceImage resourceImage;
        Image image;
        Intrinsics.checkNotNullParameter(data, "data");
        VoucherSmallTileDelegate.d dVar = data.f53616m;
        ConstraintSet constraintSet = new ConstraintSet();
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        constraintSet.clone(constraintLayout);
        boolean z = dVar instanceof VoucherSmallTileDelegate.d.c;
        ImageView imageView = this.f54059l;
        if (z) {
            constraintSet.connect(imageView.getId(), 3, 0, 3, 0);
            constraintSet.connect(imageView.getId(), 4, this.f54063q.getId(), 4, 0);
            constraintSet.connect(imageView.getId(), 6, 0, 6, 0);
            constraintSet.connect(imageView.getId(), 7, 0, 7, 0);
        } else {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iW = kli.a.w(R$attr.uikit_dp16, context);
            constraintSet.connect(imageView.getId(), 3, 0, 3, iW);
            constraintSet.connect(imageView.getId(), 7, 0, 7, iW);
            constraintSet.clear(imageView.getId(), 6);
            constraintSet.clear(imageView.getId(), 4);
        }
        constraintSet.applyTo(constraintLayout);
        LayeredImage layeredImageJ = null;
        if (dVar instanceof VoucherSmallTileDelegate.d.a) {
            bj bjVar = ((VoucherSmallTileDelegate.d.a) dVar).f53626a;
            if (bjVar != null) {
                if (!(bjVar instanceof aj)) {
                    throw new NoWhenBranchMatchedException();
                }
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_heart, (Integer) null, (Integer) (-1), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
                image = resourceImage;
            }
            image = layeredImageJ;
        } else {
            if (!(dVar instanceof VoucherSmallTileDelegate.d.b)) {
                if (z) {
                    resourceImage = new ResourceImage(R$drawable.uikit_icn_24_lock, (Integer) null, (Integer) (-1), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
                    image = resourceImage;
                } else {
                    if (!Intrinsics.f(dVar, VoucherSmallTileDelegate.d.C0430d.f53628a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    layeredImageJ = LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_check, new Color.SolidInt(-16777216), new Color.SolidInt(-1));
                }
            }
            image = layeredImageJ;
        }
        imageView.setVisibility(image != null ? 0 : 8);
        View view2 = this.itemView;
        yy0.f.e(h30.l.z(view2, "itemView", view2), image, this.f54059l, null, null, 12);
        Z(data);
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
