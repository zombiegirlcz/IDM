package cu8;

import android.app.Activity;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ks8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f108829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f108830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomTabsIntent.Builder f108831c;
    public yw8.e d;
    public final c54.c e;

    public d(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108829a = context;
        this.f108831c = new CustomTabsIntent.Builder();
        this.e = new c54.c(this, 1);
    }
}
