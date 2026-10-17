package dc6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ppk.f;
import sa6.h;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa6.c f112804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f112805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f112806c;
    public final xua.a d;
    public final sa6.b e;
    public final whf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f112807g;

    public c(aa6.c donationsInteractor, f ratesInteractor, n walletInteractor, xua.a recurringPaymentInteractor, sa6.b charitiesCollectionsInteractor, whf.b transactionsContentProvider, h charityTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(charitiesCollectionsInteractor, "charitiesCollectionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(charityTransactionsInteractor, "charityTransactionsInteractor");
        this.f112804a = donationsInteractor;
        this.f112805b = ratesInteractor;
        this.f112806c = walletInteractor;
        this.d = recurringPaymentInteractor;
        this.e = charitiesCollectionsInteractor;
        this.f = transactionsContentProvider;
        this.f112807g = charityTransactionsInteractor;
    }
}
