package fa1;

import androidx.room.RoomDatabase;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ERROR;
    public static final k INFO;
    public static final k OFF;
    public static final k WARNING;
    private final int value;

    static {
        k kVar = new k("INFO", 0, 1);
        INFO = kVar;
        k kVar2 = new k("WARNING", 1, 2);
        WARNING = kVar2;
        k kVar3 = new k("ERROR", 2, 3);
        ERROR = kVar3;
        k kVar4 = new k("OFF", 3, RoomDatabase.MAX_BIND_PARAMETER_CNT);
        OFF = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public k(String str, int i, int i2) {
        this.value = i2;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
