package hy2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$Carousel2dDesigns;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f156707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f156708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final exl.b f156709c;
    public final Lazy d;

    public h(Context context, gte.a featureToggleInteractor, exl.b cardSceneProxy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardSceneProxy, "cardSceneProxy");
        this.f156707a = context;
        this.f156708b = featureToggleInteractor;
        this.f156709c = cardSceneProxy;
        this.d = yhm.j.b(new hq1.f(this, 11));
    }

    public final boolean a() {
        hxl.b bVar;
        ConfigurationInfo deviceConfigurationInfo;
        String glEsVersion;
        od0.a aVar = od0.a.f224253a;
        boolean z = false;
        if (od0.a.c() != od0.l.E2E) {
            Object systemService = this.f156707a.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            double d = (activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null || (glEsVersion = deviceConfigurationInfo.getGlEsVersion()) == null) ? -1.0d : Double.parseDouble(glEsVersion);
            boolean zC = ((jte.d) this.f156708b).c(CardDesignApi$Toggles$Carousel2dDesigns.f64535c);
            boolean z3 = d >= 3.0d;
            if (!zC && z3 && (bVar = (hxl.b) this.d.getValue()) != null) {
                if (hxl.b.f156619b) {
                    return true;
                }
                synchronized (hxl.b.Companion) {
                    if (hxl.b.f156619b) {
                        return true;
                    }
                    try {
                        uh0.a.f280049a.b(bVar.f156620a, z0.f("filament-jni", "gltfio-jni", "filament-utils-jni"));
                        z = true;
                    } catch (Throwable th10) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                    }
                    hxl.b.f156619b = z;
                    return hxl.b.f156619b;
                }
            }
        }
        return false;
    }
}
