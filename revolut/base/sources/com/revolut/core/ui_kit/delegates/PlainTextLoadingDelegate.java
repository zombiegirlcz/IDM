package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.p10;
import ip0.q10;
import ip0.r10;
import ip0.s10;
import ip0.t10;
import ip0.tz;
import ip0.u10;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlainTextLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/t10;", "Lip0/u10;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlainTextLoadingDelegate extends BaseRecyclerViewDelegate<t10, u10> {
    public PlainTextLoadingDelegate() {
        super(R$layout.internal_delegate_plain_text_loading, new tz(14));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new u10(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_plain_text_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(u10 holder, t10 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        knm.b.z(holder.f, data.f166416b.a(), null, 14);
        View view = holder.f166576g;
        s10 s10Var = data.f166416b;
        s10Var.getClass();
        knm.b.z(view, true, null, 14);
        knm.b.z(holder.f166577h, s10Var.c(), null, 14);
        knm.b.z(holder.i, s10Var.b(), null, 14);
        if (s10Var instanceof p10) {
            or0.u.z(holder.f166576g, 0, foh.i.j(16), 0, 0, false, 29);
        } else if (s10Var instanceof r10) {
            or0.u.z(holder.f166576g, 0, foh.i.j(16), 0, 0, false, 29);
        } else {
            if (!(s10Var instanceof q10)) {
                throw new NoWhenBranchMatchedException();
            }
            or0.u.z(holder.f166576g, 0, 0, 0, 0, false, 29);
        }
    }
}
