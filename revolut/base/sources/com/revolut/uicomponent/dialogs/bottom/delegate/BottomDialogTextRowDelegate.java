package com.revolut.uicomponent.dialogs.bottom.delegate;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ryd.l;
import ryl.g;
import ryl.h;
import w01.k;
import yhm.d;
import yy0.f;
import yyl.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/uicomponent/dialogs/bottom/delegate/BottomDialogTextRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lryl/h;", "Lryl/g;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class BottomDialogTextRowDelegate extends BaseRecyclerViewDelegate<h, g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f107160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDialogTextRowDelegate(b listener, f imageDisplayer) {
        super(R$layout.delegate_bottom_dialog_icon_text_selection_item, new l(8));
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f107160c = listener;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new g(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(g holder, h data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f258433g;
        ImageView imageView = holder.f;
        hx7.b.d(textView, data.f258437c);
        Integer num = data.f258436b;
        if (num != null) {
            imageView.setImageResource(num.intValue());
        } else {
            k.a(imageView);
        }
        holder.f258434h.setVisibility(8);
        holder.itemView.setOnClickListener(new kp0.l(this, data, 20));
    }
}
