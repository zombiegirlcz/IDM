package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import qv0.c;
import yp0.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/l2;", "<init>", "()V", "Model", "ip0/y6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsDelegate extends BaseGroupRecyclerViewDelegate<Model, l2> {
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public CellDetailsDelegate() {
        super(R$layout.internal_delegate_cell_details_text, new ip0.g4(17));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new l2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_text));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List list) {
        Object obj2;
        int i2;
        float f;
        LabelView labelView;
        py0.c cVar;
        CellDetailsDelegate cellDetailsDelegate;
        Model model;
        int i3;
        float f4;
        List payloads = list;
        l2 holder = (l2) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        WarningBadgeView warningBadgeView = holder.f54413l;
        WarningBadgeView target = holder.f54413l;
        Guideline guideline = holder.f54414m;
        LabelView labelView2 = holder.i;
        TextView textView = holder.k;
        LabelView target2 = holder.f54412j;
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof ip0.y6)) {
                payloads = null;
                break;
            }
            i5++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        int i6 = 0;
        while (i6 < size2) {
            ip0.y6 y6Var = (ip0.y6) payloads.get(i6);
            zIsEmpty = zIsEmpty || y6Var.f167251a;
            z = z || y6Var.f167252b;
            z3 = z3 || y6Var.f167253c;
            List list2 = payloads;
            z6 = z6 || y6Var.d;
            z11 = z11 || y6Var.f;
            z12 = z12 || y6Var.f167254g;
            z4 = z4 || y6Var.f167255h;
            z29 = z29 || y6Var.i;
            z41 = z41 || y6Var.f167256j;
            z31 = z31 || y6Var.k;
            i6++;
            payloads = list2;
        }
        if (zIsEmpty) {
            aw0.t0 t0Var = data.f51833b;
            obj2 = null;
            i2 = 0;
            LabelView.setText$default(labelView2, t0Var.f10536a, 0, 2, null);
            labelView2.setEndIcon(t0Var.f10537b);
            labelView2.setMaxLines(t0Var.f10538c);
            labelView2.setUnderlineVisible(t0Var.e);
        } else {
            obj2 = null;
            i2 = 0;
        }
        if (z) {
            LabelView.setText$default(target2, data.f51834c, i2, 2, obj2);
        }
        if (z3) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (z4) {
            LabelView.setStartIcon$default(holder.f54412j, data.k, null, null, false, 0, 0L, 62, null);
        }
        if (z6) {
            ViewGroup.LayoutParams layoutParams = target2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i21 = m2.f54456b[data.e.ordinal()];
            if (i21 == 1) {
                f4 = 1.0f;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = 0.5f;
            }
            layoutParams2.verticalBias = f4;
            f = 1.0f;
            if (data.e == g2.BOTTOM && data.d == null) {
                layoutParams2.bottomToTop = -1;
                layoutParams2.bottomToBottom = 0;
            } else {
                layoutParams2.bottomToTop = textView.getId();
                layoutParams2.bottomToBottom = -1;
            }
            target2.setLayoutParams(layoutParams2);
        } else {
            f = 1.0f;
        }
        if (z11) {
            warningBadgeView.setVisibility(data.f51835g ? 0 : 8);
        }
        if (z12) {
            int i22 = m2.f54455a[data.f51836h.ordinal()];
            if (i22 == 1) {
                i3 = R$attr.internal_textAppearanceHeading3;
            } else if (i22 == 2) {
                i3 = R$attr.internal_textAppearanceEmphasis2;
            } else {
                if (i22 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$attr.internal_textAppearanceBody2;
            }
            target2.setTextAppearance(i3);
            jb3.l.e(textView, i3);
        }
        if (z29 || z || z4 || z3) {
            float fB = (data.f51834c == null && data.k == null && data.d == null) ? BitmapDescriptorFactory.HUE_RED : data.i.b();
            Intrinsics.checkNotNullParameter(guideline, "<this>");
            if (guideline.getLayoutDirection() != 1) {
                fB = f - fB;
            }
            guideline.setGuidelinePercent(fB);
        }
        if (z41) {
            target2.setMaxLines(data.f51837j);
        }
        if (z31) {
            i2 i2Var = data.f51840n;
            ConstraintLayout constraintLayout = holder.f;
            ArrayList arrayList = i2Var != null ? i2Var.f54271a : null;
            if (arrayList == null || arrayList.isEmpty()) {
                model = data;
                labelView = labelView2;
                OverlappedIconsView overlappedIconsView = holder.f54410g;
                if (overlappedIconsView != null) {
                    if (overlappedIconsView.getVisibility() == 8) {
                        overlappedIconsView = null;
                    }
                    if (overlappedIconsView != null) {
                        overlappedIconsView.setVisibility(8);
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        hx7.q.n(constraintSet, target, guideline);
                        hx7.q.Y(constraintSet, target2, guideline, 0);
                        constraintSet.applyTo(constraintLayout);
                    }
                }
                cVar = null;
                holder.f54411h = null;
            } else {
                OverlappedIconsView source = holder.f54410g;
                if (source == null) {
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    labelView = labelView2;
                    source = new OverlappedIconsView(context, null, 6, 0);
                    source.setId(R$id.row_avatarsGroup);
                    constraintLayout.addView(source, new ConstraintLayout.LayoutParams(-2, -2));
                    holder.f54410g = source;
                } else {
                    labelView = labelView2;
                }
                if (source.getVisibility() != 8 && holder.f54411h == i2Var.f54272b) {
                    model = data;
                } else {
                    source.setVisibility(0);
                    ConstraintSet constraintSet2 = new ConstraintSet();
                    constraintSet2.clone(constraintLayout);
                    int i32 = k2.f54363a[i2Var.f54272b.ordinal()];
                    model = data;
                    if (i32 == 1) {
                        Intrinsics.checkNotNullParameter(constraintSet2, "<this>");
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(target, "target");
                        constraintSet2.connect(source.getId(), 3, target.getId(), 3, 0);
                        Intrinsics.checkNotNullParameter(constraintSet2, "<this>");
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(target, "target");
                        constraintSet2.connect(source.getId(), 4, target.getId(), 4, 0);
                        hx7.q.Y(constraintSet2, source, warningBadgeView, com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f));
                        hx7.q.n(constraintSet2, source, guideline);
                        hx7.q.V(constraintSet2, source, BitmapDescriptorFactory.HUE_RED);
                        hx7.q.n(constraintSet2, target, source);
                        hx7.q.Y(constraintSet2, target2, guideline, 0);
                    } else {
                        if (i32 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(constraintSet2, "<this>");
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(target2, "target");
                        constraintSet2.connect(source.getId(), 3, target2.getId(), 3, 0);
                        Intrinsics.checkNotNullParameter(constraintSet2, "<this>");
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(target2, "target");
                        constraintSet2.connect(source.getId(), 4, target2.getId(), 4, 0);
                        hx7.q.Y(constraintSet2, source, guideline, 0);
                        hx7.q.n(constraintSet2, source, target2);
                        hx7.q.V(constraintSet2, source, f);
                        constraintSet2.setHorizontalChainStyle(source.getId(), 2);
                        hx7.q.Y(constraintSet2, target2, source, 0);
                        hx7.q.n(constraintSet2, target, guideline);
                    }
                    constraintSet2.applyTo(constraintLayout);
                    holder.f54411h = i2Var.f54272b;
                }
                yp0.u.c(source, arrayList, s.a.f315753a, mx0.bb.SIZE16_OFFSET4, LDSFile.EF_DG12_TAG);
                cVar = null;
            }
            data = model;
        } else {
            labelView = labelView2;
            cVar = null;
        }
        boolean z49 = data.f51838l;
        aw0.t0 t0Var2 = data.f51833b;
        boolean z54 = data.f51839m;
        boolean z74 = z49 && !z54;
        pd.b.q(target2, z74);
        pd.b.h(target2, z74);
        target2.setAnalyticsContext(data.v);
        fp0.p clickHandler = target2.getClickHandler();
        fp0.p.b(clickHandler, z74);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        if (z74) {
            cellDetailsDelegate = this;
            view.setOnClickListener(new ip0.a7(cellDetailsDelegate, data, 0));
        } else {
            cellDetailsDelegate = this;
            or0.u.o(view);
        }
        boolean z83 = t0Var2.d;
        Clause clause = t0Var2.f10536a;
        boolean z89 = z83 && !z54;
        LabelView labelView3 = labelView;
        pd.b.q(labelView3, z89);
        pd.b.h(labelView3, z89);
        labelView3.setAnalyticsContext(data.v);
        fp0.p clickHandler2 = labelView3.getClickHandler();
        fp0.p.b(clickHandler2, z89);
        View view2 = clickHandler2.f137029a;
        or0.m.a(view2);
        if (z89) {
            view2.setOnClickListener(new ip0.a7(cellDetailsDelegate, data, 1));
        } else {
            or0.u.o(view2);
        }
        boolean z96 = !t0Var2.d && z54;
        fp0.p pVar = holder.f54415n;
        py0.c cVar2 = clause != null ? new py0.c(clause) : cVar;
        fp0.p.b(pVar, z96);
        View view3 = pVar.f137029a;
        or0.m.a(view3);
        if (z96) {
            view3.setOnClickListener(new au0.i3(data, cVar2, this, data, 12));
        } else {
            or0.u.o(view3);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        gq0.b bVarF = hx7.b.f(clause);
        Clause clause2 = data.f51834c;
        Object objF = clause2 != null ? hx7.b.f(clause2) : cVar;
        Clause clause3 = data.d;
        gq0.d[] elements = {bVarF, objF, clause3 != null ? hx7.b.f(clause3) : cVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\b\t\nJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/g2", "com/revolut/core/ui_kit/delegates/j2", "com/revolut/core/ui_kit/delegates/i2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.t0 f51833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51834c;
        public final Clause d;
        public final g2 e;
        public final aw0.j0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f51835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j2 f51836h;
        public final aw0.u0 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f51837j;
        public final Image k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f51838l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f51839m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final i2 f51840n;
        public final Object o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f51841p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public qv0.k f51842q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f51843r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f51844s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f51845t;
        public p31.c u;
        public Parcelable v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f51846w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f51847x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f51848y;
        public final int z;

        public Model(String listId, aw0.t0 title, Clause clause, Clause clause2, g2 endTextAlignment, aw0.j0 backgroundType, boolean z, j2 endTextAppearance, aw0.u0 endTextMaxWidth, int i, Image image, boolean z3, boolean z4, i2 i2Var, Object obj2, qv0.c positionInBox, qv0.k positionInGroup, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, Parcelable parcelable, int i2, int i3, int i5, int i6) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(endTextAlignment, "endTextAlignment");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f51832a = listId;
            this.f51833b = title;
            this.f51834c = clause;
            this.d = clause2;
            this.e = endTextAlignment;
            this.f = backgroundType;
            this.f51835g = z;
            this.f51836h = endTextAppearance;
            this.i = endTextMaxWidth;
            this.f51837j = i;
            this.k = image;
            this.f51838l = z3;
            this.f51839m = z4;
            this.f51840n = i2Var;
            this.o = obj2;
            this.f51841p = positionInBox;
            this.f51842q = positionInGroup;
            this.f51843r = cVar;
            this.f51844s = cVar2;
            this.f51845t = cVar3;
            this.u = cVar4;
            this.v = parcelable;
            this.f51846w = i2;
            this.f51847x = i3;
            this.f51848y = i5;
            this.z = i6;
        }

        public static Model e(Model model, String str, aw0.t0 t0Var, boolean z, int i) {
            String listId = (i & 1) != 0 ? model.f51832a : str;
            aw0.t0 title = (i & 2) != 0 ? model.f51833b : t0Var;
            Clause clause = model.f51834c;
            Clause clause2 = model.d;
            g2 endTextAlignment = model.e;
            aw0.j0 backgroundType = model.f;
            boolean z3 = model.f51835g;
            j2 endTextAppearance = model.f51836h;
            aw0.u0 endTextMaxWidth = model.i;
            int i2 = model.f51837j;
            Image image = model.k;
            boolean z4 = (i & 2048) != 0 ? model.f51838l : false;
            boolean z6 = (i & 4096) != 0 ? model.f51839m : z;
            i2 i2Var = model.f51840n;
            Object obj2 = model.o;
            qv0.c positionInBox = model.f51841p;
            qv0.k positionInGroup = model.f51842q;
            p31.c cVar = model.f51843r;
            p31.c cVar2 = model.f51844s;
            p31.c cVar3 = model.f51845t;
            p31.c cVar4 = model.u;
            Parcelable parcelable = model.v;
            int i3 = model.f51846w;
            int i5 = model.f51847x;
            int i6 = model.f51848y;
            int i21 = model.z;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(endTextAlignment, "endTextAlignment");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, title, clause, clause2, endTextAlignment, backgroundType, z3, endTextAppearance, endTextMaxWidth, i2, image, z4, z6, i2Var, obj2, positionInBox, positionInGroup, cVar, cVar2, cVar3, cVar4, parcelable, i3, i5, i6, i21);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return !this.f51833b.d && this.f51839m;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f51842q = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52872l() {
            return this.o;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52866a() {
            return this.f51832a;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f51833b.f10536a);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51832a, model.f51832a) && Intrinsics.f(this.f51833b, model.f51833b) && Intrinsics.f(this.f51834c, model.f51834c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f51835g == model.f51835g && this.f51836h == model.f51836h && this.i == model.i && this.f51837j == model.f51837j && Intrinsics.f(this.k, model.k) && this.f51838l == model.f51838l && this.f51839m == model.f51839m && Intrinsics.f(this.f51840n, model.f51840n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51841p, model.f51841p) && this.f51842q == model.f51842q && Intrinsics.f(this.f51843r, model.f51843r) && Intrinsics.f(this.f51844s, model.f51844s) && Intrinsics.f(this.f51845t, model.f51845t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && this.f51846w == model.f51846w && this.f51847x == model.f51847x && this.f51848y == model.f51848y && this.z == model.z;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52878s() {
            return this.f51846w;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF53311m() {
            return this.f51842q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51846w = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52873m() {
            return this.v;
        }

        public final int hashCode() {
            int iHashCode = (this.f51833b.hashCode() + (this.f51832a.hashCode() * 31)) * 31;
            Clause clause = this.f51834c;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iB = j6.a.b(this.f51837j, (this.i.hashCode() + ((this.f51836h.hashCode() + j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31)) * 31, 31, this.f51835g)) * 31)) * 31, 31);
            Image image = this.k;
            int iC = j6.a.c(j6.a.c((iB + (image == null ? 0 : image.hashCode())) * 31, 31, this.f51838l), 31, this.f51839m);
            i2 i2Var = this.f51840n;
            int iHashCode3 = (iC + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
            Object obj2 = this.o;
            int iHashCode4 = (this.f51842q.hashCode() + h30.l.i(this.f51841p, (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31)) * 31;
            p31.c cVar = this.f51843r;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51844s;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51845t;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.u;
            int iHashCode8 = (iHashCode7 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            Parcelable parcelable = this.v;
            return Integer.hashCode(this.z) + j6.a.b(this.f51848y, j6.a.b(this.f51847x, j6.a.b(this.f51846w, (iHashCode8 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.f51843r;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51841p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52875p() {
            return this.f51844s;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51845t = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52879t() {
            return this.f51847x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getV() {
            return this.z;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51847x = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52874n() {
            return this.f51841p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52877r() {
            return this.u;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52876q() {
            return this.f51845t;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51843r = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.v = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getU() {
            return this.f51848y;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51844s = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.u = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.y6(!Intrinsics.f(model.f51833b, this.f51833b), !Intrinsics.f(model.f51834c, this.f51834c), !Intrinsics.f(model.d, this.d), model.e != this.e, or0.b.m(this, (qv0.l) oldItem), model.f51835g != this.f51835g, model.f51836h != this.f51836h, !Intrinsics.f(model.k, this.k), model.i != this.i, model.f51837j != this.f51837j, !Intrinsics.f(model.f51840n, this.f51840n));
        }

        public /* synthetic */ Model(String str, aw0.t0 t0Var, Clause clause, Clause clause2, g2 g2Var, aw0.j0 j0Var, j2 j2Var, aw0.u0 u0Var, int i, Image image, boolean z, boolean z3, i2 i2Var, Object obj2, qv0.k kVar, Parcelable parcelable, int i2, int i3, int i5, int i6, int i21) {
            this(str, t0Var, clause, (i21 & 8) != 0 ? null : clause2, (i21 & 16) != 0 ? g2.CENTER : g2Var, (i21 & 32) != 0 ? aw0.j0.DEFAULT : j0Var, false, (i21 & 128) != 0 ? j2.CAPTION : j2Var, (i21 & 256) != 0 ? aw0.u0.MEDIUM : u0Var, (i21 & 512) != 0 ? 2 : i, (i21 & 1024) != 0 ? null : image, (i21 & 2048) != 0 ? true : z, (i21 & 4096) != 0 ? false : z3, (i21 & 8192) != 0 ? null : i2Var, (i21 & 16384) != 0 ? null : obj2, c.d.f249513a, (65536 & i21) != 0 ? qv0.k.OutOfGroup : kVar, null, null, null, null, (2097152 & i21) != 0 ? null : parcelable, (4194304 & i21) != 0 ? R$attr.uikit_dp12 : i2, (8388608 & i21) != 0 ? R$attr.uikit_dp12 : i3, (16777216 & i21) != 0 ? R$attr.uikit_dp16 : i5, (i21 & 33554432) != 0 ? R$attr.uikit_dp16 : i6);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, aw0.t0 title, Clause clause, Clause clause2, Object obj2, j2 j2Var, aw0.u0 u0Var, int i, Image image, boolean z, boolean z3, i2 i2Var, AnalyticsContext analyticsContext, int i2) {
            Clause clause3 = (i2 & 8) != 0 ? null : clause2;
            g2 endTextAlignment = g2.CENTER;
            Object obj3 = (i2 & 64) != 0 ? null : obj2;
            j2 endTextAppearance = (i2 & 128) != 0 ? j2.CAPTION : j2Var;
            aw0.u0 endTextMaxWidth = (i2 & 256) != 0 ? aw0.u0.MEDIUM : u0Var;
            int i3 = (i2 & 512) != 0 ? 2 : i;
            Image image2 = (i2 & 1024) != 0 ? null : image;
            boolean z4 = (i2 & 2048) != 0 ? true : z;
            boolean z6 = (i2 & 4096) != 0 ? false : z3;
            i2 i2Var2 = (i2 & 8192) != 0 ? null : i2Var;
            AnalyticsContext analyticsContext2 = (i2 & 16384) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(endTextAlignment, "endTextAlignment");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            this(listId, title, clause, clause3, endTextAlignment, null, endTextAppearance, endTextMaxWidth, i3, image2, z4, z6, i2Var2, obj3, null, analyticsContext2, 0, 0, 0, 0, 64946208);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, boolean z, Clause clause, Clause clause2, j2 j2Var, Image image, boolean z3, Object obj2, AnalyticsContext analyticsContext, int i, int i2) {
            boolean z4 = (i2 & 8) != 0 ? false : z;
            int i3 = (i2 & 16) != 0 ? 2 : Integer.MAX_VALUE;
            Clause clause3 = (i2 & 64) != 0 ? null : clause2;
            g2 endTextAlignment = g2.CENTER;
            aw0.j0 backgroundType = aw0.j0.DEFAULT;
            j2 endTextAppearance = (i2 & 1024) != 0 ? j2.CAPTION : j2Var;
            aw0.u0 endTextMaxWidth = aw0.u0.MEDIUM;
            Image image2 = (i2 & 8192) != 0 ? null : image;
            boolean z6 = (i2 & 16384) != 0 ? false : z3;
            Object obj3 = (32768 & i2) != 0 ? null : obj2;
            qv0.k positionInGroup = qv0.k.OutOfGroup;
            AnalyticsContext analyticsContext2 = (4194304 & i2) != 0 ? null : analyticsContext;
            int i5 = R$attr.uikit_dp12;
            int i6 = (i2 & 33554432) != 0 ? R$attr.uikit_dp16 : i;
            int i21 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(endTextAlignment, "endTextAlignment");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            int i22 = 2;
            boolean z11 = false;
            this(listId, new aw0.t0(cellTitle, (Image) null, i3, z4, 16), clause, clause3, endTextAlignment, backgroundType, endTextAppearance, endTextMaxWidth, i22, image2, z11, z6, null, obj3, positionInGroup, analyticsContext2, i5, i5, i6, i21, 10240);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, Clause clause, Clause clause2, ResourceImage resourceImage, boolean z, int i, g2 g2Var, Object obj2, j2 j2Var, aw0.u0 u0Var, int i2, Image image, boolean z3, AnalyticsContext analyticsContext, int i3, int i5, int i6, int i21, int i22) {
            Clause clause3 = (i22 & 8) != 0 ? null : clause2;
            boolean z4 = (i22 & 32) != 0 ? false : z;
            int i32 = (i22 & 64) != 0 ? 2 : i;
            g2 endTextAlignment = (i22 & 128) != 0 ? g2.CENTER : g2Var;
            Object obj3 = (i22 & 512) != 0 ? null : obj2;
            j2 endTextAppearance = (i22 & 1024) != 0 ? j2.CAPTION : j2Var;
            aw0.u0 endTextMaxWidth = (i22 & 2048) != 0 ? aw0.u0.MEDIUM : u0Var;
            int i33 = (i22 & 4096) != 0 ? 2 : i2;
            Image image2 = (i22 & 8192) != 0 ? null : image;
            boolean z6 = (i22 & 16384) != 0 ? false : z3;
            AnalyticsContext analyticsContext2 = (32768 & i22) != 0 ? null : analyticsContext;
            int i43 = (65536 & i22) != 0 ? R$attr.uikit_dp12 : i3;
            int i59 = (131072 & i22) != 0 ? R$attr.uikit_dp12 : i5;
            int i66 = (262144 & i22) != 0 ? R$attr.uikit_dp16 : i6;
            int i74 = (i22 & 524288) != 0 ? R$attr.uikit_dp16 : i21;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(endTextAlignment, "endTextAlignment");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            aw0.j0 j0Var = null;
            boolean z11 = false;
            i2 i2Var = null;
            this(listId, new aw0.t0(cellTitle, resourceImage, i32, z4, 16), clause, clause3, endTextAlignment, j0Var, endTextAppearance, endTextMaxWidth, i33, image2, z11, z6, i2Var, obj3, null, analyticsContext2, i43, i59, i66, i74, 2041888);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, Clause clause, int i, Object obj2, AnalyticsContext analyticsContext, j2 j2Var, aw0.u0 u0Var, Image image, boolean z, int i2, int i3, int i5) {
            int i6;
            int i21 = (i5 & 8) != 0 ? 0 : i;
            ResourceImage resourceImage = null;
            Object obj3 = (i5 & 16) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i5 & 32) != 0 ? null : analyticsContext;
            j2 endTextAppearance = (i5 & 64) != 0 ? j2.CAPTION : j2Var;
            aw0.u0 endTextMaxWidth = (i5 & 128) != 0 ? aw0.u0.MEDIUM : u0Var;
            int i22 = (i5 & 256) != 0 ? 2 : 3;
            Image image2 = (i5 & 512) != 0 ? null : image;
            boolean z3 = (i5 & 1024) != 0 ? false : z;
            int i32 = (i5 & 2048) != 0 ? R$attr.uikit_dp12 : i2;
            int i33 = (i5 & 4096) != 0 ? R$attr.uikit_dp12 : i3;
            int i43 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(endTextAppearance, "endTextAppearance");
            Intrinsics.checkNotNullParameter(endTextMaxWidth, "endTextMaxWidth");
            if (i21 == 0) {
                i6 = i21;
            } else {
                int i59 = i21;
                resourceImage = new ResourceImage(i59, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
                i6 = i59;
            }
            Clause clause2 = null;
            g2 g2Var = null;
            aw0.j0 j0Var = null;
            boolean z4 = false;
            i2 i2Var = null;
            this(listId, new aw0.t0(cellTitle, resourceImage, 0, i6 != 0, 20), clause, clause2, g2Var, j0Var, endTextAppearance, endTextMaxWidth, i22, image2, z4, z3, i2Var, obj3, null, analyticsContext2, i32, i33, i43, i43, 2041976);
        }
    }
}
