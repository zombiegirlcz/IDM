package h8b;

import com.revolut.feature.corporate_events.navigation.CorporateEventDetailsDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static FeatureCommand a(a aVar, kp3.b corporateEvent, boolean z) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        return u0.f(new CorporateEventDetailsDestination(corporateEvent.a().b(), z, true));
    }
}
