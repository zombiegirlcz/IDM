package c54;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f21412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomTabsIntent.Builder f21413c;
    public k d;
    public boolean e;
    public final c f;

    public d(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21411a = context;
        this.f21413c = new CustomTabsIntent.Builder();
        this.f = new c(this, 0);
    }

    public final void a(Uri uri2, String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        b bVar = new b(this, uri2);
        this.f21412b = bVar;
        boolean zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(this.f21411a, packageName, bVar);
        this.e = zBindCustomTabsService;
        if (!zBindCustomTabsService) {
            throw new IllegalStateException("Failed to bind Custom Tabs service for package=".concat(packageName).toString());
        }
    }
}
