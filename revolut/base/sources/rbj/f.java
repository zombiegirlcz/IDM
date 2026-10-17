package rbj;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements fbj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fbj.a f253129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rea.m f253130b;

    public f(rea.m pocketDetailsInteractor, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.f253129a = cryptoDepositsInteractor;
        this.f253130b = pocketDetailsInteractor;
    }

    @Override // fbj.a
    public final r b(wk5.a aVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f253129a.b(aVar, currency);
    }

    @Override // fbj.a
    public final r c(w4l.k kVar) {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f253129a.c(loadingStrategy);
    }

    @Override // fbj.a
    public final r d(String pocketId, wk5.a blockchain, boolean z) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return this.f253129a.d(pocketId, blockchain, z);
    }

    @Override // fbj.a
    public final Object e(iyi.j jVar) {
        return this.f253129a.e(jVar);
    }

    @Override // fbj.a
    public final Flow f(a3 transaction, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f253129a.f(transaction, loadingStrategy);
    }

    @Override // fbj.a
    public final efm.b g(String transactionToReturnGroupId, String cryptoAddressId) {
        Intrinsics.checkNotNullParameter(transactionToReturnGroupId, "transactionToReturnGroupId");
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        return this.f253129a.g(transactionToReturnGroupId, cryptoAddressId);
    }

    @Override // fbj.a
    public final d0 validateRestriction() {
        return this.f253129a.validateRestriction();
    }
}
