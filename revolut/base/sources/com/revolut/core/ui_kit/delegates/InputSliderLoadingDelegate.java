package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.br;
import ip0.cr;
import ip0.dr;
import ip0.er;
import ip0.fr;
import ip0.hq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputSliderLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/cr;", "Lip0/fr;", "<init>", "()V", "ip0/dr", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputSliderLoadingDelegate extends BaseRecyclerViewDelegate<cr, fr> {
    public InputSliderLoadingDelegate() {
        super(R$layout.internal_delegate_input_slider_loading, new hq(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fr(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(fr holder, cr data, int i, List payloads) {
        boolean z;
        float f;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof dr)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        if (list == null || list.isEmpty()) {
            z = true;
            break;
        }
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((dr) it8.next()).f163939a) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (list == null || list.isEmpty()) {
            z3 = true;
            break;
        }
        List list3 = payloads;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                if (((dr) it9.next()).f163940b) {
                    z3 = true;
                    break;
                }
            }
        }
        if (z) {
            br gravity = data.f163783b;
            Intrinsics.checkNotNullParameter(gravity, "gravity");
            int i3 = er.f164133a[gravity.ordinal()];
            if (i3 == 1) {
                f = 0.5f;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = BitmapDescriptorFactory.HUE_RED;
            }
            ConstraintLayout constraintLayout = holder.f164306h;
            ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
            constraintSetL.setHorizontalBias(holder.f.getId(), f);
            constraintSetL.setHorizontalBias(holder.f164305g.getId(), f);
            constraintSetL.applyTo(constraintLayout);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
