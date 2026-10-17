package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingTileWidgetDelegate$Model;", "Lop0/t1;", "<init>", "()V", "Model", "op0/s1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalProgressLoadingTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.t1> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressLoadingTileWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55133c;
        public final op0.q d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final py0.c f55134g;

        public Model(TextLocalisedClause title, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f55132b = listId;
            this.f55133c = title;
            this.d = qVar;
            this.e = null;
            this.f = rVar;
            this.f55134g = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55257h() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55256g() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f55132b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55134g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55132b, model.f55132b) && Intrinsics.f(this.f55133c, model.f55133c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.e;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.d, t61.a.a(this.f55132b.hashCode() * 31, 31, this.f55133c), 31);
            Parcelable parcelable = this.e;
            return this.f.hashCode() + ((iB + (parcelable == null ? 0 : parcelable.hashCode())) * 961);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getI() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new op0.s1(!Intrinsics.f(this.f55133c, r3.f55133c));
            }
            return null;
        }
    }

    public GoalProgressLoadingTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_goal_progress_loading_tile, new op0.v0(11));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.t1 t1Var = new op0.t1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_goal_progress_loading_tile));
        p(t1Var, true);
        return t1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.t1 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.s1)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((op0.s1) payloads.get(i3)).f227410a;
        }
        if (zIsEmpty) {
            kli.a.b(holder.k, data.f55133c, ty0.f.f275450a);
        }
        io3.h.s(holder.f227422j);
        holder.F(data.d);
    }
}
