package sh6;

import c90.c;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.h;
import n80.f;
import qd0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f263438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f263439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i41.c f263440c;
    public final f d;

    public a(h systemTimeProvider, e dateProvider, n80.b buildInfo, b languageProvider, c uiResources, i41.c environmentCheckProxy, f screenBrightnessProvider) {
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(environmentCheckProxy, "environmentCheckProxy");
        Intrinsics.checkNotNullParameter(screenBrightnessProvider, "screenBrightnessProvider");
        this.f263438a = languageProvider;
        this.f263439b = uiResources;
        this.f263440c = environmentCheckProxy;
        this.d = screenBrightnessProvider;
    }
}
