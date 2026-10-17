package v30;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t DEEPLINK;
    public static final t DEFAULT;
    public static final t HELP_SCREEN;
    public static final t INBOX;
    public static final t NEW_MESSAGE_DEEPLINK;
    private final String serverKey;

    static {
        t tVar = new t("HELP_SCREEN", 0, "ClientApp:HelpMainScreen");
        HELP_SCREEN = tVar;
        t tVar2 = new t("DEFAULT", 1, null);
        DEFAULT = tVar2;
        t tVar3 = new t("DEEPLINK", 2, null);
        DEEPLINK = tVar3;
        t tVar4 = new t("NEW_MESSAGE_DEEPLINK", 3, null);
        NEW_MESSAGE_DEEPLINK = tVar4;
        t tVar5 = new t("INBOX", 4, null);
        INBOX = tVar5;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public t(String str, int i, String str2) {
        this.serverKey = str2;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public final String a() {
        return this.serverKey;
    }
}
