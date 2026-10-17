package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CountDownTimerCompactDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dd;", "Lip0/fd;", "<init>", "()V", "Companion", "ip0/ed", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountDownTimerCompactDelegate extends BaseRecyclerViewDelegate<ip0.dd, ip0.fd> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52156c;

    public CountDownTimerCompactDelegate() {
        super(R$layout.internal_delegate_count_down_timer_compact, new ip0.lb(10));
        this.f52156c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.fd(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.fd holder, ip0.dd data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        CountDownTimerView countDownTimerView = holder.f;
        countDownTimerView.setTimeExpiredListener(new i1d.b(this, data, 29));
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ed)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (ip0.ed edVar : payloads) {
            zIsEmpty = zIsEmpty || edVar.f164062b;
            z = z || edVar.f164063c;
            z3 = z3 || edVar.d;
            z4 = z4 || edVar.f164061a;
            z6 = z6 || edVar.e;
        }
        if (zIsEmpty) {
            countDownTimerView.setMode(data.f163875c);
        }
        if (z) {
            countDownTimerView.setLabels(data.d);
        }
        if (z3) {
            countDownTimerView.setTheme(data.e);
        }
        if (z4) {
            ip0.bd bdVar = data.f163874b;
            if (bdVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            countDownTimerView.setExpirationTime(Long.valueOf(bdVar.f163582a));
        }
        if (z6) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
