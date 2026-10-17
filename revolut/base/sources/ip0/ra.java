package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ra extends com.revolut.core.ui_kit.delegates.chat.a {
    public final z4l.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f166151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ListSubheaderDelegate f166152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final VoucherSmallTileDelegate f166153r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(ChatSwipeToReplyLayout itemView, z4l.j innerAdapter, RecyclerView innerRv) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(innerAdapter, "innerAdapter");
        Intrinsics.checkNotNullParameter(innerRv, "innerRv");
        this.o = innerAdapter;
        this.f166151p = innerRv;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.f166152q = listSubheaderDelegate;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.f166153r = voucherSmallTileDelegate;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(zhm.u.c(voucherSmallTileDelegate), false);
        koi.c cVar = innerAdapter.f;
        cVar.a(listSubheaderDelegate);
        cVar.a(scrollerDelegate);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f166151p;
    }
}
