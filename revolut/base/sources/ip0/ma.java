package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ma extends com.revolut.core.ui_kit.delegates.chat.a {
    public final z4l.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f165340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FullScreenStateDelegate f165341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LargeActionButtonDelegate f165342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RowDelegate f165343s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(ChatSwipeToReplyLayout itemView, z4l.j innerAdapter, RecyclerView innerRv) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(innerAdapter, "innerAdapter");
        Intrinsics.checkNotNullParameter(innerRv, "innerRv");
        this.o = innerAdapter;
        this.f165340p = innerRv;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f165341q = fullScreenStateDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f165342r = largeActionButtonDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f165343s = rowDelegate;
        innerAdapter.f.b(zhm.v.k(fullScreenStateDelegate, largeActionButtonDelegate, new ListSubheaderDelegate(), rowDelegate, new RowLoadingDelegate()));
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f165340p;
    }
}
