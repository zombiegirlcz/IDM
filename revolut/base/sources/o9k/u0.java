package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpf.b f223368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sw8.a f223369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f223370c;
    public final a d;

    public u0(cpf.b transferResultDialogFactory, sw8.a jpMyNumberKycStatusFactory, wj5.a cryptoEmtStatusViewModelFactory, sf0.h serverErrorParser, a juniorPocketCreationDialogFactory) {
        Intrinsics.checkNotNullParameter(transferResultDialogFactory, "transferResultDialogFactory");
        Intrinsics.checkNotNullParameter(jpMyNumberKycStatusFactory, "jpMyNumberKycStatusFactory");
        Intrinsics.checkNotNullParameter(cryptoEmtStatusViewModelFactory, "cryptoEmtStatusViewModelFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(juniorPocketCreationDialogFactory, "juniorPocketCreationDialogFactory");
        this.f223368a = transferResultDialogFactory;
        this.f223369b = jpMyNumberKycStatusFactory;
        this.f223370c = serverErrorParser;
        this.d = juniorPocketCreationDialogFactory;
    }
}
