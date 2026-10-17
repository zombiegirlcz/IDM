package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.va;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.LinearTrackingProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressWidgetDelegate$Model;", "Lop0/a5;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingProgressWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.a5> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TrackingProgressWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/r4", "com/revolut/core/ui_kit/delegates/widgets/q4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements TrackableItem, qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55269c;
        public final Image d;
        public final TextClause e;
        public final TextClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f55270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q4 f55271h;
        public final va i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextLocalisedClause f55272j;
        public final op0.q k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f55273l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final lac.c f55274m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public op0.r f55275n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final py0.c f55276p;

        public Model(String listId, TextLocalisedClause title, Image image, TextClause mainValue, TextClause secondaryValue, float f, q4 q4Var, va palette, TextLocalisedClause badgeText, lac.c cVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(mainValue, "mainValue");
            Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
            Intrinsics.checkNotNullParameter(palette, "palette");
            Intrinsics.checkNotNullParameter(badgeText, "badgeText");
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            this.f55268b = listId;
            this.f55269c = title;
            this.d = image;
            this.e = mainValue;
            this.f = secondaryValue;
            this.f55270g = f;
            this.f55271h = q4Var;
            this.i = palette;
            this.f55272j = badgeText;
            this.k = qVar;
            this.f55273l = null;
            this.f55274m = cVar;
            this.f55275n = rVar;
            this.o = true;
            this.f55276p = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getO() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55016g() {
            return this.f55275n;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55275n = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return this.f55274m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55860a() {
            return this.f55268b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55276p;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55268b, model.f55268b) && Intrinsics.f(this.f55269c, model.f55269c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Float.compare(this.f55270g, model.f55270g) == 0 && Intrinsics.f(this.f55271h, model.f55271h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55272j, model.f55272j) && this.k == model.k && Intrinsics.f(this.f55273l, model.f55273l) && Intrinsics.f(this.f55274m, model.f55274m) && this.f55275n == model.f55275n && this.o == model.o;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f55273l;
        }

        public final int hashCode() {
            int iB = v7.b(a10.b.c(this.d, t61.a.a(this.f55268b.hashCode() * 31, 31, this.f55269c), 31), 31, this.e);
            TextClause textClause = this.f;
            int iB2 = m72.b.b(this.f55270g, (iB + (textClause == null ? 0 : textClause.hashCode())) * 31, 31);
            q4 q4Var = this.f55271h;
            int iB3 = okl.m.b(this.k, t61.a.a((this.i.hashCode() + ((iB2 + (q4Var == null ? 0 : q4Var.hashCode())) * 31)) * 31, 31, this.f55272j), 31);
            Parcelable parcelable = this.f55273l;
            int iHashCode = (iB3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            lac.c cVar = this.f55274m;
            return Boolean.hashCode(this.o) + okl.m.c(this.f55275n, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55273l = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new r4(!Intrinsics.f(r12.f55269c, this.f55269c), !Intrinsics.f(r12.d, this.d), !Intrinsics.f(r12.e, this.e), !Intrinsics.f(r12.f, this.f), !Intrinsics.f(r12.f55272j, this.f55272j), !(((Model) oldItem).f55270g == this.f55270g), !Intrinsics.f(r12.f55271h, this.f55271h), !Intrinsics.f(r12.i, this.i));
        }
    }

    public TrackingProgressWidgetDelegate() {
        super(R$layout.internal_delegate_widget_tracking_progress, new op0.v3(16));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new op0.a5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_tracking_progress));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.a5 holder, Model data, int i, List list) {
        List<r4> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LinearTrackingProgressBar linearTrackingProgressBar = holder.f227166j;
        q4 q4Var = data.f55271h;
        va vaVar = data.i;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof r4)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        for (r4 r4Var : payloads) {
            zIsEmpty = zIsEmpty || r4Var.f55493a;
            z = z || r4Var.f55494b;
            z3 = z3 || r4Var.f55495c;
            z4 = z4 || r4Var.d;
            z11 = z11 || r4Var.e;
            z12 = z12 || r4Var.f;
            z6 = z6 || r4Var.f55496g;
            z29 = z29 || r4Var.f55497h;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f227167l, yh5.b.a(data.f55269c), ty0.f.f275450a);
        }
        if (z) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), data.d, holder.f227168m, null, null, 12);
        }
        if (z3) {
            kli.a.b(holder.f227169n, data.e, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(holder.o, data.f, ty0.f.f275450a);
        }
        if (z6) {
            kli.a.b(holder.f227170p, q4Var != null ? q4Var.f55484a : null, ty0.f.f275450a);
            kli.a.b(holder.f227171q, q4Var != null ? q4Var.f55485b : 0, ty0.f.f275450a);
        }
        if (z11 || z29) {
            TagView tagView = holder.k;
            Context context = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagView.setContent(new TagViewData(null, new CompositeClause(zhm.u.c(data.f55272j), null, new Custom(Integer.valueOf(vaVar.a()), false, null, false, null, 254), null, 10), new TagViewData.TagBackground.Solid(new Color.SolidInt(io0.a.d(0.1f, kli.a.s(vaVar.a(), context)))), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024));
        }
        if (z12) {
            linearTrackingProgressBar.setProgress(data.f55270g);
        }
        if (z29) {
            linearTrackingProgressBar.setColors(vaVar.c(), vaVar.d(), vaVar.b());
        }
        p(holder, true);
        holder.F(data.k);
    }
}
