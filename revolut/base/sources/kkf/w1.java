package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f184993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnf.b f184994c;
    public final wnf.i d;
    public final z71.a e;
    public final elf.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final elf.r0 f184995g;

    public w1(klf.h0 commonDataSource, vlf.b commonUiMapper, wnf.b commonMapper, wnf.i multiCurrencyTransactionMapper, z71.a revolutBankAccountsRepository, elf.p cellDetailsAccountCopyClickHandler, elf.r0 indianMcyTopUpClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(multiCurrencyTransactionMapper, "multiCurrencyTransactionMapper");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(cellDetailsAccountCopyClickHandler, "cellDetailsAccountCopyClickHandler");
        Intrinsics.checkNotNullParameter(indianMcyTopUpClickHandler, "indianMcyTopUpClickHandler");
        this.f184992a = commonDataSource;
        this.f184993b = commonUiMapper;
        this.f184994c = commonMapper;
        this.d = multiCurrencyTransactionMapper;
        this.e = revolutBankAccountsRepository;
        this.f = cellDetailsAccountCopyClickHandler;
        this.f184995g = indianMcyTopUpClickHandler;
    }
}
