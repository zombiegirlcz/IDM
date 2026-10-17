package eo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BIOMETRIC_SIGNATURE;
    public static final c CIPHER_BIOMETRIC;
    public static final c CIPHER_CARDS;
    public static final c CIPHER_DEFAULT;
    public static final c CIPHER_SSO;
    public static final c NON_BIOMETRIC_SIGNATURE;

    @NotNull
    private final String value;

    static {
        c cVar = new c("BIOMETRIC_SIGNATURE", 0, "BIOMETRIC_SIGNATURE");
        BIOMETRIC_SIGNATURE = cVar;
        c cVar2 = new c("CIPHER_BIOMETRIC", 1, "CIPHER_BIOMETRIC");
        CIPHER_BIOMETRIC = cVar2;
        c cVar3 = new c("CIPHER_CARDS", 2, "CIPHER_CARDS");
        CIPHER_CARDS = cVar3;
        c cVar4 = new c("CIPHER_DEFAULT", 3, "CIPHER_DEFAULT");
        CIPHER_DEFAULT = cVar4;
        c cVar5 = new c("CIPHER_SSO", 4, "CIPHER_SSO");
        CIPHER_SSO = cVar5;
        c cVar6 = new c("NON_BIOMETRIC_SIGNATURE", 5, "NON_BIOMETRIC_SIGNATURE");
        NON_BIOMETRIC_SIGNATURE = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
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
