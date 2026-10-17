package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.Tools;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceInfos {
    public String A;
    public String B;
    public List C;
    public byte D;
    public int E;
    public String F;
    public String G;
    public boolean H;
    public byte[] I;
    public byte[] J;
    public String K;
    public byte[] L;
    public byte[] M;
    public byte[] N;
    public byte[] O;
    public byte[] P;
    public byte[] R;
    public byte[] S;
    public byte[] T;
    public byte[] U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f107612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f107613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f107614c;
    public String d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f107615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f107616h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f107617j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f107618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f107619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f107620n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DukptIksnInfos f107621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f107622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f107623r;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f107626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f107627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f107628y;
    public String z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107624s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107625t = -1;
    public int Q = -1;

    public DeviceInfos() {
    }

    public final void a(byte[] bArr) {
        Integer num;
        Integer num2;
        boolean z;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        Integer numValueOf = Integer.valueOf(Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
        Integer numValueOf2 = Integer.valueOf(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION);
        Integer numValueOf3 = Integer.valueOf(Constants.TAG_F3_BUILD_CONFIGURATION);
        Integer numValueOf4 = Integer.valueOf(Constants.TAG_FC_SPEED_MODE);
        Integer numValueOf5 = Integer.valueOf(Constants.TAG_FB_CHARGING_STATUS);
        Integer numValueOf6 = Integer.valueOf(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE);
        Integer numValueOf7 = Integer.valueOf(Constants.TAG_USB_CAPABILITY);
        Integer numValueOf8 = Integer.valueOf(Constants.TAG_POWER_OFF_TIMEOUT);
        Integer numValueOf9 = Integer.valueOf(Constants.TAG_BATTERY_STATE);
        Integer numValueOf10 = Integer.valueOf(Constants.TAG_MPOS_MODULE_STATE);
        Integer numValueOf11 = Integer.valueOf(Constants.TAG_KSN_FORMATS);
        Integer numValueOf12 = Integer.valueOf(Constants.TAG_FIRMWARE_VERSION);
        this.f107612a = bArr;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        Map<Integer, byte[]> ytBerMixedLen = TLV.parseYtBerMixedLen(bArr);
        this.f107613b = Tools.parseSerial(ytBerMixedLen.get(195));
        this.f107614c = Tools.parsePartNumber(ytBerMixedLen.get(194));
        this.d = Tools.parseVersion(ytBerMixedLen.get(numValueOf12));
        this.G = Tools.parseVersion(ytBerMixedLen.get(211));
        this.f107620n = Tools.bytesToHex(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_SVPP_CHECKSUM)));
        this.e = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EMV_L1_VERSION)));
        this.f = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EMV_L2_VERSION)));
        this.f107615g = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EMV_ICC_CONFIG_VERSION)));
        this.z = Tools.parseBleVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_BLE_FIRMWARE_VERSION)));
        this.A = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_RESOURCE_FILE_VERSION)));
        String strBytesToHex = Tools.bytesToHex(ytBerMixedLen.get(numValueOf11));
        this.o = strBytesToHex;
        if (!"".equals(strBytesToHex)) {
            this.f107621p = new DukptIksnInfos(ytBerMixedLen.get(numValueOf11), this.o);
        }
        if (ytBerMixedLen.containsKey(numValueOf10) && (bArr12 = ytBerMixedLen.get(numValueOf10)) != null && bArr12.length > 0) {
            byte b4 = bArr12[0];
            this.f107618l = b4;
            this.f107619m = b4 != 0;
        }
        Map<Integer, byte[]> ytBerMixedLen2 = TLV.parseYtBerMixedLen(ytBerMixedLen.get(232));
        if (ytBerMixedLen2 != null) {
            this.f107616h = Tools.parseVersion(ytBerMixedLen2.get(numValueOf12));
            byte[] bArr13 = ytBerMixedLen2.get(160);
            num = numValueOf5;
            if (bArr13 == null || bArr13.length <= 4) {
                num2 = numValueOf6;
            } else {
                byte[] bArr14 = new byte[4];
                num2 = numValueOf6;
                System.arraycopy(bArr13, 0, bArr14, 0, 4);
                this.i = Tools.parseVersion(bArr14);
            }
            this.f107617j = Tools.parseVersion(ytBerMixedLen2.get(162));
            this.k = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EMV_NFC_CONFIG_VERSION)));
            byte[] bArr15 = ytBerMixedLen2.get(196);
            if (bArr15 != null && bArr15.length == 4) {
                String strBytesToHex2 = Tools.bytesToHex(bArr15);
                strBytesToHex2.getClass();
                switch (strBytesToHex2) {
                    case "01":
                        this.f107627x = "Personalized";
                        break;
                    case "02":
                        this.f107627x = "Ready";
                        break;
                    case "03":
                        this.f107627x = "Secured";
                        break;
                    default:
                        this.f107627x = "Attacked";
                        break;
                }
            }
            this.f107628y = Tools.parseVersion(ytBerMixedLen2.get(160));
        } else {
            num = numValueOf5;
            num2 = numValueOf6;
        }
        this.f107622q = Tools.bytesToHex(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_TRANSACTION_DATA)));
        this.f107623r = Tools.bytesToHex(ytBerMixedLen.get(240));
        if (ytBerMixedLen.containsKey(numValueOf9) && (bArr11 = ytBerMixedLen.get(numValueOf9)) != null && bArr11.length > 0) {
            this.f107624s = bArr11[0];
        }
        if (ytBerMixedLen.containsKey(numValueOf8) && (bArr10 = ytBerMixedLen.get(numValueOf8)) != null && bArr10.length > 0) {
            this.f107625t = Integer.parseInt(Tools.bytesToHex(bArr10), 16);
        }
        if (ytBerMixedLen.containsKey(196) && (bArr9 = ytBerMixedLen.get(196)) != null && bArr9.length > 0) {
            byte b5 = bArr9[0];
            if (b5 == 1) {
                this.u = "Personalized";
            } else if (b5 == 2) {
                this.u = "Ready";
            } else if (b5 == 3) {
                this.u = "Secured";
            } else if (b5 != 4) {
                this.u = "unknown";
            } else {
                this.u = "Attacked";
            }
        }
        this.v = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_OS_VERSION)));
        if (!ytBerMixedLen.containsKey(numValueOf7) || (bArr8 = ytBerMixedLen.get(numValueOf7)) == null || bArr8.length <= 0) {
            z = true;
        } else {
            byte b7 = bArr8[0];
            if (b7 != 0) {
                z = true;
                if (b7 == 1) {
                    this.f107626w = true;
                }
            } else {
                z = true;
                this.f107626w = false;
            }
        }
        Integer num3 = num2;
        if (ytBerMixedLen.containsKey(num3) && (bArr7 = ytBerMixedLen.get(num3)) != null && bArr7.length > 0) {
            this.B = new String(bArr7, StandardCharsets.UTF_8);
        }
        this.C = Tools.parseAsciiLV(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST)));
        Integer num4 = num;
        if (ytBerMixedLen.containsKey(num4) && (bArr6 = ytBerMixedLen.get(num4)) != null && bArr6.length > 0) {
            this.D = bArr6[0];
        }
        if (ytBerMixedLen.containsKey(numValueOf4) && (bArr5 = ytBerMixedLen.get(numValueOf4)) != null && bArr5.length > 0) {
            this.E = bArr5[0];
        }
        if (ytBerMixedLen.containsKey(numValueOf3) && (bArr4 = ytBerMixedLen.get(numValueOf3)) != null && bArr4.length > 0) {
            this.F = new String(bArr4, StandardCharsets.UTF_8);
        }
        this.I = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_PCI_PED_CHECKSUM));
        this.J = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EMV_L1_CHECKSUM));
        this.L = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_BOOT_LOADER_CHECKSUM));
        this.U = ytBerMixedLen.get(254);
        if (ytBerMixedLen.containsKey(numValueOf2) && (bArr3 = ytBerMixedLen.get(numValueOf2)) != null && bArr3.length > 0) {
            this.H = bArr3[0] != 85 ? z : false;
        }
        this.K = Tools.parseVersion(ytBerMixedLen.get(Integer.valueOf(Constants.TAG_BOOT_LOADER_VERSION)));
        this.M = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION));
        this.N = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS));
        this.O = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_E4_CUSTOMER_DATA));
        this.P = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION));
        if (ytBerMixedLen.containsKey(numValueOf) && (bArr2 = ytBerMixedLen.get(numValueOf)) != null && bArr2.length > 0) {
            this.Q = bArr2[0];
        }
        this.R = ytBerMixedLen.get(232);
        this.S = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_EE_SUPPORTED_RPC_ID_LIST));
        this.T = ytBerMixedLen.get(Integer.valueOf(Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    public int getAutoPowerOffTimeout() {
        return this.f107625t;
    }

    public int getBatteryState() {
        return this.f107624s;
    }

    public String getBleFirmwareVersion() {
        return this.z;
    }

    public byte[] getBluetoothSpecificDatas() {
        return this.N;
    }

    public byte[] getBootloaderIntegrity() {
        return this.L;
    }

    public String getBootloaderVersion() {
        return this.K;
    }

    public String getBuildConfiguration() {
        return this.F;
    }

    public byte getChargingStatus() {
        return this.D;
    }

    public byte[] getConfigurationPaymentSchemeCustomization() {
        return this.M;
    }

    public byte[] getCustomerData() {
        return this.O;
    }

    public String getEmvL1ClessLibVersion() {
        return this.f107628y;
    }

    public byte[] getEmvL1Integrity() {
        return this.J;
    }

    public String getEmvL1Version() {
        return this.e;
    }

    public String getEmvL2Version() {
        return this.f;
    }

    public byte[] getFullSVPPIdentification() {
        return this.T;
    }

    public byte[] getFunctionLogConfiguration() {
        return this.P;
    }

    public String getIccEmvConfigVersion() {
        return this.f107615g;
    }

    public String getKsiData() {
        return this.f107621p.getKsi(1);
    }

    public String getKsiPin() {
        return this.f107621p.getKsi(0);
    }

    public String getKsnFormats() {
        return this.o;
    }

    public DukptIksnInfos getKsnInfos() {
        return this.f107621p;
    }

    public String getMerchantLocale() {
        return this.B;
    }

    public byte[] getNfcCapabilityE8() {
        return this.R;
    }

    public int getNfcCardDetectConfiguration() {
        return this.Q;
    }

    public String getNfcEmvConfigVersion() {
        return this.k;
    }

    public String getNfcEmvL1Version() {
        return this.i;
    }

    public String getNfcEmvL2Version() {
        return this.f107617j;
    }

    public String getNfcFirmware() {
        return this.f107616h;
    }

    public String getNfcFirmwareState() {
        return this.f107627x;
    }

    public byte getNfcModuleState() {
        return this.f107618l;
    }

    public byte[] getNonSecureFwIntegrity() {
        return this.U;
    }

    public String getOsVersion() {
        return this.v;
    }

    public String getPCISecuVersion() {
        return this.G;
    }

    public String getPartNumber() {
        return this.f107614c;
    }

    public byte[] getPciSecuFwIntegrity() {
        return this.I;
    }

    public String getPciSecuVersion() {
        return this.G;
    }

    public String getResourcesVersion() {
        return this.A;
    }

    public String getSerial() {
        return this.f107613b;
    }

    public int getSpeedMode() {
        return this.E;
    }

    public List<String> getSupportedLocaleList() {
        return this.C;
    }

    public byte[] getSupportedRPCIdList() {
        return this.S;
    }

    public String getSvppChecksum() {
        return this.f107620n;
    }

    public String getSvppFirmware() {
        return this.d;
    }

    public String getTerminalState() {
        return this.u;
    }

    public byte[] getTlv() {
        return this.f107612a;
    }

    public String getTransactionData() {
        return this.f107622q;
    }

    public String getTransactionDataConfig() {
        return this.f107623r;
    }

    public boolean isEnhancedSredOn() {
        return this.H;
    }

    public boolean isNfcCapability() {
        return this.f107619m;
    }

    public boolean isUsbCapability() {
        return this.f107626w;
    }

    public DeviceInfos(byte[] bArr) {
        try {
            a(bArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
