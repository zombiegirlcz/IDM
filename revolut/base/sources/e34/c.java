package e34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import t04.o;
import t04.q;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f122195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f122196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f122197c;
    public final p d;

    public c(CreditPluginsService creditPluginsService, o configMapper, q requestFieldsMapper, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        Intrinsics.checkNotNullParameter(requestFieldsMapper, "requestFieldsMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        this.f122195a = creditPluginsService;
        this.f122196b = configMapper;
        this.f122197c = requestFieldsMapper;
        this.d = creditApplicationDtoMapper;
    }
}
