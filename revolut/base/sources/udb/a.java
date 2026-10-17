package udb;

import com.revolut.feature.retail.restaurants.api.navigation.ConfirmReservationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xii.b {

    @NotNull
    private static final C1543a Companion = new C1543a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f279178a = y0.b("restaurants/confirm/{reservationId}");

    /* JADX INFO: renamed from: udb.a$a, reason: collision with other inner class name */
    public static final class C1543a {
        private C1543a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f279178a;
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
            return new ConfirmReservationDestination(str);
        }
        return null;
    }
}
