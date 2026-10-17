package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0004\u0005\u0002\u0006\u0003¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ConditionalAmountDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/kc;", "Lip0/nc;", "ip0/mc", "ip0/jc", "ip0/lc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConditionalAmountDelegate extends BaseRecyclerViewDelegate<ip0.kc, ip0.nc> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c64.a f52116c;
    public final e01.a d;
    public final e01.a e;

    public ConditionalAmountDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new ip0.nc(linearLayout, this.f52116c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.nc holder, ip0.kc data, int i, List payloads) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ft0.r rVar = holder.f;
        ft0.r rVar2 = holder.f165490g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.lc)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z4 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z4;
            z3 = z;
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.lc lcVar = (ip0.lc) payloads.get(i3);
                z4 = z4 || lcVar.f165184a;
                z = z || lcVar.f165185b;
                z3 = z3 || lcVar.f165186c;
            }
        } else {
            z = z4;
            z3 = z;
        }
        if (z4) {
            Regex regex = ft0.n.f137766a;
            ip0.mc mcVar = data.f164990b;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rVar.setItems(ft0.n.a(mcVar, context));
        }
        if (z) {
            ip0.mc mcVar2 = data.f164991c;
            if (mcVar2 == null) {
                rVar2.setVisibility(8);
            } else {
                Regex regex2 = ft0.n.f137766a;
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                rVar2.setItems(ft0.n.a(mcVar2, context2));
                rVar2.setVisibility(0);
            }
        }
        if (z3) {
            rVar.setPosition(data.f164991c == null ? ft0.p.SINGLE : ft0.p.TOP);
        }
        this.d.a(rVar.b(), holder);
        this.e.a(rVar2.b(), holder);
    }

    public ConditionalAmountDelegate(c64.a aVar) {
        super(R$id.internal_conditional_amount_delegate_view_type, new ip0.lb(5));
        this.f52116c = aVar;
        this.d = new e01.a();
        this.e = new e01.a();
    }
}
