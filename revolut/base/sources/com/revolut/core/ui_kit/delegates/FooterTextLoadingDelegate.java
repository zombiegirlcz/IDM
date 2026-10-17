package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FooterTextLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ij;", "Lip0/kj;", "<init>", "()V", "Companion", "ip0/jj", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FooterTextLoadingDelegate extends BaseRecyclerViewDelegate<ip0.ij, ip0.kj> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52368c;
    public static final int d;
    public static final int e;
    public static final int f;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        int i = R$attr.uikit_dp0;
        f52368c = i;
        d = i;
        int i2 = R$attr.uikit_dp16;
        e = i2;
        f = i2;
    }

    public FooterTextLoadingDelegate() {
        super(R$layout.internal_delegate_footer_text_loading, new ip0.zf(25));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.kj kjVar = new ip0.kj(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_footer_text_loading));
        ShimmerLinearLayout shimmerLinearLayout = kjVar.f;
        Intrinsics.checkNotNullParameter(shimmerLinearLayout, "<this>");
        c9.e eVarB = yp0.a0.b();
        shimmerLinearLayout.f26156b.b(eVarB);
        if (eVarB.f22257n) {
            shimmerLinearLayout.setLayerType(2, shimmerLinearLayout.f26155a);
            return kjVar;
        }
        shimmerLinearLayout.setLayerType(0, null);
        return kjVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.kj holder, ip0.ij data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof ip0.jj)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        if (payloads != null) {
            for (ip0.jj jjVar : payloads) {
                zN = zN || jjVar.f164847a;
                zN2 = zN2 || jjVar.f164848b;
            }
        }
        if (zN) {
            ip0.hj style = data.f164700b;
            Intrinsics.checkNotNullParameter(style, "style");
            ShimmerLinearLayout shimmerLinearLayout = holder.f;
            style.getClass();
            shimmerLinearLayout.setGravity(1);
            holder.f165025g.setVisibility(8);
            holder.f165026h.setVisibility(0);
            holder.i.setVisibility(0);
        }
        if (zN2) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
