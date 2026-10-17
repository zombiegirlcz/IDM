package kp0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;
import ms0.r4;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 extends com.revolut.core.ui_kit.delegates.chat.a {
    public final r4 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r4 f188115p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ChatSwipeToReplyLayout itemView, r4 smartTileView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(smartTileView, "smartTileView");
        this.o = smartTileView;
        this.f188115p = smartTileView;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f188115p;
    }
}
