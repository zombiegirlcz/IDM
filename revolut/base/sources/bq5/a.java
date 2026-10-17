package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo5.a f17671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17672b;

    public a(mo5.a cryptoWithdrawAddressTagClauseProvider, c cryptoCreateBeneficiaryDialogProvider) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawAddressTagClauseProvider, "cryptoWithdrawAddressTagClauseProvider");
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
        this.f17671a = cryptoWithdrawAddressTagClauseProvider;
        this.f17672b = cryptoCreateBeneficiaryDialogProvider;
    }
}
