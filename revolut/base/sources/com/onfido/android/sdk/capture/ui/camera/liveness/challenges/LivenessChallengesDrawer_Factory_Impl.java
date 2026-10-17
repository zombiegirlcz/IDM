package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import android.content.Context;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessChallengesDrawer_Factory_Impl implements LivenessChallengesDrawer.Factory {
    private final C2113LivenessChallengesDrawer_Factory delegateFactory;

    public LivenessChallengesDrawer_Factory_Impl(C2113LivenessChallengesDrawer_Factory c2113LivenessChallengesDrawer_Factory) {
        this.delegateFactory = c2113LivenessChallengesDrawer_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesDrawer.Factory
    public LivenessChallengesDrawer create(Context context) {
        return this.delegateFactory.get(context);
    }

    public static Provider create(C2113LivenessChallengesDrawer_Factory c2113LivenessChallengesDrawer_Factory) {
        return new c(new LivenessChallengesDrawer_Factory_Impl(c2113LivenessChallengesDrawer_Factory));
    }
}
