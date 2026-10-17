package kv5;

import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    @NotNull
    public static final m Companion = new m();
    public static final List f = v.k(io3.k.ACTIVE, io3.k.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f189972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fnc.s f189973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final avd.b f189974c;
    public final nu5.c d;
    public final gte.a e;

    public o(wsg.n walletInteractor, fnc.s stakeableCurrenciesProvider, avd.b flexibleStakingConsentInteractor, nu5.c autoEarnEligibleWidgetCustomisationInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stakeableCurrenciesProvider, "stakeableCurrenciesProvider");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(autoEarnEligibleWidgetCustomisationInteractor, "autoEarnEligibleWidgetCustomisationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f189972a = walletInteractor;
        this.f189973b = stakeableCurrenciesProvider;
        this.f189974c = flexibleStakingConsentInteractor;
        this.d = autoEarnEligibleWidgetCustomisationInteractor;
        this.e = featureToggleInteractor;
    }

    public final oji.f a() {
        boolean zC = ((jte.d) this.e).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c);
        vkm.d dVarB = b(new kob.a(this, 8));
        fnc.s sVar = this.f189973b;
        return ta6.a.e(dVarB, new q(sVar.o(), 0), new q(sVar.o(), 1), this.f189974c.a(), this.d.a(), new h23.c(zC, (Continuation) null));
    }

    public final vkm.d b(Function0 function0) {
        return rd0.e.b(nim.a.w(osg.b.g(this.f189972a, w4l.h.f294642c, null, null, io3.i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new ac1.b(12, function0)));
    }
}
