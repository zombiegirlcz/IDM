package fg8;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk8.a f134999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f135000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f135001c;
    public final sri.m d;
    public final gte.a e;
    public final t1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q78.e f135002g;

    public t0(wk8.a juniorReferralsInteractor, hj8.a juniorProfileInteractor, wsg.n walletsInteractor, sri.m navigator, gte.a featureToggleInteractor, t1 juniorSettingsInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(juniorReferralsInteractor, "juniorReferralsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134999a = juniorReferralsInteractor;
        this.f135000b = juniorProfileInteractor;
        this.f135001c = walletsInteractor;
        this.d = navigator;
        this.e = featureToggleInteractor;
        this.f = juniorSettingsInteractor;
        this.f135002g = juniorAccountDestinationResolver;
    }
}
