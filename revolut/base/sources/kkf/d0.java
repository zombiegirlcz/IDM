package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f184632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.b0 f184633c;
    public final c0 d;

    public d0(klf.h0 commonDataSource, vlf.b commonUiMapper, elf.b0 confirmationClickHandler, c0 availabilityChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        this.f184631a = commonDataSource;
        this.f184632b = commonUiMapper;
        this.f184633c = confirmationClickHandler;
        this.d = availabilityChecker;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f184631a;
        return new cmf.p(new t38.e(h0Var.d(), 24, h0Var.c(), new ael.l0(3, this, d0.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 8)), new ka9.b(28), zhm.u.c(this.f184633c), "Confirmation");
    }
}
