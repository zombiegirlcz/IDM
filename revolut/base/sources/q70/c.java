package q70;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f242732b = r0.k(new Pair("com.citymapper.app.release", d.CITY_MAPPER), new Pair("com.waze", d.WAZE), new Pair("com.google.android.apps.maps", d.GOOGLE_MAPS), new Pair("com.huawei.maps.app", d.PETAL));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f242733a;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f242733a = context.getPackageManager();
    }
}
