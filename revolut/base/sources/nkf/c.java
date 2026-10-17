package nkf;

import elf.y;
import klf.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f216802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final whf.n f216803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f216804n;

    public c(p collectionExchangeDataSource, whf.n transactionItemsMapper, y linkedTransactionClickHandler) {
        Intrinsics.checkNotNullParameter(collectionExchangeDataSource, "collectionExchangeDataSource");
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(linkedTransactionClickHandler, "linkedTransactionClickHandler");
        this.f216802l = collectionExchangeDataSource;
        this.f216803m = transactionItemsMapper;
        this.f216804n = linkedTransactionClickHandler;
    }
}
