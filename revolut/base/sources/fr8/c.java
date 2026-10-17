package fr8;

import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import opf.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f137408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c91.a f137409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yof.d f137410c;
    public final c0 d;
    public final JuniorTransferAmountScreenContract$InputData e;

    public c(w80.b amountFormatter, u80.o moneyPrefixFormatter, c91.a accountNameProvider, yof.d transferAmountMapper, c0 transferSuggestedAmountsInteractor, JuniorTransferAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(accountNameProvider, "accountNameProvider");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f137408a = amountFormatter;
        this.f137409b = accountNameProvider;
        this.f137410c = transferAmountMapper;
        this.d = transferSuggestedAmountsInteractor;
        this.e = inputData;
    }
}
