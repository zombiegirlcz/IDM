package kx6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx6.f f190444a;

    public g(b invoiceClauseFactory, tx6.f taxRateMapper) {
        Intrinsics.checkNotNullParameter(invoiceClauseFactory, "invoiceClauseFactory");
        Intrinsics.checkNotNullParameter(taxRateMapper, "taxRateMapper");
        this.f190444a = taxRateMapper;
    }
}
