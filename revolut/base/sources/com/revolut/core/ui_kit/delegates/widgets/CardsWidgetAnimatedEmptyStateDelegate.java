package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CardsWidgetAnimatedEmptyStateDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/CardsWidgetAnimatedEmptyStateDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/v;", "<init>", "()V", "Model", "op0/f0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsWidgetAnimatedEmptyStateDelegate extends BaseDraggableWidgetDelegate<Model, v> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CardsWidgetAnimatedEmptyStateDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/u", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55010c;
        public final TextLocalisedClause d;
        public final List e;
        public final u f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final op0.q f55011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f55012h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public op0.r f55013j;
        public final py0.c k;

        public Model(String listId, TextLocalisedClause title, TextLocalisedClause description, List cardDesigns, u state, op0.q widgetSize, Object obj2, AnalyticsContext analyticsContext, int i) {
            obj2 = (i & 64) != 0 ? null : obj2;
            analyticsContext = (i & 128) != 0 ? null : analyticsContext;
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55009b = listId;
            this.f55010c = title;
            this.d = description;
            this.e = cardDesigns;
            this.f = state;
            this.f55011g = widgetSize;
            this.f55012h = obj2;
            this.i = analyticsContext;
            this.f55013j = widgetState;
            this.k = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF() {
            return this.f55013j;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55013j = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52328h() {
            return this.f55012h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52324a() {
            return this.f55009b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.k;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55009b, model.f55009b) && Intrinsics.f(this.f55010c, model.f55010c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55011g == model.f55011g && Intrinsics.f(this.f55012h, model.f55012h) && Intrinsics.f(this.i, model.i) && this.f55013j == model.f55013j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.i;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f55011g, (this.f.hashCode() + p.a.d(t61.a.a(t61.a.a(this.f55009b.hashCode() * 31, 31, this.f55010c), 31, this.d), 31, this.e)) * 31, 31);
            Object obj2 = this.f55012h;
            int iHashCode = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return this.f55013j.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.f55011g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.f0(((Model) oldItem).f55011g != this.f55011g, !Intrinsics.f(r9.f55010c, this.f55010c), !Intrinsics.f(r9.d, this.d), !Intrinsics.f(r9.e, this.e), !Intrinsics.f(r9.f, this.f));
        }
    }

    public CardsWidgetAnimatedEmptyStateDelegate() {
        super(R$layout.internal_delegate_card_animated_empty_widget, new ood.g0(22));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        v vVar = new v(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(vVar, true);
        return vVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(v holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        CardsEmptyStateView cardsEmptyStateView = holder.f55524j;
        TextView textView = holder.k;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.f0) {
                zN = zN || ((op0.f0) next).f227242b;
                zN2 = zN2 || ((op0.f0) next).f227243c;
                zN3 = zN3 || ((op0.f0) next).f227241a;
                zN4 = zN4 || ((op0.f0) next).d;
                if (!zN5 && !((op0.f0) next).e) {
                    z = false;
                }
                zN5 = z;
            }
        }
        if (zN) {
            ty0.c.b(or0.u.k(textView).b0(), yh5.b.a(data.f55010c), holder.k, null, null, 12);
        }
        if (zN2) {
            ty0.c.b(or0.u.k(holder.f55525l).b0(), data.d, holder.f55525l, null, null, 12);
        }
        if (zN3 || zN4) {
            op0.q qVar = data.f55011g;
            holder.F(qVar);
            cardsEmptyStateView.setParams(new CardsEmptyStateView.b(data.e, op0.i0.f227302a[qVar.ordinal()] == 1 ? ss0.d.e : ss0.c.e));
            textView.setVisibility(qVar != op0.q.MEDIUM ? 8 : 0);
        }
        u value = data.f;
        Intrinsics.checkNotNullParameter(value, "value");
        holder.f55526m = value;
        if (value instanceof r) {
            if (((r) value).f55486a.f57724a) {
                cardsEmptyStateView.g();
                return;
            } else {
                if (cardsEmptyStateView.e.isRunning()) {
                    return;
                }
                cardsEmptyStateView.f();
                return;
            }
        }
        if (Intrinsics.f(value, s.f55498a)) {
            cardsEmptyStateView.f();
        } else {
            if (!Intrinsics.f(value, t.f55509a)) {
                throw new NoWhenBranchMatchedException();
            }
            cardsEmptyStateView.g();
        }
    }
}
