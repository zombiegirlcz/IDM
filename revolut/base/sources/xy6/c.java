package xy6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx6.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f309619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx6.b f309620b;

    public c(f taxRateMapper, tx6.b invoiceItemsMapper) {
        Intrinsics.checkNotNullParameter(taxRateMapper, "taxRateMapper");
        Intrinsics.checkNotNullParameter(invoiceItemsMapper, "invoiceItemsMapper");
        this.f309619a = taxRateMapper;
        this.f309620b = invoiceItemsMapper;
    }
}
