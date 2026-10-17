package te7;

import com.revolut.feature.incentive_experiment.impl.network.IncentiveExperimentService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import retrofit2.Converter;
import rlm.o;
import ulm.b1;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f270038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270039b;

    public a(b bVar, int i) {
        this.f270038a = bVar;
        this.f270039b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f270038a;
        ee0.a aVar = bVar.d;
        int i = this.f270039b;
        switch (i) {
            case 0:
                lg3.a aVarA = ((og3.e) bVar.f270040a).a();
                s.j(aVarA);
                l80.e eVarH = bVar.f270041b.h();
                s.j(eVarH);
                return new ue7.c(aVarA, eVarH, (xe7.d) bVar.f270046l.get());
            case 1:
                IncentiveExperimentService incentiveExperimentService = (IncentiveExperimentService) bVar.f270044h.get();
                j jVar = (j) bVar.i.get();
                ue0.c cVar = (ue0.c) bVar.k.get();
                ze0.a aVarA2 = aVar.a();
                s.j(aVarA2);
                return new xe7.d(incentiveExperimentService, jVar, cVar, aVarA2);
            case 2:
                ik0.b retrofitFactory = ((nj0.d) bVar.f270042c).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f270043g.get();
                e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(IncentiveExperimentService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                IncentiveExperimentService incentiveExperimentService2 = (IncentiveExperimentService) objCreate;
                s.k(incentiveExperimentService2);
                return incentiveExperimentService2;
            case 3:
                Json json = (Json) bVar.f.get();
                Intrinsics.checkNotNullParameter(json, "json");
                return p.a.g(b1.Companion, "application/json", json);
            case 4:
                w29.b jsonProvider = new w29.b(fe0.d.a(), 1);
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f293981a;
                s.k(oVar);
                return oVar;
            case 5:
                return new ne0.d();
            case 6:
                je0.d mapper = (je0.d) bVar.f270045j.get();
                yk0.a databaseSessionProvider = bVar.e.b();
                s.j(databaseSessionProvider);
                f storageFactory = aVar.f();
                s.j(storageFactory);
                e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSessionProvider, "incentive_experiment", mapper, 1, null, 48);
            case 7:
                Json json2 = (Json) bVar.f.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json2, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json2);
            case 8:
                return new ue7.e((xe7.d) bVar.f270046l.get());
            default:
                throw new AssertionError(i);
        }
    }
}
