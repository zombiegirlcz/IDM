package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.jd0;
import ip0.kd0;
import ip0.md0;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SegmentedLinearGaugeDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/jd0;", "Lip0/md0;", "<init>", "()V", "ip0/kd0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedLinearGaugeDelegate extends BaseBoxRecyclerViewDelegate<jd0, md0> {
    public SegmentedLinearGaugeDelegate() {
        super(R$layout.internal_delegate_segmented_linear_gauge, false, new t90(25));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new md0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_segmented_linear_gauge));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(md0 holder, jd0 model, int i, List payloads) {
        float f;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, payloads);
        AppCompatTextView appCompatTextView = holder.f165361g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof kd0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (int i3 = 0; i3 < size2; i3++) {
            kd0 kd0Var = (kd0) payloads.get(i3);
            zIsEmpty = zIsEmpty || kd0Var.f164996a;
            z = z || kd0Var.f164997b;
            z3 = z3 || kd0Var.f164998c;
        }
        if (zIsEmpty || z) {
            holder.f.setProgresses(model.f164821b, Float.valueOf(model.f164822c));
        }
        if (z || z3) {
            Intrinsics.checkNotNullParameter(model, "model");
            CompositeClause compositeClause = model.d;
            float f4 = model.f164822c;
            if (f4 <= 0.33f) {
                appCompatTextView.setGravity(8388611);
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (f4 > 0.66f) {
                appCompatTextView.setGravity(8388613);
                f = 1.0f;
            } else {
                appCompatTextView.setGravity(1);
                f = 0.5f;
            }
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            if (((ConstraintLayout.LayoutParams) layoutParams).horizontalBias != f) {
                ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                layoutParams3.horizontalBias = f;
                appCompatTextView.setLayoutParams(layoutParams3);
            }
        }
        if (z3) {
            kli.a.b(appCompatTextView, model.d, ty0.f.f275450a);
        }
    }
}
