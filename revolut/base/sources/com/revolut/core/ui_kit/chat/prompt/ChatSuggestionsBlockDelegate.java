package com.revolut.core.ui_kit.chat.prompt;

import ag.q;
import an4.g;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import ap0.h;
import ap0.i;
import ap0.j;
import ap0.n;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ifm.c;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.a;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/chat/prompt/ChatSuggestionsBlockDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lap0/h;", "Lap0/j;", "<init>", "()V", "ap0/i", "ui_kit_chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatSuggestionsBlockDelegate extends BaseRecyclerViewDelegate<h, j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f51549c;

    public ChatSuggestionsBlockDelegate() {
        super(R$id.chatSuggestionsBlockDelegate, new g(22));
        this.f51549c = a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.h(context);
        n itemView = new n(context, null, 6, 0);
        itemView.setPaddingRelative(itemView.getPaddingStart(), kli.a.k(context, 20.0f), itemView.getPaddingEnd(), itemView.getPaddingBottom());
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new j(itemView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(j holder, h data, int i, List payloads) {
        AnimationRequest animationRequest;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        n nVarF = holder.F();
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof i)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            i iVar = (i) payloads.get(i3);
            zIsEmpty = zIsEmpty || iVar.f8033a;
            z = z || iVar.f8034b;
        }
        if (zIsEmpty) {
            nVarF.setSuggestions(data.f8031a);
        }
        if (z && (animationRequest = data.f8032b) != null && !animationRequest.f57724a) {
            animationRequest.f57724a = true;
            n nVarF2 = holder.F();
            OneShotPreDrawListener.add(nVarF2, new q(nVarF2, 1, holder));
        }
        c cVar = holder.f;
        if (cVar != null) {
            cVar.dispose();
        }
        holder.f = nVarF.f8043a.subscribe(new aoa.h(new an4.f(this, 17), 2));
    }
}
