package com.revolut.core.ui_kit.delegates;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SimpleLimitProgressBarWithText;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.ke0;
import ip0.le0;
import ip0.me0;
import ip0.ne0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SimpleLimitProgressBarWithTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/le0;", "Lip0/ne0;", "<init>", "()V", "ip0/me0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleLimitProgressBarWithTextDelegate extends BaseRecyclerViewDelegate<le0, ne0> {
    public SimpleLimitProgressBarWithTextDelegate() {
        super(R$layout.internal_delegate_simple_limit_progress_bar_with_text, new je0(0));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ne0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_simple_limit_progress_bar_with_text));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ne0) {
            SimpleLimitProgressBarWithText simpleLimitProgressBarWithText = ((ne0) holder).f;
            AnimatorSet animatorSet = simpleLimitProgressBarWithText.f56383b.f56221s.f168682h;
            if (animatorSet != null) {
                animatorSet.end();
            }
            simpleLimitProgressBarWithText.f.clearAnimation();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ne0 holder, le0 data, int i, List list) {
        List<me0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        SimpleLimitProgressBarWithText simpleLimitProgressBarWithText = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof me0)) {
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
        for (me0 me0Var : payloads) {
            zIsEmpty = zIsEmpty || me0Var.f165368c;
            z = z || me0Var.f165366a;
            z3 = z3 || me0Var.f165367b;
        }
        if (zIsEmpty) {
            ke0 ke0Var = data.f165194c;
            float f = ke0Var.f165003b;
            float f4 = ke0Var.f165002a;
            aw0.d3 countDownColorStyle = ke0Var.f165004c;
            Intrinsics.checkNotNullParameter(countDownColorStyle, "countDownColorStyle");
            simpleLimitProgressBarWithText.setStyle(new ms0.b4(f4, f, 0L, countDownColorStyle, null, false));
        }
        if (z) {
            SimpleLimitProgressBarWithText.setTitle$default(simpleLimitProgressBarWithText, data.f165193b, false, 2, null);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
