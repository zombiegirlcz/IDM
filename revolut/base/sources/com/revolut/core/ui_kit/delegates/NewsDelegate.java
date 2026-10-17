package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LockableImageView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.py;
import ip0.qy;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/NewsDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/w9;", "<init>", "()V", "Companion", "Model", "ip0/py", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewsDelegate extends BaseRecyclerViewDelegate<Model, w9> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aw0.w4 f52830h = new aw0.w4(new fv(22));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52831c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4g.g f52832g;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.NewsDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public NewsDelegate() {
        super(R$layout.internal_delegate_news, new fv(21));
        this.f52831c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        ihm.f fVarD = v0.a.d("create(...)");
        this.f = fVarD;
        this.f52832g = new i4g.g(1, fVarD, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 22);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new w9(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    public final efm.r p() {
        efm.r rVarHide = this.f52831c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final efm.r q() {
        efm.r rVarHide = this.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final efm.r r() {
        efm.r rVarHide = this.e.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(w9 holder, Model data, int i, List list) {
        String str;
        boolean z;
        boolean z3;
        boolean z4;
        int i2;
        LockableImageView.b bVar;
        Pair pair;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f54909h;
        LockableImageView lockableImageView = holder.i;
        LockableImageView lockableImageView2 = holder.f54910j;
        TextView textView2 = holder.f;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof py)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z6 = zIsEmpty;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        int i5 = 0;
        while (i5 < size2) {
            py pyVar = (py) payloads.get(i5);
            z11 = z11 || pyVar.f165901a;
            z12 = z12 || pyVar.f165902b;
            boolean z74 = z6 || pyVar.f165903c;
            z29 = z29 || pyVar.d;
            List list2 = payloads;
            z49 = z49 || pyVar.e;
            z31 = z31 || pyVar.f;
            z41 = z41 || pyVar.f165904g;
            z54 = z54 || pyVar.f165905h;
            i5++;
            z6 = z74;
            payloads = list2;
        }
        if (z6) {
            Model.b style = data.i;
            Intrinsics.checkNotNullParameter(style, "style");
            Model.b.d dVar = Model.b.d.f52856a;
            String str2 = Intrinsics.f(style, dVar) ? "343:200" : (Intrinsics.f(style, Model.b.a.f52847a) || Intrinsics.f(style, Model.b.C0414b.f52850a)) ? "168:96" : style instanceof Model.b.e ? "1:1" : null;
            if (str2 != null) {
                ViewGroup.LayoutParams layoutParams = lockableImageView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.dimensionRatio = str2;
                lockableImageView2.setLayoutParams(layoutParams2);
            }
            jb3.l.e(textView2, Intrinsics.f(style, dVar) ? R$attr.internal_textAppearanceHeading3 : R$attr.internal_textAppearanceEmphasis1);
            textView2.setMinLines(((style instanceof v9) || (style instanceof Model.b.e)) ? 1 : 3);
            if (Intrinsics.f(style, Model.b.C0414b.f52850a)) {
                float fA = r6.b.a(holder.itemView, "getContext(...)", 8.0f);
                z = z11;
                pair = new Pair(Float.valueOf(fA), Float.valueOf(fA));
            } else {
                z = z11;
                if (style instanceof Model.b.e) {
                    float fA2 = r6.b.a(holder.itemView, "getContext(...)", 24.0f);
                    pair = new Pair(Float.valueOf(fA2), Float.valueOf(fA2));
                } else {
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    pair = new Pair(Float.valueOf(kli.a.l(context, 8.0f)), Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                }
            }
            float fFloatValue = ((Number) pair.f186385a).floatValue();
            float fFloatValue2 = ((Number) pair.f186386b).floatValue();
            z3 = z12;
            lockableImageView2.setShapeAppearanceModel(lockableImageView2.getShapeAppearanceModel().toBuilder().setTopLeftCorner(0, fFloatValue).setTopRightCorner(0, fFloatValue).setBottomLeftCorner(0, fFloatValue2).setBottomRightCorner(0, fFloatValue2).build());
            int iA = Intrinsics.f(style, Model.b.c.f52853a) ? com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 96.0f) : 0;
            ConstraintLayout constraintLayout = holder.f54911l;
            ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
            constraintSetL.constrainMinHeight(R$id.newsdelegate_contentContainer, iA);
            constraintSetL.applyTo(constraintLayout);
            Context context2 = holder.itemView.getContext();
            Intrinsics.h(context2);
            int iW = kli.a.w(style.c(), context2);
            int iW2 = kli.a.w(style.a(), context2);
            int iW3 = kli.a.w(style.b(), context2);
            ConstraintLayout constraintLayout2 = holder.f54912m;
            ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            z4 = z29;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            str = "data";
            if (marginLayoutParams.topMargin != iW || marginLayoutParams.bottomMargin != iW2 || marginLayoutParams.getMarginStart() != iW3) {
                marginLayoutParams.topMargin = iW;
                marginLayoutParams.bottomMargin = iW2;
                marginLayoutParams.setMarginStart(iW3);
                constraintLayout2.setLayoutParams(marginLayoutParams);
            }
            View view = !style.e() ? lockableImageView : null;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams2.topMargin != iW || marginLayoutParams2.bottomMargin != iW2) {
                    marginLayoutParams2.topMargin = iW;
                    marginLayoutParams2.bottomMargin = iW2;
                    view.setLayoutParams(marginLayoutParams2);
                }
            }
            int iW4 = kli.a.w(style.d(), context2);
            ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams3.topMargin != iW4) {
                marginLayoutParams3.topMargin = iW4;
                textView.setLayoutParams(marginLayoutParams3);
            }
            Model.b style2 = data.i;
            TextView textView3 = holder.f54908g;
            Intrinsics.checkNotNullParameter(style2, "style");
            ?? r87 = style2 instanceof v9 ? ((v9) style2).f54860a : style2 instanceof Model.b.e ? ((Model.b.e) style2).f52859a : 0;
            if (style2 instanceof Model.b.e) {
                jb3.l.e(textView3, R$attr.internal_textAppearanceEmphasis2);
                textView3.setTextColor(holder.f54918t);
            } else {
                jb3.l.e(textView3, R$attr.internal_textAppearanceBody2);
                textView3.setTextColor(holder.u);
            }
            kli.a.b(textView3, r87, ty0.f.f275450a);
        } else {
            str = "data";
            z = z11;
            z3 = z12;
            z4 = z29;
        }
        if (z) {
            Image image = data.f52835c;
            Model.b bVar2 = data.i;
            or0.b.f(this, !bVar2.e() ? image : null, lockableImageView);
            if (!bVar2.e()) {
                image = null;
            }
            or0.b.f(this, image, lockableImageView2);
        }
        if (z3 || z4) {
            boolean z83 = (data.d == null && data.e == null) ? false : true;
            if (z83) {
                i2 = 3;
            } else {
                if (z83) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 4;
            }
            textView2.setMaxLines(i2);
        }
        if (z4) {
            kli.a.b(textView2, data.f52834b, ty0.f.f275450a);
        }
        if (z31) {
            List list3 = data.f52837h;
            if (list3 == null || list3.isEmpty()) {
                holder.k.setVisibility(8);
            }
            if (list3 != null) {
                OverlappedIconsView.setIcons$default(holder.k, zhm.d0.V0(list3, 3), mx0.bb.SIZE20_OFFSET4, mx0.cb.TOP_TO_BOTTOM, 0, false, 16, null);
            }
        }
        if (z41) {
            Model.c state = data.f52838j;
            Intrinsics.checkNotNullParameter(state, "state");
            float fA3 = state.a();
            View view2 = holder.itemView;
            Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, fA3, iD, 1)) {
            }
            if (state.equals(Model.c.C0415c.f52864a)) {
                bVar = LockableImageView.b.C0440b.f58758a;
            } else {
                if (!state.equals(Model.c.b.f52863a) && !state.equals(Model.c.a.f52862a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = LockableImageView.b.a.f58757a;
            }
            lockableImageView2.setState(bVar);
            lockableImageView.setState(bVar);
        }
        if (z3) {
            Clause clause = data.d;
            Clause clause2 = data.e;
            Clause clause3 = data.f;
            kli.a.b(holder.f54913n, clause, ty0.f.f275450a);
            TextView textView4 = holder.f54914p;
            if (clause == null || clause2 == null) {
                clause3 = null;
            }
            kli.a.b(textView4, clause3, ty0.f.f275450a);
            kli.a.b(holder.o, clause2, ty0.f.f275450a);
        }
        String str3 = str;
        Intrinsics.checkNotNullParameter(data, str3);
        ihm.f itemClickSubject = this.f52831c;
        Intrinsics.checkNotNullParameter(itemClickSubject, "itemClickSubject");
        fp0.p pVar = holder.f54915q;
        TextClause textClause = data.f52834b;
        Clause clause4 = data.f52836g;
        py0.c cVar = textClause != null ? new py0.c(textClause) : null;
        fp0.p.b(pVar, true);
        View view3 = pVar.f137029a;
        or0.m.a(view3);
        view3.setOnClickListener(new ip0.d6(data, cVar, holder, itemClickSubject, data, 5));
        Intrinsics.checkNotNullParameter(data, str3);
        ihm.f firstStrapClickSubject = this.d;
        Intrinsics.checkNotNullParameter(firstStrapClickSubject, "firstStrapClickSubject");
        fp0.p pVar2 = holder.f54916r;
        boolean z89 = data.d != null;
        fp0.p.b(pVar2, z89);
        View view4 = pVar2.f137029a;
        or0.m.a(view4);
        if (z89) {
            view4.setOnClickListener(new qy(firstStrapClickSubject, data, 0));
        } else {
            or0.u.o(view4);
        }
        Intrinsics.checkNotNullParameter(data, str3);
        ihm.f secondStrapClickSubject = this.e;
        Intrinsics.checkNotNullParameter(secondStrapClickSubject, "secondStrapClickSubject");
        fp0.p pVar3 = holder.f54917s;
        boolean z96 = data.e != null;
        fp0.p.b(pVar3, z96);
        View view5 = pVar3.f137029a;
        or0.m.a(view5);
        if (z96) {
            view5.setOnClickListener(new qy(secondStrapClickSubject, data, 1));
        } else {
            or0.u.o(view5);
        }
        Intrinsics.checkNotNullParameter(data, str3);
        i4g.g footerClauseClickListener = this.f52832g;
        Intrinsics.checkNotNullParameter(footerClauseClickListener, "footerClauseClickListener");
        kli.a.d(textView, clause4, data, footerClauseClickListener, 8);
        if (z49) {
            kli.a.I(textView, clause4);
        }
        if (z54) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewsDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final DotDividerClause v = new DotDividerClause((Integer) null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f52834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f52835c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f52836g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f52837h;
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f52838j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52839l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f52840m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52841n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52842p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52843q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52844r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f52845s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f52846t;
        public final int u;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.NewsDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static CompositeClause a(Companion companion, TimeClause timeClause, TextClause textClause) {
                Companion companion2 = Model.INSTANCE;
                companion.getClass();
                Clause[] elements = {timeClause, Model.v, textClause, null, null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                List list = !listL.isEmpty() ? listL : null;
                if (list != null) {
                    return new CompositeClause(list, null, null, null, 14);
                }
                return null;
            }
        }

        public static abstract class c {

            public static final class a extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f52862a = new a();

                private a() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.c
                public final float a() {
                    return 0.5f;
                }
            }

            public static final class b extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f52863a = new b();

                private b() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.c
                public final float a() {
                    return 1.0f;
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.NewsDelegate$Model$c$c, reason: collision with other inner class name */
            public static final class C0415c extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0415c f52864a = new C0415c();

                private C0415c() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.c
                public final float a() {
                    return 0.5f;
                }
            }

            private c() {
            }

            public abstract float a();
        }

        static {
            new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
        }

        public Model(String listId, TextClause title, Image image, Clause clause, Clause clause2, Clause clause3, List list, b style, c state, Object obj2, AnalyticsContext analyticsContext, int i) {
            clause = (i & 8) != 0 ? null : clause;
            clause2 = (i & 16) != 0 ? null : clause2;
            clause3 = (i & 64) != 0 ? null : clause3;
            list = (i & 128) != 0 ? null : list;
            style = (i & 256) != 0 ? b.c.f52853a : style;
            state = (i & 512) != 0 ? c.b.f52863a : state;
            analyticsContext = (i & 2048) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            int i2 = R$attr.uikit_dp0;
            this.f52833a = listId;
            this.f52834b = title;
            this.f52835c = image;
            this.d = clause;
            this.e = clause2;
            this.f = v;
            this.f52836g = clause3;
            this.f52837h = list;
            this.i = style;
            this.f52838j = state;
            this.k = obj2;
            this.f52839l = analyticsContext;
            this.f52840m = c.d.f249513a;
            this.f52841n = null;
            this.o = null;
            this.f52842p = null;
            this.f52843q = null;
            this.f52844r = i2;
            this.f52845s = i2;
            this.f52846t = i2;
            this.u = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new NewsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52674b() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52673a() {
            return this.f52833a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52833a, model.f52833a) && Intrinsics.f(this.f52834b, model.f52834b) && Intrinsics.f(this.f52835c, model.f52835c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52836g, model.f52836g) && Intrinsics.f(this.f52837h, model.f52837h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52838j, model.f52838j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52839l, model.f52839l) && Intrinsics.f(this.f52840m, model.f52840m) && Intrinsics.f(this.f52841n, model.f52841n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52842p, model.f52842p) && Intrinsics.f(this.f52843q, model.f52843q) && this.f52844r == model.f52844r && this.f52845s == model.f52845s && this.f52846t == model.f52846t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52683q() {
            return this.f52844r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52844r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f52839l;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(this.f52833a.hashCode() * 31, 31, this.f52834b);
            Image image = this.f52835c;
            int iHashCode = (iB + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.d;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.f;
            int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.f52836g;
            int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            List list = this.f52837h;
            int iHashCode6 = (this.f52838j.hashCode() + ((this.i.hashCode() + ((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
            Object obj2 = this.k;
            int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52839l;
            int i = h30.l.i(this.f52840m, (iHashCode7 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52841n;
            int iHashCode8 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode9 = (iHashCode8 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52842p;
            int iHashCode10 = (iHashCode9 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52843q;
            return Integer.hashCode(this.u) + j6.a.b(this.f52846t, j6.a.b(this.f52845s, j6.a.b(this.f52844r, (iHashCode10 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52680m() {
            return this.f52841n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52840m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52681n() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52842p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52684r() {
            return this.f52845s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52686t() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52845s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52679l() {
            return this.f52840m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52682p() {
            return this.f52843q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f52842p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52841n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52839l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52685s() {
            return this.f52846t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52843q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new py(!Intrinsics.f(model.f52835c, this.f52835c), (Intrinsics.f(model.d, this.d) && Intrinsics.f(model.e, this.e) && Intrinsics.f(model.f, this.f)) ? false : true, !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f52834b, this.f52834b), !Intrinsics.f(model.f52836g, this.f52836g), !Intrinsics.f(model.f52837h, this.f52837h), !Intrinsics.f(model.f52838j, this.f52838j), or0.b.l(this, (qv0.i) oldItem));
        }

        public static abstract class b {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f52847a = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f52848b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f52849c;
                public static final int d;
                public static final int e;

                static {
                    int i = R$attr.uikit_dp12;
                    f52848b = i;
                    f52849c = i;
                    d = R$attr.uikit_dp16;
                    e = i;
                }

                private a() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int a() {
                    return f52849c;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int b() {
                    return d;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int c() {
                    return f52848b;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int d() {
                    return e;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final boolean e() {
                    return true;
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.NewsDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0414b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0414b f52850a = new C0414b();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f52851b = R$attr.uikit_dp16;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f52852c = R$attr.uikit_dp24;
                public static final int d = R$attr.uikit_dp0;
                public static final int e = R$attr.uikit_dp8;

                private C0414b() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int a() {
                    return f52852c;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int b() {
                    return d;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int c() {
                    return f52851b;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int d() {
                    return e;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final boolean e() {
                    return true;
                }
            }

            public static final class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f52853a = new c();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f52854b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f52855c;
                public static final int d;
                public static final int e;

                static {
                    int i = R$attr.uikit_dp12;
                    f52854b = i;
                    f52855c = i;
                    d = R$attr.uikit_dp16;
                    e = R$attr.uikit_dp8;
                }

                private c() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int a() {
                    return f52855c;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int b() {
                    return d;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int c() {
                    return f52854b;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int d() {
                    return e;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final boolean e() {
                    return false;
                }
            }

            public static final class d extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f52856a = new d();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f52857b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f52858c;
                public static final int d;
                public static final int e;

                static {
                    int i = R$attr.uikit_dp16;
                    f52857b = i;
                    f52858c = i;
                    d = i;
                    e = R$attr.uikit_dp8;
                }

                private d() {
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int a() {
                    return f52858c;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int b() {
                    return d;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int c() {
                    return f52857b;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int d() {
                    return e;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final boolean e() {
                    return true;
                }
            }

            private b() {
            }

            public abstract int a();

            public abstract int b();

            public abstract int c();

            public abstract int d();

            public abstract boolean e();

            public static final class e extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f52859a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f52860b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f52861c;
                public final int d;
                public final int e;

                public e(Clause clause) {
                    this.f52859a = clause;
                    int i = R$attr.uikit_dp8;
                    this.f52860b = i;
                    this.f52861c = R$attr.uikit_dp12;
                    this.d = R$attr.uikit_dp0;
                    this.e = i;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int a() {
                    return this.f52861c;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int b() {
                    return this.d;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int c() {
                    return this.f52860b;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final int d() {
                    return this.e;
                }

                @Override // com.revolut.core.ui_kit.delegates.NewsDelegate.Model.b
                public final boolean e() {
                    return true;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof e) && Intrinsics.f(this.f52859a, ((e) obj2).f52859a);
                }

                public final int hashCode() {
                    Clause clause = this.f52859a;
                    if (clause == null) {
                        return 0;
                    }
                    return clause.hashCode();
                }

                public e() {
                    this(null);
                }
            }
        }
    }
}
