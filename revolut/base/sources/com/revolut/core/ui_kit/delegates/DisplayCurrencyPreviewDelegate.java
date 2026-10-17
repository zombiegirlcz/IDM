package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DisplayCurrencyPreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ne;", "Lip0/pe;", "<init>", "()V", "ip0/oe", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisplayCurrencyPreviewDelegate extends BaseRecyclerViewDelegate<ip0.ne, ip0.pe> {
    public DisplayCurrencyPreviewDelegate() {
        super(R$layout.internal_delegate_display_currency_preview, new ip0.lb(21));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.pe(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_display_currency_preview));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.pe holder, ip0.ne data, int i, List payloads) {
        boolean z;
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
            if (!(payloads.get(i2) instanceof ip0.oe)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            boolean z3 = zN;
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.oe oeVar = (ip0.oe) payloads.get(i3);
                zN = zN || oeVar.f165655a;
                z3 = z3 || oeVar.f165656b;
            }
            z = zN;
            zN = z3;
        } else {
            z = zN;
        }
        if (zN) {
            holder.f.setText(data.f165498a, !z);
        }
    }
}
