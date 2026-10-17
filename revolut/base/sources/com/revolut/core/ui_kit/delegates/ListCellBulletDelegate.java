package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.tt;
import ip0.ut;
import ip0.vt;
import ip0.ws;
import ip0.wt;
import ip0.xt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListCellBulletDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ut;", "Lip0/wt;", "<init>", "()V", "ip0/vt", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListCellBulletDelegate extends BaseRecyclerViewDelegate<ut, wt> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52691c;
    public final ihm.f d;

    public ListCellBulletDelegate() {
        super(R$layout.internal_delegate_list_bullet_cell, new hq(21));
        this.f52691c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    public static void q(tt ttVar, TextView textView) {
        int i = xt.f167206a[ttVar.ordinal()];
        if (i == 1) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
            textView.setBackgroundResource(R$drawable.internal_circle_2dp_foreground);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(kli.a.s(R$attr.uikit_colorBackground, context2));
        textView.setBackgroundResource(com.revolut.core.ui_kit_resources.R$drawable.uikit_shape_circle);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wt(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_list_bullet_cell));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(wt holder, ut data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f167062g;
        TextView textView2 = holder.f;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f166724b, textView2, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 19), 8);
            textView.setText(String.valueOf(data.f166725c));
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            q(data.d, textView);
        } else {
            List list = payloads;
            ArrayList<vt> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ListCellBulletDelegate.Payload");
                arrayList.add((vt) obj2);
            }
            for (vt vtVar : arrayList) {
                if (vtVar.f166890a) {
                    or0.b.e(this, data.f166724b, textView2, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 18), 8);
                }
                if (vtVar.f166891b) {
                    textView.setText(String.valueOf(data.f166725c));
                }
                if (vtVar.f166892c) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
                if (vtVar.d) {
                    q(data.d, textView);
                }
            }
        }
        View view = holder.itemView;
        view.setClickable(data.e);
        if (data.e) {
            textView2.setMovementMethod(null);
            view.setOnClickListener(new ws(this, data, 1));
        } else {
            textView2.setMovementMethod(ix0.c0.f169220a);
            view.setOnClickListener(null);
        }
    }
}
