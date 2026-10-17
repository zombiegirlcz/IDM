package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingWidgetDelegate$Model;", "Lop0/v1;", "<init>", "()V", "Model", "op0/u1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalProgressLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.v1> {
    public GoalProgressLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_goal_progress_loading, new op0.v0(12));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.v1 v1Var = new op0.v1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_goal_progress_loading));
        p(v1Var, true);
        return v1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.v1 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof op0.u1)) {
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
        boolean z = zIsEmpty;
        for (int i5 = 0; i5 < size2; i5++) {
            op0.u1 u1Var = (op0.u1) payloads.get(i5);
            zIsEmpty = zIsEmpty || u1Var.f227441a;
            z = z || u1Var.f227442b;
        }
        if (zIsEmpty) {
            kli.a.b(holder.k, data.f55136c, ty0.f.f275450a);
        }
        if (z) {
            y0 y0Var = data.d;
            View view = holder.f227455l;
            int i6 = z0.f55574a[y0Var.ordinal()];
            if (i6 == 1) {
                i2 = 8;
            } else if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            view.setVisibility(i2);
        }
        io3.h.s(holder.f227454j);
        holder.F(data.e);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/y0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55136c;
        public final y0 d;
        public final op0.q e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f55137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public op0.r f55138h;
        public final py0.c i;

        public /* synthetic */ Model(String str, TextLocalisedClause textLocalisedClause, y0 y0Var, int i) {
            this(str, textLocalisedClause, (i & 4) != 0 ? y0.DEFAULT : y0Var, null, null);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getE() {
            return this.f55138h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55138h = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.f55137g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54950b() {
            return this.f55135b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55135b, model.f55135b) && Intrinsics.f(this.f55136c, model.f55136c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55137g, model.f55137g) && this.f55138h == model.f55138h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.e, (this.d.hashCode() + t61.a.a(this.f55135b.hashCode() * 31, 31, this.f55136c)) * 31, 31);
            Parcelable parcelable = this.f;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55137g;
            return this.f55138h.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54951c() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.u1(!Intrinsics.f(this.f55136c, model.f55136c), this.d != model.d);
            }
            return null;
        }

        public Model(String listId, TextLocalisedClause title, y0 style, AnalyticsContext analyticsContext, zn.b bVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            this.f55135b = listId;
            this.f55136c = title;
            this.d = style;
            this.e = qVar;
            this.f = analyticsContext;
            this.f55137g = bVar;
            this.f55138h = rVar;
            this.i = new py0.c(title);
        }
    }
}
