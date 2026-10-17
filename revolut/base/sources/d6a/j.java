package d6a;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AvatarLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f111473a = new FullScreenStateDelegate();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButtonDelegate f111474b = new LargeActionButtonDelegate();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralContactDelegate f111475c = new ReferralContactDelegate();
    public final RowDelegate d = new RowDelegate(null, null, 7);
    public final TextDelegate e = new TextDelegate();
    public final VoucherSmallTileDelegate f = new VoucherSmallTileDelegate();

    public final List a() {
        return v.k(this.f111473a, this.f111474b, new GridBoxDelegate(v.k(new AvatarLoadingDelegate(), this.f111475c), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(v.k(new VoucherSmallLoadingDelegate(), this.f), false), this.d, this.e);
    }
}
