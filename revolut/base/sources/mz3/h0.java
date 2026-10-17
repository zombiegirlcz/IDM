package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mri.w f210602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an4.i f210603b;

    public h0(mri.w revolutJobInteractor, an4.i creditCardProductCommandFactory) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductCommandFactory, "creditCardProductCommandFactory");
        this.f210602a = revolutJobInteractor;
        this.f210603b = creditCardProductCommandFactory;
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.i iVar = new ufm.i(new pfm.z(pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 2)), 0, new i(payload, 8), null), new s(new a7(this, 18), 3), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, DummyCommand.f98635a);
    }
}
