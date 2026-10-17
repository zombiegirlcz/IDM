package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import et0.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends koi.b implements fu0.i {
    public final z0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChatSwipeToReplyLayout f53980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fu0.j f53981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChatSwipeToReplyLayout itemView, z0 tableView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(tableView, "tableView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = tableView;
        this.f53980g = itemView;
        Context context = tableView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 8.0f);
        Context context2 = tableView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f53981h = new fu0.j(tableView, 0, iK, kli.a.l(context2, 12.0f));
    }

    @Override // fu0.i
    public final fu0.h getHighlightTarget() {
        koi.j jVar = this.e;
        ChatTableDelegate.Model model = jVar instanceof ChatTableDelegate.Model ? (ChatTableDelegate.Model) jVar : null;
        if (model != null && (model.f53908c instanceof gw0.k)) {
            return this.f53981h;
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new a61.a(itemView);
    }
}
