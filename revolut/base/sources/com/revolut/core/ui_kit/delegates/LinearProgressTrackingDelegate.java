package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LinearTrackingProgressBar;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.kt;
import ip0.lt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LinearProgressTrackingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LinearProgressTrackingDelegate$Model;", "Lip0/lt;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinearProgressTrackingDelegate extends BaseRecyclerViewDelegate<Model, lt> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52659c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LinearProgressTrackingDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/z7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f52661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52662c;
        public final float d;
        public final aw0.va e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f52664h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public qv0.c f52665j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52666l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52667m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52668n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52669p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52670q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52671r;

        public Model(String listId, TextLocalisedClause title, Clause clause, float f, aw0.va palette, Clause badgeText, Delivery delivery, int i) {
            boolean z = (i & 128) == 0;
            delivery = (i & 256) != 0 ? null : delivery;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            y7 icon = y7.f55626a;
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(palette, "palette");
            Intrinsics.checkNotNullParameter(badgeText, "badgeText");
            int i2 = R$attr.uikit_dp16;
            this.f52660a = listId;
            this.f52661b = title;
            this.f52662c = clause;
            this.d = f;
            this.e = palette;
            this.f = badgeText;
            this.f52663g = z;
            this.f52664h = delivery;
            this.i = null;
            this.f52665j = c.d.f249513a;
            this.k = null;
            this.f52666l = null;
            this.f52667m = null;
            this.f52668n = null;
            this.o = i2;
            this.f52669p = i2;
            this.f52670q = i2;
            this.f52671r = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LinearProgressTrackingDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.f52664h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53293a() {
            return this.f52660a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            if (!Intrinsics.f(this.f52660a, model.f52660a) || !this.f52661b.equals(model.f52661b) || !Intrinsics.f(this.f52662c, model.f52662c)) {
                return false;
            }
            Object obj3 = y7.f55626a;
            return obj3.equals(obj3) && Float.compare(this.d, model.d) == 0 && this.e.equals(model.e) && this.f.equals(model.f) && this.f52663g == model.f52663g && Intrinsics.f(this.f52664h, model.f52664h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52665j, model.f52665j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52666l, model.f52666l) && Intrinsics.f(this.f52667m, model.f52667m) && Intrinsics.f(this.f52668n, model.f52668n) && this.o == model.o && this.f52669p == model.f52669p && this.f52670q == model.f52670q && this.f52671r == model.f52671r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.i;
        }

        public final int hashCode() {
            int iA = t61.a.a(this.f52660a.hashCode() * 31, 31, this.f52661b);
            Clause clause = this.f52662c;
            int iC = j6.a.c(p.a.a((this.e.hashCode() + m72.b.b(this.d, (y7.f55626a.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31)) * 31, 31, this.f), 31, this.f52663g);
            Object obj2 = this.f52664h;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            int i = h30.l.i(this.f52665j, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.k;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52666l;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52667m;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52668n;
            return Integer.hashCode(this.f52671r) + j6.a.b(this.f52670q, j6.a.b(this.f52669p, j6.a.b(this.o, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53298j() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52665j = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53296g() {
            return this.f52666l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52667m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53299l() {
            return this.f52669p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53301n() {
            return this.f52671r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52669p = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f52665j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52668n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53297h() {
            return this.f52667m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53300m() {
            return this.f52670q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52666l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52668n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !model.f52661b.equals(this.f52661b);
            boolean z3 = !Intrinsics.f(model.f52662c, this.f52662c);
            Object obj2 = y7.f55626a;
            return new z7(z, z3, !obj2.equals(obj2), !model.f.equals(this.f), !(model.d == this.d), !model.e.equals(this.e), !Intrinsics.f(model.f52665j, this.f52665j), model.f52663g != this.f52663g);
        }
    }

    public LinearProgressTrackingDelegate() {
        super(R$layout.internal_delegate_tracking_progress, new hq(18));
        this.f52659c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new lt(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_tracking_progress));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(lt holder, Model model, int i, List list) {
        Model data = model;
        List<z7> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        LinearTrackingProgressBar linearTrackingProgressBar = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof z7)) {
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
        for (z7 z7Var : payloads) {
            zIsEmpty = zIsEmpty || z7Var.f55676a;
            z = z || z7Var.f55677b;
            z3 = z3 || z7Var.f55678c;
            z4 = z4 || z7Var.d;
            z11 = z11 || z7Var.e;
            z6 = z6 || z7Var.f;
            z12 = z12 || z7Var.f55679g;
            z29 = z29 || z7Var.f55680h;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f165259h, data.f52661b, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.i, data.f52662c, ty0.f.f275450a);
        }
        if (z3) {
            data.getClass();
            linearTrackingProgressBar.setIcon(R$drawable.uikit_icn_24_delivery_car);
        }
        if (z4 || z6) {
            TagView tagView = holder.f165258g;
            Context context = tagView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iD = io0.a.d(0.1f, kli.a.s(data.e.a(), context));
            CompositeClause compositeClause = new CompositeClause(zhm.u.c(data.f), null, new Custom(Integer.valueOf(data.e.a()), false, null, false, null, 254), null, 10);
            TagViewData.TagOutline.Solid solid = new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent);
            Image image = null;
            tagView.setContent(new TagViewData(image, compositeClause, new TagViewData.TagBackground.Solid(new Color.SolidInt(iD)), null, solid, false, null, null, null, 0, null, 2024));
        }
        if (z11) {
            linearTrackingProgressBar.setProgress(data.d);
        }
        if (z6) {
            aw0.va vaVar = data.e;
            linearTrackingProgressBar.setColors(vaVar.c(), vaVar.d(), vaVar.b());
        }
        if (z12 || z29) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.f52663g, null, 24);
            data = data;
        }
        if (!data.f52663g) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.o(itemView2);
        } else {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            py0.c cVar = new py0.c(data.f52661b);
            or0.m.a(itemView3);
            itemView3.setOnClickListener(new kt(data, cVar, this, model, 1));
        }
    }
}
