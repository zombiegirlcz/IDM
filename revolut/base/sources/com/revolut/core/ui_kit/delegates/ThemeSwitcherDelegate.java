package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ik0;
import ip0.jk0;
import ip0.kk0;
import ip0.lk0;
import ip0.mk0;
import ip0.nk0;
import ip0.ri0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ThemeSwitcherDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/jk0;", "Lip0/lk0;", "<init>", "()V", "ip0/ik0", "ip0/hk0", "ip0/kk0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeSwitcherDelegate extends BaseRecyclerViewDelegate<jk0, lk0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53542c;

    public ThemeSwitcherDelegate() {
        super(R$layout.internal_delegate_theme_switcher, new ri0(9));
        this.f53542c = v0.a.d("create(...)");
    }

    public static void q(lk0 lk0Var, ik0 ik0Var) {
        lk0Var.f165220l.setImageResource(R$drawable.uikit_icn_24_tick_unselected);
        ImageView imageView = lk0Var.f165221m;
        imageView.setImageResource(R$drawable.uikit_icn_24_tick_unselected);
        ImageView imageView2 = lk0Var.f165222n;
        imageView2.setImageResource(R$drawable.uikit_icn_24_tick_unselected);
        int i = mk0.f165396a[ik0Var.ordinal()];
        if (i == 1) {
            lk0Var.f165220l.setImageResource(R$drawable.uikit_icn_24_tick_selected);
        } else if (i == 2) {
            imageView.setImageResource(R$drawable.uikit_icn_24_tick_selected);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            imageView2.setImageResource(R$drawable.uikit_icn_24_tick_selected);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new lk0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_theme_switcher));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(lk0 holder, jk0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        LinearLayout linearLayout = holder.k;
        if (payloads.isEmpty()) {
            View view = holder.itemView;
            ty0.c cVarX = h30.l.x(view, "itemView", view);
            TextLocalisedClause textLocalisedClause = data.f164858b;
            boolean z = data.e;
            ty0.c.b(cVarX, textLocalisedClause, holder.f, null, null, 12);
            View view2 = holder.itemView;
            ty0.c.b(h30.l.x(view2, "itemView", view2), data.f164859c, holder.f165217g, null, null, 12);
            View view3 = holder.itemView;
            ty0.c.b(h30.l.x(view3, "itemView", view3), data.d, holder.f165218h, null, null, 12);
            linearLayout.setVisibility(z ? 0 : 8);
            holder.o.setVisibility(z ? 0 : 8);
            q(holder, data.f164857a);
        } else {
            List list = payloads;
            ArrayList<kk0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ThemeSwitcherDelegate.Payload");
                arrayList.add((kk0) obj2);
            }
            for (kk0 kk0Var : arrayList) {
                if (kk0Var.f165036b) {
                    View view4 = holder.itemView;
                    ty0.c.b(h30.l.x(view4, "itemView", view4), data.f164858b, holder.f, null, null, 12);
                }
                if (kk0Var.f165037c) {
                    View view5 = holder.itemView;
                    ty0.c.b(h30.l.x(view5, "itemView", view5), data.f164859c, holder.f165217g, null, null, 12);
                }
                if (kk0Var.d) {
                    View view6 = holder.itemView;
                    ty0.c.b(h30.l.x(view6, "itemView", view6), data.d, holder.f165218h, null, null, 12);
                }
                if (kk0Var.f165035a) {
                    q(holder, data.f164857a);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        TrackableItem.Companion companion = TrackableItem.INSTANCE;
        AnalyticsContext analyticsContext = data.f;
        companion.getClass();
        CustomTrackableComponent customTrackableComponentB = TrackableItem.Companion.b(this, analyticsContext);
        LinearLayout linearLayout2 = holder.i;
        py0.c cVar = new py0.c(data.f164858b);
        or0.m.a(linearLayout2);
        linearLayout2.setOnClickListener(new nk0(customTrackableComponentB, cVar, this, data, 0));
        CustomTrackableComponent customTrackableComponentB2 = TrackableItem.Companion.b(this, data.f164860g);
        LinearLayout linearLayout3 = holder.f165219j;
        py0.c cVar2 = new py0.c(data.f164859c);
        or0.m.a(linearLayout3);
        linearLayout3.setOnClickListener(new nk0(customTrackableComponentB2, cVar2, this, data, 1));
        CustomTrackableComponent customTrackableComponentB3 = TrackableItem.Companion.b(this, null);
        py0.c cVar3 = new py0.c(data.d);
        or0.m.a(linearLayout);
        linearLayout.setOnClickListener(new nk0(customTrackableComponentB3, cVar3, this, data, 2));
    }
}
