package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ErrorWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ErrorWidgetDelegate$Model;", "Lop0/l1;", "<init>", "()V", "com/revolut/core/ui_kit/delegates/widgets/q0", "Model", "op0/k1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.l1> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f55099h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ErrorWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f55101c;
        public final Clause d;
        public final Clause e;
        public final op0.q f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f55102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f55103h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55104j;

        public Model(String listId, Image image, Clause title, Clause clause, op0.q widgetSize, AnalyticsContext analyticsContext, Object obj2, int i) {
            image = (i & 2) != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30) : image;
            analyticsContext = (i & 32) != 0 ? null : analyticsContext;
            obj2 = (i & 64) != 0 ? null : obj2;
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55100b = listId;
            this.f55101c = image;
            this.d = title;
            this.e = clause;
            this.f = widgetSize;
            this.f55102g = analyticsContext;
            this.f55103h = obj2;
            this.i = widgetState;
            this.f55104j = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f55103h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51641a() {
            return this.f55100b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55104j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55100b, model.f55100b) && Intrinsics.f(this.f55101c, model.f55101c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55102g, model.f55102g) && Intrinsics.f(this.f55103h, model.f55103h) && this.i == model.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51644g() {
            return this.f55102g;
        }

        public final int hashCode() {
            int iA = p.a.a(a10.b.c(this.f55101c, this.f55100b.hashCode() * 31, 31), 31, this.d);
            Clause clause = this.e;
            int iB = okl.m.b(this.f, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
            Parcelable parcelable = this.f55102g;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55103h;
            return this.i.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55102g = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.k1(!Intrinsics.f(this.f55101c, model.f55101c), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.d, model.d), this.f != model.f);
            }
            return null;
        }
    }

    public ErrorWidgetDelegate() {
        super(R$layout.internal_delegate_widget_error, new op0.v0(5));
        this.f55099h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.l1 l1Var = new op0.l1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_error));
        p(l1Var, true);
        return l1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.l1 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f227341l;
        op0.q qVar = data.f;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.k1) {
                zN = zN || ((op0.k1) next).f227329c;
                zN2 = zN2 || ((op0.k1) next).f227327a;
                zN3 = zN3 || ((op0.k1) next).f227328b;
                zN4 = zN4 || ((op0.k1) next).d;
            }
        }
        if (zN) {
            kli.a.b(holder.f227340j, data.d, ty0.f.f275450a);
        }
        if (zN2) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.f55101c, holder.k, null, null, 12);
        }
        if (zN3) {
            kli.a.b(textView, data.e, ty0.f.f275450a);
        }
        if (zN4) {
            holder.F(qVar);
            ImageView imageView = holder.k;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, op0.m1.f227349a[qVar.ordinal()] == 1 ? 104.0f : 56.0f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = iK;
            layoutParams.height = iK;
        }
        or0.u.u(textView, data, new j01.c(new View[]{textView}, data, this.f55099h, new oa2.b(this, data, 24), 8));
    }
}
