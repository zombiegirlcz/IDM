package i1b;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l1b.l;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppsFlyerLib f157601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1b.b f157602c;
    public final bm0.a d;
    public final CoroutineScope e;
    public final l f;

    public f(Context context, AppsFlyerLib appsFlyerLib, h1b.b appsFlyerDeeplinkObserver, bm0.a cryptoWrapper, CoroutineScope scope, l repository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        Intrinsics.checkNotNullParameter(appsFlyerDeeplinkObserver, "appsFlyerDeeplinkObserver");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f157600a = context;
        this.f157601b = appsFlyerLib;
        this.f157602c = appsFlyerDeeplinkObserver;
        this.d = cryptoWrapper;
        this.e = scope;
        this.f = repository;
    }
}
