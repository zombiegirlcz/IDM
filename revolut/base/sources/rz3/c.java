package rz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import ryd.j;
import ryd.k;
import ufm.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f258502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j24.d f258503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hz3.c f258504c;

    public c(ang.f userInteractor, j24.d pluginProvider, hz3.c creditApplicationCommandsFactory) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pluginProvider, "pluginProvider");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        this.f258502a = userInteractor;
        this.f258503b = pluginProvider;
        this.f258504c = creditApplicationCommandsFactory;
    }

    public final i a(it3.d status, r2 entryPointType, String str, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        i iVar = new i(this.f258502a.f(false), new j(new k(3), 4), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(iVar, new j(new ryd.f(this, status, str, entryPointType, navigationConfig, 2), 3), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
