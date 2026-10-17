package ce;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements cf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23291a;

    public /* synthetic */ h(int i) {
        this.f23291a = i;
    }

    @Override // cf.b
    public final Object get() {
        switch (this.f23291a) {
            case 0:
                return Collections.EMPTY_SET;
            case 2:
                af.j jVar = FirebaseMessaging.k;
            case 1:
                return null;
            case 3:
                p pVar = ExecutorsRegistrar.f49442a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new de.f(Executors.newFixedThreadPool(4, new de.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                p pVar2 = ExecutorsRegistrar.f49442a;
                return new de.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new de.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                p pVar3 = ExecutorsRegistrar.f49442a;
                return new de.f(Executors.newCachedThreadPool(new de.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 6:
                p pVar4 = ExecutorsRegistrar.f49442a;
                return Executors.newSingleThreadScheduledExecutor(new de.a("Firebase Scheduler", 0, null));
            case 7:
                return Executors.newSingleThreadScheduledExecutor();
            case 8:
                return GaugeManager.lambda$new$0();
            default:
                return GaugeManager.lambda$new$1();
        }
    }
}
