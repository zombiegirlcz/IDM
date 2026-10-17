package y24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import l04.c;
import l04.f;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f310586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f310587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f310588c;
    public final CreditPluginsService d;

    public a(p creditApplicationDtoMapper, c schedulingConfigMapper, f submitSchedulingRequestMapper, CreditPluginsService creditPluginsService) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(schedulingConfigMapper, "schedulingConfigMapper");
        Intrinsics.checkNotNullParameter(submitSchedulingRequestMapper, "submitSchedulingRequestMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        this.f310586a = creditApplicationDtoMapper;
        this.f310587b = schedulingConfigMapper;
        this.f310588c = submitSchedulingRequestMapper;
        this.d = creditPluginsService;
    }
}
