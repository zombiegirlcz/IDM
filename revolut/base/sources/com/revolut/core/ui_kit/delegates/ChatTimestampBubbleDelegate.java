package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.chat.ChatTimestampBubbleView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTimestampBubbleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/sa;", "Lip0/ua;", "<init>", "()V", "ip0/ta", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTimestampBubbleDelegate extends BaseRecyclerViewDelegate<ip0.sa, ip0.ua> {
    public ChatTimestampBubbleDelegate() {
        super(R$layout.internal_delegate_chat_timestamp_bubble, new ip0.h8(21));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ua(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_chat_timestamp_bubble));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ua holder, ip0.sa data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.itemView;
        ChatTimestampBubbleView chatTimestampBubbleView = holder.f;
        Context context = view.getContext();
        FrameLayout frameLayout = holder.f166638g;
        Intrinsics.h(context);
        int i2 = data.i;
        TimeClause timeClause = data.f166327b;
        frameLayout.setPadding(kli.a.w(i2, context), kli.a.w(data.f166329g, context), kli.a.w(data.f166331j, context), kli.a.w(data.f166330h, context));
        if (payloads.isEmpty()) {
            chatTimestampBubbleView.setTitle(timeClause);
            return;
        }
        List list = payloads;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate.Payload");
            arrayList.add((ip0.ta) obj2);
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (((ip0.ta) it8.next()).f166491a) {
                chatTimestampBubbleView.setTitle(timeClause);
            }
        }
    }
}
