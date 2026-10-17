package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc f28103a;

    /* JADX WARN: Multi-variable type inference failed */
    public ec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(fd it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return true;
    }

    public ec(cc ccVar) {
        this.f28103a = ccVar;
    }

    public final bc a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new bc(s70.a(mainRepository));
    }

    public final gb a(oc repository, v10 imageServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new gb(repository, imageServiceLocator, new p20(tracker));
    }

    public /* synthetic */ ec(cc ccVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ccVar);
    }

    public final yb a(gb stateProvider, oc repository, rx filterCountriesUseCase, dc flowCoordinator, wd1 viewCompletionHandler, hb analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new yb(new f80(stateProvider), stateProvider, new wr(coroutineScope), repository, filterCountriesUseCase, flowCoordinator, viewCompletionHandler, analytics, popupHandler, coroutineScope);
    }

    public final wd1 a(Function0 workflowIdProvider, eb dataBundle, bc flowActionProvider, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, new qc(workflowIdProvider, dataBundle), dataWorkManager, whatsNextWorker);
    }

    public final oc a(eb contactBundle, gj documentBundle, v9 cellularManager, List countries) {
        Intrinsics.checkNotNullParameter(contactBundle, "contactBundle");
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        Intrinsics.checkNotNullParameter(cellularManager, "cellularManager");
        Intrinsics.checkNotNullParameter(countries, "countries");
        return new oc(contactBundle, cellularManager, countries, documentBundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dc a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new dc(navigationChannel, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final hb a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new hb(tracker);
    }

    public final od a() {
        return new gl1(0);
    }
}
