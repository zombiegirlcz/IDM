package feg;

import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RoomListingCardLoadingDelegate;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraLargeListingCardDelegate f134605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f134606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f134607c;

    public d() {
        ExtraLargeListingCardDelegate extraLargeListingCardDelegate = new ExtraLargeListingCardDelegate();
        this.f134605a = extraLargeListingCardDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f134606b = fullScreenStateDelegate;
        this.f134607c = v.k(extraLargeListingCardDelegate, fullScreenStateDelegate, new RoomListingCardLoadingDelegate());
    }
}
