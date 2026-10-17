package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;", "Lip0/x6;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsChevronDelegate extends BaseRecyclerViewDelegate<Model, ip0.x6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51821c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/f2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51824c;
        public final f2 d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f51825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f51826h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51827j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f51828l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51829m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f51830n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final py0.a f51831p;

        public /* synthetic */ Model(String str, Clause clause, int i, f2 f2Var, Object obj2, Parcelable parcelable, int i2, int i3, int i5, int i6, py0.a aVar) {
            this(str, clause, i, f2Var, obj2, parcelable, c.d.f249513a, null, null, null, null, i2, i3, i5, i6, aVar);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsChevronDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52731b() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52730a() {
            return this.f51822a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51822a, model.f51822a) && Intrinsics.f(this.f51823b, model.f51823b) && this.f51824c == model.f51824c && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51825g, model.f51825g) && Intrinsics.f(this.f51826h, model.f51826h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51827j, model.f51827j) && Intrinsics.f(this.k, model.k) && this.f51828l == model.f51828l && this.f51829m == model.f51829m && this.f51830n == model.f51830n && this.o == model.o && Intrinsics.f(this.f51831p, model.f51831p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52739p() {
            return this.f51828l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51828l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.f;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f51824c, p.a.a(this.f51822a.hashCode() * 31, 31, this.f51823b), 31);
            f2 f2Var = this.d;
            int iHashCode = (iB + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
            Object obj2 = this.e;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int i = h30.l.i(this.f51825g, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f51826h;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51827j;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            int iB2 = j6.a.b(this.o, j6.a.b(this.f51830n, j6.a.b(this.f51829m, j6.a.b(this.f51828l, (iHashCode5 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            py0.a aVar = this.f51831p;
            return iB2 + (aVar != null ? aVar.f240640a.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getV() {
            return this.f51826h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51825g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52744w() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51827j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52740q() {
            return this.f51829m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52742s() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51829m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getU() {
            return this.f51825g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52746y() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52745x() {
            return this.f51827j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51826h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52741r() {
            return this.f51830n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        public Model(String listId, Clause cellTitle, int i, f2 f2Var, Object obj2, Parcelable parcelable, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6, py0.a aVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51822a = listId;
            this.f51823b = cellTitle;
            this.f51824c = i;
            this.d = f2Var;
            this.e = obj2;
            this.f = parcelable;
            this.f51825g = positionInBox;
            this.f51826h = cVar;
            this.i = cVar2;
            this.f51827j = cVar3;
            this.k = cVar4;
            this.f51828l = i2;
            this.f51829m = i3;
            this.f51830n = i5;
            this.o = i6;
            this.f51831p = aVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, String cellTitle, FaqNodeBase faqNodeBase, AnalyticsContext analyticsContext, int i) {
            int i2 = R$attr.uikit_colorForeground;
            FaqNodeBase faqNodeBase2 = (i & 16) != 0 ? null : faqNodeBase;
            AnalyticsContext analyticsContext2 = (i & 32) != 0 ? null : analyticsContext;
            int i3 = R$attr.uikit_dp0;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            this(listId, new TextClause(cellTitle, (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), i2, f2.INTERNAL, faqNodeBase2, analyticsContext2, i3, i3, i5, i5, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, int i, boolean z, Object obj2, AnalyticsContext analyticsContext, py0.a aVar, int i2) {
            int i3 = (i2 & 4) != 0 ? R$attr.uikit_colorForeground : i;
            boolean z3 = (i2 & 8) != 0 ? true : z;
            Object obj3 = (i2 & 16) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i2 & 32) != 0 ? null : analyticsContext;
            int i5 = (i2 & 64) != 0 ? R$attr.uikit_dp0 : 0;
            int i6 = (i2 & 128) != 0 ? R$attr.uikit_dp0 : 0;
            int i21 = R$attr.uikit_dp16;
            py0.a aVar2 = (i2 & 1024) != 0 ? null : aVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            this(listId, cellTitle, i3, z3 ? f2.INTERNAL : null, obj3, analyticsContext2, i5, i6, i21, i21, aVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, f2 f2Var, int i, Object obj2, AnalyticsContext analyticsContext, int i2) {
            int i3 = (i2 & 8) != 0 ? R$attr.uikit_colorForeground : i;
            Object obj3 = (i2 & 16) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i2 & 32) != 0 ? null : analyticsContext;
            int i5 = R$attr.uikit_dp0;
            int i6 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            this(listId, cellTitle, i3, f2Var, obj3, analyticsContext2, i5, i5, i6, i6, null);
        }
    }

    public CellDetailsChevronDelegate() {
        super(R$layout.internal_delegate_cell_details_chevron, new ip0.g4(16));
        this.f51821c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.x6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_chevron));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.x6 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        ImageView imageView = holder.f167097g;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, true, null, 24);
        Clause clause = data.f51823b;
        f2 f2Var = data.d;
        TextView textView = holder.f;
        or0.b.e(this, clause, textView, null, 12);
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(data.f51824c, context));
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        Clause clause2 = data.f51823b;
        py0.c cVar = clause2 != null ? new py0.c(clause2) : null;
        or0.m.a(itemView2);
        itemView2.setOnClickListener(new ip0.d6(data, cVar, holder, this, data, 1));
        if (f2Var != null) {
            imageView.setImageResource(f2Var.a());
        }
        imageView.setVisibility(f2Var != null ? 0 : 8);
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        hx7.b.u(zhm.u.c(hx7.b.f(clause2)), itemView3);
    }
}
