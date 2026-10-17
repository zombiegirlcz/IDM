package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.trend.TrendPreviewView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.am0;
import ip0.cm0;
import ip0.ri0;
import ip0.ws;
import ip0.zl0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TrendPreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/zl0;", "Lip0/cm0;", "<init>", "()V", "Companion", "ip0/am0", "ip0/bm0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrendPreviewDelegate extends BaseRecyclerViewDelegate<zl0, cm0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53560c;

    public TrendPreviewDelegate() {
        super(R$layout.internal_delegate_trend_preview, new ri0(20));
        this.f53560c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new cm0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(cm0 holder, zl0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f163761g;
        TextView textView2 = holder.f;
        TrendPreviewView trendPreviewView = holder.f163762h;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f167486b, textView2, null, 12);
            or0.b.e(this, data.f167487c, textView, null, 12);
            trendPreviewView.setItems(data.d);
            trendPreviewView.setChartColor(data.e);
            trendPreviewView.setFillFraction(data.f);
            trendPreviewView.setBaseline(data.f167488g);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            for (Object obj2 : payloads) {
                if (!(obj2 instanceof am0)) {
                    throw new IllegalArgumentException(v0.a.g(obj2, "payload has wrong type: ").toString());
                }
                am0 am0Var = (am0) obj2;
                if (am0Var.f163468a) {
                    or0.b.e(this, data.f167486b, textView2, null, 12);
                }
                if (am0Var.f163469b) {
                    or0.b.e(this, data.f167487c, textView, null, 12);
                }
                if (am0Var.f163470c) {
                    trendPreviewView.setItems(data.d);
                }
                if (am0Var.e) {
                    trendPreviewView.setChartColor(data.e);
                }
                if (am0Var.f163471g) {
                    trendPreviewView.setBaseline(data.f167488g);
                }
                if (am0Var.f) {
                    trendPreviewView.setFillFraction(data.f);
                }
                if (am0Var.d) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        holder.itemView.setOnClickListener(new ws(this, data, 27));
    }
}
