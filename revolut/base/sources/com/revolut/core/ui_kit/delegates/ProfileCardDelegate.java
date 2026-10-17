package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.ProfileCardView;
import ip0.d30;
import ip0.e30;
import ip0.ix;
import ip0.n30;
import ip0.o30;
import ip0.p30;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProfileCardDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/n30;", "Lip0/p30;", "<init>", "()V", "ip0/m30", "ip0/o30", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileCardDelegate extends BaseBoxRecyclerViewDelegate<n30, p30> {
    public final e01.a e;

    public ProfileCardDelegate() {
        super(R$id.internal_profile_card_delegate_type, true, new tz(24));
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProfileCardView profileCardView = new ProfileCardView(context, null, 6, 0);
        profileCardView.setId(R$id.internal_profile_card_delegate_id);
        return new p30(profileCardView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof p30) {
            this.e.c(holder);
        }
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(p30 holder, n30 data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ProfileCardView profileCardView = holder.f;
        int size = payloads.size();
        int i3 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof o30)) {
                payloads = null;
                break;
            }
            i5++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        int i6 = 0;
        while (true) {
            i2 = 1;
            if (i6 >= size2) {
                break;
            }
            zIsEmpty = zIsEmpty || ((o30) payloads.get(i6)).f165618a;
            i6++;
        }
        if (zIsEmpty) {
            profileCardView.setModel(data.f165451a);
        }
        efm.r rVarMergeArray = efm.r.mergeArray(profileCardView.v.map(new e30(new ip0.za(15), i2)), profileCardView.f58839w.map(new e30(new d30(data, i2), 2)), profileCardView.e().map(new e30(new ip0.za(16), 3)), profileCardView.f().map(new e30(new d30(data, i3), i3)), profileCardView.f58840x.map(new ix(28, new ip0.za(13))), profileCardView.f58841y.map(new ix(29, new ip0.za(14))));
        Intrinsics.h(rVarMergeArray);
        this.e.a(rVarMergeArray, holder);
    }
}
