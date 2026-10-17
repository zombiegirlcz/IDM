package y77;

import android.content.Context;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase;
import com.revolut.feature.global_markets.impl.data.network.GlobalMarketsService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f311404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311405b;

    public h(i iVar, int i) {
        this.f311404a = iVar;
        this.f311405b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f311404a;
        int i = this.f311405b;
        switch (i) {
            case 0:
                p77.c cVar = iVar.f311407b;
                GlobalMarketsService globalMarketsService = (GlobalMarketsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) iVar.f311412l.get(), "retrofit", GlobalMarketsService.class, "create(...)");
                s.k(globalMarketsService);
                return globalMarketsService;
            case 1:
                p77.c cVar2 = iVar.f311407b;
                Retrofit retrofit = ((nj0.d) iVar.f311408c).f();
                Converter.Factory converterFactory = (Converter.Factory) iVar.k.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                builderNewBuilder.converterFactories().clear();
                builderNewBuilder.addConverterFactory(converterFactory);
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 2:
                p77.c cVar3 = iVar.f311407b;
                return p.a.g(b1.Companion, "application/json", (Json) q77.a.f242766a.getValue());
            case 3:
                GlobalMarketsDatabase database = (GlobalMarketsDatabase) iVar.f311414n.get();
                p77.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                n77.i iVarH = database.h();
                s.k(iVarH);
                return iVarH;
            case 4:
                Context context = iVar.d;
                yk0.a databaseSessionProvider = iVar.e.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((cl0.a) iVar.f).a();
                s.j(databaseEncryptionMigratorFactory);
                p77.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                GlobalMarketsDatabase.Companion companion = GlobalMarketsDatabase.INSTANCE;
                companion.getClass();
                GlobalMarketsDatabase globalMarketsDatabase = (GlobalMarketsDatabase) companion.a(context, databaseSessionProvider, GlobalMarketsDatabase.f, databaseEncryptionMigratorFactory);
                s.k(globalMarketsDatabase);
                return globalMarketsDatabase;
            case 5:
                return new ne0.d();
            case 6:
                je0.d mapper = iVar.f311410h.d();
                s.j(mapper);
                yk0.a databaseSessionProvider2 = iVar.e.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory = iVar.f311410h.f();
                s.j(storageFactory);
                p77.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "pinned_market_assets", mapper, 0, null, 56);
            case 7:
                return new x87.a();
            case 8:
                je0.d dVarD = iVar.f311410h.d();
                s.j(dVarD);
                yk0.a aVarB = iVar.e.b();
                s.j(aVarB);
                xe0.f fVarF = iVar.f311410h.f();
                s.j(fVarF);
                return oyj.c.n(dVarD, fVarF, aVarB);
            case 9:
                GlobalMarketsDatabase database2 = (GlobalMarketsDatabase) iVar.f311414n.get();
                p77.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                n77.d dVarG = database2.g();
                s.k(dVarG);
                return dVarG;
            case 10:
                ufm.g gVarE = iVar.f311406a.E();
                ybl.b bVarB = iVar.f311411j.b();
                s.j(bVarB);
                return new v77.e(gVarE, bVarB, iVar.f311406a.d());
            default:
                throw new AssertionError(i);
        }
    }
}
