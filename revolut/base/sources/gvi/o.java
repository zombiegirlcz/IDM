package gvi;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f147194a = new o();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        do3.n user = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(user, "user");
        String str = user.f116410c;
        if (str == null) {
            str = "";
        }
        String str2 = user.e;
        return new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(str, str2 != null ? str2 : "");
    }
}
