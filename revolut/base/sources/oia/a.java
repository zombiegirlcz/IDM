package oia;

import kotlin.jvm.internal.Intrinsics;
import lia.d;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements hia.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f225590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f225591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sia.a f225592c;
    public final fuk.a d;

    public a(d proSalesAnalyticsRepository, n walletInteractor, sia.a requestParamsMapper, fuk.a widgetContentMapper) {
        Intrinsics.checkNotNullParameter(proSalesAnalyticsRepository, "proSalesAnalyticsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(requestParamsMapper, "requestParamsMapper");
        Intrinsics.checkNotNullParameter(widgetContentMapper, "widgetContentMapper");
        this.f225590a = proSalesAnalyticsRepository;
        this.f225591b = walletInteractor;
        this.f225592c = requestParamsMapper;
        this.d = widgetContentMapper;
    }
}
