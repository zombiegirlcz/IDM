package q97;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class u1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.m f243798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(t97.c productCellProvider, oe6.m openBankingInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        this.f243798b = openBankingInteractor;
        this.f243799c = t97.d.PERMISSIONS;
    }

    @Override // r97.b
    public final Flow d() {
        oe6.l lVar = oe6.m.Companion;
        efm.r rVarDistinctUntilChanged = nim.a.w(nim.a.w(((hf6.i) ((mg6.c) this.f243798b).f205160a).f151763g.f(Unit.f186387a, false), new he4.r(13)), new md0.c(22)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return mo3.a.g(nim.a.A(zi0.c.w(rd0.e.b(rVarDistinctUntilChanged)), new l1(1)), null, new q92.f(24), 1);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243799c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(ExternalAccountsFeatureConfig.Permissions.f72324a));
    }
}
