package com.revolut.feature.onboarding.core.launcher;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.revolut.feature.onboarding.core.R$drawable;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/core/launcher/OnboardingLauncherActivity;", "Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "<init>", "()V", "Companion", "a", "feature_retail_onboarding_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingLauncherActivity extends KompotLauncherActivity {
    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        boolean zF = Intrinsics.f(intent != null ? intent.getStringExtra("ONBOARDING_EXTRA_BACKGROUND_MODE") : null, "ONBOARDING_EXTRA_BACKGROUND_MODE_STARTUP");
        if (zF) {
            getWindow().setBackgroundDrawableResource(R$drawable.onboarding_splash_background);
        }
        super.onCreate(bundle);
        if (!zF || Build.VERSION.SDK_INT < 34) {
            return;
        }
        overrideActivityTransition(0, 0, 0);
    }
}
