package v24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f285640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f285641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f285642c;

    public a(p creditApplicationDtoMapper, n walletsInteractor, CreditPluginsService api2) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f285640a = creditApplicationDtoMapper;
        this.f285641b = walletsInteractor;
        this.f285642c = api2;
    }
}
