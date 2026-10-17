package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.qe0;
import ip0.re0;
import ip0.se0;
import ip0.te0;
import ip0.ue0;
import ip0.ve0;
import ip0.we0;
import ip0.xe0;
import ip0.ye0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SimpleMediaDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/we0;", "Lip0/ye0;", "<init>", "()V", "ip0/xe0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleMediaDelegate extends BaseRecyclerViewDelegate<we0, ye0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53322c;

    public SimpleMediaDelegate() {
        super(R$layout.internal_delegate_simple_media, new je0(2));
        this.f53322c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ye0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_simple_media));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ye0 holder, we0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UiKitMediaView uiKitMediaView = holder.f167308g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof xe0)) {
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
        for (xe0 xe0Var : payloads) {
            zIsEmpty = zIsEmpty || xe0Var.f167149a;
            z = z || xe0Var.f167150b;
        }
        if (zIsEmpty) {
            ve0 ve0Var = data.f166995a;
            if (ve0Var instanceof qe0) {
                qe0 qe0Var = (qe0) ve0Var;
                int iK = qe0Var.f165970b;
                if (iK > 0) {
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    iK = kli.a.k(context, iK);
                }
                uiKitMediaView.setSizeAspectRatio(null);
                or0.u.w(iK, uiKitMediaView.i());
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ((jz0.b) jh.d.f(context2).a0()).b(qe0Var.f165969a, uiKitMediaView, null);
            } else {
                if (!(ve0Var instanceof ue0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ue0 ue0Var = (ue0) ve0Var;
                te0 te0Var = ue0Var.f166649b;
                if (te0Var instanceof re0) {
                    re0 re0Var = (re0) te0Var;
                    uiKitMediaView.setSizeAspectRatio(new aw0.d0(re0Var.f166169b, re0Var.f166168a));
                    uiKitMediaView.setVideoPlayerSize(null);
                } else {
                    if (!(te0Var instanceof se0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uiKitMediaView.setSizeAspectRatio(null);
                    uiKitMediaView.setVideoPlayerSize(Float.valueOf(((se0) te0Var).f166344a));
                }
                UiKitPlayerView uiKitPlayerViewJ = uiKitMediaView.j();
                ViewGroup.LayoutParams layoutParams = uiKitPlayerViewJ.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 17;
                uiKitPlayerViewJ.setLayoutParams(layoutParams2);
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ((jz0.b) jh.d.f(context3).a0()).b(ue0Var.f166648a, uiKitMediaView, null);
            }
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        holder.itemView.setOnClickListener(new ip0.g0(this, 6));
    }
}
