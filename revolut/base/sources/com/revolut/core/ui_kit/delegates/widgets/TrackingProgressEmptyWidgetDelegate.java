package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressEmptyWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressEmptyWidgetDelegate$Model;", "Lop0/x4;", "<init>", "()V", "Model", "op0/w4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingProgressEmptyWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.x4> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f55259h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressEmptyWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55261c;
        public final TextLocalisedClause d;
        public final GlyphImage e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final lac.a f55262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55263h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55264j;

        public Model(TextLocalisedClause title, TextLocalisedClause subtitle, GlyphImage image, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            this.f55260b = listId;
            this.f55261c = title;
            this.d = subtitle;
            this.e = image;
            this.f = null;
            this.f55262g = lac.a.f193359a;
            this.f55263h = op0.q.MEDIUM;
            this.i = op0.r.SEEN;
            this.f55264j = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55016g() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return this.f55262g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55860a() {
            return this.f55260b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55264j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55260b, model.f55260b) && Intrinsics.f(this.f55261c, model.f55261c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55262g, model.f55262g);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + t61.a.a(t61.a.a(this.f55260b.hashCode() * 31, 31, this.f55261c), 31, this.d)) * 31;
            Parcelable parcelable = this.f;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            lac.a aVar = this.f55262g;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.f55263h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new op0.w4(!Intrinsics.f(this.f55261c, r5.f55261c), !Intrinsics.f(this.d, r5.d), !Intrinsics.f(this.e, r5.e));
            }
            return null;
        }
    }

    public TrackingProgressEmptyWidgetDelegate() {
        super(R$layout.internal_delegate_widget_tracking_progress_empty, new op0.v3(14));
        this.f55259h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new op0.x4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_tracking_progress_empty));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.x4 holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextLocalisedClause textLocalisedClause = data.f55261c;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.w4)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            op0.w4 w4Var = (op0.w4) payloads.get(i3);
            zIsEmpty = zIsEmpty || w4Var.f227468a;
            z = z || w4Var.f227469b;
            z3 = z3 || w4Var.f227470c;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f227480j, textLocalisedClause, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.k, data.d, ty0.f.f275450a);
        }
        if (z3) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.e, holder.f227481l, null, null, 12);
        }
        p(holder, true);
        holder.F(data.f55263h);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(textLocalisedClause);
        or0.m.a(itemView);
        itemView.setOnClickListener(new op0.r3(data, cVar, this, data, 1));
    }
}
