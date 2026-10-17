package fa1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n AUTHORIZATION;
    public static final n CANCELLING;
    public static final n CARD_READ_END;
    public static final n COMPLETED;
    public static final n DISPLAY_START_WAIT_CARD;
    public static final n END_EXIT_SECURE_SESSION;
    public static final n ENTER_SECURE_SESSION;
    public static final n GET_CC_L2_LOG;
    public static final n GET_F4_L2_LOG;
    public static final n GET_F5_L2_LOG;
    public static final n GET_FINALIZATION_PLAIN_TAGS;
    public static final n GET_FINALIZATION_SECURED_TAGS;
    public static final n GET_INFO;
    public static final n INITIALIZING;
    public static final n KSN_AVAILABLE;
    public static final n NFC_COMPLETE_TRANSACTION;
    public static final n NFC_GET_AUTHORIZATION_SECURED_TAGS;
    public static final n NFC_SIMPLIFIED_ONLINE_PIN;
    public static final n NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY;
    public static final n OFFLINE_PIN;
    public static final n ONLINE_PIN;
    public static final n SMC_BUILD_CANDIDATE_LIST;
    public static final n SMC_FINALIZE_TRANSACTION;
    public static final n SMC_GET_AUTHORIZATION_SECURED_TAGS;
    public static final n SMC_INIT_TRANSACTION;
    public static final n SMC_PROCESS_TRANSACTION;
    public static final n SMC_REMOVE_CARD;
    public static final n SMC_RISK_MANAGEMENT;
    public static final n SMC_SELECT_APPLICATION;
    public static final n SMC_USER_SELECT_APPLICATION;
    public static final n START_CANCEL_ALL;
    public static final n START_EXIT_SECURE_SESSION;
    public static final n START_ICC;
    public static final n START_NFC;
    public static final n START_TRANSACTION;
    public static final n WAITING_CARD;

    static {
        n nVar = new n("INITIALIZING", 0);
        INITIALIZING = nVar;
        n nVar2 = new n("CANCELLING", 1);
        CANCELLING = nVar2;
        n nVar3 = new n("COMPLETED", 2);
        COMPLETED = nVar3;
        n nVar4 = new n("START_CANCEL_ALL", 3);
        START_CANCEL_ALL = nVar4;
        n nVar5 = new n("START_EXIT_SECURE_SESSION", 4);
        START_EXIT_SECURE_SESSION = nVar5;
        n nVar6 = new n("GET_INFO", 5);
        GET_INFO = nVar6;
        n nVar7 = new n("ENTER_SECURE_SESSION", 6);
        ENTER_SECURE_SESSION = nVar7;
        n nVar8 = new n("KSN_AVAILABLE", 7);
        KSN_AVAILABLE = nVar8;
        n nVar9 = new n("DISPLAY_START_WAIT_CARD", 8);
        DISPLAY_START_WAIT_CARD = nVar9;
        n nVar10 = new n("START_TRANSACTION", 9);
        START_TRANSACTION = nVar10;
        n nVar11 = new n("WAITING_CARD", 10);
        WAITING_CARD = nVar11;
        n nVar12 = new n("CARD_READ_END", 11);
        CARD_READ_END = nVar12;
        n nVar13 = new n("AUTHORIZATION", 12);
        AUTHORIZATION = nVar13;
        n nVar14 = new n("ONLINE_PIN", 13);
        ONLINE_PIN = nVar14;
        n nVar15 = new n("OFFLINE_PIN", 14);
        OFFLINE_PIN = nVar15;
        n nVar16 = new n("GET_FINALIZATION_SECURED_TAGS", 15);
        GET_FINALIZATION_SECURED_TAGS = nVar16;
        n nVar17 = new n("GET_FINALIZATION_PLAIN_TAGS", 16);
        GET_FINALIZATION_PLAIN_TAGS = nVar17;
        n nVar18 = new n("GET_CC_L2_LOG", 17);
        GET_CC_L2_LOG = nVar18;
        n nVar19 = new n("GET_F4_L2_LOG", 18);
        GET_F4_L2_LOG = nVar19;
        n nVar20 = new n("GET_F5_L2_LOG", 19);
        GET_F5_L2_LOG = nVar20;
        n nVar21 = new n("END_EXIT_SECURE_SESSION", 20);
        END_EXIT_SECURE_SESSION = nVar21;
        n nVar22 = new n("START_ICC", 21);
        START_ICC = nVar22;
        n nVar23 = new n("SMC_BUILD_CANDIDATE_LIST", 22);
        SMC_BUILD_CANDIDATE_LIST = nVar23;
        n nVar24 = new n("SMC_SELECT_APPLICATION", 23);
        SMC_SELECT_APPLICATION = nVar24;
        n nVar25 = new n("SMC_USER_SELECT_APPLICATION", 24);
        SMC_USER_SELECT_APPLICATION = nVar25;
        n nVar26 = new n("SMC_INIT_TRANSACTION", 25);
        SMC_INIT_TRANSACTION = nVar26;
        n nVar27 = new n("SMC_RISK_MANAGEMENT", 26);
        SMC_RISK_MANAGEMENT = nVar27;
        n nVar28 = new n("SMC_PROCESS_TRANSACTION", 27);
        SMC_PROCESS_TRANSACTION = nVar28;
        n nVar29 = new n("SMC_GET_AUTHORIZATION_SECURED_TAGS", 28);
        SMC_GET_AUTHORIZATION_SECURED_TAGS = nVar29;
        n nVar30 = new n("SMC_FINALIZE_TRANSACTION", 29);
        SMC_FINALIZE_TRANSACTION = nVar30;
        n nVar31 = new n("SMC_REMOVE_CARD", 30);
        SMC_REMOVE_CARD = nVar31;
        n nVar32 = new n("START_NFC", 31);
        START_NFC = nVar32;
        n nVar33 = new n("NFC_GET_AUTHORIZATION_SECURED_TAGS", 32);
        NFC_GET_AUTHORIZATION_SECURED_TAGS = nVar33;
        n nVar34 = new n("NFC_SIMPLIFIED_ONLINE_PIN", 33);
        NFC_SIMPLIFIED_ONLINE_PIN = nVar34;
        n nVar35 = new n("NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY", 34);
        NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY = nVar35;
        n nVar36 = new n("NFC_COMPLETE_TRANSACTION", 35);
        NFC_COMPLETE_TRANSACTION = nVar36;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14, nVar15, nVar16, nVar17, nVar18, nVar19, nVar20, nVar21, nVar22, nVar23, nVar24, nVar25, nVar26, nVar27, nVar28, nVar29, nVar30, nVar31, nVar32, nVar33, nVar34, nVar35, nVar36};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
