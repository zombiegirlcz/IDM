package tf5;

import com.revolut.feature.crypto.exchange.fees.impl.service.CryptoExchangeFeesService;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ulm.b1;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f270252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270253b;

    public k(l lVar, int i) {
        this.f270252a = lVar;
        this.f270253b = i;
    }

    @Override // phm.a
    public final Object get() {
        l lVar = this.f270252a;
        ee0.a aVar = lVar.f270255b;
        int i = this.f270253b;
        switch (i) {
            case 0:
                t tVarF = lVar.f270254a.f();
                s.j(tVarF);
                return new vf5.d(tVarF, (nf5.d) lVar.f270260l.get());
            case 1:
                return new nf5.d((ue0.c) lVar.f270257g.get(), (ne0.j) lVar.f270258h.get(), (CryptoExchangeFeesService) lVar.k.get());
            case 2:
                je0.d mapper = (je0.d) lVar.f.get();
                yk0.a databaseSessionProvider = lVar.f270256c.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                of5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "crypto_exchange_fees", mapper, 1, f0.f322471a, 32);
            case 3:
                Json json = (Json) lVar.e.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 4:
                Json json2 = (Json) c.f270226a.getValue();
                s.k(json2);
                return json2;
            case 5:
                return new ne0.d();
            case 6:
                CryptoExchangeFeesService cryptoExchangeFeesService = (CryptoExchangeFeesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) lVar.f270259j.get(), "retrofit", CryptoExchangeFeesService.class, "create(...)");
                s.k(cryptoExchangeFeesService);
                return cryptoExchangeFeesService;
            case 7:
                Retrofit retrofit = ((c21.b) lVar.d).e();
                s.j(retrofit);
                Converter.Factory converterFactory = (Converter.Factory) lVar.i.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitBuild = retrofit.newBuilder().addConverterFactory(converterFactory).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 8:
                Json json3 = (Json) lVar.e.get();
                Intrinsics.checkNotNullParameter(json3, "json");
                return p.a.g(b1.Companion, "application/json", json3);
            default:
                throw new AssertionError(i);
        }
    }
}
