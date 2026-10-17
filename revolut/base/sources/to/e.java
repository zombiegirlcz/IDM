package to;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f272484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo.c f272485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f272486c;
    public final ConcurrentHashMap d;
    public final a e;

    public e(Context appContext, jo.c aqueductParamsProvider, c signingInterceptor) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(aqueductParamsProvider, "aqueductParamsProvider");
        Intrinsics.checkNotNullParameter(signingInterceptor, "signingInterceptor");
        this.f272484a = appContext;
        this.f272485b = aqueductParamsProvider;
        this.f272486c = signingInterceptor;
        this.d = new ConcurrentHashMap();
        this.e = new a(0);
    }
}
