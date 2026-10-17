package gt6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f146562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f146563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f146564c;

    public h(a invoiceEventsMapper, f saleEventsMapper, c relatedOrdersEventsMapper, e relatedTransactionsEventsMapper, i taxAllocationEventsMapper) {
        Intrinsics.checkNotNullParameter(invoiceEventsMapper, "invoiceEventsMapper");
        Intrinsics.checkNotNullParameter(saleEventsMapper, "saleEventsMapper");
        Intrinsics.checkNotNullParameter(relatedOrdersEventsMapper, "relatedOrdersEventsMapper");
        Intrinsics.checkNotNullParameter(relatedTransactionsEventsMapper, "relatedTransactionsEventsMapper");
        Intrinsics.checkNotNullParameter(taxAllocationEventsMapper, "taxAllocationEventsMapper");
        this.f146562a = saleEventsMapper;
        this.f146563b = relatedOrdersEventsMapper;
        this.f146564c = relatedTransactionsEventsMapper;
    }
}
