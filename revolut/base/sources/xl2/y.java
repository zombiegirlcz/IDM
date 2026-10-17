package xl2;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y ACCESS_NETWORK_STATE;
    public static final y BLUETOOTH;
    public static final y CAMERA;
    public static final y CONTACTS;
    public static final y LOCATION;
    public static final y MANAGE_ACCOUNTS;
    public static final y META_SSO;
    public static final y MICROPHONE;
    public static final y POST_NOTIFICATIONS;
    public static final y STORAGE;

    static {
        y yVar = new y("LOCATION", 0);
        LOCATION = yVar;
        y yVar2 = new y("STORAGE", 1);
        STORAGE = yVar2;
        y yVar3 = new y("CONTACTS", 2);
        CONTACTS = yVar3;
        y yVar4 = new y("CAMERA", 3);
        CAMERA = yVar4;
        y yVar5 = new y("ACCESS_NETWORK_STATE", 4);
        ACCESS_NETWORK_STATE = yVar5;
        y yVar6 = new y("MANAGE_ACCOUNTS", 5);
        MANAGE_ACCOUNTS = yVar6;
        y yVar7 = new y("MICROPHONE", 6);
        MICROPHONE = yVar7;
        y yVar8 = new y("BLUETOOTH", 7);
        BLUETOOTH = yVar8;
        y yVar9 = new y("POST_NOTIFICATIONS", 8);
        POST_NOTIFICATIONS = yVar9;
        y yVar10 = new y("META_SSO", 9);
        META_SSO = yVar10;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
