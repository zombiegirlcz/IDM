package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsNoteDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsNoteDelegate$Model;", "Lip0/u7;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsNoteDelegate extends BaseGroupRecyclerViewDelegate<Model, ip0.u7> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f51869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f51870h;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ArrayList a(Model model, List notes) {
            Intrinsics.checkNotNullParameter(model, "<this>");
            Intrinsics.checkNotNullParameter(notes, "notes");
            List list = notes;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                qv0.i iVar = (qv0.i) obj2;
                if (i == 0) {
                    iVar.g(R$attr.uikit_dp0);
                }
                if (i == zhm.v.j(notes)) {
                    iVar.o(R$attr.uikit_dp16);
                }
                arrayList.add(iVar);
                i = i2;
            }
            return ue0.e.J(model, arrayList);
        }
    }

    public CellDetailsNoteDelegate() {
        super(R$layout.internal_delegate_cell_details_note, new ip0.g4(25));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f51869g = v0.a.d("create(...)");
        this.f51870h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.u7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_note));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View, com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate, com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, java.lang.Object] */
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
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        Model model;
        ?? r110;
        s2 s2Var;
        ?? r162;
        ?? r172;
        Model model2;
        gq0.b bVar2;
        int i2;
        ip0.u7 holder = (ip0.u7) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        TextView textView = holder.f;
        TextView textView2 = holder.i;
        ArrayList<t2> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof t2) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        for (t2 t2Var : arrayList) {
            zIsEmpty = zIsEmpty || t2Var.f54730a;
            z3 = z3 || t2Var.f54731b;
            z12 = z12 || t2Var.f54732c;
            z4 = z4 || t2Var.d;
            z29 = z29 || t2Var.e;
            z = z || t2Var.f;
            z11 = z11 || t2Var.f54733g;
            z6 = z6 || t2Var.f54734h;
            z31 = z31 || t2Var.f54735j;
            z41 = z41 || t2Var.k;
            z49 = z49 || t2Var.i;
        }
        if (zIsEmpty) {
            or0.b.e(this, data.f51872b, holder.f, null, 12);
        }
        if (!z) {
            model = data;
            r110 = 0;
        } else if (data.f51874g) {
            model = data;
            r110 = 0;
            or0.u.u(textView, model, new j01.c(new View[]{textView, textView}, model, this.f51869g, null, 24));
        } else {
            model = data;
            r110 = 0;
            textView.setOnClickListener(null);
        }
        ImageView imageView = holder.f166610g;
        ImageView imageView2 = holder.f166612j;
        LabelView labelView = holder.f166611h;
        yy0.l lVar2 = model.f51873c;
        Image image = model.e;
        Clause clause = model.d;
        Clause clause2 = model.i;
        s2 s2Var2 = model.f51876j;
        zi0.c.h(imageView, lVar2, z3, new a2.a(holder, 17, model, (Object) this), r110);
        if (z4) {
            zi0.c.g(imageView2, image);
        }
        if (z6) {
            LabelView.setText$default(labelView, clause2, r110, 2, null);
        }
        if (z11) {
            LabelView.setStartIcon$default(holder.f166611h, model.f51875h, null, null, false, 0, 0L, 62, null);
        }
        ?? r142 = 8;
        if (!z12 && !z29) {
            s2Var = s2Var2;
            r162 = 2;
            r172 = r110;
            model2 = model;
            bVar2 = null;
        } else if (model.f) {
            py0.b bVar3 = image != null ? new py0.b(image) : null;
            or0.m.a(imageView2);
            py0.b bVar4 = bVar3;
            Model model3 = model;
            r172 = r110;
            model2 = model;
            bVar2 = null;
            r162 = 2;
            s2Var = s2Var2;
            imageView2.setOnClickListener(new au0.i3(model2, bVar4, this, model3, 13));
            or0.m.a(textView2);
            textView2.setOnClickListener(new au0.t1(model2, r142, this, model2));
            kli.a.b(textView2, clause, ty0.f.f275450a);
        } else {
            s2Var = s2Var2;
            r162 = 2;
            r172 = r110;
            model2 = model;
            bVar2 = null;
            imageView2.setOnClickListener(null);
            textView2.setOnClickListener(null);
            kli.a.d(textView2, clause, model2, new ijg.c(holder, this, 26), 8);
        }
        if (z31) {
            holder.k.setVisibility((clause == null && image == null) ? 8 : r172);
        }
        if (z41) {
            holder.f166613l.setVisibility(model2.k ? r172 : 8);
        }
        if (z49) {
            if (s2Var instanceof q2) {
                i2 = R$attr.uikit_colorAccent_40;
            } else if (s2Var instanceof p2) {
                i2 = R$attr.uikit_colorAccent;
            } else {
                if (!(s2Var instanceof r2)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.uikit_colorForeground;
            }
            Context context = labelView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            labelView.setTextColor(kli.a.u(i2, context));
        }
        if (s2Var instanceof q2) {
            or0.u.o(labelView);
        } else {
            boolean z54 = s2Var instanceof p2;
            if (!z54 && !Intrinsics.f(s2Var, r2.f54655a)) {
                throw new NoWhenBranchMatchedException();
            }
            or0.m.a(labelView);
            if (z54) {
                labelView.setOnClickListener(new au0.t1(holder, 7, this, model2));
            } else {
                or0.u.o(labelView);
            }
        }
        labelView.setAnalyticsContext(model2.f51878m);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        gq0.b bVarF = hx7.b.f(model2.f51872b);
        gq0.b bVarF2 = clause != null ? hx7.b.f(clause) : bVar2;
        gq0.b bVarF3 = clause2 != null ? hx7.b.f(clause2) : bVar2;
        gq0.d[] elements = new gq0.d[3];
        elements[r172] = bVarF;
        elements[1] = bVarF2;
        elements[r162] = bVarF3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsNoteDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/t2", "com/revolut/core/ui_kit/delegates/s2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yy0.l f51873c;
        public final Clause d;
        public final Image e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f51874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f51875h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final s2 f51876j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f51877l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f51878m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f51879n;
        public qv0.k o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51880p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51881q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f51882r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f51883s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f51884t;
        public int u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f51885w;

        public Model(String listId, Clause cellTitle, yy0.l lVar, Clause clause, Image image, boolean z, boolean z3, Image image2, Clause clause2, s2 actionState, boolean z4, Object obj2, Parcelable parcelable, qv0.c positionInBox, qv0.k positionInGroup, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(actionState, "actionState");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f51871a = listId;
            this.f51872b = cellTitle;
            this.f51873c = lVar;
            this.d = clause;
            this.e = image;
            this.f = z;
            this.f51874g = z3;
            this.f51875h = image2;
            this.i = clause2;
            this.f51876j = actionState;
            this.k = z4;
            this.f51877l = obj2;
            this.f51878m = parcelable;
            this.f51879n = positionInBox;
            this.o = positionInGroup;
            this.f51880p = cVar;
            this.f51881q = cVar2;
            this.f51882r = cVar3;
            this.f51883s = cVar4;
            this.f51884t = i;
            this.u = i2;
            this.v = i3;
            this.f51885w = i5;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.o = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsNoteDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51799g() {
            return this.f51877l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51796a() {
            return this.f51871a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51871a, model.f51871a) && Intrinsics.f(this.f51872b, model.f51872b) && Intrinsics.f(this.f51873c, model.f51873c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f51874g == model.f51874g && Intrinsics.f(this.f51875h, model.f51875h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51876j, model.f51876j) && this.k == model.k && Intrinsics.f(this.f51877l, model.f51877l) && Intrinsics.f(this.f51878m, model.f51878m) && Intrinsics.f(this.f51879n, model.f51879n) && this.o == model.o && Intrinsics.f(this.f51880p, model.f51880p) && Intrinsics.f(this.f51881q, model.f51881q) && Intrinsics.f(this.f51882r, model.f51882r) && Intrinsics.f(this.f51883s, model.f51883s) && this.f51884t == model.f51884t && this.u == model.u && this.v == model.v && this.f51885w == model.f51885w;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51804n() {
            return this.f51884t;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF51842q() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51884t = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51800h() {
            return this.f51878m;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f51871a.hashCode() * 31, 31, this.f51872b);
            yy0.l lVar = this.f51873c;
            int iHashCode = (iA + (lVar == null ? 0 : lVar.hashCode())) * 31;
            Clause clause = this.d;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.e;
            int iC = j6.a.c(j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f), 31, this.f51874g);
            Image image2 = this.f51875h;
            int iHashCode3 = (iC + (image2 == null ? 0 : image2.hashCode())) * 31;
            Clause clause2 = this.i;
            int iC2 = j6.a.c((this.f51876j.hashCode() + ((iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31, this.k);
            Object obj2 = this.f51877l;
            int iHashCode4 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51878m;
            int iHashCode5 = (this.o.hashCode() + h30.l.i(this.f51879n, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31)) * 31;
            p31.c cVar = this.f51880p;
            int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51881q;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51882r;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51883s;
            return Integer.hashCode(this.f51885w) + j6.a.b(this.v, j6.a.b(this.u, j6.a.b(this.f51884t, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51801j() {
            return this.f51880p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51879n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f51881q;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51882r = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51806q() {
            return this.f51885w;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.u = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.f51879n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51803m() {
            return this.f51883s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51802l() {
            return this.f51882r;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51880p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51878m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51805p() {
            return this.v;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51881q = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51883s = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Image image;
            boolean z11;
            boolean z12;
            boolean z29;
            boolean z31;
            boolean z41;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            Image image2 = model.e;
            Clause clause = model.d;
            boolean z49 = !Intrinsics.f(model.f51872b, this.f51872b);
            boolean z54 = !Intrinsics.f(model.f51873c, this.f51873c);
            Clause clause2 = this.d;
            boolean z74 = !Intrinsics.f(clause, clause2);
            Image image3 = this.e;
            boolean z83 = !Intrinsics.f(image2, image3);
            if (model.f != this.f) {
                z = true;
                z3 = z54;
                z4 = z74;
                z6 = true;
            } else {
                z = true;
                z3 = z54;
                z4 = z74;
                z6 = false;
            }
            if (model.f51874g != this.f51874g) {
                image = image3;
                z11 = z;
            } else {
                image = image3;
                z11 = false;
            }
            boolean z89 = z;
            boolean z96 = !Intrinsics.f(model.f51875h, this.f51875h);
            boolean z100 = !Intrinsics.f(model.i, this.i);
            boolean z101 = !Intrinsics.f(model.f51876j, this.f51876j);
            if (((clause == null && image2 == null) ? false : z89) != ((clause2 == null && image == null) ? false : z89)) {
                z12 = z83;
                z29 = z96;
                z31 = z100;
                z41 = z89;
            } else {
                z12 = z83;
                z29 = z96;
                z31 = z100;
                z41 = false;
            }
            return new t2(z49, z3, z4, z12, z6, z11, z29, z31, z101, z41, model.k != this.k ? z89 : false, or0.b.m(this, model));
        }

        public /* synthetic */ Model(String str, Clause clause, yy0.l lVar, Clause clause2, Image image, boolean z, boolean z3, Image image2, Clause clause3, s2 s2Var, Object obj2, Parcelable parcelable, qv0.c cVar, int i, int i2, int i3, int i5, int i6) {
            this(str, clause, (i6 & 4) != 0 ? null : lVar, clause2, (i6 & 16) != 0 ? null : image, (i6 & 32) != 0 ? false : z, (i6 & 64) != 0 ? false : z3, (i6 & 128) != 0 ? null : image2, (i6 & 256) != 0 ? null : clause3, (i6 & 512) != 0 ? p2.f54570a : s2Var, false, (i6 & 2048) != 0 ? null : obj2, (i6 & 4096) != 0 ? null : parcelable, cVar, qv0.k.OutOfGroup, null, null, null, null, (524288 & i6) != 0 ? R$attr.uikit_dp0 : i, (1048576 & i6) != 0 ? R$attr.uikit_dp0 : i2, (2097152 & i6) != 0 ? R$attr.uikit_dp16 : i3, (i6 & 4194304) != 0 ? R$attr.uikit_dp16 : i5);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, yy0.h hVar, Clause clause, ResourceImage resourceImage, boolean z, Image image, Clause clause2, s2 s2Var, Object obj2, AnalyticsContext analyticsContext, int i, int i2) {
            yy0.h hVar2 = (i2 & 4) != 0 ? null : hVar;
            ResourceImage resourceImage2 = (i2 & 16) != 0 ? null : resourceImage;
            boolean z3 = (i2 & 32) != 0 ? false : z;
            boolean z4 = (i2 & 64) == 0;
            Image image2 = (i2 & 128) != 0 ? null : image;
            Clause clause3 = (i2 & 256) != 0 ? null : clause2;
            s2 actionState = (i2 & 512) != 0 ? p2.f54570a : s2Var;
            Object obj3 = (i2 & 2048) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i2 & 4096) != 0 ? null : analyticsContext;
            int i3 = (i2 & 8192) != 0 ? R$attr.uikit_dp0 : i;
            int i5 = R$attr.uikit_dp0;
            int i6 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(actionState, "actionState");
            this(listId, cellTitle, hVar2, clause, resourceImage2, z3, z4, image2, clause3, actionState, obj3, analyticsContext2, c.d.f249513a, i3, i5, i6, i6, 507904);
        }
    }
}
