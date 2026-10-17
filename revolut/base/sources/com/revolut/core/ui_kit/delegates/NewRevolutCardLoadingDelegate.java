package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.ky;
import ip0.ly;
import ip0.my;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewRevolutCardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ky;", "Lip0/ly;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewRevolutCardLoadingDelegate extends BaseRecyclerViewDelegate<ky, ly> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52818c;
    public final my d;

    public NewRevolutCardLoadingDelegate(int i) {
        super(R$layout.internal_delegate_new_revolut_card_loading, new fv(19));
        this.f52818c = i;
        this.d = new my();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ly lyVar = new ly(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_new_revolut_card_loading));
        ShimmerFrameLayout shimmerFrameLayout = lyVar.f;
        shimmerFrameLayout.setClipToOutline(true);
        shimmerFrameLayout.setOutlineProvider(this.d);
        ImageView imageView = lyVar.f165280g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.f52818c;
        layoutParams.width = i;
        imageView.getLayoutParams().height = (int) (i / 1.592f);
        return lyVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ly holder, ky data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f);
        yy0.f.e(or0.u.k(holder.f165280g).Q(), data.f165095b, holder.f165280g, null, null, 12);
        View view = holder.itemView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(data.e, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iW2 = kli.a.w(data.f165096c, context2);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iW3 = kli.a.w(data.f, context3);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view.setPadding(iW, iW2, iW3, kli.a.w(data.d, context4));
    }
}
