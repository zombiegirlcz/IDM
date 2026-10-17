package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ka extends com.revolut.core.ui_kit.delegates.chat.a {
    public final z4l.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f164981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HeaderDelegate f164982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TrendViewDelegate f164983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FixedTabsDelegate f164984s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(ChatSwipeToReplyLayout itemView, z4l.j innerAdapter, RecyclerView innerRv) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(innerAdapter, "innerAdapter");
        Intrinsics.checkNotNullParameter(innerRv, "innerRv");
        this.o = innerAdapter;
        this.f164981p = innerRv;
        HeaderDelegate headerDelegate = new HeaderDelegate();
        this.f164982q = headerDelegate;
        TrendViewDelegate trendViewDelegate = new TrendViewDelegate(1000L);
        this.f164983r = trendViewDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.f164984s = fixedTabsDelegate;
        koi.c cVar = innerAdapter.f;
        cVar.a(headerDelegate);
        cVar.a(trendViewDelegate);
        cVar.a(fixedTabsDelegate);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f164981p;
    }
}
