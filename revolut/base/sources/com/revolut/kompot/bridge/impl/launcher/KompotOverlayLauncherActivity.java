package com.revolut.kompot.bridge.impl.launcher;

import android.os.Handler;
import android.os.Looper;
import com.revolut.kompot.bridge.impl.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.Metadata;
import t70.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/bridge/impl/launcher/KompotOverlayLauncherActivity;", "Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "<init>", "()V", "kompot_bridge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KompotOverlayLauncherActivity extends KompotLauncherActivity {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Handler f98256t0 = new Handler(Looper.getMainLooper());

    public static void Z0(KompotOverlayLauncherActivity kompotOverlayLauncherActivity) {
        super.finish();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, android.app.Activity
    public final void finish() {
        Handler handler = this.f98256t0;
        handler.removeCallbacksAndMessages(null);
        if (isFinishing() || !((ControllerContainerFrameLayout) findViewById(R$id.bridgeRoot_containerModal)).getControllersTransitionActive()) {
            super.finish();
        } else {
            handler.postDelayed(new x(this, 1), 300L);
        }
    }
}
