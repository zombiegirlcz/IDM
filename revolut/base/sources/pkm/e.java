package pkm;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DAYS;
    public static final e HOURS;
    public static final e MICROSECONDS;
    public static final e MILLISECONDS;
    public static final e MINUTES;
    public static final e NANOSECONDS;
    public static final e SECONDS;

    @NotNull
    private final TimeUnit timeUnit;

    static {
        e eVar = new e("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        NANOSECONDS = eVar;
        e eVar2 = new e("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MICROSECONDS = eVar2;
        e eVar3 = new e("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        MILLISECONDS = eVar3;
        e eVar4 = new e("SECONDS", 3, TimeUnit.SECONDS);
        SECONDS = eVar4;
        e eVar5 = new e("MINUTES", 4, TimeUnit.MINUTES);
        MINUTES = eVar5;
        e eVar6 = new e("HOURS", 5, TimeUnit.HOURS);
        HOURS = eVar6;
        e eVar7 = new e("DAYS", 6, TimeUnit.DAYS);
        DAYS = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final TimeUnit a() {
        return this.timeUnit;
    }
}
