package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2113LivenessChallengesDrawer_Factory {
    private final Provider announcementServiceProvider;

    public C2113LivenessChallengesDrawer_Factory(Provider provider) {
        this.announcementServiceProvider = provider;
    }

    public static C2113LivenessChallengesDrawer_Factory create(Provider provider) {
        return new C2113LivenessChallengesDrawer_Factory(provider);
    }

    public static LivenessChallengesDrawer newInstance(Context context, AnnouncementService announcementService) {
        return new LivenessChallengesDrawer(context, announcementService);
    }

    public LivenessChallengesDrawer get(Context context) {
        return newInstance(context, (AnnouncementService) this.announcementServiceProvider.get());
    }
}
