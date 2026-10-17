package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.s20;
import ip0.t20;
import ip0.tz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProductSelectionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ProductSelectionDelegate$Model;", "Lip0/t20;", "<init>", "()V", "Model", "a", "ip0/s20", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductSelectionDelegate extends BaseRecyclerViewDelegate<Model, t20> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52972c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProductSelectionDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f52974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52975c;
        public final Clause d;
        public final List e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52977h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52978j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52979l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52980m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52981n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52982p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52983q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52984r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52985s;

        public Model(String listId, a image, Clause title, Clause clause, List tags, Object obj2, AnalyticsContext analyticsContext, boolean z, boolean z3, boolean z4, int i) {
            tags = (i & 16) != 0 ? zhm.f0.f322471a : tags;
            obj2 = (i & 32) != 0 ? null : obj2;
            analyticsContext = (i & 64) != 0 ? null : analyticsContext;
            z = (i & 128) != 0 ? true : z;
            z3 = (i & 256) != 0 ? true : z3;
            z4 = (i & 512) != 0 ? true : z4;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tags, "tags");
            int i2 = R$attr.uikit_dp0;
            this.f52973a = listId;
            this.f52974b = image;
            this.f52975c = title;
            this.d = clause;
            this.e = tags;
            this.f = z;
            this.f52976g = z3;
            this.f52977h = z4;
            this.i = obj2;
            this.f52978j = analyticsContext;
            this.k = c.d.f249513a;
            this.f52979l = null;
            this.f52980m = null;
            this.f52981n = null;
            this.o = null;
            this.f52982p = i2;
            this.f52983q = i2;
            this.f52984r = i2;
            this.f52985s = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ProductSelectionDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getZ() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54213a() {
            return this.f52973a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52973a, model.f52973a) && Intrinsics.f(this.f52974b, model.f52974b) && Intrinsics.f(this.f52975c, model.f52975c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f52976g == model.f52976g && this.f52977h == model.f52977h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52978j, model.f52978j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52979l, model.f52979l) && Intrinsics.f(this.f52980m, model.f52980m) && Intrinsics.f(this.f52981n, model.f52981n) && Intrinsics.f(this.o, model.o) && this.f52982p == model.f52982p && this.f52983q == model.f52983q && this.f52984r == model.f52984r && this.f52985s == model.f52985s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getB() {
            return this.f52982p;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52982p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f52978j;
        }

        public final int hashCode() {
            int iA = p.a.a((this.f52974b.hashCode() + (this.f52973a.hashCode() * 31)) * 31, 31, this.f52975c);
            Clause clause = this.d;
            int iC = j6.a.c(j6.a.c(j6.a.c(p.a.d((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f52976g), 31, this.f52977h);
            Object obj2 = this.i;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52978j;
            int i = h30.l.i(this.k, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52979l;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52980m;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52981n;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return Integer.hashCode(this.f52985s) + j6.a.b(this.f52984r, j6.a.b(this.f52983q, j6.a.b(this.f52982p, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.f52979l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53048p() {
            return this.f52980m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52981n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getC() {
            return this.f52983q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getE() {
            return this.f52985s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52983q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53051s() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53050r() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53049q() {
            return this.f52981n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52979l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52978j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getD() {
            return this.f52984r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52980m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !this.f52974b.equals(model.f52974b);
            boolean z4 = !Intrinsics.f(this.f52975c, model.f52975c);
            boolean z6 = !Intrinsics.f(this.d, model.d);
            boolean z11 = !Intrinsics.f(this.e, model.e);
            boolean z12 = false;
            boolean z29 = this.f != model.f;
            if (this.f52976g != model.f52976g) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            return new s20(z3, z4, z6, z11, z29, z12, this.f52977h != model.f52977h ? true : z, (Intrinsics.f(this.k, model.k) && this.f52982p == model.f52982p && this.f52983q == model.f52983q && this.f52984r == model.f52984r && this.f52985s == model.f52985s) ? z : true);
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public ProductSelectionDelegate() {
        super(R$layout.internal_delegate_product_selection, new tz(21));
        this.f52972c = v0.a.d("create(...)");
    }

    public static void r(t20 t20Var, boolean z) {
        t20Var.k.setVisibility(z ? 0 : 8);
        TextView textView = t20Var.f166423h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = t20Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        marginLayoutParams.setMarginEnd(kli.a.k(context, z ? 8.0f : 16.0f));
        textView.setLayoutParams(marginLayoutParams);
    }

    public static void s(t20 t20Var, boolean z) {
        TextView textView = t20Var.f166423h;
        int i = z ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(i, context));
        ImageView imageView = t20Var.k;
        int i2 = z ? R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorGreyTone10;
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rd0.e.q(imageView, Integer.valueOf(kli.a.s(i2, context2)));
        t20Var.f.setAlpha(z ? 1.0f : 0.4f);
    }

    public static void t(t20 t20Var, a aVar) {
        if (aVar instanceof dc) {
            t20Var.f.setVisibility(0);
            t20Var.f166422g.setVisibility(8);
            View view = t20Var.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), ((dc) aVar).f54032a, t20Var.f, null, null, 12);
            return;
        }
        if (!(aVar instanceof ec)) {
            throw new NoWhenBranchMatchedException();
        }
        UiKitMediaView uiKitMediaView = t20Var.f166422g;
        uiKitMediaView.setVisibility(0);
        t20Var.f.setVisibility(8);
        View itemView = t20Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ((jz0.b) or0.u.k(itemView).a0()).b(((ec) aVar).f54108a, t20Var.f166422g, null);
        Context context = t20Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageView imageView = (ImageView) uiKitMediaView.b(R$layout.internal_uikit_media_image);
        int iK = kli.a.k(context, (imageView != null && imageView.getVisibility() == 0 && rd0.e.m(imageView)) ? 40.0f : 80.0f);
        or0.u.A(uiKitMediaView, iK, iK);
    }

    public static void u(t20 t20Var, List list) {
        t20Var.f166424j.setVisibility(!list.isEmpty() ? 0 : 8);
        t20Var.f166424j.setModel(new mx0.qc(list, null));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new t20(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_product_selection));
    }

    public final efm.r p() {
        efm.r rVarHide = this.f52972c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(t20 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.i;
        TextView textView2 = holder.f166423h;
        if (payloads.isEmpty()) {
            t(holder, data.f52974b);
            kli.a.b(textView2, data.f52975c, ty0.f.f275450a);
            kli.a.b(textView, data.d, ty0.f.f275450a);
            u(holder, data.e);
            or0.b.j(this, new c.e((qv0.h) null, 3), holder.f166422g);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
            r(holder, data.f);
            s(holder, data.f52977h);
        } else {
            List list = payloads;
            ArrayList<s20> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ProductSelectionDelegate.Payload");
                arrayList.add((s20) obj2);
            }
            for (s20 s20Var : arrayList) {
                if (s20Var.f166275a) {
                    t(holder, data.f52974b);
                }
                if (s20Var.f166276b) {
                    kli.a.b(textView2, data.f52975c, ty0.f.f275450a);
                }
                if (s20Var.f166277c) {
                    kli.a.b(textView, data.d, ty0.f.f275450a);
                }
                if (s20Var.d) {
                    u(holder, data.e);
                }
                if (s20Var.f166279h) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, true, null, 24);
                }
                if (s20Var.e) {
                    r(holder, data.f);
                }
                if (s20Var.f166278g) {
                    s(holder, data.f52977h);
                }
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        Clause clause = data.f52975c;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(itemView3);
        itemView3.setOnClickListener(new ip0.d6(data, cVar, holder, this, data, 7));
        holder.itemView.setClickable(data.f52976g);
    }
}
