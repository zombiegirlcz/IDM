package wbf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbf.a f296144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rbf.d f296145b;

    public c(kbf.a getAddOn, rbf.d tradingAddOnsRepository) {
        Intrinsics.checkNotNullParameter(getAddOn, "getAddOn");
        Intrinsics.checkNotNullParameter(tradingAddOnsRepository, "tradingAddOnsRepository");
        this.f296144a = getAddOn;
        this.f296145b = tradingAddOnsRepository;
    }
}
