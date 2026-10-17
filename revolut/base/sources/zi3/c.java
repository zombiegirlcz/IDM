package zi3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q70.d;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi0.a f322500a;

    public c(gi0.a mobileServicesProvider) {
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        this.f322500a = mobileServicesProvider;
    }

    public static String a(d applicationName, double d, double d5) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        int i = b.f322498a[applicationName.ordinal()];
        if (i == 1) {
            return "https://citymapper.com/directions?endcoord=" + d + "," + d5;
        }
        if (i == 2) {
            return "https://www.google.com/maps/search/?api=1&query=" + d + "," + d5;
        }
        if (i == 3) {
            return "https://www.waze.com/ul?ll=" + d + "," + d5 + "&navigate=yes&zoom=17";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "https://www.petalmaps.com/routes/?daddr=" + d + "," + d5;
    }
}
