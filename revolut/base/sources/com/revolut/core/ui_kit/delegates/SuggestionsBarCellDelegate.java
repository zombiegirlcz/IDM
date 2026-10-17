package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.gh0;
import ip0.hh0;
import ip0.ih0;
import ip0.je0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SuggestionsBarCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SuggestionsBarCellDelegate$Model;", "Lip0/hh0;", "<init>", "()V", "Companion", "Model", "ip0/gh0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuggestionsBarCellDelegate extends BaseRecyclerViewDelegate<Model, hh0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53481c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SuggestionsBarCellDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f53483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f53484c;
        public qv0.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f53485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53486h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53487j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f53489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ArrayList f53490n;

        public Model(String listId, Clause title, ArrayList suggestions) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            int i = R$attr.uikit_dp16;
            this.f53482a = listId;
            this.f53483b = title;
            this.f53484c = suggestions;
            this.d = c.d.f249513a;
            this.e = null;
            this.f = null;
            this.f53485g = null;
            this.f53486h = null;
            this.i = i;
            this.f53487j = i;
            this.k = i;
            this.f53488l = i;
            this.f53489m = null;
            ArrayList arrayList = new ArrayList(zhm.w.t(suggestions, 10));
            Iterator it8 = suggestions.iterator();
            while (it8.hasNext()) {
                arrayList.add(new com.revolut.core.ui_kit.internal.delegates.a((SuggestionsBarDelegate.Suggestion) it8.next()));
            }
            this.f53490n = arrayList;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SuggestionsBarCellDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52567m() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52560a() {
            return this.f53482a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53482a.equals(model.f53482a) && this.f53483b.equals(model.f53483b) && this.f53484c.equals(model.f53484c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53485g, model.f53485g) && Intrinsics.f(this.f53486h, model.f53486h) && this.i == model.i && this.f53487j == model.f53487j && this.k == model.k && this.f53488l == model.f53488l && Intrinsics.f(this.f53489m, model.f53489m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52568n() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52566l() {
            return this.f53489m;
        }

        public final int hashCode() {
            int i = h30.l.i(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f53484c, p.a.b(this.f53482a.hashCode() * 961, 29791, this.f53483b), 961), 31);
            p31.c cVar = this.e;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53485g;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53486h;
            int iB = j6.a.b(this.f53488l, j6.a.b(this.k, j6.a.b(this.f53487j, j6.a.b(this.i, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 961);
            Parcelable parcelable = this.f53489m;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52572s() {
            return this.e;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.d = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52573t() {
            return this.f;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53485g = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.f53487j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52570q() {
            return this.f53488l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53487j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52571r() {
            return this.d;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getV() {
            return this.f53486h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getU() {
            return this.f53485g;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.e = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53489m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52569p() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53486h = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            boolean z = oldItem instanceof Model;
            if ((z ? (Model) oldItem : null) == null) {
                return null;
            }
            return new gh0(!this.f53483b.equals(((Model) oldItem).f53483b), !true, !true, !true, !Intrinsics.f(this.f53490n, (z ? (Model) oldItem : null) != null ? r10.f53490n : null));
        }
    }

    public SuggestionsBarCellDelegate() {
        super(R$layout.internal_suggestons_bar_cell_delegate, new je0(22));
        this.f53481c = te0.w.y0(new e70(11));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_suggestons_bar_cell_delegate);
        z4l.j jVar = new z4l.j(new koi.c(zhm.u.c((SuggestionDelegate) this.f53481c.getValue())), false, 14);
        hh0 hh0Var = new hh0(viewR, jVar);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) hh0Var.f164561l.getValue();
        RecyclerView recyclerView = hh0Var.k;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new tw0.c(8.0f));
        recyclerView.setClipToOutline(true);
        recyclerView.setOutlineProvider(new ih0());
        return hh0Var;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(hh0 holder, Model data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof gh0)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i2 = 0; i2 < size; i2++) {
            gh0 gh0Var = (gh0) list.get(i2);
            zIsEmpty = zIsEmpty || gh0Var.f164421a;
            z = z || gh0Var.f164422b;
            z4 = z4 || gh0Var.f164423c;
            z3 = z3 || gh0Var.d;
            z6 = z6 || gh0Var.e;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f164559h, data.f53483b, ty0.f.f275450a);
        }
        if (z) {
            TextView textView = holder.i;
            data.getClass();
            kli.a.b(textView, null, ty0.f.f275450a);
        }
        if (z3) {
            TextView textView2 = holder.f164560j;
            data.getClass();
            kli.a.b(textView2, null, ty0.f.f275450a);
        }
        if (z4) {
            ImageView imageView = holder.f164558g;
            data.getClass();
            zi0.c.g(imageView, null);
        }
        if (z6) {
            data.getClass();
            holder.k.setLayoutManager((LinearLayoutManager) holder.f164561l.getValue());
            holder.f.c(data.f53490n);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
