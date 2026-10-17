package com.revolut.feature.rev10_main_screen.impl.ui;

import android.content.Context;
import android.os.Bundle;
import android.transition.Fade;
import android.view.Window;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.R$id;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import eoi.r;
import hx0.c;
import hx0.e;
import java.util.concurrent.atomic.AtomicReference;
import kji.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nhi.k;
import yp0.c0;
import yp0.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerLauncherActivity;", "Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "Lwri/a;", "<init>", "()V", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainContainerLauncherActivity extends KompotLauncherActivity implements wri.a {
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        AtomicReference atomicReference = r.f127969a;
        r.e("activityAttachBaseContextStarted", false);
        super.attachBaseContext(newBase);
    }

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AtomicReference atomicReference = r.f127969a;
        r.e("activityOnCreateStarted", false);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "activity");
        int i = R$id.internal_activity_kompot_window_transition_handler;
        d0 d0Var = d0.f315718a;
        c0 c0VarA = d0.a(this);
        Object objA = c0VarA.a(i);
        Object obj2 = objA;
        if (objA == null) {
            d dVar = new d(this);
            getLifecycle().addObserver(dVar);
            k.a(dVar);
            c0VarA.b(i, dVar);
            obj2 = dVar;
        }
        d transitionHandler = (d) obj2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(transitionHandler, "transitionHandler");
        hx0.c0 c0Var = new hx0.c0(transitionHandler);
        Fade fade = new Fade();
        c cVar = hx0.d.Companion;
        cVar.getClass();
        e eVar = (e) c.b(this);
        ComponentActivity componentActivity = eVar.f156304a;
        cVar.getClass();
        componentActivity.getWindow().requestFeature(13);
        eVar.a(c0Var);
        eVar.b(c0Var);
        cVar.getClass();
        Window window = componentActivity.getWindow();
        if (window != null) {
            window.setReturnTransition(fade);
        }
        T0(null, true);
        super.onCreate(bundle);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        AtomicReference atomicReference = r.f127969a;
        r.e("activityOnResumeStarted", false);
        super.onResume();
        r.e("activityOnResumeFinished", false);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        AtomicReference atomicReference = r.f127969a;
        r.e("activityOnStartStarted", false);
        super.onStart();
    }
}
