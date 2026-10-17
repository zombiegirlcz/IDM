package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zf extends koi.b implements qq0.b, xv0.m {
    public TagView A;
    public float B;
    public float C;
    public float D;
    public Image E;
    public Image F;
    public CircleBadgeModel G;
    public NewBadgeContent H;
    public Image I;
    public AvatarModel J;
    public mx0.i1 K;
    public int L;
    public final LazyInflatableCachedView M;
    public final TextView N;
    public final TextView O;
    public fp0.p P;
    public final fu0.l Q;
    public final rr0.g R;
    public final ix0.l0 S;
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CutoutImageView f55695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SecondaryBackgroundConstraintLayout f55696h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f55697j;
    public final Barrier k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Barrier f55698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Barrier f55699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AvatarView f55700n;
    public View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AppCompatImageView f55701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AppCompatTextView f55702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CircleProgressBar f55703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CircleBadgeView f55704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NewBadgeView f55705t;
    public AppCompatImageView u;
    public AppCompatImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TagsView f55706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayoutCompat f55707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public OverlappedIconsView f55708y;
    public HorizontalStepsProgressView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(View itemView) {
        super(itemView);
        View viewFindViewById = itemView.findViewById(R$id.row_mainImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView mainImageView = (CutoutImageView) viewFindViewById;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mainImageView, "mainImageView");
        this.f = new xv0.n(new ie7.a(mainImageView, 16));
        this.f55695g = mainImageView;
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout = (SecondaryBackgroundConstraintLayout) itemView;
        this.f55696h = secondaryBackgroundConstraintLayout;
        View viewFindViewById2 = itemView.findViewById(R$id.row_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.row_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f55697j = (TextView) viewFindViewById3;
        this.o = mainImageView;
        this.L = mainImageView.getId();
        View viewFindViewById4 = itemView.findViewById(R$id.row_lazyInflatableValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.M = (LazyInflatableCachedView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.row_valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.N = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.row_valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.O = (TextView) viewFindViewById6;
        fu0.l lVar = new fu0.l(this);
        this.Q = lVar;
        this.R = vc.s.d(this, new nq0.e(itemView), lVar, 8);
        Barrier barrier = new Barrier(itemView.getContext());
        barrier.setReferencedIds(new int[]{R$id.row_title, R$id.row_subtitle, R$id.row_tagsView, R$id.row_valuePrimary, R$id.row_valueSecondary});
        barrier.setId(R$id.row_topContentBarrier);
        barrier.setType(2);
        barrier.setAllowsGoneWidget(false);
        this.f55698l = barrier;
        Barrier barrier2 = new Barrier(itemView.getContext());
        barrier2.setReferencedIds(new int[]{R$id.row_title, R$id.row_subtitle, R$id.row_tagsView, R$id.row_valuePrimary, R$id.row_valueSecondary});
        barrier2.setId(R$id.row_bottomContentBarrier);
        barrier2.setType(3);
        barrier2.setAllowsGoneWidget(false);
        this.f55699m = barrier2;
        Barrier barrier3 = new Barrier(itemView.getContext());
        barrier3.setReferencedIds(new int[]{R$id.row_valuePrimary, R$id.row_valueSecondary, R$id.row_lazyInflatableValue});
        barrier3.setId(R$id.row_valueBarrier);
        barrier3.setType(5);
        this.k = barrier3;
        secondaryBackgroundConstraintLayout.addView(barrier);
        secondaryBackgroundConstraintLayout.addView(barrier2);
        secondaryBackgroundConstraintLayout.addView(barrier3);
        this.S = new ix0.l0(secondaryBackgroundConstraintLayout, zhm.v.k(mainImageView, new ix0.k0(new ie7.a(this, 17))));
    }

    public final View F() {
        return this.o;
    }

    public final AvatarView H() {
        return this.f55700n;
    }

    public final OverlappedIconsView I() {
        return this.f55708y;
    }

    public final Barrier J() {
        return this.f55699m;
    }

    public final LazyInflatableCachedView K() {
        return this.M;
    }

    public final fu0.l M() {
        return this.Q;
    }

    public final CutoutImageView N() {
        return this.f55695g;
    }

    public final SecondaryBackgroundConstraintLayout O() {
        return this.f55696h;
    }

    public final TextView P() {
        return this.f55697j;
    }

    public final AppCompatTextView R() {
        return this.f55702q;
    }

    public final TagsView S() {
        return this.f55706w;
    }

    public final TextView U() {
        return this.i;
    }

    public final AppCompatImageView V() {
        return this.v;
    }

    public final Barrier W() {
        return this.f55698l;
    }

    public final fp0.p Y() {
        return this.P;
    }

    public final TextView Z() {
        return this.N;
    }

    public final TextView a0() {
        return this.O;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b0(TagViewData tagViewData) {
        if (tagViewData == null && this.A == null) {
            return;
        }
        TagView tagView = this.A;
        if (tagView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagView = new TagView(context, null, 6, 0);
            this.A = tagView;
            tagView.setId(R$id.row_avatarGroupBadge);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            Context context2 = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context2, 8.0f);
            layoutParams.topToBottom = this.f55699m.getId();
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.verticalBias = 1.0f;
            TextView textView = this.O;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToBottom = -1;
            textView.setLayoutParams(layoutParams3);
            tagView.setLayoutParams(layoutParams);
            this.f55696h.addView(tagView);
        }
        if (tagViewData != null) {
            tagView.setContent(tagViewData);
        }
        tagView.setVisibility(tagViewData == null ? 8 : 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c0(RowDelegate.Model.MainImage.Avatar avatar) {
        int i = 6;
        AttributeSet attributeSet = null;
        ConstraintLayout constraintLayout = this.f55696h;
        int i2 = 0;
        if (avatar == null) {
            AvatarView avatarView = this.f55700n;
            if (avatarView != null) {
                avatarView.setVisibility(8);
            }
            this.J = null;
            this.K = null;
            this.o = this.f55695g;
            constraintLayout.setClipChildren(true);
        } else {
            mx0.i1 i1Var = avatar.f53246b;
            AvatarModel avatarModel = avatar.f53245a;
            AvatarView avatarView2 = this.f55700n;
            if (avatarView2 == null) {
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                avatarView2 = new AvatarView(context, attributeSet, i, i2);
                this.f55700n = avatarView2;
                avatarView2.setId(View.generateViewId());
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.startToStart = 0;
                layoutParams.topToTop = 0;
                layoutParams.bottomToBottom = 0;
                avatarView2.setLayoutParams(layoutParams);
                constraintLayout.addView(avatarView2);
            }
            if (i1Var != this.K) {
                avatarView2.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
                this.K = i1Var;
            }
            if (!Intrinsics.f(avatarModel, this.J)) {
                avatarView2.setModel(avatarModel);
                this.J = avatarModel;
            }
            avatarView2.setVisibility(0);
            this.o = avatarView2;
            constraintLayout.setClipChildren(false);
        }
        int id10 = this.o.getId();
        if (id10 == this.L) {
            return;
        }
        this.L = id10;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        View[] elements = {this.i, this.f55697j, this.f55702q, this.f55706w, this.f55708y, this.f55707x};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.L(elements).iterator();
        while (it8.hasNext()) {
            constraintSet.connect(((View) it8.next()).getId(), 6, id10, 7);
        }
        constraintSet.applyTo(constraintLayout);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d0(df dfVar) {
        cf cfVar;
        Integer num;
        aw0.g0 g0Var = null;
        List list = dfVar != null ? dfVar.f54049a : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        if (list.isEmpty() && this.f55708y == null) {
            return;
        }
        OverlappedIconsView overlappedIconsView = this.f55708y;
        if (overlappedIconsView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            overlappedIconsView = new OverlappedIconsView(context, null, 6, 0);
            this.f55708y = overlappedIconsView;
            overlappedIconsView.setId(R$id.row_avatarsGroup);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            Context context2 = overlappedIconsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 8.0f);
            Context context3 = overlappedIconsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK2 = kli.a.k(context3, 16.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK;
            layoutParams.setMarginStart(iK2);
            layoutParams.setMarginEnd(iK2);
            layoutParams.goneTopMargin = iK;
            layoutParams.goneStartMargin = 0;
            layoutParams.startToEnd = this.o.getId();
            layoutParams.bottomToBottom = 0;
            TextView textView = this.f55702q;
            if (textView == null) {
                textView = this.f55697j;
            }
            layoutParams.topToBottom = textView.getId();
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToTop = R$id.row_avatarsGroup;
            layoutParams3.bottomToBottom = -1;
            textView.setLayoutParams(layoutParams3);
            View view = this.A;
            if (view == null) {
                view = this.k;
            }
            layoutParams.endToStart = view.getId();
            LinearLayoutCompat linearLayoutCompat = this.f55707x;
            if (linearLayoutCompat != null) {
                layoutParams.bottomToTop = linearLayoutCompat.getId();
                ViewGroup.LayoutParams layoutParams4 = linearLayoutCompat.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                layoutParams5.topToBottom = R$id.row_tagsView;
                layoutParams5.topToTop = -1;
                linearLayoutCompat.setLayoutParams(layoutParams5);
            } else {
                layoutParams.bottomToBottom = 0;
            }
            overlappedIconsView.setLayoutParams(layoutParams);
            this.f55696h.addView(overlappedIconsView);
        }
        OverlappedIconsView overlappedIconsView2 = overlappedIconsView;
        if (list.isEmpty()) {
            OverlappedIconsView.setIcons$default(overlappedIconsView2, zhm.f0.f322471a, null, null, 0, false, 30, null);
            overlappedIconsView2.setVisibility(8);
            return;
        }
        if (dfVar == null || (cfVar = dfVar.f54051c) == null) {
            cfVar = cf.DEFAULT;
        }
        aw0.e0 e0VarA = cfVar.a();
        if (dfVar != null && (num = dfVar.f54050b) != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                g0Var = new aw0.g0(num.intValue());
            }
        }
        yp0.u.a(overlappedIconsView2, new aw0.i0(list, e0VarA, g0Var, cfVar.b()), 8);
        overlappedIconsView2.setVisibility(0);
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    public final void f0(CircleBadgeModel circleBadgeModel) {
        if ((circleBadgeModel == null && this.f55704s == null) || Intrinsics.f(this.G, circleBadgeModel)) {
            return;
        }
        CircleBadgeView circleBadgeView = this.f55704s;
        if (circleBadgeView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CircleBadgeView circleBadgeView2 = new CircleBadgeView(context, null, 0, os0.a.SMALL, 6);
            this.f55704s = circleBadgeView2;
            circleBadgeView2.setId(R$id.row_badge);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            int i = R$id.row_mainImage;
            layoutParams.bottomToBottom = i;
            layoutParams.topToTop = i;
            layoutParams.rightToRight = i;
            layoutParams.leftToLeft = i;
            circleBadgeView2.setLayoutParams(layoutParams);
            this.f55696h.addView(circleBadgeView2);
            circleBadgeView = circleBadgeView2;
        }
        ifk.b.a(this.f55695g, circleBadgeView, false);
        circleBadgeView.setBadgeAndVisibility(circleBadgeModel, this.S);
        this.G = circleBadgeModel;
    }

    public final void g0() {
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h0(gf gfVar) {
        HorizontalStepsProgressView horizontalStepsProgressView = this.z;
        if (horizontalStepsProgressView == null && gfVar == null) {
            return;
        }
        if (horizontalStepsProgressView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            horizontalStepsProgressView = new HorizontalStepsProgressView(context, null, 6, 0);
            Context context2 = horizontalStepsProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 4.0f);
            this.z = horizontalStepsProgressView;
            horizontalStepsProgressView.setId(R$id.row_linearProgress);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, iK);
            layoutParams.startToStart = R$id.row_subtitle;
            layoutParams.endToStart = R$id.row_valueBarrier;
            layoutParams.bottomToBottom = 0;
            TextView textView = this.f55702q;
            if (textView == null) {
                textView = this.f55697j;
            }
            layoutParams.topToBottom = textView.getId();
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToTop = R$id.row_linearProgress;
            textView.setLayoutParams(layoutParams3);
            Context context3 = horizontalStepsProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context3, 8.0f);
            Context context4 = horizontalStepsProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            layoutParams.setMarginEnd(kli.a.k(context4, 16.0f));
            horizontalStepsProgressView.setLayoutParams(layoutParams);
            horizontalStepsProgressView.setGapSizeDp(BitmapDescriptorFactory.HUE_RED);
            horizontalStepsProgressView.setProgressBarRadiusDp(100.0f);
            Context context5 = horizontalStepsProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            horizontalStepsProgressView.setBaseColor(kli.a.s(R$attr.uikit_colorGreyTone20_50, context5));
            Context context6 = horizontalStepsProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            horizontalStepsProgressView.setProgressColor(kli.a.s(R$attr.uikit_colorAccentNeutral, context6));
            this.f55696h.addView(horizontalStepsProgressView);
        }
        horizontalStepsProgressView.setVisibility(gfVar == null ? 8 : 0);
        if (gfVar != null) {
            horizontalStepsProgressView.setOverallProgress(gfVar.f54219a / 100.0f);
        }
    }

    public final void i0(Image image, float f, float f4, float f5, boolean z) {
        boolean z3 = f == this.B;
        boolean z4 = this.C == f4;
        boolean z6 = this.D == f5;
        CutoutImageView cutoutImageView = this.f55695g;
        if (!z3 || !z4 || !z6) {
            ViewGroup.LayoutParams layoutParams = cutoutImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iA;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iA;
            int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", f5);
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams2.setMarginStart(kli.a.k(context, f4));
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iA2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iA2;
            cutoutImageView.setLayoutParams(layoutParams2);
        }
        if (!Intrinsics.f(image, this.E) || !z3) {
            xv0.m.e0(this, image, cutoutImageView, null, 6);
        }
        this.B = f;
        this.E = image;
        this.C = f4;
        this.D = f5;
        if (z && cutoutImageView.getBackground() == null) {
            Context context2 = cutoutImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            cutoutImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context2)), null, null));
        } else {
            if (z) {
                return;
            }
            cutoutImageView.setBackground(null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j0(ResourceImage resourceImage) {
        if ((resourceImage == null && this.u == null) || Intrinsics.f(this.I, resourceImage)) {
            return;
        }
        AppCompatImageView appCompatImageView = this.u;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(this.itemView.getContext());
            this.u = appCompatImageView;
            appCompatImageView.setId(R$id.row_nestedImage);
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 12.0f);
            Context context2 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 40.0f);
            Context context3 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK3 = kli.a.k(context3, 16.0f);
            appCompatImageView.setPadding(iK, 0, iK, 0);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK2, iK3);
            layoutParams.startToStart = 0;
            layoutParams.topToTop = R$id.row_title;
            appCompatImageView.setLayoutParams(layoutParams);
            this.f55696h.addView(appCompatImageView);
        }
        CutoutImageView cutoutImageView = this.f55695g;
        ViewGroup.LayoutParams layoutParams2 = cutoutImageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        if (resourceImage != null) {
            layoutParams3.startToEnd = R$id.row_nestedImage;
            layoutParams3.startToStart = -1;
        } else {
            layoutParams3.startToStart = 0;
            layoutParams3.startToEnd = -1;
        }
        cutoutImageView.setLayoutParams(layoutParams3);
        zi0.c.g(appCompatImageView, resourceImage);
        this.I = resourceImage;
    }

    @Override // qq0.b
    public final View k() {
        View view = this.o;
        if (view.getVisibility() == 0) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l0(NewBadgeContent newBadgeContent) {
        if ((newBadgeContent == null && this.f55705t == null) || Intrinsics.f(this.H, newBadgeContent)) {
            return;
        }
        NewBadgeView newBadgeView = this.f55705t;
        if (newBadgeView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            newBadgeView = new NewBadgeView(context, null, 6, i);
            this.f55705t = newBadgeView;
            newBadgeView.setId(R$id.row_imageNotificationDot);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            int i = R$id.row_mainImage;
            layoutParams.bottomToBottom = i;
            layoutParams.topToTop = i;
            layoutParams.rightToRight = i;
            layoutParams.leftToLeft = i;
            newBadgeView.setLayoutParams(layoutParams);
            this.f55696h.addView(newBadgeView);
            ifk.b.a(this.f55695g, newBadgeView, true);
        }
        newBadgeView.setVisibility(newBadgeContent == null ? 8 : 0);
        if (newBadgeContent != null) {
            newBadgeView.setContent(newBadgeContent);
        }
        this.H = newBadgeContent;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m0(ProgressStyle progressStyle) {
        if (progressStyle == null && this.f55703r == null) {
            return;
        }
        CircleProgressBar circleProgressBar = this.f55703r;
        if (circleProgressBar == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            circleProgressBar = new CircleProgressBar(context, null, 6, 0);
            this.f55703r = circleProgressBar;
            circleProgressBar.setId(R$id.row_imageProgress);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            int i = R$id.row_mainImage;
            layoutParams.bottomToBottom = i;
            layoutParams.topToTop = i;
            layoutParams.rightToRight = i;
            layoutParams.leftToLeft = i;
            circleProgressBar.setLayoutParams(layoutParams);
            this.f55696h.addView(circleProgressBar);
        }
        if (progressStyle == null) {
            circleProgressBar.setVisibility(8);
            return;
        }
        circleProgressBar.setVisibility(0);
        circleProgressBar.a(progressStyle);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 10.0f);
        int i2 = this.f55695g.getLayoutParams().width + iA;
        ViewGroup.LayoutParams layoutParams2 = circleProgressBar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        ((ViewGroup.MarginLayoutParams) layoutParams3).width = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams3).height = i2;
        layoutParams3.setMarginEnd(iA / 10);
        circleProgressBar.setLayoutParams(layoutParams3);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n0(List statusList, ald.o oVar) {
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        if (statusList.isEmpty() && this.f55707x == null) {
            return;
        }
        LinearLayoutCompat linearLayoutCompat = this.f55707x;
        if (linearLayoutCompat == null) {
            linearLayoutCompat = new LinearLayoutCompat(this.itemView.getContext());
            this.f55707x = linearLayoutCompat;
            linearLayoutCompat.setId(R$id.row_statusViewContainer);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 8.0f);
            int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iA;
            layoutParams.setMarginStart(iA2);
            layoutParams.goneStartMargin = 0;
            layoutParams.startToEnd = this.o.getId();
            layoutParams.endToEnd = 0;
            layoutParams.bottomToBottom = 0;
            View view = this.f55706w;
            if (view == null && (view = this.f55702q) == null) {
                view = this.f55697j;
            }
            layoutParams.topToBottom = view.getId();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToTop = R$id.row_statusViewContainer;
            view.setLayoutParams(layoutParams3);
            linearLayoutCompat.setLayoutParams(layoutParams);
            linearLayoutCompat.setOrientation(1);
            this.f55696h.addView(linearLayoutCompat);
        }
        linearLayoutCompat.removeAllViews();
        linearLayoutCompat.setVisibility(statusList.isEmpty() ? 8 : 0);
        Iterator it8 = statusList.iterator();
        while (it8.hasNext()) {
            jf jfVar = (jf) it8.next();
            ?? r3 = jfVar.f54333a;
            Image image = jfVar.f54334b;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ms0.x3 x3Var = new ms0.x3(context);
            x3Var.setContent(new ms0.y3(image, r3, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone20), oVar);
            linearLayoutCompat.addView(x3Var);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o0(Clause clause, ald.o oVar) {
        if (clause == null && this.f55702q == null) {
            return;
        }
        AppCompatTextView appCompatTextView = this.f55702q;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(this.itemView.getContext());
            this.f55702q = appCompatTextView;
            appCompatTextView.setId(R$id.row_subtitleFooter);
            appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
            appCompatTextView.setTextAlignment(5);
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 8.0f);
            Context context3 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK2 = kli.a.k(context3, 16.0f);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK;
            layoutParams.setMarginEnd(iK2);
            layoutParams.setMarginStart(iK2);
            layoutParams.goneStartMargin = 0;
            layoutParams.topToBottom = R$id.row_subtitle;
            layoutParams.startToEnd = this.o.getId();
            layoutParams.endToStart = R$id.row_valueBarrier;
            TextView textView = this.f55697j;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToTop = R$id.row_subtitleFooter;
            layoutParams3.bottomToBottom = -1;
            textView.setLayoutParams(layoutParams3);
            View view = this.f55708y;
            if (view == null && (view = this.f55706w) == null) {
                view = this.f55707x;
            }
            if (view != null) {
                layoutParams.bottomToTop = view.getId();
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                layoutParams5.topToBottom = R$id.row_subtitleFooter;
                layoutParams5.topToTop = -1;
                view.setLayoutParams(layoutParams5);
            } else {
                layoutParams.bottomToBottom = 0;
            }
            appCompatTextView.setLayoutParams(layoutParams);
            jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody2);
            this.f55696h.addView(appCompatTextView);
        }
        kli.a.e(appCompatTextView, clause, oVar, ty0.f.f275450a, 0, 8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p0(List tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty() && this.f55706w == null) {
            return;
        }
        TagsView tagsView = this.f55706w;
        AttributeSet attributeSet = null;
        if (tagsView == null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagsView = new TagsView(context, attributeSet, 6, i);
            this.f55706w = tagsView;
            tagsView.setId(R$id.row_tagsView);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            Context context2 = tagsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 16.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            layoutParams.setMarginStart(iK);
            layoutParams.goneStartMargin = 0;
            layoutParams.startToEnd = this.o.getId();
            layoutParams.bottomToBottom = 0;
            layoutParams.endToStart = R$id.row_valueBarrier;
            TextView textView = this.f55702q;
            if (textView == null) {
                textView = this.f55697j;
            }
            layoutParams.topToBottom = textView.getId();
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToTop = R$id.row_tagsView;
            layoutParams3.bottomToBottom = -1;
            textView.setLayoutParams(layoutParams3);
            LinearLayoutCompat linearLayoutCompat = this.f55707x;
            if (linearLayoutCompat != null) {
                layoutParams.bottomToTop = linearLayoutCompat.getId();
                ViewGroup.LayoutParams layoutParams4 = linearLayoutCompat.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                layoutParams5.topToBottom = R$id.row_tagsView;
                layoutParams5.topToTop = -1;
                linearLayoutCompat.setLayoutParams(layoutParams5);
            } else {
                layoutParams.bottomToBottom = 0;
            }
            tagsView.setLayoutParams(layoutParams);
            this.f55696h.addView(tagsView);
        }
        tagsView.setVisibility(tags.isEmpty() ? 8 : 0);
        tagsView.setModel(new mx0.qc(tags, null));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q0(CountdownTimerImage countdownTimerImage) {
        if ((countdownTimerImage == null && this.f55701p == null) || Intrinsics.f(this.F, countdownTimerImage)) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f55701p;
        CutoutImageView cutoutImageView = this.f55695g;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(this.itemView.getContext());
            this.f55701p = appCompatImageView;
            appCompatImageView.setId(View.generateViewId());
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 44.0f);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
            layoutParams.topToTop = cutoutImageView.getId();
            layoutParams.bottomToBottom = cutoutImageView.getId();
            layoutParams.startToStart = cutoutImageView.getId();
            layoutParams.endToEnd = cutoutImageView.getId();
            appCompatImageView.setLayoutParams(layoutParams);
            this.f55696h.addView(appCompatImageView);
        }
        zi0.c.g(appCompatImageView, countdownTimerImage);
        if (countdownTimerImage != null) {
            cutoutImageView.setVisibility(0);
        }
        this.F = countdownTimerImage;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r0(mf mfVar) {
        int iA;
        if (mfVar == null && this.v == null) {
            return;
        }
        nf nfVar = mfVar != null ? mfVar.f54480c : null;
        int i = nfVar == null ? -1 : yf.f55650a[nfVar.ordinal()];
        if (i == -1) {
            iA = 0;
        } else if (i == 1) {
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 20.0f);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f);
        }
        AppCompatImageView appCompatImageView = this.v;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(this.itemView.getContext());
            this.v = appCompatImageView;
            appCompatImageView.setId(R$id.row_titleBadge);
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 16.0f);
            Context context2 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 8.0f);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iA, iA);
            layoutParams.setMarginEnd(iK);
            int i2 = R$id.row_title;
            layoutParams.startToEnd = i2;
            layoutParams.endToStart = R$id.row_valueBarrier;
            layoutParams.topToTop = i2;
            layoutParams.bottomToBottom = i2;
            appCompatImageView.setLayoutParams(layoutParams);
            TextView textView = this.i;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.endToStart = R$id.row_titleBadge;
            layoutParams3.endToEnd = -1;
            layoutParams3.setMarginEnd(iK2);
            layoutParams3.goneEndMargin = iK;
            textView.setLayoutParams(layoutParams3);
            this.f55696h.addView(appCompatImageView);
        }
        or0.u.A(appCompatImageView, iA, iA);
        zi0.c.g(appCompatImageView, mfVar != null ? mfVar.f54478a : null);
    }

    public final void s0(fp0.p pVar) {
        this.P = pVar;
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
