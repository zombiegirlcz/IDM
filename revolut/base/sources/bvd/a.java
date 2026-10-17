package bvd;

import kotlin.jvm.internal.Intrinsics;
import xv5.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bwd.c f19020b;

    public a(c cryptoBaseCurrencyInteractor, bwd.c stakingRewardsRepository) {
        Intrinsics.checkNotNullParameter(cryptoBaseCurrencyInteractor, "cryptoBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stakingRewardsRepository, "stakingRewardsRepository");
        this.f19019a = cryptoBaseCurrencyInteractor;
        this.f19020b = stakingRewardsRepository;
    }
}
