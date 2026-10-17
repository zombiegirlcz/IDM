package kp0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ShimmerConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public gw0.l f188108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatImageView f188109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f188110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f188111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f188112t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ChatSwipeToReplyLayout itemView, ShimmerConstraintLayout contentView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.o = contentView;
        View viewFindViewById = contentView.findViewById(R$id.chatBubbleLoading_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f188109q = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = contentView.findViewById(R$id.chatBubbleLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f188110r = viewFindViewById2;
        View viewFindViewById3 = contentView.findViewById(R$id.chatBubbleLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f188111s = viewFindViewById3;
        View viewFindViewById4 = contentView.findViewById(R$id.chatBubbleLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f188112t = viewFindViewById4;
        io3.h.s(contentView);
        K(false, null);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }
}
