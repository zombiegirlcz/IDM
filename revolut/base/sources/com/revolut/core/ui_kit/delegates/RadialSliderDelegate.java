package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.slider.RadialSliderView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.l40;
import ip0.o70;
import ip0.p70;
import ip0.q70;
import ip0.w10;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RadialSliderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/p70;", "Lip0/q70;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RadialSliderDelegate extends BaseRecyclerViewDelegate<p70, q70> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53138c;

    public RadialSliderDelegate() {
        super(R$layout.internal_delegate_radial_slider, new l40(20));
        this.f53138c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new q70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_radial_slider));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(q70 holder, p70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        RadialSliderView radialSliderView = holder.f;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.o(this, data, itemView);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof o70) {
                zN = zN || ((o70) next).f165632a;
                zN2 = zN2 || ((o70) next).f165633b;
            }
        }
        if (zN) {
            radialSliderView.setMultiplier(data.f165780b);
        }
        if (zN2) {
            radialSliderView.setZeroSelectable(false);
        }
        radialSliderView.setMultiplierChangeListener(new w10(this, 7));
    }
}
