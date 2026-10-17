package e66;

import com.revolut.feature.defi.settings.impl.data.network.DeFiSeedPhraseExportService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f122926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122927b;

    public c(d dVar, int i) {
        this.f122926a = dVar;
        this.f122927b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f122926a;
        nj0.a aVar = dVar.f122928a;
        int i = this.f122927b;
        if (i == 0) {
            return new g66.a();
        }
        if (i == 1) {
            DeFiSeedPhraseExportService deFiSeedPhraseExportService = (DeFiSeedPhraseExportService) dVar.f.get();
            Json json = fe0.d.a();
            Intrinsics.checkNotNullParameter(json, "json");
            return new b66.c(deFiSeedPhraseExportService, new b66.b());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ek.a converterFactory = ((nj0.d) aVar).d();
        ik0.b factory = ((nj0.d) aVar).m();
        s.j(factory);
        z56.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(DeFiSeedPhraseExportService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DeFiSeedPhraseExportService deFiSeedPhraseExportService2 = (DeFiSeedPhraseExportService) objCreate;
        s.k(deFiSeedPhraseExportService2);
        return deFiSeedPhraseExportService2;
    }
}
