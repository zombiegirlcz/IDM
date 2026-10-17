package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LimitProgressBarWithChartHeader;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.ct;
import ip0.dt;
import ip0.et;
import ip0.ft;
import ip0.gt;
import ip0.hq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LimitProgressBarWithTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dt;", "Lip0/gt;", "<init>", "()V", "ip0/et", "ip0/ft", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitProgressBarWithTextDelegate extends BaseRecyclerViewDelegate<dt, gt> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f52641c;
    public final e01.a d;
    public final e01.a e;

    public LimitProgressBarWithTextDelegate() {
        super(R$layout.internal_delegate_limit_progress_bar_with_text, new hq(16));
        this.f52641c = yhm.j.c(yhm.k.NONE, new il9.p(19));
        this.d = new e01.a();
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new gt(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_limit_progress_bar_with_text));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(gt holder, dt data, int i, List list) {
        List<et> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LimitProgressBarWithChartHeader limitProgressBarWithChartHeader = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof et)) {
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
        for (et etVar : payloads) {
            zIsEmpty = zIsEmpty || etVar.f164151g;
            z = z || etVar.f;
            z3 = z3 || etVar.f164148a;
            z4 = z4 || etVar.f164149b;
            z6 = z6 || etVar.f164150c;
            z11 = z11 || etVar.d;
            z12 = z12 || etVar.e;
        }
        if (zIsEmpty) {
            limitProgressBarWithChartHeader.setDataChangeAnimationRequest(data.k);
        }
        if (z) {
            limitProgressBarWithChartHeader.setProgress(data.f163943c);
        }
        if (z3) {
            limitProgressBarWithChartHeader.setHeader(data.f163942b);
        }
        if (z4) {
            limitProgressBarWithChartHeader.setLabel(data.d);
        }
        if (z6) {
            limitProgressBarWithChartHeader.setBottomDescription(data.e, new i4g.g(1, (ihm.f) this.f52641c.getValue(), ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 17));
        }
        if (z11) {
            limitProgressBarWithChartHeader.setEnabled(data.f == ft.ENABLED);
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        efm.r map = limitProgressBarWithChartHeader.f56228h.b().map(new ao(27, new ct(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, holder);
        efm.r map2 = limitProgressBarWithChartHeader.f56227g.d.map(new ao(28, new ct(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.e.a(map2, holder);
    }
}
