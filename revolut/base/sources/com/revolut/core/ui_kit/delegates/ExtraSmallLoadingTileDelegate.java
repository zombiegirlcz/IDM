package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallLoadingTileDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExtraSmallLoadingTileDelegate$Model;", "Lip0/nh;", "<init>", "()V", "Model", "ip0/mh", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraSmallLoadingTileDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.nh> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallLoadingTileDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, tw0.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Parcelable f52303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52304c;
        public int d;
        public final int e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52306h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52307j;
        public qv0.c k;

        public Model(String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            int i = R$attr.uikit_dp0;
            this.f52302a = listId;
            this.f52303b = null;
            this.f52304c = i;
            this.d = i;
            this.e = i;
            this.f = i;
            this.f52305g = null;
            this.f52306h = null;
            this.i = null;
            this.f52307j = null;
            this.k = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ExtraSmallLoadingTileDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52311a() {
            return this.f52302a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52302a, model.f52302a) && Intrinsics.f(this.f52303b, model.f52303b) && this.f52304c == model.f52304c && this.d == model.d && this.e == model.e && this.f == model.f && Intrinsics.f(this.f52305g, model.f52305g) && Intrinsics.f(this.f52306h, model.f52306h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52307j, model.f52307j) && Intrinsics.f(this.k, model.k);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f52304c;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52304c = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52313c() {
            return this.f52303b;
        }

        public final int hashCode() {
            int iHashCode = this.f52302a.hashCode() * 31;
            Parcelable parcelable = this.f52303b;
            int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f52304c, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31);
            p31.c cVar = this.f52305g;
            int iHashCode2 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52306h;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52307j;
            return this.k.hashCode() + ((iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.f52307j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f52305g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52306h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52316j() {
            return this.d;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52317l() {
            return this.f;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.d = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52315h() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52314g() {
            return this.f52306h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52307j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52303b = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.e;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52305g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new ip0.mh(or0.b.l(model, this));
            }
            return null;
        }
    }

    public ExtraSmallLoadingTileDelegate() {
        super(R$layout.internal_delegate_extra_small_loading_tile, false, new ip0.zf(11));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.nh(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_extra_small_loading_tile));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.nh holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShimmerConstraintLayout shimmerConstraintLayout = holder.f;
        Intrinsics.checkNotNullExpressionValue(shimmerConstraintLayout, "<get-shimmerConstraintLayout>(...)");
        io3.h.s(shimmerConstraintLayout);
    }
}
