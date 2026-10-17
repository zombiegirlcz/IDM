package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/InputWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/InputWidgetDelegate$Model;", "Lop0/u2;", "<init>", "()V", "Model", "op0/t2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.u2> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/InputWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55181c;
        public final boolean d;
        public final Clause e;
        public final TextLocalisedClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public op0.r f55182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55183h;
        public final py0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final op0.q f55184j;

        public Model(String listId, TextLocalisedClause title, boolean z, TextClause textClause, TextLocalisedClause suggestion) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55180b = listId;
            this.f55181c = title;
            this.d = z;
            this.e = textClause;
            this.f = suggestion;
            this.f55182g = widgetState;
            this.f55183h = null;
            this.i = new py0.c(title);
            this.f55184j = op0.q.MEDIUM;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getD() {
            return this.f55182g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55182g = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52249j() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55177b() {
            return this.f55180b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
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
            return Intrinsics.f(this.f55180b, model.f55180b) && Intrinsics.f(this.f55181c, model.f55181c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55182g == model.f55182g && Intrinsics.f(this.f55183h, model.f55183h);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f55183h;
        }

        public final int hashCode() {
            int iC = j6.a.c(t61.a.a(this.f55180b.hashCode() * 31, 31, this.f55181c), 31, this.d);
            Clause clause = this.e;
            int iC2 = okl.m.c(this.f55182g, t61.a.a((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31);
            Parcelable parcelable = this.f55183h;
            return (iC2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55179g() {
            return this.f55184j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55183h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.t2(!Intrinsics.f(model.f55181c, this.f55181c), model.d != this.d, !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f), model.f55184j != this.f55184j);
            }
            return null;
        }
    }

    public InputWidgetDelegate() {
        super(R$layout.internal_view_widget_input, new op0.v0(19));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ov0.a aVar = new ov0.a(context, null, 6, 0);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        op0.u2 u2Var = new op0.u2(aVar);
        p(u2Var, true);
        View itemView = u2Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setPadding(0, 0, 0, 0);
        return u2Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.u2 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        Clause clause = data.e;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.t2)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        if (payloads != null) {
            for (op0.t2 t2Var : payloads) {
                zN = zN || t2Var.f227423a;
                zN2 = zN2 || t2Var.f227425c;
                zN3 = zN3 || t2Var.d;
                zN4 = zN4 || t2Var.f227424b;
                zN5 = zN5 || t2Var.e;
            }
        }
        ov0.a aVar = holder.f227443j;
        if (zN) {
            kli.a.b(aVar.getTitleView$ui_kit_components_release(), data.f55181c, ty0.f.f275450a);
        }
        if (zN2) {
            if (clause != null) {
                ChatBubbleView.setDescription$default(aVar.getBubbleView$ui_kit_components_release(), clause, null, 2, null);
                aVar.getBubbleView$ui_kit_components_release().setVisibility(0);
            } else {
                aVar.getBubbleView$ui_kit_components_release().setVisibility(8);
            }
        }
        if (zN3) {
            kli.a.b(aVar.getSuggestionView$ui_kit_components_release(), data.f, ty0.f.f275450a);
        }
        if (zN4) {
            aVar.setNotificationDot(data.d);
        }
        if (zN5) {
            holder.F(data.f55184j);
        }
    }
}
