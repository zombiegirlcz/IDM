package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ToDoItemView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsActionListDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsActionListDelegate$Model;", "Lip0/c6;", "<init>", "()V", "ip0/b6", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsActionListDelegate extends BaseRecyclerViewDelegate<Model, ip0.c6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51795c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsActionListDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f51797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51798c;
        public final Image d;
        public final List e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f51799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f51800h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51801j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51802l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51803m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51804n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51805p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f51806q;

        public Model(String listId, Clause title, TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, List actionItems, boolean z, ra.a aVar, int i) {
            textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
            resourceImage = (i & 8) != 0 ? null : resourceImage;
            z = (i & 32) != 0 ? false : z;
            aVar = (i & 64) != 0 ? null : aVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionItems, "actionItems");
            int i2 = R$attr.uikit_dp0;
            this.f51796a = listId;
            this.f51797b = title;
            this.f51798c = textLocalisedClause;
            this.d = resourceImage;
            this.e = actionItems;
            this.f = z;
            this.f51799g = aVar;
            this.f51800h = null;
            this.i = c.d.f249513a;
            this.f51801j = null;
            this.k = null;
            this.f51802l = null;
            this.f51803m = null;
            this.f51804n = i2;
            this.o = i2;
            this.f51805p = i2;
            this.f51806q = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsActionListDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55103h() {
            return this.f51799g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55100b() {
            return this.f51796a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51796a, model.f51796a) && this.f51797b.equals(model.f51797b) && Intrinsics.f(this.f51798c, model.f51798c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51799g, model.f51799g) && Intrinsics.f(this.f51800h, model.f51800h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51801j, model.f51801j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51802l, model.f51802l) && Intrinsics.f(this.f51803m, model.f51803m) && this.f51804n == model.f51804n && this.o == model.o && this.f51805p == model.f51805p && this.f51806q == model.f51806q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51648m() {
            return this.f51804n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51804n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55102g() {
            return this.f51800h;
        }

        public final int hashCode() {
            int iB = p.a.b(this.f51796a.hashCode() * 31, 31, this.f51797b);
            Clause clause = this.f51798c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.d;
            int iC = j6.a.c(p.a.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31, this.f);
            Object obj2 = this.f51799g;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51800h;
            int i = h30.l.i(this.i, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f51801j;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51802l;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51803m;
            return Integer.hashCode(this.f51806q) + j6.a.b(this.f51805p, j6.a.b(this.o, j6.a.b(this.f51804n, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51647l() {
            return this.f51801j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51802l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51649n() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51650p() {
            return this.f51806q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51645h() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.f51803m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51646j() {
            return this.f51802l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51801j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51800h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f51805p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51803m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.b6(!r0.f51797b.equals(this.f51797b), !Intrinsics.f(r0.f51798c, this.f51798c), !Intrinsics.f(r0.d, this.d), !Intrinsics.f(r0.e, this.e), or0.b.l((qv0.i) oldItem, this), ((Model) oldItem).f != this.f);
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public CellDetailsActionListDelegate() {
        super(R$layout.internal_delegate_cell_details_action_list, new ip0.g4(11));
        this.f51795c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.c6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_action_list));
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.c6 holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        View view;
        boolean z11;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LinearLayout linearLayout = holder.i;
        int size = payloads.size();
        boolean z12 = false;
        int i2 = 0;
        while (true) {
            z11 = false;
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.b6)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z29 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            boolean z31 = z29;
            boolean z41 = z31 ? 1 : 0;
            boolean z49 = z41 ? 1 : 0;
            z6 = z49 ? 1 : 0;
            int i3 = 0;
            z29 = z29;
            z = z31;
            z3 = z41;
            z4 = z49;
            while (i3 < size2) {
                ip0.b6 b6Var = (ip0.b6) payloads.get(i3);
                boolean z54 = z29 || b6Var.f163535a;
                i3++;
                z29 = z54;
                z = z || b6Var.f163536b;
                z3 = z3 || b6Var.f163537c;
                z4 = z4 || b6Var.d;
                z6 = z6 || b6Var.e;
            }
        } else {
            z = z29;
            z3 = z ? 1 : 0;
            z4 = z3 ? 1 : 0;
            z6 = z4 ? 1 : 0;
        }
        if (z29) {
            kli.a.b(holder.f, data.f51797b, ty0.f.f275450a);
        }
        if (z) {
            or0.b.e(this, data.f51798c, holder.f163684g, null, 12);
        }
        if (z3) {
            zi0.c.g(holder.f163685h, data.d);
        }
        if (z4) {
            linearLayout.removeAllViews();
            for (a aVar : data.e) {
                int i5 = 6;
                if (aVar instanceof c2) {
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    mx0.xc xcVar = new mx0.xc(context, z11 ? 1 : 0, i5, z12 ? 1 : 0);
                    xcVar.setText(((c2) aVar).f53740a);
                    view = xcVar;
                } else {
                    if (!(aVar instanceof b2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ToDoItemView toDoItemView = new ToDoItemView(context2, null, 6, 0);
                    b2 b2Var = (b2) aVar;
                    toDoItemView.setModel(new aw0.pa(b2Var.f53705b, b2Var.f53704a, aw0.oa.LEGACY_CONTENT_COLOR));
                    view = toDoItemView;
                }
                linearLayout.addView(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                marginLayoutParams.bottomMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                view.setLayoutParams(marginLayoutParams);
            }
        }
        if (z6) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        fp0.p pVar = holder.k;
        Clause clause = data.f51798c;
        boolean z74 = data.f;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        fp0.p.b(pVar, z74);
        View view2 = pVar.f137029a;
        or0.m.a(view2);
        if (z74) {
            view2.setOnClickListener(new ip0.d6(data, cVar, holder, this, data, 0));
        } else {
            or0.u.o(view2);
        }
        fp0.p pVar2 = holder.f163687l;
        ?? r2 = data.f51797b;
        boolean z83 = data.f51798c != null;
        py0.c cVar2 = new py0.c(r2);
        fp0.p.b(pVar2, z83);
        View view3 = pVar2.f137029a;
        or0.m.a(view3);
        if (z83) {
            view3.setOnClickListener(new au0.i3(data, cVar2, this, data, 11));
        } else {
            or0.u.o(view3);
        }
    }
}
