package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a90;
import ip0.l40;
import ip0.y80;
import ip0.z80;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateNPSDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/y80;", "Lip0/a90;", "<init>", "()V", "Companion", "ip0/z80", "ip0/x80", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateNPSDelegate extends BaseRecyclerViewDelegate<y80, a90> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53144c;

    public RateNPSDelegate() {
        super(R$layout.internal_delegate_rate_nps, new l40(24));
        this.f53144c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a90(kotlin.jvm.internal.s.r(parent, this.f98535a), new in1.a(this, 5));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(a90 holder, y80 data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
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
            if (!(payloads.get(i2) instanceof z80)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z6 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z6;
            z3 = z;
            z4 = z3;
            for (int i3 = 0; i3 < size2; i3++) {
                z80 z80Var = (z80) payloads.get(i3);
                z6 |= z80Var.f167417a;
                z |= z80Var.f167418b;
                z3 |= z80Var.f167419c;
                z4 |= z80Var.d;
            }
        } else {
            z = z6;
            z3 = z;
            z4 = z3;
        }
        if (z6) {
            kli.a.b(holder.f163413g, data.f167280c, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f163414h, data.f167279b, ty0.f.f275450a);
        }
        if (z3) {
            Integer num = data.d;
            ArrayList arrayList = holder.i;
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((SmallActionButton) arrayList.get(i5)).i((num == null || i5 + 1 > num.intValue()) ? ms0.h4.SEMIACCENT : ms0.h4.ACCENT);
            }
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
