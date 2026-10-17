package ebh;

import d1h.h;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f124355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f124357c;

    public a(q1 wealthDisclaimersMapper, h wealthRemoteDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f124355a = wealthDisclaimersMapper;
        this.f124356b = wealthRemoteDisclaimersMapper;
        this.f124357c = featureToggleInteractor;
    }
}
