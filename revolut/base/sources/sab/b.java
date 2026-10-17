package sab;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b NONE;
    public static final b RESET_CARD_SCA_COUNTER;
    public static final b SIGN_2FA;
    public static final b SIGN_CHANGED_PHONE_SHOW_CHAT;
    public static final b SIGN_CONFIRM_GOOGLE_PAY;
    public static final b SIGN_CONFIRM_GOOGLE_PAY_VISA;
    public static final b SIGN_LOGIN;
    public static final b SIGN_SHOW_ASSISTANT;
    public static final b SIGN_SHOW_CHAT;
    public static final b SIGN_SHOW_PIN;

    static {
        b bVar = new b("NONE", 0);
        NONE = bVar;
        b bVar2 = new b("SIGN_LOGIN", 1);
        SIGN_LOGIN = bVar2;
        b bVar3 = new b("SIGN_SHOW_PIN", 2);
        SIGN_SHOW_PIN = bVar3;
        b bVar4 = new b("SIGN_SHOW_CHAT", 3);
        SIGN_SHOW_CHAT = bVar4;
        b bVar5 = new b("SIGN_SHOW_ASSISTANT", 4);
        SIGN_SHOW_ASSISTANT = bVar5;
        b bVar6 = new b("SIGN_CHANGED_PHONE_SHOW_CHAT", 5);
        SIGN_CHANGED_PHONE_SHOW_CHAT = bVar6;
        b bVar7 = new b("SIGN_2FA", 6);
        SIGN_2FA = bVar7;
        b bVar8 = new b("SIGN_CONFIRM_GOOGLE_PAY", 7);
        SIGN_CONFIRM_GOOGLE_PAY = bVar8;
        b bVar9 = new b("SIGN_CONFIRM_GOOGLE_PAY_VISA", 8);
        SIGN_CONFIRM_GOOGLE_PAY_VISA = bVar9;
        b bVar10 = new b("RESET_CARD_SCA_COUNTER", 9);
        RESET_CARD_SCA_COUNTER = bVar10;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
