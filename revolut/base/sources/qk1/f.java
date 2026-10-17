package qk1;

import com.revolut.feature.alipay_plus.mpm.core.APMPMClient;
import com.revolut.feature.alipay_plus.mpm.model.APMPMConfiguration;
import com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerRuntime;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f246944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final APMPMNetworkService f246945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f246946c;
    public final k7i.i d;
    public final AtomicBoolean e;

    public f(z70.a contextProvider, APMPMNetworkService networkService, g mpmService, k7i.i webContainerLauncher) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(mpmService, "mpmService");
        Intrinsics.checkNotNullParameter(webContainerLauncher, "webContainerLauncher");
        this.f246944a = contextProvider;
        this.f246945b = networkService;
        this.f246946c = mpmService;
        this.d = webContainerLauncher;
        this.e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.e.compareAndSet(false, true)) {
            APMPMClient aPMPMClient = APMPMClient.INSTANCE;
            aPMPMClient.setConfiguration(new APMPMConfiguration("PLACEHOLDER_ALIPAY_PLUS_MPP_CLIENT_ID", "DEV", "Revolut"));
            aPMPMClient.setNetworkService(this.f246945b);
            aPMPMClient.setMpmService(this.f246946c);
            APMPMWebContainerRuntime.INSTANCE.registerLauncher(this.d);
        }
    }
}
