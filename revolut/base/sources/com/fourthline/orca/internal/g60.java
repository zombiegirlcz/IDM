package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.location.LocationProvider;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class g60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f28769b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e60 f28770a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g60() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final c70 a(r60 locationFlowRepository) {
        Intrinsics.checkNotNullParameter(locationFlowRepository, "locationFlowRepository");
        return locationFlowRepository;
    }

    public g60(e60 e60Var) {
        this.f28770a = e60Var;
    }

    public final d60 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new d60(s70.a(mainRepository));
    }

    public final r60 a(DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        return new r60(deviceMetadata);
    }

    public /* synthetic */ g60(e60 e60Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : e60Var);
    }

    public final f60 a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new f60(navigationChannel, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, null)));
    }

    public final x60 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new x60(tracker);
    }

    public final e70 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new e70(lottieServiceLocator.a(k70.f30158m));
    }

    public final f70 a(e70 stateProvider, wr effectHandler, f60 flowCoordinator, wd1 viewCompletionHandler, LocationProvider locationProvider, c70 locationScannerRepository, x60 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(locationScannerRepository, "locationScannerRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new f70(new f80(stateProvider), effectHandler, flowCoordinator, viewCompletionHandler, stateProvider, popupHandler, locationProvider, locationScannerRepository, analytics, coroutineScope);
    }

    public final wr a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new wr(coroutineScope);
    }

    public final aq0 a(r70 mainRepository, wr effectHandler, fh0 orcaDestroyer, o80 navigationChannel, bq0 popupHandlerBuilder, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        ArrayList arrayListN = zhm.v.n(new v60(lottieServiceLocator), new kq0(lottieServiceLocator), new u60(effectHandler, imageServiceLocator), new g70(effectHandler, imageServiceLocator));
        arrayListN.addAll(ha.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator));
        gq0[] gq0VarArr = (gq0[]) arrayListN.toArray(new gq0[0]);
        return popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length));
    }

    public final wd1 a(Function0 workflowIdProvider, DeviceMetadata deviceMetadata, d60 flowActionProvider, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, new t60(workflowIdProvider, deviceMetadata), dataWorkManager, whatsNextWorker);
    }
}
