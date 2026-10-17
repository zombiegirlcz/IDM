package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.t30;
import ip0.tz;
import ip0.u30;
import ip0.v30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProfileItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/t30;", "Lip0/v30;", "<init>", "()V", "ip0/u30", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileItemDelegate extends BaseRecyclerViewDelegate<t30, v30> {
    public ProfileItemDelegate() {
        super(R$layout.internal_delegate_profile_item, new tz(26));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new v30(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(v30 holder, t30 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ProfileItemDelegate.ProfileItemModelPayload");
            u30 u30Var = (u30) obj2;
            zIsEmpty = zIsEmpty || u30Var.f166585a;
            z = z || u30Var.f166586b;
        }
        if (zIsEmpty) {
            Clause clause = data.f166428b;
            TextView topText = holder.f;
            Intrinsics.checkNotNullExpressionValue(topText, "topText");
            kli.a.b(topText, clause, ty0.f.f275450a);
        }
        if (z) {
            Clause clause2 = data.f166429c;
            TextView bottomText = holder.f166761g;
            Intrinsics.checkNotNullExpressionValue(bottomText, "bottomText");
            kli.a.b(bottomText, clause2, ty0.f.f275450a);
        }
    }
}
