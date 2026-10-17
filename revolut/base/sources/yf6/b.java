package yf6;

import anb.t;
import android.content.Context;
import androidx.room.migration.Migration;
import blb.i;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.revpro.pro_merchant.toggles.impl.data.network.ProMerchantFeatureToggleService;
import com.revolut.feature.travel.experiences.impl.database.TravelExperiencesDatabase;
import com.revolut.kompot.navigable.vc.ViewController;
import ecm.q;
import fnb.j;
import fnb.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx4.x;
import retrofit2.Retrofit;
import sri.m;
import sri.o;
import uo.q0;
import vc.s;
import vjb.h;
import xe0.f;
import xvi.g;
import yji.n;
import yo5.p;
import z0g.b1;
import z0g.r0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements e4m.e {
    public static rjb.a A(rjb.b bVar) {
        rjb.a aVar = (rjb.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static pib.b B(h hVar) {
        pib.b bVar = (pib.b) hVar.b();
        s.k(bVar);
        return bVar;
    }

    public static tib.b C(i iVar) {
        tib.b bVar = (tib.b) iVar.b();
        s.k(bVar);
        return bVar;
    }

    public static ajb.b D(j jVar) {
        ajb.b bVar = (ajb.b) jVar.b();
        s.k(bVar);
        return bVar;
    }

    public static k a(a31.a aVar, a31.a aVar2, r5a.b bVar, r5a.b bVar2) {
        return new k(aVar, aVar2, bVar, bVar2);
    }

    public static n8j.a b(a31.a aVar) {
        return new n8j.a(aVar, 27);
    }

    public static vub.j c(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new vub.j(aVar, aVar2, aVar3, 6);
    }

    public static a d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar) {
        return new a(aVar, aVar2, aVar3, aVar4, qVar);
    }

    public static xe0.e e(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        b1.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "travel_experiences", mapper, 0, null, 56);
    }

    public static vzh.d f(com.revolut.kompot.navigable.a controller, g brightnessObserver, q0 screenNameFinder, uo.b activeScreenHolder, xvi.b brightnessAnalyticsTracker) {
        yvi.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        return ifk.b.c(controller, brightnessObserver, screenNameFinder, activeScreenHolder, brightnessAnalyticsTracker);
    }

    public static vzh.d g(com.revolut.kompot.navigable.a controller, g brightnessObserver, q0 screenNameFinder, uo.b activeScreenHolder, xvi.b brightnessAnalyticsTracker) {
        yvi.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(brightnessObserver, "brightnessObserver");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        return ifk.b.c(controller, brightnessObserver, screenNameFinder, activeScreenHolder, brightnessAnalyticsTracker);
    }

    public static n h(yy.c extension) {
        yy.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static xe0.e i(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "feature_crypto_withdraw", mapper, 0, null, 56);
    }

    public static TravelExperiencesDatabase j(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        TravelExperiencesDatabase.Companion companion = TravelExperiencesDatabase.INSTANCE;
        companion.getClass();
        TravelExperiencesDatabase travelExperiencesDatabase = (TravelExperiencesDatabase) companion.a(context, databaseSessionProvider, new Migration[]{v0g.a.f284843c, v0g.b.f284844c, v0g.c.f284845c, v0g.d.f284846c, v0g.e.f284847c, v0g.f.f284848c, v0g.g.f284849c, v0g.h.f284850c, v0g.i.f284851c}, databaseEncryptionMigratorFactory);
        s.k(travelExperiencesDatabase);
        return travelExperiencesDatabase;
    }

    public static r12.g k(r12.a factory, ViewController controller, y02.c host) {
        z02.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(host, "host");
        return new r12.g(controller, host, factory.f250884a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y02.c l(ViewController controller) {
        z02.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        y02.c cVar = controller instanceof y02.c ? (y02.c) controller : null;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(controller.getClass().getSimpleName().concat(" must implement ApmAreaControllerHost").toString());
    }

    public static m m(Context context) {
        yk9.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static m n(Context context) {
        yo5.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static xq4.k o(CreditCardDescriptionScreenContract$InputData inputData, u80.m moneyFormatter, bp4.h localizationProvider, x contentListItemMapper) {
        yq4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        if (!(inputData instanceof CreditCardDescriptionScreenContract$InputData.Local)) {
            if (inputData instanceof CreditCardDescriptionScreenContract$InputData.Remote) {
                return new ar4.a((CreditCardDescriptionScreenContract$InputData.Remote) inputData, contentListItemMapper);
            }
            throw new NoWhenBranchMatchedException();
        }
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((CreditCardDescriptionScreenContract$InputData.Local) inputData).f69209a;
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit) {
            Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
            return new ar4.d();
        }
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit) {
            return new ar4.g(moneyFormatter);
        }
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit) {
            return new ar4.h();
        }
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.Apr) {
            return new ar4.b();
        }
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod) {
            return new ar4.e();
        }
        if (local instanceof CreditCardDescriptionDestination.DescriptionConfig.Local.LateInterest) {
            return new ar4.c();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static xe0.e p(je0.d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        yfc.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "pro_merchant_toggles", mapper, 2, u.c(new wfc.a()), 32);
    }

    public static xe0.e q(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        ywe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.g(storageFactory, databaseSessionProvider, "post_activation", mapper, bxe.a.f19670b, bxe.a.f19669a, false, 96);
    }

    public static ProMerchantFeatureToggleService r(Retrofit retrofit) {
        yfc.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ProMerchantFeatureToggleService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ProMerchantFeatureToggleService proMerchantFeatureToggleService = (ProMerchantFeatureToggleService) objCreate;
        s.k(proMerchantFeatureToggleService);
        return proMerchantFeatureToggleService;
    }

    public static t0g.c s(TravelExperiencesDatabase database) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        t0g.c cVarG = database.g();
        s.k(cVarG);
        return cVarG;
    }

    public static t0g.e t(TravelExperiencesDatabase database) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        t0g.e eVarH = database.h();
        s.k(eVarH);
        return eVarH;
    }

    public static t0g.f u(TravelExperiencesDatabase database) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        t0g.f fVarI = database.i();
        s.k(fVarI);
        return fVarI;
    }

    public static t0g.g v(TravelExperiencesDatabase database) {
        r0.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        t0g.g gVarJ = database.j();
        s.k(gVarJ);
        return gVarJ;
    }

    public static bi3.d w(bi3.a aVar) {
        bi3.d dVar = (bi3.d) aVar.b();
        s.k(dVar);
        return dVar;
    }

    public static bnb.a x(bnb.b bVar) {
        bnb.a aVar = (bnb.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static rlb.a y(rlb.m mVar) {
        rlb.a aVar = (rlb.a) mVar.b();
        s.k(aVar);
        return aVar;
    }

    public static nib.c z(t tVar) {
        nib.c cVar = (nib.c) tVar.b();
        s.k(cVar);
        return cVar;
    }
}
