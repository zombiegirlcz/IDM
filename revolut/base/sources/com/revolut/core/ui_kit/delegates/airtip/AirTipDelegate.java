package com.revolut.core.ui_kit.delegates.airtip;

import android.animation.ValueAnimator;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.drawables.AirTipHintAnimationDrawable;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;
import ihm.f;
import ip0.kt;
import ip0.v7;
import j6.a;
import java.util.List;
import jp0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import or0.m;
import or0.u;
import qv0.c;
import qv0.i;
import qv0.p;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/airtip/AirTipDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/airtip/AirTipDelegate$Model;", "Ljp0/b;", "<init>", "()V", "Model", "jp0/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirTipDelegate extends BaseRecyclerViewDelegate<Model, b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f53689c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/airtip/AirTipDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements i, p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f53691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f53692c;
        public final AnimationRequest d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f53693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53694h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53695j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53696l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53697m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53698n;
        public final int o;

        public Model(String listId, TextClause title, TextClause body, AnimationRequest animationRequest, l5d.b bVar, AnalyticsContext analyticsContext, int i) {
            animationRequest = (i & 32) != 0 ? null : animationRequest;
            bVar = (i & 64) != 0 ? null : bVar;
            analyticsContext = (i & 128) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f53690a = listId;
            this.f53691b = title;
            this.f53692c = body;
            this.d = animationRequest;
            this.e = bVar;
            this.f = analyticsContext;
            this.f53693g = c.d.f249513a;
            this.f53694h = null;
            this.i = null;
            this.f53695j = null;
            this.k = null;
            int i2 = R$attr.uikit_dp0;
            this.f53696l = i2;
            this.f53697m = i2;
            this.f53698n = i2;
            this.o = i2;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53690a() {
            return this.f53690a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53690a, model.f53690a) && this.f53691b.equals(model.f53691b) && this.f53692c.equals(model.f53692c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53693g, model.f53693g) && Intrinsics.f(this.f53694h, model.f53694h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53695j, model.f53695j) && Intrinsics.f(this.k, model.k);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53696l() {
            return this.f53696l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53696l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iC = a.c(v7.b(v7.b(this.f53690a.hashCode() * 31, 31, this.f53691b), 961, this.f53692c), 31, true);
            AnimationRequest animationRequest = this.d;
            int iHashCode = (iC + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Object obj2 = this.e;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int i = l.i(this.f53693g, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53694h;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53695j;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53694h() {
            return this.f53694h;
        }

        @Override // qv0.i
        public final void j(c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53693g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53695j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53697m() {
            return this.f53697m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53697m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final c getF53693g() {
            return this.f53693g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53695j() {
            return this.f53695j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53694h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53698n() {
            return this.f53698n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new jp0.a(!r0.f53691b.equals(this.f53691b), !r0.f53692c.equals(this.f53692c), !true, ((Model) oldItem).d != this.d, false, or0.b.l(this, (i) oldItem));
        }
    }

    public AirTipDelegate() {
        super(R$layout.internal_delegate_air_tip, new jme.f(10));
        this.f53689c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        b holder = (b) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AirTipHintAnimationDrawable airTipHintAnimationDrawable = holder.f177182j;
        airTipHintAnimationDrawable.k = false;
        ValueAnimator valueAnimator = airTipHintAnimationDrawable.f55743r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        airTipHintAnimationDrawable.f55744s = -1.0f;
        airTipHintAnimationDrawable.f55743r = null;
        airTipHintAnimationDrawable.invalidateSelf();
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        b holder = (b) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AirTipHintAnimationDrawable airTipHintAnimationDrawable = holder.f177182j;
        airTipHintAnimationDrawable.k = false;
        ValueAnimator valueAnimator = airTipHintAnimationDrawable.f55743r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        airTipHintAnimationDrawable.f55744s = -1.0f;
        airTipHintAnimationDrawable.f55743r = null;
        airTipHintAnimationDrawable.invalidateSelf();
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        AirTipHintAnimationDrawable airTipHintAnimationDrawable;
        Intrinsics.checkNotNullParameter(holder, "holder");
        b bVar = holder instanceof b ? (b) holder : null;
        if (bVar != null && (airTipHintAnimationDrawable = bVar.f177182j) != null) {
            airTipHintAnimationDrawable.k = false;
            ValueAnimator valueAnimator = airTipHintAnimationDrawable.f55743r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            airTipHintAnimationDrawable.f55744s = -1.0f;
            airTipHintAnimationDrawable.f55743r = null;
            airTipHintAnimationDrawable.invalidateSelf();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(b holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LargeActionButton largeActionButton = holder.f177181h;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof jp0.a)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        for (int i3 = 0; i3 < size2; i3++) {
            jp0.a aVar = (jp0.a) payloads.get(i3);
            zIsEmpty = zIsEmpty || aVar.f177177a;
            z = z || aVar.f177178b;
            z3 = z3 || aVar.f177179c;
            z11 = z11 || aVar.e;
            z4 = z4 || aVar.f;
            z6 = z6 || aVar.d;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f, yh5.b.a(data.f53691b), ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f177180g, data.f53692c, ty0.f.f275450a);
        }
        if (z3) {
            data.getClass();
            largeActionButton.setText((Clause) null);
            u.c(largeActionButton, null);
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.o(this, data, itemView);
        }
        if (zIsEmpty || z) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            pd.b.p(itemView2, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(data.f53691b, data.f53692c)));
        }
        if (z6 && data.d == null) {
            AirTipHintAnimationDrawable airTipHintAnimationDrawable = holder.f177182j;
            airTipHintAnimationDrawable.k = false;
            ValueAnimator valueAnimator = airTipHintAnimationDrawable.f55743r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            airTipHintAnimationDrawable.f55744s = -1.0f;
            airTipHintAnimationDrawable.f55743r = null;
            airTipHintAnimationDrawable.invalidateSelf();
        }
        fp0.p pVar = holder.i;
        data.getClass();
        py0.c cVar = new py0.c(data.f53691b);
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        m.a(view);
        view.setOnClickListener(new kt(data, cVar, this, data, 28));
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        pd.b.h(itemView3, true);
    }
}
