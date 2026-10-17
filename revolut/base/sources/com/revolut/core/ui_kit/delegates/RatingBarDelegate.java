package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.l40;
import ip0.o90;
import ip0.p90;
import ip0.q90;
import ip0.s90;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RatingBarDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/p90;", "Lip0/s90;", "<init>", "()V", "ip0/q90", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class RatingBarDelegate extends BaseBoxRecyclerViewDelegate<p90, s90> {
    public RatingBarDelegate() {
        super(R$layout.internal_delegate_rating_bar, false, new l40(29));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new s90(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_rating_bar));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(s90 holder, p90 data, int i, List payloads) {
        Integer numValueOf;
        float f;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        LinearGaugeChartView linearGaugeChartView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof q90)) {
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
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i3 = 0; i3 < size2; i3++) {
            q90 q90Var = (q90) payloads.get(i3);
            z = z || q90Var.f165942a;
            z6 = z6 || q90Var.f165943b;
            zIsEmpty = zIsEmpty || q90Var.f165944c;
            z3 = z3 || q90Var.d;
            z4 = z4 || q90Var.e;
        }
        if (zIsEmpty || z3 || z4) {
            int i5 = data.d;
            Integer num = data.e;
            int i6 = data.f;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i5, context);
            if (num != null) {
                int iIntValue = num.intValue();
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                numValueOf = Integer.valueOf(kli.a.s(iIntValue, context2));
            } else {
                numValueOf = null;
            }
            Context context3 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            linearGaugeChartView.setModel(new com.revolut.core.ui_kit.internal.views.e(zhm.u.c(new ms0.q1(iS, kli.a.s(i6, context3), numValueOf)), false, 30));
        }
        if (z || z6) {
            float f4 = data.f165791b;
            o90 o90Var = data.f165792c;
            Float fValueOf = o90Var != null ? Float.valueOf(o90Var.f165638a) : null;
            AppCompatTextView appCompatTextView = holder.f166325g;
            linearGaugeChartView.setProgresses(f4, fValueOf);
            if (o90Var != null) {
                float f5 = o90Var.f165638a;
                if (f5 <= 0.33f) {
                    appCompatTextView.setGravity(8388611);
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (f5 > 0.66f) {
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
            kli.a.b(appCompatTextView, o90Var != null ? o90Var.f165639b : null, ty0.f.f275450a);
        }
    }
}
