package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.sequences.Sequence;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFi1wSDK extends AFi1xSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1wSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "AFInAppEventParameterName", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function1<Network, NetworkInfo> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1wSDK.this.valueOf;
            Intrinsics.h(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1wSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean AFKeystoreWrapper(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean AFInAppEventParameterName() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.valueOf;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.valueOf;
                Intrinsics.h(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (AFKeystoreWrapper((NetworkCapabilities) it8.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    @NotNull
    public final String values() {
        Network[] allNetworks;
        Sequence sequenceE;
        Object next;
        ConnectivityManager connectivityManager = this.valueOf;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null || (sequenceE = kotlin.collections.d.E(allNetworks)) == null) {
            return "unknown";
        }
        nkm.g gVar = new nkm.g(y.z(sequenceE, new AnonymousClass5()));
        while (true) {
            if (!gVar.hasNext()) {
                next = null;
                break;
            }
            next = gVar.next();
            if (AFi1xSDK.valueOf((NetworkInfo) next)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) next;
        if (networkInfo == null) {
            return "unknown";
        }
        int type = networkInfo.getType();
        return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
    }
}
