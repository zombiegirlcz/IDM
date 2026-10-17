package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatMessagesLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/oa;", "Lft0/m;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatMessagesLoadingDelegate extends BaseRecyclerViewDelegate<ip0.oa, ft0.m> {
    public ChatMessagesLoadingDelegate() {
        super(R$layout.internal_delegate_chat_messages_loading, new ip0.h8(18));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_chat_messages_loading);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ft0.m mVar = new ft0.m(itemView);
        View viewFindViewById = itemView.findViewById(R$id.chatMessagesLoading_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        yy0.f.e(or0.u.k(itemView).Q(), new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorGreyTone50)), (AppCompatImageView) viewFindViewById, null, null, 12);
        return mVar;
    }
}
