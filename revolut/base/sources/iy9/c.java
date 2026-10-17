package iy9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BLOCK_USER;
    public static final c HIDE_P2P_CHAT_HISTORY;
    public static final c NOTIFICATIONS;
    public static final c PEER_TO_PEER_CHAT_MESSAGING;
    public static final c TWO_FA_REQUIRED;

    @NotNull
    private final String value;

    static {
        c cVar = new c("PEER_TO_PEER_CHAT_MESSAGING", 0, "messaging");
        PEER_TO_PEER_CHAT_MESSAGING = cVar;
        c cVar2 = new c("BLOCK_USER", 1, "completeBlock");
        BLOCK_USER = cVar2;
        c cVar3 = new c("TWO_FA_REQUIRED", 2, "alwaysRequire2FA");
        TWO_FA_REQUIRED = cVar3;
        c cVar4 = new c("NOTIFICATIONS", 3, "notifications");
        NOTIFICATIONS = cVar4;
        c cVar5 = new c("HIDE_P2P_CHAT_HISTORY", 4, "hideP2PChatHistoryBefore");
        HIDE_P2P_CHAT_HISTORY = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
