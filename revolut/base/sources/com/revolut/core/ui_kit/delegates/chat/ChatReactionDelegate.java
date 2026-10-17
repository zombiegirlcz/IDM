package com.revolut.core.ui_kit.delegates.chat;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import et0.f0;
import ip0.g0;
import java.util.Iterator;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.v0;
import kp0.w0;
import kp0.x0;
import zhm.c0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatReactionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lkp0/v0;", "Lkp0/x0;", "<init>", "()V", "kp0/w0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatReactionDelegate extends BaseRecyclerViewDelegate<v0, x0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53891c;
    public final ihm.f d;

    public ChatReactionDelegate() {
        super(R$layout.internal_delegate_chat_reaction, new x(12));
        this.f53891c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new x0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_chat_reaction));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((x0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((x0) bVar, i, list);
    }

    public final void p(x0 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.u.k(itemView).Q();
            throw null;
        }
        Iterator it8 = c0.N(payloads, w0.class).iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        TextView textView = holder.f188113g;
        ImageView imageView = holder.f;
        textView.setMovementMethod(ix0.c0.f169220a);
        imageView.setOnClickListener(new g0(this, 13));
        imageView.setOnLongClickListener(new f0(this, 1));
        et0.f.a(imageView);
    }
}
