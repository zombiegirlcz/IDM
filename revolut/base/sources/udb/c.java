package udb;

import com.revolut.feature.retail.restaurants.api.navigation.ReservationDetailsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f279180a = y0.b("restaurants/details/{reservationId}");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f279180a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("reservationId");
        if (str == null) {
            return null;
        }
        if (d0.W(str)) {
            str = null;
        }
        if (str != null) {
            return new ReservationDetailsDestination(str);
        }
        return null;
    }
}
