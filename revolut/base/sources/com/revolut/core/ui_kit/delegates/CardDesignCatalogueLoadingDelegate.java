package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CardDesignCatalogueLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/m5;", "Lip0/n5;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesignCatalogueLoadingDelegate extends BaseRecyclerViewDelegate<ip0.m5, ip0.n5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f51778c;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), kli.a.k(r0, 7.0f));
        }
    }

    public CardDesignCatalogueLoadingDelegate() {
        super(R$layout.internal_delegate_card_design_catalogue_loading, new ip0.g4(6));
        this.f51778c = new a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.n5 n5Var = new ip0.n5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_card_design_catalogue_loading));
        ShimmerFrameLayout shimmerFrameLayout = n5Var.f;
        shimmerFrameLayout.setClipToOutline(true);
        shimmerFrameLayout.setOutlineProvider(this.f51778c);
        return n5Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.n5 holder, ip0.m5 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f);
        View view = holder.itemView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(data.i, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iW2 = kli.a.w(data.f165315g, context2);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iW3 = kli.a.w(data.f165317j, context3);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view.setPadding(iW, iW2, iW3, kli.a.w(data.f165316h, context4));
    }
}
