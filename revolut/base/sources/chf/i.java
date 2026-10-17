package chf;

import kotlin.jvm.internal.Intrinsics;
import thf.m;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f24218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9l.a f24220c;

    public i(thf.d transactionIconResourcesMapper, m transactionTextResourcesMapper, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f24218a = transactionIconResourcesMapper;
        this.f24219b = transactionTextResourcesMapper;
        this.f24220c = moneyCalculator;
    }
}
