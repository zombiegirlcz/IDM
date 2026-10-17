package vg3;

import android.content.Context;
import com.revolut.feature.checklist_challenges_ui.impl.network.ChecklistChallengesUIService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import retrofit2.Converter;
import retrofit2.Retrofit;
import rlm.o;
import sri.m;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f288722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f288723b;

    public f(g gVar, int i) {
        this.f288722a = gVar;
        this.f288723b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f288722a;
        int i = this.f288723b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) gVar.f288732n.get();
                yk0.a databaseSessionProvider = gVar.f288725b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = gVar.f288724a.f();
                s.j(storageFactory);
                e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "checklist_challenges_ui", mapper, dh3.a.f114740b, dh3.a.f114739a, 32);
            case 1:
                Json json = (Json) gVar.f288731m.get();
                me0.a factory = gVar.f288724a.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 2:
                ee0.a aVar = gVar.f288724a;
                bh3.a jsonProvider = new bh3.a(fe0.d.a(), 0);
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                o oVar = jsonProvider.f15224a;
                s.k(oVar);
                return oVar;
            case 3:
                return new ah3.a();
            case 4:
                return new ah3.g((m) gVar.f288734q.get());
            case 5:
                Context context = gVar.f288726c;
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 6:
                return new ah3.d((m) gVar.f288734q.get());
            case 7:
                return new wg3.a((ch3.f) gVar.f288738w.get());
            case 8:
                return new ch3.f((j) gVar.f288737t.get(), (ue0.c) gVar.o.get(), (ChecklistChallengesUIService) gVar.v.get());
            case 9:
                return new ne0.d();
            case 10:
                ik0.b retrofitFactory = ((nj0.d) gVar.f).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) gVar.u.get();
                e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit.Builder builderNewBuilder = ik0.b.a(retrofitFactory, null, null, null, null, 31).newBuilder();
                List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
                listConverterFactories.clear();
                listConverterFactories.add(converterFactory);
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(ChecklistChallengesUIService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ChecklistChallengesUIService checklistChallengesUIService = (ChecklistChallengesUIService) objCreate;
                s.k(checklistChallengesUIService);
                return checklistChallengesUIService;
            case 11:
                Json json2 = (Json) gVar.f288731m.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            default:
                throw new AssertionError(i);
        }
    }
}
