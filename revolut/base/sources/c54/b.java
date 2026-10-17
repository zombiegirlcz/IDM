package c54;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f21407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f21408b;

    public b(d dVar, Uri uri2) {
        this.f21407a = dVar;
        this.f21408b = uri2;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient mClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mClient, "mClient");
        d dVar = this.f21407a;
        CustomTabsIntent.Builder builder = dVar.f21413c;
        if (mClient == null) {
            Intrinsics.r("client");
            throw null;
        }
        mClient.warmup(0L);
        CustomTabsSession customTabsSessionNewSession = mClient.newSession(dVar.f);
        if (customTabsSessionNewSession != null) {
            builder.setSession(customTabsSessionNewSession);
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        customTabsIntentBuild.launchUrl(dVar.f21411a, this.f21408b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f21407a.e = false;
    }
}
