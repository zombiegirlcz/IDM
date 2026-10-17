package ym6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import ufm.i;
import yjj.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.revolut.feature.external_accounts.api.navigation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f314871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f314872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f314873c;
    public final y91.b d;

    public d(fk3.a configurationInteractor, xoj.a featuresInteractor, gte.a featureToggle, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f314871a = configurationInteractor;
        this.f314872b = featuresInteractor;
        this.f314873c = featureToggle;
        this.d = accountsProductFeatureChecker;
    }

    public final i b(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, ExternalAccountsFeatureConfig.Configuration.DirectLink directLink, boolean z) {
        ufm.b bVarO0 = w.o0(p0.f264003c, new c(this, null));
        d0 d0VarFirstOrError = ((cpj.b) this.f314872b).l(yoj.c.EXTERNAL_ACCOUNTS_TOPUP).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        i iVar = new i(new i(w.H0(bVarO0, d0VarFirstOrError), new yj2.a(20, new j(9)), 1), new yj2.a(21, new a(this, z, trueLayer, directLink)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
