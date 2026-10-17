package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.bb;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/IconsTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/IconsTileWidgetDelegate$Model;", "Lop0/q2;", "<init>", "()V", "Companion", "Model", "op0/p2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IconsTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.q2> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/IconsTileWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MoneyClause f55173c;
        public final TextLocalisedClause d;
        public final Clause e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final op0.q f55174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55175h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55176j;
        public final py0.c k;

        public Model(String listId, MoneyClause title, TextLocalisedClause topLabel, List icons, List list, CompositeClause compositeClause, int i) {
            list = (i & 32) != 0 ? null : list;
            compositeClause = (i & 64) != 0 ? null : compositeClause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(icons, "icons");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f55172b = listId;
            this.f55173c = title;
            this.d = topLabel;
            this.e = compositeClause;
            this.f = icons;
            this.f55174g = qVar;
            this.f55175h = null;
            this.i = rVar;
            this.f55176j = list;
            this.k = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54983r() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54982q() {
            return this.f55176j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52302a() {
            return this.f55172b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
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
            return Intrinsics.f(this.f55172b, model.f55172b) && Intrinsics.f(this.f55173c, model.f55173c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55174g == model.f55174g && Intrinsics.f(this.f55175h, model.f55175h) && this.i == model.i && Intrinsics.f(this.f55176j, model.f55176j);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52303b() {
            return this.f55175h;
        }

        public final int hashCode() {
            int iA = t61.a.a(v7.a(this.f55172b.hashCode() * 31, 31, this.f55173c), 31, this.d);
            Clause clause = this.e;
            int iB = okl.m.b(this.f55174g, p.a.d((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31);
            Parcelable parcelable = this.f55175h;
            int iC = okl.m.c(this.i, (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            Object obj2 = this.f55176j;
            return iC + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54980n() {
            return this.f55174g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55175h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.p2(!Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f55173c, model.f55173c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), this.f55174g != model.f55174g);
            }
            return null;
        }
    }

    public IconsTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_icons_tile, new op0.v0(17));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.q2 q2Var = new op0.q2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_icons_tile));
        p(q2Var, true);
        return q2Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.q2 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ResizableTileHeaderView resizableTileHeaderView = holder.f227391j;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                break;
            }
            Object obj2 = payloads.get(i2);
            if (obj2 instanceof op0.p2) {
                zN = zN || ((op0.p2) obj2).f227378b;
                zN2 = zN2 || ((op0.p2) obj2).f227377a;
                zN3 = zN3 || ((op0.p2) obj2).f227379c;
                zN4 = zN4 || ((op0.p2) obj2).d;
                if (!zN5 && !((op0.p2) obj2).e) {
                    z = false;
                }
                zN5 = z;
            }
            i2++;
        }
        if (zN) {
            resizableTileHeaderView.setTitle(data.f55173c);
        }
        if (zN3) {
            resizableTileHeaderView.setTopLabel(data.d);
        }
        if (zN4) {
            resizableTileHeaderView.setBottomSubtitle(data.e);
        }
        if (zN2) {
            OverlappedIconsView overlappedIconsView = holder.k;
            List listE0 = data.f;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i3 = kli.a.z(context.getResources().getDisplayMetrics().widthPixels, context) < 360.0f ? 3 : 4;
            List listV0 = zhm.d0.V0(listE0, i3);
            if (listE0.size() > i3) {
                listE0 = zhm.d0.E0(zhm.d0.V0(listV0, i3 - 1), zhm.u.c(new CircleImageDecorator((Image) new TextImage(a0.d.n("+", (listE0.size() - i3) + 1), kli.a.s(R$attr.uikit_colorDeepGrey, context), kli.a.s(R$attr.uikit_colorGreyTone10, context), 0, 16, 40, 200), (Float) null, 2.0f, R$attr.uikit_colorWidgetBackground, 0, 34)));
            }
            OverlappedIconsView.setIcons$default(overlappedIconsView, listE0, bb.REGULAR12, null, 0, false, 28, null);
        }
        if (zN5) {
            holder.F(data.f55174g);
        }
    }
}
