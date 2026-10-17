package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.t90;
import ip0.ya0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardsGridDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/te;", "Lcom/revolut/core/ui_kit/delegates/ue;", "<init>", "()V", "Companion", "ip0/ya0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsGridDelegate extends BaseRecyclerViewDelegate<te, ue> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RewardDelegate f53209c;

    public static final class a {
        private a() {
        }
    }

    public RewardsGridDelegate() {
        super(R$layout.internal_delegate_rewards_grid, new t90(10));
        this.f53209c = new RewardDelegate(2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ue(this, kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ue holder, te data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        z4l.j jVar = holder.f54832g;
        RecyclerView recyclerView = holder.f;
        if (payloads.isEmpty()) {
            recyclerView.setItemAnimator(data.f54777c ? new DefaultItemAnimator() : null);
            List rewards = data.f54776b;
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            jVar.c(rewards);
            or0.b.c(this, data, holder.f, false, null, 28);
            return;
        }
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RewardsGridDelegate.Payload");
            ya0 ya0Var = (ya0) obj2;
            if (ya0Var.f167292b) {
                recyclerView.setItemAnimator(data.f54777c ? new DefaultItemAnimator() : null);
            }
            if (ya0Var.f167291a) {
                List rewards2 = data.f54776b;
                Intrinsics.checkNotNullParameter(rewards2, "rewards");
                jVar.c(rewards2);
            }
            if (ya0Var.f167293c) {
                or0.b.c(this, data, holder.f, false, null, 28);
            }
        }
    }
}
