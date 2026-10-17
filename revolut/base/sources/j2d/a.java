package j2d;

import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import efm.d0;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pfm.z;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements k1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f170835a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f170835a = navigator;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static SharedAlertsConfiguration b(jf0.c cVar) {
        Set setA = b.a(cVar);
        if (setA.isEmpty()) {
            return null;
        }
        Object obj2 = cVar.d.get("selectedState");
        k1d.b.Companion.getClass();
        return new SharedAlertsConfiguration(setA, (Set) null, (mgd.d) u1.t(obj2, mgd.d.ACTIVE, k1d.a.f180215b), (SharedAlertsConfiguration.Action.CreateAlert) null, false, 58);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "alerts");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        SharedAlertsConfiguration sharedAlertsConfigurationB = b(cVar);
        if (sharedAlertsConfigurationB == null) {
            return null;
        }
        return new h(new SharedAlertsDestination(sharedAlertsConfigurationB, true), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarO = new ufm.c(new a6j.b(this, deeplink, z, 8), 0).o(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return zVarO;
    }
}
