package com.revolut.core.ui_kit.delegates.chat;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatAttachmentListBubbleDelegate$AttachmentItem;", "Lkp0/n;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatAttachmentListItemDelegate extends BaseRecyclerViewDelegate<ChatAttachmentListBubbleDelegate.AttachmentItem, kp0.n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53805c;
    public final ihm.f d;

    public ChatAttachmentListItemDelegate() {
        super(R$id.chatAttachmentListItem_rootLayout, new x(4));
        this.f53805c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        et0.n nVar = new et0.n(context, null, 6, 0);
        nVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        nVar.setId(R$id.chatAttachmentListItem_rootLayout);
        TypedValue typedValue = new TypedValue();
        nVar.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        nVar.setBackgroundResource(typedValue.resourceId);
        nVar.setClickable(true);
        nVar.setFocusable(true);
        return new kp0.n(nVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(kp0.n holder, ChatAttachmentListBubbleDelegate.AttachmentItem data, int i, List payloads) {
        boolean z;
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
            if (!(payloads.get(i2) instanceof kp0.o)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z3 = list == null || list.isEmpty();
        if (payloads != null) {
            z = z3;
            for (kp0.o oVar : payloads) {
                z = z || oVar.f188046a || oVar.f188047b || oVar.f188048c;
            }
        } else {
            z = z3;
        }
        if (z3) {
            holder.f188041g = null;
        }
        holder.f.setOnClickListener(new kp0.l(this, data, 0));
        a2.a aVar = new a2.a(holder, 27, data, this);
        if (z) {
            aVar.invoke();
        }
        holder.f188042h.O(new kp0.m(holder, aVar, 0), zhm.v.l(data.k));
    }
}
