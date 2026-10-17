package com.revolut.uicomponent.dialogs.delegate;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ss4.a0;
import syl.k;
import syl.l;
import syl.m;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/uicomponent/dialogs/delegate/DialogTextRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lsyl/m;", "Lsyl/k;", "syl/l", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class DialogTextRowDelegate extends BaseRecyclerViewDelegate<m, k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f107162c;

    public DialogTextRowDelegate(l lVar) {
        super(R$layout.delegate_dialog_text_row, new a0(29));
        this.f107162c = lVar;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new k(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(k holder, m data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(a.s(data.f266711c, context));
        textView.setText(data.f266710b);
        textView.setOnClickListener(new kp0.l(this, data, 21));
    }
}
