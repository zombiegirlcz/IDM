package t42;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f267858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.i f267859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w42.c f267860c;
    public final yof.d d;

    public p(l80.e dateProvider, lx1.i apmRecipientMapper, w42.c amountItemsMapper, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f267858a = dateProvider;
        this.f267859b = apmRecipientMapper;
        this.f267860c = amountItemsMapper;
        this.d = transferAmountMapper;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // cli.n
    public final cli.o c(cli.j r43) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t42.p.c(cli.j):cli.o");
    }
}
