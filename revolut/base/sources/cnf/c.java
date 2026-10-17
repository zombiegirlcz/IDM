package cnf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25413b;

    public c(b notCardPaymentNoticeDetailsMapper, a cardPaymentNoticeDetailsFallbackMapper) {
        Intrinsics.checkNotNullParameter(notCardPaymentNoticeDetailsMapper, "notCardPaymentNoticeDetailsMapper");
        Intrinsics.checkNotNullParameter(cardPaymentNoticeDetailsFallbackMapper, "cardPaymentNoticeDetailsFallbackMapper");
        this.f25412a = notCardPaymentNoticeDetailsMapper;
        this.f25413b = cardPaymentNoticeDetailsFallbackMapper;
    }
}
