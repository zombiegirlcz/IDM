package com.revolut.uicomponent.dialogs.bottom.delegate;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ryd.l;
import ryl.e;
import ryl.f;
import yhm.d;
import yyl.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/uicomponent/dialogs/bottom/delegate/BottomDialogTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lryl/f;", "Lryl/e;", "Companion", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class BottomDialogTextDelegate extends BaseRecyclerViewDelegate<f, e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f107159c;

    public BottomDialogTextDelegate(b bVar) {
        super(R$layout.delegate_bottom_dialog_title, new l(7));
        this.f107159c = bVar;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new e(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(e holder, f data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f;
        hx7.b.d(textView, data.f258431b);
        if (this.f107159c != null) {
            textView.setOnClickListener(new kp0.l(this, data, 19));
        }
    }
}
