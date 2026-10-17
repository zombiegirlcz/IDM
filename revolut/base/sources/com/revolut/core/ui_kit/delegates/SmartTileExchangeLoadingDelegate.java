package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ShimmeringTextView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.pg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeLoadingDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/ah;", "<init>", "()V", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartTileExchangeLoadingDelegate extends BaseRecyclerViewDelegate<Model, ah> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aw0.b7 f53434c = new aw0.b7(zhm.v.k(new aw0.t6(BitmapDescriptorFactory.HUE_RED, new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126)), new aw0.t6(135.0f, new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126))));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileExchangeLoadingDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public qv0.c f53435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p31.c f53436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p31.c f53437c;
        public p31.c d;
        public p31.c e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53439h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53440j;
        public final o97.y k;

        public Model(o97.y yVar) {
            Intrinsics.checkNotNullParameter("EXCHANGE_TILE_ID", "listId");
            int i = R$attr.uikit_dp0;
            this.f53435a = c.d.f249513a;
            this.f53436b = null;
            this.f53437c = null;
            this.d = null;
            this.e = null;
            this.f = i;
            this.f53438g = i;
            this.f53439h = i;
            this.i = i;
            this.f53440j = null;
            this.k = yVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmartTileExchangeLoadingDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF55091b() {
            return "EXCHANGE_TILE_ID";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53435a, model.f53435a) && Intrinsics.f(this.f53436b, model.f53436b) && Intrinsics.f(this.f53437c, model.f53437c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53438g == model.f53438g && this.f53439h == model.f53439h && this.i == model.i && Intrinsics.f(this.f53440j, model.f53440j) && this.k.equals(model.k);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f53440j;
        }

        public final int hashCode() {
            int i = h30.l.i(this.f53435a, 334526416, 31);
            p31.c cVar = this.f53436b;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53437c;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.d;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.e;
            int iB = j6.a.b(this.i, j6.a.b(this.f53439h, j6.a.b(this.f53438g, j6.a.b(this.f, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f53440j;
            return this.k.hashCode() + ((iB + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55865j() {
            return this.f53436b;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53435a = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f53437c;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.d = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55863g() {
            return this.f53438g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53438g = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.f53435a;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55867m() {
            return this.e;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55866l() {
            return this.d;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53436b = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53440j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55864h() {
            return this.f53439h;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53437c = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.e = cVar;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public SmartTileExchangeLoadingDelegate() {
        super(R$layout.internal_delegate_smart_tile_exchange_loading, new je0(14));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ah(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_smart_tile_exchange_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ah holder, Model data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        or0.b.c(this, data, holder.f53684g, false, null, 28);
        a aVar = Companion;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        aVar.getClass();
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean z = c8g.c.H(context) >= 360;
        if (z == holder.f53686j) {
            return;
        }
        holder.f53685h.setVisibility(z ? 0 : 8);
        holder.i.setVisibility(z ? 0 : 8);
        holder.f.setVisibility(z ? 0 : 8);
        nx0.f fVar = z ? nx0.f.COMPACT : nx0.f.NORMAL;
        int i3 = pg0.f165823a[fVar.ordinal()];
        if (i3 == 1) {
            AmountEditView.INSTANCE.getClass();
            i2 = AmountEditView.Q;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AmountEditView.INSTANCE.getClass();
            i2 = AmountEditView.P;
        }
        Context context2 = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AmountEditView.INSTANCE.getClass();
        int iK = kli.a.k(context2, AmountEditView.Companion.a(fVar));
        View viewFindViewById = holder.itemView.findViewById(R$id.smartTileExchangeLoading_topAmountContainer);
        ShimmeringTextView shimmeringTextView = (ShimmeringTextView) viewFindViewById.findViewById(R$id.exchangeAmountPlaceholder_textView);
        viewFindViewById.setPadding(0, iK, 0, iK);
        Intrinsics.h(shimmeringTextView);
        jb3.l.e(shimmeringTextView, i2);
        View viewFindViewById2 = holder.itemView.findViewById(R$id.smartTileExchangeLoading_bottomAmountContainer);
        ShimmeringTextView shimmeringTextView2 = (ShimmeringTextView) viewFindViewById2.findViewById(R$id.exchangeAmountPlaceholder_textView);
        viewFindViewById2.setPadding(0, iK, 0, iK);
        Intrinsics.h(shimmeringTextView2);
        jb3.l.e(shimmeringTextView2, i2);
    }
}
