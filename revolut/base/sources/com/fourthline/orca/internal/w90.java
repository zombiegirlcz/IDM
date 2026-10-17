package com.fourthline.orca.internal;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w90 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f34553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f34554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34555c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w90(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f34553a = helper;
        this.f34554b = destination;
        this.f34555c = z;
    }

    private final String a(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(2) ? "bluetooth" : networkCapabilities.hasTransport(0) ? "cellular" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(8) ? "usb" : networkCapabilities.hasTransport(6) ? "lowpan" : networkCapabilities.hasTransport(9) ? "thread" : networkCapabilities.hasTransport(5) ? "wifi_aware" : "none";
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (!this.f34555c || (connectivityManager = (androidDataCollectorHelper = this.f34553a).getConnectivityManager()) == null || !androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_NETWORK_STATE") || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return;
        }
        this.f34554b.put("networkConnectionType", a(networkCapabilities));
        this.f34554b.put("networkIsConnectedToWifi", Boolean.valueOf(networkCapabilities.hasTransport(1)));
        this.f34554b.put("networkIsUsingVpn", Boolean.valueOf(networkCapabilities.hasTransport(4)));
        this.f34554b.put("networkIsUsingDataSaver", Boolean.valueOf(connectivityManager.getRestrictBackgroundStatus() == 3));
        String strA = a();
        if (strA != null) {
            this.f34554b.put("networkIpAddressLocal", strA);
        }
        ProxyInfo defaultProxy = connectivityManager.getDefaultProxy();
        if (defaultProxy != null) {
            this.f34554b.put("networkHttpProxyName", defaultProxy.getHost());
            this.f34554b.put("networkHttpProxyPort", Integer.valueOf(defaultProxy.getPort()));
        }
        this.f34554b.put("networkUplink", Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()));
        this.f34554b.put("networkDownlink", Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()));
    }

    private final String a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress()) {
                        inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }
}
