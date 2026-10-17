package com.revolut.feature.alipay_plus.mpm.core;

import android.content.Context;
import com.revolut.feature.alipay_plus.mpm.model.APMPMAcceptanceMarkLogo;
import com.revolut.feature.alipay_plus.mpm.model.APMPMActionParams;
import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMConfiguration;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMInquireQuoteRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMInquireQuoteResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService;
import com.revolut.feature.alipay_plus.mpm.model.APMPMPaymentScenario;
import com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfiguration;
import com.revolut.feature.alipay_plus.mpm.model.APMPMService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J$\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+J\u001e\u0010,\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010-2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020.0'J*\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\u0006\u0010!\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u000105J\u001a\u00106\u001a\u0002072\u0006\u0010!\u001a\u00020\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u000105J\u0010\u00108\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00069"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMClient;", "", "<init>", "()V", "coordinator", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "appContext", "Landroid/content/Context;", "currentConfiguration", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;", "currentNetworkService", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;", "currentMPMService", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMService;", "value", "configuration", "getConfiguration", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;", "setConfiguration", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;)V", "networkService", "getNetworkService", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;", "setNetworkService", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;)V", "mpmService", "getMpmService", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMService;", "setMpmService", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMService;)V", "rebuildCoordinator", "", "coordinatorFor", "context", "rebuildCoordinatorLocked", "launch", "request", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchRequest;", "callback", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMCallback;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchResult;", "handleAction", "params", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMActionParams;", "inquireQuote", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteRequest;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteResult;", "getAcceptanceMarkLogos", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "scenario", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMPaymentScenario;", "region", "", "isAlipayPlusSupportedRegion", "", "getCurrentRegion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMClient {

    @NotNull
    public static final APMPMClient INSTANCE = new APMPMClient();
    private static Context appContext;
    private static volatile APMPMCoordinator coordinator;
    private static APMPMConfiguration currentConfiguration;
    private static APMPMService currentMPMService;
    private static APMPMNetworkService currentNetworkService;

    private APMPMClient() {
    }

    private final APMPMCoordinator coordinatorFor(Context context) {
        Context applicationContext;
        APMPMCoordinator aPMPMCoordinator;
        synchronized (this) {
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Throwable th10) {
                    throw th10;
                }
            } else {
                applicationContext = null;
            }
            if (applicationContext != null && appContext != applicationContext) {
                appContext = applicationContext;
                INSTANCE.rebuildCoordinatorLocked();
            }
            aPMPMCoordinator = coordinator;
        }
        return aPMPMCoordinator;
    }

    public static /* synthetic */ APMPMCoordinator coordinatorFor$default(APMPMClient aPMPMClient, Context context, int i, Object obj2) {
        if ((i & 1) != 0) {
            context = null;
        }
        return aPMPMClient.coordinatorFor(context);
    }

    public static /* synthetic */ List getAcceptanceMarkLogos$default(APMPMClient aPMPMClient, Context context, APMPMPaymentScenario aPMPMPaymentScenario, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = null;
        }
        return aPMPMClient.getAcceptanceMarkLogos(context, aPMPMPaymentScenario, str);
    }

    public static /* synthetic */ boolean isAlipayPlusSupportedRegion$default(APMPMClient aPMPMClient, Context context, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return aPMPMClient.isAlipayPlusSupportedRegion(context, str);
    }

    private final void rebuildCoordinator() {
        synchronized (this) {
            INSTANCE.rebuildCoordinatorLocked();
            Unit unit = Unit.f186387a;
        }
    }

    private final void rebuildCoordinatorLocked() {
        APMPMConfiguration aPMPMConfiguration = currentConfiguration;
        if (aPMPMConfiguration == null) {
            coordinator = null;
        } else {
            Context context = appContext;
            coordinator = new APMPMCoordinator(aPMPMConfiguration, currentNetworkService, currentMPMService, context, null, null, context != null ? new APMPMRemoteConfiguration(context, null, 0L, 6, null) : new APMPMRemoteConfiguration(null, null, 0L, 7, null), null, 48, null);
        }
    }

    public final List<APMPMAcceptanceMarkLogo> getAcceptanceMarkLogos(@NotNull Context context, @NotNull APMPMPaymentScenario scenario, String region) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor = coordinatorFor(context);
        if (aPMPMCoordinatorCoordinatorFor != null) {
            return aPMPMCoordinatorCoordinatorFor.getAcceptanceMarkLogos(scenario, region);
        }
        return null;
    }

    public final APMPMConfiguration getConfiguration() {
        return currentConfiguration;
    }

    public final String getCurrentRegion(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor = coordinatorFor(context);
        if (aPMPMCoordinatorCoordinatorFor != null) {
            return aPMPMCoordinatorCoordinatorFor.getCurrentRegion();
        }
        return null;
    }

    public final APMPMService getMpmService() {
        return currentMPMService;
    }

    public final APMPMNetworkService getNetworkService() {
        return currentNetworkService;
    }

    public final void handleAction(@NotNull APMPMActionParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor = coordinatorFor(params.getContext());
        if (aPMPMCoordinatorCoordinatorFor != null) {
            APMPMCoordinator.handleActionPayload$default(aPMPMCoordinatorCoordinatorFor, params.getContext(), params.getSdkActionPayload(), null, 4, null);
        }
    }

    public final void inquireQuote(APMPMInquireQuoteRequest request, @NotNull APMPMCallback<APMPMInquireQuoteResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor$default = coordinatorFor$default(this, null, 1, null);
        if (aPMPMCoordinatorCoordinatorFor$default != null) {
            aPMPMCoordinatorCoordinatorFor$default.inquireQuote(request, callback);
        } else {
            callback.onFailure(new APMPMError("PARAM_ILLEGAL", "APMPMClient is not initialized", null, 4, null));
        }
    }

    public final boolean isAlipayPlusSupportedRegion(@NotNull Context context, String region) {
        Intrinsics.checkNotNullParameter(context, "context");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor = coordinatorFor(context);
        if (aPMPMCoordinatorCoordinatorFor != null) {
            return aPMPMCoordinatorCoordinatorFor.isAlipayPlusSupportedRegion(region);
        }
        return false;
    }

    public final void launch(@NotNull Context context, @NotNull APMPMLaunchRequest request, @NotNull APMPMCallback<APMPMLaunchResult> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        APMPMCoordinator aPMPMCoordinatorCoordinatorFor = coordinatorFor(context);
        if (aPMPMCoordinatorCoordinatorFor == null) {
            callback.onFailure(new APMPMError("PARAM_ILLEGAL", "APMPMClient is not initialized", null, 4, null));
        } else {
            aPMPMCoordinatorCoordinatorFor.launch(context, request, callback);
        }
    }

    public final void setConfiguration(APMPMConfiguration aPMPMConfiguration) {
        currentConfiguration = aPMPMConfiguration;
        rebuildCoordinator();
    }

    public final void setMpmService(APMPMService aPMPMService) {
        currentMPMService = aPMPMService;
        rebuildCoordinator();
    }

    public final void setNetworkService(APMPMNetworkService aPMPMNetworkService) {
        currentNetworkService = aPMPMNetworkService;
        rebuildCoordinator();
    }
}
