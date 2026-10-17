package sh4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AUTHENTICATION;
    public static final e CONNECTION;

    @NotNull
    public static final c Companion;
    public static final e ENCRYPTION;
    public static final e OTP;

    static {
        e eVar = new e("CONNECTION", 0);
        CONNECTION = eVar;
        e eVar2 = new e("ENCRYPTION", 1);
        ENCRYPTION = eVar2;
        e eVar3 = new e("AUTHENTICATION", 2);
        AUTHENTICATION = eVar3;
        e eVar4 = new e("OTP", 3);
        OTP = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new c();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
