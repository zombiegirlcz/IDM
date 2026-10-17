package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FlexibleBarChartLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/yi;", "Lip0/aj;", "<init>", "()V", "Companion", "ip0/zi", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlexibleBarChartLoadingDelegate extends BaseRecyclerViewDelegate<ip0.yi, ip0.aj> {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public FlexibleBarChartLoadingDelegate() {
        super(R$layout.internal_delegate_flexible_bar_chart_loading, new ip0.zf(22));
    }

    public static void q(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = i;
        view.setLayoutParams(layoutParams2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.aj(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.aj holder, ip0.yi data, int i, List payloads) {
        int iK;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.zi)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z = list == null || list.isEmpty();
        boolean z3 = list == null || list.isEmpty();
        boolean z4 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.zi ziVar = (ip0.zi) payloads.get(i3);
                z = z || ziVar.f167469a;
                z3 = z3 || ziVar.f167470b;
                z4 = z4 || ziVar.f167471c;
            }
        }
        ShimmerFrameLayout shimmerFrameLayout = holder.f;
        AppCompatTextView appCompatTextView = holder.i;
        AppCompatTextView appCompatTextView2 = holder.f163457h;
        SmallActionButton smallActionButton = holder.f163456g;
        View view = holder.f163458j;
        ifk.b.r(shimmerFrameLayout);
        if (z) {
            if (data.f167317b) {
                smallActionButton.setVisibility(8);
                appCompatTextView2.setVisibility(8);
                appCompatTextView.setVisibility(8);
            } else {
                smallActionButton.setVisibility(0);
                smallActionButton.i(ms0.h4.WHITE_OR_BLACK);
                appCompatTextView2.setVisibility(0);
                appCompatTextView.setVisibility(0);
            }
        }
        if (z || z3) {
            aw0.d5 d5Var = data.f167318c;
            boolean z6 = data.f167317b;
            int i5 = ip0.bj.f163618a[d5Var.ordinal()];
            if (i5 == 1) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, z6 ? 200.0f : 176.0f);
            } else if (i5 == 2) {
                iK = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 280.0f);
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iK = 0;
            }
            q(iK, view);
            int iA = z6 ? 0 : com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 24.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null && marginLayoutParams.topMargin != iA) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = iA;
                view.setLayoutParams(marginLayoutParams2);
            }
            int i6 = d5Var == aw0.d5.MATCH_PARENT ? -1 : -2;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            q(i6, itemView);
            q(i6, holder.k);
        }
        if (z4) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        }
    }
}
