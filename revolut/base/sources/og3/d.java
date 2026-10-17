package og3;

import com.revolut.feature.checklist_challenges.impl.network.ChecklistChallengesService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import nyb.k;
import om4.d0;
import retrofit2.Converter;
import retrofit2.Retrofit;
import rlm.o;
import skd.i;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f225009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f225010b;

    public d(e eVar, int i) {
        this.f225009a = eVar;
        this.f225010b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f225009a;
        ee0.a aVar = eVar.f225011a;
        m5b.a aVar2 = eVar.d;
        int i = this.f225010b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) eVar.f225015h.get();
                yk0.a databaseSessionProvider = eVar.f225012b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "checklist_challenges", mapper, sg3.a.f262585b, sg3.a.f262584a, 32);
            case 1:
                Json json = (Json) eVar.f225014g.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 2:
                qg3.d jsonProvider = new qg3.d(fe0.d.a());
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f245644a;
                s.k(oVar);
                return oVar;
            case 3:
                rg3.o oVar2 = (rg3.o) eVar.f225019n.get();
                i iVarC = eVar.e.c();
                d0 d0VarB = eVar.f.b();
                lvb.e eVar2 = (lvb.e) aVar2.f202877a.f190070r.get();
                s.j(eVar2);
                k kVarC = aVar2.f202878b.c();
                s.j(kVarC);
                return new pg3.b(oVar2, iVarC, d0VarB, new n5b.d(eVar2, kVarC));
            case 4:
                rg3.c cVar = (rg3.c) eVar.f225017l.get();
                j jVar = (j) eVar.f225018m.get();
                ue0.c cVar2 = (ue0.c) eVar.i.get();
                ChecklistChallengesService checklistChallengesService = (ChecklistChallengesService) eVar.k.get();
                lvb.e eVar3 = (lvb.e) aVar2.f202877a.f190070r.get();
                s.j(eVar3);
                k kVarC2 = aVar2.f202878b.c();
                s.j(kVarC2);
                return new rg3.o(cVar, jVar, cVar2, checklistChallengesService, new n5b.d(eVar3, kVarC2));
            case 5:
                return new rg3.c((ChecklistChallengesService) eVar.k.get(), (ue0.c) eVar.i.get());
            case 6:
                Retrofit retrofit = (Retrofit) eVar.f225013c.f225021b.get();
                s.j(retrofit);
                Converter.Factory converterFactory = (Converter.Factory) eVar.f225016j.get();
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
                listConverterFactories.clear();
                listConverterFactories.add(converterFactory);
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(ChecklistChallengesService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ChecklistChallengesService checklistChallengesService2 = (ChecklistChallengesService) objCreate;
                s.k(checklistChallengesService2);
                return checklistChallengesService2;
            case 7:
                Json json2 = (Json) eVar.f225014g.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            case 8:
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }
}
