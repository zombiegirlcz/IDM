package jh0;

import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b API_NOT_AVAILABLE;
    public static final b API_NOT_CONNECTED;
    public static final b APP_NOT_INSTALLED;
    public static final b APP_NOT_OPTED_IN;
    public static final b APP_QUOTA_LIMIT_REACHED;
    public static final b APP_UID_MISMATCH;
    public static final b BLE_ADVERTISING_UNSUPPORTED;
    public static final b BLE_SCANNING_UNSUPPORTED;
    public static final b BLUETOOTH_OFF;
    public static final b CANCELED;
    public static final b CANNOT_BIND_TO_SERVICE;
    public static final b CONNECTION_SUSPENDED_DURING_CALL;

    @NotNull
    public static final a Companion;
    public static final b DEVELOPER_ERROR;
    public static final b DISALLOWED_CALLING_CONTEXT;
    public static final b ERROR;
    public static final b FORBIDDEN;
    public static final b GOOGLE_SERVER_UNAVAILABLE;
    public static final b INTEGRITY_CHECK_INTERNAL_ERROR;
    public static final b INTEGRITY_CHECK_NETWORK_ERROR;
    public static final b INTEGRITY_CHECK_NONCE_TOO_LONG;
    public static final b INTEGRITY_CHECK_NONCE_TOO_SHORT;
    public static final b INTEGRITY_CHECK_TOO_MANY_REQUESTS;
    public static final b INTERNAL_ERROR;
    public static final b INTERRUPTED;
    public static final b INVALID_ACCOUNT;
    public static final b LOCATION_SETTINGS_CHANGE_UNAVAILABLE;
    public static final b MISSING_PERMISSIONS;
    public static final b NETWORK_ERROR;
    public static final b NONCE_IS_NOT_BASE64;
    public static final b NOT_AUTHORIZED;
    public static final b PLAY_SERVICES_NOT_FOUND;
    public static final b PLAY_STORE_ACCOUNT_NOT_FOUND;
    public static final b PLAY_STORE_NOT_FOUND;
    public static final b RECONNECTION_TIMED_OUT_DURING_UPDATE;
    public static final b REMOTE_EXCEPTION;
    public static final b RESOLUTION_REQUIRED;
    public static final b SIGN_IN_REQUIRED;
    public static final b SUCCESS;
    public static final b TAP_AND_PAY_ATTESTATION_ERROR;
    public static final b TAP_AND_PAY_INVALID_TOKEN_STATE;
    public static final b TAP_AND_PAY_NO_ACTIVE_WALLET;
    public static final b TAP_AND_PAY_TOKEN_NOT_FOUND;
    public static final b TAP_AND_PAY_UNAVAILABLE;
    public static final b TIMEOUT;
    public static final b TOO_MANY_PENDING_INTENTS;
    public static final b UNKNOWN;
    private final int code;

    static {
        b bVar = new b("UNKNOWN", 0, Integer.MIN_VALUE);
        UNKNOWN = bVar;
        b bVar2 = new b("SUCCESS", 1, 0);
        SUCCESS = bVar2;
        b bVar3 = new b("SIGN_IN_REQUIRED", 2, 4);
        SIGN_IN_REQUIRED = bVar3;
        b bVar4 = new b("INVALID_ACCOUNT", 3, 5);
        INVALID_ACCOUNT = bVar4;
        b bVar5 = new b("RESOLUTION_REQUIRED", 4, 6);
        RESOLUTION_REQUIRED = bVar5;
        b bVar6 = new b("NETWORK_ERROR", 5, 7);
        NETWORK_ERROR = bVar6;
        b bVar7 = new b("INTERNAL_ERROR", 6, 8);
        INTERNAL_ERROR = bVar7;
        b bVar8 = new b("DEVELOPER_ERROR", 7, 10);
        DEVELOPER_ERROR = bVar8;
        b bVar9 = new b("ERROR", 8, 13);
        ERROR = bVar9;
        b bVar10 = new b("INTERRUPTED", 9, 14);
        INTERRUPTED = bVar10;
        b bVar11 = new b("TIMEOUT", 10, 15);
        TIMEOUT = bVar11;
        b bVar12 = new b("CANCELED", 11, 16);
        CANCELED = bVar12;
        b bVar13 = new b("API_NOT_CONNECTED", 12, 17);
        API_NOT_CONNECTED = bVar13;
        b bVar14 = new b("REMOTE_EXCEPTION", 13, 19);
        REMOTE_EXCEPTION = bVar14;
        b bVar15 = new b("CONNECTION_SUSPENDED_DURING_CALL", 14, 20);
        CONNECTION_SUSPENDED_DURING_CALL = bVar15;
        b bVar16 = new b("RECONNECTION_TIMED_OUT_DURING_UPDATE", 15, 21);
        RECONNECTION_TIMED_OUT_DURING_UPDATE = bVar16;
        b bVar17 = new b("LOCATION_SETTINGS_CHANGE_UNAVAILABLE", 16, LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE);
        LOCATION_SETTINGS_CHANGE_UNAVAILABLE = bVar17;
        b bVar18 = new b("TOO_MANY_PENDING_INTENTS", 17, NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS);
        TOO_MANY_PENDING_INTENTS = bVar18;
        b bVar19 = new b("APP_NOT_OPTED_IN", 18, NearbyMessagesStatusCodes.APP_NOT_OPTED_IN);
        APP_NOT_OPTED_IN = bVar19;
        b bVar20 = new b("DISALLOWED_CALLING_CONTEXT", 19, NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT);
        DISALLOWED_CALLING_CONTEXT = bVar20;
        b bVar21 = new b("APP_QUOTA_LIMIT_REACHED", 20, NearbyMessagesStatusCodes.APP_QUOTA_LIMIT_REACHED);
        APP_QUOTA_LIMIT_REACHED = bVar21;
        b bVar22 = new b("NOT_AUTHORIZED", 21, NearbyMessagesStatusCodes.NOT_AUTHORIZED);
        NOT_AUTHORIZED = bVar22;
        b bVar23 = new b("FORBIDDEN", 22, NearbyMessagesStatusCodes.FORBIDDEN);
        FORBIDDEN = bVar23;
        b bVar24 = new b("MISSING_PERMISSIONS", 23, NearbyMessagesStatusCodes.MISSING_PERMISSIONS);
        MISSING_PERMISSIONS = bVar24;
        b bVar25 = new b("BLUETOOTH_OFF", 24, NearbyMessagesStatusCodes.BLUETOOTH_OFF);
        BLUETOOTH_OFF = bVar25;
        b bVar26 = new b("BLE_ADVERTISING_UNSUPPORTED", 25, NearbyMessagesStatusCodes.BLE_ADVERTISING_UNSUPPORTED);
        BLE_ADVERTISING_UNSUPPORTED = bVar26;
        b bVar27 = new b("BLE_SCANNING_UNSUPPORTED", 26, NearbyMessagesStatusCodes.BLE_SCANNING_UNSUPPORTED);
        BLE_SCANNING_UNSUPPORTED = bVar27;
        b bVar28 = new b("TAP_AND_PAY_NO_ACTIVE_WALLET", 27, TapAndPayStatusCodes.TAP_AND_PAY_NO_ACTIVE_WALLET);
        TAP_AND_PAY_NO_ACTIVE_WALLET = bVar28;
        b bVar29 = new b("TAP_AND_PAY_TOKEN_NOT_FOUND", 28, TapAndPayStatusCodes.TAP_AND_PAY_TOKEN_NOT_FOUND);
        TAP_AND_PAY_TOKEN_NOT_FOUND = bVar29;
        b bVar30 = new b("TAP_AND_PAY_INVALID_TOKEN_STATE", 29, TapAndPayStatusCodes.TAP_AND_PAY_INVALID_TOKEN_STATE);
        TAP_AND_PAY_INVALID_TOKEN_STATE = bVar30;
        b bVar31 = new b("TAP_AND_PAY_ATTESTATION_ERROR", 30, TapAndPayStatusCodes.TAP_AND_PAY_ATTESTATION_ERROR);
        TAP_AND_PAY_ATTESTATION_ERROR = bVar31;
        b bVar32 = new b("TAP_AND_PAY_UNAVAILABLE", 31, TapAndPayStatusCodes.TAP_AND_PAY_UNAVAILABLE);
        TAP_AND_PAY_UNAVAILABLE = bVar32;
        b bVar33 = new b("API_NOT_AVAILABLE", 32, -1);
        API_NOT_AVAILABLE = bVar33;
        b bVar34 = new b("PLAY_STORE_NOT_FOUND", 33, -2);
        PLAY_STORE_NOT_FOUND = bVar34;
        b bVar35 = new b("INTEGRITY_CHECK_NETWORK_ERROR", 34, -3);
        INTEGRITY_CHECK_NETWORK_ERROR = bVar35;
        b bVar36 = new b("PLAY_STORE_ACCOUNT_NOT_FOUND", 35, -4);
        PLAY_STORE_ACCOUNT_NOT_FOUND = bVar36;
        b bVar37 = new b("APP_NOT_INSTALLED", 36, -5);
        APP_NOT_INSTALLED = bVar37;
        b bVar38 = new b("PLAY_SERVICES_NOT_FOUND", 37, -6);
        PLAY_SERVICES_NOT_FOUND = bVar38;
        b bVar39 = new b("APP_UID_MISMATCH", 38, -7);
        APP_UID_MISMATCH = bVar39;
        b bVar40 = new b("INTEGRITY_CHECK_TOO_MANY_REQUESTS", 39, -8);
        INTEGRITY_CHECK_TOO_MANY_REQUESTS = bVar40;
        b bVar41 = new b("CANNOT_BIND_TO_SERVICE", 40, -9);
        CANNOT_BIND_TO_SERVICE = bVar41;
        b bVar42 = new b("INTEGRITY_CHECK_NONCE_TOO_SHORT", 41, -10);
        INTEGRITY_CHECK_NONCE_TOO_SHORT = bVar42;
        b bVar43 = new b("INTEGRITY_CHECK_NONCE_TOO_LONG", 42, -11);
        INTEGRITY_CHECK_NONCE_TOO_LONG = bVar43;
        b bVar44 = new b("GOOGLE_SERVER_UNAVAILABLE", 43, -12);
        GOOGLE_SERVER_UNAVAILABLE = bVar44;
        b bVar45 = new b("NONCE_IS_NOT_BASE64", 44, -13);
        NONCE_IS_NOT_BASE64 = bVar45;
        b bVar46 = new b("INTEGRITY_CHECK_INTERNAL_ERROR", 45, -100);
        INTEGRITY_CHECK_INTERNAL_ERROR = bVar46;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, int i2) {
        this.code = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
