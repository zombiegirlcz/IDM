package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.sw;
import ip0.uw;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MapLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/sw;", "Lip0/uw;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapLoadingDelegate extends BaseRecyclerViewDelegate<sw, uw> {
    public MapLoadingDelegate() {
        super(R$layout.internal_delegate_map_loading, new fv(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new uw(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_map_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(uw holder, sw data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FrameLayout frameLayout = holder.f166733g;
        frameLayout.removeAllViews();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.b2 b2Var = new ms0.b2(context, null, 6, 0);
        int i2 = R$attr.uikit_colorGreyTone5;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        b2Var.setContent(new ms0.x1(new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), i2), null, null, ms0.z1.Marker40);
        b2Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(b2Var);
        holder.f.d(((c9.b) ((c9.b) ((c9.b) ((c9.b) new c9.b().i(true)).k(1000L)).j(1.0f)).l(0.5f)).c());
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
