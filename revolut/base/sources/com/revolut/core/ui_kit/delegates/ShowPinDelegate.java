package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fe0;
import ip0.ge0;
import ip0.he0;
import ip0.t90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ShowPinDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fe0;", "Lip0/he0;", "<init>", "()V", "ip0/ge0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShowPinDelegate extends BaseRecyclerViewDelegate<fe0, he0> {
    public ShowPinDelegate() {
        super(R$layout.internal_delegate_show_pin, new t90(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new he0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_show_pin));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(he0 holder, fe0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        AppCompatTextView appCompatTextView = holder.f;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f164244a, appCompatTextView, null, 12);
            Intrinsics.checkNotNullParameter(data, "data");
            Context context = holder.itemView.getContext();
            View view = holder.itemView;
            Intrinsics.h(context);
            view.setPadding(kli.a.w(data.d, context), kli.a.w(data.f164245b, context), kli.a.w(data.e, context), kli.a.w(data.f164246c, context));
            return;
        }
        List list = payloads;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ShowPinDelegate.Payload");
            arrayList.add((ge0) obj2);
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (((ge0) it8.next()).f164402a) {
                or0.b.e(this, data.f164244a, appCompatTextView, null, 12);
            }
        }
    }
}
