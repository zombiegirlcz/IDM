package q7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7c.a f242807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7b.a f242808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f242809c;

    public d(y7c.a deferredPaymentRepository, c7b.a recurringPaymentMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(deferredPaymentRepository, "deferredPaymentRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentMapper, "recurringPaymentMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f242807a = deferredPaymentRepository;
        this.f242808b = recurringPaymentMapper;
        this.f242809c = dateProvider;
    }
}
