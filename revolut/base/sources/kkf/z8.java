package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class z8 {

    @NotNull
    public static final t8 Companion = new t8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f185059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yig.a f185060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.h0 f185061c;
    public final klf.m1 d;
    public final elf.h2 e;

    public z8(jla.h productCatalogueInteractor, yig.a trustedMerchantsRepository, klf.h0 commonDataSource, klf.m1 juniorDataSource, elf.h2 trustedMerchantClickHandler) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(trustedMerchantsRepository, "trustedMerchantsRepository");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(trustedMerchantClickHandler, "trustedMerchantClickHandler");
        this.f185059a = productCatalogueInteractor;
        this.f185060b = trustedMerchantsRepository;
        this.f185061c = commonDataSource;
        this.d = juniorDataSource;
        this.e = trustedMerchantClickHandler;
    }

    public final cmf.p a() {
        return new cmf.p(vkm.q.Q(new x5(this.d.a(), 11), new u8(null, this, 0)), new z5(10), zhm.u.c(this.e), "TrustedMerchant");
    }
}
