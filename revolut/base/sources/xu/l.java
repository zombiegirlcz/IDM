package xu;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CLOSE_DEVICE;
    public static final l CLOSE_DEVICE_AND_DISABLE_ABORT;

    @NotNull
    public static final k Companion;
    public static final l DISABLE_ABORT;
    public static final l OFF;

    @NotNull
    private final String value;

    static {
        l lVar = new l("OFF", 0, "off");
        OFF = lVar;
        l lVar2 = new l("CLOSE_DEVICE", 1, "close_device");
        CLOSE_DEVICE = lVar2;
        l lVar3 = new l("DISABLE_ABORT", 2, "disable_abort");
        DISABLE_ABORT = lVar3;
        l lVar4 = new l("CLOSE_DEVICE_AND_DISABLE_ABORT", 3, "close_device_and_disable_abort");
        CLOSE_DEVICE_AND_DISABLE_ABORT = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, String str2) {
        this.value = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
