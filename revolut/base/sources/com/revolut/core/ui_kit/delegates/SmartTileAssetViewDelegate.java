package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import aw0.l1;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ag0;
import ip0.bg0;
import ip0.cg0;
import ip0.je0;
import ip0.yf0;
import ip0.zf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewDelegate$Model;", "Lip0/cg0;", "<init>", "()V", "Companion", "Model", "ip0/bg0", "ip0/ag0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmartTileAssetViewDelegate extends BaseRecyclerViewDelegate<Model, cg0> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53401c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmartTileAssetViewDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CompositeClause f53403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AvatarModel f53404c;
        public final Clause d;
        public final Clause e;
        public final ag0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f53405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53406h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53407j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53408l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f53409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53410n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53411p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f53412q;

        public Model(String listId, CompositeClause caption, AvatarModel.Default r4, Clause title, Clause clause, ag0 ag0Var, Object obj2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(caption, "caption");
            Intrinsics.checkNotNullParameter(title, "title");
            int i = R$attr.uikit_dp16;
            this.f53402a = listId;
            this.f53403b = caption;
            this.f53404c = r4;
            this.d = title;
            this.e = clause;
            this.f = ag0Var;
            this.f53405g = obj2;
            this.f53406h = null;
            this.i = c.d.f249513a;
            this.f53407j = null;
            this.k = null;
            this.f53408l = null;
            this.f53409m = null;
            this.f53410n = i;
            this.o = i;
            this.f53411p = i;
            this.f53412q = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SmartTileAssetViewDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55191g() {
            return this.f53405g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55189b() {
            return this.f53402a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53402a.equals(model.f53402a) && this.f53403b.equals(model.f53403b) && Intrinsics.f(this.f53404c, model.f53404c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53405g, model.f53405g) && Intrinsics.f(this.f53406h, model.f53406h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53407j, model.f53407j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53408l, model.f53408l) && Intrinsics.f(this.f53409m, model.f53409m) && this.f53410n == model.f53410n && this.o == model.o && this.f53411p == model.f53411p && this.f53412q == model.f53412q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52304c() {
            return this.f53410n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53410n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f53406h;
        }

        public final int hashCode() {
            int iC = h30.l.c(this.f53403b, this.f53402a.hashCode() * 31, 31);
            AvatarModel avatarModel = this.f53404c;
            int iA = p.a.a((iC + (avatarModel == null ? 0 : avatarModel.hashCode())) * 31, 31, this.d);
            Clause clause = this.e;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            ag0 ag0Var = this.f;
            int iHashCode2 = (iHashCode + (ag0Var == null ? 0 : ag0Var.hashCode())) * 31;
            Object obj2 = this.f53405g;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53406h;
            int i = h30.l.i(this.i, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53407j;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53408l;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53409m;
            return Integer.hashCode(this.f53412q) + j6.a.b(this.f53411p, j6.a.b(this.o, j6.a.b(this.f53410n, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52307j() {
            return this.f53407j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52305g() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53408l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getD() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF() {
            return this.f53412q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f53409m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52306h() {
            return this.f53408l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53407j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53406h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getE() {
            return this.f53411p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53409m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            boolean zL = or0.b.l(this, (qv0.i) oldItem);
            Model model = (Model) oldItem;
            return new bg0(zL, !model.f53403b.equals(this.f53403b), !Intrinsics.f(model.f53404c, this.f53404c), !model.d.equals(this.d), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f));
        }
    }

    public static final class a {
        private a() {
        }
    }

    public SmartTileAssetViewDelegate() {
        super(R$layout.internal_delegate_smart_tile_asset, new je0(11));
        this.f53401c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new cg0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_smart_tile_asset));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(cg0 holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        String str;
        int iK;
        int iK2;
        float f;
        List<bg0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        AvatarView avatarView = holder.f163732g;
        AppCompatTextView appCompatTextView = holder.f163733h;
        LineChartView lineChartView = holder.k;
        LottieAnimationView lottieAnimationView = holder.f163735l;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof bg0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z12 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            boolean z29 = z12;
            boolean z31 = z29;
            boolean z41 = z31;
            boolean z49 = z41;
            boolean z54 = z49;
            for (bg0 bg0Var : payloads) {
                z12 = z12 || bg0Var.f163605a;
                z29 = z29 || bg0Var.f163606b;
                z31 = z31 || bg0Var.f163607c;
                z41 = z41 || bg0Var.d;
                z49 = z49 || bg0Var.e;
                z54 = z54 || bg0Var.f;
            }
            z6 = z49;
            z11 = z54;
            z3 = z31;
            z4 = z41;
            z = z29;
        } else {
            z = z12;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            str = "itemView";
            or0.b.c(this, data, itemView, true, null, 24);
        } else {
            str = "itemView";
        }
        if (z) {
            View view = holder.itemView;
            ty0.c.b(h30.l.x(view, str, view), data.f53403b, holder.f, null, null, 12);
        }
        if (z3) {
            avatarView.setVisibility(data.f53404c != null ? 0 : 8);
            AvatarModel avatarModel = data.f53404c;
            if (avatarModel != null) {
                avatarView.setModel(avatarModel);
            }
        }
        if (z4) {
            View view2 = holder.itemView;
            ty0.c.b(h30.l.x(view2, str, view2), data.d, holder.f163733h, null, null, 12);
        }
        if (z6) {
            kli.a.b(holder.i, data.e, ty0.f.f275450a);
        }
        if (z11) {
            ag0 ag0Var = data.f;
            if (ag0Var == null) {
                lottieAnimationView.setVisibility(8);
                lineChartView.setVisibility(8);
                Context context = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                f = 1.0f;
                iK2 = kli.a.k(context, BitmapDescriptorFactory.HUE_RED);
            } else {
                if (ag0Var instanceof yf0) {
                    lottieAnimationView.setVisibility(8);
                    lottieAnimationView.cancelAnimation();
                    lineChartView.setVisibility(0);
                    yf0 yf0Var = (yf0) ag0Var;
                    lineChartView.setChartItems(yf0Var.f167309a);
                    lineChartView.setColorScheme(yf0Var.f167310b);
                    lineChartView.setBaseline(yf0Var.f167311c);
                    lineChartView.setInterpolationStrategy(aw0.m1.a(new l1.c(4.0f), lineChartView));
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    lineChartView.setGraphLineWidth(kli.a.k(context2, 2.0f));
                    lineChartView.setYAxis(null);
                    Context context3 = appCompatTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    iK = kli.a.k(context3, 8.0f);
                } else {
                    if (!ag0Var.equals(zf0.f167457a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lineChartView.setVisibility(8);
                    lottieAnimationView.setVisibility(0);
                    yy0.f fVarQ = or0.u.k(lottieAnimationView).Q();
                    LottieAnimationView lottieAnimationView2 = holder.f163735l;
                    LottieSource.Companion companion = LottieSource.INSTANCE;
                    int i3 = R$raw.internal_lottie_chart_loading;
                    companion.getClass();
                    yy0.f.e(fVarQ, new LottieImage(dz0.a.a(companion, i3), (List) null, 126), lottieAnimationView2, null, null, 12);
                    Context context4 = appCompatTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    iK = kli.a.k(context4, 8.0f);
                }
                iK2 = iK;
                f = 0.5f;
            }
            holder.f163734j.setGuidelinePercent(f);
            or0.u.z(holder.f163733h, 0, 0, iK2, 0, false, 27);
            or0.u.z(holder.i, 0, 0, iK2, 0, false, 27);
        }
        View view3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, str);
        or0.m.a(view3);
        view3.setOnClickListener(new au0.t1(data, 19, this, data));
    }
}
