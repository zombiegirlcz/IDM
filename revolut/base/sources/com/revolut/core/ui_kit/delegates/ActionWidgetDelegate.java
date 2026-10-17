package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionWidgetDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ActionWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/r;", "<init>", "()V", "Model", "ip0/p", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionWidgetDelegate extends BaseRecyclerViewDelegate<Model, r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51589c;
    public final e01.a d;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$a, reason: collision with other inner class name */
        public static final class C0395a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0395a f51607a = new C0395a();

            private C0395a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f51608a = new b();

            private b() {
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f51609a = new c();

            private c() {
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f51610a = new d();

            private d() {
            }
        }

        private a() {
        }
    }

    public ActionWidgetDelegate() {
        super(R$layout.internal_delegate_action_widget, new ip0.c(4));
        this.f51589c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model$b$a] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(r holder, Model data, int i, List list) {
        char c2;
        ActionWidgetDelegate actionWidgetDelegate;
        py0.c cVar;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        AppCompatTextView appCompatTextView = holder.i;
        AppCompatTextView appCompatTextView2 = holder.f54643j;
        AppCompatImageView appCompatImageView = holder.f54644l;
        AppCompatTextView appCompatTextView3 = holder.f;
        AppCompatTextView appCompatTextView4 = holder.f54642h;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        boolean zN9 = ue0.e.n(payloads);
        boolean zN10 = ue0.e.n(payloads);
        int size = payloads.size();
        boolean z = zN2;
        boolean z3 = zN;
        boolean z4 = zN10;
        int i2 = 0;
        boolean z6 = zN9;
        boolean z11 = zN8;
        boolean z12 = zN7;
        boolean z29 = zN6;
        boolean z31 = zN5;
        boolean z41 = zN4;
        boolean z49 = zN3;
        while (i2 < size) {
            Object obj2 = payloads.get(i2);
            if (obj2 instanceof ip0.p) {
                z3 = z3 || ((ip0.p) obj2).f165740a;
                boolean z54 = z || ((ip0.p) obj2).f165741b;
                z49 = z49 || ((ip0.p) obj2).f165742c;
                z41 = z41 || ((ip0.p) obj2).d;
                z31 = z31 || ((ip0.p) obj2).e;
                z29 = z29 || ((ip0.p) obj2).f;
                z = z54;
                z12 = z12 || ((ip0.p) obj2).f165743g;
                z11 = z11 || ((ip0.p) obj2).f165744h;
                z6 = z6 || ((ip0.p) obj2).i;
                z4 = z4 || ((ip0.p) obj2).f165745j;
            }
            i2++;
            payloads = list;
        }
        if (z3) {
            kli.a.b(appCompatTextView3, data.f51591b, ty0.f.f275450a);
        }
        if (z) {
            int i3 = data.f51592c;
            appCompatTextView3.setMaxLines(i3);
            appCompatTextView3.setEllipsize(i3 == Integer.MAX_VALUE ? null : TextUtils.TruncateAt.END);
        }
        int i5 = 4;
        if (z49) {
            kli.a.d(appCompatTextView4, data.d, data, new s(1, 0, ihm.f.class, holder.f54651t, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            ix0.c0 c0Var = ix0.c0.f169220a;
            appCompatTextView4.setOnTouchListener(new ar0.a(c0Var, holder, i5));
            appCompatTextView4.setMovementMethod(c0Var);
        }
        if (z41) {
            int i6 = data.e;
            appCompatTextView4.setMaxLines(i6);
            appCompatTextView4.setEllipsize(i6 == Integer.MAX_VALUE ? null : TextUtils.TruncateAt.END);
        }
        if (z31) {
            o oVar = data.f;
            if (oVar instanceof l) {
                holder.K(null);
                holder.M((l) oVar);
            } else if (oVar instanceof n) {
                holder.M(null);
                holder.K((n) oVar);
            } else {
                if (oVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                holder.M(null);
                holder.K(null);
            }
        }
        if (z29) {
            Model.b style = data.f51593g;
            Context context = holder.f54652w;
            Intrinsics.checkNotNullParameter(style, "style");
            if (Intrinsics.f(style, Model.b.C0394b.f51606a)) {
                appCompatImageView.setVisibility(8);
                AppCompatTextView appCompatTextView5 = holder.f;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                or0.u.y(appCompatTextView5, 0, 0, kli.a.k(context, 16.0f), 0, 11);
                appCompatTextView.setVisibility(8);
                appCompatTextView2.setVisibility(8);
            } else if (style instanceof Model.b.a) {
                appCompatImageView.setVisibility(0);
                AppCompatTextView appCompatTextView6 = holder.f;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                or0.u.y(appCompatTextView6, 0, 0, kli.a.k(context, 32.0f), 0, 11);
                appCompatTextView.setVisibility(8);
                appCompatTextView2.setVisibility(8);
            } else {
                if (!(style instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                appCompatImageView.setVisibility(8);
                AppCompatTextView appCompatTextView7 = holder.f;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                or0.u.y(appCompatTextView7, 0, 0, kli.a.k(context, 16.0f), 0, 11);
                p pVar = (p) style;
                kli.a.b(appCompatTextView, pVar.f54565a, ty0.f.f275450a);
                kli.a.b(appCompatTextView2, pVar.f54566b, ty0.f.f275450a);
            }
        }
        if (z12) {
            Model.a style2 = data.f51594h;
            q widgetTheme = data.i;
            Intrinsics.checkNotNullParameter(style2, "style");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            SmallActionButton smallActionButtonI = holder.I(style2);
            SmallActionButton smallActionButtonJ = holder.J(style2);
            if (style2 instanceof i) {
                smallActionButtonJ.setVisibility(8);
                i iVar = (i) style2;
                r.F(smallActionButtonI, iVar.f54265a, iVar.f54266b, iVar.f54267c);
                smallActionButtonI.i(widgetTheme.c());
                smallActionButtonI.setLoadingButtonTag(iVar.d);
            } else if (style2 instanceof j) {
                smallActionButtonI.setVisibility(8);
                j jVar = (j) style2;
                Image image = jVar.f54312b;
                r.F(smallActionButtonJ, jVar.f54311a, image, jVar.f54313c);
                smallActionButtonJ.setIcon(image);
                smallActionButtonJ.i(widgetTheme.d());
                smallActionButtonJ.setLoadingButtonTag(null);
            } else if (style2 instanceof k) {
                k kVar = (k) style2;
                Image image2 = kVar.d;
                Image image3 = kVar.f54356c;
                c2 = 4;
                r.F(smallActionButtonI, kVar.f54354a, image3, true);
                smallActionButtonI.setIcon(image3);
                smallActionButtonI.i(widgetTheme.c());
                r.F(smallActionButtonJ, kVar.f54355b, image2, true);
                smallActionButtonJ.setIcon(image2);
                smallActionButtonJ.i(widgetTheme.d());
                smallActionButtonI.setLoadingButtonTag(kVar.f);
                smallActionButtonJ.setLoadingButtonTag(kVar.f54357g);
            } else {
                c2 = 4;
                if (!(style2 instanceof Model.a.C0393a)) {
                    throw new NoWhenBranchMatchedException();
                }
                smallActionButtonI.setVisibility(8);
                smallActionButtonJ.setVisibility(8);
            }
            c2 = 4;
        } else {
            c2 = 4;
        }
        if (z11 || z4) {
            qv0.c positionInBox = data.f51598n;
            q theme = data.i;
            Model.a buttonsStyle = data.f51594h;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Context context2 = holder.itemView.getContext();
            Integer numA = theme.a();
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Context context3 = holder.itemView.getContext();
            Intrinsics.h(context3);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context3));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
            LayerDrawable layerDrawable = numA != null ? new LayerDrawable(new Drawable[]{context3.getDrawable(numA.intValue())}) : null;
            if (Intrinsics.f(positionInBox, c.d.f249513a)) {
                positionInBox = new c.e((qv0.h) null, 3);
            }
            Drawable drawableE = dr0.b.e(context3, positionInBox);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.v.a(itemView, positionInBox);
            holder.itemView.setBackground(new RippleDrawable(colorStateListValueOf, layerDrawable, drawableE));
            Intrinsics.h(context2);
            appCompatTextView3.setTextColor(kli.a.s(theme.f(), context2));
            appCompatTextView4.setTextColor(kli.a.s(theme.e(), context2));
            appCompatTextView.setTextColor(kli.a.s(theme.h(), context2));
            appCompatTextView2.setTextColor(kli.a.s(theme.i(), context2));
            rd0.e.q(appCompatImageView, Integer.valueOf(kli.a.s(theme.b(), context2)));
            holder.I(buttonsStyle).i(theme.c());
            holder.J(buttonsStyle).i(theme.d());
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            actionWidgetDelegate = this;
            or0.b.o(actionWidgetDelegate, data, itemView2);
        } else {
            actionWidgetDelegate = this;
        }
        AnimationRequest animationRequest = data.k;
        if (animationRequest != null && !animationRequest.f57724a) {
            animationRequest.f57724a = true;
            holder.H().a();
            holder.H().c();
        } else if (animationRequest == null) {
            holder.H().a();
        }
        if (!z6) {
            cVar = null;
        } else if (data.f51595j) {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            or0.m.a(itemView3);
            itemView3.setOnClickListener(new au0.r2(data, holder, 3));
            holder.itemView.setClickable(true);
            cVar = null;
        } else {
            cVar = null;
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
        }
        Parcelable parcelable = data.f51597m;
        holder.f54645m.setAnalyticsContext(parcelable);
        holder.f54646n.setAnalyticsContext(parcelable);
        j01.e.Companion.getClass();
        j01.d.a(appCompatImageView);
        Model.b bVar = data.f51593g;
        Model.a aVar = data.f51594h;
        ?? r06 = bVar instanceof Model.b.a ? (Model.b.a) bVar : cVar;
        ?? r09 = r06 != 0 ? r06.f51605a : cVar;
        if (r09 != 0) {
            cVar = new py0.c(r09);
        }
        or0.m.a(appCompatImageView);
        appCompatImageView.setOnClickListener(new au0.t1(data, 5, cVar, holder));
        int i21 = 26;
        efm.r map = holder.I(aVar).f56386h.map(new ihd.c(i21, new im3.e(i21)));
        int i22 = 27;
        efm.r map2 = holder.J(aVar).f56386h.map(new ihd.c(i22, new im3.e(i22)));
        int i32 = 23;
        efm.r map3 = holder.f54650s.map(new ihd.c(21, new im3.e(i32)));
        int i33 = 24;
        efm.r map4 = holder.f54649r.map(new ihd.c(22, new im3.e(i33)));
        int i43 = 25;
        efm.r map5 = holder.f54651t.map(new ihd.c(i32, new im3.e(i43)));
        efm.w[] wVarArr = new efm.w[5];
        wVarArr[0] = map;
        wVarArr[1] = map2;
        wVarArr[2] = map3;
        wVarArr[3] = map4;
        wVarArr[c2] = map5;
        efm.r map6 = efm.r.mergeArray(wVarArr).map(new ihd.c(i33, new ip0.o(data, 0)));
        Intrinsics.h(map6);
        actionWidgetDelegate.f51589c.a(map6, holder);
        efm.r map7 = holder.H().f.map(new ihd.c(i43, new ip0.o(data, 1)));
        Intrinsics.h(map7);
        actionWidgetDelegate.d.a(map7, holder);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionWidgetDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "b", "a", "com/revolut/core/ui_kit/delegates/q", "com/revolut/core/ui_kit/delegates/o", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51592c;
        public final Clause d;
        public final int e;
        public final o f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f51593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f51594h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f51595j;
        public final AnimationRequest k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f51596l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f51597m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f51598n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51599p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51600q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f51601r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f51602s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f51603t;
        public final int u;
        public final int v;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0393a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0393a f51604a = new C0393a();

                private C0393a() {
                }
            }

            private a() {
            }
        }

        public static abstract class b {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0394b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0394b f51606a = new C0394b();

                private C0394b() {
                }
            }

            private b() {
            }

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f51605a;

                public a(TextLocalisedClause textLocalisedClause) {
                    this.f51605a = textLocalisedClause;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof a) && Intrinsics.f(this.f51605a, ((a) obj2).f51605a);
                }

                public final int hashCode() {
                    Clause clause = this.f51605a;
                    if (clause == null) {
                        return 0;
                    }
                    return clause.hashCode();
                }

                public a() {
                    this(null);
                }
            }
        }

        public Model(String str, Clause clause, int i, Clause clause2, int i2, o oVar, b bVar, a aVar, q qVar, boolean z, AnimationRequest animationRequest, Object obj2, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i3, int i5, int i6, int i21) {
            this.f51590a = str;
            this.f51591b = clause;
            this.f51592c = i;
            this.d = clause2;
            this.e = i2;
            this.f = oVar;
            this.f51593g = bVar;
            this.f51594h = aVar;
            this.i = qVar;
            this.f51595j = z;
            this.k = animationRequest;
            this.f51596l = obj2;
            this.f51597m = parcelable;
            this.f51598n = cVar;
            this.o = cVar2;
            this.f51599p = cVar3;
            this.f51600q = cVar4;
            this.f51601r = cVar5;
            this.f51602s = i3;
            this.f51603t = i5;
            this.u = i6;
            this.v = i21;
        }

        public static Model e(Model model, b bVar, AnimationRequest animationRequest, ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction, int i) {
            String listId = model.f51590a;
            Clause title = model.f51591b;
            int i2 = (i & 4) != 0 ? model.f51592c : 1;
            Clause clause = model.d;
            int i3 = (i & 16) != 0 ? model.e : 2;
            o oVar = model.f;
            b valueStyle = (i & 64) != 0 ? model.f51593g : bVar;
            a buttonsStyle = model.f51594h;
            q widgetTheme = model.i;
            boolean z = model.f51595j;
            AnimationRequest animationRequest2 = (i & 1024) != 0 ? model.k : animationRequest;
            Object obj2 = (i & 2048) != 0 ? model.f51596l : apmPaymentAuthorisationPendingAction;
            Parcelable parcelable = model.f51597m;
            qv0.c positionInBox = model.f51598n;
            p31.c cVar = model.o;
            Object obj3 = obj2;
            p31.c cVar2 = model.f51599p;
            p31.c cVar3 = model.f51600q;
            p31.c cVar4 = model.f51601r;
            int i5 = model.f51602s;
            int i6 = model.f51603t;
            int i21 = model.u;
            int i22 = model.v;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, title, i2, clause, i3, oVar, valueStyle, buttonsStyle, widgetTheme, z, animationRequest2, obj3, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, i5, i6, i21, i22);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ActionWidgetDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.f51596l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58155c() {
            return this.f51590a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51590a, model.f51590a) && Intrinsics.f(this.f51591b, model.f51591b) && this.f51592c == model.f51592c && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51593g, model.f51593g) && Intrinsics.f(this.f51594h, model.f51594h) && this.i == model.i && this.f51595j == model.f51595j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51596l, model.f51596l) && Intrinsics.f(this.f51597m, model.f51597m) && Intrinsics.f(this.f51598n, model.f51598n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51599p, model.f51599p) && Intrinsics.f(this.f51600q, model.f51600q) && Intrinsics.f(this.f51601r, model.f51601r) && this.f51602s == model.f51602s && this.f51603t == model.f51603t && this.u == model.u && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53802m() {
            return this.f51602s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51602s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f51597m;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f51592c, p.a.a(this.f51590a.hashCode() * 31, 31, this.f51591b), 31);
            Clause clause = this.d;
            int iB2 = j6.a.b(this.e, (iB + (clause == null ? 0 : clause.hashCode())) * 31, 31);
            o oVar = this.f;
            int iC = j6.a.c((this.i.hashCode() + ((this.f51594h.hashCode() + ((this.f51593g.hashCode() + ((iB2 + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f51595j);
            AnimationRequest animationRequest = this.k;
            int iHashCode = (iC + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Object obj2 = this.f51596l;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51597m;
            int i = h30.l.i(this.f51598n, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.o;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51599p;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51600q;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51601r;
            return Integer.hashCode(this.v) + j6.a.b(this.u, j6.a.b(this.f51603t, j6.a.b(this.f51602s, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53415c() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51598n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getD() {
            return this.f51599p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51600q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53803n() {
            return this.f51603t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53804p() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51603t = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53414b() {
            return this.f51598n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF() {
            return this.f51601r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getE() {
            return this.f51600q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51597m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51599p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51601r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Model model;
            boolean z;
            boolean z3;
            Model model2;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            boolean z29;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model3 = (Model) oldItem;
            boolean z31 = !Intrinsics.f(model3.f51591b, this.f51591b);
            if (model3.f51592c != this.f51592c) {
                model = model3;
                z = z31;
                z3 = true;
            } else {
                model = model3;
                z = z31;
                z3 = false;
            }
            boolean z41 = !Intrinsics.f(model.d, this.d);
            if (model.e != this.e) {
                model2 = model;
                z4 = true;
            } else {
                model2 = model;
                z4 = false;
            }
            boolean z49 = !Intrinsics.f(model2.f, this.f);
            boolean z54 = !Intrinsics.f(model2.f51593g, this.f51593g);
            boolean z74 = !Intrinsics.f(model2.f51594h, this.f51594h);
            if (model2.i != this.i) {
                z6 = true;
                z11 = z41;
                z12 = z49;
                z29 = true;
            } else {
                z6 = true;
                z11 = z41;
                z12 = z49;
                z29 = false;
            }
            return new ip0.p(z, z3, z11, z4, z12, z54, z74, z29, model2.f51595j != this.f51595j ? z6 : false, or0.b.l(this, (qv0.i) oldItem));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, o oVar, b valueStyle, a buttonsStyle, q widgetTheme, Object obj2, Parcelable parcelable, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            int i3 = R$attr.uikit_dp0;
            this(listId, title, i, clause, i2, oVar, valueStyle, buttonsStyle, widgetTheme, z, null, obj2, parcelable, c.d.f249513a, null, null, null, null, i3, i3, i3, i3);
        }

        public /* synthetic */ Model(String str, Clause clause, Clause clause2, o oVar, b bVar, a aVar, q qVar, Object obj2, AnalyticsContext analyticsContext, boolean z, int i) {
            this(str, clause, clause2, oVar, (i & 16) != 0 ? b.C0394b.f51606a : bVar, aVar, (i & 64) != 0 ? q.REGULAR : qVar, (i & 128) != 0 ? null : obj2, (i & 256) != 0 ? null : analyticsContext, (i & 512) != 0 ? Integer.MAX_VALUE : 1, (i & 1024) == 0 ? 2 : Integer.MAX_VALUE, (i & 2048) != 0 ? false : z);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, Image image, b bVar, a buttonsStyle, q qVar, Object obj2, AnalyticsContext analyticsContext, int i) {
            b valueStyle = (i & 16) != 0 ? b.C0394b.f51606a : bVar;
            q widgetTheme = (i & 64) != 0 ? q.REGULAR : qVar;
            boolean z = (i & 128) == 0;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 512) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
            Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
            Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
            this(listId, title, clause, image != null ? new m(image, (LayeredImage) null, (ProgressStyle) null, 6) : null, valueStyle, buttonsStyle, widgetTheme, obj3, analyticsContext2, Integer.MAX_VALUE, Integer.MAX_VALUE, z);
        }
    }
}
