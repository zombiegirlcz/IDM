package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.slider.SliderTitledView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ef0;
import ip0.ff0;
import ip0.gf0;
import ip0.je0;
import ip0.wk;
import ip0.ws;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SliderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ef0;", "Lip0/gf0;", "<init>", "()V", "ip0/ff0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SliderDelegate extends BaseRecyclerViewDelegate<ef0, gf0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53335c;
    public final ihm.f d;

    public SliderDelegate() {
        super(R$layout.internal_delegate_slider, new je0(5));
        this.f53335c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new gf0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(gf0 holder, ef0 data, int i, List payloads) {
        ff0 ff0Var;
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f164410g;
        TextView textView2 = holder.f;
        textView2.setOnClickListener(new ws(this, data, 21));
        SliderTitledView sliderTitledView = holder.f164411h;
        sliderTitledView.setOnValueChangeListener(new wk(this, data, 10));
        if (payloads.isEmpty()) {
            sliderTitledView.setStickyDistancePercentage(data.f164087n);
            sliderTitledView.setPointDecorator(data.f164083h);
            sliderTitledView.setRange(0, data.d);
            sliderTitledView.setStickyValues(data.f);
            sliderTitledView.setValue(data.e);
            sliderTitledView.setEnabled(data.f164082g);
            sliderTitledView.setStartLabel(data.f164081c);
            sliderTitledView.setEndLabel(data.f164080b);
            sliderTitledView.setVisibility(data.k ? 0 : 8);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            Integer num = data.f164085l;
            if (num != null) {
                textView.setLines(num.intValue());
            }
            or0.b.e(this, data.i, textView2, null, 12);
            or0.b.e(this, data.f164084j, textView, null, 12);
            return;
        }
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.SliderDelegate.Payload");
            ff0 ff0Var2 = (ff0) obj2;
            boolean z3 = ff0Var2.f164254h;
            if (ff0Var2.k) {
                sliderTitledView.setVisibility(data.k ? 0 : 8);
                sliderTitledView.getParent().requestLayout();
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                z = z3;
                ff0Var = ff0Var2;
                or0.b.c(this, data, itemView2, false, null, 28);
            } else {
                ff0Var = ff0Var2;
                z = z3;
            }
            if (ff0Var.i) {
                or0.b.e(this, data.i, textView2, null, 12);
            }
            if (ff0Var.f164255j) {
                or0.b.e(this, data.f164084j, textView, null, 12);
            }
            if (ff0Var.f164256l) {
                sliderTitledView.setStickyDistancePercentage(data.f164087n);
            }
            if (ff0Var.e || ff0Var.f) {
                data.getClass();
                sliderTitledView.setRange(0, data.d);
            }
            if (z) {
                sliderTitledView.setPointDecorator(data.f164083h);
            }
            if (ff0Var.f164251b || z) {
                sliderTitledView.setStickyValues(data.f);
            }
            if (ff0Var.f164250a) {
                sliderTitledView.setValue(data.e);
            }
            if (ff0Var.f164253g) {
                sliderTitledView.setEnabled(data.f164082g);
            }
            if (ff0Var.f164252c) {
                sliderTitledView.setStartLabel(data.f164081c);
            }
            if (ff0Var.d) {
                sliderTitledView.setEndLabel(data.f164080b);
            }
        }
    }
}
