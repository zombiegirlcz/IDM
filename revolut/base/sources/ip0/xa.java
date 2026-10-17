package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xa extends com.revolut.core.ui_kit.delegates.chat.a {
    public final z4l.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f167117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SmallActionButtonDelegate f167118q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(ChatSwipeToReplyLayout itemView, z4l.j innerAdapter, RecyclerView innerRv) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(innerAdapter, "innerAdapter");
        Intrinsics.checkNotNullParameter(innerRv, "innerRv");
        this.o = innerAdapter;
        this.f167117p = innerRv;
        RoomPreviewCardDelegate roomPreviewCardDelegate = new RoomPreviewCardDelegate();
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        this.f167118q = smallActionButtonDelegate;
        koi.c cVar = innerAdapter.f;
        cVar.a(roomPreviewCardDelegate);
        cVar.a(smallActionButtonDelegate);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f167117p;
    }
}
