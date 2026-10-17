package xaj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.crypto.prelaunch.api.navigation.CryptoPreLaunchDetailsDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1689a Companion = new C1689a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f303894a = y0.b("crypto/launches/{currency}");

    /* JADX INFO: renamed from: xaj.a$a, reason: collision with other inner class name */
    public static final class C1689a {
        private C1689a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f303894a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("currency");
        if (str == null) {
            return null;
        }
        return new CryptoPreLaunchDetailsDestination(str);
    }
}
