package ms1;

import android.content.Context;
import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoStatsService;
import kotlin.jvm.internal.Intrinsics;
import lyd.x;
import ove.a0;
import ove.i0;
import ove.r0;
import ove.t0;
import qve.w;
import retrofit2.Retrofit;
import rp0.g1;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g implements e4m.e {
    public static a0 A(r0 r0Var) {
        a0 a0Var = (a0) r0Var.b();
        vc.s.k(a0Var);
        return a0Var;
    }

    public static ove.t B(t0 t0Var) {
        ove.t tVar = (ove.t) t0Var.b();
        vc.s.k(tVar);
        return tVar;
    }

    public static w C(qve.a0 a0Var) {
        w wVar = (w) a0Var.b();
        vc.s.k(wVar);
        return wVar;
    }

    public static msb.a D(fsi.g coreActivityApi) {
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        msb.a aVarS0 = coreActivityApi.s0();
        vc.s.k(aVarS0);
        return aVarS0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n a(lvf.a extension) {
        mvf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return nVar;
    }

    public static pfe.b b(a35.g dataSource) {
        n25.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return dataSource;
    }

    public static pfe.g c(a35.l dataSource) {
        n25.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return dataSource;
    }

    public static pfe.g d(s25.d dataSource) {
        n25.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return dataSource;
    }

    public static ax4.c e(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        return new ax4.c(qVar, aVar, aVar2, aVar3, 13);
    }

    public static c3d.a f(a31.a aVar, a31.a aVar2, ecm.q qVar) {
        return new c3d.a(qVar, aVar, aVar2, 14);
    }

    public static n2d.g g(n2d.h factory, g1 shotDialogDisplayer) {
        n1d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        return new n2d.g(factory.f211529a, factory.f211530b, factory.f211531c, factory.d, shotDialogDisplayer, factory.e);
    }

    public static n2d.f h(n2d.h factory, m1d.b view, m1d.a model) {
        n1d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        return new n2d.f(view, model);
    }

    public static CryptoStatsService i(Retrofit retrofit) {
        mw5.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CryptoStatsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoStatsService cryptoStatsService = (CryptoStatsService) objCreate;
        vc.s.k(cryptoStatsService);
        return cryptoStatsService;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        mw5.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_crypto_stats", mapper, 0, null, 56);
    }

    public static Retrofit k(kg.o gson, Retrofit retrofit) {
        mw5.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static xe0.e l(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        n06.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_data_tracer", mapper, 0, null, 56);
    }

    public static a67.a m(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.a(factory.f251535c, 4);
    }

    public static lyd.d n(lyd.n mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper;
    }

    public static lyd.p o(lyd.u contentSource, d7e.b userAccountCreatedDateProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(userAccountCreatedDateProvider, "userAccountCreatedDateProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new lyd.p(contentSource, userAccountCreatedDateProvider, dateProvider);
    }

    public static sri.m p(Context context) {
        mva.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m q(Context context) {
        mw5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static lyd.d r(lyd.n mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper;
    }

    public static lyd.p s(lyd.w contentSource, d7e.b userAccountCreatedDateProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(userAccountCreatedDateProvider, "userAccountCreatedDateProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new lyd.p(contentSource, userAccountCreatedDateProvider, dateProvider);
    }

    public static lyd.d t(lyd.n mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper;
    }

    public static lyd.p u(x contentSource, d7e.b userAccountCreatedDateProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(userAccountCreatedDateProvider, "userAccountCreatedDateProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        return new lyd.p(contentSource, userAccountCreatedDateProvider, dateProvider);
    }

    public static mae.o v(Context context, mae.p factory, t70.b currenciesLocalization) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(new f01.c(context), currenciesLocalization);
    }

    public static i w(a aVar) {
        i iVar = (i) aVar.b();
        vc.s.k(iVar);
        return iVar;
    }

    public static ove.g x(i0 i0Var) {
        ove.g gVar = (ove.g) i0Var.b();
        vc.s.k(gVar);
        return gVar;
    }

    public static yji.n y(wn.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    public static pve.a z(pve.b bVar) {
        pve.a aVar = (pve.a) bVar.b();
        vc.s.k(aVar);
        return aVar;
    }
}
