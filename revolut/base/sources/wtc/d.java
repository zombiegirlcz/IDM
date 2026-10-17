package wtc;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skm.l f299860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f299861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(skm.l lVar, e eVar) {
        super(1);
        this.f299860a = lVar;
        this.f299861b = eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        skm.l lVar = this.f299860a;
        if (lVar.d()) {
            TransportInfo transportInfo = networkCapabilities.getTransportInfo();
            WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(wifiInfo);
        }
        try {
            this.f299861b.f299864a.unregisterNetworkCallback(this);
        } catch (IllegalArgumentException unused) {
        }
    }
}
