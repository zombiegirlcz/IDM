package czi;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CdnImage f110259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CdnImage f110260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CdnImage f110261c;
    public static final UrlImage d;
    public static final UrlImage e;

    static {
        UrlImageDrawable.Shimmering.Companion companion = UrlImageDrawable.Shimmering.INSTANCE;
        f110259a = new CdnImage("placeholder", "mobile/lounges/details", null, null, companion, null, Constants.TAG_OS_VERSION);
        new CdnImage("tile_classic_rev10", "mobile/lounges/pass", null, null, companion, null, Constants.TAG_OS_VERSION);
        new CdnImage("tile_unlimited_rev10", "mobile/lounges/pass", null, null, companion, null, Constants.TAG_OS_VERSION);
        f110260b = new CdnImage("logo_v2_light", "mobile/lounges/dp", null, null, companion, null, Constants.TAG_OS_VERSION);
        f110261c = new CdnImage("logo_v2_dark", "mobile/lounges/dp", null, null, companion, null, Constants.TAG_OS_VERSION);
        d = new UrlImage("https://assets.revolut.com/mobile/lounges/lk/logo_v2_light@3x.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        e = new UrlImage("https://assets.revolut.com/mobile/lounges/lk/logo_v2_dark@3x.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        new CdnImage("basic", "mobile/lounges/upsell", null, null, companion, null, Constants.TAG_OS_VERSION);
        new CdnImage("ultra", "mobile/lounges/upsell", null, null, companion, null, Constants.TAG_OS_VERSION);
    }

    private a() {
    }
}
