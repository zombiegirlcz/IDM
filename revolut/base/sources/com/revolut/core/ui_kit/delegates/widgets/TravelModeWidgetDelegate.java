package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SuggestionView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import op0.c5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TravelModeWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TravelModeWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/y4;", "<init>", "()V", "Companion", "b", "Model", "op0/c5", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelModeWidgetDelegate extends BaseDraggableWidgetDelegate<Model, y4> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55279h = io0.a.d(0.7f, -16777216);
    public static final int i = io0.a.d(0.5f, -16777216);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TravelModeWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/w4", "com/revolut/core/ui_kit/delegates/widgets/v4", "com/revolut/core/ui_kit/delegates/widgets/x4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55281c;
        public final TextLocalisedClause d;
        public final UrlImage e;
        public final w4 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final x4 f55282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55283h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final op0.q f55284j;
        public final py0.c k;

        public Model(String listId, TextLocalisedClause topLabel, TextLocalisedClause title, UrlImage background, w4 products, x4 x4Var) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55280b = listId;
            this.f55281c = topLabel;
            this.d = title;
            this.e = background;
            this.f = products;
            this.f55282g = x4Var;
            this.f55283h = null;
            this.i = widgetState;
            this.f55284j = op0.q.LARGE;
            this.k = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getI() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF53476n() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53468a() {
            return this.f55280b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55228j() {
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
            return Intrinsics.f(this.f55280b, model.f55280b) && Intrinsics.f(this.f55281c, model.f55281c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55282g, model.f55282g) && Intrinsics.f(this.f55283h, model.f55283h) && this.i == model.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53472h() {
            return this.f55283h;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + v7.g(this.e, t61.a.a(t61.a.a(this.f55280b.hashCode() * 31, 31, this.f55281c), 31, this.d), 31)) * 31;
            x4 x4Var = this.f55282g;
            int iHashCode2 = (iHashCode + (x4Var == null ? 0 : x4Var.hashCode())) * 31;
            Parcelable parcelable = this.f55283h;
            return this.i.hashCode() + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 961);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55284j() {
            return this.f55284j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55283h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new c5(!Intrinsics.f(this.d, r9.d), !Intrinsics.f(this.f55281c, r9.f55281c), !Intrinsics.f(this.f55282g, r9.f55282g), !Intrinsics.f(this.e, r9.e), !Intrinsics.f(this.f, r9.f));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b extends BaseDraggableWidgetDelegate.a {
        private b() {
        }
    }

    public TravelModeWidgetDelegate() {
        super(R$layout.internal_delegate_widget_travel_mode, new op0.v3(18));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new y4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_travel_mode));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(y4 holder, Model data, int i2, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i2, payloads);
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof c5)) {
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
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i5 = 0; i5 < size2; i5++) {
            c5 c5Var = (c5) payloads.get(i5);
            z = z || c5Var.f227212a;
            zIsEmpty = zIsEmpty || c5Var.f227213b;
            z6 = z6 || c5Var.f227214c;
            z3 = z3 || c5Var.d;
            z4 = z4 || c5Var.e;
        }
        if (zIsEmpty) {
            kli.a.b(holder.k, data.f55281c, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f55564j, data.d, ty0.f.f275450a);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ((jz0.b) or0.u.k(itemView).a0()).b(data.e, holder.f55567n, null);
        }
        if (z4) {
            w4 products = data.f;
            Intrinsics.checkNotNullParameter(products, "products");
            z4l.j jVar = holder.f55569q;
            IconDelegate.Model modelH = y4.H(products.f55543a);
            IconDelegate.Model modelH2 = y4.H(products.f55544b);
            v4 v4Var = products.f55545c;
            IconDelegate.Model modelH3 = v4Var != null ? y4.H(v4Var) : null;
            v4 v4Var2 = products.d;
            IconDelegate.Model[] elements = {modelH, modelH2, modelH3, v4Var2 != null ? y4.H(v4Var2) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            jVar.c(kotlin.collections.d.L(elements));
        }
        if (z6) {
            x4 x4Var = data.f55282g;
            SuggestionView suggestionView = holder.f55565l;
            suggestionView.setVisibility(x4Var == null ? 8 : 0);
            if (x4Var != null) {
                suggestionView.setText(x4Var.f55553a);
            }
        }
        holder.f55566m.setOnClickListener(new kp0.l(this, data, 15));
        ood.k listener = new ood.k(this, data, 15);
        Intrinsics.checkNotNullParameter(listener, "listener");
        holder.f55570r = listener;
        ky4.f listener2 = new ky4.f(data, 23, holder, this);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        holder.f55571s = listener2;
    }
}
