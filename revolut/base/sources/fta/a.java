package fta;

import android.content.Context;
import com.revolut.feature.raffle.impl.data.service.RaffleService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ne0.j;
import retrofit2.Converter;
import retrofit2.Retrofit;
import sri.m;
import sri.o;
import ulm.b1;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f137972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137973b;

    public a(b bVar, int i) {
        this.f137972a = bVar;
        this.f137973b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f137972a;
        int i = this.f137973b;
        switch (i) {
            case 0:
                return new hta.e();
            case 1:
                m mVar = (m) bVar.f137981m.get();
                ai5.b bVarB = bVar.f137975b.b();
                s.j(bVarB);
                return new hta.b(mVar, bVarB);
            case 2:
                Context context = bVar.f137974a;
                hta.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return o.c(context, null, null, 14);
            case 3:
                return new ne0.d();
            case 4:
                je0.d mapper = (je0.d) bVar.f137984q.get();
                yk0.a databaseSessionProvider = bVar.d.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = bVar.f137976c.f();
                s.j(storageFactory);
                dta.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "raffle_campaign", mapper, 1, f0.f322471a, 32);
            case 5:
                Json json = (Json) bVar.f137983p.get();
                me0.a factory = bVar.f137976c.e();
                s.j(factory);
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(json);
            case 6:
                Json json2 = (Json) i.f138007a.getValue();
                s.k(json2);
                return json2;
            case 7:
                return new cta.c((ue0.c) bVar.f137985r.get(), (j) bVar.o.get(), (RaffleService) bVar.u.get());
            case 8:
                RaffleService raffleService = (RaffleService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f137987t.get(), "retrofit", RaffleService.class, "create(...)");
                s.k(raffleService);
                return raffleService;
            case 9:
                Retrofit retrofit = ((c21.b) bVar.f137978h).e();
                s.j(retrofit);
                Converter.Factory converterFactory = (Converter.Factory) bVar.f137986s.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitBuild = retrofit.newBuilder().addConverterFactory(converterFactory).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 10:
                Json json3 = (Json) bVar.f137983p.get();
                Intrinsics.checkNotNullParameter(json3, "json");
                return p.a.g(b1.Companion, "application/json", json3);
            default:
                throw new AssertionError(i);
        }
    }
}
