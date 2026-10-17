package com.fourthline.orca.internal;

import android.net.Uri;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.orca.internal.b6;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.e40;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c4 f27985a;

    public static final class a implements q6 {
        public a() {
        }

        @Override // com.fourthline.orca.internal.q6
        public void a(String redirectUrl) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            e4.this.f27985a.a(redirectUrl);
        }
    }

    public static final class b implements p6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f27987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t5 f27988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27989c;
        final /* synthetic */ d3 e;

        public b(d3 d3Var, Function0 function0) {
            this.e = d3Var;
            this.f27987a = e4.this.f27985a.getBavStrategy().a(c5.f27366a.a());
            t5 t5VarA = d3Var.a();
            if (t5VarA == null) {
                throw new IllegalStateException("A paymentMethod should have been selected at this point.");
            }
            this.f27988b = t5VarA;
            this.f27989c = (String) function0.invoke();
        }

        @Override // com.fourthline.orca.internal.p6
        public String a() {
            return this.f27989c;
        }

        @Override // com.fourthline.orca.internal.p6
        public t5 b() {
            return this.f27988b;
        }

        @Override // com.fourthline.orca.internal.p6
        public boolean c() {
            return this.f27987a;
        }

        @Override // com.fourthline.orca.internal.p6
        public Uri getUrl() {
            String strH;
            if (e4.this.f27985a.getBavStrategy().a(c5.f27366a.a())) {
                b6 b6VarC = this.e.c();
                strH = b6VarC instanceof b6.d ? ((b6.d) b6VarC).getRedirectUrl() : e4.this.f27985a.h();
            } else {
                strH = e4.this.f27985a.h();
            }
            Uri uri2 = Uri.parse(strH);
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            return uri2;
        }
    }

    public e4(c4 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f27985a = flowConfig;
    }

    public final s6 b(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new s6(lottieServiceLocator.a(k70.f30153h));
    }

    public final j5 c(d3 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new y50(bundle.e());
    }

    public final z6 d(d3 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new z6(this.f27985a.getSupportedPaymentMethods(), bundle);
    }

    public final d4 a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new d4(navigationChannel, popupHandlerBuilder.a(new q9(c81.a.a(c81.f27404a, R.string.shared_button_exit_bav, 0, 2, null), imageServiceLocator)));
    }

    public final i6 c(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new i6(tracker);
    }

    public final r3 b(d3 bavBundle) {
        Intrinsics.checkNotNullParameter(bavBundle, "bavBundle");
        return new ue(bavBundle);
    }

    public final j30 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("bav", tracker);
    }

    public final r5 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new r5(this.f27985a.getSupportedPaymentMethods(), lottieServiceLocator.a(k70.f30149c));
    }

    public final e40 a(j30 analytics, d4 flowCoordinator, e40.e startScreenHandler, m5 finishScreenHandler, r5 stateProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(startScreenHandler, "startScreenHandler");
        Intrinsics.checkNotNullParameter(finishScreenHandler, "finishScreenHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new e40(analytics, new f80(stateProvider), stateProvider, flowCoordinator, o5.f31577a, startScreenHandler, finishScreenHandler);
    }

    public final m5 a(Function0 workflowIdProvider, d3 dataBundle, g6 startPaymentWorker, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(startPaymentWorker, "startPaymentWorker");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new m5(dataBundle, this.f27985a.getSupportedPaymentMethods(), workflowIdProvider, startPaymentWorker, popupHandler, this.f27985a.getBavStrategy().a(c5.f27366a.a()), coroutineScope);
    }

    public final e40.e a(d3 dataBundle, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new e5(this.f27985a, dataBundle, popupHandler, coroutineScope);
    }

    public final p6 a(d3 dataBundle, Function0 workflowIdProvider) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        return new b(dataBundle, workflowIdProvider);
    }

    public final x6 a(Function0 workflowIdProvider, g6 startPaymentWorker, d3 bundle, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(startPaymentWorker, "startPaymentWorker");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new x6(workflowIdProvider, startPaymentWorker, popupHandler, bundle, coroutineScope);
    }

    public final ob1 a(d4 flowCoordinator, v10 imageServiceLocator, z6 repository, x6 finishScreenHandler, sg0 tracker, bq0 popupHandlerBuilder, CoroutineScope coroutineScope) {
        Object next;
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(finishScreenHandler, "finishScreenHandler");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        a7 a7Var = new a7(repository, imageServiceLocator);
        Iterator it8 = repository.getSupportedTypes().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((t5) next).getName() == v6.f34255c) {
                break;
            }
        }
        t5 t5Var = (t5) next;
        e6 e6Var = t5Var != null ? new e6(t5Var.getAmount()) : null;
        f80 f80Var = new f80(a7Var);
        hb1 hb1Var = new hb1(ib1.a(w6.f34526a), d6.f27653a);
        db1 db1Var = new db1(tracker);
        e6[] e6VarArr = (e6[]) zhm.v.l(e6Var).toArray(new e6[0]);
        return new ob1(f80Var, a7Var, flowCoordinator, hb1Var, finishScreenHandler, repository, db1Var, popupHandlerBuilder.a((gq0[]) Arrays.copyOf(e6VarArr, e6VarArr.length)), coroutineScope);
    }

    public final i3 a(d3 bavBundle) {
        Intrinsics.checkNotNullParameter(bavBundle, "bavBundle");
        return new j3(bavBundle);
    }

    public final t3 a(r3 repository, j5 validator, v10 imageServiceLocator, l70 lottieServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new t3(repository, validator, new p20(tracker), imageServiceLocator, lottieServiceLocator);
    }

    public final f3 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new f3(tracker);
    }

    public final u3 a(t3 stateProvider, i3 resultRepository, r3 repository, f3 analytics, d4 viewNavigator, v10 imageServiceLocator, Function0 workflowIdProvider, b7 validateIbanWorker, v3 confirmIbanWorker, j5 bavValidator, bq0 popupHandlerBuilder, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(validateIbanWorker, "validateIbanWorker");
        Intrinsics.checkNotNullParameter(confirmIbanWorker, "confirmIbanWorker");
        Intrinsics.checkNotNullParameter(bavValidator, "bavValidator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        boolean z = this.f27985a.getSupportedPaymentMethods().size() > 1;
        return new u3(stateProvider, resultRepository, repository, analytics, viewNavigator, workflowIdProvider, validateIbanWorker, confirmIbanWorker, bavValidator, new wr(coroutineScope), new f80(stateProvider), popupHandlerBuilder.a(new e3(viewNavigator, imageServiceLocator, z), new g5(viewNavigator, imageServiceLocator, z), new h5(viewNavigator, imageServiceLocator, z), new e6(repository.b())), coroutineScope);
    }

    public final t6 a(s6 stateProvider, qe1 webSdkLauncher, aq0 popupHandler, p6 statusRepository, rp0 statusWorker, a6 transferStatusWorker, c6 redirectUrlWorker, i6 analytics, d4 flowCoordinator, wd1 viewCompletionHandler, te deeplinkDispatcher, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(webSdkLauncher, "webSdkLauncher");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(statusRepository, "statusRepository");
        Intrinsics.checkNotNullParameter(statusWorker, "statusWorker");
        Intrinsics.checkNotNullParameter(transferStatusWorker, "transferStatusWorker");
        Intrinsics.checkNotNullParameter(redirectUrlWorker, "redirectUrlWorker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(deeplinkDispatcher, "deeplinkDispatcher");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        t6 t6Var = new t6(new f80(stateProvider), stateProvider, webSdkLauncher, popupHandler, statusWorker, transferStatusWorker, redirectUrlWorker, flowCoordinator, viewCompletionHandler, statusRepository, new a(), analytics, coroutineScope);
        deeplinkDispatcher.a(t6Var);
        return t6Var;
    }

    public final wd1 a(r70 mainRepository, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        b4 b4Var = new b4(false);
        z51 z51Var = new z51();
        y51 y51Var = new y51();
        if (mainRepository.c()) {
            whatsNextWorker = new b61("BAV", true);
        }
        return new lj0(b4Var, z51Var, y51Var, whatsNextWorker);
    }

    public final qe1 a(ActivityResultRegistry activityResultRegistry) {
        Intrinsics.checkNotNullParameter(activityResultRegistry, "activityResultRegistry");
        return new j8(activityResultRegistry);
    }

    public final aq0 a(r70 mainRepository, bq0 popupHandlerBuilder, d4 viewNavigator, fh0 orcaDestroyer, o80 navigationChannel, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        gq0[] gq0VarArr = (gq0[]) zhm.d0.E0(zhm.v.k(new d7(viewNavigator, imageServiceLocator), new f7(viewNavigator, imageServiceLocator), new e7(viewNavigator, imageServiceLocator), new s5(viewNavigator, imageServiceLocator), new v5(viewNavigator, imageServiceLocator), new u5(viewNavigator, imageServiceLocator), new w3(viewNavigator, imageServiceLocator, this.f27985a.getBavStrategy().a(c5.f27366a.a())), new y3(viewNavigator, imageServiceLocator), new x3(viewNavigator, imageServiceLocator), new p5(viewNavigator)), ha.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator)).toArray(new gq0[0]);
        return popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length));
    }
}
