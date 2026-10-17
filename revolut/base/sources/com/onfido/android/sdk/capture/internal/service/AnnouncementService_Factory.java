package com.onfido.android.sdk.capture.internal.service;

import android.content.Context;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class AnnouncementService_Factory implements el.b {
    private final Provider contextProvider;

    public AnnouncementService_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static AnnouncementService_Factory create(Provider provider) {
        return new AnnouncementService_Factory(provider);
    }

    public static AnnouncementService newInstance(Context context) {
        return new AnnouncementService(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public AnnouncementService get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
