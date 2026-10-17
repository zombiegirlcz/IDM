package m86;

import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f203436a;

    public static final class a {
        private a() {
        }
    }

    public b() {
        String[] elements = {"device-management/{deviceId}", "device-management"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f203436a = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f203436a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("deviceId");
        return new DeviceManagementDestination((str == null || d0.W(str)) ? DeviceManagementDestination.Config.Home.f71934a : new DeviceManagementDestination.Config.DeviceDetails(str, false));
    }
}
