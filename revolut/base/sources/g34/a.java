package g34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import m31.c;
import mp.p;
import x04.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f140187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f140188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f140189c;
    public final c d;

    public a(p creditApplicationDtoMapper, h mapper, CreditPluginsService creditPluginsService, c multipartHelper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        this.f140187a = creditApplicationDtoMapper;
        this.f140188b = mapper;
        this.f140189c = creditPluginsService;
        this.d = multipartHelper;
    }
}
