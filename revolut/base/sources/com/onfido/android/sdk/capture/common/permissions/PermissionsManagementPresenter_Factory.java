package com.onfido.android.sdk.capture.common.permissions;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.PermissionsTracker;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class PermissionsManagementPresenter_Factory implements b {
    private final Provider permissionsTrackerProvider;
    private final Provider runtimePermissionsManagerProvider;

    public PermissionsManagementPresenter_Factory(Provider provider, Provider provider2) {
        this.runtimePermissionsManagerProvider = provider;
        this.permissionsTrackerProvider = provider2;
    }

    public static PermissionsManagementPresenter_Factory create(Provider provider, Provider provider2) {
        return new PermissionsManagementPresenter_Factory(provider, provider2);
    }

    public static PermissionsManagementPresenter newInstance(RuntimePermissionsManager runtimePermissionsManager, PermissionsTracker permissionsTracker) {
        return new PermissionsManagementPresenter(runtimePermissionsManager, permissionsTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public PermissionsManagementPresenter get() {
        return newInstance((RuntimePermissionsManager) this.runtimePermissionsManagerProvider.get(), (PermissionsTracker) this.permissionsTrackerProvider.get());
    }
}
