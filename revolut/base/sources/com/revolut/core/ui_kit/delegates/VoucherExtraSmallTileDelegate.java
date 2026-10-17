package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao0;
import ip0.kt;
import ip0.qn0;
import ip0.yn0;
import ip0.zn0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherExtraSmallTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/VoucherExtraSmallTileDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/wi;", "Companion", "Model", "ip0/yn0", "ip0/ao0", "ip0/zn0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VoucherExtraSmallTileDelegate extends BaseRecyclerViewDelegate<Model, wi> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53594c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherExtraSmallTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final yn0 f53596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f53597c;
        public final TextClause d;
        public final Image e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ao0 f53598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53599h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53600j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53601l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f53602m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Parcelable f53603n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53604p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53605q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53606r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public qv0.c f53607s;

        public Model(String listId, yn0 voucherContent, TextClause voucherTitle, TextClause textClause, ResourceImage resourceImage, UrlImage urlImage, AnalyticsContext analyticsContext, Object obj2, int i) {
            resourceImage = (i & 16) != 0 ? null : resourceImage;
            urlImage = (i & 32) != 0 ? null : urlImage;
            ao0 state = ao0.DEFAULT;
            analyticsContext = (i & 256) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(voucherContent, "voucherContent");
            Intrinsics.checkNotNullParameter(voucherTitle, "voucherTitle");
            Intrinsics.checkNotNullParameter(state, "state");
            int i2 = R$attr.uikit_dp0;
            this.f53595a = listId;
            this.f53596b = voucherContent;
            this.f53597c = voucherTitle;
            this.d = textClause;
            this.e = resourceImage;
            this.f = urlImage;
            this.f53598g = state;
            this.f53599h = true;
            this.i = i2;
            this.f53600j = i2;
            this.k = i2;
            this.f53601l = i2;
            this.f53602m = obj2;
            this.f53603n = analyticsContext;
            this.o = null;
            this.f53604p = null;
            this.f53605q = null;
            this.f53606r = null;
            this.f53607s = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new VoucherExtraSmallTileDelegate(0);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52276m() {
            return this.f53602m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52269a() {
            return this.f53595a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53595a, model.f53595a) && Intrinsics.f(this.f53596b, model.f53596b) && Intrinsics.f(this.f53597c, model.f53597c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53598g == model.f53598g && this.f53599h == model.f53599h && this.i == model.i && this.f53600j == model.f53600j && this.k == model.k && this.f53601l == model.f53601l && Intrinsics.f(this.f53602m, model.f53602m) && Intrinsics.f(this.f53603n, model.f53603n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53604p, model.f53604p) && Intrinsics.f(this.f53605q, model.f53605q) && Intrinsics.f(this.f53606r, model.f53606r) && Intrinsics.f(this.f53607s, model.f53607s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52282t() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52277n() {
            return this.f53603n;
        }

        public final int hashCode() {
            int iB = ip0.v7.b((this.f53596b.hashCode() + (this.f53595a.hashCode() * 31)) * 31, 31, this.f53597c);
            TextClause textClause = this.d;
            int iHashCode = (iB + (textClause == null ? 0 : textClause.hashCode())) * 31;
            Image image = this.e;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f;
            int iB2 = j6.a.b(this.f53601l, j6.a.b(this.k, j6.a.b(this.f53600j, j6.a.b(this.i, j6.a.c((this.f53598g.hashCode() + ((iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31)) * 31, 31, this.f53599h), 31), 31), 31), 31);
            Object obj2 = this.f53602m;
            int iHashCode3 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53603n;
            int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.o;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53604p;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53605q;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53606r;
            return this.f53607s.hashCode() + ((iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52278p() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53607s = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52279q() {
            return this.f53604p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53605q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getU() {
            return this.f53600j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52283w() {
            return this.f53601l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53600j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f53607s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52281s() {
            return this.f53606r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52280r() {
            return this.f53605q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53603n = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getV() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53604p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53606r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            yn0 yn0Var;
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            yn0 yn0Var2;
            boolean z11;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            yn0 yn0Var3 = model.f53596b;
            yn0 yn0Var4 = this.f53596b;
            boolean z12 = !Intrinsics.f(yn0Var4, yn0Var3);
            boolean z29 = !Intrinsics.f(this.f53597c, model.f53597c);
            boolean z31 = !Intrinsics.f(this.d, model.d);
            boolean z41 = !Intrinsics.f(this.e, model.e);
            boolean z49 = !Intrinsics.f(this.f, model.f);
            if (this.f53598g != model.f53598g) {
                yn0Var = yn0Var4;
                z = z12;
                z3 = z29;
                z4 = z41;
                z6 = true;
            } else {
                yn0Var = yn0Var4;
                z = z12;
                z3 = z29;
                z4 = z41;
                z6 = false;
            }
            boolean z54 = !Intrinsics.f(this.f53607s, model.f53607s);
            if (this.f53599h != model.f53599h) {
                yn0Var2 = yn0Var;
                z11 = true;
            } else {
                yn0Var2 = yn0Var;
                z11 = false;
            }
            return new zn0(z, z3, z31, z4, z49, z6, z54, z11, yn0Var2.f167341b != yn0Var3.f167341b, !Intrinsics.f(yn0Var2.f167342c, yn0Var3.f167342c));
        }
    }

    public VoucherExtraSmallTileDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wi(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(wi holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UiKitMediaView uiKitMediaView = holder.f54937m;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ArrayList<zn0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof zn0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            wi.N(data, holder);
            holder.M(data.f53607s);
            yn0 yn0Var = data.f53596b;
            holder.H(yn0Var);
            holder.K(data.f53597c);
            holder.J(data.d, data.e);
            holder.I(data.f);
            wi.F(data, holder);
            int i2 = yn0Var.f167341b;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iW = kli.a.w(i2, context);
            uiKitMediaView.setPadding(iW, iW, iW, iW);
            Integer num = yn0Var.f167342c;
            if (num != null) {
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                uiKitMediaView.setBackgroundColor(kli.a.s(num.intValue(), context2));
            } else {
                uiKitMediaView.setBackgroundColor(0);
            }
        } else {
            for (zn0 zn0Var : arrayList) {
                boolean z = zn0Var.f167505a;
                boolean z3 = zn0Var.f;
                if (z) {
                    holder.H(data.f53596b);
                }
                if (zn0Var.f167506b) {
                    holder.K(data.f53597c);
                }
                if (zn0Var.f167507c || zn0Var.d) {
                    holder.J(data.d, data.e);
                }
                if (zn0Var.e) {
                    holder.I(data.f);
                }
                if (z3) {
                    wi.N(data, holder);
                }
                if (zn0Var.f167508g) {
                    holder.M(data.f53607s);
                }
                if (zn0Var.f167509h || z3) {
                    wi.F(data, holder);
                }
                if (zn0Var.i) {
                    int i3 = data.f53596b.f167341b;
                    Context context3 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    int iW2 = kli.a.w(i3, context3);
                    uiKitMediaView.setPadding(iW2, iW2, iW2, iW2);
                }
                if (zn0Var.f167510j) {
                    Integer num2 = data.f53596b.f167342c;
                    if (num2 != null) {
                        Context context4 = holder.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        uiKitMediaView.setBackgroundColor(kli.a.s(num2.intValue(), context4));
                    } else {
                        uiKitMediaView.setBackgroundColor(0);
                    }
                }
            }
        }
        if (!data.f53599h) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.o(itemView2);
        } else {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            TextClause textClause = data.f53597c;
            py0.c cVar = textClause != null ? new py0.c(textClause) : null;
            or0.m.a(itemView3);
            itemView3.setOnClickListener(new kt(data, cVar, this, data, 25));
        }
    }

    public VoucherExtraSmallTileDelegate(int i) {
        super(R$layout.internal_delegate_voucher_extra_small_tile, new qn0(2));
        this.f53594c = v0.a.d("create(...)");
    }
}
