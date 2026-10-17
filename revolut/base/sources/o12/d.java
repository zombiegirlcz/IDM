package o12;

import com.revolut.feature.apm.core.api.ApmToggles$ApmAliasClaim;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$InputData;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xii.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f221268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f221269b;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f221268a = featureToggleInteractor;
        this.f221269b = y0.b("apm-alias/claim/{requestId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f221269b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f221268a.a(ApmToggles$ApmAliasClaim.f61775c)) {
            return null;
        }
        String str = (String) deeplink.f195040b.get("requestId");
        if (str != null) {
            return new ApmAliasClaimStatusNavigation$Destination(new ApmAliasClaimStatusNavigation$InputData(str));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing alias claim request ID");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }
}
