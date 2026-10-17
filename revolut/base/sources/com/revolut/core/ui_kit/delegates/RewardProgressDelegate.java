package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.CircleStepsView;
import com.revolut.core.ui_kit.views.ProgressWithTextOnSidesView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.kt;
import ip0.t90;
import ip0.ua0;
import ip0.va0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u0006\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardProgressDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/RewardProgressDelegate$Model;", "Lip0/va0;", "<init>", "()V", "Model", "a", "ip0/ua0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardProgressDelegate extends BaseRecyclerViewDelegate<Model, va0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53200c;
    public final Object d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardProgressDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f53202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f53203c;
        public Parcelable d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f53204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53205h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53206j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53207l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f53208m;

        public Model(String listId, TextClause title, a progress) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(progress, "progress");
            int i = R$attr.uikit_dp16;
            c.e eVar = new c.e((qv0.h) null, 3);
            this.f53201a = listId;
            this.f53202b = title;
            this.f53203c = progress;
            this.d = null;
            this.e = i;
            this.f = i;
            this.f53204g = i;
            this.f53205h = i;
            this.i = null;
            this.f53206j = null;
            this.k = null;
            this.f53207l = null;
            this.f53208m = eVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new RewardProgressDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53201a() {
            return this.f53201a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53201a, model.f53201a) && Intrinsics.f(this.f53202b, model.f53202b) && Intrinsics.f(this.f53203c, model.f53203c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f53204g == model.f53204g && this.f53205h == model.f53205h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53206j, model.f53206j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53207l, model.f53207l) && Intrinsics.f(this.f53208m, model.f53208m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.e = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f53203c.hashCode() + ip0.v7.b(this.f53201a.hashCode() * 31, 31, this.f53202b)) * 961, 31, false);
            Parcelable parcelable = this.d;
            int iB = j6.a.b(this.f53205h, j6.a.b(this.f53204g, j6.a.b(this.f, j6.a.b(this.e, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 961, 31), 31), 31), 31);
            p31.c cVar = this.i;
            int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53206j;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53207l;
            return this.f53208m.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53207l() {
            return this.f53207l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53208m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53206j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53205h() {
            return this.f53205h;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53208m() {
            return this.f53208m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53206j() {
            return this.f53206j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53207l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53204g() {
            return this.f53204g;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            Model model2 = (Model) oldItem;
            return new ua0(!Intrinsics.f(model2.f53202b, this.f53202b), !Intrinsics.f(model2.f53203c, this.f53203c), !true, false, or0.b.l(this, model));
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public RewardProgressDelegate() {
        super(R$layout.internal_delegate_reward_progress, new t90(8));
        this.f53200c = te0.w.y0(new e70(3));
        this.d = te0.w.y0(new e70(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new va0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_reward_progress));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(va0 holder, Model data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f166800g;
        ProgressWithTextOnSidesView progressWithTextOnSidesView = holder.i;
        CircleStepsView circleStepsView = holder.f166801h;
        ArrayList<ua0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ua0) {
                arrayList.add(obj2);
            }
        }
        py0.d dVar = null;
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z11 = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
            for (ua0 ua0Var : arrayList) {
                z11 = z11 || ua0Var.f166639a;
                z = z || ua0Var.f166640b;
                z3 = z3 || ua0Var.e;
                z6 = z6 || ua0Var.f166641c;
                z4 = z4 || ua0Var.d;
            }
        } else {
            z = z11;
            z3 = z;
            z4 = z3;
            z6 = z4;
        }
        if (z11) {
            kli.a.b(holder.f, data.f53202b, ty0.f.f275450a);
        }
        if (z) {
            a aVar = data.f53203c;
            if (aVar instanceof se) {
                se seVar = (se) aVar;
                circleStepsView.setTotalStepsCount(seVar.f54717b);
                circleStepsView.setFilledStepsCount(seVar.f54716a);
                circleStepsView.setVisibility(0);
                textView.setVisibility(8);
                progressWithTextOnSidesView.setVisibility(8);
            } else {
                if (!(aVar instanceof re)) {
                    throw new NoWhenBranchMatchedException();
                }
                re reVar = (re) aVar;
                progressWithTextOnSidesView.setProgress(reVar.f54675a);
                progressWithTextOnSidesView.setText(reVar.f54676b, reVar.f54677c);
                circleStepsView.setVisibility(8);
                textView.setVisibility(8);
                progressWithTextOnSidesView.setVisibility(0);
            }
        }
        if (z3 || z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            data.getClass();
            or0.b.c(this, data, itemView, false, null, 24);
        }
        View view = holder.itemView;
        TextView textView2 = holder.f166802j;
        data.getClass();
        view.setClickable(false);
        holder.itemView.setOnClickListener(null);
        if (z6) {
            kli.a.b(textView2, null, ty0.f.f275450a);
        }
        or0.m.a(textView2);
        textView2.setOnClickListener(new kt(data, dVar, this, data, 16));
    }
}
