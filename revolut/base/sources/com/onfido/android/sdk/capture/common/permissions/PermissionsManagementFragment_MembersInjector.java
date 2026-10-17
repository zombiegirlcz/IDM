package com.onfido.android.sdk.capture.common.permissions;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class PermissionsManagementFragment_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public PermissionsManagementFragment_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new PermissionsManagementFragment_MembersInjector(provider);
    }

    public static void injectPresenter(PermissionsManagementFragment permissionsManagementFragment, PermissionsManagementPresenter permissionsManagementPresenter) {
        permissionsManagementFragment.presenter = permissionsManagementPresenter;
    }

    public void injectMembers(PermissionsManagementFragment permissionsManagementFragment) {
        injectPresenter(permissionsManagementFragment, (PermissionsManagementPresenter) this.presenterProvider.get());
    }
}
