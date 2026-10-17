package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.w2;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f31787a;

    /* JADX WARN: Multi-variable type inference failed */
    public p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(fd it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return true;
    }

    public p0(n0 n0Var) {
        this.f31787a = n0Var;
    }

    public final m0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new m0(s70.a(mainRepository));
    }

    public final h0 a(z addressBundle, List countries) {
        Intrinsics.checkNotNullParameter(addressBundle, "addressBundle");
        Intrinsics.checkNotNullParameter(countries, "countries");
        return new y40(addressBundle, countries);
    }

    public /* synthetic */ p0(n0 n0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : n0Var);
    }

    public final nd a(List countries, ux filterCountriesUseCase) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        return new nd(countries, filterCountriesUseCase);
    }

    public final o40 a(h0 repository, v10 imageServiceLocator, nd countrySuggestionProvider, Function0 resourcesProvider, sg0 tracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(countrySuggestionProvider, "countrySuggestionProvider");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        wq1 wq1Var = new wq1();
        z10 z10VarA = imageServiceLocator.a(r10.O0);
        c81.a aVar = c81.f27404a;
        return new o40("address_country", repository, repository, countrySuggestionProvider, resourcesProvider, imageServiceLocator, wq1Var, c81.a.a(aVar, R.string.step_address_details_label_residence_country, 0, 2, null), c81.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), aVar.b(R.string.shared_validation_required_residence_country_accessibility), aVar.a(R.string.shared_validation_invalid_residence_country_accessibility), z10VarA, new p20(tracker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w2.a a(a01 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return w2.a.b.f34494a;
    }

    public final g0 a(h0 addressDetailsRepository, o40 residencyViewStateManager, v10 imageServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(addressDetailsRepository, "addressDetailsRepository");
        Intrinsics.checkNotNullParameter(residencyViewStateManager, "residencyViewStateManager");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new g0(residencyViewStateManager, addressDetailsRepository, imageServiceLocator, new p20(tracker));
    }

    public final j0 a(h0 addressDetailsRepository, o40 residencyViewStateManager, g0 stateProvider, o0 flowCoordinator, wd1 viewCompletionHandler, a0 analytics, CoroutineScope coroutineScope, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(addressDetailsRepository, "addressDetailsRepository");
        Intrinsics.checkNotNullParameter(residencyViewStateManager, "residencyViewStateManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        return new j0(new f80(stateProvider), new wr(coroutineScope), addressDetailsRepository, residencyViewStateManager, stateProvider, flowCoordinator, viewCompletionHandler, analytics, popupHandler, coroutineScope);
    }

    public final wd1 a(Function0 workflowIdProvider, z dataBundle, m0 flowActionProvider, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, new c1(workflowIdProvider, dataBundle), dataWorkManager, whatsNextWorker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0 a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new o0(navigationChannel, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final a0 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new a0(tracker);
    }

    public final od a() {
        return new gl1(1);
    }
}
