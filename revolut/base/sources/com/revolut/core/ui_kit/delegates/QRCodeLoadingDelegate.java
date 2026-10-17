package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.i70;
import ip0.j70;
import ip0.k70;
import ip0.l40;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/QRCodeLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/i70;", "Lip0/j70;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QRCodeLoadingDelegate extends BaseRecyclerViewDelegate<i70, j70> {
    public QRCodeLoadingDelegate() {
        super(R$layout.internal_delegate_qrcode_loading, new l40(18));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new j70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_qrcode_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(j70 holder, i70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f164801h;
        View view = holder.i;
        TextView textView2 = holder.f164800g;
        int i2 = k70.f164974a[data.f164654b.ordinal()];
        if (i2 == 1) {
            textView2.setVisibility(0);
            textView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = view.getContext();
            Intrinsics.h(context);
            int iK = kli.a.k(context, 228.0f);
            marginLayoutParams.width = iK;
            marginLayoutParams.height = iK;
            marginLayoutParams.setMargins(kli.a.k(context, 32.0f), kli.a.k(context, 32.0f), kli.a.k(context, 32.0f), kli.a.k(context, 16.0f));
            view.setLayoutParams(marginLayoutParams);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textView2.setVisibility(8);
            textView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Context context2 = view.getContext();
            Intrinsics.h(context2);
            int iK2 = kli.a.k(context2, 260.0f);
            int iK3 = kli.a.k(context2, 20.0f);
            marginLayoutParams2.width = iK2;
            marginLayoutParams2.height = iK2;
            marginLayoutParams2.setMargins(iK3, iK3, iK3, iK3);
            view.setLayoutParams(marginLayoutParams2);
        }
        ifk.b.r(holder.f);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
