package vjb;

import com.revolut.feature.retail.savings.impl.challenge.data.SavingsChallengeService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import ulm.b1;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f289675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f289676b;

    public a(b bVar, int i) {
        this.f289675a = bVar;
        this.f289676b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f289675a;
        ee0.a aVar = bVar.f289677a;
        int i = this.f289676b;
        switch (i) {
            case 0:
                je0.d mapper = (je0.d) bVar.f.get();
                yk0.a databaseSessionProvider = bVar.f289678b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                j.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.g(storageFactory, databaseSessionProvider, "savings_challenge_data_storage", mapper, 1, f0.f322471a, false, 96);
            case 1:
                Json json = (Json) bVar.e.get();
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
                return new tjb.g((SavingsChallengeService) bVar.i.get(), (ne0.j) bVar.f289682j.get(), (ue0.c) bVar.f289680g.get());
            case 4:
                ik0.b retrofitFactory = ((nj0.d) bVar.f289679c).m();
                s.j(retrofitFactory);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f289681h.get();
                j.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SavingsChallengeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SavingsChallengeService savingsChallengeService = (SavingsChallengeService) objCreate;
                s.k(savingsChallengeService);
                return savingsChallengeService;
            case 5:
                Json json2 = (Json) bVar.e.get();
                Intrinsics.checkNotNullParameter(json2, "json");
                return p.a.g(b1.Companion, "application/json", json2);
            case 6:
                return new ne0.d();
            case 7:
                ugc.a aVarB = bVar.b();
                CoroutineScope coroutineScopeA = bVar.d.a();
                s.j(coroutineScopeA);
                return new mkb.c(aVarB, coroutineScopeA);
            default:
                throw new AssertionError(i);
        }
    }
}
