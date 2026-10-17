package g7h;

import android.content.Context;
import androidx.room.migration.Migration;
import b9g.b0;
import b9g.d0;
import b9g.e0;
import b9g.f0;
import b9g.g;
import b9g.k;
import b9g.l;
import b9g.o;
import b9g.p;
import b9g.q;
import b9g.r;
import b9g.t;
import b9g.v;
import b9g.w;
import b9g.x;
import b9g.y;
import b9g.z;
import com.revolut.core.faq.data.network.AiSearchService;
import com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import dag.a;
import e4m.e;
import eg0.h;
import eg0.i;
import eg0.j;
import g9g.q1;
import g9g.v1;
import g9g.x1;
import g9g.z1;
import gg0.f;
import hg0.d;
import hg0.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import qz0.n;
import r9g.j0;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import wf0.a0;
import wf0.c0;
import wf0.g0;
import z8g.s;
import z8g.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements e {
    public static s A(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        s sVarP = database.p();
        vc.s.k(sVarP);
        return sVarP;
    }

    public static u B(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        u uVarQ = database.q();
        vc.s.k(uVarQ);
        return uVarQ;
    }

    public static TravelHotelsService C(Retrofit retrofit) {
        v1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TravelHotelsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelHotelsService travelHotelsService = (TravelHotelsService) objCreate;
        vc.s.k(travelHotelsService);
        return travelHotelsService;
    }

    public static n D(z1 z1Var, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new n(context, null, null);
    }

    public static hg0.b a(f fVar, hg0.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    public static void b(f fVar, a0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
    }

    public static c0 c(f fVar, g0 impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static d d(f fVar, m interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    public static eg0.a e(f fVar, h impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static i f(f fVar, j impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static fg0.e g(f fVar, fg0.e impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static jpc.e h(q3d.h factory) {
        gd7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(factory.f241955c);
    }

    public static a2d.m i(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new a2d.m(aVar, aVar2, aVar3, 8);
    }

    public static a51.d j(c63.b bVar) {
        return new a51.d(bVar, 8);
    }

    public static AiSearchService k(Retrofit retrofit) {
        gg0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(AiSearchService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AiSearchService aiSearchService = (AiSearchService) objCreate;
        vc.s.k(aiSearchService);
        return aiSearchService;
    }

    public static TravelHotelsDatabase l(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        TravelHotelsDatabase.Companion companion = TravelHotelsDatabase.INSTANCE;
        companion.getClass();
        TravelHotelsDatabase travelHotelsDatabase = (TravelHotelsDatabase) companion.a(context, databaseSessionProvider, new Migration[]{k.f13764c, v.f13775c, b9g.a0.f13748c, b0.f13750c, b9g.c0.f13752c, d0.f13754c, e0.f13756c, f0.f13758c, b9g.g0.f13760c, b9g.a.f13747c, b9g.b.f13749c, b9g.c.f13751c, b9g.d.f13753c, b9g.e.f13755c, b9g.f.f13757c, g.f13759c, b9g.h.f13761c, b9g.i.f13762c, b9g.j.f13763c, l.f13765c, b9g.m.f13766c, b9g.n.f13767c, o.f13768c, p.f13769c, q.f13770c, r.f13771c, b9g.s.f13772c, t.f13773c, b9g.u.f13774c, w.f13776c, x.f13777c, y.f13778c, z.f13779c}, databaseEncryptionMigratorFactory);
        vc.s.k(travelHotelsDatabase);
        return travelHotelsDatabase;
    }

    public static kg.o m(kg.o gson) {
        v1.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(gson, "<this>");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("filterType", z9g.c.class, false, false);
        mVar.c(z9g.a.class, "BOOLEAN");
        mVar.c(z9g.b.class, "CHECKBOX");
        mVar.c(z9g.f.class, "RADIO");
        mVar.c(z9g.l.class, "PRICE_RANGE");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVar);
        he0.m mVar2 = new he0.m("filterType", z9g.q.class, false, false);
        mVar2.c(z9g.o.class, "BOOLEAN");
        mVar2.c(z9g.p.class, "CHECKBOX");
        mVar2.c(z9g.u.class, "RADIO");
        mVar2.c(z9g.t.class, "PRICE_RANGE");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        he0.m mVar3 = new he0.m("type", j0.class, false, false);
        mVar3.c(j0.d.class, "UNCHANGED");
        mVar3.c(j0.a.class, "AMOUNT_OWED");
        mVar3.c(j0.c.class, "REFUND");
        mVar3.c(j0.b.class, "NEW_PRICE");
        mVar3.c(j0.e.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
        arrayList.add(mVar3);
        he0.m mVar4 = new he0.m("type", dag.a.class, false, false);
        mVar4.c(a.C0668a.class, "location");
        mVar4.c(a.b.class, "property");
        mVar4.c(a.c.class, "smart_search");
        mVar4.c(a.d.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar4, "registerFallbackSubtype(...)");
        arrayList.add(mVar4);
        Intrinsics.checkNotNullExpressionValue(pVar, "registerTypeAdapterFactory(...)");
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit n(Retrofit retrofit, kg.o gson, OkHttpClient okHttpClient, q9g.a searchSessionInterceptor) {
        v1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(searchSessionInterceptor, "searchSessionInterceptor");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        builderNewBuilder.addConverterFactory(GsonConverterFactory.create(gson));
        OkHttpClient.a aVarA = okHttpClient.a();
        aVarA.a(searchSessionInterceptor);
        Retrofit retrofitBuild = builderNewBuilder.client(new OkHttpClient(aVarA)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static le0.a o(kg.o gson, le0.b gsonObjectMapperFactory) {
        x1.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return gsonObjectMapperFactory.a(gson);
    }

    public static i7h.a p(WealthDatabase db8) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        i7h.a aVarH = db8.h();
        vc.s.k(aVarH);
        return aVarH;
    }

    public static xe0.e q(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        x1.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "travel_hotels", mapper, 2, null, 48);
    }

    public static z8g.b r(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.b bVarG = database.g();
        vc.s.k(bVarG);
        return bVarG;
    }

    public static z8g.d s(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.d dVarH = database.h();
        vc.s.k(dVarH);
        return dVarH;
    }

    public static z8g.l t(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.l lVarL = database.l();
        vc.s.k(lVarL);
        return lVarL;
    }

    public static z8g.f u(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.f fVarI = database.i();
        vc.s.k(fVarI);
        return fVarI;
    }

    public static z8g.g v(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.g gVarJ = database.j();
        vc.s.k(gVarJ);
        return gVarJ;
    }

    public static z8g.j w(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.j jVarK = database.k();
        vc.s.k(jVarK);
        return jVarK;
    }

    public static z8g.n x(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.n nVarM = database.m();
        vc.s.k(nVarM);
        return nVarM;
    }

    public static z8g.p y(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.p pVarN = database.n();
        vc.s.k(pVarN);
        return pVarN;
    }

    public static z8g.r z(TravelHotelsDatabase database) {
        q1.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        z8g.r rVarO = database.o();
        vc.s.k(rVarO);
        return rVarO;
    }
}
