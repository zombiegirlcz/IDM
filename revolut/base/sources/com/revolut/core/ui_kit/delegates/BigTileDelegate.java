package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ActionStatusView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.SocialProofView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0003\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BigTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/BigTileDelegate$Model;", "Lip0/t4;", "<init>", "()V", "Companion", "Model", "ip0/p4", "ip0/m4", "ip0/k4", "ip0/r4", "b", "ip0/q4", "c", "cd/e", "com/revolut/core/ui_kit/delegates/m1", "ip0/j4", "ip0/l4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BigTileDelegate extends BaseRecyclerViewDelegate<Model, ip0.t4> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aw0.d0 f51727g = new aw0.d0(12, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aw0.d0 f51728h = new aw0.d0(1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51729c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f51747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f51748b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            p1 p1Var = null;
            this(p1Var, p1Var, 3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f51747a, bVar.f51747a) && Intrinsics.f(this.f51748b, bVar.f51748b);
        }

        public final int hashCode() {
            c cVar = this.f51747a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            c cVar2 = this.f51748b;
            return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
        }

        public /* synthetic */ b(p1 p1Var, c cVar, int i) {
            this((i & 1) != 0 ? null : p1Var, (i & 2) != 0 ? null : cVar);
        }

        public b(c cVar, c cVar2) {
            this.f51747a = cVar;
            this.f51748b = cVar2;
        }
    }

    public static abstract class c {
        private c() {
        }
    }

    public BigTileDelegate() {
        super(R$layout.internal_delegate_big_tile, new ip0.g4(0));
        this.f51729c = new e01.a();
        this.d = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.e = fVar;
        this.f = v0.a.d("create(...)");
        v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    public static void A(ip0.t4 t4Var, Float f) {
        if (f == null) {
            HorizontalStepsProgressView horizontalStepsProgressView = t4Var.f166439s;
            SocialProofView socialProofView = t4Var.k;
            horizontalStepsProgressView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = socialProofView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = socialProofView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            marginLayoutParams.bottomMargin = kli.a.w(R$attr.uikit_dp8, context);
            socialProofView.setLayoutParams(marginLayoutParams);
            return;
        }
        HorizontalStepsProgressView horizontalStepsProgressView2 = t4Var.f166439s;
        SocialProofView socialProofView2 = t4Var.k;
        horizontalStepsProgressView2.setVisibility(0);
        horizontalStepsProgressView2.setOverallProgress(f.floatValue());
        horizontalStepsProgressView2.setProgressBarRadiusDp(4.0f);
        horizontalStepsProgressView2.setBaseColor(horizontalStepsProgressView2.getContext().getColor(R$color.internal_greyTone20_night));
        Context context2 = horizontalStepsProgressView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        horizontalStepsProgressView2.setProgressColor(kli.a.s(R$attr.uikit_colorWhite, context2));
        ViewGroup.LayoutParams layoutParams2 = socialProofView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context3 = socialProofView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        marginLayoutParams2.bottomMargin = kli.a.w(R$attr.uikit_dp16, context3);
        socialProofView2.setLayoutParams(marginLayoutParams2);
    }

    public static void B(Model model, ip0.t4 t4Var) {
        aw0.l lVar = model.f51734h;
        ActionStatusView actionStatusView = t4Var.f166435n;
        ArrayList arrayList = t4Var.f166436p;
        actionStatusView.setVisibility(8);
        LinearLayout linearLayout = t4Var.o;
        linearLayout.setVisibility(8);
        if (lVar instanceof aw0.k) {
            ActionStatusView actionStatusView2 = t4Var.f166435n;
            actionStatusView2.setVisibility(0);
            actionStatusView2.setContent((ms0.a) lVar);
            return;
        }
        if (!(lVar instanceof aw0.j)) {
            if (lVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        linearLayout.setVisibility(0);
        aw0.j jVar = (aw0.j) lVar;
        ArrayList arrayListE0 = zhm.d0.E0(jVar.f10366b, zhm.u.c(jVar.f10365a));
        while (arrayList.size() < arrayListE0.size() && arrayList.size() < 3) {
            Context context = t4Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View tagView = new TagView(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (arrayList.size() < 2) {
                layoutParams.setMarginEnd(tagView.getContext().getResources().getDimensionPixelSize(R$dimen.internal_card_8dp_padding_size));
            }
            tagView.setLayoutParams(layoutParams);
            linearLayout.addView(tagView);
            arrayList.add(tagView);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TagView tagView2 = (TagView) arrayList.get(i);
            if (i < arrayListE0.size()) {
                tagView2.setVisibility(0);
                tagView2.setContent((TagViewData) arrayListE0.get(i));
            } else {
                tagView2.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void C(Model model, ip0.t4 t4Var) {
        cd.e eVar = model.f;
        if (eVar != null) {
            ?? r06 = eVar.f23134b;
            TextView textView = t4Var.f166433l;
            kli.a.b(textView, r06, ty0.f.f275450a);
            jb3.l.e(textView, eVar.f23133a);
            textView.setMaxLines(eVar instanceof ip0.n4 ? 2 : 3);
        }
    }

    public static void D(Model model, ip0.t4 t4Var) {
        kli.a.b(t4Var.f166430g, model.f51731b, ty0.f.f275450a);
        TextView textView = t4Var.f166430g;
        jb3.l.e(textView, model.o.a());
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
        Context context = t4Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setMaxHeight(kli.a.k(context, model.f instanceof ip0.n4 ? 100.0f : 120.0f));
    }

    public static int E(c cVar, ip0.q4 q4Var) {
        boolean z = q4Var == ip0.q4.START;
        if (cVar instanceof o1) {
            return z ? R$id.internal_bigTile_topStartIcon : R$id.internal_bigTile_topEndIcon;
        }
        if (cVar instanceof n1) {
            return z ? R$id.internal_bigTile_topStartBadge : R$id.internal_bigTile_topEndBadge;
        }
        if (cVar instanceof p1) {
            return z ? R$id.internal_bigTile_topStartTag : R$id.internal_bigTile_topEndTag;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void p(Model model, ip0.t4 t4Var) {
        ro0.u uVar = t4Var.E;
        ImageView target = t4Var.f166431h;
        Image image = model.d;
        if (!model.f51738n.a()) {
            image = null;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(target, "target");
        if (!Intrinsics.f(uVar.d, image)) {
            uVar.d = image;
            uVar.e++;
            if (target.getForeground() != null) {
                target.setForeground(null);
            }
        }
        xv0.m.e0(t4Var, model.d, target, new hsa.l(t4Var, 22, image != null ? Integer.valueOf(uVar.e) : null, model), 12);
    }

    public static void q(ip0.t4 t4Var, c cVar, ip0.q4 slot) {
        Object obj2;
        View tagView;
        t4Var.getClass();
        Intrinsics.checkNotNullParameter(slot, "slot");
        ArrayList arrayList = slot == ip0.q4.START ? t4Var.B : t4Var.C;
        ConstraintLayout constraintLayout = t4Var.A;
        AttributeSet attributeSet = null;
        Integer numValueOf = cVar != null ? Integer.valueOf(E(cVar, slot)) : null;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            view.setVisibility((numValueOf != null && view.getId() == numValueOf.intValue()) ? 0 : 8);
        }
        if (cVar == null) {
            return;
        }
        int iE = E(cVar, slot);
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i3);
            if (((View) obj2).getId() == iE) {
                break;
            } else {
                i3++;
            }
        }
        View view2 = (View) obj2;
        if (view2 == null) {
            Context context = constraintLayout.getContext();
            if (cVar instanceof o1) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i5 = R$attr.uikit_dp24;
                Intrinsics.h(context);
                s(appCompatImageView, iE, slot, i5, kli.a.k(context, 56.0f));
                view2 = appCompatImageView;
            } else {
                int i6 = 6;
                if (cVar instanceof n1) {
                    Intrinsics.h(context);
                    tagView = new ms0.o(context, attributeSet, i6, i);
                    s(tagView, iE, slot, R$attr.uikit_dp24, -2);
                } else {
                    if (!(cVar instanceof p1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.h(context);
                    tagView = new TagView(context, null, 6, 0);
                    s(tagView, iE, slot, R$attr.uikit_dp24, -2);
                }
                view2 = tagView;
            }
            constraintLayout.addView(view2);
            arrayList.add(view2);
        }
        view2.setVisibility(0);
        if (cVar instanceof o1) {
            View view3 = t4Var.itemView;
            yy0.f.e(h30.l.z(view3, "itemView", view3), ((o1) cVar).f54526a, (ImageView) view2, null, null, 12);
        } else if (cVar instanceof n1) {
            ((ms0.o) view2).setContent(((n1) cVar).f54490a);
        } else {
            if (!(cVar instanceof p1)) {
                throw new NoWhenBranchMatchedException();
            }
            ((TagView) view2).setContent(((p1) cVar).f54569a);
        }
    }

    public static void r(ip0.t4 t4Var, c cVar, ip0.q4 slot) {
        Object obj2;
        fp0.p pVarA;
        if (!(cVar instanceof o1) && !(cVar instanceof n1) && !(cVar instanceof p1) && cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        ip0.q4 q4Var = ip0.q4.START;
        int i = slot == q4Var ? R$id.internal_bigTile_topStartCustomIcon : R$id.internal_bigTile_topEndCustomIcon;
        t4Var.getClass();
        Intrinsics.checkNotNullParameter(slot, "slot");
        Intrinsics.checkNotNullParameter(slot, "slot");
        ArrayList arrayList = slot == q4Var ? t4Var.B : t4Var.C;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i2);
            if (((View) obj2).getId() == i) {
                break;
            } else {
                i2++;
            }
        }
        View view = (View) obj2;
        if (view != null) {
            pd.b.h(view, false);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(slot, "slot");
            int i3 = ip0.s4.f166290a[slot.ordinal()];
            gp0.b bVar = gp0.b.f145198a;
            if (i3 == 1) {
                pVarA = t4Var.i;
                if (pVarA == null) {
                    fp0.p.Companion.getClass();
                    pVarA = fp0.m.a(view, bVar);
                    t4Var.i = pVarA;
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pVarA = t4Var.f166432j;
                if (pVarA == null) {
                    fp0.p.Companion.getClass();
                    pVarA = fp0.m.a(view, bVar);
                    t4Var.f166432j = pVarA;
                }
            }
            fp0.p.b(pVarA, false);
            View view2 = pVarA.f137029a;
            or0.m.a(view2);
            or0.u.o(view2);
        }
    }

    public static void s(View view, int i, ip0.q4 q4Var, int i2, int i3) {
        view.setId(i);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i3, i3);
        layoutParams.topToTop = 0;
        if (q4Var == ip0.q4.START) {
            layoutParams.startToStart = 0;
        } else {
            layoutParams.endToEnd = 0;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(i2, context);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iW;
        layoutParams.setMarginStart(iW);
        layoutParams.setMarginEnd(iW);
        view.setLayoutParams(layoutParams);
    }

    public static void u(ip0.r4 r4Var, ip0.t4 t4Var) {
        UiKitPlayerView uiKitPlayerView = t4Var.f166437q;
        UiKitPlayerView uiKitPlayerView2 = t4Var.f166437q;
        ViewGroup.LayoutParams layoutParams = uiKitPlayerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (r4Var instanceof ip0.r4) {
            layoutParams2.bottomToBottom = t4Var.f166431h.getId();
            layoutParams2.bottomToTop = -1;
            layoutParams2.setMargins(0, 0, 0, 0);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        }
        uiKitPlayerView.setLayoutParams(layoutParams2);
        or0.u.k(uiKitPlayerView2).V().a(r4Var.f166103a, uiKitPlayerView2, null);
    }

    public static void v(ip0.t4 t4Var, ip0.m4 m4Var) {
        aw0.d0 d0Var;
        int i = ip0.u4.f166587a[m4Var.ordinal()];
        if (i == 1) {
            d0Var = f51727g;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var = f51728h;
        }
        ImageView imageView = t4Var.f166431h;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.dimensionRatio = a0.d.g(d0Var.f10274a, d0Var.f10275b, "H,", ":");
        imageView.setLayoutParams(layoutParams2);
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
    public static void w(ip0.t4 t4Var, ip0.j4 j4Var) {
        t4Var.z.setVisibility(j4Var.c() ? 0 : 8);
        boolean zB = j4Var.b();
        if (zB || t4Var.D != null) {
            AppCompatImageView appCompatImageView = t4Var.D;
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(t4Var.itemView.getContext());
                appCompatImageView.setId(R$id.internal_bigTile_lockIcon);
                Context context = t4Var.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iW = kli.a.w(R$attr.uikit_dp64, context);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iW, iW);
                int i = R$id.bigTile_cardBackground;
                layoutParams.topToTop = i;
                layoutParams.bottomToBottom = i;
                layoutParams.startToStart = i;
                layoutParams.endToEnd = i;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setImageResource(R$drawable.uikit_icn_24_lock_closed);
                Context context2 = t4Var.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                appCompatImageView.setImageTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorWhite, context2)));
                appCompatImageView.setAlpha(0.4f);
                t4Var.A.addView(appCompatImageView);
                t4Var.D = appCompatImageView;
            }
            appCompatImageView.setVisibility(zB ? 0 : 8);
        }
    }

    public static void x(ip0.t4 t4Var, aw0.v1 v1Var) {
        int i;
        int i2;
        Context context = t4Var.itemView.getContext();
        int[] iArr = ip0.u4.f166588b;
        int i3 = iArr[v1Var.ordinal()];
        if (i3 == 1) {
            i = R$attr.uikit_colorWhite;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlack;
        }
        TextView textView = t4Var.f166430g;
        Intrinsics.h(context);
        textView.setTextColor(kli.a.s(i, context));
        t4Var.f166433l.setTextColor(kli.a.s(i, context));
        t4Var.f166441w.setTextColor(kli.a.s(i, context));
        int i5 = iArr[v1Var.ordinal()];
        if (i5 == 1) {
            i2 = com.revolut.core.ui_kit.R$drawable.internal_tile_gradient_overlay_dark;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = com.revolut.core.ui_kit.R$drawable.internal_tile_gradient_overlay_light;
        }
        t4Var.f166438r.setBackgroundResource(i2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.t4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_big_tile));
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
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.t4 holder, Model data, int i, List payloads) {
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f166443y;
        UiKitPlayerView uiKitPlayerView = holder.f166437q;
        ActionsView actionsView = holder.f166434m;
        TextView textView = holder.f166433l;
        SocialProofView socialProofView = holder.k;
        boolean zIsEmpty = payloads.isEmpty();
        mx0.t tVar = mx0.t.f210002a;
        if (zIsEmpty) {
            aw0.v1 v1Var = data.f51739p;
            b bVar = data.f51736l;
            List list = data.f51733g;
            ip0.r4 r4Var = data.f51732c;
            x(holder, v1Var);
            holder.f166438r.setVisibility(data.f51735j ? 0 : 8);
            D(data, holder);
            p(data, holder);
            or0.b.f(this, null, imageView);
            if (r4Var != null) {
                u(r4Var, holder);
            }
            uiKitPlayerView.setVisibility(r4Var != null ? 0 : 8);
            ms0.s4 s4Var = data.e;
            if (s4Var != null) {
                socialProofView.setContent(s4Var);
                z = false;
                socialProofView.setVisibility(0);
                i2 = 8;
            } else {
                i2 = 8;
                z = false;
                socialProofView.setVisibility(8);
            }
            if (data.f != null) {
                C(data, holder);
                textView.setVisibility(z ? 1 : 0);
            } else {
                textView.setVisibility(i2 == true ? 1 : 0);
            }
            if (!list.isEmpty()) {
                i2 = z ? 1 : 0;
            }
            actionsView.setVisibility(i2);
            actionsView.k(list, tVar);
            efm.r map = actionsView.f58296a.f121375b.map(new ip0.w(new ii4.b(data, 26), 16));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.f51729c.a(map, holder);
            B(data, holder);
            y(data, holder);
            q(holder, bVar != null ? bVar.f51747a : null, ip0.q4.START);
            q(holder, bVar != null ? bVar.f51748b : null, ip0.q4.END);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            z(data.i, holder, data);
            w(holder, data.f51738n);
            A(holder, data.f51737m);
            v(holder, data.f51740q);
        } else {
            List list2 = payloads;
            ArrayList<ip0.l4> arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (Object obj2 : list2) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.BigTileDelegate.Payload");
                arrayList.add((ip0.l4) obj2);
            }
            for (ip0.l4 l4Var : arrayList) {
                boolean z3 = l4Var.f165117a;
                boolean z4 = l4Var.f165123l;
                boolean z6 = l4Var.e;
                if (z3 || l4Var.f165124m || z6) {
                    D(data, holder);
                }
                if (l4Var.f165118b || z4) {
                    p(data, holder);
                }
                if (l4Var.f) {
                    B(data, holder);
                }
                if (l4Var.d) {
                    ms0.s4 s4Var2 = data.e;
                    if (s4Var2 != null) {
                        socialProofView.setContent(s4Var2);
                    }
                    socialProofView.setVisibility(data.e != null ? 0 : 8);
                }
                if (z6) {
                    C(data, holder);
                    textView.setVisibility(data.f != null ? 0 : 8);
                }
                if (l4Var.f165119c) {
                    actionsView.setVisibility(!data.f51733g.isEmpty() ? 0 : 8);
                    actionsView.k(data.f51733g, tVar);
                }
                if (l4Var.f165120g || l4Var.k) {
                    z(data.i, holder, data);
                }
                if (l4Var.f165121h) {
                    ip0.r4 r4Var2 = data.f51732c;
                    if (r4Var2 != null) {
                        u(r4Var2, holder);
                    }
                    uiKitPlayerView.setVisibility(data.f51732c != null ? 0 : 8);
                }
                if (l4Var.i) {
                    y(data, holder);
                }
                if (l4Var.f165122j) {
                    b bVar2 = data.f51736l;
                    q(holder, bVar2 != null ? bVar2.f51747a : null, ip0.q4.START);
                    b bVar3 = data.f51736l;
                    q(holder, bVar3 != null ? bVar3.f51748b : null, ip0.q4.END);
                }
                if (z4) {
                    w(holder, data.f51738n);
                }
                if (l4Var.f165125n) {
                    data.getClass();
                    or0.b.f(this, null, imageView);
                }
                if (l4Var.o) {
                    x(holder, data.f51739p);
                }
                if (l4Var.f165126p) {
                    A(holder, data.f51737m);
                }
                if (l4Var.f165127q) {
                    v(holder, data.f51740q);
                }
            }
            z = false;
        }
        fp0.p pVar = holder.G;
        cd.e eVar = data.f;
        b bVar4 = data.f51736l;
        if (eVar != null && eVar.f()) {
            z = true;
        }
        fp0.p.b(pVar, z);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z) {
            view.setOnClickListener(new au0.r2(this, data, 5));
        } else {
            or0.u.o(view);
        }
        r(holder, bVar4 != null ? bVar4.f51747a : null, ip0.q4.START);
        r(holder, bVar4 != null ? bVar4.f51748b : null, ip0.q4.END);
        AnimationRequest animationRequest = data.f51741r;
        if (animationRequest == null || animationRequest.f57724a) {
            if (animationRequest == null) {
                holder.F().a();
                return;
            }
            return;
        }
        holder.F().a();
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        if (!itemView2.isAttachedToWindow()) {
            itemView2.addOnAttachStateChangeListener(new dok.k(itemView2, this, holder, animationRequest));
            return;
        }
        koi.j jVar = holder.e;
        Model model = jVar instanceof Model ? (Model) jVar : null;
        if ((model != null ? model.f51741r : null) != animationRequest || animationRequest.f57724a) {
            return;
        }
        animationRequest.f57724a = true;
        holder.F().c();
    }

    public final void y(Model model, ip0.t4 t4Var) {
        ip0.k4 k4Var = model.k;
        if (k4Var == null) {
            t4Var.f166440t.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout = t4Var.f166440t;
        TextView textView = t4Var.f166441w;
        View view = t4Var.f166442x;
        SmallActionButton smallActionButton = t4Var.u;
        constraintLayout.setVisibility(0);
        if (!(k4Var instanceof ip0.k4)) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = k4Var.f164955b;
        int i = R$attr.internal_textAppearanceBody3;
        int i2 = R$id.bigTile_footerAction;
        ijg.c cVar = new ijg.c(this, model, 24);
        kli.a.d(textView, k4Var.f164954a, model, null, 8);
        jb3.l.e(textView, i);
        textView.setMovementMethod(null);
        smallActionButton.setVisibility(0);
        smallActionButton.setText(textLocalisedClause);
        smallActionButton.setOnClickListener(null);
        smallActionButton.setEnabled(true);
        smallActionButton.setClickable(false);
        t4Var.v.setVisibility(8);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(R$id.bigTile_footerText, 7, i2, 6);
        constraintSet.applyTo(constraintLayout);
        Context context = t4Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackgroundColor(kli.a.s(k4Var.f164956c, context));
        view.setOnClickListener(new ip0.g0(cVar, 1));
        view.setEnabled(true);
        view.setVisibility(0);
    }

    public final void z(boolean z, ip0.t4 t4Var, Model model) {
        if (!z) {
            t4Var.itemView.findViewById(R$id.bigTile_cardForeground).setOnClickListener(null);
            t4Var.itemView.findViewById(R$id.bigTile_cardForeground).setClickable(false);
            return;
        }
        View viewFindViewById = t4Var.itemView.findViewById(R$id.bigTile_cardForeground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Clause clause = model.f51731b;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(viewFindViewById);
        viewFindViewById.setOnClickListener(new au0.i3(model, cVar, this, model, 9));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BigTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {
        public p31.c A;
        public p31.c B;
        public p31.c C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ip0.r4 f51732c;
        public final Image d;
        public final ms0.s4 e;
        public final cd.e f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f51733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final aw0.l f51734h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f51735j;
        public final ip0.k4 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b f51736l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Float f51737m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ip0.j4 f51738n;
        public final ip0.p4 o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final aw0.v1 f51739p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final ip0.m4 f51740q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final AnimationRequest f51741r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Object f51742s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Parcelable f51743t;
        public int u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f51744w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f51745x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public qv0.c f51746y;
        public p31.c z;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Image image, ip0.r4 r4Var, Image image2, ms0.s4 s4Var, cd.e eVar, List list, aw0.l lVar, boolean z, boolean z3, ip0.k4 k4Var, Object obj2, AnalyticsContext analyticsContext, ip0.m4 m4Var, aw0.v1 v1Var, int i) {
            ip0.r4 r4Var2 = (i & 8) != 0 ? null : r4Var;
            Image image3 = (i & 16) != 0 ? null : image2;
            ms0.s4 s4Var2 = (i & 32) != 0 ? null : s4Var;
            cd.e eVar2 = (i & 64) != 0 ? null : eVar;
            List actions = (i & 128) != 0 ? zhm.f0.f322471a : list;
            boolean z4 = (i & 512) != 0 ? false : z;
            boolean z6 = (i & 1024) != 0 ? true : z3;
            ip0.k4 k4Var2 = (i & 2048) != 0 ? null : k4Var;
            ip0.p4 titleStyle = ip0.p4.DEFAULT;
            Object obj3 = (131072 & i) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (262144 & i) != 0 ? null : analyticsContext;
            ip0.m4 ratio = (524288 & i) != 0 ? ip0.m4.NORMAL : m4Var;
            aw0.v1 colorScheme = (i & PKIFailureInfo.badCertTemplate) != 0 ? aw0.v1.DARK : v1Var;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(actions, "actions");
            ip0.h4 cardState = ip0.h4.f164503a;
            Intrinsics.checkNotNullParameter(cardState, "cardState");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            this(listId, clause, r4Var2, image3, s4Var2, eVar2, actions, lVar, z4, z6, k4Var2, image == null ? null : new b(image != null ? new o1(image) : null, null), null, cardState, titleStyle, colorScheme, ratio, null, obj3, analyticsContext2, i2, i2, i2, i2);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new BigTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53832y() {
            return this.f51742s;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53816a() {
            return this.f51730a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51730a, model.f51730a) && Intrinsics.f(this.f51731b, model.f51731b) && Intrinsics.f(this.f51732c, model.f51732c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51733g, model.f51733g) && Intrinsics.f(this.f51734h, model.f51734h) && this.i == model.i && this.f51735j == model.f51735j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51736l, model.f51736l) && Intrinsics.f(this.f51737m, model.f51737m) && Intrinsics.f(this.f51738n, model.f51738n) && this.o == model.o && this.f51739p == model.f51739p && this.f51740q == model.f51740q && Intrinsics.f(this.f51741r, model.f51741r) && Intrinsics.f(this.f51742s, model.f51742s) && Intrinsics.f(this.f51743t, model.f51743t) && this.u == model.u && this.v == model.v && this.f51744w == model.f51744w && this.f51745x == model.f51745x && Intrinsics.f(this.f51746y, model.f51746y) && Intrinsics.f(this.z, model.z) && Intrinsics.f(this.A, model.A) && Intrinsics.f(this.B, model.B) && Intrinsics.f(this.C, model.C);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getA() {
            return this.u;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.u = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getZ() {
            return this.f51743t;
        }

        public final int hashCode() {
            int iHashCode = this.f51730a.hashCode() * 31;
            Clause clause = this.f51731b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            ip0.r4 r4Var = this.f51732c;
            int iHashCode3 = (iHashCode2 + (r4Var == null ? 0 : r4Var.f166103a.hashCode())) * 31;
            Image image = this.d;
            int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            ms0.s4 s4Var = this.e;
            int iHashCode5 = (iHashCode4 + (s4Var == null ? 0 : s4Var.hashCode())) * 31;
            cd.e eVar = this.f;
            int iD = p.a.d((iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f51733g);
            aw0.l lVar = this.f51734h;
            int iC = j6.a.c(j6.a.c((iD + (lVar == null ? 0 : lVar.hashCode())) * 961, 31, this.i), 31, this.f51735j);
            ip0.k4 k4Var = this.k;
            int iHashCode6 = (iC + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
            b bVar = this.f51736l;
            int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Float f = this.f51737m;
            int iHashCode8 = (this.f51740q.hashCode() + ((this.f51739p.hashCode() + ((this.o.hashCode() + ((this.f51738n.hashCode() + ((iHashCode7 + (f == null ? 0 : f.hashCode())) * 31)) * 31)) * 961)) * 31)) * 31;
            AnimationRequest animationRequest = this.f51741r;
            int iHashCode9 = (iHashCode8 + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Object obj2 = this.f51742s;
            int iHashCode10 = (iHashCode9 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51743t;
            int i = h30.l.i(this.f51746y, j6.a.b(this.f51745x, j6.a.b(this.f51744w, j6.a.b(this.v, j6.a.b(this.u, (iHashCode10 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.z;
            int iHashCode11 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.A;
            int iHashCode12 = (iHashCode11 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.B;
            int iHashCode13 = (iHashCode12 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.C;
            return iHashCode13 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51992p() {
            return this.z;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51746y = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51993q() {
            return this.A;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.B = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getB() {
            return this.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getD() {
            return this.f51745x;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.v = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.f51746y;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51995s() {
            return this.C;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51994r() {
            return this.B;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.z = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51743t = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getC() {
            return this.f51744w;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.A = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.C = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !Intrinsics.f(model.f51731b, this.f51731b);
            boolean z3 = !Intrinsics.f(model.d, this.d);
            boolean z4 = !Intrinsics.f(model.f51733g, this.f51733g);
            boolean z6 = !Intrinsics.f(model.e, this.e);
            boolean z11 = !Intrinsics.f(model.f, this.f);
            boolean z12 = !Intrinsics.f(model.f51734h, this.f51734h);
            boolean z29 = false;
            if (model.i != this.i) {
                z29 = true;
            }
            return new ip0.l4(z, z3, z4, z6, z11, z12, z29, !Intrinsics.f(model.f51732c, this.f51732c), !Intrinsics.f(model.k, this.k), !Intrinsics.f(model.f51736l, this.f51736l), !Intrinsics.f(model.f51742s, this.f51742s), !Intrinsics.f(model.f51738n, this.f51738n), model.o != this.o, !true, model.f51739p != this.f51739p, !Intrinsics.e(model.f51737m, this.f51737m), model.f51740q != this.f51740q);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Image image, ms0.s4 s4Var, ip0.n4 n4Var, boolean z, ip0.k4 k4Var, b bVar, ip0.j4 j4Var, AnimationRequest animationRequest, Object obj2, AnalyticsContext analyticsContext, ip0.m4 m4Var, aw0.v1 v1Var, Float f, int i) {
            ms0.s4 s4Var2 = (i & 16) != 0 ? null : s4Var;
            ip0.n4 n4Var2 = (i & 32) != 0 ? null : n4Var;
            zhm.f0 actions = zhm.f0.f322471a;
            ip0.k4 k4Var2 = (i & 1024) != 0 ? null : k4Var;
            ip0.j4 cardState = (i & 4096) != 0 ? ip0.h4.f164503a : j4Var;
            ip0.p4 titleStyle = ip0.p4.DEFAULT;
            AnimationRequest animationRequest2 = (32768 & i) != 0 ? null : animationRequest;
            Object obj3 = (65536 & i) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (131072 & i) != 0 ? null : analyticsContext;
            ip0.m4 ratio = (262144 & i) != 0 ? ip0.m4.NORMAL : m4Var;
            aw0.v1 colorScheme = (524288 & i) != 0 ? aw0.v1.DARK : v1Var;
            Float f4 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : f;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(cardState, "cardState");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            this(listId, clause, null, image, s4Var2, n4Var2, actions, null, z, true, k4Var2, bVar, f4, cardState, titleStyle, colorScheme, ratio, animationRequest2, obj3, analyticsContext2, i2, i2, i2, i2);
        }

        public Model(String str, Clause clause, ip0.r4 r4Var, Image image, ms0.s4 s4Var, cd.e eVar, List list, aw0.l lVar, boolean z, boolean z3, ip0.k4 k4Var, b bVar, Float f, ip0.j4 j4Var, ip0.p4 p4Var, aw0.v1 v1Var, ip0.m4 m4Var, AnimationRequest animationRequest, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            this.f51730a = str;
            this.f51731b = clause;
            this.f51732c = r4Var;
            this.d = image;
            this.e = s4Var;
            this.f = eVar;
            this.f51733g = list;
            this.f51734h = lVar;
            this.i = z;
            this.f51735j = z3;
            this.k = k4Var;
            this.f51736l = bVar;
            this.f51737m = f;
            this.f51738n = j4Var;
            this.o = p4Var;
            this.f51739p = v1Var;
            this.f51740q = m4Var;
            this.f51741r = animationRequest;
            this.f51742s = obj2;
            this.f51743t = parcelable;
            this.u = i;
            this.v = i2;
            this.f51744w = i3;
            this.f51745x = i5;
            this.f51746y = c.d.f249513a;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
        }
    }
}
