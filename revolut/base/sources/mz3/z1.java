package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z1 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210713a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f210714b;

    public z1(hz3.c creditApplicationCommandsFactory) {
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        this.f210714b = creditApplicationCommandsFactory;
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        switch (this.f210713a) {
            case 0:
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
                pfm.z zVar = new pfm.z(pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, null, 5)), 0, new a68.f(13), null);
                Intrinsics.checkNotNullExpressionValue(zVar, "toSingle(...)");
                return zVar;
            default:
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
                ufm.b bVarM = efm.d0.m(((hz3.c) this.f210714b).d(!navigationConfig.f66191a ? ju3.g.BOTTOM_SHEET : ju3.g.STATUS_DIALOG));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
        }
    }

    public z1(mri.w revolutJobInteractor) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f210714b = revolutJobInteractor;
    }
}
