package wtc;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f299864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WifiManager f299865b;

    public e(ConnectivityManager connectivityManager, n80.b buildInfo, WifiManager wifiManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        this.f299864a = connectivityManager;
        this.f299865b = wifiManager;
    }
}
