package cdj;

import android.content.Context;
import android.view.View;
import cf7.r;
import com.revolut.feature.external_accounts.impl.repository.network.PseService;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.network.CryptoDetailsAboutService;
import cpi.m;
import cu1.j;
import cwi.g;
import cwi.t;
import e4m.e;
import ecm.q;
import hqa.c;
import java.time.Instant;
import je0.d;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import lxi.i;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.k1;
import rp0.x0;
import vc.s;
import xe0.f;
import yji.n;
import zhm.f0;
import zhm.u;
import zz1.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements e {
    public static xe0.e A(d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "adoption_incentive_reward", mapper, rf7.a.f253706b, rf7.a.f253705a, 32);
    }

    public static xe0.e B(o baseGson, le0.b gsonObjectMapperFactory, f storageFactory, yk0.a databaseSessionProvider) {
        cva.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "hidden_payments", gsonObjectMapperFactory.a(new p(baseGson).b()), 1, f0.f322471a, 32);
    }

    public static n C(bgg.a extension) {
        cgg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static j D(cu1.b bVar) {
        j jVar = (j) bVar.b();
        s.k(jVar);
        return jVar;
    }

    public static a51.d a(a1j.a aVar) {
        return new a51.d(aVar, 4);
    }

    public static g b(q qVar, a1j.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23) {
        return new g(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23);
    }

    public static a51.d c(a1j.a aVar) {
        return new a51.d(aVar, 5);
    }

    public static xe0.e d(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "airport_lounge_pass_details_list", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
    }

    public static xe0.e e(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "airport_lounge_pass_passengers", mapper, 1, f0.f322471a, 32);
    }

    public static i f(lxi.j walletPassItemMapper) {
        cwi.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(walletPassItemMapper, "walletPassItemMapper");
        return new i(new cwi.b(), walletPassItemMapper);
    }

    public static uy1.j g(uy1.b factory) {
        cu1.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        h.Companion.getClass();
        return factory.a(h.e);
    }

    public static CryptoDetailsAboutService h(a aVar, Retrofit retrofit) {
        CryptoDetailsAboutService cryptoDetailsAboutService = (CryptoDetailsAboutService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CryptoDetailsAboutService.class, "create(...)");
        s.k(cryptoDetailsAboutService);
        return cryptoDetailsAboutService;
    }

    public static q i(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 6));
    }

    public static q j(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 4));
    }

    public static q k(q contextParam) {
        cpi.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextParam, "contextParam");
        return new q(new cpi.a(contextParam, 1));
    }

    public static o l(a aVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        pVar.c(new he0.e(), Instant.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit m(a aVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static rlm.o n(c jsonProvider) {
        Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
        rlm.o oVar = jsonProvider.f154654a;
        s.k(oVar);
        return oVar;
    }

    public static q o(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 3));
    }

    public static q p(q contextParam) {
        cpi.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextParam, "contextParam");
        return new q(new cpi.a(contextParam, 0));
    }

    public static sri.m q(Context context) {
        cf7.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m r(Context context) {
        cwi.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static q s(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 5));
    }

    public static fl0.a t(Json json, me0.a factory) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(json);
    }

    public static xe0.e u(d mapper, f storageFactory, yk0.a dbSessionProvider) {
        cg6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, dbSessionProvider, "pse_storage", mapper, 0, null, 56);
    }

    public static q v(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 7));
    }

    public static q w(m mVar) {
        mVar.getClass();
        return new q(new cpi.j(mVar, 8));
    }

    public static q x(m mVar) {
        mVar.getClass();
        return new q(new cpi.b(1));
    }

    public static PseService y(Retrofit retrofit) {
        cg6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PseService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PseService pseService = (PseService) objCreate;
        s.k(pseService);
        return pseService;
    }

    public static k1 z(ViewController controller) {
        cml.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0 x0Var = g1.Companion;
        View decorView = controller.m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return x0.a(x0Var, decorView);
    }
}
