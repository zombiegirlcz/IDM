package nh0;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f215265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg0.c f215266b;

    public b(a advertisingIdClientWrapper, sg0.c configuration) {
        Intrinsics.checkNotNullParameter(advertisingIdClientWrapper, "advertisingIdClientWrapper");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f215265a = advertisingIdClientWrapper;
        this.f215266b = configuration;
    }

    public final c a() throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        if (!this.f215266b.c()) {
            return null;
        }
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f215265a.f215264a);
        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
        Intrinsics.checkNotNullParameter(advertisingIdInfo, "<this>");
        return new c(advertisingIdInfo);
    }
}
