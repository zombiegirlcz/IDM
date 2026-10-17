package qa1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k NO_ACTIVE_PAYMENT_PROVIDER;
    public static final k TERMINAL_NEEDS_UPDATE;

    @NotNull
    private final String key;

    static {
        k kVar = new k("NO_ACTIVE_PAYMENT_PROVIDER", 0, "no_active_payment_provider");
        NO_ACTIVE_PAYMENT_PROVIDER = kVar;
        k kVar2 = new k("TERMINAL_NEEDS_UPDATE", 1, "terminal_needs_update");
        TERMINAL_NEEDS_UPDATE = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public k(String str, int i, String str2) {
        this.key = str2;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
