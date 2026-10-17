package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.VerticalProgressStepView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.a50;
import ip0.c50;
import ip0.d50;
import ip0.e30;
import ip0.e50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.j50;
import ip0.l40;
import ip0.l50;
import ip0.y40;
import ip0.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0003\u0007\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;", "Lcom/revolut/core/ui_kit/delegates/gc;", "<init>", "()V", "Companion", "ip0/a50", "Model", "ip0/z40", "ip0/i50", "ip0/j50", "ip0/c50", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressStepVerticalV2Delegate extends BaseGroupRecyclerViewDelegate<Model, gc> {

    @NotNull
    private static final a Companion = new a();
    public static final Color.Solid i = new Color.Solid(R$attr.uikit_colorAccent);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Color.Solid f53001j = new Color.Solid(R$attr.uikit_colorStatusDanger);
    public static final Color.Solid k = new Color.Solid(R$attr.uikit_colorGreen);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Color.Solid f53002l = new Color.Solid(R$attr.uikit_colorStatusWarning);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Color.Solid f53003m = new Color.Solid(R$attr.uikit_colorStatusDanger_10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Color.Solid f53004n = new Color.Solid(R$attr.uikit_colorStatusWarning_10);
    public static final Color.Solid o = new Color.Solid(R$attr.uikit_colorAccent_10);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Color.Solid f53005p = new Color.Solid(R$attr.uikit_colorGreyTone20);
    public final ihm.f d;
    public final ihm.f e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f53006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f53007h;

    public static final class a {
        private a() {
        }
    }

    public ProgressStepVerticalV2Delegate() {
        super(R$id.internal_progress_step_vertical_v2_delegate_type, new l40(3));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new e01.a();
        this.f53006g = new e01.a();
        this.f53007h = new e01.a();
    }

    public static ms0.w5 r(j50 j50Var) {
        switch (l50.f165131b[j50Var.ordinal()]) {
            case 1:
            case 2:
                return new ms0.u5();
            case 3:
                return new ms0.v5(f53002l);
            case 4:
                return new ms0.v5(k);
            case 5:
                return new ms0.v5(f53001j);
            case 6:
                return new ms0.v5(f53005p);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VerticalProgressStepView verticalProgressStepView = new VerticalProgressStepView(context, null, 0, 14, 0);
        verticalProgressStepView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new gc(verticalProgressStepView);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i2, List list) {
        int i3;
        ms0.w5 v5Var;
        boolean z;
        ms0.w5 w5Var;
        ms0.w5 v5Var2;
        ms0.w5 w5Var2;
        int i5;
        ms0.t5 q5Var;
        ms0.w5 u5Var;
        ms0.w5 v5Var3;
        ms0.w5 u5Var2;
        int i6;
        Model model;
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate;
        ms0.l5 l5Var;
        List payloads = list;
        gc holder = (gc) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        int size = payloads.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size) {
                break;
            }
            if (!(payloads.get(i21) instanceof a50)) {
                payloads = null;
                break;
            }
            i21++;
        }
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
        if (payloads != null) {
            int size2 = payloads.size();
            boolean z3 = zN10;
            boolean z4 = zN9;
            boolean z6 = zN8;
            boolean z11 = zN7;
            boolean z12 = zN6;
            boolean z29 = zN5;
            boolean z31 = zN4;
            boolean z41 = zN3;
            boolean z49 = zN2;
            boolean z54 = zN;
            for (int i22 = 0; i22 < size2; i22++) {
                a50 a50Var = (a50) payloads.get(i22);
                z54 = z54 || a50Var.f163390a;
                z49 = z49 || a50Var.f163391b;
                z41 = z41 || a50Var.f163392c;
                z31 = z31 || a50Var.d;
                z29 = z29 || a50Var.e;
                z12 = z12 || a50Var.f;
                z11 = z11 || a50Var.f163393g;
                z6 = z6 || a50Var.f163394h;
                z4 = z4 || a50Var.i;
                z3 = z3 || a50Var.f163395j;
            }
            zN = z54;
            zN2 = z49;
            zN3 = z41;
            zN4 = z31;
            zN5 = z29;
            zN6 = z12;
            zN7 = z11;
            zN8 = z6;
            zN9 = z4;
            zN10 = z3;
        }
        if (zN8) {
            holder.f.setAnalyticsContext(data.o);
        }
        if (zN) {
            holder.f.setTitle(data.f53009b);
        }
        if (zN2) {
            holder.f.setSubtitle(data.f53010c, new hc(1, 0, ihm.f.class, this.e, "onNext", "onNext(Ljava/lang/Object;)V"));
        }
        if (zN7) {
            holder.f.setSubtitleMaxLines(data.f53011g);
        }
        if (zN6) {
            VerticalProgressStepView verticalProgressStepView = holder.f;
            z40 z40Var = data.f;
            if (z40Var == null) {
                l5Var = null;
            } else {
                if (!(z40Var instanceof z40)) {
                    throw new NoWhenBranchMatchedException();
                }
                l5Var = new ms0.l5(z40Var.f167397a);
            }
            verticalProgressStepView.setEndComponent(l5Var);
        }
        if (zN3 || zN10) {
            i50 i50Var = data.d;
            boolean z74 = data.f53012h;
            boolean z83 = i50Var instanceof g50;
            if (z83) {
                i3 = R$attr.uikit_colorGreyTone50;
            } else {
                if (i50Var instanceof e50) {
                    throw null;
                }
                i3 = ((i50Var instanceof f50) && ((f50) i50Var).f164193a == j50.WARNING) ? R$attr.uikit_colorStatusWarning : R$attr.uikit_colorForeground;
            }
            VerticalProgressStepView verticalProgressStepView2 = holder.f;
            verticalProgressStepView2.setTitleColor(new Color.Solid(i3));
            verticalProgressStepView2.setSubtitleColor(new Color.Solid(R$attr.uikit_colorGreyTone50));
            boolean z89 = i50Var instanceof d50;
            Clause clause = z89 ? ((d50) i50Var).f163842a : null;
            d50 d50Var = z89 ? (d50) i50Var : null;
            verticalProgressStepView2.setTwinButtonsTexts(clause, d50Var != null ? d50Var.f163843b : null);
            boolean z96 = i50Var instanceof h50;
            Color.Solid solid = f53005p;
            if (z96) {
                v5Var = r(((h50) i50Var).f164508a);
            } else if (i50Var instanceof f50) {
                v5Var = r(((f50) i50Var).f164193a);
            } else if (z89) {
                v5Var = r(((d50) i50Var).f163844c);
            } else {
                if (!z83) {
                    if (!(i50Var instanceof e50)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw null;
                }
                v5Var = new ms0.v5(solid);
            }
            ms0.w5 w5Var3 = v5Var;
            Color.Solid solid2 = f53002l;
            Color.Solid solid3 = k;
            Color.Solid solid4 = f53001j;
            if (!z74) {
                z = z74;
                w5Var = null;
            } else if (z96) {
                switch (l50.f165131b[((h50) i50Var).f164508a.ordinal()]) {
                    case 1:
                    case 2:
                        u5Var2 = new ms0.u5();
                        break;
                    case 3:
                        u5Var2 = new ms0.v5(solid2);
                        break;
                    case 4:
                        u5Var2 = new ms0.v5(solid3);
                        break;
                    case 5:
                        u5Var2 = new ms0.v5(solid4);
                        break;
                    case 6:
                        u5Var2 = new ms0.v5(solid);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                w5Var = u5Var2;
                z = z74;
            } else {
                if (z89) {
                    z = z74;
                    v5Var3 = l50.f165131b[((d50) i50Var).f163844c.ordinal()] == 6 ? new ms0.v5(solid) : new ms0.u5();
                } else {
                    z = z74;
                    if (i50Var instanceof f50) {
                        v5Var3 = l50.f165131b[((f50) i50Var).f164193a.ordinal()] == 6 ? new ms0.v5(solid) : new ms0.u5();
                    } else {
                        if (!z83) {
                            if (!(i50Var instanceof e50)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw null;
                        }
                        v5Var3 = new ms0.v5(solid);
                    }
                }
                w5Var = v5Var3;
            }
            if (z || i50Var.getPosition() != c50.LAST) {
                if (z96) {
                    switch (l50.f165131b[((h50) i50Var).f164508a.ordinal()]) {
                        case 1:
                        case 2:
                            v5Var2 = new ms0.u5();
                            break;
                        case 3:
                            v5Var2 = new ms0.v5(solid2);
                            break;
                        case 4:
                            v5Var2 = new ms0.v5(solid3);
                            break;
                        case 5:
                            v5Var2 = new ms0.v5(solid4);
                            break;
                        case 6:
                            v5Var2 = new ms0.v5(solid);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!z89 && !(i50Var instanceof f50) && !z83) {
                        if (!(i50Var instanceof e50)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw null;
                    }
                    v5Var2 = new ms0.v5(solid);
                }
                w5Var2 = v5Var2;
            } else {
                w5Var2 = null;
            }
            int i32 = l50.f165130a[i50Var.getPosition().ordinal()];
            i5 = 1;
            ms0.n5 n5Var = (i32 == 1 && z) ? ms0.n5.TOP : (i32 == 2 && z) ? ms0.n5.TOP_BOTTOM : ms0.n5.BOTTOM;
            ms0.o5 o5Var = (z || i50Var.getPosition() == c50.FIRST) ? ms0.o5.NORMAL : ms0.o5.COMPACT;
            if (i50Var instanceof h50) {
                q5Var = new ms0.q5(w5Var3, w5Var, w5Var2, n5Var, z, o5Var);
            } else if (i50Var instanceof f50) {
                f50 f50Var = (f50) i50Var;
                j50 j50Var = f50Var.f164193a;
                if (j50Var == j50.PENDING) {
                    q5Var = new ms0.s5(w5Var3, w5Var, w5Var2, n5Var, z, o5Var);
                } else if (f50Var.f164194b == c50.LAST || j50Var == j50.FAILED) {
                    q5Var = new ms0.q5(w5Var3, w5Var, w5Var2, n5Var, z, o5Var);
                } else {
                    switch (l50.f165131b[j50Var.ordinal()]) {
                        case 1:
                        case 2:
                        case 4:
                        case 6:
                            u5Var = new ms0.u5(0.06f, o);
                            break;
                        case 3:
                            u5Var = new ms0.v5(f53004n);
                            break;
                        case 5:
                            u5Var = new ms0.v5(f53003m);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    q5Var = new ms0.r5(w5Var3, u5Var, w5Var, w5Var2, n5Var, z, o5Var, f50Var.f164195c);
                }
            } else if (i50Var instanceof d50) {
                q5Var = new ms0.p5(w5Var3, w5Var, w5Var2, n5Var, z, o5Var);
            } else {
                if (!(i50Var instanceof g50)) {
                    if (!(i50Var instanceof e50)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw null;
                }
                q5Var = new ms0.q5(w5Var3, w5Var, w5Var2, n5Var, z, o5Var);
            }
            verticalProgressStepView2.setState(q5Var);
        } else {
            i5 = 1;
        }
        if (zN9 || zN4 || zN5) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            int i33 = i5;
            boolean z100 = data.e;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Rect rectN = dr0.b.n(context, data.f53017p, data.u);
            if (data.d.getPosition() != c50.LAST) {
                rectN.bottom = 0;
            }
            Unit unit = Unit.f186387a;
            i6 = i33;
            model = data;
            progressStepVerticalV2Delegate = this;
            or0.b.d(progressStepVerticalV2Delegate, model, itemView, z100, rectN, 8);
        } else {
            progressStepVerticalV2Delegate = this;
            model = data;
            i6 = i5;
        }
        View itemView2 = holder.itemView;
        VerticalProgressStepView verticalProgressStepView3 = holder.f;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        boolean z101 = model.e;
        or0.m.a(itemView2);
        if (z101) {
            itemView2.setOnClickListener(new au0.r2(progressStepVerticalV2Delegate, model, 10));
        } else {
            or0.u.o(itemView2);
        }
        efm.r map = verticalProgressStepView3.i.primaryActionButton.f56386h.map(new e30(new y40(model, 0), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        progressStepVerticalV2Delegate.f.a(map, holder);
        efm.r map2 = verticalProgressStepView3.k.f56386h.map(new e30(new y40(model, i6), 6));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        progressStepVerticalV2Delegate.f53006g.a(map2, holder);
        efm.r map3 = verticalProgressStepView3.i.secondaryActionButton.f56386h.map(new e30(new y40(model, 2), 7));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        progressStepVerticalV2Delegate.f53007h.a(map3, holder);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53010c;
        public final i50 d;
        public final boolean e;
        public final z40 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f53011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53012h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53013j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53015m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f53016n;
        public Parcelable o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f53017p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53018q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53019r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53020s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53021t;
        public qv0.k u;

        public Model(String str, Clause clause, Clause clause2, i50 i50Var, boolean z, z40 z40Var, int i, boolean z3, boolean z4, int i2, int i3, int i5, int i6, Object obj2, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, qv0.k kVar) {
            this.f53008a = str;
            this.f53009b = clause;
            this.f53010c = clause2;
            this.d = i50Var;
            this.e = z;
            this.f = z40Var;
            this.f53011g = i;
            this.f53012h = z3;
            this.i = z4;
            this.f53013j = i2;
            this.k = i3;
            this.f53014l = i5;
            this.f53015m = i6;
            this.f53016n = obj2;
            this.o = parcelable;
            this.f53017p = cVar;
            this.f53018q = cVar2;
            this.f53019r = cVar3;
            this.f53020s = cVar4;
            this.f53021t = cVar5;
            this.u = kVar;
        }

        public static Model e(Model model, i50 i50Var, int i) {
            String listId = model.f53008a;
            Clause title = model.f53009b;
            Clause clause = model.f53010c;
            i50 state = (i & 8) != 0 ? model.d : i50Var;
            boolean z = model.e;
            z40 z40Var = model.f;
            int i2 = model.f53011g;
            boolean z3 = model.f53012h;
            boolean z4 = model.i;
            int i3 = model.f53013j;
            int i5 = model.k;
            int i6 = model.f53014l;
            int i21 = model.f53015m;
            Object obj2 = model.f53016n;
            Parcelable parcelable = model.o;
            qv0.c positionInBox = model.f53017p;
            p31.c cVar = model.f53018q;
            p31.c cVar2 = model.f53019r;
            p31.c cVar3 = model.f53020s;
            p31.c cVar4 = model.f53021t;
            qv0.k positionInGroup = model.u;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, title, clause, state, z, z40Var, i2, z3, z4, i3, i5, i6, i21, obj2, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, positionInGroup);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1, reason: from getter */
        public final boolean getF52162g() {
            return this.e;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.u = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ProgressStepVerticalV2Delegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52946g() {
            return this.f53016n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53544a() {
            return this.f53008a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53008a, model.f53008a) && Intrinsics.f(this.f53009b, model.f53009b) && Intrinsics.f(this.f53010c, model.f53010c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && this.f53011g == model.f53011g && this.f53012h == model.f53012h && this.i == model.i && this.f53013j == model.f53013j && this.k == model.k && this.f53014l == model.f53014l && this.f53015m == model.f53015m && Intrinsics.f(this.f53016n, model.f53016n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53017p, model.f53017p) && Intrinsics.f(this.f53018q, model.f53018q) && Intrinsics.f(this.f53019r, model.f53019r) && Intrinsics.f(this.f53020s, model.f53020s) && Intrinsics.f(this.f53021t, model.f53021t) && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f53013j;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getU() {
            return this.u;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53013j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.o;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53008a.hashCode() * 31, 31, this.f53009b);
            Clause clause = this.f53010c;
            int iC = j6.a.c((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.e);
            z40 z40Var = this.f;
            int iB = j6.a.b(this.f53015m, j6.a.b(this.f53014l, j6.a.b(this.k, j6.a.b(this.f53013j, j6.a.c(j6.a.c(j6.a.b(this.f53011g, (iC + (z40Var == null ? 0 : z40Var.hashCode())) * 31, 31), 31, this.f53012h), 31, this.i), 31), 31), 31), 31);
            Object obj2 = this.f53016n;
            int iHashCode = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.o;
            int i = h30.l.i(this.f53017p, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53018q;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53019r;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53020s;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53021t;
            return this.u.hashCode() + ((iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.f53018q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53017p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52952p() {
            return this.f53019r;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53020s = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52948j() {
            return this.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52949l() {
            return this.f53015m;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.k = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52951n() {
            return this.f53017p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52954r() {
            return this.f53021t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52953q() {
            return this.f53020s;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53018q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.f53014l;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53019r = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53021t = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Model model;
            boolean z11;
            boolean z12;
            boolean z29;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model2 = (Model) oldItem;
            i50 i50Var = model2.d;
            boolean z31 = true;
            boolean z41 = !Intrinsics.f(this.f53009b, model2.f53009b);
            boolean z49 = !Intrinsics.f(this.f53010c, model2.f53010c);
            i50 i50Var2 = this.d;
            boolean z54 = !Intrinsics.f(i50Var2, i50Var);
            if (i50Var2.getPosition() != i50Var.getPosition()) {
                z = true;
            } else {
                z = true;
                z31 = false;
            }
            if (this.e != model2.e) {
                z3 = z;
                z4 = z49;
                z6 = z3;
            } else {
                z3 = z;
                z4 = z49;
                z6 = false;
            }
            boolean zF = Intrinsics.f(this.f, model2.f) ^ z3;
            if (this.f53011g != model2.f53011g) {
                model = model2;
                z11 = z41;
                z12 = z54;
                z29 = z3;
            } else {
                model = model2;
                z11 = z41;
                z12 = z54;
                z29 = false;
            }
            return new a50(z11, z4, z12, z31, z6, zF, z29, Intrinsics.f(this.o, model.o) ^ z3, or0.b.m(this, (qv0.l) oldItem), this.f53012h != model.f53012h ? z3 : false, this.i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, i50 state, boolean z, z40 z40Var, int i, int i2, int i3, Object obj2, boolean z3, boolean z4, int i5) {
            boolean z6 = (i5 & 16) != 0 ? false : z;
            z40 z40Var2 = (i5 & 32) != 0 ? null : z40Var;
            int i6 = (i5 & 128) != 0 ? R$attr.uikit_dp4 : i;
            int i21 = (i5 & 256) != 0 ? R$attr.uikit_dp12 : i2;
            int i22 = R$attr.uikit_dp0;
            int i32 = (i5 & 1024) != 0 ? R$attr.uikit_dp12 : i3;
            Object obj3 = (i5 & 2048) != 0 ? null : obj2;
            boolean z11 = (i5 & 8192) != 0 ? false : z3;
            boolean z12 = (i5 & 16384) != 0 ? false : z4;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, title, clause, state, z6, z40Var2, Integer.MAX_VALUE, z11, z12, i6, i21, i22, i32, obj3, null, c.d.f249513a, null, null, null, null, qv0.k.OutOfGroup);
        }
    }
}
