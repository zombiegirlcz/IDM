package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.l40;
import ip0.q60;
import ip0.r60;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptContentLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/q60;", "Lip0/r60;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptContentLoadingDelegate extends BaseRecyclerViewDelegate<q60, r60> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53078c;

    public PromptContentLoadingDelegate() {
        super(R$layout.internal_delegate_prompt_content_loading, new l40(13));
        this.f53078c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r60(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(r60 holder, q60 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        BasicNavBar basicNavBar = holder.f;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        efm.r map = basicNavBar.f59211b.map(new e30(new w10(data, 4), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53078c.a(map, holder);
        View view = holder.itemView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
    }
}
