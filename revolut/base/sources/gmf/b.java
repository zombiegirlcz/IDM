package gmf;

import androidx.view.ComponentActivity;
import com.revolut.feature.junior_tasks.impl.services.JuniorTasksService;
import com.revolut.feature.transactions.impl.data.network.WarrantService;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreenContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import gld.f0;
import gp8.r;
import gp8.t;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import mae.p;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.k1;
import rp0.l0;
import rp0.m;
import rp0.x0;
import vc.s;
import yji.n;
import zhm.v;
import zu8.o0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b implements e4m.e {
    public static gp6.a A(gp6.h hVar) {
        gp6.a aVar = (gp6.a) hVar.b();
        s.k(aVar);
        return aVar;
    }

    public static ComponentActivity a(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        BaseDelegatesActivity baseDelegatesActivityV0 = coreActivityApi.v0();
        s.k(baseDelegatesActivityV0);
        return baseDelegatesActivityV0;
    }

    public static xy0.a b(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        xy0.a aVarY = coreActivityApi.Y();
        s.k(aVarY);
        return aVarY;
    }

    public static d01.g c(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        d01.g gVarT0 = coreActivityApi.t0();
        s.k(gVarT0);
        return gVarT0;
    }

    public static jz0.d d(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        jz0.d dVarA0 = coreActivityApi.a0();
        s.k(dVarA0);
        return dVarA0;
    }

    public static c01.d e(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        c01.d dVarW = coreActivityApi.W();
        s.k(dVarW);
        return dVarW;
    }

    public static lz0.g f(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        lz0.g gVarC0 = coreActivityApi.c0();
        s.k(gVarC0);
        return gVarC0;
    }

    public static py0.e g(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        py0.e eVarX = coreActivityApi.X();
        s.k(eVarX);
        return eVarX;
    }

    public static c90.c h(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        return new c90.c(coreActivityApi.getActivity());
    }

    public static py0.f i(fsi.g coreActivityApi) {
        gsi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
        py0.f fVarN0 = coreActivityApi.n0();
        s.k(fVarN0);
        return fVarN0;
    }

    public static t j(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, ede.a aVar8, a31.a aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static gpc.b k(a1j.a aVar, a1j.a aVar2, a31.a aVar3) {
        return new gpc.b(aVar, aVar2, aVar3, 0);
    }

    public static i9e.f l(p factory, f01.a uiKitResources) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        return factory.b(uiKitResources);
    }

    public static void m(gp8.p pVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
    }

    public static Retrofit n(gp8.p pVar, Retrofit retrofit, o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static JuniorTasksService o(gp8.p pVar, Retrofit retrofit) {
        JuniorTasksService juniorTasksService = (JuniorTasksService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", JuniorTasksService.class, "create(...)");
        s.k(juniorTasksService);
        return juniorTasksService;
    }

    public static xe0.e p(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_tasks", mapper, 3, v.k(new mp8.a(), new mp8.b(), new mp8.c()), 32);
    }

    public static l0 q(com.revolut.kompot.navigable.a controller) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new l0(controller.m2());
    }

    public static bub.a r(g2e.t provider) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object obj2 = ((o0) provider.f140031b).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (bub.a) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n s(bub.a extension) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        n nVar = (n) extension;
        s.k(nVar);
        return nVar;
    }

    public static j60.c t(com.revolut.kompot.navigable.a controller, m dialogDisplayer, he2.b dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static WarrantService u(Retrofit retrofit) {
        j.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(WarrantService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WarrantService warrantService = (WarrantService) objCreate;
        s.k(warrantService);
        return warrantService;
    }

    public static k1 v(com.revolut.kompot.navigable.a controller) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return x0.a(g1.Companion, controller.D2());
    }

    public static f0 w(mkd.g view, rkd.m factory) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(view);
    }

    public static mae.o x(p factory, f01.a uiKitResources, t70.b currenciesLocalization) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }

    public static k71.i y(TransactionDetailsScreenContract$InputData inputData) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k71.i iVar = inputData.f92057a;
        s.k(iVar);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mga.l0 z(com.revolut.kompot.navigable.a controller) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        mga.l0 l0Var = (mga.l0) controller;
        s.k(l0Var);
        return l0Var;
    }
}
