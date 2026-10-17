package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aw0.l1;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.ht;
import ip0.jt;
import ip0.kt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LineChartResizableTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LineChartResizableTileDelegate$Model;", "Lip0/jt;", "<init>", "()V", "Model", "ip0/ht", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineChartResizableTileDelegate extends BaseRecyclerViewDelegate<Model, jt> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52642c;

    public LineChartResizableTileDelegate() {
        super(R$layout.internal_delegate_line_chart_resizable_tile, new hq(17));
        this.f52642c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        jt jtVar = new jt(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_line_chart_resizable_tile));
        jtVar.f164906g.setFeatureConfig(new ts0.h0(null, null, 12));
        return jtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(jt holder, Model model, int i, List payloads) {
        Model data = model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, payloads);
        TextView textView = holder.f164907h;
        ResizableTileHeaderView resizableTileHeaderView = holder.f;
        LineChartView lineChartView = holder.f164906g;
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
        boolean zN11 = ue0.e.n(payloads);
        boolean zN12 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            Iterator it9 = it8;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it9.next();
            boolean z = zN;
            if (next instanceof ht) {
                zN = z || ((ht) next).f164594a;
                zN2 = zN2 || ((ht) next).f164595b;
                zN3 = zN3 || ((ht) next).f164596c;
                zN4 = zN4 || ((ht) next).d;
                zN5 = zN5 || ((ht) next).e;
                zN6 = zN6 || ((ht) next).f;
                zN7 = zN7 || ((ht) next).f164597g;
                zN8 = zN8 || ((ht) next).i;
                zN9 = zN9 || ((ht) next).f164598h;
                zN10 = zN10 || ((ht) next).f164599j;
                zN11 = zN11 || ((ht) next).k;
                zN12 = zN12 || ((ht) next).f164600l;
            } else {
                zN = z;
            }
            it8 = it9;
        }
        boolean z3 = zN;
        if (zN11) {
            lineChartView.setDataChangeAnimationRequest(data.f52657w);
        }
        if (zN2 || zN4) {
            aw0.ja jaVar = data.f52645c;
            w7 w7Var = data.f;
            resizableTileHeaderView.setTopLabel(jaVar.f10378a);
            ?? r2 = jaVar.f10379b;
            Clause clause = jaVar.f10380c;
            resizableTileHeaderView.setTitle(r2);
            resizableTileHeaderView.setRightSubtitle(w7Var == w7.MEDIUM ? clause : null);
            if (w7Var != w7.SMALL) {
                clause = null;
            }
            resizableTileHeaderView.setBottomSubtitle(clause);
        }
        if (z3) {
            lineChartView.setChartItems(data.f52644b);
        }
        if (zN3) {
            lineChartView.setColorScheme(data.d);
        }
        if (zN5 || zN4) {
            aw0.a7 a7Var = data.f52646g;
            if (data.f != w7.MEDIUM) {
                a7Var = null;
            }
            lineChartView.setXAxis(a7Var);
            lineChartView.setLineChartViewParams(new aw0.z6(R$attr.internal_textAppearanceBody3, 0, 11));
        }
        if (zN6 || zN4) {
            Clause clause2 = data.f52647h;
            if (data.f != w7.MEDIUM) {
                clause2 = null;
            }
            or0.u.c(textView, clause2);
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ty0.c.b(jh.d.f(context).b0(), clause2, holder.f164907h, null, null, 12);
        }
        if (zN8) {
            resizableTileHeaderView.setRightImage(data.f52648j);
        }
        if (zN9) {
            lineChartView.setBaseline(data.i);
        }
        if (zN10) {
            lineChartView.setInterpolationStrategy(aw0.m1.a(data.e, lineChartView));
        }
        if (zN7 || zN12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.v, null, 24);
            data = data;
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        py0.c cVar = data.f52658x;
        boolean z4 = data.v;
        or0.m.a(itemView2);
        if (z4) {
            itemView2.setOnClickListener(new kt(data, cVar, this, model, 0));
        } else {
            or0.u.o(itemView2);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\t\nJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LineChartResizableTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lgx0/c;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/w7", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, gx0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f52644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.ja f52645c;
        public final aw0.x6 d;
        public final aw0.l1 e;
        public final w7 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final aw0.a7 f52646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f52647h;
        public final aw0.u6 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Image f52648j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52649l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52650m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52651n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52654r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public qv0.c f52655s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Object f52656t;
        public Parcelable u;
        public final boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final uw0.i f52657w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final py0.c f52658x;

        /* JADX WARN: Type inference failed for: r2v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public Model(String str, List list, aw0.ja jaVar, aw0.x6 x6Var, aw0.l1 l1Var, w7 w7Var, aw0.a7 a7Var, Clause clause, aw0.u6 u6Var, Image image, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5, qv0.c cVar5, Object obj2, Parcelable parcelable, boolean z) {
            this.f52643a = str;
            this.f52644b = list;
            this.f52645c = jaVar;
            this.d = x6Var;
            this.e = l1Var;
            this.f = w7Var;
            this.f52646g = a7Var;
            this.f52647h = clause;
            this.i = u6Var;
            this.f52648j = image;
            this.k = cVar;
            this.f52649l = cVar2;
            this.f52650m = cVar3;
            this.f52651n = cVar4;
            this.o = i;
            this.f52652p = i2;
            this.f52653q = i3;
            this.f52654r = i5;
            this.f52655s = cVar5;
            this.f52656t = obj2;
            this.u = parcelable;
            this.v = z;
            this.f52657w = new uw0.i(str, uw0.g.UNTIL_ANY_FINISHED, true);
            this.f52658x = new py0.c(jaVar.f10378a);
        }

        public static Model e(Model model, aw0.ja jaVar, int i) {
            Clause clause;
            Object obj2;
            Parcelable parcelable;
            boolean z;
            String listId = model.f52643a;
            List chartItems = model.f52644b;
            aw0.ja chartHeader = (i & 4) != 0 ? model.f52645c : jaVar;
            aw0.x6 colorScheme = model.d;
            aw0.l1 interpolation = model.e;
            w7 size = model.f;
            aw0.a7 a7Var = model.f52646g;
            Clause clause2 = model.f52647h;
            aw0.u6 u6Var = model.i;
            Image image = model.f52648j;
            p31.c cVar = model.k;
            p31.c cVar2 = model.f52649l;
            p31.c cVar3 = model.f52650m;
            p31.c cVar4 = model.f52651n;
            int i2 = model.o;
            int i3 = model.f52652p;
            int i5 = model.f52653q;
            int i6 = model.f52654r;
            qv0.c positionInBox = model.f52655s;
            if ((i & 524288) != 0) {
                clause = clause2;
                obj2 = model.f52656t;
            } else {
                clause = clause2;
                obj2 = FreelancerWidgetClickData.SalesAnalytics.SalesThisMonth.f74459a;
            }
            Object obj3 = obj2;
            Parcelable parcelable2 = model.u;
            if ((i & PKIFailureInfo.badSenderNonce) != 0) {
                parcelable = parcelable2;
                z = model.v;
            } else {
                parcelable = parcelable2;
                z = false;
            }
            boolean z3 = z;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(chartItems, "chartItems");
            Intrinsics.checkNotNullParameter(chartHeader, "chartHeader");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            Intrinsics.checkNotNullParameter(interpolation, "interpolation");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, chartItems, chartHeader, colorScheme, interpolation, size, a7Var, clause, u6Var, image, cVar, cVar2, cVar3, cVar4, i2, i3, i5, i6, positionInBox, obj3, parcelable, z3);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LineChartResizableTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52656t() {
            return this.f52656t;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52643a() {
            return this.f52643a;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f52658x;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52643a, model.f52643a) && Intrinsics.f(this.f52644b, model.f52644b) && Intrinsics.f(this.f52645c, model.f52645c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52646g, model.f52646g) && Intrinsics.f(this.f52647h, model.f52647h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52648j, model.f52648j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52649l, model.f52649l) && Intrinsics.f(this.f52650m, model.f52650m) && Intrinsics.f(this.f52651n, model.f52651n) && this.o == model.o && this.f52652p == model.f52652p && this.f52653q == model.f52653q && this.f52654r == model.f52654r && Intrinsics.f(this.f52655s, model.f52655s) && Intrinsics.f(this.f52656t, model.f52656t) && Intrinsics.f(this.u, model.u) && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.u;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + p.a.d((this.f52645c.hashCode() + p.a.d(this.f52643a.hashCode() * 31, 31, this.f52644b)) * 31, 31, this.d.f10606a)) * 31)) * 31;
            aw0.a7 a7Var = this.f52646g;
            int iHashCode2 = (iHashCode + (a7Var == null ? 0 : a7Var.f10233a.hashCode())) * 31;
            Clause clause = this.f52647h;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            aw0.u6 u6Var = this.i;
            int iHashCode4 = (iHashCode3 + (u6Var == null ? 0 : u6Var.hashCode())) * 31;
            Image image = this.f52648j;
            int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
            p31.c cVar = this.k;
            int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52649l;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52650m;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52651n;
            int i = h30.l.i(this.f52655s, j6.a.b(this.f52654r, j6.a.b(this.f52653q, j6.a.b(this.f52652p, j6.a.b(this.o, (iHashCode8 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31), 31);
            Object obj2 = this.f52656t;
            int iHashCode9 = (i + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.u;
            return Boolean.hashCode(this.v) + ((iHashCode9 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52655s = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52649l() {
            return this.f52649l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52650m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52652p() {
            return this.f52652p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52654r() {
            return this.f52654r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52652p = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p */
        public final op0.q getF() {
            int i = x7.f55596a[this.f.ordinal()];
            if (i == 1) {
                return op0.q.SMALL;
            }
            if (i == 2) {
                return op0.q.MEDIUM;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52655s() {
            return this.f52655s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52651n() {
            return this.f52651n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52650m() {
            return this.f52650m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.u = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52653q() {
            return this.f52653q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52649l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52651n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z = !Intrinsics.f(this.f52644b, model.f52644b);
            boolean z3 = !Intrinsics.f(this.f52645c, model.f52645c);
            boolean z4 = !Intrinsics.f(this.d, model.d);
            boolean z6 = this.f != model.f;
            Model model2 = (Model) oldItem;
            boolean z11 = !Intrinsics.f(this.f52646g, model2.f52646g);
            boolean z12 = !Intrinsics.f(this.f52647h, model2.f52647h);
            boolean zL = or0.b.l(this, (qv0.i) oldItem);
            boolean z29 = !Intrinsics.f(this.i, model2.i);
            boolean z31 = !Intrinsics.f(this.f52648j, model2.f52648j);
            boolean z41 = !Intrinsics.f(this.e, model2.e);
            boolean z49 = true;
            boolean z54 = !Intrinsics.f(this.f52657w, model2.f52657w);
            if (this.v == model2.v) {
                z49 = false;
            }
            return new ht(z, z3, z4, z6, z11, z12, zL, z29, z31, z41, z54, z49);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, List chartItems, aw0.ja chartHeader, aw0.x6 colorScheme, l1.c cVar, w7 size, aw0.a7 a7Var, Clause clause, Image image, aw0.u6 u6Var, Object obj2, int i) {
            aw0.l1 interpolation = (i & 16) != 0 ? l1.d.f10401a : cVar;
            aw0.a7 a7Var2 = (i & 64) != 0 ? null : a7Var;
            Clause clause2 = (i & 128) != 0 ? null : clause;
            Image image2 = (i & 256) != 0 ? null : image;
            aw0.u6 u6Var2 = (i & 512) != 0 ? null : u6Var;
            Object obj3 = (i & 1024) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(chartItems, "chartItems");
            Intrinsics.checkNotNullParameter(chartHeader, "chartHeader");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            Intrinsics.checkNotNullParameter(interpolation, "interpolation");
            Intrinsics.checkNotNullParameter(size, "size");
            int i2 = R$attr.uikit_dp16;
            this(listId, chartItems, chartHeader, colorScheme, interpolation, size, a7Var2, clause2, u6Var2, image2, null, null, null, null, i2, i2, i2, i2, c.d.f249513a, obj3, null, true);
        }
    }
}
