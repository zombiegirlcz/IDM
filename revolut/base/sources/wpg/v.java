package wpg;

import aa0.y;
import ad0.w;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.loan.impl.network.LoanCancellationService;
import com.revolut.feature.credit.loan.impl.network.LoanChecklistService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import yc0.a0;
import yc0.b0;
import yc0.e0;
import yc0.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class v implements e4m.e {
    public static b9k.f A(x0h.a aVar, sz5.f factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        tsk.t topMoversInteractor = (tsk.t) factory.f266766b;
        e9h.d performanceAssetsTransformer = (e9h.d) factory.f266765a;
        adh.a performanceCalculator = (adh.a) factory.f266767c;
        rul.e metaCollectionInstrumentsInteractor = (rul.e) factory.f;
        gte.a featureToggleInteractor = (gte.a) factory.f266768g;
        Intrinsics.checkNotNullParameter(topMoversInteractor, "topMoversInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(metaCollectionInstrumentsInteractor, "metaCollectionInstrumentsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        b9k.f fVar = new b9k.f();
        fVar.f13817b = topMoversInteractor;
        fVar.f13816a = performanceAssetsTransformer;
        fVar.f13818c = performanceCalculator;
        fVar.d = metaCollectionInstrumentsInteractor;
        fVar.e = featureToggleInteractor;
        return fVar;
    }

    public static w3e.b B(w3e.c cVar) {
        w3e.b bVar = (w3e.b) cVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static zrf.g C(zrf.m transferInstalmentSelectionSectionProvider, yrf.a sectionDialogMapper) {
        Intrinsics.checkNotNullParameter(transferInstalmentSelectionSectionProvider, "transferInstalmentSelectionSectionProvider");
        Intrinsics.checkNotNullParameter(sectionDialogMapper, "sectionDialogMapper");
        return new zrf.g(transferInstalmentSelectionSectionProvider, sectionDialogMapper);
    }

    public static List D(zrf.g headerSectionProvider, zrf.m instalmentSelectionSectionProvider, zrf.n transferReasonSectionProvider) {
        Intrinsics.checkNotNullParameter(headerSectionProvider, "headerSectionProvider");
        Intrinsics.checkNotNullParameter(instalmentSelectionSectionProvider, "instalmentSelectionSectionProvider");
        Intrinsics.checkNotNullParameter(transferReasonSectionProvider, "transferReasonSectionProvider");
        List listK = zhm.v.k(headerSectionProvider, instalmentSelectionSectionProvider, transferReasonSectionProvider);
        vc.s.k(listK);
        return listK;
    }

    public static ad0.i a(x90.c cVar, ad0.n entitiesMapper) {
        Intrinsics.checkNotNullParameter(entitiesMapper, "entitiesMapper");
        return new ad0.i(entitiesMapper);
    }

    public static e0m.d b(qc0.h pm7) {
        x90.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(pm7, "pm");
        vc.s.k(pm7);
        return pm7;
    }

    public static yc0.c c(x90.c cVar, b0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new yc0.c(provider);
    }

    public static yc0.g d(x90.c cVar, qc0.k state, la0.c flowProvider, ImmutableMap saturators) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
        Intrinsics.checkNotNullParameter(saturators, "saturators");
        return new yc0.g(new ma0.a(state), flowProvider, saturators);
    }

    public static la0.c e(x90.c cVar, qc0.k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new la0.c(state);
    }

    public static mae.o f(mae.p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        x9e.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.a(uiKitResources, currenciesLocalization);
    }

    public static aa0.b0 g(x90.c cVar, z80.b phoneToolsProvider, y cardNumberValidator) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(cardNumberValidator, "cardNumberValidator");
        return new aa0.b0(phoneToolsProvider, cardNumberValidator);
    }

    public static aa0.d h(x90.c cVar, y cardNumberValidator) {
        Intrinsics.checkNotNullParameter(cardNumberValidator, "cardNumberValidator");
        return new aa0.d(cardNumberValidator);
    }

    public static y i(x90.c cVar, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        return new y(regexMatcher);
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        x5j.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "commodity_asset_details_storage", mapper, 0, null, 56);
    }

    public static fz.c k(LifecycleOwner lifecycleOwner) {
        wy.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        fz.c cVar = (fz.c) lifecycleOwner;
        vc.s.k(cVar);
        return cVar;
    }

    public static yc0.m l(x90.c cVar, l80.e provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new yc0.m(provider);
    }

    public static xe0.e m(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        wxc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "feature_selfserve_entity_config", mapper, 4, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5)), 32);
    }

    public static yc0.u n(x90.c cVar, yc0.e iconMapper, yc0.p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        return new yc0.u(iconMapper, htmlStringItemMapper);
    }

    public static ad0.r o(x90.c cVar, yc0.q imageItemMapper, yc0.r infoListItemMapper, ad0.c backendCardMapper, w widgetProgressionItemMapper, f0 transactionCellItemMapper, ad0.h entitiesListItemMapper, ad0.n entitiesMapper, u9l.a sharedTransactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(infoListItemMapper, "infoListItemMapper");
        Intrinsics.checkNotNullParameter(backendCardMapper, "backendCardMapper");
        Intrinsics.checkNotNullParameter(widgetProgressionItemMapper, "widgetProgressionItemMapper");
        Intrinsics.checkNotNullParameter(transactionCellItemMapper, "transactionCellItemMapper");
        Intrinsics.checkNotNullParameter(entitiesListItemMapper, "entitiesListItemMapper");
        Intrinsics.checkNotNullParameter(entitiesMapper, "entitiesMapper");
        Intrinsics.checkNotNullParameter(sharedTransactionIconResourcesMapper, "sharedTransactionIconResourcesMapper");
        return new ad0.r(imageItemMapper, infoListItemMapper, backendCardMapper, widgetProgressionItemMapper, transactionCellItemMapper, entitiesListItemMapper, entitiesMapper, sharedTransactionIconResourcesMapper);
    }

    public static bd0.b p(x90.c cVar, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new bd0.b(new f01.c(contextProvider.getContext()));
    }

    public static LoanCancellationService q(x45.b bVar, Retrofit retrofit) {
        LoanCancellationService loanCancellationService = (LoanCancellationService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LoanCancellationService.class, "create(...)");
        vc.s.k(loanCancellationService);
        return loanCancellationService;
    }

    public static LoanChecklistService r(x45.b bVar, Retrofit retrofit) {
        LoanChecklistService loanChecklistService = (LoanChecklistService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LoanChecklistService.class, "create(...)");
        vc.s.k(loanChecklistService);
        return loanChecklistService;
    }

    public static yc0.f s(x90.c cVar, b0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new yc0.f(provider);
    }

    public static a0 t(x90.c cVar, bd0.d searchDetector) {
        Intrinsics.checkNotNullParameter(searchDetector, "searchDetector");
        return new a0(searchDetector);
    }

    public static la0.j u(x90.c cVar, qc0.k state, smd.s startScreenDetector) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(startScreenDetector, "startScreenDetector");
        return new la0.j(startScreenDetector, state);
    }

    public static sri.m v(Context context) {
        x5j.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static e0 w(x90.c cVar, yc0.r infoListItemMapper, yc0.p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(infoListItemMapper, "infoListItemMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        return new e0(infoListItemMapper, htmlStringItemMapper);
    }

    public static otc.b x(wwc.b bVar) {
        otc.b bVar2 = otc.b.RETAIL;
        vc.s.k(bVar2);
        return bVar2;
    }

    public static f0 y(x90.c cVar, hbl.d sharedTransactionMapper) {
        Intrinsics.checkNotNullParameter(sharedTransactionMapper, "sharedTransactionMapper");
        return new f0(sharedTransactionMapper);
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "vaults_messaging", mapper, 0, null, 56);
    }
}
