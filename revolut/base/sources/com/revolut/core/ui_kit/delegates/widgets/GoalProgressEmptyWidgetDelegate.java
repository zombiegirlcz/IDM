package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressEmptyWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressEmptyWidgetDelegate$Model;", "Lop0/r1;", "<init>", "()V", "Model", "op0/q1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalProgressEmptyWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.r1> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressEmptyWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, TrackableItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55127c;
        public final TextLocalisedClause d;
        public final LayeredImage e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final op0.q f55128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public op0.r f55129h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f55130j;
        public final zn.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final py0.c f55131l;

        public Model(String listId, TextLocalisedClause title, TextLocalisedClause description, LayeredImage image, AnalyticsContext analyticsContext, zn.b bVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(image, "image");
            CompositeClause compositeClauseA = yh5.b.a(title);
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            this.f55126b = listId;
            this.f55127c = compositeClauseA;
            this.d = description;
            this.e = image;
            this.f = true;
            this.f55128g = qVar;
            this.f55129h = rVar;
            this.i = true;
            this.f55130j = analyticsContext;
            this.k = bVar;
            this.f55131l = new py0.c(compositeClauseA);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55129h() {
            return this.f55129h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55129h = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52249j() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55126b() {
            return this.f55126b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55131l;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55126b, model.f55126b) && Intrinsics.f(this.f55127c, model.f55127c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f55128g == model.f55128g && this.f55129h == model.f55129h && this.i == model.i && Intrinsics.f(this.f55130j, model.f55130j) && Intrinsics.f(this.k, model.k);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55130j() {
            return this.f55130j;
        }

        public final int hashCode() {
            int iC = j6.a.c(okl.m.c(this.f55129h, okl.m.b(this.f55128g, j6.a.c(h30.l.e(this.e, t61.a.a(p.a.b(this.f55126b.hashCode() * 31, 31, this.f55127c), 961, this.d), 31), 31, this.f), 31), 31), 31, this.i);
            Parcelable parcelable = this.f55130j;
            int iHashCode = (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            zn.b bVar = this.k;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55128g() {
            return this.f55128g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55130j = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new op0.q1(!Intrinsics.f(this.f55127c, r0.f55127c), !Intrinsics.f(this.d, r0.d), !true, !Intrinsics.f(this.e, r0.e), this.f != ((Model) oldItem).f);
            }
            return null;
        }
    }

    public GoalProgressEmptyWidgetDelegate() {
        super(R$layout.internal_delegate_widget_goal_progress_empty, new op0.v0(10));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new op0.r1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_goal_progress_empty));
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.r1 holder, Model data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof op0.q1)) {
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
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.q1 q1Var = (op0.q1) payloads.get(i3);
            zIsEmpty = zIsEmpty || q1Var.f227388a;
            z = z || q1Var.f227389b;
            z3 = z3 || q1Var.f227390c;
            z4 = z4 || q1Var.d;
            z6 = z6 || q1Var.e;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f227396j, data.f55127c, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.k, data.d, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.f227397l, null, ty0.f.f275450a);
        }
        if (z4) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.e, holder.f227398m, null, null, 12);
        }
        if (z6) {
            p(holder, data.f);
        }
        holder.F(data.f55128g);
    }
}
