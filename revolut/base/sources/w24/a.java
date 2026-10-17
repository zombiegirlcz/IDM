package w24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import j04.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f293938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f293939b;

    public a(CreditPluginsService api2, b mapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f293938a = api2;
        this.f293939b = mapper;
    }
}
