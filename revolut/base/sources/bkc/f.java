package bkc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements lgc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeVoucherTileDelegate f16352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VoucherSmallTileDelegate f16353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleActionButtonsBarDelegate f16354c;
    public final ListingTileDelegate d;
    public final ScrollerDelegate e;
    public final ScrollerBoxDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GridBoxDelegate f16355g;

    public f() {
        LargeVoucherTileDelegate largeVoucherTileDelegate = new LargeVoucherTileDelegate();
        this.f16352a = largeVoucherTileDelegate;
        SmallCardDelegate.INSTANCE.getClass();
        SmallCardDelegate smallCardDelegate = new SmallCardDelegate(SmallCardDelegate.f53351j);
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.f16353b = voucherSmallTileDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.f16354c = new CircleActionButtonsBarDelegate();
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.d = listingTileDelegate;
        this.e = new ScrollerDelegate(v.k(largeVoucherTileDelegate, smallCardDelegate, voucherSmallTileDelegate, listingTileDelegate, new SmallCardLoadingDelegate(null), new BigTileLoadingDelegate(), new VoucherSmallLoadingDelegate()), false);
        this.f = new ScrollerBoxDelegate(v.k(referralContactDelegate, new ListingTileLoadingDelegate()));
        this.f16355g = new GridBoxDelegate(u.c(referralContactDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
    }
}
