package koh;

import com.revolut.feature.wealth.assetdetails.ui.api.navigation.InstrumentHighRiskWarningDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f186365a = y0.b("instruments/collection-info/{warningType}");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f186365a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("warningType");
        if (str != null && str.equals("crypto-exposure")) {
            return new InstrumentHighRiskWarningDestination(j3h.c.CRYPTO_ETN);
        }
        return null;
    }
}
