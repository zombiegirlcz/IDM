package tg5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.gift.asset.impl.data.network.CryptoGiftAssetService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f271066b;

    public c(d dVar, int i) {
        this.f271065a = dVar;
        this.f271066b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f271065a;
        nj0.a aVar = dVar.f271068b;
        ee0.a aVar2 = dVar.f271069c;
        int i = this.f271066b;
        if (i == 0) {
            gte.a aVarB = dVar.f271067a.b();
            s.j(aVarB);
            return new g8g.b(ImmutableSet.of(new sg5.b(aVarB)), 2);
        }
        if (i == 1) {
            return new qg5.c((CryptoGiftAssetService) dVar.f271075n.get(), (ne0.j) dVar.o.get(), (ue0.c) dVar.f271076p.get());
        }
        if (i == 2) {
            ek.a converterFactory = ((nj0.d) aVar).d();
            ik0.b factory = ((nj0.d) aVar).m();
            s.j(factory);
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(CryptoGiftAssetService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            CryptoGiftAssetService cryptoGiftAssetService = (CryptoGiftAssetService) objCreate;
            s.k(cryptoGiftAssetService);
            return cryptoGiftAssetService;
        }
        if (i == 3) {
            return new ne0.d();
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = dVar.d.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_crypto_gift_asset", mapper, 0, null, 56);
    }
}
