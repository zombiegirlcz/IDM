package gc5;

import com.revolut.feature.crypto.account.impl.service.CryptoAccountService;
import e4m.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ulm.b1;
import vc.s;
import xe0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f142336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142337b;

    public b(c cVar, int i) {
        this.f142336a = cVar;
        this.f142337b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f142336a;
        ee0.a aVar = cVar.f142338a;
        int i = this.f142337b;
        switch (i) {
            case 0:
                return new hc5.a((kc5.b) cVar.k.get());
            case 1:
                return new kc5.b((ue0.c) cVar.f.get(), (j) cVar.f142341g.get(), (CryptoAccountService) cVar.f142343j.get());
            case 2:
                d mapper = (d) cVar.e.get();
                yk0.a databaseSessionProvider = cVar.f142339b.b();
                s.j(databaseSessionProvider);
                f storageFactory = aVar.f();
                s.j(storageFactory);
                lc5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return f.f(storageFactory, databaseSessionProvider, "crypto_account", mapper, 1, f0.f322471a, 32);
            case 3:
                Json json = (Json) cVar.d.get();
                me0.a factory = aVar.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 4:
                Json json2 = (Json) a.f142335a.getValue();
                s.k(json2);
                return json2;
            case 5:
                return new ne0.d();
            case 6:
                CryptoAccountService cryptoAccountService = (CryptoAccountService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) cVar.i.get(), "retrofit", CryptoAccountService.class, "create(...)");
                s.k(cryptoAccountService);
                return cryptoAccountService;
            case 7:
                Retrofit retrofit = ((c21.b) cVar.f142340c).e();
                s.j(retrofit);
                Converter.Factory converterFactory = (Converter.Factory) cVar.f142342h.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitBuild = retrofit.newBuilder().addConverterFactory(converterFactory).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 8:
                Json json3 = (Json) cVar.d.get();
                Intrinsics.checkNotNullParameter(json3, "json");
                return p.a.g(b1.Companion, "application/json", json3);
            default:
                throw new AssertionError(i);
        }
    }
}
