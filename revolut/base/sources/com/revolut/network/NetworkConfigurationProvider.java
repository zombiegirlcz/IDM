package com.revolut.network;

import a0.d;
import com.revolut.feature.debug_tools.api.LocalFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revolut/network/NetworkConfigurationProvider;", "", "Lkotlin/Function0;", "Lhf0/a;", "appDeclarationContextAccessor", "", "version100ToggleValueProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "getAppVersionName", "()Ljava/lang/String;", "Lh21/a;", "provideNetworkConfiguration", "()Lh21/a;", "Lkotlin/jvm/functions/Function0;", "Lgte/a;", "getFeatureToggleInteractor", "()Lgte/a;", "featureToggleInteractor", "Companion", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkConfigurationProvider {

    @NotNull
    public static final String APP_VERSION_100 = "100.0";

    @NotNull
    private final Function0<hf0.a> appDeclarationContextAccessor;

    @NotNull
    private final Function0<Boolean> version100ToggleValueProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkConfigurationProvider(@NotNull Function0<? extends hf0.a> appDeclarationContextAccessor, @NotNull Function0<Boolean> version100ToggleValueProvider) {
        Intrinsics.checkNotNullParameter(appDeclarationContextAccessor, "appDeclarationContextAccessor");
        Intrinsics.checkNotNullParameter(version100ToggleValueProvider, "version100ToggleValueProvider");
        this.appDeclarationContextAccessor = appDeclarationContextAccessor;
        this.version100ToggleValueProvider = version100ToggleValueProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppVersionName() {
        return ((Boolean) this.version100ToggleValueProvider.invoke()).booleanValue() ? "100.0" : "10.151";
    }

    private final gte.a getFeatureToggleInteractor() {
        phm.a aVar = (phm.a) ((hf0.a) this.appDeclarationContextAccessor.invoke()).a().get(ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((ite.a) aVar2.b()).b();
        }
        throw new IllegalStateException(d.q("Api ", ite.a.class, " is not found"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideNetworkConfiguration$lambda$1(NetworkConfigurationProvider networkConfigurationProvider) {
        return ((jte.d) networkConfigurationProvider.getFeatureToggleInteractor()).c(LocalFeature.SimulateNetworkDelay.f71628c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideNetworkConfiguration$lambda$2(NetworkConfigurationProvider networkConfigurationProvider) {
        return ((jte.d) networkConfigurationProvider.getFeatureToggleInteractor()).c(LocalFeature.FailingBackend.f71626c);
    }

    @NotNull
    public final h21.a provideNetworkConfiguration() {
        RetailCoreNetworkConfiguration retailCoreNetworkConfiguration = RetailCoreNetworkConfiguration.INSTANCE;
        String baseUrl = retailCoreNetworkConfiguration.getBaseUrl();
        boolean debug = retailCoreNetworkConfiguration.getDebug();
        boolean logEnabled = retailCoreNetworkConfiguration.getLogEnabled();
        ij0.b mandatoryInterceptorsProvider = retailCoreNetworkConfiguration.getMandatoryInterceptorsProvider();
        String sslHostPattern = retailCoreNetworkConfiguration.getSslHostPattern();
        List<String> revolutHosts = retailCoreNetworkConfiguration.getRevolutHosts();
        List<String> sslPins = retailCoreNetworkConfiguration.getSslPins();
        boolean endToEndMode = retailCoreNetworkConfiguration.getEndToEndMode();
        return new h21.a(new b(this, 0), retailCoreNetworkConfiguration.getVersionCode(), baseUrl, revolutHosts, logEnabled, debug, sslHostPattern, sslPins, endToEndMode, new b(this, 1), mandatoryInterceptorsProvider, new b(this, 2), retailCoreNetworkConfiguration.signRequests());
    }
}
