package blb;

import com.revolut.feature.retail.savings.impl.upgrades.data.network.SavingsUpgradeService;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16501b;

    public d(e eVar, int i) {
        this.f16500a = eVar;
        this.f16501b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f16500a;
        ee0.a aVar = eVar.f16502a;
        int i = this.f16501b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) eVar.f16510n.get();
                yk0.a dbSessionProvider = eVar.f16503b.b();
                s.j(dbSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                fqb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.c(storageFactory, dbSessionProvider, "savings_upgrades_storage", mapper, 2, 16);
            case 1:
                Json json = (Json) eVar.f16509m.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 2:
                Json baseJson = fe0.d.a();
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                return baseJson;
            case 3:
                icd.a aVar2 = (icd.a) ((xbd.b) eVar.f16504c).f304060s.get();
                s.j(aVar2);
                t tVarF = eVar.d.f();
                s.j(tVarF);
                com.revolut.feature.shared.savings.impl.core.error.c cVar = (com.revolut.feature.shared.savings.impl.core.error.c) ((vbd.b) eVar.e).k.get();
                s.j(cVar);
                return new olb.d(aVar2, tVarF, cVar);
            case 4:
                return new eqb.b((SavingsUpgradeService) eVar.f16513r.get(), (ne0.j) eVar.f16514s.get(), (ue0.c) eVar.o.get());
            case 5:
                ik0.b retrofitFactory = ((nj0.d) eVar.f16505g).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) eVar.f16512q.get();
                fqb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SavingsUpgradeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SavingsUpgradeService savingsUpgradeService = (SavingsUpgradeService) objCreate;
                s.k(savingsUpgradeService);
                return savingsUpgradeService;
            case 6:
                Json json2 = (Json) eVar.f16509m.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            case 7:
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }
}
