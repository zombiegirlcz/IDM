package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.views.IdDocumentView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.xp;
import ip0.yp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IdDocumentLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/xp;", "Lip0/yp;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdDocumentLoadingDelegate extends BaseRecyclerViewDelegate<xp, yp> {
    public IdDocumentLoadingDelegate() {
        super(R$layout.internal_delegate_id_document_loading, new dk(26));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_id_document_loading);
        UIKitConstraintLayout uIKitConstraintLayout = (UIKitConstraintLayout) viewR.findViewById(R$id.internalIdDocumentLoadingDelegate_view);
        IdDocumentView.INSTANCE.getClass();
        uIKitConstraintLayout.setAspectRatioConfig(IdDocumentView.E);
        yp ypVar = new yp(viewR);
        ShimmerFrameLayout shimmerFrameLayout = ypVar.f167344g;
        shimmerFrameLayout.setClipToOutline(true);
        shimmerFrameLayout.setOutlineProvider(new iv0.s(com.google.android.gms.internal.mlkit_vision_face.a.a(viewR, "getContext(...)", 12.0f), true));
        return ypVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(yp holder, xp data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f167344g);
        yy0.f.e(or0.u.k(holder.f).Q(), data.f167203a, holder.f, null, null, 12);
    }
}
