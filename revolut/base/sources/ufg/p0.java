package ufg;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewKt;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.feature.banners.impl.data.database.BannersDatabase;
import com.revolut.feature.banners.impl.data.network.BannersService;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import com.revolut.feature.freelancer.impl.network.services.AcquiringPaymentsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerBrandingService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCashbackService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCustomersService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerLearnLessonsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsService;
import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rp0.g1;
import rp0.k1;
import rp0.x0;
import st6.f;
import us6.v3;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p0 implements e4m.e {
    public static LinkedHashMap A(ImmutableMap providersMap) {
        Intrinsics.checkNotNullParameter(providersMap, "providersMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(providersMap.size()));
        Iterator it8 = providersMap.entrySet().iterator();
        while (it8.hasNext()) {
            linkedHashMap.put(((Map.Entry) it8.next()).getKey(), new rp0.m());
        }
        return linkedHashMap;
    }

    public static LinkedHashMap B(com.revolut.kompot.navigable.a controller, he2.b dialogHostFinder, Map displayersMap) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        Intrinsics.checkNotNullParameter(displayersMap, "displayersMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(displayersMap.size()));
        for (Map.Entry entry : displayersMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), new j60.c(controller, (rp0.m) entry.getValue(), dialogHostFinder));
        }
        return linkedHashMap;
    }

    public static whc.b C(whc.a0 a0Var) {
        whc.b bVar = (whc.b) a0Var.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static whc.s D(whc.f0 f0Var) {
        whc.s sVar = (whc.s) f0Var.b();
        vc.s.k(sVar);
        return sVar;
    }

    public static ae9.d a(r5a.b bVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new ae9.d(bVar, aVar, aVar2, aVar3, aVar4, 7);
    }

    public static k4i.a b(ecm.q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, r5a.b bVar, r5a.b bVar2, r5a.b bVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7) {
        return new k4i.a(qVar, aVar, aVar2, aVar3, bVar, bVar2, bVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static n8j.a c(a31.a aVar) {
        return new n8j.a(aVar, 20);
    }

    public static s5d.b d(a31.a aVar, a31.a aVar2) {
        return new s5d.b(aVar, aVar2, 3);
    }

    public static u41.d e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, ecm.q qVar) {
        return new u41.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, qVar);
    }

    public static uie.c f(r5a.b bVar, r5a.b bVar2) {
        return new uie.c(bVar, bVar2, 1);
    }

    public static LinkedHashMap g(ImmutableMap providersMap, Map extensionsMap, rp0.l0 popupMenuDialogDisplayer, vhe.a mainContainerAnchorViewProvider, com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(providersMap, "providersMap");
        Intrinsics.checkNotNullParameter(extensionsMap, "extensionsMap");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(mainContainerAnchorViewProvider, "mainContainerAnchorViewProvider");
        Intrinsics.checkNotNullParameter(controller, "controller");
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(extensionsMap.size()));
        for (Map.Entry entry : extensionsMap.entrySet()) {
            Object key = entry.getKey();
            ProductId productId = (ProductId) entry.getKey();
            j60.a aVar = (j60.a) entry.getValue();
            View view = controller.C2().D2();
            V v = providersMap.get(productId);
            if (v == 0) {
                throw new IllegalArgumentException("Required value was null.");
            }
            pfe.d dVar = (pfe.d) v;
            x0 x0Var = g1.Companion;
            Intrinsics.checkNotNullParameter(view, "view");
            View view2 = null;
            Object obj2 = null;
            if (((jte.d) mainContainerAnchorViewProvider.f289469a).c(TabAccountsApi$Toggles.ManualShotAnchorOnHome.f89458c)) {
                Iterator it8 = ViewKt.getAllViews(view).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (((View) next) instanceof FloatingBottomBarView) {
                        obj2 = next;
                        break;
                    }
                }
                view2 = (View) obj2;
            }
            x0Var.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            linkedHashMap.put(key, dVar.a(aVar, popupMenuDialogDisplayer, new k1(view, view2)));
        }
        return linkedHashMap;
    }

    public static AcquiringOrdersService h(v3 v3Var, Retrofit retrofit) {
        AcquiringOrdersService acquiringOrdersService = (AcquiringOrdersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AcquiringOrdersService.class, "create(...)");
        vc.s.k(acquiringOrdersService);
        return acquiringOrdersService;
    }

    public static AcquiringPaymentsService i(v3 v3Var, Retrofit retrofit) {
        AcquiringPaymentsService acquiringPaymentsService = (AcquiringPaymentsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AcquiringPaymentsService.class, "create(...)");
        vc.s.k(acquiringPaymentsService);
        return acquiringPaymentsService;
    }

    public static oq2.a j(BannersDatabase database) {
        uq2.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        oq2.a aVarG = database.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static tl7.f k(j60.a innerExtension, vn7.a hintPopupFactory, in7.a choicePopupFactory, yl7.a datePickerPopupFactory, yl7.b monthPickerPopupFactory, yl7.e timePickerPopupFactory) {
        Intrinsics.checkNotNullParameter(innerExtension, "innerExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(choicePopupFactory, "choicePopupFactory");
        Intrinsics.checkNotNullParameter(datePickerPopupFactory, "datePickerPopupFactory");
        Intrinsics.checkNotNullParameter(monthPickerPopupFactory, "monthPickerPopupFactory");
        Intrinsics.checkNotNullParameter(timePickerPopupFactory, "timePickerPopupFactory");
        return new tl7.f(innerExtension, hintPopupFactory, choicePopupFactory, datePickerPopupFactory, monthPickerPopupFactory, timePickerPopupFactory);
    }

    public static yji.d l(tl7.f extension) {
        ul7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return extension;
    }

    public static FreelancerBrandingService m(v3 v3Var, Retrofit retrofit) {
        FreelancerBrandingService freelancerBrandingService = (FreelancerBrandingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerBrandingService.class, "create(...)");
        vc.s.k(freelancerBrandingService);
        return freelancerBrandingService;
    }

    public static FreelancerCustomersService n(v3 v3Var, Retrofit retrofit) {
        FreelancerCustomersService freelancerCustomersService = (FreelancerCustomersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerCustomersService.class, "create(...)");
        vc.s.k(freelancerCustomersService);
        return freelancerCustomersService;
    }

    public static BannersDatabase o(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        uq2.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context, BannersDatabase.class, "banners_db");
        BannersDatabase.INSTANCE.getClass();
        BannersDatabase bannersDatabase = (BannersDatabase) builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(new Migration[0], 0)).fallbackToDestructiveMigration().openHelperFactory(new ce0.d(((bl0.g) databaseEncryptionMigratorFactory).a("banners_db", databaseSessionProvider.getToken()))).build();
        vc.s.k(bannersDatabase);
        return bannersDatabase;
    }

    public static kg.o p(v3 v3Var, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("verificationType", st6.f.class, false, true);
        mVar.c(f.d.class, "URL_SPECIFICATION");
        mVar.c(f.a.class, "PROOF_OF_ACTIVITY");
        mVar.c(f.c.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        pVar.e.add(mVar);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static Retrofit q(v3 v3Var, Retrofit retrofit, kg.o oVar) {
        Retrofit.Builder builderX = p.a.x(retrofit, "retrofit", oVar, "gson");
        builderX.converterFactories().clear();
        Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static FreelancerCashbackService r(v3 v3Var, Retrofit retrofit) {
        FreelancerCashbackService freelancerCashbackService = (FreelancerCashbackService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerCashbackService.class, "create(...)");
        vc.s.k(freelancerCashbackService);
        return freelancerCashbackService;
    }

    public static FreelancerSettingsService s(v3 v3Var, Retrofit retrofit) {
        FreelancerSettingsService freelancerSettingsService = (FreelancerSettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerSettingsService.class, "create(...)");
        vc.s.k(freelancerSettingsService);
        return freelancerSettingsService;
    }

    public static FreelancerLearnLessonsService t(v3 v3Var, Retrofit retrofit) {
        FreelancerLearnLessonsService freelancerLearnLessonsService = (FreelancerLearnLessonsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreelancerLearnLessonsService.class, "create(...)");
        vc.s.k(freelancerLearnLessonsService);
        return freelancerLearnLessonsService;
    }

    public static ag.p u(skb.f sheetsModelProvider, f80.a uriHelper, wli.x deeplinkHandler) {
        ukb.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(sheetsModelProvider, "sheetsModelProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        return new ag.p(sheetsModelProvider, 20, uriHelper, deeplinkHandler);
    }

    public static rp0.l0 v(com.revolut.kompot.navigable.a controller) {
        uhe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new rp0.l0(controller.m2());
    }

    public static BannersService w(Retrofit retrofit) {
        BannersService bannersService = (BannersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", BannersService.class, "create(...)");
        vc.s.k(bannersService);
        return bannersService;
    }

    public static vl3.n x(vl3.c cVar) {
        vl3.n nVar = (vl3.n) cVar.b();
        vc.s.k(nVar);
        return nVar;
    }

    public static Set y(Map handlersMap) {
        uhe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(handlersMap, "handlersMap");
        Collection<pfe.c> collectionValues = handlersMap.values();
        ArrayList arrayList = new ArrayList(zhm.w.t(collectionValues, 10));
        for (pfe.c cVar : collectionValues) {
            arrayList.add(ue0.e.J(cVar, zhm.d0.d1(cVar.Z2())));
        }
        Set setI1 = zhm.d0.i1(zhm.w.u(arrayList));
        vc.s.k(setI1);
        return setI1;
    }

    public static Set z(Map extensionsMap) {
        Intrinsics.checkNotNullParameter(extensionsMap, "extensionsMap");
        Collection<Object> collectionValues = extensionsMap.values();
        ArrayList arrayList = new ArrayList(zhm.w.t(collectionValues, 10));
        for (Object obj2 : collectionValues) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerExtension");
            arrayList.add((yji.d) obj2);
        }
        Set setI1 = zhm.d0.i1(arrayList);
        vc.s.k(setI1);
        return setI1;
    }
}
