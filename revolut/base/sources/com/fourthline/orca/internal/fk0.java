package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class fk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f28544b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dk0 f28545a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public fk0(dk0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f28545a = flowConfig;
    }

    public final dl0 a(r70 mainRepository, vc1 skipPersonDetailsUseCase) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        return new dl0(s70.a(mainRepository), skipPersonDetailsUseCase);
    }

    public final ol0 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new ol0(tracker);
    }

    public final i80 a(p71 inputValidator) {
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        return new j80(inputValidator);
    }

    public final ll0 a(List countries, ux filterCountriesUseCase, ce1 stringExtractor) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        return new ll0(countries, stringExtractor, filterCountriesUseCase);
    }

    public final gl0 a(List countries, gj documentFlowDataBundle, yj0 personBundle, ce1 stringExtractor) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        return new hl0(documentFlowDataBundle, personBundle, stringExtractor, countries, null, 16, null);
    }

    public final o40 a(gl0 repository, il0 resultRepository, v10 imageServiceLocator, ll0 nationalitySuggestionsProvider, i80 nationalityValidator, Function0 resourcesProvider, sg0 tracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(nationalitySuggestionsProvider, "nationalitySuggestionsProvider");
        Intrinsics.checkNotNullParameter(nationalityValidator, "nationalityValidator");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        am amVar = new am(repository, nationalityValidator);
        z10 z10VarA = imageServiceLocator.a(r10.O0);
        c81.a aVar = c81.f27404a;
        return new o40("person_nationality", repository, resultRepository, nationalitySuggestionsProvider, resourcesProvider, imageServiceLocator, amVar, c81.a.a(aVar, R.string.step_personal_details_label_nationality, 0, 2, null), c81.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), aVar.b(R.string.shared_validation_required_nationality_accessibility), aVar.a(R.string.shared_validation_invalid_nationality_accessibility), z10VarA, new p20(tracker));
    }

    public final il0 a(yj0 personBundle) {
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new jl0(personBundle);
    }

    public final aq0 a(r70 mainRepository, ek0 flowCoordinator, fh0 orcaDestroyer, o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        ArrayList arrayListN = zhm.v.n(new fl0(flowCoordinator, imageServiceLocator), new el0(flowCoordinator, imageServiceLocator));
        arrayListN.addAll(ha.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator));
        gq0[] gq0VarArr = (gq0[]) arrayListN.toArray(new gq0[0]);
        return popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length));
    }

    public final jm a(gl0 repository, zl analytics, CoroutineScope coroutineScope, ek0 flowCoordinator, wd1 viewCompletionHandler, aq0 popupHandler, o40 nationalityViewStateManager, e8 birthPlaceInputViewStateHandler, il0 resultRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(nationalityViewStateManager, "nationalityViewStateManager");
        Intrinsics.checkNotNullParameter(birthPlaceInputViewStateHandler, "birthPlaceInputViewStateHandler");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        im imVar = new im(nationalityViewStateManager, birthPlaceInputViewStateHandler);
        return new jm(new f80(imVar), new wr(coroutineScope), imVar, nationalityViewStateManager, flowCoordinator, viewCompletionHandler, repository, resultRepository, analytics, popupHandler, coroutineScope);
    }

    public final cl0 a(Function0 workflowIdProvider, yj0 personBundle, m81 tinBundle, vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new cl0(workflowIdProvider, personBundle, tinBundle, tinBundleIsValidUseCase);
    }

    public final wd1 a(dl0 flowActionProvider, ry dataWorkManager, cl0 uploadDataRequestBuilder, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestBuilder, dataWorkManager, whatsNextWorker);
    }

    public final zl a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new zl(tracker);
    }

    public final ak0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new ak0(s70.a(mainRepository));
    }

    public final wl0 a(sg0 tracker, tl0 repository, v10 imageServiceLocator, vc1 skipNationalityUseCase, jy dateFormatter) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        return new wl0(new p20(tracker), repository, imageServiceLocator, skipNationalityUseCase.a(false), dateFormatter, new ul1(repository, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(tl0 tl0Var) {
        return tl0Var.g();
    }

    public final xl0 a(ek0 flowCoordinator, wl0 stateProvider, tl0 repository, ol0 analytics, TimestampProvider timestampProvider, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new xl0(new f80(stateProvider), new wr(coroutineScope), stateProvider, flowCoordinator, viewCompletionHandler, repository, analytics, timestampProvider, popupHandler, coroutineScope);
    }

    public final wd1 a(ak0 flowActionProvider, ry dataWorkManager, cl0 uploadDataRequestBuilder, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestBuilder, dataWorkManager, whatsNextWorker);
    }

    public final e8 a(yj0 personBundle, v10 imageServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new e8(new e50(personBundle), imageServiceLocator, new p20(tracker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ek0 a(o80 navigationChannel, vc1 skipNationalityUseCase, vc1 skipPersonDetailsUseCase, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new ek0(navigationChannel, skipNationalityUseCase, skipPersonDetailsUseCase, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final tl0 a(r70 mainRepository, gj bundle, yj0 personBundle) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        return new ul0(bundle, personBundle, this.f28545a.getMinimumAge());
    }

    public final od a(final gl0 nationalityRepository, final i80 nationalityValidator) {
        Intrinsics.checkNotNullParameter(nationalityRepository, "nationalityRepository");
        Intrinsics.checkNotNullParameter(nationalityValidator, "nationalityValidator");
        return new od() { // from class: com.fourthline.orca.internal.xl1
            @Override // com.fourthline.orca.internal.od
            public final boolean a(fd fdVar) {
                return fk0.a(nationalityValidator, nationalityRepository, fdVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(i80 i80Var, gl0 gl0Var, fd country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return i80Var.a(country, gl0Var.c());
    }
}
