package a34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import o04.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f1051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f1052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f1053c;

    public c(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, i creditCardOfferDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditCardOfferDtoMapper, "creditCardOfferDtoMapper");
        this.f1051a = creditApplicationDtoMapper;
        this.f1052b = creditPluginsService;
        this.f1053c = creditCardOfferDtoMapper;
    }
}
