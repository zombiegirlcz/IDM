package yaj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.crypto.prelaunch.impl.data.network.CryptoPreLaunchService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f312053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f312054b;

    public f(g gVar, int i) {
        this.f312053a = gVar;
        this.f312054b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f312053a;
        ee0.a aVar = gVar.f312055a;
        nj0.a aVar2 = gVar.f312057c;
        int i = this.f312054b;
        if (i == 0) {
            return new ddk.b(ImmutableSet.of(new xaj.a()), 5);
        }
        if (i == 1) {
            return new ne0.d();
        }
        if (i == 2) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = gVar.f312056b.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            e.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_pre_launch", mapper, 0, null, 56);
        }
        if (i == 3) {
            return new waj.a((CryptoPreLaunchService) gVar.f312058g.get(), (j) gVar.e.get(), (ue0.c) gVar.f.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        ek.a converterFactory = ((nj0.d) aVar2).d();
        ik0.b factory = ((nj0.d) aVar2).m();
        s.j(factory);
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(CryptoPreLaunchService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoPreLaunchService cryptoPreLaunchService = (CryptoPreLaunchService) objCreate;
        s.k(cryptoPreLaunchService);
        return cryptoPreLaunchService;
    }
}
