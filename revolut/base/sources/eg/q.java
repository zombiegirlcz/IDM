package eg;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd.g f125479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig.k f125480b;

    public q(pd.g firebaseApp, ig.k settings, CoroutineContext backgroundDispatcher, m1 lifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f125479a = firebaseApp;
        this.f125480b = settings;
        firebaseApp.a();
        Context applicationContext = firebaseApp.f235023a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(n1.f125472a);
            skm.e0.C(skm.e0.c(backgroundDispatcher), null, null, new clm.k(this, backgroundDispatcher, lifecycleServiceBinder, null, 1), 3);
        } else {
            String str = "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + CoreConstants.DOT;
        }
    }
}
