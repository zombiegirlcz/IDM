package com.onfido.hosted.web.module.externallink;

import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class HostedWebModuleExternalLinkViewModel_Factory implements el.b {
    private final Provider repositoryProvider;

    public HostedWebModuleExternalLinkViewModel_Factory(Provider provider) {
        this.repositoryProvider = provider;
    }

    public static HostedWebModuleExternalLinkViewModel_Factory create(Provider provider) {
        return new HostedWebModuleExternalLinkViewModel_Factory(provider);
    }

    public static HostedWebModuleExternalLinkViewModel newInstance(HostedWebModuleExternalLinkRepository hostedWebModuleExternalLinkRepository) {
        return new HostedWebModuleExternalLinkViewModel(hostedWebModuleExternalLinkRepository);
    }

    @Override // com.onfido.javax.inject.Provider
    public HostedWebModuleExternalLinkViewModel get() {
        return newInstance((HostedWebModuleExternalLinkRepository) this.repositoryProvider.get());
    }
}
