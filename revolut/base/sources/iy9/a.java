package iy9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLOCK_USER;
    public static final a HIDE_P2P_CHAT_HISTORY;
    public static final a NOTIFICATIONS;
    public static final a PEER_TO_PEER_CHAT_MESSAGING;
    public static final a TWO_FA_REQUIRED;

    @NotNull
    private final String value;

    static {
        a aVar = new a("TWO_FA_REQUIRED", 0, "TWO_FA_REQUIRED");
        TWO_FA_REQUIRED = aVar;
        a aVar2 = new a("PEER_TO_PEER_CHAT_MESSAGING", 1, "PEER_TO_PEER_CHAT_MESSAGING");
        PEER_TO_PEER_CHAT_MESSAGING = aVar2;
        a aVar3 = new a("BLOCK_USER", 2, "BLOCK_USER");
        BLOCK_USER = aVar3;
        a aVar4 = new a("NOTIFICATIONS", 3, "NOTIFICATIONS");
        NOTIFICATIONS = aVar4;
        a aVar5 = new a("HIDE_P2P_CHAT_HISTORY", 4, "HIDE_P2P_CHAT_HISTORY_BEFORE");
        HIDE_P2P_CHAT_HISTORY = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
