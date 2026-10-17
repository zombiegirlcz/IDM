package t34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;
import r10.f;
import sf0.h;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f267653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f267654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f267655c;
    public final h d;

    public e(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, f networkUrlBuilder, h serverErrorParser) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f267653a = creditApplicationDtoMapper;
        this.f267654b = creditPluginsService;
        this.f267655c = networkUrlBuilder;
        this.d = serverErrorParser;
    }
}
