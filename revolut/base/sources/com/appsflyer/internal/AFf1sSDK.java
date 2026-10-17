package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AFf1sSDK extends AFf1uSDK {
    private final PurchaseHandler.PurchaseValidationCallback AFLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1sSDK(@NotNull AFf1ySDK aFf1ySDK, @NotNull AFf1ySDK[] aFf1ySDKArr, @NotNull AFd1fSDK aFd1fSDK, @NotNull Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1ySDK, aFf1ySDKArr, aFd1fSDK, null, map);
        Intrinsics.checkNotNullParameter(aFf1ySDK, "");
        Intrinsics.checkNotNullParameter(aFf1ySDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AFLogger = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFInAppEventType();
        Throwable thD = d();
        if (thD != null && (purchaseValidationCallback2 = this.AFLogger) != null) {
            purchaseValidationCallback2.onFailure(thD);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1qSDK) this).d;
        if (responseNetwork == null || (purchaseValidationCallback = this.AFLogger) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final boolean AFLogger() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final String valueOf(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public boolean values() {
        ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
        if (responseNetwork != null) {
            Intrinsics.h(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.values();
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final String AFInAppEventType(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
