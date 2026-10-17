package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.StatItemView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapWidgetDelegate$Model;", "Lop0/j1;", "<init>", "()V", "Model", "op0/i1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarthMapWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.j1> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/widgets/p0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f55094c;
        public final TextLocalisedClause d;
        public final p0 e;
        public final p0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p0 f55095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55096h;
        public final zod.m i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public op0.r f55097j;
        public final op0.q k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final py0.c f55098l;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.EarthMapWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(Image image, TextLocalisedClause topLabel, p0 p0Var, p0 p0Var2, p0 p0Var3) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55093b = "TRIPS_GLOBE_WIDGET_ID_";
            this.f55094c = image;
            this.d = topLabel;
            this.e = p0Var;
            this.f = p0Var2;
            this.f55095g = p0Var3;
            this.f55096h = null;
            this.i = zod.m.f324008a;
            this.f55097j = widgetState;
            this.k = op0.q.DYNAMIC;
            this.f55098l = new py0.c(topLabel);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getD() {
            return this.f55097j;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55097j = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.f55093b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55098l;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55093b, model.f55093b) && Intrinsics.f(this.f55094c, model.f55094c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55095g, model.f55095g) && Intrinsics.f(this.f55096h, model.f55096h) && Intrinsics.f(this.i, model.i) && this.f55097j == model.f55097j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55278c() {
            return this.f55096h;
        }

        public final int hashCode() {
            int iA = t61.a.a(a10.b.c(this.f55094c, this.f55093b.hashCode() * 31, 31), 29791, this.d);
            p0 p0Var = this.e;
            int iHashCode = (iA + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
            p0 p0Var2 = this.f;
            int iHashCode2 = (iHashCode + (p0Var2 == null ? 0 : p0Var2.hashCode())) * 31;
            p0 p0Var3 = this.f55095g;
            int iHashCode3 = (iHashCode2 + (p0Var3 == null ? 0 : p0Var3.hashCode())) * 31;
            Parcelable parcelable = this.f55096h;
            int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            zod.m mVar = this.i;
            return this.f55097j.hashCode() + ((iHashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getE() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55096h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z = true;
            boolean z3 = !Intrinsics.f(this.f55094c, model.f55094c);
            boolean z4 = !Intrinsics.f(this.d, model.d);
            if (Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55095g, model.f55095g)) {
                z = false;
            }
            return new op0.i1(z3, z4, z);
        }
    }

    public EarthMapWidgetDelegate() {
        super(R$layout.internal_delegate_widget_earth_map, new op0.v0(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.j1 j1Var = new op0.j1(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(j1Var, true);
        return j1Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.j1 holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        StatItemView statItemView = holder.f227315l;
        p0 p0Var = data.e;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.i1)) {
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
            op0.i1 i1Var = (op0.i1) payloads.get(i3);
            zIsEmpty = zIsEmpty || i1Var.f227303a;
            z = z || i1Var.f227304b;
            z3 = z3 || i1Var.f227305c;
        }
        if (zIsEmpty) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.f55094c, holder.k, null, null, 12);
        }
        if (z) {
            ResizableTileHeaderView resizableTileHeaderView = holder.f227314j;
            resizableTileHeaderView.setTopLabel(data.d);
            resizableTileHeaderView.setTitle(null);
            resizableTileHeaderView.setRightSubtitle(null);
            resizableTileHeaderView.setBottomSubtitle(null);
        }
        if (z3) {
            StatItemView statItemView2 = holder.f227317n;
            StatItemView statItemView3 = holder.f227316m;
            p0 p0Var2 = data.f55095g;
            p0 p0Var3 = data.f;
            statItemView.setVisibility(p0Var != null ? 0 : 8);
            statItemView3.setVisibility(p0Var3 != null ? 0 : 8);
            statItemView2.setVisibility(p0Var2 == null ? 8 : 0);
            if (p0Var != null) {
                statItemView.setModel(new ms0.t4(p0Var.f55462a, p0Var.f55463b));
            }
            if (p0Var3 != null) {
                statItemView3.setModel(new ms0.t4(p0Var3.f55462a, p0Var3.f55463b));
            }
            if (p0Var2 != null) {
                statItemView2.setModel(new ms0.t4(p0Var2.f55462a, p0Var2.f55463b));
            }
        }
    }
}
