package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0002\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CandleStickGraphDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/g5;", "Lip0/h5;", "ip0/e5", "ip0/i5", "ip0/f5", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CandleStickGraphDelegate extends BaseRecyclerViewDelegate<ip0.g5, ip0.h5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs0.c f51766c;
    public final ihm.b d;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate$a$a, reason: collision with other inner class name */
        public static final class C0396a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0396a f51767a = new C0396a();

            private C0396a() {
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CandleStickGraphDelegate(Clause open, Clause close, Clause high, Clause low, Clause volume, Clause change) {
        super(R$layout.internal_candle_stick_chart_layout, new ip0.g4(4));
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(volume, "volume");
        Intrinsics.checkNotNullParameter(change, "change");
        this.f51766c = new rs0.c(open, close, high, low, volume, change);
        ihm.b bVarE = ihm.b.e(a.C0396a.f51767a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.h5 h5Var = new ip0.h5(kotlin.jvm.internal.s.r(parent, this.f98535a));
        h5Var.f.setCandleSelectedCallback(new ijg.c(this, h5Var, 25));
        return h5Var;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.h5 holder, ip0.g5 data, int i, List payloads) {
        rs0.i iVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        LottieAnimationView lottieAnimationView = holder.f164507g;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        CandleSticksView candleSticksView = holder.f;
        candleSticksView.setDataChangeAnimationRequest(data.f164347p);
        candleSticksView.setCompressGraph(data.f164340c);
        candleSticksView.setShowVolume(false);
        candleSticksView.setSelectedCandleFormat(data.d);
        ip0.e5 e5Var = data.e;
        candleSticksView.setVerticalLineData(e5Var != null ? new rs0.e(e5Var.f164022b, e5Var.f164021a) : null);
        ip0.i5 i5Var = data.f;
        if (i5Var != null) {
            List<ip0.f5> list = i5Var.f164640a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (ip0.f5 f5Var : list) {
                arrayList.add(new rs0.f(f5Var.f164192b, f5Var.f164191a));
            }
            iVar = new rs0.i(arrayList, i5Var.f164641b);
        } else {
            iVar = null;
        }
        candleSticksView.setYAxis(iVar);
        candleSticksView.setContentDescription((Clause) null);
        candleSticksView.setCopies(this.f51766c);
        aw0.z8 z8Var = data.f164339b;
        if (z8Var == null || z8Var.f10648c.isEmpty()) {
            candleSticksView.setPlotData(z8Var);
            candleSticksView.setVisibility(8);
            lottieAnimationView.setVisibility(0);
        } else {
            candleSticksView.setPlotData(z8Var);
            candleSticksView.setVisibility(0);
            lottieAnimationView.setVisibility(8);
        }
    }
}
