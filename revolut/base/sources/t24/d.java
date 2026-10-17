package t24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f267417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f267418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f267419c;

    public d(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, fn2.c serverErrorParser) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f267417a = creditApplicationDtoMapper;
        this.f267418b = creditPluginsService;
        this.f267419c = serverErrorParser;
    }
}
