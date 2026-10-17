package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dg0;
import ip0.je0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewLoadingDelegate$Model;", "Lip0/dg0;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartTileAssetViewLoadingDelegate extends BaseRecyclerViewDelegate<Model, dg0> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewLoadingDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public qv0.c f53414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p31.c f53415c;
        public p31.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53417h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53418j;
        public Parcelable k;

        public Model(String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            int i = R$attr.uikit_dp16;
            this.f53413a = listId;
            this.f53414b = c.d.f249513a;
            this.f53415c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.f53416g = i;
            this.f53417h = i;
            this.i = i;
            this.f53418j = i;
            this.k = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmartTileAssetViewLoadingDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55256g() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52987a() {
            return this.f53413a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53413a.equals(model.f53413a) && Intrinsics.f(this.f53414b, model.f53414b) && Intrinsics.f(this.f53415c, model.f53415c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f53416g == model.f53416g && this.f53417h == model.f53417h && this.i == model.i && this.f53418j == model.f53418j && Intrinsics.f(this.k, model.k);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52995n() {
            return this.f53416g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53416g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52991h() {
            return this.k;
        }

        public final int hashCode() {
            int i = h30.l.i(this.f53414b, j6.a.c(j6.a.c(j6.a.c(this.f53413a.hashCode() * 31, 31, true), 31, true), 31, true), 31);
            p31.c cVar = this.f53415c;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.d;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.e;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f;
            int iB = j6.a.b(this.f53418j, j6.a.b(this.i, j6.a.b(this.f53417h, j6.a.b(this.f53416g, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.k;
            return (iB + (parcelable != null ? parcelable.hashCode() : 0)) * 31;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52992j() {
            return this.f53415c;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53414b = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.d;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.e = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.f53417h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52997q() {
            return this.f53418j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53417h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.f53414b;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52994m() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52993l() {
            return this.e;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53415c = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52996p() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.d = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f = cVar;
        }
    }

    public SmartTileAssetViewLoadingDelegate() {
        super(R$layout.internal_delegate_smart_tile_asset_view_loading, new je0(12));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new dg0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_smart_tile_asset_view_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(dg0 holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LottieAnimationView lottieAnimationView = holder.i;
        if (payloads.size() > 0) {
            payloads.get(0);
            payloads = null;
        }
        List list2 = payloads;
        boolean z6 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            Iterator it8 = payloads.iterator();
            while (true) {
                z = z6;
                z3 = z;
                z4 = z3;
                if (!it8.hasNext()) {
                    break;
                }
                if (it8.next() != null) {
                    throw new ClassCastException();
                }
                if (!z6) {
                    throw null;
                }
                if (!z) {
                    throw null;
                }
                if (!z3) {
                    throw null;
                }
                if (!z4) {
                    throw null;
                }
                z6 = true;
            }
        } else {
            z = z6;
            z3 = z;
            z4 = z3;
        }
        if (z6) {
            AppCompatImageView appCompatImageView = holder.f163895g;
            data.getClass();
            appCompatImageView.setVisibility(0);
        }
        if (z) {
            AppCompatTextView appCompatTextView = holder.f163896h;
            data.getClass();
            appCompatTextView.setVisibility(0);
        }
        if (z3) {
            data.getClass();
            lottieAnimationView.setVisibility(0);
            yy0.f fVarQ = or0.u.k(lottieAnimationView).Q();
            LottieAnimationView lottieAnimationView2 = holder.i;
            LottieSource.Companion companion = LottieSource.INSTANCE;
            int i2 = R$raw.internal_lottie_chart_loading;
            companion.getClass();
            yy0.f.e(fVarQ, new LottieImage(dz0.a.a(companion, i2), (List) null, 126), lottieAnimationView2, null, null, 12);
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        io3.h.s(holder.f);
    }
}
