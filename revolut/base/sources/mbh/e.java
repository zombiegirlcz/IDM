package mbh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f204217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4i.a f204218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final by5.a f204219c;

    public e(o7.b orderQuoteInteractor, l4i.a amountConverter, by5.a orderQuoteParamsFactory) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(orderQuoteParamsFactory, "orderQuoteParamsFactory");
        this.f204217a = orderQuoteInteractor;
        this.f204218b = amountConverter;
        this.f204219c = orderQuoteParamsFactory;
    }
}
