package com.fourthline.orca.internal;

import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u9 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f33978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33980c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u9(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f33978a = helper;
        this.f33979b = destination;
        this.f33980c = z;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        TelephonyManager telephonyManager;
        String str;
        if (!this.f33980c || (telephonyManager = (androidDataCollectorHelper = this.f33978a).getTelephonyManager()) == null) {
            return;
        }
        String str2 = null;
        if (androidDataCollectorHelper.isFeatureAvailable("android.hardware.telephony.subscription")) {
            switch (telephonyManager.getSimState()) {
                case 0:
                    str = "sim_state_unknown";
                    break;
                case 1:
                    str = "sim_state_absent";
                    break;
                case 2:
                    str = "sim_state_pin_required";
                    break;
                case 3:
                    str = "sim_state_puk_required";
                    break;
                case 4:
                    str = "sim_state_network_locked";
                    break;
                case 5:
                    str = "sim_state_ready";
                    break;
                case 6:
                    str = "sim_state_not_ready";
                    break;
                case 7:
                    str = "sim_state_perm_disabled";
                    break;
                case 8:
                    str = "sim_state_card_io_error";
                    break;
                case 9:
                    str = "sim_state_card_restricted";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                this.f33979b.put("cellularSimState", str);
            }
            CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
            if (simCarrierIdName != null) {
                this.f33979b.put("cellularCarrierName", simCarrierIdName);
            }
            this.f33979b.put("cellularCarrierId", telephonyManager.getSimOperator());
            this.f33979b.put("cellularCarrierCountry", telephonyManager.getSimCountryIso());
        }
        if (androidDataCollectorHelper.isFeatureAvailable("android.hardware.telephony.radio.access")) {
            this.f33979b.put("cellularIsRoaming", Boolean.valueOf(telephonyManager.isNetworkRoaming()));
            SignalStrength signalStrength = telephonyManager.getSignalStrength();
            if (signalStrength != null) {
                this.f33979b.put("cellularSignalStrength", signalStrength);
            }
        }
        if (androidDataCollectorHelper.isPermissionAvailable("android.permission.READ_PHONE_STATE")) {
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 20) {
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str2 = "2g";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str2 = "3g";
                        break;
                    case 13:
                        str2 = "4g";
                        break;
                }
            } else {
                str2 = "5g";
            }
            if (str2 != null) {
                this.f33979b.put("cellularTechnology", str2);
            }
        }
    }
}
