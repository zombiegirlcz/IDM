package w34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import t14.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f294145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f294146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t14.p f294147c;
    public final c d;

    public b(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, t14.p offerV2DetailsDtoMapper, c creditOfferIntroContentDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(offerV2DetailsDtoMapper, "offerV2DetailsDtoMapper");
        Intrinsics.checkNotNullParameter(creditOfferIntroContentDtoMapper, "creditOfferIntroContentDtoMapper");
        this.f294145a = creditApplicationDtoMapper;
        this.f294146b = creditPluginsService;
        this.f294147c = offerV2DetailsDtoMapper;
        this.d = creditOfferIntroContentDtoMapper;
    }
}
