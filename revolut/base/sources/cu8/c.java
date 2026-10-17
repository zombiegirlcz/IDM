package cu8;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f108825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f108826b;

    public c(d dVar, Uri uri2) {
        this.f108825a = dVar;
        this.f108826b = uri2;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient mClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mClient, "mClient");
        d dVar = this.f108825a;
        dVar.getClass();
        CustomTabsIntent.Builder builder = dVar.f108831c;
        if (mClient == null) {
            Intrinsics.r("client");
            throw null;
        }
        mClient.warmup(0L);
        CustomTabsSession customTabsSessionNewSession = mClient.newSession(dVar.e);
        if (customTabsSessionNewSession != null) {
            builder.setSession(customTabsSessionNewSession);
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        customTabsIntentBuild.launchUrl(dVar.f108829a, this.f108826b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
