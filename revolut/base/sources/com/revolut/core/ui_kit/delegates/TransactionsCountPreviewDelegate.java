package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.nl0;
import ip0.ol0;
import ip0.ql0;
import ip0.ri0;
import ip0.rl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TransactionsCountPreviewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/nl0;", "Lcom/revolut/core/ui_kit/delegates/fi;", "<init>", "()V", "Companion", "ip0/ol0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsCountPreviewDelegate extends BaseRecyclerViewDelegate<nl0, fi> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53555c = R$attr.uikit_dp16;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TransactionsCountPreviewDelegate() {
        super(R$layout.internal_delegate_transactions_count_preview, new ri0(16));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fi(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_transactions_count_preview));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(fi holder, nl0 data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof ol0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zN = zN || ((ol0) payloads.get(i3)).f165677a;
            }
        }
        if (zN) {
            int i5 = data.f165533a;
            z4l.j jVar = holder.f;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(new rl0(a0.d.n("transactionSkeleton", i6), ql0.TRANSACTION));
            }
            int i21 = R$attr.uikit_dp0;
            yp0.b.k(arrayList, i21, i21, 0, 0, 28);
            rl0 rl0Var = new rl0("contentSkeleton0", ql0.CONTENT);
            yp0.b.l(rl0Var, f53555c, 0, 0, 0, null, false, 62);
            jVar.c(zhm.d0.F0(rl0Var, arrayList));
        }
    }
}
