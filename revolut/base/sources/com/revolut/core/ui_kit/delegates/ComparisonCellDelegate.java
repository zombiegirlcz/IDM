package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComparisonCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ComparisonCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/e4;", "<init>", "()V", "a", "ip0/hb", "Model", "ip0/ib", "ip0/jb", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonCellDelegate extends BaseRecyclerViewDelegate<Model, e4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52104c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComparisonCellDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c4 f52106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4 f52107c;
        public final ip0.jb d;
        public qv0.c e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52108g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52109h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52110j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52111l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52112m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52113n;

        public Model(String listId, c4 firstContent, c4 secondContent, ip0.jb state, int i, int i2) {
            state = (i2 & 16) != 0 ? ip0.jb.DEFAULT : state;
            int i3 = R$attr.uikit_dp0;
            i = (i2 & 256) != 0 ? i3 : i;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(firstContent, "firstContent");
            Intrinsics.checkNotNullParameter(secondContent, "secondContent");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f52105a = listId;
            this.f52106b = firstContent;
            this.f52107c = secondContent;
            this.d = state;
            this.e = c.d.f249513a;
            this.f = null;
            this.f52108g = i3;
            this.f52109h = i3;
            this.i = i;
            this.f52110j = i3;
            this.k = null;
            this.f52111l = null;
            this.f52112m = null;
            this.f52113n = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ComparisonCellDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52105a() {
            return this.f52105a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52105a, model.f52105a) && Intrinsics.f(this.f52106b, model.f52106b) && Intrinsics.f(this.f52107c, model.f52107c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52108g == model.f52108g && this.f52109h == model.f52109h && this.i == model.i && this.f52110j == model.f52110j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52111l, model.f52111l) && Intrinsics.f(this.f52112m, model.f52112m) && Intrinsics.f(this.f52113n, model.f52113n);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52108g() {
            return this.f52108g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52108g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int i = h30.l.i(this.e, (this.d.hashCode() + ((this.f52107c.hashCode() + ((this.f52106b.hashCode() + (this.f52105a.hashCode() * 31)) * 31)) * 31)) * 961, 31);
            Parcelable parcelable = this.f;
            int iB = j6.a.b(this.f52110j, j6.a.b(this.i, j6.a.b(this.f52109h, j6.a.b(this.f52108g, (i + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31);
            p31.c cVar = this.k;
            int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52111l;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52112m;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52113n;
            return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.e = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52111l() {
            return this.f52111l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52112m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52109h() {
            return this.f52109h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52110j() {
            return this.f52110j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52109h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.e;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52113n() {
            return this.f52113n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52112m() {
            return this.f52112m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52111l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52113n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.ib(!Intrinsics.f(r6.f52106b, this.f52106b), !Intrinsics.f(r6.f52107c, this.f52107c), ((Model) oldItem).d != this.d);
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public ComparisonCellDelegate() {
        super(R$layout.internal_delegate_comparison_cell, new ip0.h8(29));
        this.f52104c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new e4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_comparison_cell), this.f52104c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(e4 holder, Model model, int i, List list) throws Throwable {
        GradientDrawable gradientDrawableI;
        Object objA;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        View view = holder.f54085p;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            gradientDrawableI = null;
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ib)) {
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
            ip0.ib ibVar = (ip0.ib) payloads.get(i3);
            zIsEmpty = zIsEmpty || ibVar.f164666a;
            z = z || ibVar.f164667b;
            z3 = z3 || ibVar.f164668c;
        }
        if (zIsEmpty) {
            Intrinsics.checkNotNullParameter(model, "data");
            holder.F(model, model.f52106b, holder.i, holder.f54082l, holder.f54084n, holder.f54081j);
        }
        if (z) {
            Intrinsics.checkNotNullParameter(model, "data");
            try {
                m.Companion companion = yhm.m.INSTANCE;
                c4 c4Var = model.f52107c;
                objA = Unit.f186387a;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            holder.F(model, model.f52107c, holder.k, holder.f54083m, holder.o, null);
        }
        if (z3) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(holder, "holder");
            int i5 = ip0.kb.f164985a[model.d.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawableI = dr0.l.i(context, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral_40), 222);
            }
            holder.f54079g.setForeground(gradientDrawableI);
            holder.f54080h.setForeground(gradientDrawableI);
        }
        qv0.c cVar = model.e;
        if ((cVar instanceof c.b) || (cVar instanceof c.f)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, model, itemView, false, null, 28);
    }
}
